import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ededin üstünü tapan bir  "power" metodu yazın,
        //metod number ve power parametrleri alib ona uygun ededin ustunu geri qaytarmalidir.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter the power: ");
        int power = scanner.nextInt();

        Powerseries(number,power);
    }

    public static void Powerseries (int number, int power) {
        int Powerseries=0;
        for (int i=0; i<power; i++ ){
        Powerseries = number*power;
    }
        System.out.println(Powerseries);

    }}























































































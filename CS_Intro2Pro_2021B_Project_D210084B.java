/**
Student ID: D210084B
Name: Cho Yuan Sen
Batch Number: CS21-B
Submission Date: 30 August 2021
Title: Airline Reservation System
 */

import java.util.Scanner;
public class CS_Intro2Pro_2021B_Project_D210084B {
	
	public static String A[] = new String[12];
	public static String B[] = new String[12];
	public static String C[] = new String[12];
	public static String D[] = new String[12];
	public static String E[] = new String[12];
	public static String F[] = new String[12];
	public static String G[] = new String[12];
	public static String H[] = new String[12];
	public static Scanner input = new Scanner(System.in);

    public  static void main(String[] args){
    	
    	int choice;
    	int quit = 0;
    	
    	for (int a = 1; a <= 11; a++) {
            A[a] = "A";
        }
        for (int a = 1; a <= 11; a++) {
            B[a] = "B";
        }
        for (int a = 1; a <= 11; a++) {
            C[a] = "C";
        }
        for (int a = 1; a <= 11; a++) {
            D[a] = "D";
        }
        for (int a = 1; a <= 11; a++) {
            E[a] = "E";
        }
        for (int a = 1; a <= 11; a++) {
            F[a] = "F";
        }
        for (int a = 1; a <= 11; a++) {
            G[a] = "G";	
        }
        for (int a = 1; a <= 11; a++) {
            H[a] = "H";
        }
        
        System.out.println("Welcome To HML Airline");
            System.out.println("We will provide best travel experience to you");
            System.out.print("Please enter your name: ");
            String name = input.nextLine();
            System.out.println("Welcome To HML Airline," + name);
        do {
            
            System.out.println("");
            System.out.println("*****    MAIN MENU    *****");

            System.out.println("[1] Choose Destination");
            System.out.println("[2] Display Seat");
            System.out.println("[3] Buy Ticket");
            System.out.println("[4] Cancel Ticket");
            System.out.println("[5] Exit");
            
            System.out.print("Please enter your selection: ");
            choice = input.nextInt();
            System.out.println(" ");
            switch (choice) {
            	case 1:
            		CHOOSE();
            		break;
            	case 2:
            		DISPLAY();
            		break;
            	case 3:
            		BUY();
            		break;
            	case 4:
            		CANCEL();
            		break;
                case 5:
                    QUIT();
                    quit++;
                    break;
                default: 
                    System.out.println("Something went wrong.Try again please");
                
            }
        } while(quit != 1);       
    }
     public static void CHOOSE() {
     	
     	System.out.println("Please Choose Your Destination");
        System.out.println("number      destination");
        System.out.println("  1  :      Beijing");
        System.out.println("  2  :      New Heldi");
        System.out.println("  3  :      Paris");
        System.out.println("  4  :      Tokyo");
        System.out.println("  5  :      Seoul");
        System.out.println("  6  :      Los Angeles");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of destination.");
        int numberdestination = input.nextInt();	
        
        if (numberdestination == 1){
        	System.out.println("Your flight is to Beijing");
        }
        else if (numberdestination == 2){
        	System.out.println("Your flight is to New Heldi");
        }
        else if (numberdestination == 3){
        	System.out.println("Your flight is to Paris");
        }
        else if (numberdestination == 4){
        	System.out.println("Your flight is to Tokyo");
        }
        else if (numberdestination == 5){
        	System.out.println("Your flight is to Seoul");
        }
        else if (numberdestination == 6){
        	System.out.println("Your flight is to Los Angeles");
        }
        else {
        	System.out.println("Something Wrong!!! Please Try Again.");
        }
     }
     
    public static void DISPLAY() {

        System.out.println("Display Seats:");
        System.out.println(" ROW    			SEAT     ");
        System.out.println("  1     |" + A[ 1] + "|" + B[ 1] + "|   |" + C[ 1] + "|" + D[ 1] + "|" + E[ 1] + "|" + F[ 1] + "|   |" + G[ 1] + "|" + H[ 1] + "|");
        System.out.println("  2     |" + A[ 2] + "|" + B[ 2] + "|   |" + C[ 2] + "|" + D[ 2] + "|" + E[ 2] + "|" + F[ 2] + "|   |" + G[ 2] + "|" + H[ 2] + "|");
        System.out.println("  3     |" + A[ 3] + "|" + B[ 3] + "|   |" + C[ 3] + "|" + D[ 3] + "|" + E[ 3] + "|" + F[ 3] + "|   |" + G[ 3] + "|" + H[ 3] + "|");
        System.out.println("  4     |" + A[ 4] + "|" + B[ 4] + "|   |" + C[ 4] + "|" + D[ 4] + "|" + E[ 4] + "|" + F[ 4] + "|   |" + G[ 4] + "|" + H[ 4] + "|");
        System.out.println("  5     |" + A[ 5] + "|" + B[ 5] + "|   |" + C[ 5] + "|" + D[ 5] + "|" + E[ 5] + "|" + F[ 5] + "|   |" + G[ 5] + "|" + H[ 5] + "|");
        System.out.println("  6     |" + A[ 6] + "|" + B[ 6] + "|   |" + C[ 6] + "|" + D[ 6] + "|" + E[ 6] + "|" + F[ 6] + "|   |" + G[ 6] + "|" + H[ 6] + "|");
        System.out.println("  7     |" + A[ 7] + "|" + B[ 7] + "|   |" + C[ 7] + "|" + D[ 7] + "|" + E[ 7] + "|" + F[ 7] + "|   |" + G[ 7] + "|" + H[ 7] + "|");
        System.out.println("  8     |" + A[ 8] + "|" + B[ 8] + "|   |" + C[ 8] + "|" + D[ 8] + "|" + E[ 8] + "|" + F[ 8] + "|   |" + G[ 8] + "|" + H[ 8] + "|");
        System.out.println("  9     |" + A[ 9] + "|" + B[ 9] + "|   |" + C[ 9] + "|" + D[ 9] + "|" + E[ 9] + "|" + F[ 9] + "|   |" + G[ 9] + "|" + H[ 9] + "|");
        System.out.println("  10    |" + A[10] + "|" + B[10] + "|   |" + C[10] + "|" + D[10] + "|" + E[10] + "|" + F[10] + "|   |" + G[10] + "|" + H[10] + "|");
        System.out.println("  11    |" + A[11] + "|" + B[11] + "|   |" + C[11] + "|" + D[11] + "|" + E[11] + "|" + F[11] + "|   |" + G[11] + "|" + H[11] + "|");
    }
    public static void BUY() {
        int i = 1;

        System.out.print("Please Enter The Number of Ticket: ");
        int numseat = input.nextInt();

        System.out.println("You may now choose a seat");
        System.out.println(" ROW       			SEAT      ");
        System.out.println("  1  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  2  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  3  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  4  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  5  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  6  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  7  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  8  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  9  :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  10 :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("  11 :   |A|B| |C|D|E|F| |G|H|");
        System.out.println("");

        do {
            System.out.print("Please Enter Your Seat Row (1-11): ");
            int seatrow = input.nextInt();
            System.out.print("Please Enter Your Seat (A-H): ");
            String seat = input.next();

            i++;

            if (seatrow <= 11 && seatrow > 0 && "A".equals(seat) || "a".equals(seat)) {
                if (!"A".equals(A[seatrow])) {
                    System.out.println("The seat has been taken");
                } else {
                    A[seatrow] = "X";
                }
            } else if (seatrow <= 11 && seatrow > 0 && "B".equals(seat) || "b".equals(seat)) {
                if (!"B".equals(B[seatrow])) {
                    System.out.print("The seat has been taken");
                } else {
                    B[seatrow] = "X";
                }
            } else if (seatrow <= 11 && seatrow > 0 && "C".equals(seat) || "c".equals(seat)) {
                if (!"C".equals(C[seatrow])) {
                    System.out.print("The seat has been taken");
                } else {
                    C[seatrow] = "X";
                }
            } else if (seatrow <= 11 && seatrow > 0 && "D".equals(seat) || "d".equals(seat)) {
                if (!"D".equals(D[seatrow])) {
                    System.out.print("The seat has been taken");
                } else {
                    D[seatrow] = "X";
                }
            } else if (seatrow <= 9 && seatrow > 0 && "E".equals(seat) || "e".equals(seat)) {
                if (!"E".equals(E[seatrow])) {
                    System.out.print("The seat has been taken");
                } else {
                    E[seatrow] = "X";
                }
            } else if (seatrow <= 11 && seatrow > 0 && "F".equals(seat) || "f".equals(seat)) {
                if (!"F".equals(F[seatrow])) {
                    System.out.print("The seat has been taken");
                } else {
                    F[seatrow] = "X";
                }
            } else if (seatrow <= 9 && seatrow > 0 && "G".equals(seat) || "g".equals(seat)) {
                if (!"G".equals(G[seatrow])) {
                    System.out.print("The seat has been taken");
                } else {
                    G[seatrow] = "X";
                }
            } else if (seatrow <= 11 && seatrow > 0 && "H".equals(seat) || "h".equals(seat)) {
                if (!"H".equals(H[seatrow])) {
                    System.out.print("The seat has been taken");
                } else {
                    H[seatrow] = "X";
                }
            } else {
                System.out.println("Something went wrong!!! Please Try Again.");
            }

        } while (i <= numseat);
        int totalseat = 0;
        totalseat = totalseat + numseat;
        System.out.println("Booking completed,Thanks for choosing HML Airline!");
        System.out.println("You have booked " + totalseat + " seat.");
        System.out.println("Enjoy your trip.");
    }
    public static void CANCEL() {
        int j = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of ticket you want to cancel.");
        int NUMSEAT = input.nextInt();

        System.out.println("You may now choose the seat you would like to cancel.");
        System.out.println(" ");
        System.out.println(" ROW    			SEAT     ");
        System.out.println("  1     |" + A[ 1] + "|" + B[ 1] + "|   |" + C[ 1] + "|" + D[ 1] + "|" + E[ 1] + "|" + F[ 1] + "|   |" + G[ 1] + "|" + H[ 1] + "|");
        System.out.println("  2     |" + A[ 2] + "|" + B[ 2] + "|   |" + C[ 2] + "|" + D[ 2] + "|" + E[ 2] + "|" + F[ 2] + "|   |" + G[ 2] + "|" + H[ 2] + "|");
        System.out.println("  3     |" + A[ 3] + "|" + B[ 3] + "|   |" + C[ 3] + "|" + D[ 3] + "|" + E[ 3] + "|" + F[ 3] + "|   |" + G[ 3] + "|" + H[ 3] + "|");
        System.out.println("  4     |" + A[ 4] + "|" + B[ 4] + "|   |" + C[ 4] + "|" + D[ 4] + "|" + E[ 4] + "|" + F[ 4] + "|   |" + G[ 4] + "|" + H[ 4] + "|");
        System.out.println("  5     |" + A[ 5] + "|" + B[ 5] + "|   |" + C[ 5] + "|" + D[ 5] + "|" + E[ 5] + "|" + F[ 5] + "|   |" + G[ 5] + "|" + H[ 5] + "|");
        System.out.println("  6     |" + A[ 6] + "|" + B[ 6] + "|   |" + C[ 6] + "|" + D[ 6] + "|" + E[ 6] + "|" + F[ 6] + "|   |" + G[ 6] + "|" + H[ 6] + "|");
        System.out.println("  7     |" + A[ 7] + "|" + B[ 7] + "|   |" + C[ 7] + "|" + D[ 7] + "|" + E[ 7] + "|" + F[ 7] + "|   |" + G[ 7] + "|" + H[ 7] + "|");
        System.out.println("  8     |" + A[ 8] + "|" + B[ 8] + "|   |" + C[ 8] + "|" + D[ 8] + "|" + E[ 8] + "|" + F[ 8] + "|   |" + G[ 8] + "|" + H[ 8] + "|");
        System.out.println("  9     |" + A[ 9] + "|" + B[ 9] + "|   |" + C[ 9] + "|" + D[ 9] + "|" + E[ 9] + "|" + F[ 9] + "|   |" + G[ 9] + "|" + H[ 9] + "|");
        System.out.println("  10    |" + A[10] + "|" + B[10] + "|   |" + C[10] + "|" + D[10] + "|" + E[10] + "|" + F[10] + "|   |" + G[10] + "|" + H[10] + "|");
        System.out.println("  11    |" + A[11] + "|" + B[11] + "|   |" + C[11] + "|" + D[11] + "|" + E[11] + "|" + F[11] + "|   |" + G[11] + "|" + H[11] + "|");
		System.out.println("");
		
        do {
            System.out.print("Please Enter Your Cancel Seat Row (1-11): ");
            int SEATROW = input.nextInt();
            System.out.print("Please Enter Your Cancel Seat (A-H): ");
            String sseat = input.next();

            if (SEATROW <= 11 && SEATROW > 0 && "A".equals(sseat) || "a".equals(sseat)) {
                if (!"X".equals(A[SEATROW])) {
                    System.out.println("The seat is empty");
                } else {
                    A[SEATROW] = "A";
                    System.out.println("Cancelation completed");
                }
            } else if (SEATROW <= 11 && SEATROW > 0 && "B".equals(sseat) || "b".equals(sseat)) {
                if (!"X".equals(B[SEATROW])) {
                    System.out.println("The seat is empty");
                } else {
                    B[SEATROW] = "B";
                    System.out.println("Cancelation completed");
                }
            } else if (SEATROW <= 11 && SEATROW > 0 && "C".equals(sseat) || "c".equals(sseat)) {
                if (!"X".equals(C[SEATROW])) {
                    System.out.println("The seat is empty");
                } else {
                    C[SEATROW] = "C";
                    System.out.println("Cancelation completed");
                }
            } else if (SEATROW <= 11 && SEATROW > 0 && "D".equals(sseat) || "d".equals(sseat)) {
                if (!"X".equals(D[SEATROW])) {
                    System.out.println("The seat is empty");
                } else {
                    D[SEATROW] = "D";
                    System.out.println("Cancelation completed");
                }

            } else if (SEATROW <= 11 && SEATROW > 0 && "E".equals(sseat) || "e".equals(sseat)) {
                if (!"X".equals(E[SEATROW])) {
                    System.out.println("The seat is empty");
                } else {
                    E[SEATROW] = "E";
                    System.out.println("Cancelation completed");
                }
            } else if (SEATROW <= 11 && SEATROW > 0 && "F".equals(sseat) || "f".equals(sseat)) {
                if (!"X".equals(F[SEATROW])) {
                    System.out.println("The seat is empty");
                } else {
                    F[SEATROW] = "F";
                    System.out.println("Cancelation completed");
                }

            } else if (SEATROW <= 11 && SEATROW > 0 && "G".equals(sseat) || "g".equals(sseat)) {
                if (!"X".equals(G[SEATROW])) {
                    System.out.println("The seat is empty");
                } else {
                    G[SEATROW] = "G";
                    System.out.println("Cancelation completed");
                }

            } else if (SEATROW <= 11 && SEATROW > 0 && "H".equals(sseat) || "h".equals(sseat)) {
                if (!"X".equals(H[SEATROW])) {
                    System.out.println("The seat is empty");
                } else {
                    H[SEATROW] = "H";
                    System.out.println("Cancelation completed");
                }
            } else {
                System.out.println("Something went wrong!!! Please Try Again.");
            }
            j++;
        } while (j <= NUMSEAT);
        int numseat = 0;
        numseat = numseat - NUMSEAT;
    }
    public static void QUIT() {
        Scanner input = new Scanner(System.in);
        String exit = "Y";
        System.out.println("Do you want to leave HML Airline? Y/N");
        exit = input.next();

        if (exit.equals("Y")) {
            System.out.println("*****Thanks For Choosing HML Airline*****");
        }
        else {
        	System.out.println("Something went wrong!!! Please Try Again.");
        }

    }
}

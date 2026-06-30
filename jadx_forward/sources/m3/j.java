package m3;

/* loaded from: classes13.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f404630a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static char[] f404631b = new char[24];

    public static int a(int i17, int i18, boolean z17, int i19) {
        if (i17 > 99 || (z17 && i19 >= 3)) {
            return i18 + 3;
        }
        if (i17 > 9 || (z17 && i19 >= 2)) {
            return i18 + 2;
        }
        if (z17 || i17 > 0) {
            return i18 + 1;
        }
        return 0;
    }

    public static int b(long j17, int i17) {
        char c17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        long j18 = j17;
        if (f404631b.length < i17) {
            f404631b = new char[i17];
        }
        char[] cArr = f404631b;
        if (j18 == 0) {
            int i37 = i17 - 1;
            while (i37 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j18 > 0) {
            c17 = '+';
        } else {
            j18 = -j18;
            c17 = '-';
        }
        int i38 = (int) (j18 % 1000);
        int floor = (int) java.lang.Math.floor(j18 / 1000);
        if (floor > 86400) {
            i18 = floor / 86400;
            floor -= 86400 * i18;
        } else {
            i18 = 0;
        }
        if (floor > 3600) {
            i19 = floor / 3600;
            floor -= i19 * 3600;
        } else {
            i19 = 0;
        }
        if (floor > 60) {
            int i39 = floor / 60;
            i27 = floor - (i39 * 60);
            i28 = i39;
        } else {
            i27 = floor;
            i28 = 0;
        }
        if (i17 != 0) {
            int a17 = a(i18, 1, false, 0);
            int a18 = a17 + a(i19, 1, a17 > 0, 2);
            int a19 = a18 + a(i28, 1, a18 > 0, 2);
            int a27 = a19 + a(i27, 1, a19 > 0, 2);
            i29 = 0;
            for (int a28 = a27 + a(i38, 2, true, a27 > 0 ? 3 : 0) + 1; a28 < i17; a28++) {
                cArr[i29] = ' ';
                i29++;
            }
        } else {
            i29 = 0;
        }
        cArr[i29] = c17;
        int i47 = i29 + 1;
        boolean z17 = i17 != 0;
        int c18 = c(cArr, i18, 'd', i47, false, 0);
        int c19 = c(cArr, i19, 'h', c18, c18 != i47, z17 ? 2 : 0);
        int c27 = c(cArr, i28, 'm', c19, c19 != i47, z17 ? 2 : 0);
        int c28 = c(cArr, i27, 's', c27, c27 != i47, z17 ? 2 : 0);
        int c29 = c(cArr, i38, 'm', c28, true, (!z17 || c28 == i47) ? 0 : 3);
        cArr[c29] = 's';
        return c29 + 1;
    }

    public static int c(char[] cArr, int i17, char c17, int i18, boolean z17, int i19) {
        int i27;
        if (!z17 && i17 <= 0) {
            return i18;
        }
        if ((!z17 || i19 < 3) && i17 <= 99) {
            i27 = i18;
        } else {
            int i28 = i17 / 100;
            cArr[i18] = (char) (i28 + 48);
            i27 = i18 + 1;
            i17 -= i28 * 100;
        }
        if ((z17 && i19 >= 2) || i17 > 9 || i18 != i27) {
            int i29 = i17 / 10;
            cArr[i27] = (char) (i29 + 48);
            i27++;
            i17 -= i29 * 10;
        }
        cArr[i27] = (char) (i17 + 48);
        int i37 = i27 + 1;
        cArr[i37] = c17;
        return i37 + 1;
    }
}

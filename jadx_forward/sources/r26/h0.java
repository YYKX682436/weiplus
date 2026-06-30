package r26;

/* loaded from: classes11.dex */
public abstract class h0 extends r26.g0 {
    public static final java.lang.Void g(java.lang.String input) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        throw new java.lang.NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static final java.lang.Integer h(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return i(str, 10);
    }

    public static final java.lang.Integer i(java.lang.String str, int i17) {
        boolean z17;
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        r26.a.a(i17);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i27 = 0;
        char charAt = str.charAt(0);
        int i28 = -2147483647;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.i(charAt, 48) < 0) {
            i18 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z17 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i28 = Integer.MIN_VALUE;
                z17 = true;
            }
        } else {
            z17 = false;
            i18 = 0;
        }
        int i29 = -59652323;
        while (i18 < length) {
            int digit = java.lang.Character.digit((int) str.charAt(i18), i17);
            if (digit < 0) {
                return null;
            }
            if ((i27 < i29 && (i29 != -59652323 || i27 < (i29 = i28 / i17))) || (i19 = i27 * i17) < i28 + digit) {
                return null;
            }
            i27 = i19 - digit;
            i18++;
        }
        return z17 ? java.lang.Integer.valueOf(i27) : java.lang.Integer.valueOf(-i27);
    }

    public static final java.lang.Long j(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return k(str, 10);
    }

    public static final java.lang.Long k(java.lang.String str, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        r26.a.a(i17);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i18 = 0;
        char charAt = str.charAt(0);
        long j17 = -9223372036854775807L;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.i(charAt, 48) < 0) {
            z17 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z17 = false;
                i18 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j17 = Long.MIN_VALUE;
                i18 = 1;
            }
        } else {
            z17 = false;
        }
        long j18 = -256204778801521550L;
        long j19 = 0;
        long j27 = -256204778801521550L;
        while (i18 < length) {
            int digit = java.lang.Character.digit((int) str.charAt(i18), i17);
            if (digit < 0) {
                return null;
            }
            if (j19 < j27) {
                if (j27 == j18) {
                    j27 = j17 / i17;
                    if (j19 < j27) {
                    }
                }
                return null;
            }
            long j28 = j19 * i17;
            long j29 = digit;
            if (j28 < j17 + j29) {
                return null;
            }
            j19 = j28 - j29;
            i18++;
            j18 = -256204778801521550L;
        }
        return z17 ? java.lang.Long.valueOf(j19) : java.lang.Long.valueOf(-j19);
    }
}

package yb;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yb.a f542142a = new yb.a();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f542143b = {19968, 20108, 19977, 22235, 20116, 20845, 19971, 20843, 20061};

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f542144c = {21313, 30334, 21315, 19975, 20159};

    public final java.lang.String a(int i17) {
        java.lang.String str;
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        int length = valueOf.length();
        char[] cArr = f542143b;
        if (length == 1) {
            if (i17 == 0) {
                return "";
            }
            return "" + cArr[i17 - 1];
        }
        if (valueOf.length() == 2) {
            java.lang.String substring = valueOf.substring(0, 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(substring, "1")) {
                str = "十";
                if (i17 % 10 == 0) {
                    return "十";
                }
            } else {
                str = "" + cArr[(i17 / 10) - 1] + (char) 21313;
            }
            return str + a(i17 % 10);
        }
        if (valueOf.length() == 3) {
            java.lang.String str2 = "" + cArr[(i17 / 100) - 1] + (char) 30334;
            int i18 = i17 % 100;
            if (java.lang.String.valueOf(i18).length() < 2) {
                if (i18 == 0) {
                    return str2;
                }
                str2 = str2 + (char) 38646;
            }
            return str2 + a(i18);
        }
        if (valueOf.length() == 4) {
            java.lang.String str3 = "" + cArr[(i17 / 1000) - 1] + (char) 21315;
            int i19 = i17 % 1000;
            if (java.lang.String.valueOf(i19).length() < 3) {
                if (i19 == 0) {
                    return str3;
                }
                str3 = str3 + (char) 38646;
            }
            return str3 + a(i19);
        }
        if (valueOf.length() != 5) {
            return "";
        }
        java.lang.String str4 = "" + cArr[(i17 / 10000) - 1] + (char) 19975;
        int i27 = i17 % 10000;
        if (java.lang.String.valueOf(i27).length() < 4) {
            if (i27 == 0) {
                return str4;
            }
            str4 = str4 + (char) 38646;
        }
        return str4 + a(i27);
    }
}

package m26;

/* loaded from: classes13.dex */
public abstract class a {
    public static final java.lang.String a(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        boolean z17 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z17 = true;
        }
        if (!z17) {
            return str;
        }
        char upperCase = java.lang.Character.toUpperCase(charAt);
        java.lang.String substring = str.substring(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return upperCase + substring;
    }

    public static final boolean b(java.lang.String str, int i17, boolean z17) {
        char charAt = str.charAt(i17);
        return z17 ? 'A' <= charAt && charAt < '[' : java.lang.Character.isUpperCase(charAt);
    }

    public static final java.lang.String c(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length());
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            if ('A' <= charAt && charAt < '[') {
                charAt = java.lang.Character.toLowerCase(charAt);
            }
            sb6.append(charAt);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}

package ez;

/* loaded from: classes8.dex */
public abstract class m1 {
    public static java.lang.String a(java.lang.String str, java.lang.String redactionSymbol, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            redactionSymbol = "*";
        }
        if ((i18 & 2) != 0) {
            i17 = 3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redactionSymbol, "redactionSymbol");
        if (str.length() <= 1) {
            return redactionSymbol;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object B0 = r26.p0.B0(str);
        if (B0 == null) {
            B0 = "";
        }
        sb6.append(B0);
        if (str.length() >= 4) {
            sb6.append(r26.i0.s(redactionSymbol, java.lang.Math.min(str.length() - 2, i17)));
            java.lang.Character valueOf = str.length() == 0 ? null : java.lang.Character.valueOf(str.charAt(str.length() - 1));
            sb6.append(valueOf != null ? valueOf : "");
        } else {
            sb6.append(r26.i0.s(redactionSymbol, java.lang.Math.min(str.length() - 1, i17)));
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}

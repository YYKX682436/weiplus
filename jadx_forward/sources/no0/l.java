package no0;

/* loaded from: classes3.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static java.lang.String a(no0.l lVar, int i17, java.lang.String splitStr, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        java.lang.String valueOf;
        java.lang.String valueOf2;
        java.lang.String valueOf3;
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        if ((i18 & 8) != 0) {
            z18 = true;
        }
        if ((i18 & 16) != 0) {
            z19 = true;
        }
        lVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(splitStr, "splitStr");
        int i19 = i17 % 60;
        int i27 = i17 / 60;
        int i28 = i27 % 60;
        int i29 = i27 / 60;
        if (i19 < 10) {
            valueOf = "0" + i19;
        } else {
            valueOf = java.lang.String.valueOf(i19);
        }
        if (i28 < 10) {
            valueOf2 = "0" + i28;
        } else {
            valueOf2 = java.lang.String.valueOf(i28);
        }
        if (i29 < 10) {
            valueOf3 = "0" + i29;
        } else {
            valueOf3 = java.lang.String.valueOf(i29);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (z17) {
            sb6.append(valueOf3 + splitStr);
        }
        if (z18) {
            sb6.append(valueOf2 + splitStr);
        }
        if (z19) {
            sb6.append(valueOf);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String b(int i17, java.lang.String splitStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(splitStr, "splitStr");
        return i17 < 3600 ? a(this, i17, splitStr, false, false, false, 24, null) : a(this, i17, splitStr, true, false, false, 24, null);
    }
}

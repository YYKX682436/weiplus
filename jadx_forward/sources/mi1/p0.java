package mi1;

/* loaded from: classes7.dex */
public abstract class p0 {
    public static final boolean a(mi1.j0 j0Var, mi1.j0 j0Var2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(j0Var, "<this>");
        if (j0Var2 == null) {
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var2, j0Var)) {
            return false;
        }
        int i17 = j0Var.f408120c;
        int i18 = j0Var2.f408120c;
        if (i17 <= i18) {
            return j0Var2.f408122e == j0Var.f408122e && i18 == i17;
        }
        return true;
    }
}

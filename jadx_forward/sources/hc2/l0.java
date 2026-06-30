package hc2;

/* loaded from: classes10.dex */
public abstract class l0 {
    public static final java.lang.String a(r45.mb4 mb4Var) {
        java.util.LinkedList linkedList;
        r45.ho6 ho6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mb4Var, "<this>");
        if (4 != mb4Var.m75939xb282bd08(2)) {
            return null;
        }
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(0);
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            return mb4Var.m75945x2fec8307(0);
        }
        r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
        if (h70Var == null || (linkedList = h70Var.f457430d) == null || (ho6Var = (r45.ho6) kz5.n0.Z(linkedList)) == null) {
            return null;
        }
        return ho6Var.f457866d;
    }

    public static final int b(r45.mb4 mb4Var) {
        if (mb4Var != null && mb4Var.m75939xb282bd08(2) == 9) {
            return 2;
        }
        if (mb4Var != null) {
            r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
            if (h70Var != null && h70Var.f457436m) {
                return 1;
            }
        }
        return 0;
    }

    public static final boolean c(r45.mb4 mb4Var) {
        if (mb4Var == null) {
            return true;
        }
        r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
        return !(h70Var != null && h70Var.f457436m);
    }
}

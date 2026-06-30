package dk2;

/* loaded from: classes3.dex */
public abstract class q {
    public static final boolean a(r45.rm1 rm1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rm1Var, "<this>");
        int m75939xb282bd08 = rm1Var.m75939xb282bd08(2);
        dk2.s4[] s4VarArr = dk2.s4.f315593d;
        return m75939xb282bd08 == 0;
    }

    public static final boolean b(r45.d22 d22Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d22Var, "<this>");
        int m75939xb282bd08 = d22Var.m75939xb282bd08(10);
        dk2.s4[] s4VarArr = dk2.s4.f315593d;
        return m75939xb282bd08 == 0;
    }

    public static final boolean c(r45.d22 d22Var, r45.rm1 rm1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d22Var, "<this>");
        if (rm1Var == null) {
            return false;
        }
        if (b(d22Var)) {
            return d22Var.m75939xb282bd08(0) == rm1Var.m75939xb282bd08(0);
        }
        int m75939xb282bd08 = d22Var.m75939xb282bd08(10);
        dk2.s4[] s4VarArr = dk2.s4.f315593d;
        if (m75939xb282bd08 == 1) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d22Var.m75945x2fec8307(9), rm1Var.m75945x2fec8307(1));
        }
        return false;
    }

    public static final boolean d(r45.d22 d22Var, r45.d22 d22Var2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d22Var, "<this>");
        if (d22Var2 == null) {
            return false;
        }
        if (b(d22Var)) {
            return d22Var.m75939xb282bd08(0) == d22Var2.m75939xb282bd08(0);
        }
        int m75939xb282bd08 = d22Var.m75939xb282bd08(10);
        dk2.s4[] s4VarArr = dk2.s4.f315593d;
        if (m75939xb282bd08 == 1) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d22Var.m75945x2fec8307(9), d22Var2.m75945x2fec8307(9));
        }
        return false;
    }

    public static final java.lang.String e(r45.d22 d22Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d22Var, "<this>");
        java.lang.String m75945x2fec8307 = d22Var.m75945x2fec8307(9);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            m75945x2fec8307 = java.lang.String.valueOf(d22Var.m75939xb282bd08(0));
        }
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    public static final boolean f(r45.d22 d22Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d22Var, "<this>");
        java.lang.String m75945x2fec8307 = d22Var.m75945x2fec8307(7);
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            return false;
        }
        java.lang.String m75945x2fec83072 = d22Var.m75945x2fec8307(9);
        return !(m75945x2fec83072 == null || m75945x2fec83072.length() == 0);
    }

    public static final r45.rm1 g(r45.d22 d22Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d22Var, "<this>");
        r45.rm1 rm1Var = new r45.rm1();
        rm1Var.set(1, d22Var.m75945x2fec8307(9));
        rm1Var.set(0, java.lang.Integer.valueOf(d22Var.m75939xb282bd08(0)));
        rm1Var.set(2, java.lang.Integer.valueOf(d22Var.m75939xb282bd08(10)));
        return rm1Var;
    }

    public static final java.lang.String h(r45.rm1 rm1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rm1Var, "<this>");
        return rm1Var.m75939xb282bd08(0) + '+' + rm1Var.m75945x2fec8307(1) + '+' + rm1Var.m75939xb282bd08(2);
    }
}

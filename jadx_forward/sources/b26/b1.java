package b26;

/* loaded from: classes16.dex */
public abstract class b1 {
    public static final o06.g0 a(b26.z0 z0Var, i16.h2 h2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z0Var, "<this>");
        switch (h2Var == null ? -1 : b26.a1.f98944b[h2Var.ordinal()]) {
            case 1:
                o06.g0 INTERNAL = o06.f0.f423477d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                o06.g0 PRIVATE = o06.f0.f423474a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                o06.g0 PRIVATE_TO_THIS = o06.f0.f423475b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                o06.g0 PROTECTED = o06.f0.f423476c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                o06.g0 PUBLIC = o06.f0.f423478e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                o06.g0 LOCAL = o06.f0.f423479f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(LOCAL, "LOCAL");
                return LOCAL;
            default:
                o06.g0 PRIVATE2 = o06.f0.f423474a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final o06.c b(b26.z0 z0Var, i16.k0 k0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z0Var, "<this>");
        int i17 = k0Var == null ? -1 : b26.a1.f98943a[k0Var.ordinal()];
        o06.c cVar = o06.c.DECLARATION;
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? cVar : o06.c.SYNTHESIZED : o06.c.DELEGATION : o06.c.FAKE_OVERRIDE : cVar;
    }
}

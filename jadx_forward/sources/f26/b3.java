package f26;

/* loaded from: classes16.dex */
public abstract class b3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final f26.o0 a(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        if (o0Var instanceof f26.a3) {
            return ((f26.a3) o0Var).j0();
        }
        return null;
    }

    public static final f26.c3 b(f26.c3 c3Var, f26.o0 origin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        return c(c3Var, a(origin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final f26.c3 c(f26.c3 c3Var, f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c3Var, "<this>");
        if (c3Var instanceof f26.a3) {
            return c(((f26.a3) c3Var).P(), o0Var);
        }
        if (o0Var == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o0Var, c3Var)) {
            return c3Var;
        }
        if (c3Var instanceof f26.z0) {
            return new f26.c1((f26.z0) c3Var, o0Var);
        }
        if (c3Var instanceof f26.e0) {
            return new f26.g0((f26.e0) c3Var, o0Var);
        }
        throw new jz5.j();
    }
}

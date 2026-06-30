package f26;

/* loaded from: classes16.dex */
public abstract class h0 {
    public static final f26.e0 a(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        f26.c3 z07 = o0Var.z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(z07, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (f26.e0) z07;
    }

    public static final boolean b(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        return o0Var.z0() instanceof f26.e0;
    }

    public static final f26.z0 c(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        f26.c3 z07 = o0Var.z0();
        if (z07 instanceof f26.e0) {
            return ((f26.e0) z07).f340686e;
        }
        if (z07 instanceof f26.z0) {
            return (f26.z0) z07;
        }
        throw new jz5.j();
    }

    public static final f26.z0 d(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        f26.c3 z07 = o0Var.z0();
        if (z07 instanceof f26.e0) {
            return ((f26.e0) z07).f340687f;
        }
        if (z07 instanceof f26.z0) {
            return (f26.z0) z07;
        }
        throw new jz5.j();
    }
}

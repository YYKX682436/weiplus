package a0;

/* loaded from: classes14.dex */
public abstract class b {
    public static z0.t a(z0.t tVar, e1.r brush, e1.a1 a1Var, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            a1Var = e1.v0.f327822a;
        }
        e1.a1 shape = a1Var;
        if ((i17 & 4) != 0) {
            f17 = 1.0f;
        }
        float f18 = f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brush, "brush");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shape, "shape");
        boolean z17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
        return tVar.k(new a0.a(null, brush, f18, shape, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d, 1, null));
    }

    public static final z0.t b(z0.t background, long j17, e1.a1 shape) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(background, "$this$background");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shape, "shape");
        e1.y yVar = new e1.y(j17);
        boolean z17 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
        return background.k(new a0.a(yVar, null, 0.0f, shape, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d, 6, null));
    }

    public static /* synthetic */ z0.t c(z0.t tVar, long j17, e1.a1 a1Var, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            a1Var = e1.v0.f327822a;
        }
        return b(tVar, j17, a1Var);
    }
}

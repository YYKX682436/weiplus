package a0;

/* loaded from: classes14.dex */
public final class h0 implements a0.r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0.h0 f81688a = new a0.h0();

    @Override // a0.r1
    public a0.s1 a(c0.n interactionSource, n0.o oVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interactionSource, "interactionSource");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(1683566979);
        int i18 = i17 & 14;
        y0Var.U(-1692965168);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i19 = n0.o.f415162a;
        java.lang.Object obj = n0.n.f415153a;
        if (y17 == obj) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        int i27 = i18 & 14;
        n0.d2.f(interactionSource, new c0.u(interactionSource, v2Var, null), y0Var, i27);
        y0Var.o(false);
        y0Var.U(1206586544);
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        if (y18 == obj) {
            y18 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        n0.v2 v2Var2 = (n0.v2) y18;
        n0.d2.f(interactionSource, new c0.l(interactionSource, v2Var2, null), y0Var, i27);
        y0Var.o(false);
        n0.e5 a17 = c0.h.a(interactionSource, y0Var, i18);
        y0Var.U(1157296644);
        boolean e17 = y0Var.e(interactionSource);
        java.lang.Object y19 = y0Var.y();
        if (e17 || y19 == obj) {
            y19 = new a0.g0(v2Var, v2Var2, a17);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        a0.g0 g0Var = (a0.g0) y19;
        y0Var.o(false);
        return g0Var;
    }
}

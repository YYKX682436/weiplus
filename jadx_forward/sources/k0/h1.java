package k0;

/* loaded from: classes14.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f384457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k0.y0 y0Var) {
        super(3);
        this.f384457d = y0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1980580247);
        p2.f fVar = (p2.f) y0Var.i(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m2.f92179e);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            y17 = n0.s4.c(new p2.q(0L), null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        k0.d1 d1Var = new k0.d1(this.f384457d, v2Var);
        k0.g1 g1Var = new k0.g1(fVar, v2Var);
        z.u uVar = k0.h0.f384453a;
        z0.t b17 = z0.m.b(composed, null, new k0.c0(d1Var, g1Var), 1, null);
        y0Var.o(false);
        return b17;
    }
}

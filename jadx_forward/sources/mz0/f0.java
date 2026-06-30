package mz0;

/* loaded from: classes5.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz0.l f414480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(mz0.b2 b2Var, dz0.l lVar) {
        super(2);
        this.f414479d = b2Var;
        this.f414480e = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(279461270);
        java.lang.Object y17 = y0Var2.y();
        int i17 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            y17 = n0.s4.c(java.lang.Boolean.FALSE, null, 2, null);
            y0Var2.g0(y17);
        }
        n0.v2 v2Var = (n0.v2) y17;
        y0Var2.o(false);
        mz0.b2 b2Var = this.f414479d;
        tz0.a0.a(u0.j.b(y0Var2, -1793948430, true, new mz0.c0(b2Var, v2Var, this.f414480e)), y0Var2, 6);
        n0.d2.f(v2Var.mo128745x754a37bb(), new mz0.d0(v2Var, b2Var, null), y0Var2, 64);
        n0.d2.f(java.lang.Integer.valueOf(mz0.b2.O6(b2Var)), new mz0.e0(b2Var, null), y0Var2, 64);
        return jz5.f0.f384359a;
    }
}

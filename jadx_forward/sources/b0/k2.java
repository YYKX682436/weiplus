package b0;

/* loaded from: classes14.dex */
public final class k2 implements b0.e2, b0.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e5 f97919a;

    /* renamed from: b, reason: collision with root package name */
    public b0.p2 f97920b;

    public k2(n0.e5 scrollLogic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollLogic, "scrollLogic");
        this.f97919a = scrollLogic;
        this.f97920b = b0.d3.f97795a;
    }

    @Override // b0.e2
    public java.lang.Object a(a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object c17 = ((b0.m3) this.f97919a.mo128745x754a37bb()).f97968d.c(k2Var, new b0.j2(this, pVar, null), interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : jz5.f0.f384359a;
    }

    @Override // b0.d2
    public void b(float f17, long j17) {
        b0.m3 m3Var = (b0.m3) this.f97919a.mo128745x754a37bb();
        m3Var.a(this.f97920b, m3Var.e(f17), new d1.e(j17), 1);
    }
}

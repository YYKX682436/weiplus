package ty0;

/* loaded from: classes5.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f504385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f504387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504388g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ty0.b1 b1Var, n0.e5 e5Var, n0.v2 v2Var, n0.e5 e5Var2) {
        super(4);
        this.f504385d = b1Var;
        this.f504386e = e5Var;
        this.f504387f = v2Var;
        this.f504388g = e5Var2;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj5 = n0.e1.f415025a;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) ty0.z0.h(this.f504386e).get(intValue);
        float f17 = ((p2.h) this.f504387f.mo128745x754a37bb()).f432913d;
        java.lang.String m33858xd75a8eb6 = c4116xf4b2c356.m33858xd75a8eb6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33858xd75a8eb6, "getSongName(...)");
        java.lang.String m33857x158977f6 = c4116xf4b2c356.m33857x158977f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33857x158977f6, "getSingerNames(...)");
        ty0.z0.g(f17, m33858xd75a8eb6, m33857x158977f6, this.f504385d.f504329f, p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) this.f504388g.mo128745x754a37bb(), c4116xf4b2c356.m33856x92013dca()), null, oVar, 0, 32);
        return jz5.f0.f384359a;
    }
}

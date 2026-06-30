package g22;

/* loaded from: classes15.dex */
public final class u0 implements i22.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.o f349407d;

    /* renamed from: e, reason: collision with root package name */
    public final i22.b0 f349408e;

    public u0(p012xc85e97e9.p093xedfae76a.o lifecycle, i22.b0 b0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        this.f349407d = lifecycle;
        this.f349408e = b0Var;
    }

    @Override // i22.a0
    public void s(java.lang.String productId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13375x3780b243 c13375x3780b243 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13375x3780b243(productId, str, str2, str3, str4, new g22.t0(this, productId));
        p012xc85e97e9.p093xedfae76a.o lifecycle = this.f349407d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        lifecycle.a(c13375x3780b243);
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, c13375x3780b243);
        c13375x3780b243.f180045o.mo48813x58998cd();
        c13375x3780b243.f180044n = new z12.l(c13375x3780b243.f180037d, c13375x3780b243.f180038e, c13375x3780b243.f180039f, c13375x3780b243.f180040g, c13375x3780b243.f180041h);
        gm0.j1.n().f354821b.g(c13375x3780b243.f180044n);
    }

    @Override // i22.a0
    public void x() {
    }
}

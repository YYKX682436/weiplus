package qz2;

/* loaded from: classes9.dex */
public final class j1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f449412d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f449413e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f449414f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f449415g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f449413e = jz5.h.b(qz2.z0.f449464d);
        this.f449414f = new p012xc85e97e9.p093xedfae76a.j0();
        this.f449415g = new p012xc85e97e9.p093xedfae76a.j0();
    }

    public final void O6(qz2.y0 y0Var) {
        this.f449414f.mo523x53d8522f(y0Var);
    }

    public final void P6(qz2.t0 t0Var) {
        this.f449415g.mo523x53d8522f(t0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x19263085).m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x192630852).m83090x14f40144(1638);
        this.f449414f.mo7806x9d92d11c(m158354x19263085(), new qz2.f1(this));
        this.f449415g.mo7806x9d92d11c(m158354x19263085(), new qz2.b1(this));
        P6(qz2.n0.f449425a);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x19263085).m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r6.f34501x366c91de);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) m158354x192630852).m83121xf6ff5b27(1638);
        mz2.d2.IML.h();
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f449413e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((ne4.n) ((d50.q) mo141623x754a37bb)).a(true);
    }
}

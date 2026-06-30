package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f159632v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f159633w;

    /* renamed from: x, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.r f159634x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dp1.x pageAdapter, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        super(pageAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f159632v = runtime;
        this.f159633w = "MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper#" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.d(runtime);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159633w, "onReceivedBallInfoRemovedEvent");
        n0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.c(this.f159632v);
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s.n8(c17, false, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159435a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.k0.f159436b.d(this.f159632v.f156336n, this.f159632v.f156338p.f158814g, bm5.f1.a());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159633w, "onReceivedFinishWhenSwitchBallEvent");
        this.f174772n.q(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159633w, "onCreate, floatBallType: " + str + ", floatBallKey: " + str);
        super.b(i17, str);
        Q(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.a(this.f159632v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.r rVar = this.f159634x;
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159633w, "requireBackgroundSupportStateListener, create");
            rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.h(this);
            this.f159634x = rVar;
        }
        a17.S6(rVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean m0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159633w, "onClose, way: " + i17);
        if (!u()) {
            return false;
        }
        android.content.Context context = this.f159632v.f156328d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getAppContext(...)");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
            t0(i17);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t.a(context, 33, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.f(this, i17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public void o0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159633w, "onDestroy");
        super.o0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.r rVar = this.f159634x;
        if (rVar == null || (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.c(this.f159632v)) == null) {
            return;
        }
        c17.j8(rVar);
    }

    public final void t0(int i17) {
        t().f174623m = f0(i17);
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.e0.b(this.f174772n, this.f174669h.G(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.g(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159633w, "onEnterPage");
        if (s() != null) {
            d0(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159633w, "onExitPage");
        if (s() != null) {
            d0(true);
        }
    }
}

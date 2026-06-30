package lf1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f399787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf1.j f399788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f399789f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f399790g;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, lf1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f399787d = v5Var;
        this.f399788e = jVar;
        this.f399789f = lVar;
        this.f399790g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f399787d;
        if (!v5Var.mo50262x39e05d35() || v5Var.a2() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "requestFullscreen, invalid state");
            return;
        }
        this.f399788e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "triggerAppFullScreenIfNeed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f399789f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) lVar : lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar).V0() : null;
        if (V0 != null && V0.mo32091x9a3f0ba2().Q0()) {
            V0.mo32091x9a3f0ba2().H2.f172735h = true;
        }
        xi1.m mo14663xe55fc971 = v5Var.a2().mo14663xe55fc971();
        android.view.View mo14669x50cdf8a2 = v5Var.a2().mo14669x50cdf8a2();
        if (mo14663xe55fc971 == null || mo14669x50cdf8a2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "requestFullscreen, state error, FullscreenImp[%s], fullscreenWebView[%s]", mo14663xe55fc971, mo14669x50cdf8a2);
            return;
        }
        int i17 = this.f399790g;
        mo14663xe55fc971.e(mo14669x50cdf8a2, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "requestFullscreen, target orientation:%s", java.lang.Integer.valueOf(i17));
    }
}

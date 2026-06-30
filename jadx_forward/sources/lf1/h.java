package lf1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f399791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf1.j f399792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f399793f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, lf1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f399791d = v5Var;
        this.f399792e = jVar;
        this.f399793f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f399791d;
        if (!v5Var.mo50262x39e05d35() || v5Var.a2() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "exitFullscreen, invalid state");
            return;
        }
        xi1.m mo14663xe55fc971 = v5Var.a2().mo14663xe55fc971();
        if (mo14663xe55fc971 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "exitFullscreen, state error");
            return;
        }
        this.f399792e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "triggerAppHalfScreenIfNeed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f399793f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) lVar : lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar).V0() : null;
        if (V0 != null && V0.mo32091x9a3f0ba2().Q0() && !V0.mo32091x9a3f0ba2().u0().L1.P) {
            V0.mo32091x9a3f0ba2().H2.f172735h = false;
        }
        mo14663xe55fc971.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "exitFullscreen");
    }
}

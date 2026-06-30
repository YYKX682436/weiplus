package lm1;

/* loaded from: classes7.dex */
public final class a extends fg1.z {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f400871f = "MicroMsg.SameLayer.AppBrandVideoCustomHandlerWC";

    @Override // fg1.z
    public ig1.a a() {
        return new lm1.b();
    }

    @Override // fg1.z
    public boolean c(ye1.e eVar) {
        return !this.f343455c.b(eVar);
    }

    @Override // fg1.z
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400871f, "triggerAppFullScreenIfNeed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) lVar : lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar).V0() : null;
        if (V0 != null && V0.mo32091x9a3f0ba2().Q0()) {
            V0.mo32091x9a3f0ba2().H2.f172735h = true;
        }
    }

    @Override // fg1.z
    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400871f, "triggerAppHalfScreenIfNeed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) lVar : lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar).V0() : null;
        if (V0 == null || !V0.mo32091x9a3f0ba2().Q0() || V0.mo32091x9a3f0ba2().u0().L1.P) {
            return;
        }
        V0.mo32091x9a3f0ba2().H2.f172735h = false;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class q0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.r0 f172065d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.r0 r0Var) {
        this.f172065d = r0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onScreenShot callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.r0 r0Var = this.f172065d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = r0Var.f172075c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOnUserCaptureScreenEvent", "user capture screen event dispatch, appId:%s", lVar.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v0();
        v0Var.u(lVar);
        v0Var.m();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) r0Var.f172073a).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.f7) it.next()).z0(str, j17, false);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public final class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k f170608d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar) {
        this.f170608d = kVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMiniProgramProcess", "preLoad by ipc invoke, callback received, targetProcess[%s]", this.f170608d.i());
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void c(java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMiniProgramProcess", "onCaughtInvokeException: %s, process %s", android.util.Log.getStackTraceString(exc), this.f170608d.i());
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandMiniProgramProcess", "onBridgeNotFound: proc [%s]", this.f170608d.i());
    }
}

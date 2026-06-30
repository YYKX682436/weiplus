package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170096d;

    public t0(java.lang.String str) {
        this.f170096d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0.f170130h;
        java.lang.String str = this.f170096d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0) concurrentHashMap.remove(str);
        if (v0Var != null) {
            oz5.i iVar = v0Var.f170117c;
            if (((p3325xe03a0797.p3326xc267989b.c3) iVar).A()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "poster task timeout, posterTaskId=" + str);
            ((p3325xe03a0797.p3326xc267989b.a0) iVar).U(null);
        }
    }
}

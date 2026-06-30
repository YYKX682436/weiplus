package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class k3 extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f94334d = true;

    @Override // com.tencent.mm.app.t2
    public synchronized void onAppBackground(java.lang.String str) {
        this.f94334d = false;
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94375e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebPrefetcherManifest", "onAppBackground localManager is null");
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.j3 j3Var = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.j3(this);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(j3Var, 30000L, false);
    }

    @Override // com.tencent.mm.app.t2
    public synchronized void onAppForeground(java.lang.String str) {
        this.f94334d = true;
    }
}

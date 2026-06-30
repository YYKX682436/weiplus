package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.k3 f94328d;

    public j3(com.tencent.mm.plugin.brandservice.ui.timeline.preload.k3 k3Var) {
        this.f94328d = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f94328d.f94334d) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.d3 d3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94375e;
        objArr[0] = d3Var != null ? java.lang.Integer.valueOf(d3Var.hashCode()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherManifest", "onAppBackground releaseEngine %s", objArr);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94371a.i();
    }
}

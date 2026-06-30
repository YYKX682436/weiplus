package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.x2 f85425d;

    public y2(com.tencent.mm.plugin.appbrand.launching.x2 x2Var) {
        this.f85425d = x2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.plugin.appbrand.launching.x2 x2Var = this.f85425d;
        objArr[0] = x2Var.f85375r;
        objArr[1] = java.lang.Boolean.valueOf(x2Var.f85365h != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "DATA_TRANSFER_STATE_OVER_THRESHOLD with appId:%s, callback!=null:%b", objArr);
        if (this.f85425d.f85365h != null) {
            ((com.tencent.mm.plugin.appbrand.launching.j1) this.f85425d.f85365h).E(3);
        }
    }
}

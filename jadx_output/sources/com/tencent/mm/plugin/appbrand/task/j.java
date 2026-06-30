package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class j implements com.tencent.mm.ipcinvoker.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.k f89075d;

    public j(com.tencent.mm.plugin.appbrand.task.k kVar) {
        this.f89075d = kVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandMiniProgramProcess", "preLoad by ipc invoke, callback received, targetProcess[%s]", this.f89075d.i());
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void c(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMiniProgramProcess", "onCaughtInvokeException: %s, process %s", android.util.Log.getStackTraceString(exc), this.f89075d.i());
    }

    @Override // com.tencent.mm.ipcinvoker.s
    public void d() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandMiniProgramProcess", "onBridgeNotFound: proc [%s]", this.f89075d.i());
    }
}

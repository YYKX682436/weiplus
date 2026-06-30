package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88563d;

    public t0(java.lang.String str) {
        this.f88563d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.appbrand.screenshot.z0.f88597h;
        java.lang.String str = this.f88563d;
        com.tencent.mm.plugin.appbrand.screenshot.v0 v0Var = (com.tencent.mm.plugin.appbrand.screenshot.v0) concurrentHashMap.remove(str);
        if (v0Var != null) {
            oz5.i iVar = v0Var.f88584c;
            if (((kotlinx.coroutines.c3) iVar).A()) {
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "poster task timeout, posterTaskId=" + str);
            ((kotlinx.coroutines.a0) iVar).U(null);
        }
    }
}

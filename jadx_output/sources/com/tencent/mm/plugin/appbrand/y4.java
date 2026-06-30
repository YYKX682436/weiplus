package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f92410d;

    public y4(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer) {
        this.f92410d = appBrandRuntimeContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer = this.f92410d;
        try {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = appBrandRuntimeContainer.getActiveRuntime();
            if (activeRuntime != null) {
                appBrandRuntimeContainer.V(activeRuntime, true);
                appBrandRuntimeContainer.W(activeRuntime);
                activeRuntime.i0();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandRuntimeContainer", e17, "doOnResume e=%s", e17);
            appBrandRuntimeContainer.U(e17);
        }
    }
}

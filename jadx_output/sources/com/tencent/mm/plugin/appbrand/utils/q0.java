package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class q0 implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.r0 f90532d;

    public q0(com.tencent.mm.plugin.appbrand.utils.r0 r0Var) {
        this.f90532d = r0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserCaptureScreenMonitor", "onScreenShot callback");
        com.tencent.mm.plugin.appbrand.utils.r0 r0Var = this.f90532d;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = r0Var.f90542c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnUserCaptureScreenEvent", "user capture screen event dispatch, appId:%s", lVar.getAppId());
        com.tencent.mm.plugin.appbrand.jsapi.v0 v0Var = new com.tencent.mm.plugin.appbrand.jsapi.v0();
        v0Var.u(lVar);
        v0Var.m();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) r0Var.f90540a).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.sdk.platformtools.f7) it.next()).z0(str, j17, false);
        }
    }
}

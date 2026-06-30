package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ie implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.me f78342d;

    public ie(com.tencent.mm.plugin.appbrand.me meVar) {
        this.f78342d = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.me meVar = this.f78342d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "didFinishColdLaunch appId:" + meVar.f85751a.f74803n + ", sessionId:" + meVar.f85751a.u0().f47276v);
        java.lang.String str = meVar.f85751a.u0().f47276v;
        kotlin.jvm.internal.o.f(str, "getVisitingSessionId(...)");
        meVar.f85752b = str;
    }
}

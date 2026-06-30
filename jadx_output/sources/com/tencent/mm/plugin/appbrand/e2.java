package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f77987d;

    public e2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f77987d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f77987d.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepServiceInit);
        com.tencent.mm.plugin.appbrand.keylogger.w.g(this.f77987d.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepServiceInit_Game);
        this.f77987d.f74808q.l0();
    }
}

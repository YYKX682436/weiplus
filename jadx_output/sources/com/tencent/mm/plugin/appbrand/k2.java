package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f84057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f84058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f84059f;

    public k2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Runnable runnable, java.lang.Object obj) {
        this.f84059f = appBrandRuntime;
        this.f84057d = runnable;
        this.f84058e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f84059f;
        nf.o.a(appBrandRuntime.r0());
        boolean J0 = appBrandRuntime.J0();
        java.lang.Runnable runnable = this.f84057d;
        if (!J0 || appBrandRuntime.L0()) {
            com.tencent.mm.plugin.appbrand.hc hcVar = appBrandRuntime.f74796e;
            if (hcVar == null) {
                appBrandRuntime.d0();
            } else {
                hcVar.r(appBrandRuntime);
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.hc hcVar2 = appBrandRuntime.f74796e;
        if (hcVar2 != null && hcVar2.n(appBrandRuntime)) {
            appBrandRuntime.f74796e.t(appBrandRuntime, this.f84058e, runnable);
            return;
        }
        appBrandRuntime.f0();
        if (runnable != null) {
            runnable.run();
        }
    }
}

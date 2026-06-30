package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class l6 extends com.tencent.mm.plugin.appbrand.j6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1 f84232e;

    public l6(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1 appBrandRuntimeSuspendingWatchDog$watch$1) {
        this.f84231d = o6Var;
        this.f84232e = appBrandRuntimeSuspendingWatchDog$watch$1;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        if (this.f84231d.N.b() == u81.b.SUSPEND && this.f84232e.c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeSuspendingWatchDog", "onLowMemory(), runtime(" + this.f84231d.f74803n + ") suspended but still remaining in memory, enterSuspendTimestamp(" + this.f84232e.f74860d + ')');
            this.f84231d.l0();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1761, 3);
        }
    }
}

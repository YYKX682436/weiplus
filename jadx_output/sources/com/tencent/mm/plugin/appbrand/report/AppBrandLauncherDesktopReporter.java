package com.tencent.mm.plugin.appbrand.report;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/report/AppBrandLauncherDesktopReporter;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onDestroy", "onCreate", "onStop", "onResume", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AppBrandLauncherDesktopReporter implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public long f87773d;

    /* renamed from: e, reason: collision with root package name */
    public long f87774e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f87775f = new java.util.LinkedHashSet();

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
    public final void onCreate() {
        this.f87773d = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19468, 1, "", "", "", "", "", java.lang.Long.valueOf(this.f87773d));
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onDestroy() {
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void onResume() {
        this.f87774e = java.lang.System.currentTimeMillis();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public final void onStop() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f87774e;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(19468, 8, "", java.lang.Long.valueOf(currentTimeMillis), "", "", java.lang.Long.valueOf(this.f87773d));
        java.util.Set set = this.f87775f;
        g0Var.d(19468, 7, "", "", "", "", java.lang.Integer.valueOf(set.size()), java.lang.Long.valueOf(this.f87773d));
        set.clear();
    }
}

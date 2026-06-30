package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f90523a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f90524b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f90525c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f90526d;

    public o4(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f90523a = runtime;
        java.lang.String str = "MicroMsg.AppBrand.SafeScreenShotRecordSwitcher#" + hashCode();
        this.f90524b = str;
        this.f90526d = new java.util.concurrent.ConcurrentSkipListSet(com.tencent.mm.plugin.appbrand.utils.n4.f90517d);
        java.lang.String str2 = runtime.f74803n;
        com.tencent.mars.xlog.Log.i(str, "<init>, appId: " + str2);
        runtime.F.f87737a.add(new com.tencent.mm.plugin.appbrand.utils.l4(this));
        com.tencent.mm.plugin.appbrand.x0.a(str2, new com.tencent.mm.plugin.appbrand.utils.m4(this));
    }

    public final boolean a() {
        android.app.Activity r07 = this.f90523a.r0();
        android.view.Window window = r07 != null ? r07.getWindow() : null;
        com.tencent.mars.xlog.Log.i(this.f90524b, "disableSafeScreenShotRecordInner, window: " + window);
        if (window == null) {
            return false;
        }
        window.clearFlags(8192);
        return true;
    }

    public final boolean b() {
        android.app.Activity r07 = this.f90523a.r0();
        android.view.Window window = r07 != null ? r07.getWindow() : null;
        com.tencent.mars.xlog.Log.i(this.f90524b, "enableSafeScreenShotRecordInner, window: " + window);
        if (window == null) {
            return false;
        }
        window.addFlags(8192);
        return true;
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f90524b, "runtimeSwitch.set " + this.f90525c + " -> " + z17);
        this.f90525c = z17;
        java.util.Iterator it = this.f90526d.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).invoke(java.lang.Boolean.valueOf(this.f90525c));
        }
    }
}

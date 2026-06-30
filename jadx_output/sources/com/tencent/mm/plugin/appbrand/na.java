package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class na {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f86058a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f86059b;

    /* renamed from: c, reason: collision with root package name */
    public int f86060c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f86061d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.w f86062e;

    public na(com.tencent.mm.plugin.appbrand.o6 mHostRuntime) {
        kotlin.jvm.internal.o.g(mHostRuntime, "mHostRuntime");
        this.f86058a = mHostRuntime;
        this.f86059b = "";
        this.f86061d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f86062e = new com.tencent.mm.plugin.appbrand.ma(this);
    }

    public final boolean a(com.tencent.mm.plugin.appbrand.AppBrandRuntime host, boolean z17, java.lang.Runnable afterCloseTask) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(afterCloseTask, "afterCloseTask");
        com.tencent.mm.plugin.appbrand.hc hcVar = host.f74796e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = hcVar != null ? hcVar.getActiveRuntime() : null;
        if (activeRuntime == null || !wa1.b.f444100a.c((com.tencent.mm.plugin.appbrand.o6) host)) {
            return false;
        }
        activeRuntime.T(null, afterCloseTask);
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) activeRuntime;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = o6Var.H2.f91198d;
        if (f0Var != null) {
            f0Var.T(13);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "[onCloseEmbedWxaBeforeHostClose] mark down embedded wxa appid for re-show when host back to the front");
        if (z17) {
            b(o6Var);
        }
        return true;
    }

    public final void b(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        com.tencent.mm.plugin.appbrand.page.d5 x07;
        com.tencent.mm.plugin.appbrand.page.v5 pageView;
        com.tencent.mm.plugin.appbrand.hc hcVar;
        java.lang.String str = o6Var.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        this.f86059b = str;
        com.tencent.mm.plugin.appbrand.page.n7 N2 = this.f86058a.N2();
        boolean z17 = false;
        this.f86060c = N2 != null ? N2.hashCode() : 0;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = o6Var.u0().L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        if (halfScreenConfig.c()) {
            if (halfScreenConfig.D == k91.x2.f305817e) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = null;
        if (z17 && (hcVar = o6Var.f74796e) != null && hcVar.n(o6Var)) {
            o6Var2 = (com.tencent.mm.plugin.appbrand.o6) hcVar.i(o6Var);
        }
        if (o6Var2 == null || (x07 = o6Var2.x0()) == null || (pageView = x07.getPageView()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "addOnDestroyListener for page view[" + pageView.hashCode() + ']');
        pageView.K(this.f86062e);
        pageView.w(this.f86062e);
    }
}

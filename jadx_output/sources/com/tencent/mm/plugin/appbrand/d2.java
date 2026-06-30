package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f77558d;

    public d2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f77558d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f77558d;
        appBrandRuntime.f74809r = appBrandRuntime.Z();
        this.f77558d.f74809r.setOnReadyListener(new com.tencent.mm.plugin.appbrand.d2$$a(this));
        this.f77558d.f74809r.setPageDidPushInCallback(new com.tencent.mm.plugin.appbrand.d2$$b(this));
        com.tencent.mm.plugin.appbrand.ef efVar = com.tencent.mm.plugin.appbrand.ef.AppBrandPageContainer;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f77558d;
        efVar.a(appBrandRuntime2, appBrandRuntime2.f74809r);
        this.f77558d.f74809r.u(this.f77558d.f74805p.f77283i);
        if (this.f77558d.f74797f.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.z5 z5Var = (com.tencent.mm.plugin.appbrand.z5) this.f77558d.f74797f.getLast();
        com.tencent.mm.plugin.appbrand.page.i3 pageContainer = this.f77558d.f74809r;
        z5Var.getClass();
        kotlin.jvm.internal.o.g(pageContainer, "pageContainer");
        z5Var.f92445b = pageContainer;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", z5Var + " setPageContainer");
    }
}

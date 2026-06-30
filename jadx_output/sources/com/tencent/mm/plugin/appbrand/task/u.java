package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class u implements com.tencent.mm.plugin.appbrand.ca {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f89197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f89198b;

    public u(com.tencent.mm.plugin.appbrand.task.y yVar, long j17, java.lang.Runnable runnable) {
        this.f89197a = j17;
        this.f89198b = runnable;
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "XWebPreloader onPreloadFailed, trigger preloadAppBrandRuntime");
        com.tencent.mm.sdk.platformtools.u3.h(this.f89198b);
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void d() {
        com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.n(true, null, this.f89197a, com.tencent.mm.plugin.appbrand.report.l1.a(null));
        com.tencent.mm.sdk.platformtools.u3.h(this.f89198b);
    }
}

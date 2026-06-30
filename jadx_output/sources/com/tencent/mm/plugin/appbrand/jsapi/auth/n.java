package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class n implements com.tencent.mm.plugin.appbrand.jsapi.auth.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.n0 f79641d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.ff f79642e;

    /* renamed from: f, reason: collision with root package name */
    public final long f79643f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.auth.a f79644g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f79645h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f79646i;

    public n(com.tencent.mm.plugin.appbrand.jsapi.auth.n0 api, com.tencent.mm.plugin.appbrand.jsapi.ff invokeContext, long j17) {
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        this.f79641d = api;
        this.f79642e = invokeContext;
        this.f79643f = j17;
        if (j17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthWithTimeoutListener", "start timeout timer:" + j17 + " ms");
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.appbrand.jsapi.auth.m(this), false);
            b4Var.c(j17, j17);
            this.f79646i = b4Var;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.o
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAuthResult queueListener null:");
        sb6.append(this.f79644g == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthWithTimeoutListener", sb6.toString());
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f79646i;
        if (b4Var != null) {
            b4Var.d();
            this.f79646i = null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.a aVar = this.f79644g;
        if (aVar != null) {
            aVar.a();
        }
    }
}

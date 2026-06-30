package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f75803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f75804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.m6 f75805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.plugin.appbrand.service.m6 m6Var) {
        super(1);
        this.f75802d = str;
        this.f75803e = i17;
        this.f75804f = o6Var;
        this.f75805g = m6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.p6 response = (com.tencent.mm.plugin.appbrand.launching.p6) obj;
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
        com.tencent.mm.plugin.appbrand.appcache.IPkgInfo iPkgInfo = response.f84892a;
        com.tencent.mm.plugin.appbrand.appcache.n9 L = Di.L(this.f75802d, iPkgInfo.pkgVersion(), this.f75803e, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgDownloaderExportServiceImpl", "startDownloadPkg, onSuccess, request:" + this.f75804f + ", respsonse:" + response);
        com.tencent.mm.plugin.appbrand.service.m6 m6Var = this.f75805g;
        if (m6Var != null) {
            kotlin.jvm.internal.o.d(L);
            java.lang.String pkgPath = iPkgInfo.pkgPath();
            kotlin.jvm.internal.o.d(pkgPath);
            m6Var.a(L, pkgPath);
        }
        return jz5.f0.f302826a;
    }
}

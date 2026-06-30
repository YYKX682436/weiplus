package com.tencent.mm.plugin.appbrand.appcache.predownload.export;

/* loaded from: classes7.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.o6 f75810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.l6 f75811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.appbrand.launching.o6 o6Var, com.tencent.mm.plugin.appbrand.service.l6 l6Var) {
        super(2);
        this.f75810d = o6Var;
        this.f75811e = l6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.launching.a6 err = (com.tencent.mm.plugin.appbrand.launching.a6) obj;
        java.lang.String str = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(err, "err");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDownloadPkg, onError, request:");
        sb6.append(this.f75810d);
        sb6.append(", errCode:");
        int i17 = err.f84497d;
        sb6.append(i17);
        sb6.append(", errMsg:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgDownloaderExportServiceImpl", sb6.toString());
        com.tencent.mm.plugin.appbrand.service.l6 l6Var = this.f75811e;
        if (l6Var != null) {
            l6Var.a(i17, str);
        }
        return jz5.f0.f302826a;
    }
}

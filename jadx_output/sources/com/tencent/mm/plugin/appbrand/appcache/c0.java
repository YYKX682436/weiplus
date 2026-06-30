package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class c0 implements org.chromium.net.apihelpers.CronetRequestCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f75461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.a9 f75463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m81.b f75465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.model.v[] f75466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f75467g;

    public c0(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.a9 a9Var, java.lang.String str2, m81.b bVar, com.tencent.mm.pluginsdk.res.downloader.model.v[] vVarArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f75461a = r6Var;
        this.f75462b = str;
        this.f75463c = a9Var;
        this.f75464d = str2;
        this.f75465e = bVar;
        this.f75466f = vVarArr;
        this.f75467g = countDownLatch;
    }

    public final void a(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.Exception exc) {
        com.tencent.mm.pluginsdk.res.downloader.model.v vVar = new com.tencent.mm.pluginsdk.res.downloader.model.v(this.f75463c, exc, urlResponseInfo != null ? urlResponseInfo.getHttpStatusCode() : 0, 3);
        vVar.f189732j.putBoolean("RESPONSE_KEY_USE_CHROMIUM_CRONET", true);
        this.f75466f[0] = vVar;
        this.f75467g.countDown();
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onCanceled(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        com.tencent.mm.pluginsdk.res.downloader.model.v vVar = new com.tencent.mm.pluginsdk.res.downloader.model.v(this.f75463c, (java.lang.Exception) null, 0, 4);
        vVar.f189732j.putBoolean("RESPONSE_KEY_USE_CHROMIUM_CRONET", true);
        this.f75466f[0] = vVar;
        this.f75467g.countDown();
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onFailed(org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        a(urlResponseInfo, cronetException);
        this.f75461a.l();
    }

    @Override // org.chromium.net.apihelpers.CronetRequestCompletionListener
    public void onSucceeded(org.chromium.net.UrlResponseInfo info, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(info, "info");
        boolean z17 = info.getHttpStatusCode() == 200 || info.getHttpStatusCode() == 206;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChromiumCronetPerformer", "onCronetTaskCompleted, succeed:%b, statusCode:%d, urlKey:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(info.getHttpStatusCode()), this.f75462b);
        if (!z17) {
            a(info, null);
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.a9 a9Var = this.f75463c;
        a9Var.getClass();
        com.tencent.mm.pluginsdk.res.downloader.model.v vVar = new com.tencent.mm.pluginsdk.res.downloader.model.v("AppBrandWxaPkgDownloader", a9Var.f(), a9Var.f75435i, a9Var.e(), -1L, null, 2, null);
        m81.b bVar = this.f75465e;
        java.lang.String str = bVar.f189714c;
        java.lang.String str2 = this.f75464d;
        if (!u46.l.c(str2, str)) {
            com.tencent.mm.vfs.w6.w(str2, bVar.f189714c);
        }
        info.getNegotiatedProtocol();
        bm5.f1.a();
        this.f75466f[0] = vVar;
        android.os.Bundle bundle = vVar.f189732j;
        bundle.putInt("RESPONSE_KEY_DNS_TYPE", 0);
        bundle.putBoolean("RESPONSE_KEY_USE_CHROMIUM_CRONET", true);
        if (kotlin.jvm.internal.o.b(info.getNegotiatedProtocol(), "h2")) {
            bundle.putBoolean("RESPONSE_KEY_USE_HTTP2", true);
        } else if (kotlin.jvm.internal.o.b(info.getNegotiatedProtocol(), "h3")) {
            bundle.putBoolean("RESPONSE_KEY_USE_HTTP3", true);
        }
        this.f75467g.countDown();
    }
}

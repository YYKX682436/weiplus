package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class i7 extends com.tencent.mm.plugin.appbrand.xf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.a9 f75592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m81.b f75594c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.res.downloader.model.v[] f75595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f75596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f75597f;

    public i7(com.tencent.mm.plugin.appbrand.appcache.a9 a9Var, java.lang.String str, m81.b bVar, com.tencent.mm.pluginsdk.res.downloader.model.v[] vVarArr, java.util.concurrent.CountDownLatch countDownLatch, com.tencent.mm.vfs.r6 r6Var) {
        this.f75592a = a9Var;
        this.f75593b = str;
        this.f75594c = bVar;
        this.f75595d = vVarArr;
        this.f75596e = countDownLatch;
        this.f75597f = r6Var;
    }

    public final void a(long j17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.appcache.a9 a9Var = this.f75592a;
        com.tencent.mars.xlog.Log.e("MicroMsg.WeAppCoreDownloadPerformer", "notifyFail for urlKey:%s, errCode:%d, errMsg:%s", a9Var.f(), java.lang.Long.valueOf(j17), str);
        com.tencent.mm.pluginsdk.res.downloader.model.v vVar = new com.tencent.mm.pluginsdk.res.downloader.model.v(a9Var, (java.lang.Exception) null, 0, 3);
        vVar.f189732j.putBoolean("RESPONSE_KEY_USE_WEAPP_CORE", true);
        this.f75595d[0] = vVar;
        this.f75596e.countDown();
    }
}

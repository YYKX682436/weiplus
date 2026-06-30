package ws1;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f530519a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final xs1.a f530520b = ws1.f.f530528a;

    public static final void a(xs1.d downloadRequest, xs1.b downloadListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadRequest, "downloadRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadListener, "downloadListener");
        ((ku5.t0) ku5.t0.f394148d).h(new ws1.a(downloadRequest, downloadListener, java.lang.System.currentTimeMillis()), "MicroMsg.WebPrefetcherHttpDownloadManager");
    }

    public static final void b(long j17, xs1.d dVar, xs1.b bVar, boolean z17) {
        ws1.c cVar = new ws1.c(bVar, dVar, z17, j17);
        java.lang.String str = dVar.f537829a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f530520b, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.webprefetcher.downloader.base.IWebPrefetcherHttpDownloader<T of com.tencent.mm.plugin.brandservice.webprefetcher.downloader.WebPrefetcherHttpDownloadManager.downloadUrlInner>");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = dVar.f537829a;
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(dVar.f537830b.u(), true);
        java.lang.String str3 = i17 + ".fd";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherHttpDownloader", "downloadUrl session: %s, url: %s, savedPath: %s, downloadRequest: %s", java.lang.Long.valueOf(currentTimeMillis), dVar.f537829a, i17, dVar);
        hw4.d.a(str2, str3, new ws1.e(dVar, cVar, str3, currentTimeMillis, i17, str2));
    }
}

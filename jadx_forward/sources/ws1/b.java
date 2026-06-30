package ws1;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs1.d f530509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f530510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xs1.e f530511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f530512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xs1.b f530513h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f530514i;

    public b(xs1.d dVar, boolean z17, xs1.e eVar, long j17, xs1.b bVar, java.lang.Object obj) {
        this.f530509d = dVar;
        this.f530510e = z17;
        this.f530511f = eVar;
        this.f530512g = j17;
        this.f530513h = bVar;
        this.f530514i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xs1.d dVar = this.f530509d;
        boolean z17 = dVar.f537831c;
        xs1.e eVar = this.f530511f;
        long j17 = this.f530512g;
        if (z17 && !this.f530510e && !eVar.f537834a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrlInner failed and retry, session: %d, url: %s", java.lang.Long.valueOf(j17), dVar.f537829a);
            ws1.d.b(j17, dVar, this.f530513h, true);
            return;
        }
        java.util.ArrayList<xs1.b> arrayList = (java.util.ArrayList) ws1.d.f530519a.remove(dVar.f537829a);
        if (arrayList != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherHttpDownloadManager", "downloadUrl onCompleted session: %s, url: %s, callbackList size: %s", java.lang.Long.valueOf(j17), dVar.f537829a, java.lang.Integer.valueOf(arrayList.size()));
            for (xs1.b bVar : arrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.webprefetcher.downloader.base.WebPrefetcherHttpDownloadListener<T of com.tencent.mm.plugin.brandservice.webprefetcher.downloader.WebPrefetcherHttpDownloadManager.downloadUrlInner.<no name provided>.onCompleted.<no name provided>.run$lambda$1>");
                bVar.b(this.f530514i, eVar);
            }
        }
    }
}

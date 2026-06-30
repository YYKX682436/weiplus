package ws1;

/* loaded from: classes7.dex */
public final class c implements xs1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xs1.b f530515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xs1.d f530516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f530517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f530518d;

    public c(xs1.b bVar, xs1.d dVar, boolean z17, long j17) {
        this.f530515a = bVar;
        this.f530516b = dVar;
        this.f530517c = z17;
        this.f530518d = j17;
    }

    @Override // xs1.b
    public boolean a(java.lang.Object obj, int i17, java.util.HashMap headers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        return this.f530515a.a(obj, i17, headers);
    }

    @Override // xs1.b
    public void b(java.lang.Object obj, xs1.e downloadResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadResult, "downloadResult");
        ((ku5.t0) ku5.t0.f394148d).h(new ws1.b(this.f530516b, this.f530517c, downloadResult, this.f530518d, this.f530515a, obj), "MicroMsg.WebPrefetcherHttpDownloadManager");
    }

    @Override // xs1.b
    public void c(java.lang.Object obj) {
        this.f530515a.c(obj);
    }
}

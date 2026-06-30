package xd4;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public fk4.u f535240a;

    /* renamed from: b, reason: collision with root package name */
    public final xd4.p0 f535241b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f535242c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f535243d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f535244e;

    public t0(fk4.u downloader, xd4.p0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloader, "downloader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f535240a = downloader;
        this.f535241b = callback;
        this.f535242c = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f535244e = ((fk4.k) this.f535240a).f345166u;
    }

    public static final /* synthetic */ xd4.p0 a(xd4.t0 t0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCallback$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        xd4.p0 p0Var = t0Var.f535241b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCallback$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        return p0Var;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("waitForComplete", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "waitForComplete");
        p3325xe03a0797.p3326xc267989b.l.d(this.f535242c, null, null, new xd4.r0(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("waitForComplete", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
    }
}

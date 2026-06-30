package dk2;

/* loaded from: classes.dex */
public final class aa implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f314728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f314729b;

    public aa(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f314728a = c0Var;
        this.f314729b = countDownLatch;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "saveVideoToAlbum success: " + srcPath + " -> " + destPath);
        this.f314728a.f391645d = true;
        this.f314729b.countDown();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayDownloadManager", "saveVideoToAlbum failed: ".concat(srcPath));
        this.f314728a.f391645d = false;
        this.f314729b.countDown();
    }
}

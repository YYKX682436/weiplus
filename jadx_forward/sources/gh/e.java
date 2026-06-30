package gh;

/* loaded from: classes7.dex */
public final class e implements android.view.Choreographer.FrameCallback, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f353347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gh.g f353348e;

    public e(gh.g gVar) {
        this.f353348e = gVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        this.f353347d = j17;
        gh.g gVar = this.f353348e;
        gVar.f353352i.getClass();
        gVar.f353335e.k(gVar.f353355o, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        gh.g gVar = this.f353348e;
        if (gVar.f353337g) {
            synchronized (gVar.f353336f) {
                android.view.Choreographer choreographer = gVar.f353354n;
                if (choreographer != null) {
                    choreographer.postFrameCallback(gVar.f353355o);
                }
            }
            this.f353348e.c(this.f353347d / 1000000.0d);
        }
    }
}

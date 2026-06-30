package q41;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f441564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f441565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f441566g;

    public b(java.lang.String str, int i17, int i18, long j17) {
        this.f441563d = str;
        this.f441564e = i17;
        this.f441565f = i18;
        this.f441566g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(this.f441563d);
        if (Di == null) {
            return;
        }
        q41.f.b((k41.g0) Di, this.f441564e, this.f441565f, this.f441566g);
    }
}

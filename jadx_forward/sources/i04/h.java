package i04;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i04.f f368077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f368079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f368080g;

    public h(i04.f fVar, java.lang.String str, long j17, long j18) {
        this.f368077d = fVar;
        this.f368078e = str;
        this.f368079f = j17;
        this.f368080g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f368077d.f368073c.a(this.f368078e, this.f368079f, this.f368080g);
    }
}

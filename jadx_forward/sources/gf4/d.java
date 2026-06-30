package gf4;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f352877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352879f;

    public d(long j17, int i17, java.lang.String str) {
        this.f352877d = j17;
        this.f352878e = i17;
        this.f352879f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gf4.l.f352887d.f(this.f352877d, this.f352878e, this.f352879f);
    }
}

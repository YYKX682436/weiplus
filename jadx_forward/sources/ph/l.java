package ph;

/* loaded from: classes12.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f435800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f435801e;

    public l(ph.t tVar, long j17) {
        this.f435800d = tVar;
        this.f435801e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f435800d.d(this.f435801e);
    }
}

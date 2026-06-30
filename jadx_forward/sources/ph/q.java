package ph;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f435809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435810e;

    public q(ph.t tVar, int i17) {
        this.f435809d = tVar;
        this.f435810e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f435809d.i(this.f435810e);
    }
}

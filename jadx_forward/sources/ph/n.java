package ph;

/* loaded from: classes12.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.t f435804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435805e;

    public n(ph.t tVar, boolean z17) {
        this.f435804d = tVar;
        this.f435805e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f435804d.e(this.f435805e);
    }
}

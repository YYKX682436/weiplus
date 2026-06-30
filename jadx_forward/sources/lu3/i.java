package lu3;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu3.m f402938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu3.a f402939e;

    public i(lu3.m mVar, lu3.a aVar) {
        this.f402938d = mVar;
        this.f402939e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f402938d.e(true, this.f402939e);
    }
}

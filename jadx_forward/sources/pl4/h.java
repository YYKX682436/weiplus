package pl4;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl4.k f438244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438245e;

    public h(pl4.k kVar, boolean z17) {
        this.f438244d = kVar;
        this.f438245e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f438244d.f(this.f438245e, false);
    }
}

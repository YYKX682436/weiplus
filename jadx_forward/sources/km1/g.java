package km1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f390531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f390532e;

    public g(km1.s sVar, boolean z17) {
        this.f390531d = sVar;
        this.f390532e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f390531d.f390561e.o(this.f390532e);
        km1.s sVar = this.f390531d;
        sVar.f390561e.mo176947x42c875eb(this.f390532e ? null : sVar.f390567n);
    }
}

package kr3;

/* loaded from: classes4.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f392948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr3.a f392949e;

    public n(boolean z17, lr3.a aVar) {
        this.f392948d = z17;
        this.f392949e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f392948d) {
            this.f392949e.b();
        }
    }
}

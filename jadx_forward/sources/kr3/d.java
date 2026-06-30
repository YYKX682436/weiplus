package kr3;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f392881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr3.a f392882e;

    public d(boolean z17, lr3.a aVar) {
        this.f392881d = z17;
        this.f392882e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f392881d) {
            this.f392882e.b();
        }
    }
}

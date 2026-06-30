package l5;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final l5.k f398058d;

    /* renamed from: e, reason: collision with root package name */
    public final wa.a f398059e;

    public h(l5.k kVar, wa.a aVar) {
        this.f398058d = kVar;
        this.f398059e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f398058d.f398067d != this) {
            return;
        }
        if (l5.k.f398065i.b(this.f398058d, this, l5.k.e(this.f398059e))) {
            l5.k.b(this.f398058d);
        }
    }
}

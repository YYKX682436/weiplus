package ak3;

/* loaded from: classes8.dex */
public final class g implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f87110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ak3.i f87111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ak3.b f87112c;

    public g(java.util.concurrent.atomic.AtomicInteger atomicInteger, ak3.i iVar, ak3.b bVar) {
        this.f87110a = atomicInteger;
        this.f87111b = iVar;
        this.f87112c = bVar;
    }

    @Override // db5.d
    /* renamed from: onComplete */
    public final void mo2162x815f5438(boolean z17) {
        ak3.b bVar = this.f87112c;
        if (!z17 && this.f87110a.getAndIncrement() < 1) {
            db5.f.c(this.f87111b.mo2157x19263085(), new ak3.f(bVar));
        } else if (bVar != null) {
            bVar.mo2156x815f5438(z17);
        }
    }
}

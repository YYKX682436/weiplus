package ak3;

/* loaded from: classes8.dex */
public final class g implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f5577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ak3.i f5578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ak3.b f5579c;

    public g(java.util.concurrent.atomic.AtomicInteger atomicInteger, ak3.i iVar, ak3.b bVar) {
        this.f5577a = atomicInteger;
        this.f5578b = iVar;
        this.f5579c = bVar;
    }

    @Override // db5.d
    public final void onComplete(boolean z17) {
        ak3.b bVar = this.f5579c;
        if (!z17 && this.f5577a.getAndIncrement() < 1) {
            db5.f.c(this.f5578b.getActivity(), new ak3.f(bVar));
        } else if (bVar != null) {
            bVar.onComplete(z17);
        }
    }
}

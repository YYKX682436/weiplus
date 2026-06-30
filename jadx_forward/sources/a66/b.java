package a66;

/* loaded from: classes16.dex */
public final class b implements p56.s {

    /* renamed from: e, reason: collision with root package name */
    public static final r56.a f83327e = new a66.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f83328d;

    public b() {
        this.f83328d = new java.util.concurrent.atomic.AtomicReference();
    }

    @Override // p56.s
    public boolean b() {
        return this.f83328d.get() == f83327e;
    }

    @Override // p56.s
    public void c() {
        r56.a aVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f83328d;
        r56.a aVar2 = (r56.a) atomicReference.get();
        r56.a aVar3 = f83327e;
        if (aVar2 == aVar3 || (aVar = (r56.a) atomicReference.getAndSet(aVar3)) == null || aVar == aVar3) {
            return;
        }
        aVar.mo740x2e7a5e();
    }

    public b(r56.a aVar) {
        this.f83328d = new java.util.concurrent.atomic.AtomicReference(aVar);
    }
}

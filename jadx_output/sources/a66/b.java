package a66;

/* loaded from: classes16.dex */
public final class b implements p56.s {

    /* renamed from: e, reason: collision with root package name */
    public static final r56.a f1794e = new a66.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f1795d;

    public b() {
        this.f1795d = new java.util.concurrent.atomic.AtomicReference();
    }

    @Override // p56.s
    public boolean b() {
        return this.f1795d.get() == f1794e;
    }

    @Override // p56.s
    public void c() {
        r56.a aVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f1795d;
        r56.a aVar2 = (r56.a) atomicReference.get();
        r56.a aVar3 = f1794e;
        if (aVar2 == aVar3 || (aVar = (r56.a) atomicReference.getAndSet(aVar3)) == null || aVar == aVar3) {
            return;
        }
        aVar.call();
    }

    public b(r56.a aVar) {
        this.f1795d = new java.util.concurrent.atomic.AtomicReference(aVar);
    }
}

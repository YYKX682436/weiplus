package a66;

/* loaded from: classes16.dex */
public final class e implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f83333d = new java.util.concurrent.atomic.AtomicReference(new a66.d(false, new a66.b()));

    public void a(p56.s sVar) {
        boolean z17;
        if (sVar == null) {
            throw new java.lang.IllegalArgumentException("Subscription can not be null");
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f83333d;
        do {
            a66.d dVar = (a66.d) atomicReference.get();
            boolean z18 = dVar.f83331a;
            if (z18) {
                sVar.c();
                return;
            }
            a66.d dVar2 = new a66.d(z18, sVar);
            while (true) {
                if (atomicReference.compareAndSet(dVar, dVar2)) {
                    z17 = true;
                    break;
                } else if (atomicReference.get() != dVar) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
    }

    @Override // p56.s
    public boolean b() {
        return ((a66.d) this.f83333d.get()).f83331a;
    }

    @Override // p56.s
    public void c() {
        boolean z17;
        p56.s sVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f83333d;
        do {
            a66.d dVar = (a66.d) atomicReference.get();
            if (!dVar.f83331a) {
                z17 = true;
                sVar = dVar.f83332b;
                a66.d dVar2 = new a66.d(true, sVar);
                while (true) {
                    if (atomicReference.compareAndSet(dVar, dVar2)) {
                        break;
                    } else if (atomicReference.get() != dVar) {
                        z17 = false;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z17);
        sVar.c();
    }
}

package t2;

/* loaded from: classes14.dex */
public final class g extends t2.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f496170a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f496171b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f496172c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f496173d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f496174e;

    public g(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f496170a = atomicReferenceFieldUpdater;
        this.f496171b = atomicReferenceFieldUpdater2;
        this.f496172c = atomicReferenceFieldUpdater3;
        this.f496173d = atomicReferenceFieldUpdater4;
        this.f496174e = atomicReferenceFieldUpdater5;
    }

    @Override // t2.b
    public boolean a(t2.j jVar, t2.f fVar, t2.f fVar2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f496173d;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == fVar);
        return false;
    }

    @Override // t2.b
    public boolean b(t2.j jVar, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f496174e;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == obj);
        return false;
    }

    @Override // t2.b
    public boolean c(t2.j jVar, t2.i iVar, t2.i iVar2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f496172c;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, iVar, iVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == iVar);
        return false;
    }

    @Override // t2.b
    public void d(t2.i iVar, t2.i iVar2) {
        this.f496171b.lazySet(iVar, iVar2);
    }

    @Override // t2.b
    public void e(t2.i iVar, java.lang.Thread thread) {
        this.f496170a.lazySet(iVar, thread);
    }
}

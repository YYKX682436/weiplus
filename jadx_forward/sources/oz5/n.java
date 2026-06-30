package oz5;

/* loaded from: classes14.dex */
public final class n implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57, qz5.e {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f431863e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(oz5.n.class, java.lang.Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f431864d;

    /* renamed from: result */
    private volatile java.lang.Object f76384xc84dc81d;

    public n(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 delegate, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f431864d = delegate;
        this.f76384xc84dc81d = obj;
    }

    public final java.lang.Object a() {
        boolean z17;
        java.lang.Object obj = this.f76384xc84dc81d;
        pz5.a aVar = pz5.a.f440720e;
        if (obj == aVar) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f431863e;
            pz5.a aVar2 = pz5.a.f440719d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                return pz5.a.f440719d;
            }
            obj = this.f76384xc84dc81d;
        }
        if (obj == pz5.a.f440721f) {
            return pz5.a.f440719d;
        }
        if (obj instanceof p3321xbce91901.C29043x91b2b43d.Failure) {
            throw ((p3321xbce91901.C29043x91b2b43d.Failure) obj).exception;
        }
        return obj;
    }

    @Override // qz5.e
    /* renamed from: getCallerFrame */
    public qz5.e mo144028x366976c() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f431864d;
        if (interfaceC29045xdcb5ca57 instanceof qz5.e) {
            return (qz5.e) interfaceC29045xdcb5ca57;
        }
        return null;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return this.f431864d.mo48699x76847179();
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.f76384xc84dc81d;
            pz5.a aVar = pz5.a.f440720e;
            boolean z17 = false;
            if (obj2 == aVar) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f431863e;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                if (z17) {
                    return;
                }
            } else {
                pz5.a aVar2 = pz5.a.f440719d;
                if (obj2 != aVar2) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f431863e;
                pz5.a aVar3 = pz5.a.f440721f;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                        z17 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                        break;
                    }
                }
                if (z17) {
                    this.f431864d.mo48700xdecd0e93(obj);
                    return;
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m157516x9616526c() {
        return "SafeContinuation for " + this.f431864d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 delegate) {
        this(delegate, pz5.a.f440720e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
    }
}

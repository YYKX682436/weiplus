package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public final class q extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t f392049a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t f392050b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o f392051c;

    public q(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o oVar) {
        this.f392049a = tVar;
        this.f392050b = tVar2;
        this.f392051c = oVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d a() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d dVar = this.f392051c.f392016a;
        if (dVar != null) {
            return dVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("atomicOp");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.coroutines.internal.t] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.internal.f0] */
    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
    public java.lang.Object c(java.lang.Object obj) {
        boolean z17;
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) obj;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o oVar = this.f392051c;
        java.lang.Object f17 = oVar.f(this);
        java.lang.Object obj2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.u.f392061a;
        ?? r47 = this.f392050b;
        if (f17 != obj2) {
            java.lang.Object e17 = f17 != null ? a().e(f17) : a().f();
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d dVar = r47;
            if (e17 == p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392018a) {
                dVar = a();
            } else if (e17 == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
                dVar = r47.s();
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
            while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, this, dVar) && atomicReferenceFieldUpdater2.get(tVar) == this) {
            }
            return null;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0 s17 = r47.s();
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
        while (true) {
            if (atomicReferenceFieldUpdater4.compareAndSet(tVar, this, s17)) {
                z17 = true;
                break;
            }
            if (atomicReferenceFieldUpdater4.get(tVar) != this) {
                z17 = false;
                break;
            }
        }
        if (z17) {
            oVar.g(tVar);
            r47.j(null);
        }
        return obj2;
    }

    public final void d() {
        this.f392051c.c(this);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
    /* renamed from: toString */
    public java.lang.String mo144044x9616526c() {
        return "PrepareOp(op=" + a() + ')';
    }
}

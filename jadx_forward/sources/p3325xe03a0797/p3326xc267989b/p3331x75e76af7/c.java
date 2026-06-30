package p3325xe03a0797.p3326xc267989b.p3331x75e76af7;

/* loaded from: classes14.dex */
public final class c extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q f392164a;

    public c(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        this.f392164a = qVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d a() {
        return this.f392164a.a();
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
    public java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) obj;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar = this.f392164a;
        qVar.d();
        java.lang.Object e17 = qVar.a().e(null);
        java.lang.Object obj2 = e17 == null ? qVar.f392051c : p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392171a;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f.f392168h;
        while (!atomicReferenceFieldUpdater.compareAndSet(fVar, this, obj2) && atomicReferenceFieldUpdater.get(fVar) == this) {
        }
        return e17;
    }
}

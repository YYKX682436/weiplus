package p3325xe03a0797.p3326xc267989b.p3332x361a9b;

/* loaded from: classes14.dex */
public final class i extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d {

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.h f392186b;

    public i(p3325xe03a0797.p3326xc267989b.p3332x361a9b.h hVar) {
        this.f392186b = hVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d
    public void d(java.lang.Object obj, java.lang.Object obj2) {
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj;
        java.lang.Object obj3 = obj2 == null ? p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392194e : this.f392186b;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.p3332x361a9b.k.f392189a;
        while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, obj3) && atomicReferenceFieldUpdater.get(kVar) == this) {
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d
    public java.lang.Object i(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.h hVar = this.f392186b;
        if (hVar.l() == hVar) {
            return null;
        }
        return p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.f392190a;
    }
}

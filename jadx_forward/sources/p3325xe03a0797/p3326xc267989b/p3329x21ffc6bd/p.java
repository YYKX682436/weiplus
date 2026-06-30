package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class p extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d {

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t f392046b;

    /* renamed from: c, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t f392047c;

    public p(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar) {
        this.f392046b = tVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d
    public void d(java.lang.Object obj, java.lang.Object obj2) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) obj;
        boolean z17 = true;
        boolean z18 = obj2 == null;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar2 = this.f392046b;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar3 = z18 ? tVar2 : this.f392047c;
        if (tVar3 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(tVar, this, tVar3)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(tVar) != this) {
                    z17 = false;
                    break;
                }
            }
            if (z17 && z18) {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar4 = this.f392047c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar4);
                tVar2.k(tVar4);
            }
        }
    }
}

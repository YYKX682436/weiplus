package p3325xe03a0797.p3326xc267989b.p3331x75e76af7;

/* loaded from: classes14.dex */
public final class a extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d {

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f f392160b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b f392161c;

    /* renamed from: d, reason: collision with root package name */
    public final long f392162d;

    public a(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b bVar) {
        this.f392160b = fVar;
        this.f392161c = bVar;
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.j jVar = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392175e;
        jVar.getClass();
        this.f392162d = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.j.f392176a.incrementAndGet(jVar);
        bVar.f392016a = this;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d
    public void d(java.lang.Object obj, java.lang.Object obj2) {
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar;
        boolean z17;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t e17;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar;
        boolean z18 = false;
        boolean z19 = obj2 == null;
        java.lang.Object obj3 = z19 ? null : p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392171a;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f.f392168h;
        while (true) {
            fVar = this.f392160b;
            if (atomicReferenceFieldUpdater.compareAndSet(fVar, this, obj3)) {
                z17 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(fVar) != this) {
                z17 = false;
                break;
            }
        }
        if (z17 && z19) {
            fVar.w();
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o oVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o) this.f392161c;
        oVar.getClass();
        boolean z27 = obj2 == null;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t d17 = oVar.d();
        if (d17 == null || (e17 = oVar.e()) == null) {
            return;
        }
        if (z27) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
            tVar = e17.s();
        } else {
            tVar = e17;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
        while (true) {
            if (atomicReferenceFieldUpdater3.compareAndSet(d17, this, tVar)) {
                z18 = true;
                break;
            } else if (atomicReferenceFieldUpdater3.get(d17) != this) {
                break;
            }
        }
        if (z18 && z27) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t.f392058d;
            e17.j(null);
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d
    public long g() {
        return this.f392162d;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d
    public java.lang.Object i(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar;
        java.lang.Object obj2;
        boolean z17;
        if (obj == null) {
            p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar2 = this.f392160b;
            while (true) {
                java.lang.Object obj3 = fVar2.f72745xa8a72792;
                obj2 = null;
                if (obj3 == this) {
                    break;
                }
                if (!(obj3 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0)) {
                    java.lang.Object obj4 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392171a;
                    if (obj3 != obj4) {
                        obj2 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392172b;
                        break;
                    }
                    p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar3 = this.f392160b;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f.f392168h;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(fVar3, obj4, this)) {
                            z17 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(fVar3) != obj4) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17) {
                        break;
                    }
                } else {
                    ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0) obj3).c(this.f392160b);
                }
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        try {
            return this.f392161c.a(this);
        } catch (java.lang.Throwable th6) {
            if (obj == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f.f392168h;
                java.lang.Object obj5 = p3325xe03a0797.p3326xc267989b.p3331x75e76af7.i.f392171a;
                do {
                    fVar = this.f392160b;
                    if (atomicReferenceFieldUpdater2.compareAndSet(fVar, this, obj5)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater2.get(fVar) == this);
            }
            throw th6;
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
    /* renamed from: toString */
    public java.lang.String mo144044x9616526c() {
        return "AtomicSelectOp(sequence=" + this.f392162d + ')';
    }
}

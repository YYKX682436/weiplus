package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class d extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392023a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d.class, java.lang.Object.class, "_consensus");

    /* renamed from: _consensus */
    private volatile /* synthetic */ java.lang.Object f72711x8d4826f8 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392018a;

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.d a() {
        return this;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.e0
    public final java.lang.Object c(java.lang.Object obj) {
        java.lang.Object obj2 = this.f72711x8d4826f8;
        if (obj2 == p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392018a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(java.lang.Object obj, java.lang.Object obj2);

    public final java.lang.Object e(java.lang.Object obj) {
        boolean z17;
        java.lang.Object obj2 = this.f72711x8d4826f8;
        java.lang.Object obj3 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392018a;
        if (obj2 != obj3) {
            return obj2;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392023a;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj)) {
                z17 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                z17 = false;
                break;
            }
        }
        return z17 ? obj : this.f72711x8d4826f8;
    }

    public final java.lang.Object f() {
        return this.f72711x8d4826f8;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this.f72711x8d4826f8 != p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c.f392018a;
    }

    public abstract java.lang.Object i(java.lang.Object obj);
}

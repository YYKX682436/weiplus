package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public class r extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392053c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r.class, java.lang.Object.class, "_affectedNode");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392054d = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r.class, java.lang.Object.class, "_originalNext");

    /* renamed from: _affectedNode */
    private volatile /* synthetic */ java.lang.Object f72717x6ab82475 = null;

    /* renamed from: _originalNext */
    private volatile /* synthetic */ java.lang.Object f72718x20ba243 = null;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t f392055b;

    public r(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar) {
        this.f392055b = tVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o
    public java.lang.Object b(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar) {
        if (tVar == this.f392055b) {
            return p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.n.f392043b;
        }
        return null;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o
    public void c(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = qVar.f392049a;
        do {
            atomicReferenceFieldUpdater = f392053c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        do {
            atomicReferenceFieldUpdater2 = f392054d;
            if (atomicReferenceFieldUpdater2.compareAndSet(this, null, qVar.f392050b)) {
                return;
            }
        } while (atomicReferenceFieldUpdater2.get(this) == null);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t d() {
        return (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) this.f72717x6ab82475;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.o
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t e() {
        return (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) this.f72718x20ba243;
    }

    public final java.lang.Object h() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t) this.f72717x6ab82475;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        return tVar;
    }
}

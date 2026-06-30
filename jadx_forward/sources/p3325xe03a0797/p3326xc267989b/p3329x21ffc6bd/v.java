package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392066a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.v.class, java.lang.Object.class, "_cur");

    /* renamed from: _cur */
    private volatile /* synthetic */ java.lang.Object f72723x2cb181;

    public v(boolean z17) {
        this.f72723x2cb181 = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y(8, z17);
    }

    public final boolean a(java.lang.Object obj) {
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) this.f72723x2cb181;
            int a17 = yVar.a(obj);
            if (a17 == 0) {
                return true;
            }
            if (a17 == 1) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392066a;
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y e17 = yVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, e17) && atomicReferenceFieldUpdater.get(this) == yVar) {
                }
            } else if (a17 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) this.f72723x2cb181;
            if (yVar.b()) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392066a;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y e17 = yVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, e17) && atomicReferenceFieldUpdater.get(this) == yVar) {
            }
        }
    }

    public final int c() {
        return ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) this.f72723x2cb181).c();
    }

    public final java.lang.Object d() {
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) this.f72723x2cb181;
            java.lang.Object f17 = yVar.f();
            if (f17 != p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y.f392070g) {
                return f17;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392066a;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y e17 = yVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, e17) && atomicReferenceFieldUpdater.get(this) == yVar) {
            }
        }
    }
}

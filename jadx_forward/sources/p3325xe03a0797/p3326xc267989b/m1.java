package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class m1 extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392087g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.m1.class, "_decision");

    /* renamed from: _decision */
    private volatile /* synthetic */ int f72726x271d613b;

    public m1(oz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(lVar, interfaceC29045xdcb5ca57);
        this.f72726x271d613b = 0;
    }

    public final java.lang.Object k0() {
        boolean z17;
        while (true) {
            int i17 = this.f72726x271d613b;
            z17 = false;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended".toString());
                }
            } else if (f392087g.compareAndSet(this, 0, 1)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return pz5.a.f440719d;
        }
        java.lang.Object a17 = p3325xe03a0797.p3326xc267989b.d3.a(P());
        if (a17 instanceof p3325xe03a0797.p3326xc267989b.e0) {
            throw ((p3325xe03a0797.p3326xc267989b.e0) a17).f391705a;
        }
        return a17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0, p3325xe03a0797.p3326xc267989b.c3
    public void u(java.lang.Object obj) {
        v(obj);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0, p3325xe03a0797.p3326xc267989b.c3
    public void v(java.lang.Object obj) {
        boolean z17;
        while (true) {
            int i17 = this.f72726x271d613b;
            z17 = false;
            if (i17 != 0) {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed".toString());
                }
            } else if (f392087g.compareAndSet(this, 0, 2)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i.b(pz5.f.b(this.f392030f), p3325xe03a0797.p3326xc267989b.i0.a(obj, this.f392030f), null, 2, null);
    }
}

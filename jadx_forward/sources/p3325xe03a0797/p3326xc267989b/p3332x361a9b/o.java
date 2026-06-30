package p3325xe03a0797.p3326xc267989b.p3332x361a9b;

/* loaded from: classes14.dex */
public final class o implements p3325xe03a0797.p3326xc267989b.p3332x361a9b.m {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392196c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3332x361a9b.o.class, java.lang.Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f392197d = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3332x361a9b.o.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392198e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3332x361a9b.o.class, java.lang.Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f392199f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3332x361a9b.o.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392200g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3332x361a9b.o.class, "_availablePermits");

    /* renamed from: _availablePermits */
    volatile /* synthetic */ int f72750x2c6a6b0e;

    /* renamed from: a, reason: collision with root package name */
    public final int f392201a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f392202b;

    /* renamed from: deqIdx */
    private volatile /* synthetic */ long f72751xb068608d = 0;

    /* renamed from: enqIdx */
    private volatile /* synthetic */ long f72752xb29c0cb5 = 0;

    /* renamed from: head */
    private volatile /* synthetic */ java.lang.Object f72753x30cde0;

    /* renamed from: tail */
    private volatile /* synthetic */ java.lang.Object f72754x363450;

    public o(int i17, int i18) {
        this.f392201a = i17;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i17).toString());
        }
        if (!(i18 >= 0 && i18 <= i17)) {
            throw new java.lang.IllegalArgumentException(("The number of acquired permits should be in 0.." + i17).toString());
        }
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.q qVar = new p3325xe03a0797.p3326xc267989b.p3332x361a9b.q(0L, null, 2);
        this.f72753x30cde0 = qVar;
        this.f72754x363450 = qVar;
        this.f72750x2c6a6b0e = i17 - i18;
        this.f392202b = new p3325xe03a0797.p3326xc267989b.p3332x361a9b.n(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db A[EDGE_INSN: B:66:0x00db->B:59:0x00db BREAK  A[LOOP:0: B:6:0x0015->B:65:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlinx.coroutines.internal.l0] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.internal.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r17) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3332x361a9b.o.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public int b() {
        return java.lang.Math.max(this.f72750x2c6a6b0e, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlinx.coroutines.internal.l0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlinx.coroutines.internal.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3332x361a9b.o.c():void");
    }

    public boolean d() {
        int i17;
        do {
            i17 = this.f72750x2c6a6b0e;
            if (i17 <= 0) {
                return false;
            }
        } while (!f392200g.compareAndSet(this, i17, i17 - 1));
        return true;
    }
}

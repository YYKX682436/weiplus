package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392068e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f392069f;

    /* renamed from: g, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 f392070g;

    /* renamed from: _next */
    private volatile /* synthetic */ java.lang.Object f72724x56e43d2 = null;

    /* renamed from: _state */
    private volatile /* synthetic */ long f72725xa8a72792 = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f392071a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f392072b;

    /* renamed from: c, reason: collision with root package name */
    public final int f392073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f392074d;

    static {
        new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.w(null);
        f392070g = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0("REMOVE_FROZEN");
        f392068e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y.class, java.lang.Object.class, "_next");
        f392069f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y.class, "_state");
    }

    public y(int i17, boolean z17) {
        this.f392071a = i17;
        this.f392072b = z17;
        int i18 = i17 - 1;
        this.f392073c = i18;
        this.f392074d = new java.util.concurrent.atomic.AtomicReferenceArray(i17);
        if (!(i18 <= 1073741823)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((i17 & i18) == 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r15) {
        /*
            r14 = this;
        L0:
            long r2 = r14.f72725xa8a72792
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L15
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L14
            r1 = 2
        L14:
            return r1
        L15:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.f392073c
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L30
            return r1
        L30:
            boolean r4 = r14.f392072b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.f392074d
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r2 = r14.f392071a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L0
        L4e:
            return r1
        L4f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y.f392069f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f392074d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            long r1 = r0.f72725xa8a72792
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L94
            kotlinx.coroutines.internal.y r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f392074d
            int r2 = r0.f392073c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.x
            if (r4 == 0) goto L91
            kotlinx.coroutines.internal.x r3 = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.x) r3
            int r3 = r3.f392067a
            if (r3 != r10) goto L91
            r1.set(r2, r15)
            goto L92
        L91:
            r0 = 0
        L92:
            if (r0 != 0) goto L6d
        L94:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j17;
        do {
            j17 = this.f72725xa8a72792;
            if ((j17 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j17) != 0) {
                return false;
            }
        } while (!f392069f.compareAndSet(this, j17, j17 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j17 = this.f72725xa8a72792;
        return (((int) ((j17 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j17) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j17 = this.f72725xa8a72792;
        return ((int) ((1073741823 & j17) >> 0)) == ((int) ((j17 & 1152921503533105152L) >> 30));
    }

    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y e() {
        long j17;
        while (true) {
            j17 = this.f72725xa8a72792;
            if ((j17 & 1152921504606846976L) != 0) {
                break;
            }
            long j18 = j17 | 1152921504606846976L;
            if (f392069f.compareAndSet(this, j17, j18)) {
                j17 = j18;
                break;
            }
        }
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y) this.f72724x56e43d2;
            if (yVar != null) {
                return yVar;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392068e;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar2 = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y(this.f392071a * 2, this.f392072b);
            int i17 = (int) ((1073741823 & j17) >> 0);
            int i18 = (int) ((1152921503533105152L & j17) >> 30);
            while (true) {
                int i19 = this.f392073c;
                int i27 = i17 & i19;
                if (i27 == (i19 & i18)) {
                    break;
                }
                java.lang.Object obj = this.f392074d.get(i27);
                if (obj == null) {
                    obj = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.x(i17);
                }
                yVar2.f392074d.set(yVar2.f392073c & i17, obj);
                i17++;
            }
            yVar2.f72725xa8a72792 = (-1152921504606846977L) & j17;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, yVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final java.lang.Object f() {
        while (true) {
            long j17 = this.f72725xa8a72792;
            if ((j17 & 1152921504606846976L) != 0) {
                return f392070g;
            }
            int i17 = (int) ((j17 & 1073741823) >> 0);
            int i18 = this.f392073c;
            int i19 = ((int) ((1152921503533105152L & j17) >> 30)) & i18;
            int i27 = i18 & i17;
            if (i19 == i27) {
                return null;
            }
            java.lang.Object obj = this.f392074d.get(i27);
            if (obj == null) {
                if (this.f392072b) {
                    return null;
                }
            } else {
                if (obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.x) {
                    return null;
                }
                long j18 = ((i17 + 1) & 1073741823) << 0;
                if (f392069f.compareAndSet(this, j17, (j17 & (-1073741824)) | j18)) {
                    this.f392074d.set(this.f392073c & i17, null);
                    return obj;
                }
                if (this.f392072b) {
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.y yVar = this;
                    while (true) {
                        long j19 = yVar.f72725xa8a72792;
                        int i28 = (int) ((j19 & 1073741823) >> 0);
                        if ((j19 & 1152921504606846976L) != 0) {
                            yVar = yVar.e();
                        } else {
                            if (f392069f.compareAndSet(yVar, j19, (j19 & (-1073741824)) | j18)) {
                                yVar.f392074d.set(yVar.f392073c & i28, null);
                                yVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (yVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}

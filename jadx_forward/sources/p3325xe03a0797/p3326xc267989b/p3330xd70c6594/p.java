package p3325xe03a0797.p3326xc267989b.p3330xd70c6594;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392155b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p.class, java.lang.Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392156c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392157d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392158e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f392159a = new java.util.concurrent.atomic.AtomicReferenceArray(128);

    /* renamed from: lastScheduledTask */
    private volatile /* synthetic */ java.lang.Object f72741xc9d74cdc = null;

    /* renamed from: producerIndex */
    private volatile /* synthetic */ int f72742x57395460 = 0;

    /* renamed from: consumerIndex */
    private volatile /* synthetic */ int f72740xedb1be7c = 0;

    /* renamed from: blockingTasksInBuffer */
    private volatile /* synthetic */ int f72739xb54d13e = 0;

    public final p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j a(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j jVar, boolean z17) {
        if (z17) {
            return b(jVar);
        }
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j jVar2 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) f392155b.getAndSet(this, jVar);
        if (jVar2 == null) {
            return null;
        }
        return b(jVar2);
    }

    public final p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j b(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j jVar) {
        if (((p3325xe03a0797.p3326xc267989b.p3330xd70c6594.l) jVar.f72738xa940486a).f392145a == 1) {
            f392158e.incrementAndGet(this);
        }
        if (this.f72742x57395460 - this.f72740xedb1be7c == 127) {
            return jVar;
        }
        int i17 = this.f72742x57395460 & 127;
        while (this.f392159a.get(i17) != null) {
            java.lang.Thread.yield();
        }
        this.f392159a.lazySet(i17, jVar);
        f392156c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.f72741xc9d74cdc != null ? (this.f72742x57395460 - this.f72740xedb1be7c) + 1 : this.f72742x57395460 - this.f72740xedb1be7c;
    }

    public final p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j d() {
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j jVar;
        while (true) {
            int i17 = this.f72740xedb1be7c;
            if (i17 - this.f72742x57395460 == 0) {
                return null;
            }
            int i18 = i17 & 127;
            if (f392157d.compareAndSet(this, i17, i17 + 1) && (jVar = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) this.f392159a.getAndSet(i18, null)) != null) {
                if (((p3325xe03a0797.p3326xc267989b.p3330xd70c6594.l) jVar.f72738xa940486a).f392145a == 1) {
                    f392158e.decrementAndGet(this);
                }
                return jVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        return f(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p r9) {
        /*
            r8 = this;
            int r0 = r9.f72740xedb1be7c
            int r1 = r9.f72742x57395460
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.f392159a
        L6:
            r3 = 1
            if (r0 == r1) goto L44
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.f72739xb54d13e
            if (r5 == 0) goto L44
            java.lang.Object r5 = r2.get(r4)
            kotlinx.coroutines.scheduling.j r5 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) r5
            if (r5 == 0) goto L41
            kotlinx.coroutines.scheduling.k r6 = r5.f72738xa940486a
            kotlinx.coroutines.scheduling.l r6 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.l) r6
            int r6 = r6.f392145a
            r7 = 0
            if (r6 != r3) goto L22
            r6 = r3
            goto L23
        L22:
            r6 = r7
        L23:
            if (r6 == 0) goto L41
        L25:
            r6 = 0
            boolean r6 = r2.compareAndSet(r4, r5, r6)
            if (r6 == 0) goto L2d
            goto L34
        L2d:
            java.lang.Object r6 = r2.get(r4)
            if (r6 == r5) goto L25
            r3 = r7
        L34:
            if (r3 == 0) goto L41
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p.f392158e
            r0.decrementAndGet(r9)
            r8.a(r5, r7)
            r0 = -1
            return r0
        L41:
            int r0 = r0 + 1
            goto L6
        L44:
            long r0 = r8.f(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p.e(kotlinx.coroutines.scheduling.p):long");
    }

    public final long f(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p pVar, boolean z17) {
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j jVar;
        boolean z18;
        do {
            jVar = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) pVar.f72741xc9d74cdc;
            if (jVar != null) {
                z18 = true;
                if (z17) {
                    if (!(((p3325xe03a0797.p3326xc267989b.p3330xd70c6594.l) jVar.f72738xa940486a).f392145a == 1)) {
                        return -2L;
                    }
                }
                ((p3325xe03a0797.p3326xc267989b.p3330xd70c6594.g) p3325xe03a0797.p3326xc267989b.p3330xd70c6594.n.f392151e).getClass();
                long nanoTime = java.lang.System.nanoTime() - jVar.f72737xbcf77c39;
                long j17 = p3325xe03a0797.p3326xc267989b.p3330xd70c6594.n.f392147a;
                if (nanoTime >= j17) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f392155b;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(pVar, jVar, null)) {
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(pVar) != jVar) {
                            z18 = false;
                            break;
                        }
                    }
                } else {
                    return j17 - nanoTime;
                }
            } else {
                return -2L;
            }
        } while (!z18);
        a(jVar, false);
        return -1L;
    }
}

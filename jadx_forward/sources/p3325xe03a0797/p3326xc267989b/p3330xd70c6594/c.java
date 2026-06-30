package p3325xe03a0797.p3326xc267989b.p3330xd70c6594;

/* loaded from: classes14.dex */
public final class c implements java.util.concurrent.Executor, java.io.Closeable {

    /* renamed from: _isTerminated */
    private volatile /* synthetic */ int f72734xb60774cc;

    /* renamed from: controlState */
    volatile /* synthetic */ long f72735x9e9a4134;

    /* renamed from: d, reason: collision with root package name */
    public final int f392133d;

    /* renamed from: e, reason: collision with root package name */
    public final int f392134e;

    /* renamed from: f, reason: collision with root package name */
    public final long f392135f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f392136g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3330xd70c6594.f f392137h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3330xd70c6594.f f392138i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g0 f392139m;

    /* renamed from: parkedWorkersStack */
    private volatile /* synthetic */ long f72736x1ac30b7c;

    /* renamed from: q, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 f392132q = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0("NOT_IN_STACK");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f392129n = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c.class, "parkedWorkersStack");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f392130o = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c.class, "controlState");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392131p = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c.class, "_isTerminated");

    public c(int i17, int i18, long j17, java.lang.String str) {
        this.f392133d = i17;
        this.f392134e = i18;
        this.f392135f = j17;
        this.f392136g = str;
        if (!(i17 >= 1)) {
            throw new java.lang.IllegalArgumentException(("Core pool size " + i17 + " should be at least 1").toString());
        }
        if (!(i18 >= i17)) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i18 + " should be greater than or equals to core pool size " + i17).toString());
        }
        if (!(i18 <= 2097150)) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i18 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j17 > 0)) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j17 + " must be positive").toString());
        }
        this.f392137h = new p3325xe03a0797.p3326xc267989b.p3330xd70c6594.f();
        this.f392138i = new p3325xe03a0797.p3326xc267989b.p3330xd70c6594.f();
        this.f72736x1ac30b7c = 0L;
        this.f392139m = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g0(i17 + 1);
        this.f72735x9e9a4134 = i17 << 42;
        this.f72734xb60774cc = 0;
    }

    public final int a() {
        synchronized (this.f392139m) {
            if (this.f72734xb60774cc != 0) {
                return -1;
            }
            long j17 = this.f72735x9e9a4134;
            int i17 = (int) (j17 & 2097151);
            int i18 = i17 - ((int) ((j17 & 4398044413952L) >> 21));
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 >= this.f392133d) {
                return 0;
            }
            if (i17 >= this.f392134e) {
                return 0;
            }
            int i19 = ((int) (this.f72735x9e9a4134 & 2097151)) + 1;
            if (!(i19 > 0 && this.f392139m.b(i19) == null)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar = new p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a(this, i19);
            this.f392139m.c(i19, aVar);
            if (!(i19 == ((int) (2097151 & f392130o.incrementAndGet(this))))) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            aVar.start();
            return i18 + 1;
        }
    }

    public final void b(java.lang.Runnable runnable, p3325xe03a0797.p3326xc267989b.p3330xd70c6594.k kVar, boolean z17) {
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j mVar;
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j jVar;
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.b bVar;
        ((p3325xe03a0797.p3326xc267989b.p3330xd70c6594.g) p3325xe03a0797.p3326xc267989b.p3330xd70c6594.n.f392151e).getClass();
        long nanoTime = java.lang.System.nanoTime();
        if (runnable instanceof p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) {
            mVar = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) runnable;
            mVar.f72737xbcf77c39 = nanoTime;
            mVar.f72738xa940486a = kVar;
        } else {
            mVar = new p3325xe03a0797.p3326xc267989b.p3330xd70c6594.m(runnable, nanoTime, kVar);
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar = null;
        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar2 = currentThread instanceof p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a ? (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a) currentThread : null;
        if (aVar2 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2.f392122m, this)) {
            aVar = aVar2;
        }
        if (aVar == null || (bVar = aVar.f392117e) == p3325xe03a0797.p3326xc267989b.p3330xd70c6594.b.TERMINATED || (((p3325xe03a0797.p3326xc267989b.p3330xd70c6594.l) mVar.f72738xa940486a).f392145a == 0 && bVar == p3325xe03a0797.p3326xc267989b.p3330xd70c6594.b.BLOCKING)) {
            jVar = mVar;
        } else {
            aVar.f392121i = true;
            jVar = aVar.f392116d.a(mVar, z17);
        }
        if (jVar != null) {
            if (!(((p3325xe03a0797.p3326xc267989b.p3330xd70c6594.l) jVar.f72738xa940486a).f392145a == 1 ? this.f392138i.a(jVar) : this.f392137h.a(jVar))) {
                throw new java.util.concurrent.RejectedExecutionException(this.f392136g + " was terminated");
            }
        }
        boolean z18 = z17 && aVar != null;
        if (((p3325xe03a0797.p3326xc267989b.p3330xd70c6594.l) mVar.f72738xa940486a).f392145a == 0) {
            if (z18 || l() || k(this.f72735x9e9a4134)) {
                return;
            }
            l();
            return;
        }
        long addAndGet = f392130o.addAndGet(this, 2097152L);
        if (z18 || l() || k(addAndGet)) {
            return;
        }
        l();
    }

    public final boolean c(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar) {
        long j17;
        int c17;
        if (aVar.d() != f392132q) {
            return false;
        }
        do {
            j17 = this.f72736x1ac30b7c;
            c17 = aVar.c();
            aVar.h(this.f392139m.b((int) (2097151 & j17)));
        } while (!f392129n.compareAndSet(this, j17, ((2097152 + j17) & (-2097152)) | c17));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        if (r1 == null) goto L40;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c.f392131p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto La9
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a
            r4 = 0
            if (r3 == 0) goto L18
            kotlinx.coroutines.scheduling.a r0 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            kotlinx.coroutines.scheduling.c r3 = r0.f392122m
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            kotlinx.coroutines.internal.g0 r3 = r9.f392139m
            monitor-enter(r3)
            long r5 = r9.f72735x9e9a4134     // Catch: java.lang.Throwable -> Lbb
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L76
            r3 = r2
        L33:
            kotlinx.coroutines.internal.g0 r6 = r9.f392139m
            java.lang.Object r6 = r6.b(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)
            kotlinx.coroutines.scheduling.a r6 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a) r6
            if (r6 == r0) goto L71
        L40:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L4f
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L40
        L4f:
            kotlinx.coroutines.scheduling.p r6 = r6.f392116d
            kotlinx.coroutines.scheduling.f r7 = r9.f392138i
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = p3325xe03a0797.p3326xc267989b.p3330xd70c6594.p.f392155b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            kotlinx.coroutines.scheduling.j r8 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) r8
            if (r8 == 0) goto L63
            r7.a(r8)
        L63:
            kotlinx.coroutines.scheduling.j r8 = r6.d()
            if (r8 != 0) goto L6b
            r8 = r1
            goto L6f
        L6b:
            r7.a(r8)
            r8 = r2
        L6f:
            if (r8 != 0) goto L63
        L71:
            if (r3 == r5) goto L76
            int r3 = r3 + 1
            goto L33
        L76:
            kotlinx.coroutines.scheduling.f r1 = r9.f392138i
            r1.b()
            kotlinx.coroutines.scheduling.f r1 = r9.f392137h
            r1.b()
        L80:
            if (r0 == 0) goto L88
            kotlinx.coroutines.scheduling.j r1 = r0.b(r2)
            if (r1 != 0) goto Laa
        L88:
            kotlinx.coroutines.scheduling.f r1 = r9.f392137h
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.j r1 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) r1
            if (r1 != 0) goto Laa
            kotlinx.coroutines.scheduling.f r1 = r9.f392138i
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.j r1 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j) r1
            if (r1 != 0) goto Laa
            if (r0 == 0) goto La3
            kotlinx.coroutines.scheduling.b r1 = p3325xe03a0797.p3326xc267989b.p3330xd70c6594.b.TERMINATED
            r0.i(r1)
        La3:
            r0 = 0
            r9.f72736x1ac30b7c = r0
            r9.f72735x9e9a4134 = r0
        La9:
            return
        Laa:
            r1.run()     // Catch: java.lang.Throwable -> Lae
            goto L80
        Lae:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lbb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3330xd70c6594.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        b(runnable, p3325xe03a0797.p3326xc267989b.p3330xd70c6594.n.f392152f, false);
    }

    public final void f(p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar, int i17, int i18) {
        while (true) {
            long j17 = this.f72736x1ac30b7c;
            int i19 = (int) (2097151 & j17);
            long j18 = (2097152 + j17) & (-2097152);
            if (i19 == i17) {
                if (i18 == 0) {
                    java.lang.Object d17 = aVar.d();
                    while (true) {
                        if (d17 == f392132q) {
                            i19 = -1;
                            break;
                        }
                        if (d17 == null) {
                            i19 = 0;
                            break;
                        }
                        p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar2 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a) d17;
                        int c17 = aVar2.c();
                        if (c17 != 0) {
                            i19 = c17;
                            break;
                        }
                        d17 = aVar2.d();
                    }
                } else {
                    i19 = i18;
                }
            }
            if (i19 >= 0 && f392129n.compareAndSet(this, j17, j18 | i19)) {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: isTerminated */
    public final boolean m144096x33680aed() {
        return this.f72734xb60774cc;
    }

    public final boolean k(long j17) {
        int i17 = ((int) (2097151 & j17)) - ((int) ((j17 & 4398044413952L) >> 21));
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = this.f392133d;
        if (i17 < i18) {
            int a17 = a();
            if (a17 == 1 && i18 > 1) {
                a();
            }
            if (a17 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var;
        int i17;
        while (true) {
            long j17 = this.f72736x1ac30b7c;
            p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a) this.f392139m.b((int) (2097151 & j17));
            if (aVar == null) {
                aVar = null;
            } else {
                long j18 = (2097152 + j17) & (-2097152);
                java.lang.Object d17 = aVar.d();
                while (true) {
                    l0Var = f392132q;
                    if (d17 == l0Var) {
                        i17 = -1;
                        break;
                    }
                    if (d17 == null) {
                        i17 = 0;
                        break;
                    }
                    p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar2 = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a) d17;
                    i17 = aVar2.c();
                    if (i17 != 0) {
                        break;
                    }
                    d17 = aVar2.d();
                }
                if (i17 >= 0 && f392129n.compareAndSet(this, j17, i17 | j18)) {
                    aVar.h(l0Var);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a.f392115n.compareAndSet(aVar, -1, 0)) {
                java.util.concurrent.locks.LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m144097x9616526c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int a17 = this.f392139m.a();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 1; i29 < a17; i29++) {
            p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a aVar = (p3325xe03a0797.p3326xc267989b.p3330xd70c6594.a) this.f392139m.b(i29);
            if (aVar != null) {
                int c17 = aVar.f392116d.c();
                int ordinal = aVar.f392117e.ordinal();
                if (ordinal == 0) {
                    i17++;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(c17);
                    sb6.append('c');
                    arrayList.add(sb6.toString());
                } else if (ordinal == 1) {
                    i18++;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(c17);
                    sb7.append('b');
                    arrayList.add(sb7.toString());
                } else if (ordinal == 2) {
                    i19++;
                } else if (ordinal == 3) {
                    i27++;
                    if (c17 > 0) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(c17);
                        sb8.append('d');
                        arrayList.add(sb8.toString());
                    }
                } else if (ordinal == 4) {
                    i28++;
                }
            }
        }
        long j17 = this.f72735x9e9a4134;
        return this.f392136g + '@' + p3325xe03a0797.p3326xc267989b.c1.a(this) + "[Pool Size {core = " + this.f392133d + ", max = " + this.f392134e + "}, Worker States {CPU = " + i17 + ", blocking = " + i18 + ", parked = " + i19 + ", dormant = " + i27 + ", terminated = " + i28 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f392137h.c() + ", global blocking queue size = " + this.f392138i.c() + ", Control State {created workers= " + ((int) (2097151 & j17)) + ", blocking tasks = " + ((int) ((4398044413952L & j17) >> 21)) + ", CPUs acquired = " + (this.f392133d - ((int) ((9223367638808264704L & j17) >> 42))) + "}]";
    }
}

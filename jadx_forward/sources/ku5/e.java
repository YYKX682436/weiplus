package ku5;

/* loaded from: classes12.dex */
public final class e extends java.util.concurrent.locks.AbstractQueuedSynchronizer implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f394097d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f394098e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f394099f = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f394100g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public java.util.concurrent.Future f394101h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ku5.f f394102i;

    public e(ku5.f fVar, java.lang.Runnable runnable) {
        this.f394102i = fVar;
        setState(-1);
        b(runnable);
    }

    public void a() {
        ku5.o.f394132c.i("ForkThreadPoolExecutor", "[releaseWork] name=" + this.f394102i.f394118r, new java.lang.Object[0]);
        java.util.concurrent.Future future = this.f394101h;
        if (future == null || future.isDone()) {
            return;
        }
        this.f394101h.cancel(true);
    }

    public void b(java.lang.Runnable runnable) {
        java.lang.reflect.Field field;
        java.lang.String name;
        this.f394097d = runnable;
        if (runnable == null) {
            this.f394098e = this.f394102i.f394118r + "#Worker";
            return;
        }
        if (runnable instanceof wu5.h) {
            this.f394098e = ((wu5.h) runnable).mo1867xb5884f29();
            return;
        }
        if (runnable.getClass() != ku5.f.f394105t || (field = ku5.f.f394106u) == null) {
            this.f394098e = this.f394102i.f394118r + "#" + runnable.getClass().getName();
            return;
        }
        try {
            name = field.get(runnable).getClass().getName();
        } catch (java.lang.IllegalAccessException unused) {
            name = runnable.getClass().getName();
        }
        this.f394098e = this.f394102i.f394118r + "#" + name;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f394098e;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public boolean isHeldExclusively() {
        return getState() != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0019, code lost:
    
        if (r2 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Thread] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            ku5.f r0 = r8.f394102i
            r0.getClass()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Runnable r2 = r8.f394097d
            r3 = 0
            r8.f394097d = r3
            r4 = 1
            r8.release(r4)
            r5 = 0
            if (r2 != 0) goto L1b
            java.lang.Runnable r2 = r0.f()     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L67
        L1b:
            r8.acquire(r4)     // Catch: java.lang.Throwable -> La6
            java.util.concurrent.atomic.AtomicInteger r6 = r0.f394107d     // Catch: java.lang.Throwable -> La6
            int r6 = r6.get()     // Catch: java.lang.Throwable -> La6
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            if (r6 < r7) goto L2a
            r6 = r4
            goto L2b
        L2a:
            r6 = r5
        L2b:
            if (r6 == 0) goto L3a
            boolean r6 = r1.isInterrupted()     // Catch: java.lang.Throwable -> La6
            if (r6 != 0) goto L3a
            r8.a()     // Catch: java.lang.Throwable -> La6
            r0.p(r8, r4)
            goto L6c
        L3a:
            r6 = 0
            r0.c(r1, r2)     // Catch: java.lang.Throwable -> L7f
            r2.run()     // Catch: java.lang.Throwable -> L6f java.lang.Error -> L76 java.lang.RuntimeException -> L78
            r0.b(r2, r3)     // Catch: java.lang.Throwable -> L7f
            java.util.concurrent.atomic.AtomicLong r1 = r8.f394099f     // Catch: java.lang.Throwable -> La6
            r1.getAndIncrement()     // Catch: java.lang.Throwable -> La6
            java.lang.Runnable r1 = r0.f()     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L62
            r8.b(r1)     // Catch: java.lang.Throwable -> L9c
            ku5.u0 r1 = ku5.t0.f394148d     // Catch: java.lang.Throwable -> L9c
            ku5.t0 r1 = (ku5.t0) r1     // Catch: java.lang.Throwable -> L9c
            r1.getClass()     // Catch: java.lang.Throwable -> L9c
            wu5.c r1 = r1.k(r8, r6)     // Catch: java.lang.Throwable -> L9c
            r8.f394101h = r1     // Catch: java.lang.Throwable -> L9c
            r1 = r5
            goto L63
        L62:
            r1 = r4
        L63:
            r8.release(r4)     // Catch: java.lang.Throwable -> L6d
            r4 = r1
        L67:
            if (r4 == 0) goto L6c
            r0.p(r8, r5)
        L6c:
            return
        L6d:
            r2 = move-exception
            goto La9
        L6f:
            r1 = move-exception
            java.lang.Error r3 = new java.lang.Error     // Catch: java.lang.Throwable -> L7a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            throw r3     // Catch: java.lang.Throwable -> L7a
        L76:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L7a
        L78:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L7a
        L7a:
            r3 = move-exception
            r0.b(r2, r1)     // Catch: java.lang.Throwable -> L7f
            throw r3     // Catch: java.lang.Throwable -> L7f
        L7f:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicLong r2 = r8.f394099f     // Catch: java.lang.Throwable -> La6
            r2.getAndIncrement()     // Catch: java.lang.Throwable -> La6
            java.lang.Runnable r2 = r0.f()     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L9e
            r8.b(r2)     // Catch: java.lang.Throwable -> L9c
            ku5.u0 r2 = ku5.t0.f394148d     // Catch: java.lang.Throwable -> L9c
            ku5.t0 r2 = (ku5.t0) r2     // Catch: java.lang.Throwable -> L9c
            r2.getClass()     // Catch: java.lang.Throwable -> L9c
            wu5.c r2 = r2.k(r8, r6)     // Catch: java.lang.Throwable -> L9c
            r8.f394101h = r2     // Catch: java.lang.Throwable -> L9c
            goto L9f
        L9c:
            r1 = move-exception
            goto La3
        L9e:
            r5 = r4
        L9f:
            r8.release(r4)     // Catch: java.lang.Throwable -> L9c
            throw r1     // Catch: java.lang.Throwable -> L9c
        La3:
            r2 = r1
            r1 = r5
            goto La9
        La6:
            r1 = move-exception
            r2 = r1
            r1 = r4
        La9:
            if (r1 == 0) goto Lae
            r0.p(r8, r4)
        Lae:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ku5.e.run():void");
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public boolean tryAcquire(int i17) {
        if (!compareAndSetState(0, 1)) {
            return false;
        }
        setExclusiveOwnerThread(java.lang.Thread.currentThread());
        return true;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public boolean tryRelease(int i17) {
        setExclusiveOwnerThread(null);
        setState(0);
        return true;
    }
}

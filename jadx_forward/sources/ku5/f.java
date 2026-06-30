package ku5;

/* loaded from: classes12.dex */
public class f extends java.util.concurrent.AbstractExecutorService {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f394104s = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.Class f394105t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.reflect.Field f394106u;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f394107d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f394108e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f394109f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f394110g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f394111h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f394112i;

    /* renamed from: m, reason: collision with root package name */
    public int f394113m;

    /* renamed from: n, reason: collision with root package name */
    public long f394114n;

    /* renamed from: o, reason: collision with root package name */
    public volatile ku5.p f394115o;

    /* renamed from: p, reason: collision with root package name */
    public volatile int f394116p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f394117q;

    /* renamed from: r, reason: collision with root package name */
    public volatile java.lang.String f394118r;

    static {
        java.lang.Class cls;
        java.lang.reflect.Field field = null;
        try {
            try {
                cls = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390.class;
                int i17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390.f392012d;
            } catch (java.lang.ClassNotFoundException unused) {
                cls = null;
            }
        } catch (java.lang.ClassNotFoundException unused2) {
            cls = java.lang.Class.forName("kotlinx.coroutines.DispatchedContinuation");
        }
        f394105t = cls;
        if (cls != null) {
            try {
                java.lang.reflect.Field field2 = cls.getField("continuation");
                field2.setAccessible(true);
                field = field2;
            } catch (java.lang.NoSuchFieldException unused3) {
            }
        }
        f394106u = field;
    }

    public f(java.lang.String str, int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue, ku5.p pVar) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        pVar = pVar == null ? new ku5.d() : pVar;
        java.util.concurrent.ThreadFactory defaultThreadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        this.f394107d = new java.util.concurrent.atomic.AtomicInteger(-536870912);
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f394109f = reentrantLock;
        this.f394110g = new java.util.HashSet();
        this.f394111h = new java.util.LinkedList();
        this.f394112i = reentrantLock.newCondition();
        if (i17 < 0 || i18 <= 0 || i18 < i17) {
            throw new java.lang.IllegalArgumentException();
        }
        if (blockingQueue != null && defaultThreadFactory != null && pVar != null) {
            this.f394116p = i17;
            this.f394117q = i18;
            this.f394108e = blockingQueue;
            timeUnit.toNanos(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
            this.f394115o = pVar;
            this.f394118r = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e9, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:29:0x0048, B:37:0x0070, B:39:0x0075, B:62:0x00b0, B:63:0x00b3, B:31:0x004d, B:56:0x005e, B:58:0x006d), top: B:28:0x0048, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Runnable r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ku5.f.a(java.lang.Runnable, boolean):boolean");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j17, java.util.concurrent.TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j17);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f394109f;
        reentrantLock.lock();
        while (true) {
            try {
                if (this.f394107d.get() >= 1610612736) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.f394112i.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void b(java.lang.Runnable runnable, java.lang.Throwable th6) {
    }

    public void c(java.lang.Thread thread, java.lang.Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        int i17 = this.f394107d.get();
        if ((i17 & 536870911) < this.f394116p) {
            if (a(runnable, true)) {
                return;
            } else {
                i17 = this.f394107d.get();
            }
        }
        if (!(i17 < 0) || !this.f394108e.offer(runnable)) {
            if (a(runnable, false)) {
                return;
            }
            this.f394115o.a(runnable, this);
            return;
        }
        int i18 = this.f394107d.get();
        if (!(i18 < 0)) {
            boolean remove = this.f394108e.remove(runnable);
            v();
            if (remove) {
                this.f394115o.a(runnable, this);
                return;
            }
        }
        if ((i18 & 536870911) == 0) {
            a(null, false);
        } else {
            l(null);
        }
    }

    public final java.lang.Runnable f() {
        int i17;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f394107d;
        int i18 = atomicInteger.get() & (-536870912);
        java.util.concurrent.BlockingQueue blockingQueue = this.f394108e;
        if (i18 < 0 || (i18 < 536870912 && !blockingQueue.isEmpty())) {
            return (java.lang.Runnable) blockingQueue.poll();
        }
        do {
            i17 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i17, i17 - 1));
        return null;
    }

    /* renamed from: finalize */
    public void m144423xd764dc1e() {
        shutdown();
    }

    @Override // java.util.concurrent.ExecutorService, p11.j
    public boolean isShutdown() {
        return !(this.f394107d.get() < 0);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f394107d.get() >= 1610612736;
    }

    public final void k(boolean z17) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f394109f;
        reentrantLock.lock();
        try {
            java.util.Iterator it = this.f394110g.iterator();
            while (it.hasNext()) {
                ((ku5.e) it.next()).a();
                if (z17) {
                    break;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean l(java.lang.Runnable runnable) {
        if ((this.f394107d.get() & (-536870912)) >= 0) {
            return false;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f394109f;
        reentrantLock.lock();
        java.util.LinkedList linkedList = this.f394111h;
        try {
            ku5.e eVar = linkedList.isEmpty() ? null : (ku5.e) linkedList.remove();
            if (eVar == null) {
                return false;
            }
            eVar.f394100g.compareAndSet(true, false);
            eVar.b(runnable);
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
            t0Var.getClass();
            eVar.f394101h = t0Var.k(eVar, 0L);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r6.f394114n += r7.f394099f.get();
        r6.f394110g.remove(r7);
        r7.f394097d = null;
        r7.f394101h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r7.f394100g.compareAndSet(false, true) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r6.f394111h.add(r7);
        r7 = f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r7 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r1.unlock();
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0004, code lost:
    
        if (r8 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r1 = r6.f394107d;
        r2 = r1.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.compareAndSet(r2, r2 - 1) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        r1 = r6.f394109f;
        r1.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r8 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ku5.e r7, boolean r8) {
        /*
            r6 = this;
            r0 = 1
            r7.release(r0)
            if (r8 == 0) goto L14
        L6:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.f394107d
            int r2 = r1.get()
            int r3 = r2 + (-1)
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L6
        L14:
            java.util.concurrent.locks.ReentrantLock r1 = r6.f394109f
            r1.lock()
            if (r8 == 0) goto L31
            long r2 = r6.f394114n     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.atomic.AtomicLong r8 = r7.f394099f     // Catch: java.lang.Throwable -> L4f
            long r4 = r8.get()     // Catch: java.lang.Throwable -> L4f
            long r2 = r2 + r4
            r6.f394114n = r2     // Catch: java.lang.Throwable -> L4f
            java.util.HashSet r8 = r6.f394110g     // Catch: java.lang.Throwable -> L4f
            r8.remove(r7)     // Catch: java.lang.Throwable -> L4f
            r8 = 0
            r7.f394097d = r8     // Catch: java.lang.Throwable -> L4f
            r7.f394101h = r8     // Catch: java.lang.Throwable -> L4f
            goto L48
        L31:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f394100g     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            boolean r8 = r8.compareAndSet(r2, r0)     // Catch: java.lang.Throwable -> L4f
            if (r8 == 0) goto L48
            java.util.LinkedList r8 = r6.f394111h     // Catch: java.lang.Throwable -> L4f
            r8.add(r7)     // Catch: java.lang.Throwable -> L4f
            java.lang.Runnable r7 = r6.f()     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L48
            r6.l(r7)     // Catch: java.lang.Throwable -> L4f
        L48:
            r1.unlock()
            r6.v()
            return
        L4f:
            r7 = move-exception
            r1.unlock()
            r6.v()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ku5.f.p(ku5.e, boolean):void");
    }

    public void q() {
        java.util.Iterator it = f394104s.iterator();
        while (it.hasNext()) {
            if (this == ((ku5.f) ((java.lang.ref.WeakReference) it.next()).get())) {
                it.remove();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i17;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f394109f;
        reentrantLock.lock();
        do {
            try {
                atomicInteger = this.f394107d;
                i17 = atomicInteger.get();
                if (i17 >= 0) {
                    break;
                }
            } catch (java.lang.Throwable th6) {
                reentrantLock.unlock();
                throw th6;
            }
        } while (!atomicInteger.compareAndSet(i17, (536870911 & i17) | 0));
        k(false);
        reentrantLock.unlock();
        v();
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List shutdownNow() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i17;
        int i18;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f394109f;
        reentrantLock.lock();
        do {
            try {
                atomicInteger = this.f394107d;
                i17 = atomicInteger.get();
                if (i17 >= 536870912) {
                    break;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        } while (!atomicInteger.compareAndSet(i17, 536870912 | (536870911 & i17)));
        reentrantLock.lock();
        try {
            java.util.Iterator it = this.f394110g.iterator();
            while (it.hasNext()) {
                ((ku5.e) it.next()).a();
            }
            reentrantLock.unlock();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.concurrent.BlockingQueue blockingQueue = this.f394108e;
            blockingQueue.drainTo(arrayList);
            if (!blockingQueue.isEmpty()) {
                for (java.lang.Runnable runnable : (java.lang.Runnable[]) blockingQueue.toArray(new java.lang.Runnable[0])) {
                    if (blockingQueue.remove(runnable)) {
                        arrayList.add(runnable);
                    }
                }
            }
            reentrantLock.unlock();
            v();
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: toString */
    public java.lang.String m144424x9616526c() {
        java.lang.String str;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f394109f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        reentrantLock.lock();
        try {
            long j17 = this.f394114n;
            java.util.HashSet hashSet = this.f394110g;
            int size = hashSet.size();
            java.util.Iterator it = hashSet.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                ku5.e eVar = (ku5.e) it.next();
                j17 += eVar.f394099f.get();
                if (eVar.isHeldExclusively()) {
                    i17++;
                    sb6.append(eVar.f394098e);
                }
            }
            reentrantLock.unlock();
            int i18 = this.f394107d.get();
            if (i18 < 0) {
                str = "Running";
            } else {
                str = i18 >= 1610612736 ? "Terminated" : "Shutting down";
            }
            return super.toString() + "[" + str + ", pool size = " + size + ", active threads = " + i17 + ", queued tasks = " + this.f394108e.size() + ", completed tasks = " + j17 + ", running tasks = " + ((java.lang.Object) sb6) + "]";
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    public final void v() {
        java.util.concurrent.locks.Condition condition = this.f394112i;
        while (true) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f394107d;
            int i17 = atomicInteger.get();
            if (i17 < 0) {
                return;
            }
            if (i17 >= 1073741824) {
                return;
            }
            if (((-536870912) & i17) == 0 && !this.f394108e.isEmpty()) {
                return;
            }
            if ((536870911 & i17) != 0) {
                k(true);
                return;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.f394109f;
            reentrantLock.lock();
            try {
                if (atomicInteger.compareAndSet(i17, 1073741824)) {
                    try {
                        q();
                        return;
                    } finally {
                        atomicInteger.set(1610612736);
                        condition.signalAll();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public f(java.lang.String str, int i17, int i18, java.util.concurrent.BlockingQueue blockingQueue) {
        this(str, i17, i18, blockingQueue, null);
    }
}

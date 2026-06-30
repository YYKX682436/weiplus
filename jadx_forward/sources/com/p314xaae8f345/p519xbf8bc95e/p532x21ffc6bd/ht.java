package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ht {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f131382a = new com.tencent.mapsdk.internal.ht.a("sw");

    /* renamed from: b, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f131383b = new com.tencent.mapsdk.internal.ht.a("lw");

    /* renamed from: c, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f131384c = new com.tencent.mapsdk.internal.ht.a("mlw");

    /* renamed from: d, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f131385d = new com.tencent.mapsdk.internal.ht.a("qw");

    /* renamed from: e, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f131386e = new com.tencent.mapsdk.internal.ht.a("mqw");

    /* renamed from: f, reason: collision with root package name */
    private static java.util.concurrent.ScheduledThreadPoolExecutor f131387f;

    /* renamed from: g, reason: collision with root package name */
    private static java.util.concurrent.ThreadPoolExecutor f131388g;

    /* renamed from: h, reason: collision with root package name */
    private static java.util.concurrent.ThreadPoolExecutor f131389h;

    /* renamed from: i, reason: collision with root package name */
    private static java.util.concurrent.ThreadPoolExecutor f131390i;

    /* renamed from: j, reason: collision with root package name */
    private static java.util.concurrent.ThreadPoolExecutor f131391j;

    /* loaded from: classes13.dex */
    public static class a implements java.util.concurrent.ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f131392a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicInteger f131393b = new java.util.concurrent.atomic.AtomicInteger(0);

        public a(java.lang.String str) {
            this.f131392a = str;
            if (android.text.TextUtils.isEmpty(str)) {
                this.f131392a = "def";
            }
        }

        private int b() {
            return this.f131393b.get();
        }

        public final com.tencent.mapsdk.internal.ht.a a() {
            this.f131393b.set(0);
            return this;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, "tms-" + this.f131392a + "-" + this.f131393b.incrementAndGet());
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a("创建线程：".concat(java.lang.String.valueOf(thread)));
            return thread;
        }
    }

    public static synchronized java.util.concurrent.ScheduledThreadPoolExecutor a() {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.class) {
            if (a(f131387f)) {
                f131387f = new java.util.concurrent.ScheduledThreadPoolExecutor(2, f131382a.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            scheduledThreadPoolExecutor = f131387f;
        }
        return scheduledThreadPoolExecutor;
    }

    public static synchronized java.util.concurrent.ThreadPoolExecutor b() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.class) {
            if (a(f131388g)) {
                f131388g = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), f131385d.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f131388g;
        }
        return threadPoolExecutor;
    }

    public static synchronized java.util.concurrent.ThreadPoolExecutor c() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.class) {
            if (a(f131389h)) {
                int max = java.lang.Math.max(4, java.lang.Runtime.getRuntime().availableProcessors());
                f131389h = new java.util.concurrent.ThreadPoolExecutor(max / 2, max, 2L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), f131386e.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f131389h;
        }
        return threadPoolExecutor;
    }

    public static synchronized java.util.concurrent.ThreadPoolExecutor d() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.class) {
            if (a(f131390i)) {
                f131390i = new java.util.concurrent.ThreadPoolExecutor(0, 1, 2L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), f131383b.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f131390i;
        }
        return threadPoolExecutor;
    }

    private static synchronized java.util.concurrent.ThreadPoolExecutor e() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        synchronized (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.class) {
            if (a(f131391j)) {
                f131391j = new java.util.concurrent.ThreadPoolExecutor(0, java.lang.Math.max(4, java.lang.Runtime.getRuntime().availableProcessors()) / 2, 5L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), f131384c.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f131391j;
        }
        return threadPoolExecutor;
    }

    private static java.lang.String f() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        return currentThread + ";" + currentThread.getState() + ";interrupted=" + java.lang.Thread.interrupted() + "|" + currentThread.isInterrupted();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a(java.util.concurrent.ExecutorService r5) {
        /*
            java.lang.Class<com.tencent.mapsdk.internal.ht> r0 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.class
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L17
            boolean r3 = r5.isShutdown()     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L17
            boolean r3 = r5.isTerminated()     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L17
            r3 = r1
            goto L18
        L15:
            r5 = move-exception
            goto L2e
        L17:
            r3 = r2
        L18:
            boolean r4 = r5 instanceof java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L29
            if (r3 == 0) goto L28
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5     // Catch: java.lang.Throwable -> L15
            boolean r5 = r5.isTerminating()     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L28
            r3 = r1
            goto L29
        L28:
            r3 = r2
        L29:
            monitor-exit(r0)
            if (r3 != 0) goto L2d
            return r1
        L2d:
            return r2
        L2e:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.a(java.util.concurrent.ExecutorService):boolean");
    }
}

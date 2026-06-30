package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ht {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f49849a = new com.tencent.mapsdk.internal.ht.a("sw");

    /* renamed from: b, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f49850b = new com.tencent.mapsdk.internal.ht.a("lw");

    /* renamed from: c, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f49851c = new com.tencent.mapsdk.internal.ht.a("mlw");

    /* renamed from: d, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f49852d = new com.tencent.mapsdk.internal.ht.a("qw");

    /* renamed from: e, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.ht.a f49853e = new com.tencent.mapsdk.internal.ht.a("mqw");

    /* renamed from: f, reason: collision with root package name */
    private static java.util.concurrent.ScheduledThreadPoolExecutor f49854f;

    /* renamed from: g, reason: collision with root package name */
    private static java.util.concurrent.ThreadPoolExecutor f49855g;

    /* renamed from: h, reason: collision with root package name */
    private static java.util.concurrent.ThreadPoolExecutor f49856h;

    /* renamed from: i, reason: collision with root package name */
    private static java.util.concurrent.ThreadPoolExecutor f49857i;

    /* renamed from: j, reason: collision with root package name */
    private static java.util.concurrent.ThreadPoolExecutor f49858j;

    /* loaded from: classes13.dex */
    public static class a implements java.util.concurrent.ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f49859a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicInteger f49860b = new java.util.concurrent.atomic.AtomicInteger(0);

        public a(java.lang.String str) {
            this.f49859a = str;
            if (android.text.TextUtils.isEmpty(str)) {
                this.f49859a = "def";
            }
        }

        private int b() {
            return this.f49860b.get();
        }

        public final com.tencent.mapsdk.internal.ht.a a() {
            this.f49860b.set(0);
            return this;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, "tms-" + this.f49859a + "-" + this.f49860b.incrementAndGet());
            com.tencent.mapsdk.core.utils.log.LogUtil.a("创建线程：".concat(java.lang.String.valueOf(thread)));
            return thread;
        }
    }

    public static synchronized java.util.concurrent.ScheduledThreadPoolExecutor a() {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (com.tencent.mapsdk.internal.ht.class) {
            if (a(f49854f)) {
                f49854f = new java.util.concurrent.ScheduledThreadPoolExecutor(2, f49849a.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            scheduledThreadPoolExecutor = f49854f;
        }
        return scheduledThreadPoolExecutor;
    }

    public static synchronized java.util.concurrent.ThreadPoolExecutor b() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        synchronized (com.tencent.mapsdk.internal.ht.class) {
            if (a(f49855g)) {
                f49855g = new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), f49852d.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f49855g;
        }
        return threadPoolExecutor;
    }

    public static synchronized java.util.concurrent.ThreadPoolExecutor c() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        synchronized (com.tencent.mapsdk.internal.ht.class) {
            if (a(f49856h)) {
                int max = java.lang.Math.max(4, java.lang.Runtime.getRuntime().availableProcessors());
                f49856h = new java.util.concurrent.ThreadPoolExecutor(max / 2, max, 2L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), f49853e.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f49856h;
        }
        return threadPoolExecutor;
    }

    public static synchronized java.util.concurrent.ThreadPoolExecutor d() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        synchronized (com.tencent.mapsdk.internal.ht.class) {
            if (a(f49857i)) {
                f49857i = new java.util.concurrent.ThreadPoolExecutor(0, 1, 2L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), f49850b.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f49857i;
        }
        return threadPoolExecutor;
    }

    private static synchronized java.util.concurrent.ThreadPoolExecutor e() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        synchronized (com.tencent.mapsdk.internal.ht.class) {
            if (a(f49858j)) {
                f49858j = new java.util.concurrent.ThreadPoolExecutor(0, java.lang.Math.max(4, java.lang.Runtime.getRuntime().availableProcessors()) / 2, 5L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), f49851c.a(), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f49858j;
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
            java.lang.Class<com.tencent.mapsdk.internal.ht> r0 = com.tencent.mapsdk.internal.ht.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ht.a(java.util.concurrent.ExecutorService):boolean");
    }
}

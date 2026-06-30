package com.tencent.mm.app;

/* loaded from: classes12.dex */
public enum u6 {
    INSTANCE;

    public static final com.tencent.mm.sdk.platformtools.b5 Q = new com.tencent.mm.sdk.platformtools.b5("StartupCostReporter_kvstat", java.util.concurrent.TimeUnit.DAYS.toMillis(1), false, true);
    public static final long R;
    public static final long S;
    public static final long T;
    public static final long U;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f53827d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public android.app.Application f53828e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f53829f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f53830g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f53831h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f53832i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f53833m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f53834n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f53835o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f53836p = false;

    /* renamed from: q, reason: collision with root package name */
    public long f53837q = 0;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f53838r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f53839s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f53840t = false;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f53841u = false;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f53842v = new byte[0];

    /* renamed from: w, reason: collision with root package name */
    public boolean f53843w = false;

    /* renamed from: x, reason: collision with root package name */
    public long f53844x = -1;

    /* renamed from: y, reason: collision with root package name */
    public long f53845y = -1;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f53846z = {false};
    public final byte[] A = new byte[0];
    public boolean B = false;
    public long C = -1;
    public boolean D = false;
    public final java.util.Map E = new java.util.concurrent.ConcurrentHashMap(16);
    public com.tencent.mm.app.s6 F = null;
    public com.tencent.mm.app.r6 G = null;
    public final int[] H = {0, 0};
    public final int[] I = {0, 0};

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.Runnable f53826J = new com.tencent.mm.app.h6(this);
    public final java.lang.Runnable K = new com.tencent.mm.app.i6(this);
    public final java.lang.Runnable L = new com.tencent.mm.app.j6(this);
    public final java.lang.Runnable M = new com.tencent.mm.app.k6(this);
    public final android.app.Application.ActivityLifecycleCallbacks N = new com.tencent.mm.app.o6(this);

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        R = timeUnit.toMillis(1L);
        S = timeUnit.toMillis(5L);
        T = timeUnit.toMillis(5L);
        U = java.util.concurrent.TimeUnit.MINUTES.toMillis(10L);
    }

    u6() {
    }

    public final int d(boolean z17) {
        int i17;
        synchronized (this.H) {
            i17 = this.H[z17 ? (char) 1 : (char) 0];
        }
        return i17;
    }

    public long e(com.tencent.mm.app.t6 t6Var) {
        java.lang.Long l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) this.E).get(t6Var);
        if (l17 == null) {
            return -1L;
        }
        return l17.longValue();
    }

    public void f(com.tencent.mm.app.s6 s6Var) {
        if (this.f53838r) {
            com.tencent.mm.app.p5.f("MicroMsg.StartupCostReporter", "[tomys] Already installed.", new java.lang.Object[0]);
            return;
        }
        this.f53830g = com.tencent.mm.app.x.f53907b;
        this.f53831h = android.os.SystemClock.elapsedRealtime();
        this.f53832i = android.os.SystemClock.uptimeMillis();
        this.f53835o = g(false);
        this.f53828e = com.tencent.mm.sdk.platformtools.i.a();
        this.f53829f = bm5.f1.a();
        this.F = s6Var;
        this.f53828e.registerActivityLifecycleCallbacks(this.N);
        this.f53827d.post(this.f53826J);
        this.f53838r = true;
        com.tencent.mm.app.p5.e("MicroMsg.StartupCostReporter", "[tomys] install, startup_begin_ts:%s, install_ts:%s, install_ts_nh:%s, install_cgroup_foreground:%s", java.lang.Long.valueOf(this.f53830g), java.lang.Long.valueOf(this.f53831h), java.lang.Long.valueOf(this.f53832i), java.lang.Boolean.valueOf(this.f53835o));
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        if (r6.importance != 100) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.StartupCostReporter"
            if (r9 == 0) goto L1d
            boolean r1 = com.tencent.mm.sdk.platformtools.x2.r()
            if (r1 != 0) goto L1d
            ku5.u0 r1 = ku5.t0.f312615d
            com.tencent.mm.app.g6 r2 = new com.tencent.mm.app.g6
            r2.<init>(r8)
            ku5.t0 r1 = (ku5.t0) r1
            r1.getClass()
            r3 = 0
            wu5.c r1 = r1.m(r2, r3)
            goto L1e
        L1d:
            r1 = 0
        L1e:
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "/proc/self/cgroup"
            r2.<init>(r3)
            r3 = 1
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64
            java.io.FileReader r6 = new java.io.FileReader     // Catch: java.lang.Throwable -> L64
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L64
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L64
        L31:
            java.lang.String r2 = r5.readLine()     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L56
            java.lang.String r6 = "top-app"
            boolean r6 = r2.contains(r6)     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L45
            r5.close()     // Catch: java.lang.Throwable -> L64
            r2 = r3
            goto L6d
        L45:
            java.lang.String r6 = "background"
            boolean r6 = r2.contains(r6)     // Catch: java.lang.Throwable -> L5a
            if (r6 != 0) goto L56
            java.lang.String r6 = "restricted"
            boolean r2 = r2.contains(r6)     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L31
        L56:
            r5.close()     // Catch: java.lang.Throwable -> L64
            goto L6c
        L5a:
            r2 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r2.addSuppressed(r5)     // Catch: java.lang.Throwable -> L64
        L63:
            throw r2     // Catch: java.lang.Throwable -> L64
        L64:
            r2 = move-exception
            java.lang.String r5 = "[-] Fail to read cgroup file."
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.tencent.mm.app.p5.d(r0, r2, r5, r6)
        L6c:
            r2 = r4
        L6d:
            if (r2 != 0) goto L75
            if (r1 == 0) goto L74
            r1.cancel(r3)
        L74:
            return r4
        L75:
            int r2 = android.os.Process.myPid()
            int r2 = android.os.Process.getThreadPriority(r2)
            r5 = -10
            if (r2 > r5) goto L83
            r2 = r3
            goto L84
        L83:
            r2 = r4
        L84:
            if (r2 != 0) goto L8c
            if (r1 == 0) goto L8b
            r1.cancel(r3)
        L8b:
            return r4
        L8c:
            if (r9 == 0) goto Ldb
            if (r1 == 0) goto Ld2
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = r1.get(r5, r9)     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            int r2 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            int r5 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
        La6:
            boolean r6 = r9.hasNext()     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            if (r6 == 0) goto Ld2
            java.lang.Object r6 = r9.next()     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            int r7 = r6.pid     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            if (r7 != r2) goto La6
            int r7 = r6.uid     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            if (r7 != r5) goto La6
            int r9 = r6.importance     // Catch: java.lang.Throwable -> Lc2 java.util.concurrent.TimeoutException -> Lcb
            r0 = 100
            if (r9 != r0) goto Ld2
            r9 = r3
            goto Ld3
        Lc2:
            r9 = move-exception
            java.lang.String r2 = "[tomys] Fail to get running process info, regard as running in background."
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.mm.app.p5.d(r0, r9, r2, r5)
            goto Ld2
        Lcb:
            java.lang.String r9 = "[tomys] Timeout when get running process info, regard as running in background."
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.tencent.mm.app.p5.c(r0, r9, r2)
        Ld2:
            r9 = r4
        Ld3:
            if (r9 != 0) goto Ldb
            if (r1 == 0) goto Lda
            r1.cancel(r3)
        Lda:
            return r4
        Ldb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.u6.g(boolean):boolean");
    }

    public void h(com.tencent.mm.app.t6 t6Var) {
        if (!this.f53838r || this.f53841u) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f53830g;
        synchronized (this.E) {
            ((java.util.concurrent.ConcurrentHashMap) this.E).put(t6Var, java.lang.Long.valueOf(elapsedRealtime));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StartupCostReporter", "[startup] since app startup %s cost %s ms.", t6Var, java.lang.Long.valueOf(elapsedRealtime));
        java.util.Objects.toString(t6Var);
    }
}

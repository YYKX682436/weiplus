package com.tencent.matrix.resource.watcher;

/* loaded from: classes12.dex */
public class f extends ri.c0 {

    /* renamed from: q, reason: collision with root package name */
    public static final long f52978q = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f52979r = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.matrix.resource.x f52980e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.matrix.resource.watcher.j f52981f;

    /* renamed from: g, reason: collision with root package name */
    public final int f52982g;

    /* renamed from: h, reason: collision with root package name */
    public final long f52983h;

    /* renamed from: i, reason: collision with root package name */
    public final long f52984i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Handler f52985j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f52986k;

    /* renamed from: l, reason: collision with root package name */
    public final cj.c f52987l;

    /* renamed from: m, reason: collision with root package name */
    public final wi.b f52988m;

    /* renamed from: n, reason: collision with root package name */
    public final android.app.Application.ActivityLifecycleCallbacks f52989n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.matrix.resource.watcher.i f52990o;

    /* renamed from: p, reason: collision with root package name */
    public long f52991p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.app.Application r8, com.tencent.matrix.resource.x r9) {
        /*
            r7 = this;
            long r2 = com.tencent.matrix.resource.watcher.f.f52978q
            r9.getClass()
            java.lang.String r4 = "memory"
            r0 = r7
            r1 = r8
            r5 = r9
            r0.<init>(r1, r2, r4, r5)
            com.tencent.matrix.resource.watcher.b r8 = new com.tencent.matrix.resource.watcher.b
            r8.<init>(r7)
            r7.f52989n = r8
            com.tencent.matrix.resource.watcher.e r8 = new com.tencent.matrix.resource.watcher.e
            r8.<init>(r7)
            r7.f52990o = r8
            r0 = 0
            r7.f52991p = r0
            r7.f52980e = r9
            java.lang.String r8 = "matrix_res"
            r0 = 5
            android.os.HandlerThread r8 = oj.g.c(r8, r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r8.getLooper()
            r0.<init>(r1)
            r7.f52985j = r0
            wi.c r9 = r9.f53000h
            wi.b r0 = r9.f446126b
            r7.f52988m = r0
            long r1 = wi.c.f446123h
            jr5.a r3 = r9.f446125a
            r4 = r3
            com.tencent.mm.matrix.o0 r4 = (com.tencent.mm.matrix.o0) r4
            java.lang.String r5 = ""
            java.lang.String r6 = "clicfg_matrix_resource_detect_interval_millis_bg"
            java.lang.String r4 = r4.b(r6, r5)
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 == 0) goto L4f
            goto L53
        L4f:
            long r1 = com.tencent.mm.sdk.platformtools.t8.V(r4, r1)
        L53:
            r7.f52983h = r1
            long r1 = r9.a()
            r7.f52984i = r1
            com.tencent.matrix.resource.watcher.j r1 = new com.tencent.matrix.resource.watcher.j
            long r4 = r9.a()
            r1.<init>(r4, r8)
            r7.f52981f = r1
            com.tencent.mm.matrix.o0 r3 = (com.tencent.mm.matrix.o0) r3
            java.lang.String r8 = "clicfg_matrix_resource_max_detect_times"
            r1 = 10
            int r8 = r3.a(r8, r1)
            r7.f52982g = r8
            int r8 = r0.ordinal()
            switch(r8) {
                case 1: goto Lab;
                case 2: goto La3;
                case 3: goto L9d;
                case 4: goto L97;
                case 5: goto L91;
                case 6: goto L8b;
                case 7: goto L85;
                case 8: goto L7f;
                default: goto L79;
            }
        L79:
            cj.y r8 = new cj.y
            r8.<init>(r7)
            goto Lb0
        L7f:
            cj.x r8 = new cj.x
            r8.<init>(r7)
            goto Lb0
        L85:
            cj.r r8 = new cj.r
            r8.<init>(r7)
            goto Lb0
        L8b:
            cj.k r8 = new cj.k
            r8.<init>(r7)
            goto Lb0
        L91:
            cj.d r8 = new cj.d
            r8.<init>(r7)
            goto Lb0
        L97:
            cj.b0 r8 = new cj.b0
            r8.<init>(r7)
            goto Lb0
        L9d:
            cj.e r8 = new cj.e
            r8.<init>(r7)
            goto Lb0
        La3:
            cj.f r8 = new cj.f
            java.lang.String r9 = r9.f446127c
            r8.<init>(r7, r9)
            goto Lb0
        Lab:
            cj.a r8 = new cj.a
            r8.<init>(r7)
        Lb0:
            r7.f52987l = r8
            java.util.concurrent.ConcurrentLinkedQueue r8 = new java.util.concurrent.ConcurrentLinkedQueue
            r8.<init>()
            r7.f52986k = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.resource.watcher.f.<init>(android.app.Application, com.tencent.matrix.resource.x):void");
    }

    public final void c(java.lang.Object obj) {
        java.lang.String name = obj.getClass().getName();
        wi.b bVar = this.f52988m;
        if (bVar == wi.b.NO_DUMP || bVar == wi.b.AUTO_DUMP) {
            this.f52980e.f53000h.getClass();
            if (a(name)) {
                oj.j.c("Matrix.ActivityRefWatcher", "object leak with name %s had published, just ignore", name);
                return;
            }
        }
        this.f52986k.add(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo.newInstance(name, obj));
        synchronized (this.f52986k) {
            this.f52986k.notifyAll();
        }
        oj.j.a("Matrix.ActivityRefWatcher", "mDestroyedActivityInfos add %s", name);
    }

    public void d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f52988m == wi.b.NO_DUMP && currentTimeMillis - this.f52991p < (this.f52980e.f53000h.a() / 2) - 100) {
            oj.j.e("Matrix.ActivityRefWatcher", "skip triggering gc for frequency", new java.lang.Object[0]);
            return;
        }
        this.f52991p = currentTimeMillis;
        oj.j.e("Matrix.ActivityRefWatcher", "triggering gc...", new java.lang.Object[0]);
        java.lang.Runtime.getRuntime().gc();
        try {
            java.lang.Thread.sleep(100L);
        } catch (java.lang.InterruptedException e17) {
            oj.j.d("Matrix.ActivityRefWatcher", e17, "", new java.lang.Object[0]);
        }
        java.lang.Runtime.getRuntime().runFinalization();
        oj.j.e("Matrix.ActivityRefWatcher", "gc was triggered.", new java.lang.Object[0]);
    }
}

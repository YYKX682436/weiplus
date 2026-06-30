package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc;

/* loaded from: classes12.dex */
public class f extends ri.c0 {

    /* renamed from: q, reason: collision with root package name */
    public static final long f134511q = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f134512r = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x f134513e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.j f134514f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134515g;

    /* renamed from: h, reason: collision with root package name */
    public final long f134516h;

    /* renamed from: i, reason: collision with root package name */
    public final long f134517i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Handler f134518j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f134519k;

    /* renamed from: l, reason: collision with root package name */
    public final cj.c f134520l;

    /* renamed from: m, reason: collision with root package name */
    public final wi.b f134521m;

    /* renamed from: n, reason: collision with root package name */
    public final android.app.Application.ActivityLifecycleCallbacks f134522n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.i f134523o;

    /* renamed from: p, reason: collision with root package name */
    public long f134524p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.app.Application r8, com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x r9) {
        /*
            r7 = this;
            long r2 = com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f.f134511q
            r9.getClass()
            java.lang.String r4 = "memory"
            r0 = r7
            r1 = r8
            r5 = r9
            r0.<init>(r1, r2, r4, r5)
            com.tencent.matrix.resource.watcher.b r8 = new com.tencent.matrix.resource.watcher.b
            r8.<init>(r7)
            r7.f134522n = r8
            com.tencent.matrix.resource.watcher.e r8 = new com.tencent.matrix.resource.watcher.e
            r8.<init>(r7)
            r7.f134523o = r8
            r0 = 0
            r7.f134524p = r0
            r7.f134513e = r9
            java.lang.String r8 = "matrix_res"
            r0 = 5
            android.os.HandlerThread r8 = oj.g.c(r8, r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r8.getLooper()
            r0.<init>(r1)
            r7.f134518j = r0
            wi.c r9 = r9.f134533h
            wi.b r0 = r9.f527659b
            r7.f134521m = r0
            long r1 = wi.c.f527656h
            jr5.a r3 = r9.f527658a
            r4 = r3
            com.tencent.mm.matrix.o0 r4 = (com.p314xaae8f345.mm.p849xbf8d97c1.o0) r4
            java.lang.String r5 = ""
            java.lang.String r6 = "clicfg_matrix_resource_detect_interval_millis_bg"
            java.lang.String r4 = r4.b(r6, r5)
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r5 == 0) goto L4f
            goto L53
        L4f:
            long r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(r4, r1)
        L53:
            r7.f134516h = r1
            long r1 = r9.a()
            r7.f134517i = r1
            com.tencent.matrix.resource.watcher.j r1 = new com.tencent.matrix.resource.watcher.j
            long r4 = r9.a()
            r1.<init>(r4, r8)
            r7.f134514f = r1
            com.tencent.mm.matrix.o0 r3 = (com.p314xaae8f345.mm.p849xbf8d97c1.o0) r3
            java.lang.String r8 = "clicfg_matrix_resource_max_detect_times"
            r1 = 10
            int r8 = r3.a(r8, r1)
            r7.f134515g = r8
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
            java.lang.String r9 = r9.f527660c
            r8.<init>(r7, r9)
            goto Lb0
        Lab:
            cj.a r8 = new cj.a
            r8.<init>(r7)
        Lb0:
            r7.f134520l = r8
            java.util.concurrent.ConcurrentLinkedQueue r8 = new java.util.concurrent.ConcurrentLinkedQueue
            r8.<init>()
            r7.f134519k = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f.<init>(android.app.Application, com.tencent.matrix.resource.x):void");
    }

    public final void c(java.lang.Object obj) {
        java.lang.String name = obj.getClass().getName();
        wi.b bVar = this.f134521m;
        if (bVar == wi.b.NO_DUMP || bVar == wi.b.AUTO_DUMP) {
            this.f134513e.f134533h.getClass();
            if (a(name)) {
                oj.j.c("Matrix.ActivityRefWatcher", "object leak with name %s had published, just ignore", name);
                return;
            }
        }
        this.f134519k.add(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6.m41233x6bff0255(name, obj));
        synchronized (this.f134519k) {
            this.f134519k.notifyAll();
        }
        oj.j.a("Matrix.ActivityRefWatcher", "mDestroyedActivityInfos add %s", name);
    }

    public void d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f134521m == wi.b.NO_DUMP && currentTimeMillis - this.f134524p < (this.f134513e.f134533h.a() / 2) - 100) {
            oj.j.e("Matrix.ActivityRefWatcher", "skip triggering gc for frequency", new java.lang.Object[0]);
            return;
        }
        this.f134524p = currentTimeMillis;
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

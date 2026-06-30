package kj;

/* loaded from: classes12.dex */
public class e0 extends kj.g0 implements jj.a, hj.b, android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: g, reason: collision with root package name */
    public int f389732g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f389733h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f389734i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f389735m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f389736n;

    /* renamed from: o, reason: collision with root package name */
    public final long f389737o;

    /* renamed from: p, reason: collision with root package name */
    public final long f389738p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f389739q;

    /* renamed from: e, reason: collision with root package name */
    public long f389730e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f389731f = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f389740r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f389741s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final boolean f389742t = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(ej.c r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f389730e = r0
            r5.f389731f = r0
            r5.f389740r = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f389741s = r0
            r0 = 1
            r5.f389742t = r0
            boolean r1 = r6.f334789c
            r5.f389735m = r1
            java.util.Set r1 = r6.f334797k
            if (r1 != 0) goto L5a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r6.f334797k = r1
            jr5.a r2 = r6.f334787a
            java.lang.String r3 = ";"
            if (r2 != 0) goto L3b
            java.lang.String r2 = r6.f334796j
            if (r2 != 0) goto L2f
            goto L5c
        L2f:
            java.lang.String[] r2 = r2.split(r3)
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.addAll(r2)
            goto L5a
        L3b:
            java.lang.String r1 = r6.f334796j
            com.tencent.mm.matrix.o0 r2 = (com.p314xaae8f345.mm.p849xbf8d97c1.o0) r2
            java.lang.String r4 = "clicfg_matrix_trace_care_scene_set"
            java.lang.String r1 = r2.b(r4, r1)
            if (r1 == 0) goto L49
            r6.f334796j = r1
        L49:
            java.lang.String r1 = r6.f334796j
            if (r1 == 0) goto L5a
            java.util.Set r2 = r6.f334797k
            java.lang.String[] r1 = r1.split(r3)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.addAll(r1)
        L5a:
            java.util.Set r1 = r6.f334797k
        L5c:
            r5.f389736n = r1
            jr5.a r1 = r6.f334787a
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 != 0) goto L65
            goto L6d
        L65:
            java.lang.String r3 = "clicfg_matrix_trace_app_start_up_threshold"
            com.tencent.mm.matrix.o0 r1 = (com.p314xaae8f345.mm.p849xbf8d97c1.o0) r1
            int r2 = r1.a(r3, r2)
        L6d:
            long r1 = (long) r2
            r5.f389737o = r1
            jr5.a r6 = r6.f334787a
            r1 = 4000(0xfa0, float:5.605E-42)
            if (r6 != 0) goto L77
            goto L7f
        L77:
            java.lang.String r2 = "clicfg_matrix_trace_warm_app_start_up_threshold"
            com.tencent.mm.matrix.o0 r6 = (com.p314xaae8f345.mm.p849xbf8d97c1.o0) r6
            int r1 = r6.a(r2, r1)
        L7f:
            long r1 = (long) r1
            r5.f389738p = r1
            r5.f389739q = r0
            java.util.HashSet r6 = hj.c.f363106f
            monitor-enter(r6)
            r6.add(r5)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8c
            return
        L8c:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.e0.<init>(ej.c):void");
    }

    @Override // kj.g0, ei.a
    public void a(boolean z17) {
        if (z17) {
            return;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(cls);
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mH");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            java.lang.reflect.Field declaredField3 = obj2.getClass().getSuperclass().getDeclaredField("mCallback");
            declaredField3.setAccessible(true);
            oj.j.c("Matrix.StartupTracer", "callback %s", (android.os.Handler.Callback) declaredField3.get(obj2));
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // kj.g0
    public void d() {
        super.d();
        boolean z17 = this.f389735m;
        oj.j.c("Matrix.StartupTracer", "[onAlive] isStartupEnable:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b().m41270x162a7075(this);
            ih.d.d().f373004b.registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (this.f389735m) {
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b().m41278xf1335d58(this);
            ih.d.d().f373004b.unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void h(long j17, long j18, long j19, boolean z17) {
        oj.j.c("Matrix.StartupTracer", "[report] applicationCost:%s firstScreenCost:%s allCost:%s isWarmStartUp:%s, createScene:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(hj.c.f363105e));
        long[] jArr = new long[0];
        if (!z17 && j19 >= this.f389737o) {
            jArr = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b().m41271xe1d050bf(hj.c.f363104d);
            hj.c.f363104d.a();
        } else if (z17 && j19 >= this.f389738p) {
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118 m41264x9cf0d20b = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41264x9cf0d20b();
            gj.e eVar = hj.c.f363103c;
            jArr = m41264x9cf0d20b.m41271xe1d050bf(eVar);
            eVar.a();
        }
        oj.g.a().post(new kj.d0(this, jArr, j17, j18, j19, z17, hj.c.f363105e));
    }

    public void i(android.app.Activity activity) {
        if (hj.c.f363105e == Integer.MIN_VALUE) {
            return;
        }
        java.lang.String name = activity.getClass().getName();
        if (!(this.f389731f == 0)) {
            if (this.f389733h) {
                this.f389733h = false;
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f389740r;
                oj.j.c("Matrix.StartupTracer", "#WarmStartup# activity:%s, warmCost:%d, now:%d, lastCreateActivity:%d", name, java.lang.Long.valueOf(uptimeMillis), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()), java.lang.Long.valueOf(this.f389740r));
                if (uptimeMillis > 0) {
                    h(0L, 0L, uptimeMillis, true);
                    return;
                }
                return;
            }
            return;
        }
        boolean z17 = hj.c.f363107g;
        java.util.Set set = this.f389736n;
        oj.j.c("Matrix.StartupTracer", "#ColdStartup# activity:%s, splashActivities:%s, empty:%b, isCreatedByLaunchActivity:%b, hasShowSplashActivity:%b, firstScreenCost:%d, now:%d, application_create_begin_time:%d, app_cost:%d", name, set, java.lang.Boolean.valueOf(set.isEmpty()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f389734i), java.lang.Long.valueOf(this.f389730e), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()), java.lang.Long.valueOf(hj.c.f363101a), java.lang.Long.valueOf(hj.c.f363102b - hj.c.f363101a));
        java.lang.String str = name + "@" + activity.hashCode();
        java.util.HashMap hashMap = this.f389741s;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(str);
        if (l17 == null) {
            l17 = 0L;
        }
        hashMap.put(str, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - l17.longValue()));
        if (this.f389730e == 0) {
            this.f389730e = android.os.SystemClock.uptimeMillis() - hj.c.f363101a;
        }
        if (this.f389734i) {
            this.f389731f = android.os.SystemClock.uptimeMillis() - hj.c.f363101a;
        } else if (set.contains(name)) {
            this.f389734i = true;
        } else if (set.isEmpty()) {
            if (z17) {
                this.f389731f = this.f389730e;
            } else {
                this.f389730e = 0L;
                this.f389731f = hj.c.f363102b - hj.c.f363101a;
            }
        } else if (z17) {
            this.f389731f = this.f389730e;
        } else {
            this.f389730e = 0L;
            this.f389731f = hj.c.f363102b - hj.c.f363101a;
        }
        if (this.f389731f > 0) {
            java.lang.Long l18 = (java.lang.Long) hashMap.get(str);
            if (l18 == null || l18.longValue() < 30000) {
                h(hj.c.f363102b - hj.c.f363101a, this.f389730e, this.f389731f, false);
            } else {
                oj.j.b("Matrix.StartupTracer", "%s cost too much time[%s] between activity create and onActivityFocused, just throw it.(createTime:%s) ", str, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - l17.longValue()), l17);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        oj.j.c("Matrix.StartupTracer", "activeActivityCount:%d, coldCost:%d", java.lang.Integer.valueOf(this.f389732g), java.lang.Long.valueOf(this.f389731f));
        if (this.f389732g == 0 && this.f389731f > 0) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            this.f389740r = uptimeMillis;
            oj.j.c("Matrix.StartupTracer", "lastCreateActivity:%d, activity:%s", java.lang.Long.valueOf(uptimeMillis), activity.getClass().getName());
            this.f389733h = true;
        }
        this.f389732g++;
        if (this.f389742t) {
            this.f389741s.put(activity.getClass().getName() + "@" + activity.hashCode(), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        oj.j.c("Matrix.StartupTracer", "activeActivityCount:%d", java.lang.Integer.valueOf(this.f389732g));
        this.f389732g--;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}

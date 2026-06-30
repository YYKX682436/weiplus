package kj;

/* loaded from: classes12.dex */
public class m extends kj.g0 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: w, reason: collision with root package name */
    public static final int f389774w = android.os.Build.VERSION.SDK_INT;

    /* renamed from: x, reason: collision with root package name */
    public static float f389775x = 60.0f;

    /* renamed from: e, reason: collision with root package name */
    public double f389776e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f389777f;

    /* renamed from: g, reason: collision with root package name */
    public final jj.f f389778g;

    /* renamed from: h, reason: collision with root package name */
    public jj.b f389779h;

    /* renamed from: i, reason: collision with root package name */
    public int f389780i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f389781m;

    /* renamed from: n, reason: collision with root package name */
    public final long f389782n;

    /* renamed from: o, reason: collision with root package name */
    public final long f389783o;

    /* renamed from: p, reason: collision with root package name */
    public final long f389784p;

    /* renamed from: q, reason: collision with root package name */
    public final long f389785q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f389786r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.Application f389787s;

    /* renamed from: t, reason: collision with root package name */
    public final kj.l f389788t;

    /* renamed from: u, reason: collision with root package name */
    public kj.g f389789u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f389790v;

    public m(android.app.Application application, ej.c cVar) {
        this.f389776e = 0.0d;
        this.f389777f = new java.util.HashSet();
        this.f389778g = new kj.e(this);
        this.f389780i = 0;
        this.f389781m = new java.util.HashSet();
        this.f389788t = new kj.l(this, null);
        this.f389790v = new java.util.concurrent.ConcurrentHashMap();
        boolean z17 = cVar.f334794h;
        this.f389786r = false;
        boolean z18 = cVar.f334793g;
        this.f389787s = application;
        long j17 = gj.o.f353900n.f353903f;
        this.f389782n = cVar.f334787a != null ? ((com.p314xaae8f345.mm.p849xbf8d97c1.o0) r5).a("clicfg_matrix_fps_dropped_frozen", 42) : 42;
        this.f389783o = cVar.f334787a != null ? ((com.p314xaae8f345.mm.p849xbf8d97c1.o0) r5).a("clicfg_matrix_fps_dropped_high", 24) : 24;
        this.f389785q = cVar.f334787a != null ? ((com.p314xaae8f345.mm.p849xbf8d97c1.o0) r5).a("clicfg_matrix_fps_dropped_normal", 3) : 3;
        this.f389784p = cVar.f334787a != null ? ((com.p314xaae8f345.mm.p849xbf8d97c1.o0) r5).a("clicfg_matrix_fps_dropped_middle", 9) : 9;
        oj.j.c("Matrix.FrameTracer", "[init] frameIntervalMs:%s isFPSEnable:%s", java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (this.f389786r) {
            i();
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (this.f389786r) {
            h();
        }
    }

    public void h() {
        oj.j.c("Matrix.FrameTracer", "forceDisable", new java.lang.Object[0]);
        this.f389779h = null;
        if (f389774w >= 24) {
            this.f389787s.unregisterActivityLifecycleCallbacks(this);
            this.f389781m.clear();
            ((java.util.concurrent.ConcurrentHashMap) this.f389790v).clear();
            kj.g gVar = this.f389789u;
            if (gVar != null) {
                l(gVar, false);
                this.f389789u = null;
                return;
            }
            return;
        }
        gj.o oVar = gj.o.f353900n;
        jj.f fVar = this.f389778g;
        synchronized (oVar.f353902e) {
            oVar.f353902e.remove(fVar);
            if (oVar.f353902e.isEmpty()) {
                oVar.f();
            }
        }
        this.f389777f.clear();
    }

    public void i() {
        oj.j.c("Matrix.FrameTracer", "forceEnable", new java.lang.Object[0]);
        if (f389774w < 24) {
            gj.o.f353900n.b(this.f389778g);
            return;
        }
        this.f389787s.registerActivityLifecycleCallbacks(this);
        kj.l lVar = this.f389788t;
        synchronized (this.f389781m) {
            this.f389781m.add(lVar);
        }
        if (ih.d.c()) {
            kj.g gVar = new kj.g();
            this.f389789u = gVar;
            k(gVar);
        }
    }

    public final float j(android.view.Window window) {
        return f389774w >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    public void k(jj.e eVar) {
        kj.l lVar = this.f389788t;
        synchronized (lVar) {
            if (eVar.c() >= 1 && eVar.d() >= 0) {
                java.lang.String mo141031xfb82e301 = eVar.mo141031xfb82e301();
                kj.j jVar = new kj.j(lVar.f389773d, eVar);
                if (mo141031xfb82e301 != null && !mo141031xfb82e301.isEmpty()) {
                    lVar.f389771b.put(mo141031xfb82e301, jVar);
                    oj.j.c("Matrix.FrameTracer", "register success. unspecifiedSceneMap.size=%d, specifiedSceneMap.size=%d", java.lang.Integer.valueOf(lVar.f389772c.size()), java.lang.Integer.valueOf(lVar.f389771b.size()));
                    return;
                }
                lVar.f389772c.put(eVar, jVar);
                oj.j.c("Matrix.FrameTracer", "register success. unspecifiedSceneMap.size=%d, specifiedSceneMap.size=%d", java.lang.Integer.valueOf(lVar.f389772c.size()), java.lang.Integer.valueOf(lVar.f389771b.size()));
                return;
            }
            oj.j.b("Matrix.FrameTracer", "Illegal value, intervalMs=%d, threshold=%d, activity=%s", java.lang.Integer.valueOf(eVar.c()), java.lang.Integer.valueOf(eVar.d()), eVar.getClass().getName());
        }
    }

    public void l(jj.e eVar, boolean z17) {
        kj.j jVar;
        kj.l lVar = this.f389788t;
        synchronized (lVar) {
            java.lang.String mo141031xfb82e301 = eVar.mo141031xfb82e301();
            if (mo141031xfb82e301 != null && !mo141031xfb82e301.isEmpty()) {
                jVar = (kj.j) lVar.f389771b.remove(mo141031xfb82e301);
                if (jVar != null && z17) {
                    jVar.b();
                }
                oj.j.c("Matrix.FrameTracer", "unregister success. unspecifiedSceneMap.size=%d, specifiedSceneMap.size=%d", java.lang.Integer.valueOf(lVar.f389772c.size()), java.lang.Integer.valueOf(lVar.f389771b.size()));
            }
            jVar = (kj.j) lVar.f389772c.remove(eVar);
            if (jVar != null) {
                jVar.b();
            }
            oj.j.c("Matrix.FrameTracer", "unregister success. unspecifiedSceneMap.size=%d, specifiedSceneMap.size=%d", java.lang.Integer.valueOf(lVar.f389772c.size()), java.lang.Integer.valueOf(lVar.f389771b.size()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        try {
            activity.getWindow().removeOnFrameMetricsAvailableListener((android.view.Window.OnFrameMetricsAvailableListener) this.f389790v.remove(java.lang.Integer.valueOf(activity.hashCode())));
        } catch (java.lang.Throwable th6) {
            oj.j.b("Matrix.FrameTracer", "removeOnFrameMetricsAvailableListener error : " + th6.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kj.l lVar = this.f389788t;
        synchronized (lVar) {
            java.util.Iterator it = lVar.f389772c.values().iterator();
            while (it.hasNext()) {
                ((kj.j) it.next()).b();
            }
            java.util.Iterator it6 = lVar.f389771b.values().iterator();
            while (it6.hasNext()) {
                ((kj.j) it6.next()).b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activity.hashCode());
        java.util.Map map = this.f389790v;
        if (map.containsKey(valueOf)) {
            return;
        }
        float j17 = j(activity.getWindow());
        f389775x = j17;
        oj.j.c("Matrix.FrameTracer", "default refresh rate is %dHz", java.lang.Integer.valueOf((int) j17));
        kj.f fVar = new kj.f(this);
        map.put(java.lang.Integer.valueOf(activity.hashCode()), fVar);
        activity.getWindow().addOnFrameMetricsAvailableListener(fVar, oj.g.a());
        oj.j.c("Matrix.FrameTracer", "onActivityResumed addOnFrameMetricsAvailableListener", new java.lang.Object[0]);
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

    public m(android.app.Application application, int i17, int i18, int i19, int i27) {
        this.f389776e = 0.0d;
        this.f389777f = new java.util.HashSet();
        this.f389778g = new kj.e(this);
        this.f389780i = 0;
        this.f389781m = new java.util.HashSet();
        this.f389788t = new kj.l(this, null);
        this.f389790v = new java.util.concurrent.ConcurrentHashMap();
        this.f389786r = true;
        this.f389787s = application;
        long j17 = gj.o.f353900n.f353903f;
        this.f389782n = i17;
        this.f389783o = i18;
        this.f389785q = i27;
        this.f389784p = i19;
    }
}

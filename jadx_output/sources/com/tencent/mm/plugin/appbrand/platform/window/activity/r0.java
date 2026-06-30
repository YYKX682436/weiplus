package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public class r0 implements xi1.g {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.m0 f87646e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.j f87647f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.WindowInsets f87648g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.DisplayMetrics f87649h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.g f87650i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f87652n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f87653o;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f87645d = new android.content.MutableContextWrapper(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.platform.window.activity.WindowAndroidActivityImpl$ActivityLifecycleMonitor f87651m = new com.tencent.mm.plugin.appbrand.platform.window.activity.WindowAndroidActivityImpl$ActivityLifecycleMonitor(this);

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect[] f87654p = new android.graphics.Rect[4];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.content.Context] */
    public static android.util.DisplayMetrics A(android.app.Activity activity, boolean z17) {
        android.view.Display a17 = activity != null ? com.tencent.mm.plugin.appbrand.platform.window.activity.a.a(activity) : ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        if (activity != null) {
            android.view.View decorView = activity.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.g3 a18 = n3.b1.a(decorView);
            if (a18 != null) {
                a17.getRealMetrics(displayMetrics);
                if (z17) {
                    displayMetrics.heightPixels -= a18.a(2).f247047d;
                }
                return displayMetrics;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            a17.getRealMetrics(displayMetrics);
            android.app.Activity activity2 = activity;
            if (z17) {
                if (activity == null) {
                    activity2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                android.view.WindowManager windowManager = (android.view.WindowManager) b3.l.getSystemService(activity2, android.view.WindowManager.class);
                if (windowManager != null) {
                    displayMetrics.heightPixels -= windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
                }
            }
        } else {
            a17.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    @Override // xi1.g, xi1.s
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.platform.window.activity.j getOrientationHandler() {
        com.tencent.mm.plugin.appbrand.platform.window.activity.j jVar = this.f87647f;
        if (jVar == null || ((jVar instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.q) && ((com.tencent.mm.plugin.appbrand.platform.window.activity.q) jVar).f87639c != w())) {
            com.tencent.mm.plugin.appbrand.platform.window.activity.j jVar2 = this.f87647f;
            if (jVar2 != null) {
                jVar2.release();
            }
            this.f87647f = new com.tencent.mm.plugin.appbrand.platform.window.activity.q(this);
        }
        return this.f87647f;
    }

    public final android.graphics.Rect C(android.app.Activity activity, int i17) {
        int i18;
        int i19;
        android.view.WindowInsets windowInsets;
        android.view.View decorView = activity.getWindow().getDecorView();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.c(decorView)) {
            android.view.View decorView2 = activity.getWindow().getDecorView();
            i18 = decorView2.getWidth();
            i19 = decorView2.getHeight();
        } else {
            i18 = getVDisplayMetrics().widthPixels;
            i19 = getVDisplayMetrics().heightPixels;
        }
        if (!this.f87646e.a()) {
            return new android.graphics.Rect(0, 0, i18, i19);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            com.tencent.mm.plugin.appbrand.platform.window.activity.n0 n0Var = (com.tencent.mm.plugin.appbrand.platform.window.activity.n0) this.f87646e;
            synchronized (n0Var.f87608b) {
                windowInsets = n0Var.f87612f[i17];
            }
            if (windowInsets != null) {
                android.view.DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    return new android.graphics.Rect(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), i18 - displayCutout.getSafeInsetRight(), i19 - displayCutout.getSafeInsetBottom());
                }
                com.tencent.mars.xlog.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaGuarded api28 NULL getDisplayCutout, fallback impl");
            }
        }
        int c17 = this.f87646e.c();
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.graphics.Rect(0, 0, i18, i19) : new android.graphics.Rect(0, 0, i18 - c17, i19) : new android.graphics.Rect(0, 0, i18, i19 - c17) : new android.graphics.Rect(c17, 0, i18, i19) : new android.graphics.Rect(0, c17, i18, i19);
    }

    public boolean D() {
        return w() != null && this.f87653o;
    }

    public boolean E() {
        return w() != null && this.f87652n;
    }

    public final void G(android.content.Context context) {
        com.tencent.mm.plugin.appbrand.platform.window.activity.m0 n0Var;
        if (this.f87645d == context) {
            return;
        }
        if (u()) {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "resetContext, this:%s, new:%s, old:%s, stack:%s", getClass().getName(), context, this.f87645d, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        this.f87645d = context;
        android.app.Activity w17 = w();
        if (w17 == null) {
            n0Var = (com.tencent.mm.plugin.appbrand.platform.window.activity.m0) java.lang.reflect.Proxy.newProxyInstance(com.tencent.mm.plugin.appbrand.platform.window.activity.m0.class.getClassLoader(), new java.lang.Class[]{com.tencent.mm.plugin.appbrand.platform.window.activity.m0.class}, new com.tencent.mm.plugin.appbrand.platform.window.activity.l0());
        } else {
            n0Var = android.os.Build.VERSION.SDK_INT >= 28 ? new com.tencent.mm.plugin.appbrand.platform.window.activity.n0(w17) : new com.tencent.mm.plugin.appbrand.platform.window.activity.q0(w17);
        }
        this.f87646e = n0Var;
        getOrientationHandler();
        android.app.Activity w18 = w();
        if (w18 != null) {
            this.f87648g = com.tencent.mm.ui.qk.b(w18);
        }
        this.f87649h = null;
        this.f87653o = false;
        this.f87652n = false;
        this.f87651m.a(context);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        xi1.g gVar = (xi1.g) obj;
        if (gVar == null) {
            return -1;
        }
        return (this == gVar || ((gVar instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) && w() == ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) gVar).w())) ? 0 : -1;
    }

    @Override // xi1.g, xi1.s
    public xi1.m createFullscreenHandler(xi1.k kVar) {
        return new com.tencent.mm.plugin.appbrand.platform.window.activity.i(this, kVar);
    }

    @Override // xi1.s
    public boolean forceLightMode() {
        return false;
    }

    @Override // xi1.g
    public final android.content.Context getContext() {
        return this.f87645d;
    }

    @Override // xi1.g
    public xi1.e getNavigationBar() {
        int a17 = com.tencent.mm.ui.v9.a(this.f87645d);
        if (a17 <= 0) {
            return null;
        }
        xi1.e eVar = new xi1.e();
        eVar.f454701a = a17;
        return eVar;
    }

    @Override // xi1.g
    public android.graphics.Rect getSafeAreaInsets() {
        android.graphics.Rect rect;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = -1;
        try {
            android.app.Activity w17 = w();
            if (w17 == null) {
                com.tencent.mars.xlog.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets with NULL activity");
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
                objArr[1] = -1;
                objArr[2] = java.lang.Long.valueOf(elapsedRealtime2);
                com.tencent.mars.xlog.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, rotation:%d cost:%dms", objArr);
                return null;
            }
            if (w17.getWindow() == null) {
                com.tencent.mars.xlog.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets will NULL window");
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                objArr2[0] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
                objArr2[1] = -1;
                objArr2[2] = java.lang.Long.valueOf(elapsedRealtime3);
                com.tencent.mars.xlog.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, rotation:%d cost:%dms", objArr2);
                return null;
            }
            i17 = com.tencent.mm.plugin.appbrand.platform.window.activity.a.a(w17).getRotation();
            synchronized (this.f87654p) {
                rect = this.f87654p[i17];
                if (rect == null) {
                    rect = C(w17, i17);
                    this.f87654p[i17] = rect;
                }
            }
            long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            java.lang.Object[] objArr3 = new java.lang.Object[3];
            objArr3[0] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
            objArr3[1] = java.lang.Integer.valueOf(i17);
            objArr3[2] = java.lang.Long.valueOf(elapsedRealtime4);
            com.tencent.mars.xlog.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, rotation:%d cost:%dms", objArr3);
            return rect;
        } catch (java.lang.Throwable th6) {
            long elapsedRealtime5 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            java.lang.Object[] objArr4 = new java.lang.Object[3];
            objArr4[0] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
            objArr4[1] = java.lang.Integer.valueOf(i17);
            objArr4[2] = java.lang.Long.valueOf(elapsedRealtime5);
            com.tencent.mars.xlog.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, rotation:%d cost:%dms", objArr4);
            throw th6;
        }
    }

    @Override // xi1.s
    public float getScale() {
        return 1.0f;
    }

    @Override // xi1.s
    public xi1.f getStatusBar() {
        android.view.WindowInsets windowInsets;
        int d17;
        android.app.Activity w17 = w();
        if (w17 != null) {
            windowInsets = com.tencent.mm.ui.qk.b(w17);
            this.f87648g = windowInsets;
        } else {
            windowInsets = this.f87648g;
            if (windowInsets == null) {
                windowInsets = null;
            }
        }
        if (windowInsets != null) {
            d17 = windowInsets.getStableInsetTop();
        } else {
            android.content.Context context = this.f87645d;
            kotlin.jvm.internal.o.g(context, "context");
            nf.y yVar = nf.x.f336616b;
            d17 = yVar != null ? yVar.d(context) : fp.j0.a(context, 0);
        }
        xi1.f fVar = new xi1.f();
        fVar.f454702a = d17;
        if (w() != null) {
            fVar.f454703b = com.tencent.mm.plugin.appbrand.ui.na.j(w()) ? 8 : 0;
        }
        return fVar;
    }

    @Override // xi1.g, xi1.s
    public android.util.DisplayMetrics getVDisplayMetrics() {
        android.util.DisplayMetrics A = A(w(), true);
        this.f87649h = A;
        return A;
    }

    public android.content.Context h() {
        return this.f87645d;
    }

    @Override // xi1.g
    public boolean isInMultiWindowMode() {
        android.app.Activity w17 = w();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return w17 != null && w17.isInMultiWindowMode();
    }

    @Override // xi1.s
    public final boolean isLargeScreenWindow() {
        return com.tencent.mm.plugin.appbrand.utils.m3.b(this.f87645d);
    }

    @Override // xi1.g
    public boolean q5() {
        return false;
    }

    @Override // xi1.g, xi1.s
    public void setSoftOrientation(java.lang.String str) {
    }

    @Override // xi1.g
    public void setWindowDescription(xi1.d dVar) {
        if (w() == null || dVar == null) {
            return;
        }
        try {
            android.app.Activity w17 = w();
            int i17 = dVar.f454700c;
            w17.setTaskDescription(new android.app.ActivityManager.TaskDescription(dVar.f454698a, dVar.f454699b, android.graphics.Color.rgb(android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17))));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "setWindowDescription try1 e=%s", e17);
            try {
                w().setTaskDescription(new android.app.ActivityManager.TaskDescription(dVar.f454698a, dVar.f454699b, android.graphics.Color.rgb(android.graphics.Color.red(-16777216), android.graphics.Color.green(-16777216), android.graphics.Color.blue(-16777216))));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "setWindowDescription try2 e=%s", e18);
            }
        }
    }

    @Override // xi1.g, xi1.s
    public boolean shouldInLargeScreenCompatMode() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public final android.app.Activity w() {
        return q75.a.a(this.f87645d);
    }
}

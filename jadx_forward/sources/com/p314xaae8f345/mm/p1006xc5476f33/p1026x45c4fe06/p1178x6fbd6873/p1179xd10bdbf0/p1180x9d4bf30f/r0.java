package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public class r0 implements xi1.g {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0 f169179e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j f169180f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.WindowInsets f169181g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.DisplayMetrics f169182h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.g f169183i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f169185n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f169186o;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f169178d = new android.content.MutableContextWrapper(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.C12548xcd66c815 f169184m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.C12548xcd66c815(this);

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect[] f169187p = new android.graphics.Rect[4];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.content.Context] */
    public static android.util.DisplayMetrics A(android.app.Activity activity, boolean z17) {
        android.view.Display a17 = activity != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.a.a(activity) : ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        if (activity != null) {
            android.view.View decorView = activity.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.g3 a18 = n3.b1.a(decorView);
            if (a18 != null) {
                a17.getRealMetrics(displayMetrics);
                if (z17) {
                    displayMetrics.heightPixels -= a18.a(2).f328580d;
                }
                return displayMetrics;
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            a17.getRealMetrics(displayMetrics);
            android.app.Activity activity2 = activity;
            if (z17) {
                if (activity == null) {
                    activity2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                android.view.WindowManager windowManager = (android.view.WindowManager) b3.l.m9714xac92a5d0(activity2, android.view.WindowManager.class);
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
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j mo51612x60543150() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j jVar = this.f169180f;
        if (jVar == null || ((jVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.q) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.q) jVar).f169172c != w())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.j jVar2 = this.f169180f;
            if (jVar2 != null) {
                jVar2.mo52319x41012807();
            }
            this.f169180f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.q(this);
        }
        return this.f169180f;
    }

    public final android.graphics.Rect C(android.app.Activity activity, int i17) {
        int i18;
        int i19;
        android.view.WindowInsets windowInsets;
        android.view.View decorView = activity.getWindow().getDecorView();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.c(decorView)) {
            android.view.View decorView2 = activity.getWindow().getDecorView();
            i18 = decorView2.getWidth();
            i19 = decorView2.getHeight();
        } else {
            i18 = mo48807xad90d981().widthPixels;
            i19 = mo48807xad90d981().heightPixels;
        }
        if (!this.f169179e.a()) {
            return new android.graphics.Rect(0, 0, i18, i19);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0) this.f169179e;
            synchronized (n0Var.f169141b) {
                windowInsets = n0Var.f169145f[i17];
            }
            if (windowInsets != null) {
                android.view.DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    return new android.graphics.Rect(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), i18 - displayCutout.getSafeInsetRight(), i19 - displayCutout.getSafeInsetBottom());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaGuarded api28 NULL getDisplayCutout, fallback impl");
            }
        }
        int c17 = this.f169179e.c();
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? new android.graphics.Rect(0, 0, i18, i19) : new android.graphics.Rect(0, 0, i18 - c17, i19) : new android.graphics.Rect(0, 0, i18, i19 - c17) : new android.graphics.Rect(c17, 0, i18, i19) : new android.graphics.Rect(0, c17, i18, i19);
    }

    public boolean D() {
        return w() != null && this.f169186o;
    }

    public boolean E() {
        return w() != null && this.f169185n;
    }

    public final void G(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0 n0Var;
        if (this.f169178d == context) {
            return;
        }
        if (u()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "resetContext, this:%s, new:%s, old:%s, stack:%s", getClass().getName(), context, this.f169178d, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        this.f169178d = context;
        android.app.Activity w17 = w();
        if (w17 == null) {
            n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0) java.lang.reflect.Proxy.newProxyInstance(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0.class.getClassLoader(), new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m0.class}, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.l0());
        } else {
            n0Var = android.os.Build.VERSION.SDK_INT >= 28 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n0(w17) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.q0(w17);
        }
        this.f169179e = n0Var;
        mo51612x60543150();
        android.app.Activity w18 = w();
        if (w18 != null) {
            this.f169181g = com.p314xaae8f345.mm.ui.qk.b(w18);
        }
        this.f169182h = null;
        this.f169186o = false;
        this.f169185n = false;
        this.f169184m.a(context);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        xi1.g gVar = (xi1.g) obj;
        if (gVar == null) {
            return -1;
        }
        return (this == gVar || ((gVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) && w() == ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) gVar).w())) ? 0 : -1;
    }

    @Override // xi1.g, xi1.s
    /* renamed from: createFullscreenHandler */
    public xi1.m mo51609xe80d1173(xi1.k kVar) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.i(this, kVar);
    }

    @Override // xi1.s
    /* renamed from: forceLightMode */
    public boolean mo52324x6c02152e() {
        return false;
    }

    @Override // xi1.g
    /* renamed from: getContext */
    public final android.content.Context mo52325x76847179() {
        return this.f169178d;
    }

    @Override // xi1.g
    /* renamed from: getNavigationBar */
    public xi1.e mo51611xad2f8da9() {
        int a17 = com.p314xaae8f345.mm.ui.v9.a(this.f169178d);
        if (a17 <= 0) {
            return null;
        }
        xi1.e eVar = new xi1.e();
        eVar.f536234a = a17;
        return eVar;
    }

    @Override // xi1.g
    /* renamed from: getSafeAreaInsets */
    public android.graphics.Rect mo51613x2ae93e46() {
        android.graphics.Rect rect;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = -1;
        try {
            android.app.Activity w17 = w();
            if (w17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets with NULL activity");
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
                objArr[1] = -1;
                objArr[2] = java.lang.Long.valueOf(elapsedRealtime2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, rotation:%d cost:%dms", objArr);
                return null;
            }
            if (w17.getWindow() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets will NULL window");
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                objArr2[0] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
                objArr2[1] = -1;
                objArr2[2] = java.lang.Long.valueOf(elapsedRealtime3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, rotation:%d cost:%dms", objArr2);
                return null;
            }
            i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.a.a(w17).getRotation();
            synchronized (this.f169187p) {
                rect = this.f169187p[i17];
                if (rect == null) {
                    rect = C(w17, i17);
                    this.f169187p[i17] = rect;
                }
            }
            long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            java.lang.Object[] objArr3 = new java.lang.Object[3];
            objArr3[0] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
            objArr3[1] = java.lang.Integer.valueOf(i17);
            objArr3[2] = java.lang.Long.valueOf(elapsedRealtime4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, rotation:%d cost:%dms", objArr3);
            return rect;
        } catch (java.lang.Throwable th6) {
            long elapsedRealtime5 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            java.lang.Object[] objArr4 = new java.lang.Object[3];
            objArr4[0] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
            objArr4[1] = java.lang.Integer.valueOf(i17);
            objArr4[2] = java.lang.Long.valueOf(elapsedRealtime5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.WindowAndroidActivityImpl", "getSafeAreaInsets forMainThread:%b, rotation:%d cost:%dms", objArr4);
            throw th6;
        }
    }

    @Override // xi1.s
    /* renamed from: getScale */
    public float mo51614x7520af94() {
        return 1.0f;
    }

    @Override // xi1.s
    /* renamed from: getStatusBar */
    public xi1.f mo51615x8408480b() {
        android.view.WindowInsets windowInsets;
        int d17;
        android.app.Activity w17 = w();
        if (w17 != null) {
            windowInsets = com.p314xaae8f345.mm.ui.qk.b(w17);
            this.f169181g = windowInsets;
        } else {
            windowInsets = this.f169181g;
            if (windowInsets == null) {
                windowInsets = null;
            }
        }
        if (windowInsets != null) {
            d17 = windowInsets.getStableInsetTop();
        } else {
            android.content.Context context = this.f169178d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            nf.y yVar = nf.x.f418149b;
            d17 = yVar != null ? yVar.d(context) : fp.j0.a(context, 0);
        }
        xi1.f fVar = new xi1.f();
        fVar.f536235a = d17;
        if (w() != null) {
            fVar.f536236b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.j(w()) ? 8 : 0;
        }
        return fVar;
    }

    @Override // xi1.g, xi1.s
    /* renamed from: getVDisplayMetrics */
    public android.util.DisplayMetrics mo48807xad90d981() {
        android.util.DisplayMetrics A = A(w(), true);
        this.f169182h = A;
        return A;
    }

    public android.content.Context h() {
        return this.f169178d;
    }

    @Override // xi1.g
    /* renamed from: isInMultiWindowMode */
    public boolean mo51617xea4a57dd() {
        android.app.Activity w17 = w();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return w17 != null && w17.isInMultiWindowMode();
    }

    @Override // xi1.s
    /* renamed from: isLargeScreenWindow */
    public final boolean mo51618xbcb3824d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.b(this.f169178d);
    }

    @Override // xi1.g
    public boolean q5() {
        return false;
    }

    @Override // xi1.g, xi1.s
    /* renamed from: setSoftOrientation */
    public void mo51619xfa43b684(java.lang.String str) {
    }

    @Override // xi1.g
    /* renamed from: setWindowDescription */
    public void mo48810x4820daa(xi1.d dVar) {
        if (w() == null || dVar == null) {
            return;
        }
        try {
            android.app.Activity w17 = w();
            int i17 = dVar.f536233c;
            w17.setTaskDescription(new android.app.ActivityManager.TaskDescription(dVar.f536231a, dVar.f536232b, android.graphics.Color.rgb(android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17))));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "setWindowDescription try1 e=%s", e17);
            try {
                w().setTaskDescription(new android.app.ActivityManager.TaskDescription(dVar.f536231a, dVar.f536232b, android.graphics.Color.rgb(android.graphics.Color.red(-16777216), android.graphics.Color.green(-16777216), android.graphics.Color.blue(-16777216))));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.WindowAndroidActivityImpl", "setWindowDescription try2 e=%s", e18);
            }
        }
    }

    @Override // xi1.g, xi1.s
    /* renamed from: shouldInLargeScreenCompatMode */
    public boolean mo51620x1ab1e3d4() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public final android.app.Activity w() {
        return q75.a.a(this.f169178d);
    }
}

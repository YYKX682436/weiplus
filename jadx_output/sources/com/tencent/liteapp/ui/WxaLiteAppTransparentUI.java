package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class WxaLiteAppTransparentUI extends com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI implements com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback {

    /* renamed from: z1, reason: collision with root package name */
    public static final /* synthetic */ int f46083z1 = 0;
    public com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback Q;
    public com.tencent.liteapp.report.WxaLiteAppStartReport R;
    public android.os.Handler V;
    public com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig Y;
    public md.j Z;

    /* renamed from: l1, reason: collision with root package name */
    public md.h f46085l1;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f46087p0;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f46090r;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String[] f46097x0;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String[] f46100y0;

    /* renamed from: p, reason: collision with root package name */
    public int f46086p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f46089q = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f46091s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f46092t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f46093u = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f46094v = false;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f46095w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f46096x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f46099y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f46102z = "";
    public long A = 0;
    public long B = -1;
    public long C = -1;
    public float D = 1.0f;
    public int E = -1;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f46084J = "";
    public boolean K = false;
    public boolean L = true;
    public boolean M = true;
    public boolean N = false;
    public boolean P = true;
    public boolean S = false;
    public boolean T = false;
    public boolean U = false;
    public int W = 0;
    public boolean X = false;

    /* renamed from: p1, reason: collision with root package name */
    public final md.g f46088p1 = new com.tencent.liteapp.ui.h0(this);

    /* renamed from: x1, reason: collision with root package name */
    public long f46098x1 = -1;

    /* renamed from: y1, reason: collision with root package name */
    public final android.database.ContentObserver f46101y1 = new com.tencent.liteapp.ui.z(this, new android.os.Handler(android.os.Looper.getMainLooper()));

    public static void Q6(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI, java.lang.String str) {
        wxaLiteAppTransparentUI.getClass();
        try {
            if (com.tencent.mm.plugin.lite.LiteAppCenter.mCallback != null) {
                java.lang.String stringExtra = wxaLiteAppTransparentUI.getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", wxaLiteAppTransparentUI.f46095w);
                jSONObject.put("appUuid", java.lang.String.valueOf(wxaLiteAppTransparentUI.f46089q));
                jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, stringExtra);
                jSONObject.put("query", wxaLiteAppTransparentUI.f46096x);
                com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.dataReporting(str, jSONObject.toString(), wxaLiteAppTransparentUI.f46095w);
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppTransparentUI", e17.toString(), new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI
    public android.view.View O6() {
        android.view.View O6 = super.O6();
        md.f fVar = new md.f(this, O6);
        this.f46090r = fVar;
        fVar.addView(O6, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        return this.f46090r;
    }

    public final void R6(com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        if (this.S) {
            return;
        }
        this.S = true;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        if (liteAppReporter != null) {
            com.tencent.liteapp.report.WxaLiteAppStartReport.a(liteAppReporter, wxaLiteAppStartReport);
        }
        try {
            java.lang.String b17 = wxaLiteAppStartReport.b();
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "reportStartLiteApp %s", b17);
            com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.dataReporting("startLiteAppTimeLine", b17, this.f46095w);
            }
        } catch (java.lang.Exception e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppTransparentUI", e17.toString(), new java.lang.Object[0]);
        }
    }

    public final void S6(boolean z17, boolean z18) {
        android.util.Size size;
        if (this.A == 0) {
            return;
        }
        android.graphics.Point c17 = es.u.c(this);
        android.graphics.Point b17 = es.u.b(this);
        android.content.Context context = zc.c.f471339b;
        if (context == null) {
            kotlin.jvm.internal.o.o("appContext");
            throw null;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i17 = b17.x;
        int i18 = b17.y;
        double d17 = i17;
        int i19 = c17.x;
        if (d17 > i19 * 1.7d) {
            i17 = i19;
        }
        if (isInMultiWindowMode()) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getSystemService("window");
            if (windowManager != null) {
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    int width = windowManager.getCurrentWindowMetrics().getBounds().width();
                    int height = windowManager.getCurrentWindowMetrics().getBounds().height();
                    if (width != 0 && height != 0) {
                        size = new android.util.Size(width, height);
                    }
                } else {
                    android.graphics.Point point = new android.graphics.Point();
                    windowManager.getDefaultDisplay().getRealSize(point);
                    size = (point.x == 0 || point.y == 0) ? new android.util.Size(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : new android.util.Size(point.x, point.y);
                }
                i17 = size.getWidth();
                int height2 = size.getHeight();
                kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "in MultiWindowMode %s", size.toString());
                i18 = height2;
            }
            size = new android.util.Size(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
            i17 = size.getWidth();
            int height22 = size.getHeight();
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "in MultiWindowMode %s", size.toString());
            i18 = height22;
        }
        int i27 = 0;
        if (z17) {
            int height3 = this.f46090r.getHeight();
            if (height3 < i18 && this.M) {
                int b18 = md.n.b(this, this.E);
                this.E = b18;
                if (java.lang.Math.abs(b18 - (i18 - height3)) < 10) {
                    this.M = false;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("activityId", getFlutterViewId());
                    hashMap.put("with", java.lang.Boolean.FALSE);
                    kx5.n.h().j(this.f46080m, "withNavigationBar", hashMap);
                }
            } else if (!this.M) {
                this.M = true;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("activityId", getFlutterViewId());
                hashMap2.put("with", java.lang.Boolean.TRUE);
                kx5.n.h().j(this.f46080m, "withNavigationBar", hashMap2);
            }
        }
        float f17 = displayMetrics.density;
        int cacheNavigationBarHeight = com.tencent.mm.plugin.lite.LiteAppCenter.cacheNavigationBarHeight(this, this.E, this.f46089q);
        this.E = cacheNavigationBarHeight;
        this.E = md.n.b(this, cacheNavigationBarHeight);
        int e17 = md.n.e(this);
        boolean z19 = this.K;
        boolean z27 = getResources().getConfiguration().orientation == 2;
        this.K = z27;
        if (!z18 && z27 == z19 && i17 == this.F && i18 == this.G && e17 == this.I && this.E == this.H) {
            return;
        }
        this.F = i17;
        this.G = i18;
        this.I = e17;
        int i28 = this.E;
        this.H = i28;
        if (z27) {
            com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(this.f46089q, e17 / f17, 0.0f, i28 / f17, 0.0f, false);
            this.E = 0;
        } else {
            int i29 = this.f46091s;
            com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(this.f46089q, 0.0f, i29 != 0 ? e17 / f17 : 0.0f, 0.0f, (i29 == 3 || i29 == 7) ? i28 / f17 : 0.0f, false);
            i27 = e17;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.setDisplayParams(this.f46089q, i17 / f17, i18 / f17, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, 48, i27 / f17, this.E / f17);
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density));
    }

    public final void T6(int i17) {
        this.f46091s = i17;
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "setWindowFlags mFlags=%d mWindowFlags=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f46092t));
        if (this.f46092t > 0) {
            getWindow().clearFlags(this.f46092t);
            this.f46092t = -1;
        }
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() | 1024 | 512 | 256;
        if (i17 == 5) {
            systemUiVisibility |= 4100;
        } else if (i17 == 7) {
            systemUiVisibility |= 4102;
        }
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    public final void U6() {
        if (this.f46090r != null) {
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "addOnGlobalLayoutListener activityId=%d", java.lang.Long.valueOf(this.C));
            this.f46090r.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.liteapp.ui.l0(this, new java.lang.ref.WeakReference(this)));
        }
    }

    @Override // ox5.l
    public boolean b0(java.lang.Runnable runnable) {
        if (this.W == 0) {
            return false;
        }
        return com.tencent.mm.plugin.lite.LiteAppCenter.keepAlive(this.f46095w + "_" + this.f46099y + "_" + this.f46096x, this.f46080m, this.f46089q, this.f46102z, this.W, runnable, 0);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
        new android.os.Handler(getMainLooper()).post(new com.tencent.liteapp.ui.e0(this, intent));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void enterFullScreen() {
        this.f46093u = this.f46091s;
        T6(7);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void exitFullScreen() {
        T6(this.f46093u);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getAppUuid() {
        return this.f46089q;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.content.Context getCurrentContext() {
        return this;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public long getDataUuid() {
        return this.f46098x1;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public android.os.Bundle getExtraData() {
        if (getIntent().hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            return getIntent().getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        }
        return null;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF45967f() {
        return this.f46080m;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, mx5.b
    public java.lang.String getFlutterViewId() {
        kd.c.a("WxaLiteApp.WxaLiteAppTransparentUI", "getFlutterViewId %s", java.lang.Long.valueOf(this.C));
        return java.lang.String.valueOf(this.C);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, mx5.b
    public java.lang.String getFlutterViewName() {
        return java.lang.String.valueOf(this.B);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (this.f46079i == null) {
            super.getE();
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.Long.valueOf(this.f46079i.appUuid));
        hashMap.put("appId", this.f46079i.appId);
        hashMap.put("appPtr", java.lang.Long.valueOf(this.f46079i.appPtr));
        hashMap.put("pageViewId", java.lang.Long.valueOf(this.f46079i.pageId));
        hashMap.put("basePath", this.f46079i.basePath);
        hashMap.put("pageRenderPtr", java.lang.Long.valueOf(this.f46079i.renderId));
        hashMap.put("flags", java.lang.Integer.valueOf(this.f46079i.flags));
        hashMap.put(ya.b.SUCCESS, java.lang.Integer.valueOf(this.f46079i.success));
        hashMap.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo getSystemInfo(int i17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo systemInfo = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback.getSystemInfo(this.E);
        systemInfo.appId = this.f46095w;
        systemInfo.isHalfScreen = false;
        return systemInfo;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    /* renamed from: getWxaLiteAppActivity */
    public android.app.Activity getF45975q() {
        return this;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public boolean hasCutOut() {
        return es.u.d(this, false);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void hideKeyboard() {
        ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f46090r.getWindowToken(), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (es.u.g() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L17;
     */
    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isDarkMode() {
        /*
            r4 = this;
            r4.getResources()
            java.lang.Boolean r0 = es.u.f256279a
            r1 = 1
            if (r0 != 0) goto Lf
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r1)
            es.u.f256279a = r0
        Lf:
            java.lang.Boolean r0 = es.u.f256279a
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L35
            java.lang.Boolean r0 = es.u.f256284f
            if (r0 != 0) goto L20
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            es.u.f256284f = r0
        L20:
            java.lang.Boolean r0 = es.u.f256284f
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2e
            boolean r0 = es.u.g()
            if (r0 == 0) goto L35
        L2e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 < r3) goto L35
            goto L36
        L35:
            r1 = r2
        L36:
            if (r1 != 0) goto L3f
            boolean r0 = es.u.f()
            if (r0 != 0) goto L3f
            goto L43
        L3f:
            boolean r2 = es.u.e()
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.ui.WxaLiteAppTransparentUI.isDarkMode():boolean");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void keyboardEnable(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void navigateBack(boolean z17) {
        new android.os.Handler(getMainLooper()).post(new com.tencent.liteapp.ui.p0(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppTransparentUI", "Check BaseLib Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppTransparentUI", "Check Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "configuration change h=%d w=%d", java.lang.Integer.valueOf(configuration.screenHeightDp), java.lang.Integer.valueOf(configuration.screenWidthDp));
        boolean isDarkMode = isDarkMode();
        if (isDarkMode != this.f46094v) {
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "DarkMode change %b", java.lang.Boolean.valueOf(isDarkMode));
            this.f46094v = isDarkMode;
            com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(isDarkMode);
        }
        int i17 = configuration.orientation;
        if (i17 == 2 && !this.K) {
            this.K = true;
            P6();
            int i18 = this.f46091s;
            if (i18 == 5 || i18 == 7) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 4100);
            return;
        }
        if (i17 == 1 && this.K) {
            this.K = false;
            P6();
            int i19 = this.f46091s;
            if (i19 == 5 || i19 == 7) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-4101));
            return;
        }
        float f17 = configuration.fontScale;
        if (f17 == this.D || !com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem) {
            return;
        }
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "fontScale change %b", java.lang.Float.valueOf(f17));
        float f18 = configuration.fontScale;
        this.D = f18;
        com.tencent.mm.plugin.lite.LiteAppCenter.updateFontScale(f18);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0270  */
    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteapp.ui.WxaLiteAppTransparentUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCreateLitePageViewFinish(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        int parseInt;
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "onCreateLitePageViewFinish appUuid: " + this.f46089q, new java.lang.Object[0]);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.R;
        if (wxaLiteAppStartReport != null && wxaLiteAppStartReport.I != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appUuid", java.lang.String.valueOf(this.f46089q));
            hashMap.put("pageId", java.lang.String.valueOf(pageInfo.pageId));
            hashMap.put(ya.b.SUCCESS, java.lang.String.valueOf(pageInfo.success));
            hashMap.put("isPreload", java.lang.String.valueOf(pageInfo.isPreload));
            com.tencent.liteapp.ui.WxaLiteAppUI.a7(this.R.I, "Android.UI.showView->onCreateLitePageViewFinish", false, hashMap);
        }
        this.f46079i = pageInfo;
        this.V.removeMessages(1);
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2 = this.R;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport3 = this.R;
        wxaLiteAppStartReport2.E = currentTimeMillis - wxaLiteAppStartReport3.D;
        wxaLiteAppStartReport3.C = pageInfo.success;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport4 = this.R;
        wxaLiteAppStartReport3.F = currentTimeMillis2 - wxaLiteAppStartReport4.f46002i;
        wxaLiteAppStartReport4.f46016z = pageInfo.isPreload;
        if (wxaLiteAppStartReport4.G != 0) {
            R6(wxaLiteAppStartReport4);
        }
        java.util.Map e17 = getE();
        if (e17 != null) {
            java.util.HashMap hashMap2 = (java.util.HashMap) e17;
            if (hashMap2.containsKey("appId")) {
                java.lang.String valueOf = java.lang.String.valueOf(hashMap2.get("appId"));
                if (!android.text.TextUtils.isEmpty(valueOf) && !valueOf.equals("null")) {
                    this.f46095w = valueOf;
                }
            }
            if (hashMap2.containsKey("appPtr")) {
                this.A = java.lang.Long.valueOf(hashMap2.get("appPtr").toString()).longValue();
            }
            if (hashMap2.containsKey("pageViewId")) {
                this.B = java.lang.Long.valueOf(hashMap2.get("pageViewId").toString()).longValue();
            }
            if (hashMap2.containsKey("activityId")) {
                this.C = java.lang.Long.valueOf(hashMap2.get("activityId").toString()).longValue();
            }
            if (hashMap2.containsKey("pageRenderPtr")) {
                java.lang.Long.valueOf(hashMap2.get("pageRenderPtr").toString()).longValue();
            }
            if (hashMap2.containsKey(ya.b.SUCCESS)) {
                java.lang.Long.valueOf(hashMap2.get(ya.b.SUCCESS).toString()).longValue();
            }
        }
        if (e17 != null) {
            java.util.HashMap hashMap3 = (java.util.HashMap) e17;
            if (hashMap3.containsKey("flags")) {
                try {
                    parseInt = java.lang.Integer.parseInt(hashMap3.get("flags").toString());
                } catch (java.lang.Exception unused) {
                }
                this.f46091s = parseInt;
            }
            parseInt = -1;
            this.f46091s = parseInt;
        }
        setFlags(pageInfo.flags);
        S6(false, false);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        md.g gVar;
        md.h hVar = this.f46085l1;
        if (hVar != null && (gVar = this.f46088p1) != null) {
            hVar.f325694f.remove(gVar);
        }
        android.os.Handler handler = this.V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetUICallback(this.f46089q, this.Q);
        com.tencent.mm.plugin.lite.LiteAppCenter.unsetReporter(this.f46089q);
        if (this.f46095w != null) {
            ld.d.f318046b.a().c(this.f46095w);
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        if (this.W > 0 && isFinishing()) {
            com.tencent.mm.plugin.lite.LiteAppCenter.willPopApp(this.f46095w, this.f46089q, true);
        }
        P6();
        ((md.f) this.f46090r).setForceHeight(es.u.b(this).y);
        super.onPause();
        if (this.N) {
            getWindow().clearFlags(128);
        }
        md.j jVar = this.Z;
        if (jVar != null) {
            jVar.f325700e.disable();
            jVar.f325699d = null;
            this.Z = null;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.unRegisterAudioBroadCaseReceiver(this);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f46090r.postDelayed(new com.tencent.liteapp.ui.k0(this), 100L);
        P6();
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "TimeRecord startLiteApp %s %d", this.f46095w, java.lang.Long.valueOf(px5.b.f358957a.a("startLiteApp" + this.f46095w)));
        super.onResume();
        if (this.N) {
            getWindow().addFlags(128);
        }
        if (this.Z == null) {
            this.Z = new md.j(getCurrentContext(), 2);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.registerAudioBroadCaseReceiver(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        java.lang.String str = this.f46096x;
        if (str != null && str.length() <= 307200) {
            bundle.putString("queryParam", this.f46096x);
        }
        if (!this.f46084J.isEmpty() && this.f46084J.length() <= 307200) {
            bundle.putString("referrerInfo", this.f46084J);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str2 = this.f46096x;
        objArr[0] = str2;
        objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        objArr[2] = bundle.toString();
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "onSaveInstanceState query:%s len:%d bundle:%s", objArr);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onShowPageTimeStamp(long j17, com.tencent.mm.plugin.lite.LiteAppCenter.PageShowInfo pageShowInfo) {
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = this.R;
        if (wxaLiteAppStartReport != null && wxaLiteAppStartReport.I != null && pageShowInfo != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appUuid", java.lang.String.valueOf(this.f46089q));
            hashMap.put("pageId", java.lang.String.valueOf(j17));
            hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.String.valueOf(pageShowInfo.timestamp));
            hashMap.put("codeCacheSwitch", java.lang.String.valueOf(pageShowInfo.codeCacheSwitch));
            hashMap.put("codeCacheResult", java.lang.String.valueOf(pageShowInfo.codeCacheResult));
            hashMap.put("compilePageCost", java.lang.String.valueOf(pageShowInfo.compilePageCost));
            hashMap.put("evalPageCost", java.lang.String.valueOf(pageShowInfo.evalPageCost));
            hashMap.put("evalBaseLibCost", java.lang.String.valueOf(pageShowInfo.evalBaseLibCost));
            hashMap.put("hitSnapshotSwitch", java.lang.String.valueOf(pageShowInfo.hitSnapshotSwitch));
            hashMap.put("snapshotRuntimeType", java.lang.String.valueOf(pageShowInfo.snapshotRuntimeType));
            if (!this.T) {
                this.T = true;
                com.tencent.liteapp.ui.WxaLiteAppUI.a7(this.R.I, "Android.UI.showView->onShowPageTimeStamp", false, hashMap);
            }
            if (!this.U) {
                this.U = true;
                com.tencent.liteapp.ui.WxaLiteAppUI.a7(this.R.I, "Android.Startup.ToOnShowPageTimeStamp", false, hashMap);
            }
        }
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport2 = this.R;
        if (wxaLiteAppStartReport2 == null) {
            kd.c.e("WxaLiteApp.WxaLiteAppTransparentUI", "onShowPageTimeStamp reportStartLiteApp fail. report is null.", new java.lang.Object[0]);
            return;
        }
        wxaLiteAppStartReport2.H = pageShowInfo;
        wxaLiteAppStartReport2.G = pageShowInfo.timestamp - wxaLiteAppStartReport2.f46002i;
        if (wxaLiteAppStartReport2.F != 0) {
            R6(wxaLiteAppStartReport2);
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), false, this.f46101y1);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppTransparentBaseUI, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getContentResolver().unregisterContentObserver(this.f46101y1);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            T6(this.f46091s);
        }
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openApp() {
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "openApp appUuid: " + this.f46089q, new java.lang.Object[0]);
        this.V.removeMessages(2);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void openWebView(java.util.Map map) {
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "openWebView", new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void releaseKeepAlive() {
        this.W = 0;
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void rightGestureEvent(java.lang.String str, boolean z17) {
        java.lang.String str2 = z17 ? "gesture" : "backpress";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str2);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(this.f46089q, java.lang.Integer.parseInt(str), "app.rightGesture", jSONObject);
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setFlags(int i17) {
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "setFlags %d old=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f46091s));
        if (this.f46091s == i17) {
            return;
        }
        runOnUiThread(new com.tencent.liteapp.ui.m0(this, i17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setForbidRightGestureEnable(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(this.C));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        new android.os.Handler(getMainLooper()).post(new com.tencent.liteapp.ui.f0(this, hashMap));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setIsPopGestureEnabled(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setKeepScreenOn(boolean z17) {
        runOnUiThread(new com.tencent.liteapp.ui.c0(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setPageOrientation(int i17) {
        runOnUiThread(new com.tencent.liteapp.ui.n0(this, i17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setScreenshotEnabled(boolean z17) {
        runOnUiThread(new com.tencent.liteapp.ui.d0(this, z17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setStatusBarHidden(boolean z17) {
        int i17 = this.f46091s;
        if (i17 == 5 || i17 == 7) {
            return;
        }
        int i18 = z17 ? 5892 : 1792;
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        runOnUiThread(new com.tencent.liteapp.ui.g0(this, i18));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void showPage(com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo) {
        this.f46079i = pageInfo;
        this.B = pageInfo.pageId;
        runOnUiThread(new com.tencent.liteapp.ui.o0(this, pageInfo));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateLong(long j17) {
        runOnUiThread(new com.tencent.liteapp.ui.a0(this, j17));
    }

    @Override // com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void vibrateShort(long j17, int i17) {
        runOnUiThread(new com.tencent.liteapp.ui.b0(this, j17, i17));
    }
}

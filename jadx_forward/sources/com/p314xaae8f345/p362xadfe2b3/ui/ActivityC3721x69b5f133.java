package com.p314xaae8f345.p362xadfe2b3.ui;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppTransparentUI */
/* loaded from: classes15.dex */
public class ActivityC3721x69b5f133 extends com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback {

    /* renamed from: z1, reason: collision with root package name */
    public static final /* synthetic */ int f127616z1 = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback Q;
    public com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 R;
    public android.os.Handler V;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig Y;
    public md.j Z;

    /* renamed from: l1, reason: collision with root package name */
    public md.h f127618l1;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f127620p0;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f127623r;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String[] f127630x0;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String[] f127633y0;

    /* renamed from: p, reason: collision with root package name */
    public int f127619p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f127622q = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f127624s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f127625t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f127626u = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f127627v = false;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f127628w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f127629x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f127632y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f127635z = "";
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
    public java.lang.String f127617J = "";
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
    public final md.g f127621p1 = new com.p314xaae8f345.p362xadfe2b3.ui.h0(this);

    /* renamed from: x1, reason: collision with root package name */
    public long f127631x1 = -1;

    /* renamed from: y1, reason: collision with root package name */
    public final android.database.ContentObserver f127634y1 = new com.p314xaae8f345.p362xadfe2b3.ui.z(this, new android.os.Handler(android.os.Looper.getMainLooper()));

    public static void Q6(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133, java.lang.String str) {
        activityC3721x69b5f133.getClass();
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2 != null) {
                java.lang.String stringExtra = activityC3721x69b5f133.getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", activityC3721x69b5f133.f127628w);
                jSONObject.put("appUuid", java.lang.String.valueOf(activityC3721x69b5f133.f127622q));
                jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, stringExtra);
                jSONObject.put("query", activityC3721x69b5f133.f127629x);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2.mo65539x7f55f5a4(str, jSONObject.toString(), activityC3721x69b5f133.f127628w);
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppTransparentUI", e17.toString(), new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64
    public android.view.View O6() {
        android.view.View O6 = super.O6();
        md.f fVar = new md.f(this, O6);
        this.f127623r = fVar;
        fVar.addView(O6, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        return this.f127623r;
    }

    public final void R6(com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
        if (this.S) {
            return;
        }
        this.S = true;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null) {
            com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943.a(abstractC3700xe41a2874, c3707xe60c5943);
        }
        try {
            java.lang.String b17 = c3707xe60c5943.b();
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "reportStartLiteApp %s", b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.mo65539x7f55f5a4("startLiteAppTimeLine", b17, this.f127628w);
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
        android.content.Context context = zc.c.f552872b;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
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
            int height3 = this.f127623r.getHeight();
            if (height3 < i18 && this.M) {
                int b18 = md.n.b(this, this.E);
                this.E = b18;
                if (java.lang.Math.abs(b18 - (i18 - height3)) < 10) {
                    this.M = false;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("activityId", mo28568x146a8a26());
                    hashMap.put("with", java.lang.Boolean.FALSE);
                    kx5.n.h().j(this.f127613m, "withNavigationBar", hashMap);
                }
            } else if (!this.M) {
                this.M = true;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("activityId", mo28568x146a8a26());
                hashMap2.put("with", java.lang.Boolean.TRUE);
                kx5.n.h().j(this.f127613m, "withNavigationBar", hashMap2);
            }
        }
        float f17 = displayMetrics.density;
        int m65257x13ca2084 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65257x13ca2084(this, this.E, this.f127622q);
        this.E = m65257x13ca2084;
        this.E = md.n.b(this, m65257x13ca2084);
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(this.f127622q, e17 / f17, 0.0f, i28 / f17, 0.0f, false);
            this.E = 0;
        } else {
            int i29 = this.f127624s;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(this.f127622q, 0.0f, i29 != 0 ? e17 / f17 : 0.0f, 0.0f, (i29 == 3 || i29 == 7) ? i28 / f17 : 0.0f, false);
            i27 = e17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65466xde3207a6(this.f127622q, i17 / f17, i18 / f17, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, 48, i27 / f17, this.E / f17);
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density));
    }

    public final void T6(int i17) {
        this.f127624s = i17;
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "setWindowFlags mFlags=%d mWindowFlags=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f127625t));
        if (this.f127625t > 0) {
            getWindow().clearFlags(this.f127625t);
            this.f127625t = -1;
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
        if (this.f127623r != null) {
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "addOnGlobalLayoutListener activityId=%d", java.lang.Long.valueOf(this.C));
            this.f127623r.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.p362xadfe2b3.ui.l0(this, new java.lang.ref.WeakReference(this)));
        }
    }

    @Override // ox5.l
    public boolean b0(java.lang.Runnable runnable) {
        if (this.W == 0) {
            return false;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65384x962be848(this.f127628w + "_" + this.f127632y + "_" + this.f127629x, this.f127613m, this.f127622q, this.f127635z, this.W, runnable, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
        new android.os.Handler(getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.e0(this, intent));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: enterFullScreen */
    public void mo28561x31f09cd3() {
        this.f127626u = this.f127624s;
        T6(7);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: exitFullScreen */
    public void mo28562xd02faf99() {
        T6(this.f127626u);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getAppUuid */
    public long mo28563xe7b2546() {
        return this.f127622q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getCurrentContext */
    public android.content.Context mo28564xc88b72ec() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getDataUuid */
    public long mo28565xe67daffb() {
        return this.f127631x1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getExtraData */
    public android.os.Bundle mo28566xf04ce124() {
        if (getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            return getIntent().getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF127500f() {
        return this.f127613m;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, mx5.b
    /* renamed from: getFlutterViewId */
    public java.lang.String mo28568x146a8a26() {
        kd.c.a("WxaLiteApp.WxaLiteAppTransparentUI", "getFlutterViewId %s", java.lang.Long.valueOf(this.C));
        return java.lang.String.valueOf(this.C);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, mx5.b
    /* renamed from: getFlutterViewName */
    public java.lang.String mo28569xa3f2e0d6() {
        return java.lang.String.valueOf(this.B);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (this.f127612i == null) {
            super.getE();
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.Long.valueOf(this.f127612i.f37285xd0ade97c));
        hashMap.put("appId", this.f127612i.f37283x58b7f1c);
        hashMap.put("appPtr", java.lang.Long.valueOf(this.f127612i.f37284xabe4810d));
        hashMap.put("pageViewId", java.lang.Long.valueOf(this.f127612i.f37290xc4a6040a));
        hashMap.put("basePath", this.f127612i.f37286x99620e96);
        hashMap.put("pageRenderPtr", java.lang.Long.valueOf(this.f127612i.f37293xe2813d51));
        hashMap.put("flags", java.lang.Integer.valueOf(this.f127612i.f37288x5cfee87));
        hashMap.put(ya.b.f77504xbb80cbe3, java.lang.Integer.valueOf(this.f127612i.f37295x90b54003));
        hashMap.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getSystemInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo28571x148d5373(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo65569x148d5373 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2.mo65569x148d5373(this.E);
        mo65569x148d5373.f37309x58b7f1c = this.f127628w;
        mo65569x148d5373.f37313x67343749 = false;
        return mo65569x148d5373;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getWxaLiteAppActivity */
    public android.app.Activity getF127508q() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: hasCutOut */
    public boolean mo28573xd48718e6() {
        return es.u.d(this, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: hideKeyboard */
    public void mo28574x3f895349() {
        ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f127623r.getWindowToken(), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (es.u.g() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L17;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: isDarkMode */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo28575x387a9983() {
        /*
            r4 = this;
            r4.getResources()
            java.lang.Boolean r0 = es.u.f337812a
            r1 = 1
            if (r0 != 0) goto Lf
            java.lang.Boolean r0 = new java.lang.Boolean
            r0.<init>(r1)
            es.u.f337812a = r0
        Lf:
            java.lang.Boolean r0 = es.u.f337812a
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L35
            java.lang.Boolean r0 = es.u.f337817f
            if (r0 != 0) goto L20
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            es.u.f337817f = r0
        L20:
            java.lang.Boolean r0 = es.u.f337817f
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133.mo28575x387a9983():boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: keyboardEnable */
    public void mo28576xa5ddbc4a(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: navigateBack */
    public void mo28577xc55eddf8(boolean z17) {
        new android.os.Handler(getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.p0(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo28578x2635de3e(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppTransparentUI", "Check BaseLib Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckSumFail */
    public void mo28579x2d9f160(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppTransparentUI", "Check Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "configuration change h=%d w=%d", java.lang.Integer.valueOf(configuration.screenHeightDp), java.lang.Integer.valueOf(configuration.screenWidthDp));
        boolean mo28575x387a9983 = mo28575x387a9983();
        if (mo28575x387a9983 != this.f127627v) {
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "DarkMode change %b", java.lang.Boolean.valueOf(mo28575x387a9983));
            this.f127627v = mo28575x387a9983;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(mo28575x387a9983);
        }
        int i17 = configuration.orientation;
        if (i17 == 2 && !this.K) {
            this.K = true;
            P6();
            int i18 = this.f127624s;
            if (i18 == 5 || i18 == 7) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 4100);
            return;
        }
        if (i17 == 1 && this.K) {
            this.K = false;
            P6();
            int i19 = this.f127624s;
            if (i19 == 5 || i19 == 7) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-4101));
            return;
        }
        float f17 = configuration.fontScale;
        if (f17 == this.D || !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b) {
            return;
        }
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "fontScale change %b", java.lang.Float.valueOf(f17));
        float f18 = configuration.fontScale;
        this.D = f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65513xeb611f72(f18);
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
    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCreateLitePageViewFinish */
    public void mo28580x62158af0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        int parseInt;
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "onCreateLitePageViewFinish appUuid: " + this.f127622q, new java.lang.Object[0]);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.R;
        if (c3707xe60c5943 != null && c3707xe60c5943.I != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appUuid", java.lang.String.valueOf(this.f127622q));
            hashMap.put("pageId", java.lang.String.valueOf(pageInfo.f37290xc4a6040a));
            hashMap.put(ya.b.f77504xbb80cbe3, java.lang.String.valueOf(pageInfo.f37295x90b54003));
            hashMap.put("isPreload", java.lang.String.valueOf(pageInfo.f37289xca75b57f));
            com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.a7(this.R.I, "Android.UI.showView->onCreateLitePageViewFinish", false, hashMap);
        }
        this.f127612i = pageInfo;
        this.V.removeMessages(1);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432 = this.R;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59433 = this.R;
        c3707xe60c59432.E = currentTimeMillis - c3707xe60c59433.D;
        c3707xe60c59433.C = pageInfo.f37295x90b54003;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59434 = this.R;
        c3707xe60c59433.F = currentTimeMillis2 - c3707xe60c59434.f127535i;
        c3707xe60c59434.f127549z = pageInfo.f37289xca75b57f;
        if (c3707xe60c59434.G != 0) {
            R6(c3707xe60c59434);
        }
        java.util.Map e17 = getE();
        if (e17 != null) {
            java.util.HashMap hashMap2 = (java.util.HashMap) e17;
            if (hashMap2.containsKey("appId")) {
                java.lang.String valueOf = java.lang.String.valueOf(hashMap2.get("appId"));
                if (!android.text.TextUtils.isEmpty(valueOf) && !valueOf.equals("null")) {
                    this.f127628w = valueOf;
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
            if (hashMap2.containsKey(ya.b.f77504xbb80cbe3)) {
                java.lang.Long.valueOf(hashMap2.get(ya.b.f77504xbb80cbe3).toString()).longValue();
            }
        }
        if (e17 != null) {
            java.util.HashMap hashMap3 = (java.util.HashMap) e17;
            if (hashMap3.containsKey("flags")) {
                try {
                    parseInt = java.lang.Integer.parseInt(hashMap3.get("flags").toString());
                } catch (java.lang.Exception unused) {
                }
                this.f127624s = parseInt;
            }
            parseInt = -1;
            this.f127624s = parseInt;
        }
        mo28586x52fbaf45(pageInfo.f37288x5cfee87);
        S6(false, false);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        md.g gVar;
        md.h hVar = this.f127618l1;
        if (hVar != null && (gVar = this.f127621p1) != null) {
            hVar.f407227f.remove(gVar);
        }
        android.os.Handler handler = this.V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65507x21a416e2(this.f127622q, this.Q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65506xad558b2a(this.f127622q);
        if (this.f127628w != null) {
            ld.d.f399579b.a().c(this.f127628w);
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        if (this.W > 0 && isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65522x1128d882(this.f127628w, this.f127622q, true);
        }
        P6();
        ((md.f) this.f127623r).m147176x4133a630(es.u.b(this).y);
        super.onPause();
        if (this.N) {
            getWindow().clearFlags(128);
        }
        md.j jVar = this.Z;
        if (jVar != null) {
            jVar.f407233e.disable();
            jVar.f407232d = null;
            this.Z = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65504xc3947b27(this);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f127623r.postDelayed(new com.p314xaae8f345.p362xadfe2b3.ui.k0(this), 100L);
        P6();
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "TimeRecord startLiteApp %s %d", this.f127628w, java.lang.Long.valueOf(px5.b.f440490a.a("startLiteApp" + this.f127628w)));
        super.onResume();
        if (this.N) {
            getWindow().addFlags(128);
        }
        if (this.Z == null) {
            this.Z = new md.j(mo28564xc88b72ec(), 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65440x9f16b22e(this);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        java.lang.String str = this.f127629x;
        if (str != null && str.length() <= 307200) {
            bundle.putString("queryParam", this.f127629x);
        }
        if (!this.f127617J.isEmpty() && this.f127617J.length() <= 307200) {
            bundle.putString("referrerInfo", this.f127617J);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str2 = this.f127629x;
        objArr[0] = str2;
        objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        objArr[2] = bundle.toString();
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "onSaveInstanceState query:%s len:%d bundle:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onShowPageTimeStamp */
    public void mo28581x97580b0b(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageShowInfo pageShowInfo) {
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.R;
        if (c3707xe60c5943 != null && c3707xe60c5943.I != null && pageShowInfo != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appUuid", java.lang.String.valueOf(this.f127622q));
            hashMap.put("pageId", java.lang.String.valueOf(j17));
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.String.valueOf(pageShowInfo.f37304x3492916));
            hashMap.put("codeCacheSwitch", java.lang.String.valueOf(pageShowInfo.f37297x681f1d29));
            hashMap.put("codeCacheResult", java.lang.String.valueOf(pageShowInfo.f37296x65712e12));
            hashMap.put("compilePageCost", java.lang.String.valueOf(pageShowInfo.f37298x715c824f));
            hashMap.put("evalPageCost", java.lang.String.valueOf(pageShowInfo.f37300xfe405fb8));
            hashMap.put("evalBaseLibCost", java.lang.String.valueOf(pageShowInfo.f37299x24cd2da5));
            hashMap.put("hitSnapshotSwitch", java.lang.String.valueOf(pageShowInfo.f37302x56f6388b));
            hashMap.put("snapshotRuntimeType", java.lang.String.valueOf(pageShowInfo.f37303xb1c876ce));
            if (!this.T) {
                this.T = true;
                com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.a7(this.R.I, "Android.UI.showView->onShowPageTimeStamp", false, hashMap);
            }
            if (!this.U) {
                this.U = true;
                com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.a7(this.R.I, "Android.Startup.ToOnShowPageTimeStamp", false, hashMap);
            }
        }
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432 = this.R;
        if (c3707xe60c59432 == null) {
            kd.c.e("WxaLiteApp.WxaLiteAppTransparentUI", "onShowPageTimeStamp reportStartLiteApp fail. report is null.", new java.lang.Object[0]);
            return;
        }
        c3707xe60c59432.H = pageShowInfo;
        c3707xe60c59432.G = pageShowInfo.f37304x3492916 - c3707xe60c59432.f127535i;
        if (c3707xe60c59432.F != 0) {
            R6(c3707xe60c59432);
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), false, this.f127634y1);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        getContentResolver().unregisterContentObserver(this.f127634y1);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            T6(this.f127624s);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: openApp */
    public void mo28582xb4b4bf77() {
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "openApp appUuid: " + this.f127622q, new java.lang.Object[0]);
        this.V.removeMessages(2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: openWebView */
    public void mo28583x3d315a6f(java.util.Map map) {
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "openWebView", new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: releaseKeepAlive */
    public void mo29032x856bf801() {
        this.W = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: rightGestureEvent */
    public void mo28585xf285d70d(java.lang.String str, boolean z17) {
        java.lang.String str2 = z17 ? "gesture" : "backpress";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, str2);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(this.f127622q, java.lang.Integer.parseInt(str), "app.rightGesture", jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setFlags */
    public void mo28586x52fbaf45(int i17) {
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "setFlags %d old=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f127624s));
        if (this.f127624s == i17) {
            return;
        }
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.m0(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setForbidRightGestureEnable */
    public void mo28587x5189f8a6(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(this.C));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        new android.os.Handler(getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.f0(this, hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setIsPopGestureEnabled */
    public void mo28588xf7fe169d(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setKeepScreenOn */
    public void mo28589xb6f22792(boolean z17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.c0(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setPageOrientation */
    public void mo28590xdaac6ff(int i17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.n0(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setScreenshotEnabled */
    public void mo28591xae4d72b9(boolean z17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.d0(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setStatusBarHidden */
    public void mo28592x1c40f709(boolean z17) {
        int i17 = this.f127624s;
        if (i17 == 5 || i17 == 7) {
            return;
        }
        int i18 = z17 ? 5892 : 1792;
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.g0(this, i18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: showPage */
    public void mo28593xebcbeb2c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        this.f127612i = pageInfo;
        this.B = pageInfo.f37290xc4a6040a;
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.o0(this, pageInfo));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: vibrateLong */
    public void mo28594xaee4608b(long j17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.a0(this, j17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: vibrateShort */
    public void mo28595x2e072c4d(long j17, int i17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.b0(this, j17, i17));
    }
}

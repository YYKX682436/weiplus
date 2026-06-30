package com.p314xaae8f345.p362xadfe2b3.ui;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppUI */
/* loaded from: classes15.dex */
public class ActivityC3722x408816c7 extends com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback {
    public static com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 L1;
    public java.lang.String[] A1;
    public java.lang.String[] B1;
    public md.h H1;
    public com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 X;
    public android.os.Handler Z;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback f127638p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig f127639p1;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f127642s;

    /* renamed from: x1, reason: collision with root package name */
    public md.j f127649x1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f127654z1;

    /* renamed from: q, reason: collision with root package name */
    public int f127640q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f127641r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f127643t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f127644u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f127645v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f127646w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f127647x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f127650y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f127653z = "";
    public java.lang.String A = "";
    public long B = 0;
    public long C = -1;
    public long D = -1;
    public float E = 1.0f;
    public int F = -1;
    public int G = 0;
    public int H = 0;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f127636J = 0;
    public boolean K = true;
    public java.lang.String L = "";
    public boolean M = true;
    public int N = -1;
    public int P = com.p314xaae8f345.mm.R.C30854x2dc211.f559351cc;
    public int Q = -1;
    public int R = com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4;
    public boolean S = false;
    public boolean T = true;
    public boolean U = true;
    public boolean V = false;
    public boolean W = false;
    public boolean Y = false;

    /* renamed from: x0, reason: collision with root package name */
    public int f127648x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f127651y0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public int f127637l1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.ImageView f127652y1 = null;
    public android.widget.ImageView C1 = null;
    public android.graphics.Bitmap D1 = null;
    public boolean E1 = false;
    public boolean F1 = false;
    public boolean G1 = false;
    public final md.g I1 = new com.p314xaae8f345.p362xadfe2b3.ui.a1(this);
    public long J1 = -1;
    public final android.database.ContentObserver K1 = new com.p314xaae8f345.p362xadfe2b3.ui.s0(this, new android.os.Handler(android.os.Looper.getMainLooper()));

    public static void T6(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, java.lang.String str) {
        activityC3722x408816c7.getClass();
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2 != null) {
                java.lang.String stringExtra = activityC3722x408816c7.getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", activityC3722x408816c7.f127647x);
                jSONObject.put("appUuid", java.lang.String.valueOf(activityC3722x408816c7.f127641r));
                jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, stringExtra);
                jSONObject.put("query", activityC3722x408816c7.f127650y);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2.mo65539x7f55f5a4(str, jSONObject.toString(), activityC3722x408816c7.f127647x);
            }
        } catch (org.json.JSONException e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppUI", e17.toString(), new java.lang.Object[0]);
        }
    }

    public static void X6(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7, int i17) {
        if (android.os.Build.VERSION.SDK_INT == 26) {
            activityC3722x408816c7.getClass();
            kd.c.e("WxaLiteApp.WxaLiteAppUI", "avoid setRequestedOrientation when Oreo", new java.lang.Object[0]);
            return;
        }
        activityC3722x408816c7.f127640q = i17;
        if (i17 == 0) {
            activityC3722x408816c7.setRequestedOrientation(1);
            return;
        }
        if (i17 == 1) {
            if (android.provider.Settings.System.getInt(activityC3722x408816c7.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                activityC3722x408816c7.setRequestedOrientation(10);
                return;
            } else {
                activityC3722x408816c7.setRequestedOrientation(1);
                return;
            }
        }
        if (i17 == 2) {
            activityC3722x408816c7.setRequestedOrientation(1);
        } else if (i17 == 3) {
            activityC3722x408816c7.setRequestedOrientation(6);
        }
    }

    public static void Y6(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7) {
        if (android.provider.Settings.System.getInt(activityC3722x408816c7.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            activityC3722x408816c7.setRequestedOrientation(10);
        } else {
            activityC3722x408816c7.setRequestedOrientation(1);
        }
    }

    private void Z6(com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
        if (this.Y) {
            return;
        }
        this.Y = true;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null) {
            com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943.a(abstractC3700xe41a2874, c3707xe60c5943);
        }
        try {
            java.lang.String b17 = c3707xe60c5943.b();
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "reportStartLiteApp %s", b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.mo65539x7f55f5a4("startLiteAppTimeLine", b17, this.f127647x);
            }
        } catch (java.lang.Exception e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppUI", e17.toString(), new java.lang.Object[0]);
        }
    }

    public static void a7(com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, java.lang.String str, boolean z17, java.util.HashMap hashMap) {
        if (abstractC3700xe41a2874 == null || hashMap == null) {
            return;
        }
        abstractC3700xe41a2874.mo28879x145c484d(str, z17, hashMap);
    }

    public static void b7(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = L1;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28878x145c484d(str, z17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c7(boolean z17, boolean z18) {
        android.util.Size size;
        if (this.B == 0) {
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
        int i27 = 0;
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
                i18 = size.getHeight();
                kd.c.c("WxaLiteApp.WxaLiteAppUI", "in MultiWindowMode", new java.lang.Object[0]);
            }
            size = new android.util.Size(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
            i17 = size.getWidth();
            i18 = size.getHeight();
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "in MultiWindowMode", new java.lang.Object[0]);
        }
        if (z17) {
            int height2 = this.f127642s.getHeight();
            if (height2 < i18 && this.U) {
                int b18 = md.n.b(this, this.F);
                this.F = b18;
                if (java.lang.Math.abs(b18 - (i18 - height2)) < 10) {
                    this.U = false;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("activityId", mo28568x146a8a26());
                    hashMap.put("with", java.lang.Boolean.FALSE);
                    kx5.n.h().j(this.f127570o, "withNavigationBar", hashMap);
                }
            } else if (!this.U) {
                this.U = true;
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("activityId", mo28568x146a8a26());
                hashMap2.put("with", java.lang.Boolean.TRUE);
                kx5.n.h().j(this.f127570o, "withNavigationBar", hashMap2);
            }
        }
        float f17 = displayMetrics.density;
        this.F = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65257x13ca2084(this, this.F, this.f127641r);
        int e17 = md.n.e(this);
        boolean z19 = this.S;
        boolean z27 = getResources().getConfiguration().orientation == 2;
        this.S = z27;
        if (!z18 && z27 == z19 && i17 == this.G && i18 == this.H && e17 == this.f127636J && this.F == this.I) {
            return;
        }
        this.G = i17;
        this.H = i18;
        this.f127636J = e17;
        int i28 = this.F;
        this.I = i28;
        if (!z27 || b17.x <= b17.y * 1.2d) {
            int i29 = this.f127643t;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(this.f127641r, 0.0f, i29 != 0 ? e17 / f17 : 0.0f, 0.0f, (i29 == 3 || i29 == 7) ? i28 / f17 : 0.0f, false);
            i27 = e17;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(this.f127641r, e17 / f17, 0.0f, i28 / f17, 0.0f, false);
            this.F = 0;
        }
        float f18 = 48;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65466xde3207a6(this.f127641r, i17 / f17, i18 / f17, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, f18, i27 / f17, this.F / f17);
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f title=%f statusBar=%d navigationBar=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density), java.lang.Float.valueOf(f18 * f17), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.F));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e7(int i17) {
        this.f127643t = i17;
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "setWindowFlags mFlags=%d mWindowFlags=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f127644u));
        if (this.f127644u > 0) {
            getWindow().clearFlags(this.f127644u);
            this.f127644u = -1;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void f7() {
        if (this.f127642s != null) {
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "addOnGlobalLayoutListener activityId=%d", java.lang.Long.valueOf(this.D));
            this.f127642s.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.p362xadfe2b3.ui.d1(this, new java.lang.ref.WeakReference(this)));
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8
    public android.view.View R6() {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "initView", new java.lang.Object[0]);
        android.view.View R6 = super.R6();
        this.f127642s = new md.f(this, R6);
        android.widget.ImageView imageView = new android.widget.ImageView(this);
        this.C1 = imageView;
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.C1.setVisibility(8);
        this.C1.setClickable(false);
        this.C1.setFocusable(false);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) R6;
        viewGroup.addView(this.C1, viewGroup.getChildCount());
        com.p314xaae8f345.p362xadfe2b3.ui.z0 z0Var = new com.p314xaae8f345.p362xadfe2b3.ui.z0(this);
        ox5.a aVar = this.f127565g;
        if (aVar != null) {
            aVar.f431333i = z0Var;
        }
        this.f127642s.addView(R6, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        return this.f127642s;
    }

    @Override // ox5.l
    public boolean b0(java.lang.Runnable runnable) {
        if (this.f127648x0 == 0) {
            return false;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65384x962be848(this.f127647x + "_" + this.f127653z + "_" + this.f127650y, this.f127570o, this.f127641r, this.A, this.f127648x0, runnable, this.f127637l1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
        new android.os.Handler(getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.x0(this, intent));
    }

    public void d7(int i17) {
        this.f127648x0 = i17;
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "setKeepAliveSeconds %d", java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: enterFullScreen */
    public void mo28561x31f09cd3() {
        this.f127645v = this.f127643t;
        e7(7);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: exitFullScreen */
    public void mo28562xd02faf99() {
        e7(this.f127645v);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        int i17 = this.Q;
        if (i17 >= 0) {
            overridePendingTransition(this.R, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getAppUuid */
    public long mo28563xe7b2546() {
        return this.f127641r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getCurrentContext */
    public android.content.Context mo28564xc88b72ec() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getDataUuid */
    public long mo28565xe67daffb() {
        return this.J1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getExtraData */
    public android.os.Bundle mo28566xf04ce124() {
        if (getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            return getIntent().getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF127500f() {
        return this.f127570o;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, mx5.b
    /* renamed from: getFlutterViewId */
    public java.lang.String mo28568x146a8a26() {
        kd.c.a("WxaLiteApp.WxaLiteAppUI", "getFlutterViewId %s", java.lang.Long.valueOf(this.D));
        return java.lang.String.valueOf(this.D);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, mx5.b
    /* renamed from: getFlutterViewName */
    public java.lang.String mo28569xa3f2e0d6() {
        return java.lang.String.valueOf(this.C);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (this.f127569n == null) {
            super.getE();
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.Long.valueOf(this.f127569n.f37285xd0ade97c));
        hashMap.put("appId", this.f127569n.f37283x58b7f1c);
        hashMap.put("appPtr", java.lang.Long.valueOf(this.f127569n.f37284xabe4810d));
        hashMap.put("pageViewId", java.lang.Long.valueOf(this.f127569n.f37290xc4a6040a));
        hashMap.put("basePath", this.f127569n.f37286x99620e96);
        hashMap.put("pageRenderPtr", java.lang.Long.valueOf(this.f127569n.f37293xe2813d51));
        hashMap.put("flags", java.lang.Integer.valueOf(this.f127569n.f37288x5cfee87));
        hashMap.put(ya.b.f77504xbb80cbe3, java.lang.Integer.valueOf(this.f127569n.f37295x90b54003));
        hashMap.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getSystemInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo28571x148d5373(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo65569x148d5373 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2.mo65569x148d5373(this.F);
        mo65569x148d5373.f37309x58b7f1c = this.f127647x;
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
        ((android.view.inputmethod.InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f127642s.getWindowToken(), 0);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.mo28575x387a9983():boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: keyboardEnable */
    public void mo28576xa5ddbc4a(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: navigateBack */
    public void mo28577xc55eddf8(boolean z17) {
        new android.os.Handler(getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.h1(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo28578x2635de3e(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppUI", "Check BaseLib Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckSumFail */
    public void mo28579x2d9f160(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppUI", "Check Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean mo28575x387a9983 = mo28575x387a9983();
        if (mo28575x387a9983 != this.f127646w) {
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "DarkMode change %b", java.lang.Boolean.valueOf(mo28575x387a9983));
            this.f127646w = mo28575x387a9983;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(mo28575x387a9983);
        }
        int i17 = configuration.orientation;
        if (i17 == 2 && !this.S) {
            this.S = true;
            S6();
            int i18 = this.f127643t;
            if (i18 == 5 || i18 == 7) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 4100);
            return;
        }
        if (i17 == 1 && this.S) {
            this.S = false;
            S6();
            int i19 = this.f127643t;
            if (i19 == 5 || i19 == 7) {
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-4101));
            return;
        }
        float f17 = configuration.fontScale;
        if (f17 == this.E || !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b) {
            return;
        }
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "fontScale change %b", java.lang.Float.valueOf(f17));
        float f18 = configuration.fontScale;
        this.E = f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65513xeb611f72(f18);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e9  */
    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r40) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCreateLitePageViewFinish */
    public void mo28580x62158af0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        int parseInt;
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "onCreateLitePageViewFinish appUuid: " + this.f127641r, new java.lang.Object[0]);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.X;
        if (c3707xe60c5943 != null && c3707xe60c5943.I != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appUuid", java.lang.String.valueOf(this.f127641r));
            hashMap.put("pageId", java.lang.String.valueOf(pageInfo.f37290xc4a6040a));
            hashMap.put(ya.b.f77504xbb80cbe3, java.lang.String.valueOf(pageInfo.f37295x90b54003));
            hashMap.put("isPreload", java.lang.String.valueOf(pageInfo.f37289xca75b57f));
            a7(this.X.I, "Android.UI.showView->onCreateLitePageViewFinish", false, hashMap);
        }
        this.f127569n = pageInfo;
        this.Z.removeMessages(1);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432 = this.X;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59433 = this.X;
        c3707xe60c59432.E = currentTimeMillis - c3707xe60c59433.D;
        c3707xe60c59433.C = pageInfo.f37295x90b54003;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59434 = this.X;
        c3707xe60c59433.F = currentTimeMillis2 - c3707xe60c59434.f127535i;
        c3707xe60c59434.f127549z = pageInfo.f37289xca75b57f;
        if (c3707xe60c59434.G != 0) {
            Z6(c3707xe60c59434);
        }
        java.util.Map e17 = getE();
        if (e17 != null) {
            java.util.HashMap hashMap2 = (java.util.HashMap) e17;
            if (hashMap2.containsKey("appId")) {
                java.lang.String valueOf = java.lang.String.valueOf(hashMap2.get("appId"));
                if (!android.text.TextUtils.isEmpty(valueOf) && !valueOf.equals("null")) {
                    this.f127647x = valueOf;
                }
            }
            if (hashMap2.containsKey("appPtr")) {
                this.B = java.lang.Long.valueOf(hashMap2.get("appPtr").toString()).longValue();
            }
            if (hashMap2.containsKey("pageViewId")) {
                this.C = java.lang.Long.valueOf(hashMap2.get("pageViewId").toString()).longValue();
            }
            if (hashMap2.containsKey("activityId")) {
                this.D = java.lang.Long.valueOf(hashMap2.get("activityId").toString()).longValue();
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
                this.f127643t = parseInt;
            }
            parseInt = -1;
            this.f127643t = parseInt;
        }
        mo28586x52fbaf45(pageInfo.f37288x5cfee87);
        c7(false, false);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        md.g gVar;
        md.h hVar = this.H1;
        if (hVar != null && (gVar = this.I1) != null) {
            hVar.f407227f.remove(gVar);
        }
        android.os.Handler handler = this.Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65507x21a416e2(this.f127641r, this.f127638p0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65506xad558b2a(this.f127641r);
        if (this.f127647x != null) {
            ld.d.f399579b.a().c(this.f127647x);
        }
        android.widget.ImageView imageView = this.C1;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        android.graphics.Bitmap bitmap = this.D1;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.D1.recycle();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        if (this.f127648x0 > 0 && isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65522x1128d882(this.f127647x, this.f127641r, true);
        }
        S6();
        super.onPause();
        if (this.V) {
            getWindow().clearFlags(128);
        }
        md.j jVar = this.f127649x1;
        if (jVar != null) {
            jVar.f407233e.disable();
            jVar.f407232d = null;
            this.f127649x1 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65504xc3947b27(this);
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.tencent.liteapp.ui.WxaLiteAppUI$$a
            /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:7:0x0013, B:9:0x0018, B:11:0x001c, B:13:0x0024, B:15:0x002a, B:17:0x003b, B:19:0x003f, B:21:0x0045, B:22:0x0051), top: B:6:0x0013 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p362xadfe2b3.ui.RunnableC3723x9cd32bba.run():void");
            }
        }, 60);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        S6();
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "TimeRecord startLiteApp %s %d", this.f127647x, java.lang.Long.valueOf(px5.b.f440490a.a("startLiteApp" + this.f127647x)));
        super.onResume();
        if (this.V) {
            getWindow().addFlags(128);
        }
        new android.os.Handler().postDelayed(new com.p314xaae8f345.p362xadfe2b3.ui.RunnableC3724x9cd32bbb(this), 200);
        if (this.f127649x1 == null) {
            this.f127649x1 = new md.j(mo28564xc88b72ec(), 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65440x9f16b22e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        java.lang.String str = this.f127650y;
        if (str != null && str.length() <= 307200) {
            bundle.putString("queryParam", this.f127650y);
        }
        if (!this.L.isEmpty() && this.L.length() <= 307200) {
            bundle.putString("referrerInfo", this.L);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str2 = this.f127650y;
        objArr[0] = str2;
        objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        objArr[2] = bundle.toString();
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "onSaveInstanceState query:%s len:%d bundle:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onShowPageTimeStamp */
    public void mo28581x97580b0b(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageShowInfo pageShowInfo) {
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.X;
        if (c3707xe60c5943 != null && c3707xe60c5943.I != null && pageShowInfo != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appUuid", java.lang.String.valueOf(this.f127641r));
            hashMap.put("pageId", java.lang.String.valueOf(j17));
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.String.valueOf(pageShowInfo.f37304x3492916));
            hashMap.put("codeCacheSwitch", java.lang.String.valueOf(pageShowInfo.f37297x681f1d29));
            hashMap.put("codeCacheResult", java.lang.String.valueOf(pageShowInfo.f37296x65712e12));
            hashMap.put("compilePageCost", java.lang.String.valueOf(pageShowInfo.f37298x715c824f));
            hashMap.put("evalPageCost", java.lang.String.valueOf(pageShowInfo.f37300xfe405fb8));
            hashMap.put("evalBaseLibCost", java.lang.String.valueOf(pageShowInfo.f37299x24cd2da5));
            hashMap.put("hitSnapshotSwitch", java.lang.String.valueOf(pageShowInfo.f37302x56f6388b));
            hashMap.put("snapshotRuntimeType", java.lang.String.valueOf(pageShowInfo.f37303xb1c876ce));
            if (!this.F1) {
                this.F1 = true;
                a7(this.X.I, "Android.UI.showView->onShowPageTimeStamp", false, hashMap);
            }
            if (!this.G1) {
                this.G1 = true;
                a7(this.X.I, "Android.Startup.ToOnShowPageTimeStamp", false, hashMap);
            }
        }
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432 = this.X;
        if (c3707xe60c59432 != null) {
            c3707xe60c59432.H = pageShowInfo;
            c3707xe60c59432.G = pageShowInfo.f37304x3492916 - c3707xe60c59432.f127535i;
            if (c3707xe60c59432.F != 0) {
                Z6(c3707xe60c59432);
            }
        } else {
            kd.c.e("WxaLiteApp.WxaLiteAppUI", "onShowPageTimeStamp reportStartLiteApp fail. report is null.", new java.lang.Object[0]);
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.p314xaae8f345.p362xadfe2b3.ui.y0(this), 1000L);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), false, this.K1);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        getContentResolver().unregisterContentObserver(this.K1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            e7(this.f127643t);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: openApp */
    public void mo28582xb4b4bf77() {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "openApp appUuid: " + this.f127641r, new java.lang.Object[0]);
        this.Z.removeMessages(2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: openWebView */
    public void mo28583x3d315a6f(java.util.Map map) {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "openWebView", new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: releaseKeepAlive */
    public void mo29032x856bf801() {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "releaseKeepAlive", new java.lang.Object[0]);
        this.f127648x0 = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: removeBackgroundImage */
    public void mo28584xa3a97a9() {
        android.widget.ImageView imageView;
        if (this.f127639p1.f37274x4d0b70cd == null || (imageView = this.f127652y1) == null) {
            return;
        }
        ((android.view.ViewGroup) imageView.getParent()).removeView(this.f127652y1);
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "remove backgroundImage " + this.f127652y1, new java.lang.Object[0]);
        this.f127652y1 = null;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(this.f127641r, java.lang.Integer.parseInt(str), "app.rightGesture", jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setFlags */
    public void mo28586x52fbaf45(int i17) {
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "setFlags %d old=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f127643t));
        if (this.f127643t == i17) {
            return;
        }
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.e1(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setForbidRightGestureEnable */
    public void mo28587x5189f8a6(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(this.D));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        new android.os.Handler(getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.i1(this, hashMap));
        this.W = z17;
        this.f146491d.m43750xbf325608(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setIsPopGestureEnabled */
    public void mo28588xf7fe169d(boolean z17) {
        this.K = !z17;
        this.f146491d.m43749x8e764904(!z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setKeepScreenOn */
    public void mo28589xb6f22792(boolean z17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.v0(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setPageOrientation */
    public void mo28590xdaac6ff(int i17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.f1(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setScreenshotEnabled */
    public void mo28591xae4d72b9(boolean z17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.w0(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setStatusBarHidden */
    public void mo28592x1c40f709(boolean z17) {
        int i17 = this.f127643t;
        if (i17 == 5 || i17 == 7) {
            return;
        }
        int i18 = z17 ? 5892 : 1792;
        if (getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.r0(this, i18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: showPage */
    public void mo28593xebcbeb2c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        this.f127569n = pageInfo;
        this.C = pageInfo.f37290xc4a6040a;
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.g1(this, pageInfo));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: vibrateLong */
    public void mo28594xaee4608b(long j17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.t0(this, j17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: vibrateShort */
    public void mo28595x2e072c4d(long j17, int i17) {
        runOnUiThread(new com.p314xaae8f345.p362xadfe2b3.ui.u0(this, j17, i17));
    }
}

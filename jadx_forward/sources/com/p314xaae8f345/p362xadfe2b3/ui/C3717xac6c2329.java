package com.p314xaae8f345.p362xadfe2b3.ui;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppBaseView */
/* loaded from: classes15.dex */
public class C3717xac6c2329 extends android.widget.FrameLayout implements ox5.l, p012xc85e97e9.p093xedfae76a.x, p012xc85e97e9.p093xedfae76a.y, mx5.b, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback {
    public static final /* synthetic */ int W = 0;
    public boolean A;
    public boolean B;
    public int C;
    public boolean D;
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 E;
    public final boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f127572J;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig K;
    public md.j L;
    public boolean M;
    public float N;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 T;
    public md.h U;
    public final md.g V;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f127573d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f127574e;

    /* renamed from: f, reason: collision with root package name */
    public ox5.a f127575f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f127576g;

    /* renamed from: h, reason: collision with root package name */
    public int f127577h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback f127578i;

    /* renamed from: m, reason: collision with root package name */
    public long f127579m;

    /* renamed from: n, reason: collision with root package name */
    public long f127580n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo f127581o;

    /* renamed from: p, reason: collision with root package name */
    public long f127582p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f127583q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f127584r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f127585s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f127586t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f127587u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f127588v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f127589w;

    /* renamed from: x, reason: collision with root package name */
    public long f127590x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f127591y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f127592z;

    static {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque.name();
    }

    public C3717xac6c2329(android.content.Context context) {
        super(context);
        this.f127573d = null;
        this.f127577h = 0;
        this.f127580n = -1L;
        this.f127582p = -1L;
        this.f127583q = false;
        this.f127585s = "";
        this.f127586t = "";
        this.f127587u = "";
        this.f127590x = 0L;
        this.f127591y = false;
        this.f127592z = false;
        this.A = false;
        this.B = true;
        this.C = 0;
        this.D = false;
        this.E = null;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f127572J = false;
        this.M = false;
        this.N = 1.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = false;
        this.S = false;
        this.V = new com.p314xaae8f345.p362xadfe2b3.ui.k(this);
        this.f127578i = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback(this.f127584r, this);
        this.F = m29023x95c7fa5f() != null;
    }

    private void d(com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
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
            kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "reportStartLiteApp %s", b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.mo65539x7f55f5a4("startLiteAppTimeLine", b17, c3707xe60c5943.f127530d);
            }
        } catch (java.lang.Exception e17) {
            kd.c.b("WxaLiteApp.WxaLiteAppBaseView", e17.toString(), new java.lang.Object[0]);
        }
    }

    public void a() {
        md.g gVar;
        if (this.f127583q) {
            mo29028xb01dfb57();
            m29031xc39f8281();
        }
        this.R = true;
        this.f127575f.g(true);
        p012xc85e97e9.p093xedfae76a.y m29023x95c7fa5f = m29023x95c7fa5f();
        if (m29023x95c7fa5f != null) {
            m29023x95c7fa5f.mo273xed6858b4().c(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65507x21a416e2(this.f127579m, this.f127578i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65506xad558b2a(this.f127579m);
        if (this.f127584r != null) {
            ld.d.f399579b.a().c(this.f127584r);
        }
        md.h hVar = this.U;
        if (hVar == null || (gVar = this.V) == null) {
            return;
        }
        hVar.f407227f.remove(gVar);
    }

    public void b() {
        if (this.f127575f == null) {
            return;
        }
        this.H = false;
        mo29028xb01dfb57();
        m29031xc39f8281();
        m29026xac79a11b();
    }

    @Override // ox5.l
    public boolean b0(java.lang.Runnable runnable) {
        if (this.C == 0) {
            return false;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65384x962be848(this.f127584r + "_" + this.f127585s + "_" + this.f127586t, this.f127577h, this.f127579m, this.f127587u, this.C, runnable, 0);
    }

    public void c() {
        addView(this.f127576g, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: cleanUpFlutterEngine */
    public void mo29002x72e1151a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: configureFlutterEngine */
    public void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
    }

    public void e() {
        if (this.f127590x <= 0) {
            return;
        }
        android.graphics.Point b17 = es.u.b(getContext());
        android.content.Context context = zc.c.f552872b;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
            throw null;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int mo29022xdaeb90db = mo29022xdaeb90db();
        int mo29021x68b790b2 = mo29021x68b790b2();
        float f17 = displayMetrics.density;
        float f18 = 48 * f17;
        long j17 = this.f127579m;
        float f19 = this.P;
        if (f19 <= 0.0f) {
            f19 = mo29022xdaeb90db / f17;
        }
        float f27 = this.Q;
        if (f27 <= 0.0f) {
            f27 = mo29021x68b790b2 / f17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65466xde3207a6(j17, f19, f27, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, f18 / f17, 0.0f, 0.0f);
        this.Q = 0.0f;
        this.P = 0.0f;
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "updateLvCppDisplayParams SetDisplayParams appPtr=%d, w=%d h=%d screen=%d,%d densityDpi=%d density=%f", java.lang.Long.valueOf(this.f127590x), java.lang.Integer.valueOf(mo29022xdaeb90db), java.lang.Integer.valueOf(mo29021x68b790b2), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: enterFullScreen */
    public void mo28561x31f09cd3() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: exitFullScreen */
    public void mo28562xd02faf99() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329.f():void");
    }

    public void g() {
        b();
    }

    /* renamed from: getActivityId */
    public java.lang.String m29018x685c2c80() {
        if (android.text.TextUtils.isEmpty(this.f127574e)) {
            this.f127574e = java.lang.String.format("%d-%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        }
        return this.f127574e;
    }

    @Override // ox5.l
    /* renamed from: getAppBundlePath */
    public java.lang.String mo29004x67b29512() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getAppUuid */
    public long mo28563xe7b2546() {
        return this.f127579m;
    }

    /* renamed from: getBackgroundMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode m29019x43aa88e7() {
        return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.transparent;
    }

    @Override // ox5.l
    /* renamed from: getCachedEngineId */
    public java.lang.String mo29005xd9afab35() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getCurrentContext */
    public android.content.Context mo28564xc88b72ec() {
        return super.getContext();
    }

    @Override // ox5.l
    /* renamed from: getDartEntrypointFunctionName */
    public java.lang.String mo29006x36e4a056() {
        return com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getDataUuid */
    public long mo28565xe67daffb() {
        return -1L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getExtraData */
    public android.os.Bundle mo28566xf04ce124() {
        android.app.Activity m29017x19263085 = m29017x19263085();
        if (m29017x19263085 != null && m29017x19263085.getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            return m29017x19263085.getIntent().getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        }
        return null;
    }

    @Override // ox5.l
    /* renamed from: getFlutterActivity */
    public mx5.b mo29007xf9fa8515() {
        return this;
    }

    @Override // mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF127500f() {
        return this.f127577h;
    }

    /* renamed from: getFlutterShellArgs */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 m29020xa48db9e7() {
        android.app.Activity m29017x19263085 = m29017x19263085();
        if (m29017x19263085 == null) {
            return null;
        }
        return io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.m137775x6f3c52e6(m29017x19263085.getIntent());
    }

    /* renamed from: getFlutterViewHeight */
    public int mo29021x68b790b2() {
        return getMeasuredHeight();
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewId */
    public java.lang.String mo28568x146a8a26() {
        kd.c.a("WxaLiteApp.WxaLiteAppBaseView", "getFlutterViewId %s", java.lang.Long.valueOf(this.f127580n));
        return java.lang.String.valueOf(this.f127580n);
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewName */
    public java.lang.String mo28569xa3f2e0d6() {
        return java.lang.String.valueOf(this.f127582p);
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (this.f127581o == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.Long.valueOf(this.f127581o.f37285xd0ade97c));
        hashMap.put("appId", this.f127584r);
        hashMap.put("appPtr", java.lang.Long.valueOf(this.f127581o.f37284xabe4810d));
        hashMap.put("pageViewId", java.lang.Long.valueOf(this.f127581o.f37290xc4a6040a));
        hashMap.put("basePath", this.f127581o.f37286x99620e96);
        hashMap.put("pageRenderPtr", java.lang.Long.valueOf(this.f127581o.f37293xe2813d51));
        hashMap.put("flags", java.lang.Integer.valueOf(this.f127581o.f37288x5cfee87));
        hashMap.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return hashMap;
    }

    /* renamed from: getFlutterViewWidth */
    public int mo29022xdaeb90db() {
        return getMeasuredWidth();
    }

    @Override // ox5.l
    /* renamed from: getInitialRoute */
    public java.lang.String mo29008x47d0e7db() {
        return "/";
    }

    @Override // ox5.l, p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return new p012xc85e97e9.p093xedfae76a.b0(this, true);
    }

    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y m29023x95c7fa5f() {
        boolean z17;
        java.lang.Object context = getContext();
        while (true) {
            z17 = context instanceof p012xc85e97e9.p093xedfae76a.y;
            if (z17 || !(context instanceof android.content.ContextWrapper)) {
                break;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (z17) {
            return (p012xc85e97e9.p093xedfae76a.y) context;
        }
        return null;
    }

    /* renamed from: getPageId */
    public long m29024x29bd2700() {
        return this.f127582p;
    }

    @Override // ox5.l
    /* renamed from: getRenderMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 mo29009x3569ec4f() {
        return m29019x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getSystemInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo28571x148d5373(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo65569x148d5373 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2.mo65569x148d5373(i17);
        mo65569x148d5373.f37309x58b7f1c = this.f127584r;
        mo65569x148d5373.f37313x67343749 = false;
        return mo65569x148d5373;
    }

    @Override // ox5.l
    /* renamed from: getTransparencyMode */
    public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b mo29010x88a6f491() {
        return m29019x43aa88e7() == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.opaque : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28578xae92d13b.transparent;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getWxaLiteAppActivity */
    public android.app.Activity getF127508q() {
        return m29017x19263085();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: hasCutOut */
    public boolean mo28573xd48718e6() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: hideKeyboard */
    public void mo28574x3f895349() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: isDarkMode */
    public boolean mo28575x387a9983() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: keyboardEnable */
    public void mo28576xa5ddbc4a(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: navigateBack */
    public void mo28577xc55eddf8(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.m(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.F && this.G) {
            m29030xb05099c3();
            mo29029x57429eec();
        }
        this.G = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onBodySizeChange */
    public void mo29025x4e43b612(java.lang.String str, long j17, long j18, float f17, float f18) {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onBodySizeChange appId=%s appUuid=%d, pageId=%d width=%f height=%f", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo28578x2635de3e(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppBaseView", "Check Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckSumFail */
    public void mo28579x2d9f160(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteApp.WxaLiteAppBaseView", "Check BaseLib Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean m65381x1cd9fc48 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65381x1cd9fc48();
        if (m65381x1cd9fc48 != this.M) {
            kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "DarkMode change %b", java.lang.Boolean.valueOf(m65381x1cd9fc48));
            this.M = m65381x1cd9fc48;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(m65381x1cd9fc48);
        }
        float f17 = configuration.fontScale;
        if (f17 == this.N || !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b) {
            return;
        }
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "fontScale change %b", java.lang.Float.valueOf(f17));
        float f18 = configuration.fontScale;
        this.N = f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65513xeb611f72(f18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCreateLitePageViewFinish */
    public void mo28580x62158af0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        this.f127581o = pageInfo;
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.T;
        if (c3707xe60c5943 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432 = this.T;
            c3707xe60c5943.E = currentTimeMillis - c3707xe60c59432.D;
            c3707xe60c59432.C = pageInfo.f37295x90b54003;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59433 = this.T;
            c3707xe60c59432.F = currentTimeMillis2 - c3707xe60c59433.f127535i;
            c3707xe60c59433.f127549z = pageInfo.f37289xca75b57f;
            if (c3707xe60c59433.G != 0) {
                d(c3707xe60c59433);
            }
        }
        java.util.Map e17 = getE();
        if (e17 != null) {
            if (e17.containsKey("appId")) {
                java.lang.String valueOf = java.lang.String.valueOf(e17.get("appId"));
                this.f127584r = valueOf;
                this.f127578i.f37221x58b7f1c = valueOf;
            }
            if (e17.containsKey("appPtr")) {
                this.f127590x = java.lang.Long.valueOf(e17.get("appPtr").toString()).longValue();
            }
            if (e17.containsKey("pageViewId")) {
                this.f127582p = java.lang.Long.valueOf(e17.get("pageViewId").toString()).longValue();
            }
            if (e17.containsKey("activityId")) {
                this.f127574e = e17.get("activityId").toString();
            }
            if (e17.containsKey("pageRenderPtr")) {
                java.lang.Long.valueOf(e17.get("pageRenderPtr").toString()).longValue();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65460xcc5360d2(this.f127579m, this.f127592z, this.A, false);
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.p362xadfe2b3.ui.p(this, new java.lang.ref.WeakReference(this)));
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    public void m29026xac79a11b() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onDestroy", new java.lang.Object[0]);
        if (this.R || this.f127583q) {
            return;
        }
        a();
    }

    @Override // ox5.l
    /* renamed from: onFlutterUiDisplayed */
    public void mo29011x6c956b30() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onLayoutComplete */
    public void mo29027xbed76e42(java.lang.String str, long j17, long j18, float f17, float f18) {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onLayoutComplete appId=%s appUuid=%d, pageId=%d width=%f height=%f", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onPause */
    public void mo29028xb01dfb57() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onPause", new java.lang.Object[0]);
        if (this.R || this.f127575f == null || this.I) {
            return;
        }
        md.j jVar = this.L;
        if (jVar != null) {
            jVar.f407233e.disable();
            jVar.f407232d = null;
            this.L = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65504xc3947b27(getContext());
        this.f127575f.i();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onResume */
    public void mo29029x57429eec() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onResume", new java.lang.Object[0]);
        if (this.f127575f == null || this.I) {
            return;
        }
        if (this.L == null) {
            this.L = new md.j(mo28564xc88b72ec(), 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65440x9f16b22e(getContext());
        this.f127575f.l();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onShowPageTimeStamp */
    public void mo28581x97580b0b(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageShowInfo pageShowInfo) {
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.T;
        if (c3707xe60c5943 != null) {
            c3707xe60c5943.H = pageShowInfo;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432 = this.T;
            c3707xe60c5943.G = currentTimeMillis - c3707xe60c59432.f127535i;
            if (c3707xe60c59432.F != 0) {
                d(c3707xe60c59432);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.content.Context context = zc.c.f552872b;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
            throw null;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(context.getResources().getDisplayMetrics().density);
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "updateLvCppDisplayParams updateSize appPtr=%d, w=%d,%d old=%d,%d density=%f", java.lang.Long.valueOf(this.f127590x), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), valueOf);
        float floatValue = i17 / valueOf.floatValue();
        float floatValue2 = i18 / valueOf.floatValue();
        if (this.f127590x > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65516xee5c006a(this.f127579m, floatValue, floatValue2);
        } else {
            this.Q = floatValue2;
            this.P = floatValue;
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_START)
    /* renamed from: onStart */
    public void m29030xb05099c3() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onStart", new java.lang.Object[0]);
        if (this.H) {
            return;
        }
        this.H = true;
        this.f127575f.m();
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onStop */
    public void m29031xc39f8281() {
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "onStop", new java.lang.Object[0]);
        if (this.R) {
            return;
        }
        this.f127575f.n();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: openApp */
    public void mo28582xb4b4bf77() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: openWebView */
    public void mo28583x3d315a6f(java.util.Map map) {
    }

    @Override // ox5.l
    /* renamed from: providePlatformPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6 mo29012xa3c24e87(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (activity == null || c28580x69eec95e == null) {
            return null;
        }
        return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28715x8c6f2da6(activity, c28580x69eec95e.m137436x69aaa6da());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: releaseKeepAlive */
    public void mo29032x856bf801() {
        this.C = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setCanOverScroll */
    public void mo29033x49531b6f(boolean z17) {
        this.B = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setFlags */
    public void mo28586x52fbaf45(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setForbidRightGestureEnable */
    public void mo28587x5189f8a6(boolean z17) {
        super.mo28587x5189f8a6(z17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(this.f127574e));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.l(this, hashMap));
        this.f127572J = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setIsPopGestureEnabled */
    public void mo28588xf7fe169d(boolean z17) {
    }

    @Override // android.view.View, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setKeepScreenOn */
    public void mo28589xb6f22792(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.n(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setPageOrientation */
    public void mo28590xdaac6ff(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setScreenshotEnabled */
    public void mo28591xae4d72b9(boolean z17) {
        android.app.Activity m29017x19263085 = m29017x19263085();
        if (m29017x19263085 == null) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.o(this, z17, m29017x19263085));
    }

    /* renamed from: setStore */
    public void m29034x53b6b99f(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        this.f127578i.m65627x53b6b99f(sVar);
    }

    @Override // ox5.l
    /* renamed from: shouldAttachEngineToActivity */
    public boolean mo29013xbfcd5884() {
        return m29017x19263085() != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: showPage */
    public void mo28593xebcbeb2c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        this.f127581o = pageInfo;
        this.f127582p = pageInfo.f37290xc4a6040a;
        if (this.f127584r.equals(pageInfo.f37283x58b7f1c)) {
            return;
        }
        e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: vibrateLong */
    public void mo28594xaee4608b(long j17) {
        android.os.Vibrator vibrator;
        android.app.Activity m29017x19263085 = m29017x19263085();
        if (m29017x19263085 == null || (vibrator = (android.os.Vibrator) m29017x19263085.getSystemService("vibrator")) == null) {
            return;
        }
        vibrator.vibrate(j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: vibrateShort */
    public void mo28595x2e072c4d(long j17, int i17) {
        android.os.Vibrator vibrator;
        android.app.Activity m29017x19263085 = m29017x19263085();
        if (m29017x19263085 == null || (vibrator = (android.os.Vibrator) m29017x19263085.getSystemService("vibrator")) == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, i17));
        }
    }

    @Override // ox5.l
    /* renamed from: getActivity, reason: merged with bridge method [inline-methods] */
    public android.app.Activity m29017x19263085() {
        for (android.content.Context context = getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }
}

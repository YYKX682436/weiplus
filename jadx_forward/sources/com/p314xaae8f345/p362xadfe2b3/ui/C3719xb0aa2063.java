package com.p314xaae8f345.p362xadfe2b3.ui;

/* renamed from: com.tencent.liteapp.ui.WxaLiteAppFragment */
/* loaded from: classes15.dex */
public class C3719xb0aa2063 extends com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback {
    public static final /* synthetic */ int Q = 0;
    public java.lang.String E;
    public java.lang.String[] F;
    public java.lang.String[] G;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback H;
    public com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig L;
    public md.h M;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo f127598r;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f127600t;

    /* renamed from: p, reason: collision with root package name */
    public long f127596p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f127597q = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f127599s = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f127601u = -1;

    /* renamed from: v, reason: collision with root package name */
    public boolean f127602v = false;

    /* renamed from: w, reason: collision with root package name */
    public float f127603w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f127604x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f127605y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f127606z = false;
    public boolean A = false;
    public boolean B = true;
    public int C = -1;
    public java.lang.String D = "";
    public com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 I = null;

    /* renamed from: J, reason: collision with root package name */
    public boolean f127595J = false;
    public final md.g N = new com.p314xaae8f345.p362xadfe2b3.ui.r(this);
    public long P = -1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) mo7430x19263085).mo65524x10864c08(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: enterFullScreen */
    public void mo28561x31f09cd3() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: exitFullScreen */
    public void mo28562xd02faf99() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getAppUuid */
    public long mo28563xe7b2546() {
        return this.f127596p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getCurrentContext */
    public android.content.Context mo28564xc88b72ec() {
        return super.mo7438x76847179();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getDataUuid */
    public long mo28565xe67daffb() {
        return this.P;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getExtraData */
    public android.os.Bundle mo28566xf04ce124() {
        if (mo7430x19263085().getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            return mo7430x19263085().getIntent().getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        }
        return null;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4, mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF127500f() {
        return this.f127563o;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4, mx5.b
    /* renamed from: getFlutterViewId */
    public java.lang.String mo28568x146a8a26() {
        kd.c.a("WxaLiteAp.WxaLiteAppFragment", "getFlutterViewId %s", java.lang.Long.valueOf(this.f127597q));
        return java.lang.String.valueOf(this.f127597q);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4, mx5.b
    /* renamed from: getFlutterViewName */
    public java.lang.String mo28569xa3f2e0d6() {
        return java.lang.String.valueOf(this.f127599s);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4, mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (this.f127598r == null) {
            super.getE();
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.Long.valueOf(this.f127598r.f37285xd0ade97c));
        hashMap.put("appId", this.f127557f.f14359x58b7f1c);
        hashMap.put("appPtr", java.lang.Long.valueOf(this.f127598r.f37284xabe4810d));
        hashMap.put("pageViewId", java.lang.Long.valueOf(this.f127598r.f37290xc4a6040a));
        hashMap.put("basePath", this.f127598r.f37286x99620e96);
        hashMap.put("pageRenderPtr", java.lang.Long.valueOf(this.f127598r.f37293xe2813d51));
        hashMap.put("flags", java.lang.Integer.valueOf(this.f127598r.f37288x5cfee87));
        hashMap.put("startTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: getSystemInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo28571x148d5373(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.SystemInfo mo65569x148d5373 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2.mo65569x148d5373(this.C);
        mo65569x148d5373.f37309x58b7f1c = this.f127559h;
        mo65569x148d5373.f37313x67343749 = true;
        return mo65569x148d5373;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: hasCutOut */
    public boolean mo28573xd48718e6() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: hideKeyboard */
    public void mo28574x3f895349() {
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) mo7430x19263085).mo65528x3f895349();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: isDarkMode */
    public boolean mo28575x387a9983() {
        return this.f127602v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: keyboardEnable */
    public void mo28576xa5ddbc4a(boolean z17) {
    }

    public final void m0(com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943) {
        if (this.f127595J) {
            return;
        }
        this.f127595J = true;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = c3707xe60c5943.I;
        if (abstractC3700xe41a2874 != null) {
            com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943.a(abstractC3700xe41a2874, c3707xe60c5943);
        }
        try {
            java.lang.String b17 = c3707xe60c5943.b();
            kd.c.c("WxaLiteAp.WxaLiteAppFragment", "reportStartLiteApp %s", b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2;
            if (iWxaLiteAppCallback != null) {
                iWxaLiteAppCallback.mo65539x7f55f5a4("startLiteAppTimeLine", b17, c3707xe60c5943.f127530d);
            }
        } catch (java.lang.Exception e17) {
            kd.c.b("WxaLiteAp.WxaLiteAppFragment", e17.toString(), new java.lang.Object[0]);
        }
    }

    public final void n0() {
        android.widget.FrameLayout frameLayout = this.f127600t;
        android.graphics.Point b17 = es.u.b(mo7438x76847179());
        android.content.Context context = zc.c.f552872b;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
            throw null;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        float f17 = displayMetrics.density;
        this.C = this.f127604x ? com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65257x13ca2084(mo7438x76847179(), this.C, this.f127596p) : 0;
        float f18 = 48 * f17;
        boolean z17 = m7460x893a2f6f().getConfiguration().orientation == 2;
        int e17 = md.n.e(mo7438x76847179());
        if (!z17 || b17.x <= b17.y * 1.2d) {
            float f19 = e17 / f17;
            int i17 = this.f127601u;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(this.f127596p, 0.0f, f19, 0.0f, (i17 == 3 || i17 == 7) ? this.C / f17 : 0.0f, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(this.f127596p, e17 / f17, 0.0f, this.C / f17, 0.0f, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65466xde3207a6(this.f127596p, measuredWidth / f17, measuredHeight / f17, b17.x / f17, b17.y / f17, displayMetrics.densityDpi, f17, f18 / f17, 0.0f, this.C / f17);
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "updateLvCppDisplayParams SetDisplayParams w=%d h=%d screen=%d,%d densityDpi=%d density=%f navigationBarHeight=%d", java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight), java.lang.Integer.valueOf(b17.x), java.lang.Integer.valueOf(b17.y), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density), java.lang.Integer.valueOf(this.C));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: navigateBack */
    public void mo28577xc55eddf8(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.v(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo28578x2635de3e(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteAp.WxaLiteAppFragment", "Check BaseLib Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckSumFail */
    public void mo28579x2d9f160(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kd.c.b("WxaLiteAp.WxaLiteAppFragment", "Check Sum Fail, appId: %s, path: %s", str, (java.lang.String) it.next());
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean m65381x1cd9fc48 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65381x1cd9fc48();
        if (m65381x1cd9fc48 != this.f127602v) {
            kd.c.c("WxaLiteAp.WxaLiteAppFragment", "DarkMode change %b", java.lang.Boolean.valueOf(m65381x1cd9fc48));
            this.f127602v = m65381x1cd9fc48;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(m65381x1cd9fc48);
        }
        float f17 = configuration.fontScale;
        if (f17 == this.f127603w || !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b) {
            return;
        }
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "fontScale change %b", java.lang.Float.valueOf(f17));
        float f18 = configuration.fontScale;
        this.f127603w = f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65513xeb611f72(f18);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        android.os.Bundle bundleExtra = mo7430x19263085().getIntent().hasExtra("bundle") ? mo7430x19263085().getIntent().getBundleExtra("bundle") : null;
        if (m7436x8619eaa0().containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0)) {
            this.f127557f = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) m7436x8619eaa0().getParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getWxaLiteAppInfo from Arguments KEY_LITE_APP", new java.lang.Object[0]);
        } else {
            if (m7436x8619eaa0().containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca)) {
                l0(m7436x8619eaa0().getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca), "");
                throw null;
            }
            if (mo7430x19263085().getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0)) {
                this.f127557f = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) mo7430x19263085().getIntent().getParcelableExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0);
                kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "getWxaLiteAppInfo from Activity Intent KEY_LITE_APP", new java.lang.Object[0]);
            } else {
                if (mo7430x19263085().getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca)) {
                    l0(mo7430x19263085().getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca), "");
                    throw null;
                }
                kd.c.e("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains app info.", new java.lang.Object[0]);
            }
        }
        if (m7436x8619eaa0().containsKey("query")) {
            this.f127561m = m7436x8619eaa0().getString("query");
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mQuery from Arguments KEY_QUERY", new java.lang.Object[0]);
        } else if (bundleExtra == null || !bundleExtra.containsKey("query")) {
            kd.c.e("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains query info.", new java.lang.Object[0]);
        } else {
            this.f127561m = bundleExtra.getString("query");
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mQuery from Activity Intent KEY_QUERY", new java.lang.Object[0]);
        }
        if (m7436x8619eaa0().containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f)) {
            this.f127560i = m7436x8619eaa0().getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mPage from Arguments KEY_PAGE", new java.lang.Object[0]);
        } else if (mo7430x19263085().getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f)) {
            this.f127560i = mo7430x19263085().getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mPage from Activity Intent KEY_PAGE", new java.lang.Object[0]);
        } else {
            kd.c.e("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains page info.", new java.lang.Object[0]);
        }
        if (m7436x8619eaa0().containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f127562n = m7436x8619eaa0().getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mSessionId from Arguments KEY_SESSION_ID", new java.lang.Object[0]);
        } else if (mo7430x19263085().getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
            this.f127562n = mo7430x19263085().getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            kd.c.c("WxaLiteAp.WxaLiteAppBaseFragment", "mSessionId from Activity Intent KEY_SESSION_ID", new java.lang.Object[0]);
        } else {
            kd.c.e("WxaLiteAp.WxaLiteAppBaseFragment", "Not contains sessionId info.", new java.lang.Object[0]);
        }
        if (bundleExtra != null && bundleExtra.containsKey(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14350x2800fa36)) {
            bundleExtra.getBoolean(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14350x2800fa36, false);
        }
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f127557f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo m65438xe4663f0e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65438xe4663f0e(c3712x3ed8a441.f14359x58b7f1c, this.f127560i, c3712x3ed8a441.f14369x346425);
        long j17 = m65438xe4663f0e.f37285xd0ade97c;
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "queryPreloadAppUuid: %d", java.lang.Long.valueOf(j17));
        if (j17 == 0) {
            this.f127596p = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65288x9f34180c();
            java.lang.String str = this.f127562n;
            this.f127562n = (str == null || str.isEmpty()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65290xce8d5c6e() : this.f127562n;
        } else {
            this.f127596p = j17;
            this.f127563o = m65438xe4663f0e.f37287x6c827afd;
            java.lang.String str2 = this.f127562n;
            this.f127562n = (str2 == null || str2.isEmpty()) ? m65438xe4663f0e.f37294x243a3e51 : this.f127562n;
        }
        this.f127597q = this.f127596p;
        super.mo7398x3e5a77bb(bundle);
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "WxaLiteAppFragment onCreate mContentView: " + this.f127600t, new java.lang.Object[0]);
        android.widget.FrameLayout frameLayout = this.f127600t;
        if (frameLayout != null) {
            md.h c17 = md.f.c(frameLayout);
            this.M = c17;
            c17.a(this.N);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCreateLitePageViewFinish */
    public void mo28580x62158af0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        this.f127598r = pageInfo;
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.K;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59432 = this.K;
        c3707xe60c5943.E = currentTimeMillis - c3707xe60c59432.D;
        c3707xe60c59432.C = pageInfo.f37295x90b54003;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c59433 = this.K;
        c3707xe60c59432.F = currentTimeMillis2 - c3707xe60c59433.f127535i;
        c3707xe60c59433.f127549z = pageInfo.f37289xca75b57f;
        if (c3707xe60c59433.G != 0) {
            m0(c3707xe60c59433);
        }
        java.util.Map e17 = getE();
        if (e17 != null) {
            java.util.HashMap hashMap = (java.util.HashMap) e17;
            if (hashMap.containsKey("appId")) {
                this.f127559h = java.lang.String.valueOf(hashMap.get("appId"));
            }
            if (hashMap.containsKey("appPtr")) {
                java.lang.Long.valueOf(hashMap.get("appPtr").toString()).longValue();
            }
            if (hashMap.containsKey("pageViewId")) {
                this.f127599s = java.lang.Long.valueOf(hashMap.get("pageViewId").toString()).longValue();
            }
            if (hashMap.containsKey("activityId")) {
                this.f127555d = hashMap.get("activityId").toString();
            }
            if (hashMap.containsKey("pageRenderPtr")) {
                java.lang.Long.valueOf(hashMap.get("pageRenderPtr").toString()).longValue();
            }
        }
        mo28586x52fbaf45(pageInfo.f37288x5cfee87);
        n0();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0206  */
    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater r25, android.view.ViewGroup r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063.mo7503x18bad100(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        md.g gVar;
        super.mo7504xac79a11b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65507x21a416e2(this.f127596p, this.H);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65506xad558b2a(this.f127596p);
        if (this.f127559h != null) {
            ld.d.f399579b.a().c(this.f127559h);
        }
        md.h hVar = this.M;
        if (hVar == null || (gVar = this.N) == null) {
            return;
        }
        hVar.f407227f.remove(gVar);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        java.lang.String str = this.f127561m;
        if (str != null && str.length() <= 307200) {
            bundle.putString("queryParam", this.f127561m);
        }
        if (!this.D.isEmpty() && this.D.length() <= 307200) {
            bundle.putString("referrerInfo", this.D);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str2 = this.f127561m;
        objArr[0] = str2;
        objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
        objArr[2] = bundle.toString();
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "onSaveInstanceState query:%s len:%d bundle:%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onShowPageTimeStamp */
    public void mo28581x97580b0b(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageShowInfo pageShowInfo) {
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943 = this.K;
        if (c3707xe60c5943 != null) {
            c3707xe60c5943.H = pageShowInfo;
            c3707xe60c5943.G = pageShowInfo.f37304x3492916 - c3707xe60c5943.f127535i;
            if (c3707xe60c5943.F != 0) {
                m0(c3707xe60c5943);
            }
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.C3715xdc67e8d4, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65474x16e2655c(java.util.Locale.getDefault().getLanguage(), java.util.Locale.getDefault().getCountry());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: openApp */
    public void mo28582xb4b4bf77() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: openWebView */
    public void mo28583x3d315a6f(java.util.Map map) {
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(this.f127596p, java.lang.Integer.parseInt(str), "app.rightGesture", jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setCanOverScroll */
    public void mo29033x49531b6f(boolean z17) {
        this.B = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setDragToClose */
    public void mo29035x78a556a7(boolean z17) {
        this.A = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setFlags */
    public void mo28586x52fbaf45(int i17) {
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "setFlags %d old=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f127601u));
        if (this.f127601u == i17) {
            return;
        }
        this.f127601u = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setForbidRightGestureEnable */
    public void mo28587x5189f8a6(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", java.lang.String.valueOf(this.f127597q));
        hashMap.put("enable", java.lang.Boolean.valueOf(z17));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.u(this, hashMap));
        this.f127606z = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setIsPopGestureEnabled */
    public void mo28588xf7fe169d(boolean z17) {
        this.f127605y = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setKeepScreenOn */
    public void mo28589xb6f22792(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.w(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setPageOrientation */
    public void mo28590xdaac6ff(int i17) {
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback) mo7430x19263085).mo65529xdaac6ff(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setScreenshotEnabled */
    public void mo28591xae4d72b9(boolean z17) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.p362xadfe2b3.ui.x(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: showPage */
    public void mo28593xebcbeb2c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: vibrateLong */
    public void mo28594xaee4608b(long j17) {
        android.os.Vibrator vibrator = (android.os.Vibrator) mo7430x19263085().getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: vibrateShort */
    public void mo28595x2e072c4d(long j17, int i17) {
        android.os.Vibrator vibrator = (android.os.Vibrator) mo7430x19263085().getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, i17));
        }
    }
}

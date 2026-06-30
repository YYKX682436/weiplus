package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@db5.a(m123858x6ac9171 = 32)
/* renamed from: com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity */
/* loaded from: classes4.dex */
public class ActivityC18152x9f0f53c5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a {

    /* renamed from: d, reason: collision with root package name */
    public int f249209d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f249210e;

    /* renamed from: f, reason: collision with root package name */
    public int f249211f;

    /* renamed from: g, reason: collision with root package name */
    public int f249212g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f249213h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f249214i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f249215m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f249216n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f249217o;

    /* renamed from: p, reason: collision with root package name */
    public int f249218p;

    /* renamed from: q, reason: collision with root package name */
    public int f249219q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be f249220r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f f249221s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f249222t;

    /* renamed from: u, reason: collision with root package name */
    public int f249223u;

    /* renamed from: v, reason: collision with root package name */
    public int f249224v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 f249225w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f249226x;

    /* renamed from: y, reason: collision with root package name */
    public long f249227y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f249228z = 0;

    public ab4.n0 T6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        ab4.n0 n0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a4.f245608a;
        if (n0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            return n0Var;
        }
        ab4.n0 n0Var2 = new ab4.n0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        return n0Var2;
    }

    public final void U6(ab4.q0 q0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        if (q0Var != null && this.f249222t != null && this.f249225w == null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q0Var.F) || q0Var.I == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
                return;
            }
            this.f249225w = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0(this, q0Var, this.f249222t, 0);
            if (getResources().getConfiguration().orientation == 1) {
                this.f249225w.T();
            } else if (getResources().getConfiguration().orientation == 2) {
                this.f249225w.S();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var2 = this.f249225w;
            if (q0Var2 != null) {
                q0Var2.R(false, 0L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public void V6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("progressBarStatus", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoFullScreenActivity", "progressBarStatus visiblity = " + z17);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var = this.f249225w;
            if (q0Var != null) {
                q0Var.R(true, 0L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var2 = this.f249225w;
            if (q0Var2 != null) {
                q0Var2.U(true, 0L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progressBarStatus", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            int i17 = this.f249209d;
            android.content.Intent o17 = i17 == 0 ? this.f249220r.o() : i17 == 1 ? this.f249221s.m() : null;
            if (o17 != null) {
                long currentTimeMillis = this.f249228z + (java.lang.System.currentTimeMillis() - this.f249227y);
                this.f249228z = currentTimeMillis;
                o17.putExtra("KComponentFullScreenStayTime", currentTimeMillis);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var = this.f249225w;
                if (q0Var != null) {
                    q0Var.L();
                    o17.putExtra("KComponentFullVideoFloatBarReportInfo", this.f249225w.P());
                }
            }
            setResult(1000, o17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        super.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finish", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569481cb;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onCancel */
    public void mo2293x3d6f0539() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCancel", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.mo2293x3d6f0539();
        setRequestedOrientation(4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCancel", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onConfigurationChanged(configuration);
        try {
            int i17 = configuration.orientation;
            if (i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoFullScreenActivity", "ORIENTATION_LANDSCAPE");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var = this.f249225w;
                if (q0Var != null) {
                    q0Var.S();
                }
            } else if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoFullScreenActivity", "ORIENTATION_PORTRAIT");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var2 = this.f249225w;
                if (q0Var2 != null) {
                    q0Var2.T();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onCreate(bundle);
        this.f249227y = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.g(this);
        this.f39322x2305be9.J();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            this.f249209d = getIntent().getIntExtra("KComponentVideoType", 0);
            this.f249210e = getIntent().getStringExtra("KComponentCid");
            this.f249211f = getIntent().getIntExtra("KComponentCurrentTime", 0);
            this.f249212g = getIntent().getIntExtra("KComponentTotalTime", 0);
            this.f249213h = getIntent().getBooleanExtra("KComponentVoiceType", false);
            this.f249214i = getIntent().getBooleanExtra("KComponentProgressType", false);
            this.f249215m = getIntent().getStringExtra("KComponentVideoSightThumbUrl");
            this.f249216n = getIntent().getStringExtra("KComponentStreamVideoUrlPath");
            this.f249217o = getIntent().getBooleanExtra("KComponentIsWaiting", false);
            this.f249218p = getIntent().getIntExtra("KComponentSeekTimeDueWaiting", 0);
            this.f249219q = getIntent().getIntExtra("KComponentKComponentCacheTime", 0);
            this.f249226x = getIntent().getBooleanExtra("KComponentForceLandMode", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoFullScreenActivity", "videoType = " + this.f249209d + ", cid = " + this.f249210e + ", currPosSec = " + this.f249211f + " , videoDurationSec = " + this.f249212g + ", bNoVoice = " + this.f249213h + ", isPlaying = " + this.f249214i + ", streamVideoUrlPath = " + this.f249216n + ", isWaiting = " + this.f249217o + ", seekTime = " + this.f249218p + ", forceLandscapeMode=" + this.f249226x);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleOriention", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        if (this.f249209d == 1 && this.f249226x) {
            setRequestedOrientation(0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oy(this), 5000L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleOriention", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initScreenParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(this);
            this.f249223u = c17[0];
            this.f249224v = c17[1];
            if (com.p314xaae8f345.mm.ui.bk.u(this, false) && getResources().getConfiguration().orientation == 1) {
                this.f249224v -= com.p314xaae8f345.mm.ui.bk.p(this);
            } else if (com.p314xaae8f345.mm.ui.bk.u(this, false) && getResources().getConfiguration().orientation == 2) {
                this.f249223u -= com.p314xaae8f345.mm.ui.bk.p(this);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoFullScreenActivity", "screenHeight = " + this.f249224v + ", screenWidth = " + this.f249223u);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initScreenParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        int i17 = this.f249209d;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSightVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            try {
                this.f249222t = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be(this);
                this.f249220r = viewOnClickListenerC18000xb62389be;
                this.f249222t.addView(viewOnClickListenerC18000xb62389be);
                this.f249220r.r(this.f249223u, this.f249224v);
                this.f249220r.v(this.f249209d, this.f249210e, this.f249211f, this.f249212g, this.f249213h, this.f249214i, this.f249215m, this.f249216n);
                this.f249220r.u();
                this.f249220r.m70692xb0e184ca(this);
                try {
                    ab4.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u7.f247081a;
                    if (zVar != null) {
                        U6(zVar.U);
                    }
                } catch (java.lang.Throwable th8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th8.toString());
                }
            } catch (java.lang.Throwable th9) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th9.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSightVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            try {
                this.f249222t = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f(this);
                this.f249221s = viewOnClickListenerC17971x568f8e3f;
                this.f249222t.addView(viewOnClickListenerC17971x568f8e3f);
                this.f249221s.t(this.f249223u, this.f249224v);
                str = "onCreate";
                try {
                    this.f249221s.v(this.f249209d, this.f249210e, this.f249211f, this.f249212g, this.f249213h, this.f249214i, this.f249215m, this.f249216n, this.f249217o, this.f249218p, this.f249219q);
                    this.f249221s.u();
                    this.f249221s.m70597xb0e184ca(this);
                    try {
                        ab4.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z8.f247404a;
                        if (u0Var != null) {
                            U6(u0Var.f84434J);
                        }
                    } catch (java.lang.Throwable th10) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th10.toString());
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
                }
            } catch (java.lang.Throwable th12) {
                th = th12;
                str = "onCreate";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        str = "onCreate";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a4.f245608a = null;
            int i17 = this.f249209d;
            if (i17 == 0) {
                this.f249220r.w();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u7.f247081a = null;
            } else if (i17 == 1) {
                this.f249221s.w();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z8.f247404a = null;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onPause();
        try {
            this.f249228z += java.lang.System.currentTimeMillis() - this.f249227y;
            i17 = this.f249209d;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be = this.f249220r;
            viewOnClickListenerC18000xb62389be.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            try {
                viewOnClickListenerC18000xb62389be.f248204z = false;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(viewOnClickListenerC18000xb62389be.W);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(viewOnClickListenerC18000xb62389be.f248194p0);
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th7.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f = this.f249221s;
            viewOnClickListenerC17971x568f8e3f.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            try {
                viewOnClickListenerC17971x568f8e3f.f247884J = false;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(viewOnClickListenerC17971x568f8e3f.f247907y0);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(viewOnClickListenerC17971x568f8e3f.f247891l1);
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th8.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onResume();
        try {
            this.f249227y = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.g(this);
            int i17 = this.f249209d;
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be = this.f249220r;
                viewOnClickListenerC18000xb62389be.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                viewOnClickListenerC18000xb62389be.f248204z = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f = this.f249221s;
                viewOnClickListenerC17971x568f8e3f.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                viewOnClickListenerC17971x568f8e3f.f247884J = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onStart();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.g(this);
            int i17 = this.f249209d;
            if (i17 == 0) {
                this.f249220r.x();
            } else if (i17 == 1) {
                this.f249221s.x();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onStop();
        try {
            i17 = this.f249209d;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        }
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18000xb62389be viewOnClickListenerC18000xb62389be = this.f249220r;
            viewOnClickListenerC18000xb62389be.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            try {
                viewOnClickListenerC18000xb62389be.A = false;
                if (viewOnClickListenerC18000xb62389be.f248188h.h()) {
                    viewOnClickListenerC18000xb62389be.A();
                    viewOnClickListenerC18000xb62389be.B = true;
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SightVideoFullScreenView", th7.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f = this.f249221s;
            viewOnClickListenerC17971x568f8e3f.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            try {
                viewOnClickListenerC17971x568f8e3f.K = false;
                if (viewOnClickListenerC17971x568f8e3f.f247892m.mo61531xc00617a4()) {
                    viewOnClickListenerC17971x568f8e3f.z();
                    viewOnClickListenerC17971x568f8e3f.L = true;
                }
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th8.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoFullScreenActivity", th6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMMOrientation", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMMOrientation", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }
}

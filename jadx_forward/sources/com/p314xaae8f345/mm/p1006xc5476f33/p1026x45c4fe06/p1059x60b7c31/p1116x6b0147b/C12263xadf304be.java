package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper */
/* loaded from: classes15.dex */
public class C12263xadf304be extends android.widget.RelativeLayout implements oe1.o1, oe1.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f165089d;

    /* renamed from: e, reason: collision with root package name */
    public oe1.o1 f165090e;

    /* renamed from: f, reason: collision with root package name */
    public oe1.p1 f165091f;

    /* renamed from: g, reason: collision with root package name */
    public oe1.h1 f165092g;

    /* renamed from: h, reason: collision with root package name */
    public oe1.g1 f165093h;

    /* renamed from: i, reason: collision with root package name */
    public oe1.m1 f165094i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f165095m;

    /* renamed from: n, reason: collision with root package name */
    public long f165096n;

    /* renamed from: o, reason: collision with root package name */
    public float f165097o;

    /* renamed from: p, reason: collision with root package name */
    public int f165098p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f165099q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f165100r;

    /* renamed from: s, reason: collision with root package name */
    public int f165101s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f165102t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q1 f165103u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f165104v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f165105w;

    /* renamed from: x, reason: collision with root package name */
    public int f165106x;

    /* renamed from: y, reason: collision with root package name */
    public oe1.s1 f165107y;

    /* renamed from: z, reason: collision with root package name */
    public static final bm5.x0 f165088z = new bm5.x0(new oe1.C29267x380128());
    public static final bm5.x0 A = new bm5.x0(new oe1.C29268x380129());

    public C12263xadf304be(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // oe1.h1
    public void E(java.lang.String str, java.lang.String str2) {
        p("onVideoEnded", new java.lang.Object[0]);
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.E(str, str2);
        }
    }

    @Override // oe1.h1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        p("onGetVideoSize[%d %d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.I(str, str2, i17, i18);
        }
    }

    @Override // oe1.h1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Video.AppBrandVideoWrapper", this.f165107y + " onError[%s %d, %d]", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.N(str, str2, str3, i17, i18);
        }
    }

    @Override // oe1.o1
    public boolean a(double d17, boolean z17) {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.a(d17, z17);
        }
        return false;
    }

    @Override // oe1.o1
    public boolean b(double d17) {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.b(d17);
        }
        return false;
    }

    @Override // oe1.o1
    public boolean c(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        this.f165097o = f17;
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.c(f17);
        }
        return false;
    }

    @Override // oe1.o1
    public void d() {
        p("onUIDestroy hasRequestFocusAudio：%b", java.lang.Boolean.valueOf(this.f165105w));
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.d();
        }
        if (this.f165104v && this.f165105w) {
            this.f165103u.a();
            this.f165105w = false;
        }
        setKeepScreenOn(false);
    }

    @Override // oe1.o1
    public void e() {
        p("onUIPause hasRequestFocusAudio：%b", java.lang.Boolean.valueOf(this.f165105w));
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.e();
        }
        if (this.f165104v && this.f165105w) {
            this.f165103u.a();
            this.f165105w = false;
        }
        setKeepScreenOn(false);
    }

    @Override // oe1.h1
    public void f(java.lang.String str, java.lang.String str2) {
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.f(str, str2);
        }
    }

    @Override // oe1.o1
    public void g() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.g();
        }
    }

    @Override // oe1.o1
    /* renamed from: getCacheTimeSec */
    public int mo51375x8a3f46d8() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.mo51375x8a3f46d8();
        }
        return 0;
    }

    @Override // oe1.o1
    /* renamed from: getCurrPosMs */
    public int mo51376x25784152() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.mo51376x25784152();
        }
        return 0;
    }

    @Override // oe1.o1
    /* renamed from: getCurrPosSec */
    public int mo51377x898ffe25() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.mo51377x898ffe25();
        }
        return 0;
    }

    @Override // oe1.o1
    /* renamed from: getPlayerType */
    public int mo51378x6b2cfdb1() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.mo51378x6b2cfdb1();
        }
        return 0;
    }

    /* renamed from: getTexture */
    public android.view.TextureView m51379xe94b10e5() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var == null || !(o1Var.mo51381xfb86a31b() instanceof gf1.e)) {
            return null;
        }
        return ((gf1.e) this.f165090e.mo51381xfb86a31b()).m131436x3aafa96();
    }

    @Override // oe1.o1
    /* renamed from: getVideoDurationSec */
    public int mo51380x6d590e18() {
        oe1.o1 o1Var = this.f165090e;
        return o1Var != null ? o1Var.mo51380x6d590e18() : this.f165098p;
    }

    @Override // oe1.o1
    /* renamed from: getView */
    public android.view.View mo51381xfb86a31b() {
        return this;
    }

    @Override // oe1.o1
    public void h(boolean z17, java.lang.String str, int i17) {
        this.f165098p = i17;
        this.f165099q = z17;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        c19772x1c2cd081.f38869x6ac9171 = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && c19772x1c2cd081.f38869x6ac9171.indexOf("file://") == 0) {
            c19772x1c2cd081.f38869x6ac9171 = c19772x1c2cd081.f38869x6ac9171.substring(7);
        }
        this.f165100r = c19772x1c2cd081.f38869x6ac9171;
        oe1.o1 o1Var = this.f165090e;
        boolean z18 = false;
        if (o1Var == null) {
            oe1.p1 p1Var = this.f165091f;
            p("setVideoPath, videoViewFactory: " + p1Var.mo131438xfb82e301(), new java.lang.Object[0]);
            oe1.o1 Td = p1Var.Td(this.f165089d, this.f165106x);
            this.f165090e = Td;
            oe1.s1 s1Var = this.f165107y;
            if (s1Var != null) {
                Td.mo51396xc72d5636(s1Var);
            }
            this.f165090e.mo51391x3dc294a4(this.f165096n);
            this.f165090e.mo51398xae209ab4(this.f165101s);
            this.f165090e.mo51389x526554de(this);
            z18 = true;
        } else {
            o1Var.mo51400x360802();
        }
        mo51395xebd28962(this.f165094i);
        c(this.f165097o);
        mo51392x764d819b(this.f165095m);
        if (z18) {
            mo51397xb9405cf9(this.f165093h);
            addView(this.f165090e.mo51381xfb86a31b(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        this.f165090e.h(this.f165099q, this.f165100r, this.f165098p);
    }

    @Override // oe1.h1
    public void i(java.lang.String str, java.lang.String str2) {
        p("onVideoPause hasRequestFocusAudio：%b", java.lang.Boolean.valueOf(this.f165105w));
        setKeepScreenOn(false);
        if (this.f165104v && this.f165105w) {
            this.f165103u.a();
            this.f165105w = false;
        }
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.i(str, str2);
        }
    }

    @Override // oe1.o1
    /* renamed from: isPlaying */
    public boolean mo51382xc00617a4() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.mo51382xc00617a4();
        }
        return false;
    }

    @Override // oe1.o1
    public boolean j() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            return o1Var.j();
        }
        return false;
    }

    @Override // oe1.h1
    public void k(java.lang.String str, java.lang.String str2) {
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.k(str, str2);
        }
    }

    @Override // oe1.h1
    public void l(java.lang.String str, java.lang.String str2) {
        p("onVideoPlay focusAudio:%b, mute:%b", java.lang.Boolean.valueOf(this.f165104v), java.lang.Boolean.valueOf(this.f165095m));
        setKeepScreenOn(true);
        if (this.f165104v && !this.f165095m) {
            this.f165103u.mo51100x4c4bb389();
            this.f165105w = true;
        }
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.l(str, str2);
        }
    }

    @Override // oe1.o1
    public void m() {
        p("preload video url %s", this.f165100r);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f165100r)) {
            return;
        }
        this.f165090e.m();
    }

    @Override // oe1.h1
    public void n(java.lang.String str, long j17) {
        p("onPreloadedMetaData preloadSize:%d", java.lang.Long.valueOf(j17));
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.n(str, j17);
        }
    }

    @Override // oe1.h1
    public void o(java.lang.String str, java.lang.String str2) {
        p("onPrepared", new java.lang.Object[0]);
        oe1.h1 h1Var = this.f165092g;
        if (h1Var != null) {
            h1Var.o(str, str2);
        }
    }

    public final void p(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.AppBrandVideoWrapper", this.f165107y + " " + str, objArr);
    }

    @Override // oe1.o1
    /* renamed from: pause */
    public boolean mo51383x65825f6() {
        if (this.f165090e == null) {
            return false;
        }
        setKeepScreenOn(false);
        return this.f165090e.mo51383x65825f6();
    }

    @Override // oe1.o1
    /* renamed from: play */
    public boolean mo51384x348b34() {
        if (this.f165090e == null) {
            return false;
        }
        setKeepScreenOn(true);
        return this.f165090e.mo51384x348b34();
    }

    @Override // oe1.o1
    /* renamed from: setCover */
    public void mo51385x52d31475(android.graphics.Bitmap bitmap) {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51385x52d31475(bitmap);
        }
    }

    /* renamed from: setFocusAudio */
    public void m51386xdca9a3e0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.AppBrandVideoWrapper", "setFocusAudio:%s", java.lang.Boolean.valueOf(z17));
        this.f165104v = z17;
    }

    @Override // oe1.o1
    /* renamed from: setFullDirection */
    public void mo51387xfa24986e(int i17) {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51387xfa24986e(i17);
        }
    }

    /* renamed from: setHostComponent */
    public void m51388x437c46f3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f165102t = lVar;
    }

    @Override // oe1.o1
    /* renamed from: setIMMVideoViewCallback */
    public void mo51389x526554de(oe1.h1 h1Var) {
        this.f165092g = h1Var;
    }

    @Override // oe1.o1
    /* renamed from: setIsShowBasicControls */
    public void mo51390xc2e9d13b(boolean z17) {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51390xc2e9d13b(z17);
        }
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z17) {
        java.util.Objects.toString(this.f165107y);
        super.setKeepScreenOn(z17);
    }

    @Override // oe1.o1
    /* renamed from: setMinBufferDuration */
    public void mo51391x3dc294a4(long j17) {
        this.f165096n = j17;
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51391x3dc294a4(j17);
        }
    }

    @Override // oe1.o1
    /* renamed from: setMute */
    public void mo51392x764d819b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.AppBrandVideoWrapper", "setMute: %b", java.lang.Boolean.valueOf(z17));
        this.f165095m = z17;
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51392x764d819b(z17);
        }
    }

    /* renamed from: setMyVideoViewFactory */
    public void m51393xeb0c20f8(oe1.p1 p1Var) {
        p("setMyVideoViewFactory, videoViewFactory: " + p1Var.mo131438xfb82e301(), new java.lang.Object[0]);
        this.f165091f = p1Var;
    }

    /* renamed from: setPlayerHint */
    public void m51394x994b9b0a(int i17) {
        p("setPlayerHint, playerHint: " + i17, new java.lang.Object[0]);
        this.f165106x = i17;
    }

    @Override // oe1.o1
    /* renamed from: setScaleType */
    public void mo51395xebd28962(oe1.m1 m1Var) {
        this.f165094i = m1Var;
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51395xebd28962(m1Var);
        }
    }

    @Override // oe1.o1
    /* renamed from: setVideoContext */
    public void mo51396xc72d5636(oe1.s1 s1Var) {
        this.f165107y = s1Var;
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51396xc72d5636(s1Var);
        }
    }

    @Override // oe1.o1
    /* renamed from: setVideoFooterView */
    public void mo51397xb9405cf9(oe1.g1 g1Var) {
        this.f165093h = g1Var;
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51397xb9405cf9(g1Var);
        }
    }

    @Override // oe1.o1
    /* renamed from: setVideoSource */
    public void mo51398xae209ab4(int i17) {
        this.f165101s = i17;
    }

    @Override // oe1.o1
    /* renamed from: start */
    public void mo51399x68ac462() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51399x68ac462();
            setKeepScreenOn(true);
        }
    }

    @Override // oe1.o1
    /* renamed from: stop */
    public void mo51400x360802() {
        oe1.o1 o1Var = this.f165090e;
        if (o1Var != null) {
            o1Var.mo51400x360802();
            if (this.f165104v && this.f165105w) {
                this.f165103u.a();
                this.f165105w = false;
            }
            setKeepScreenOn(false);
        }
    }

    public C12263xadf304be(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165091f = null;
        this.f165094i = oe1.m1.CONTAIN;
        this.f165095m = false;
        this.f165096n = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f165097o = -1.0f;
        this.f165101s = 0;
        this.f165102t = null;
        this.f165104v = true;
        this.f165105w = false;
        this.f165106x = 0;
        this.f165107y = null;
        this.f165089d = context;
        this.f165091f = (oe1.p1) f165088z.b();
        this.f165103u = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p1) A.b()).sf(new yz5.a() { // from class: oe1.z$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12263xadf304be.this.f165102t;
            }
        }, new oe1.a0(this));
    }
}

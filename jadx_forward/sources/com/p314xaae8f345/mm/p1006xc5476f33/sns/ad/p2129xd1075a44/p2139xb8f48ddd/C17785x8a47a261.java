package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView */
/* loaded from: classes4.dex */
public class C17785x8a47a261 extends android.widget.FrameLayout implements n84.z {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f245010u = 0;

    /* renamed from: d, reason: collision with root package name */
    public n84.v f245011d;

    /* renamed from: e, reason: collision with root package name */
    public kk4.c f245012e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.TextureView f245013f;

    /* renamed from: g, reason: collision with root package name */
    public n84.u f245014g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f245015h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f245016i;

    /* renamed from: m, reason: collision with root package name */
    public int f245017m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f245018n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f245019o;

    /* renamed from: p, reason: collision with root package name */
    public m3.a f245020p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f245021q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener f245022r;

    /* renamed from: s, reason: collision with root package name */
    public n84.t f245023s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f245024t;

    public C17785x8a47a261(android.content.Context context) {
        super(context);
        this.f245018n = false;
        this.f245019o = false;
        this.f245021q = "";
        this.f245024t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new n84.i(this), true);
    }

    public static /* synthetic */ n84.u a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.u uVar = c17785x8a47a261.f245014g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return uVar;
    }

    /* renamed from: getPlayer */
    private kk4.c m69563x2a55bdd7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        kk4.c cVar = this.f245012e;
        if (cVar == null) {
            this.f245012e = b();
        } else {
            try {
                ((kk4.f0) cVar).mo100934x6761d4f();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAlphaPlayerView", "getPlayer() called " + th6, th6);
                this.f245012e = b();
            }
        }
        try {
            m69564x683d6267(this.f245012e);
        } catch (java.lang.Throwable th7) {
            n84.w.c("AdAlphaPlayerView", "init player failed", th7);
            n84.x.a().b(new n84.p(this));
        }
        kk4.c cVar2 = this.f245012e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return cVar2;
    }

    /* renamed from: setDataSource */
    private void m69564x683d6267(kk4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (cVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        } else {
            if (android.text.TextUtils.isEmpty(this.f245015h)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                return;
            }
            ((kk4.f0) cVar).mo100945x683d6267(this.f245015h);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
    }

    public final kk4.c b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        kk4.f0 f0Var = new kk4.f0(context, null);
        f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(203, 1L));
        f0Var.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101065x9c4efdac(204, new int[]{102}));
        f0Var.f390074q = new n84.j(this, f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1913, 2);
        f0Var.mo100954x6954c27b(new n84.l(this));
        f0Var.mo100951xa4560c71(new n84.m(this));
        f0Var.mo100964x2d6d87cd(new n84.n(this));
        f0Var.mo100955x40f8c003(new n84.o(this));
        f0Var.mo100965xd0747cbc(true);
        f0Var.mo100947xfd27780d(this.f245016i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return f0Var;
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "onOpenGLComponentsInit");
        final kk4.c m69563x2a55bdd7 = m69563x2a55bdd7();
        if (m69563x2a55bdd7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        try {
            n84.v vVar = this.f245011d;
            vVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            android.graphics.SurfaceTexture surfaceTexture = vVar.f417230x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            android.view.Surface surface = new android.view.Surface(surfaceTexture);
            kk4.f0 f0Var = (kk4.f0) m69563x2a55bdd7;
            f0Var.mo100970x42c875eb(surface);
            f0Var.mo100957x5dd7c812(new n84.b(this, f0Var));
            f0Var.mo100932x857611b5();
        } catch (java.lang.Throwable th6) {
            n84.x.a().b(new n84.c(this));
            n84.w.c("AdAlphaPlayerView", "start the video failed!", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.u uVar = this.f245014g;
        if (uVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g0) uVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenGLInit", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenGLInit", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: n84.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                kk4.c cVar = m69563x2a55bdd7;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261.f245010u;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261 c17785x8a47a261 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2139xb8f48ddd.C17785x8a47a261.this;
                c17785x8a47a261.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$onOpenGLComponentsInit$0", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                c17785x8a47a261.setAlpha(1.0f);
                if (c17785x8a47a261.f245019o) {
                    try {
                        ((kk4.f0) cVar).mo100975x68ac462();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$onOpenGLComponentsInit$0", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepare", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "prepare");
        n84.u uVar = this.f245014g;
        if (uVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g0) uVar).b(2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        android.view.TextureView textureView = new android.view.TextureView(getContext());
        textureView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        textureView.setOpaque(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f245013f = textureView;
        java.util.Objects.toString(textureView.getSurfaceTexture());
        this.f245013f.setSurfaceTextureListener(new n84.r(this));
        addView(this.f245013f, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepare", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "resumeAd");
        this.f245019o = true;
        n84.u uVar = this.f245014g;
        if (uVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g0) uVar).b(2);
        }
        try {
            kk4.c cVar = this.f245012e;
            if (cVar != null) {
                ((kk4.f0) cVar).mo100975x68ac462();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startTimer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            ((ku5.t0) ku5.t0.f394148d).B(new n84.g(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startTimer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            n84.v vVar = this.f245011d;
            if (vVar != null) {
                vVar.e();
            }
        } catch (java.lang.Throwable th6) {
            n84.w.c("AdAlphaPlayerView", "resume failed", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeReleasePlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.x.a().b(new n84.e(this));
        n84.v vVar = this.f245011d;
        if (vVar != null) {
            vVar.d();
        }
        if (this.f245012e != null) {
            ((ku5.t0) ku5.t0.f394148d).g(new n84.f(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeReleasePlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.u uVar = this.f245014g;
        if (uVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g0) uVar).b(4);
        }
        try {
            h();
            f();
        } catch (java.lang.Throwable th6) {
            n84.w.d("AdAlphaPlayerView", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    /* renamed from: getOnFrameRenderedFlow */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 m69565x222f3e3b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.v vVar = this.f245011d;
        if (vVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            return null;
        }
        vVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = vVar.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return i2Var;
    }

    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopTimer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        ((ku5.t0) ku5.t0.f394148d).B(new n84.h(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopTimer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "onSizeChanged w:" + i17 + " h:" + i18);
        super.onSizeChanged(i17, i18, i19, i27);
        n84.v vVar = this.f245011d;
        if (vVar != null) {
            vVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15458xebbebcb3, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            vVar.f417198i = i17;
            vVar.f417199m = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15458xebbebcb3, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    /* renamed from: setOnPrepared */
    public void m69566x753abd3e(m3.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f245020p = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    /* renamed from: setOnProgressListener */
    public void m69567xcd1c0602(n84.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnProgressListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f245023s = tVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnProgressListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    /* renamed from: setPrepared */
    public void m69568x2a4e32bf(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f245018n = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public C17785x8a47a261(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f245018n = false;
        this.f245019o = false;
        this.f245021q = "";
        this.f245024t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new n84.i(this), true);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView */
/* loaded from: classes15.dex */
public abstract class AbstractC12278xb84f839e extends android.widget.RelativeLayout implements oe1.o1, ff1.z, ff1.d0, ff1.b0, ff1.a0, ff1.c0 {
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A;
    public boolean B;
    public final java.lang.Runnable C;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f165209d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f165210e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f165211f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f165212g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f165213h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f165214i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf f165215m;

    /* renamed from: n, reason: collision with root package name */
    public oe1.g1 f165216n;

    /* renamed from: o, reason: collision with root package name */
    public ff1.e0 f165217o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f165218p;

    /* renamed from: q, reason: collision with root package name */
    public oe1.h1 f165219q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f165220r;

    /* renamed from: s, reason: collision with root package name */
    public int f165221s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f165222t;

    /* renamed from: u, reason: collision with root package name */
    public int f165223u;

    /* renamed from: v, reason: collision with root package name */
    public int f165224v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f165225w;

    /* renamed from: x, reason: collision with root package name */
    public oe1.s1 f165226x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f165227y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f165228z;

    public AbstractC12278xb84f839e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // oe1.o1
    public boolean a(double d17, boolean z17) {
        ff1.e0 e0Var = this.f165217o;
        boolean z18 = (e0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var.mo51452x4edea88a()) || !this.f165225w) ? false : true;
        int mo51380x6d590e18 = mo51380x6d590e18();
        int i17 = (int) d17;
        if (mo51380x6d590e18 > 0 && d17 > mo51380x6d590e18) {
            i17 = mo51380x6d590e18;
        }
        ff1.e0 e0Var2 = this.f165217o;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Video.AbstractVideoView", this.f165226x + " seek to [%d %s] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(mo51380x6d590e18), java.lang.Boolean.valueOf((e0Var2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var2.mo51452x4edea88a())) ? false : true));
        if (!z18) {
            this.f165223u = i17;
            this.f165222t = z17;
        } else if (this.f165217o != null) {
            o();
            r(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) this.f165217o;
            abstractC12277x3bbbdb47.k(i17 * 1000);
            abstractC12277x3bbbdb47.f165196n = z17;
            return z17;
        }
        return false;
    }

    @Override // oe1.o1
    public boolean b(double d17) {
        return a(d17, mo51382xc00617a4());
    }

    @Override // oe1.o1
    public void d() {
        k("MicroMsg.Video.AbstractVideoView", "onUIDestroy", new java.lang.Object[0]);
        mo51400x360802();
        this.f165220r.mo50302x6b17ad39(null);
        q();
        this.A.d();
    }

    @Override // oe1.o1
    public void e() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        k("MicroMsg.Video.AbstractVideoView", "onUIPause %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        mo51377x898ffe25();
        this.f165218p = mo51382xc00617a4();
        mo51383x65825f6();
        q();
        this.f165210e = false;
    }

    public ff1.e0 f(android.content.Context context) {
        return null;
    }

    @Override // oe1.o1
    public void g() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        k("MicroMsg.Video.AbstractVideoView", "onUIResume %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f165210e = true;
    }

    @Override // oe1.o1
    /* renamed from: getCacheTimeSec */
    public int mo51375x8a3f46d8() {
        return 0;
    }

    @Override // oe1.o1
    /* renamed from: getCurrPosMs */
    public int mo51376x25784152() {
        ff1.e0 e0Var = this.f165217o;
        if (e0Var != null) {
            return e0Var.mo51447x9746038c();
        }
        return 0;
    }

    @Override // oe1.o1
    /* renamed from: getCurrPosSec */
    public int mo51377x898ffe25() {
        if (this.f165217o != null) {
            return java.lang.Math.round((r0.mo51447x9746038c() * 1.0f) / 1000.0f);
        }
        return 0;
    }

    /* renamed from: getMediaId */
    public java.lang.String m51467x75e04be9() {
        return "";
    }

    @Override // oe1.o1
    /* renamed from: getPlayerType */
    public int mo51378x6b2cfdb1() {
        return this.f165221s;
    }

    /* renamed from: getSessionId */
    public java.lang.String m51468x23a7af9b() {
        return "";
    }

    @Override // oe1.o1
    /* renamed from: getVideoDurationSec */
    public int mo51380x6d590e18() {
        if (this.f165217o != null) {
            return java.lang.Math.round((r0.mo51449x51e8b0a() * 1.0f) / 1000.0f);
        }
        return -1;
    }

    /* renamed from: getVideoSource */
    public int mo51469x17bb2740() {
        return 0;
    }

    @Override // oe1.o1
    /* renamed from: getView */
    public abstract /* synthetic */ android.view.View mo51381xfb86a31b();

    public void i() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f165220r;
        n3Var.mo50300x3fa464aa(this.C);
        n3Var.mo50293x3498a0(new ff1.w(this));
    }

    @Override // oe1.o1
    /* renamed from: isPlaying */
    public boolean mo51382xc00617a4() {
        ff1.e0 e0Var = this.f165217o;
        if (e0Var != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) e0Var).c();
        }
        return false;
    }

    public final void k(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, this.f165226x + " " + str2, objArr);
    }

    public final void l(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, this.f165226x + " " + str2, objArr);
    }

    public void n(int i17, int i18) {
        java.lang.String str;
        l("MicroMsg.Video.AbstractVideoView", "onError info [%d %d] errorCount[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f165224v));
        int i19 = this.f165224v + 1;
        this.f165224v = i19;
        if (i19 <= 0) {
            int mo51377x898ffe25 = mo51377x898ffe25();
            int i27 = this.f165223u;
            if (i27 == -1) {
                i27 = mo51377x898ffe25;
            }
            k("MicroMsg.Video.AbstractVideoView", "onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f165223u), java.lang.Integer.valueOf(mo51377x898ffe25));
            mo51400x360802();
            o();
            this.f165220r.mo50297x7c4d7ca2(new ff1.p(this, i27), 200L);
            return;
        }
        oe1.h1 h1Var = this.f165219q;
        if (h1Var != null) {
            java.lang.String m51468x23a7af9b = m51468x23a7af9b();
            java.lang.String m51467x75e04be9 = m51467x75e04be9();
            java.lang.String str2 = "MEDIA_ERR_SRC_NOT_SUPPORTED";
            if (i17 != -1010 && i17 != -1007) {
                str2 = "MEDIA_ERR_NETWORK";
                str = "MEDIA_ERR_DECODE";
                android.content.Context context = this.f165209d;
                if (i17 != -1004) {
                    h1Var.N(m51468x23a7af9b, m51467x75e04be9, str, i17, i18);
                } else {
                    h1Var.N(m51468x23a7af9b, m51467x75e04be9, str, i17, i18);
                }
            }
            str = str2;
            h1Var.N(m51468x23a7af9b, m51467x75e04be9, str, i17, i18);
        }
        mo51400x360802();
        i();
    }

    public void o() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f165220r;
        java.lang.Runnable runnable = this.C;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 500L);
    }

    @Override // ff1.z
    /* renamed from: onCompletion */
    public void mo51470xa6db431b() {
        k("MicroMsg.Video.AbstractVideoView", "onCompletion, curMs %d, duration %d", java.lang.Integer.valueOf(mo51377x898ffe25()), java.lang.Integer.valueOf(mo51380x6d590e18()));
        r(mo51380x6d590e18());
        i();
        q();
        oe1.h1 h1Var = this.f165219q;
        if (h1Var != null) {
            h1Var.E(m51468x23a7af9b(), m51467x75e04be9());
        }
    }

    public void p(boolean z17) {
        java.util.Objects.toString(this.f165226x);
        this.f165227y.c(500L, 500L);
    }

    @Override // oe1.o1
    /* renamed from: pause */
    public boolean mo51383x65825f6() {
        k("MicroMsg.Video.AbstractVideoView", "pause", new java.lang.Object[0]);
        if (this.f165217o == null) {
            return false;
        }
        s(false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) this.f165217o).i();
        q();
        oe1.h1 h1Var = this.f165219q;
        if (h1Var != null) {
            h1Var.i(m51468x23a7af9b(), m51467x75e04be9());
        }
        return true;
    }

    @Override // oe1.o1
    /* renamed from: play */
    public boolean mo51384x348b34() {
        if (!this.f165210e) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            l("MicroMsg.Video.AbstractVideoView", "ui on pause now, why u call me to play? [%s]", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return false;
        }
        ff1.e0 e0Var = this.f165217o;
        if (e0Var == null) {
            return false;
        }
        boolean l17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) e0Var).l();
        k("MicroMsg.Video.AbstractVideoView", "video play [%b] isPlayOnUiPause[%b]", java.lang.Boolean.valueOf(l17), java.lang.Boolean.valueOf(this.f165218p));
        s(l17);
        if (l17) {
            this.f165218p = false;
            p(false);
            oe1.h1 h1Var = this.f165219q;
            if (h1Var != null) {
                h1Var.l(m51468x23a7af9b(), m51467x75e04be9());
            }
        }
        return l17;
    }

    public void q() {
        this.f165227y.d();
        this.f165228z.d();
    }

    public void r(int i17) {
        oe1.g1 g1Var = this.f165216n;
        if (g1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf) g1Var).a(i17);
        }
    }

    public final void s(boolean z17) {
        oe1.g1 g1Var = this.f165216n;
        if (g1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf) g1Var).mo51416x11f3be80(z17);
        }
    }

    @Override // oe1.o1
    /* renamed from: setCover */
    public void mo51385x52d31475(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView;
        k("MicroMsg.Video.AbstractVideoView", "set cover", new java.lang.Object[0]);
        if (bitmap == null || bitmap.isRecycled() || (imageView = this.f165211f) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // oe1.o1
    /* renamed from: setFullDirection */
    public void mo51387xfa24986e(int i17) {
    }

    @Override // oe1.o1
    /* renamed from: setIMMVideoViewCallback */
    public void mo51389x526554de(oe1.h1 h1Var) {
        this.f165219q = h1Var;
    }

    @Override // oe1.o1
    /* renamed from: setIsShowBasicControls */
    public void mo51390xc2e9d13b(boolean z17) {
        k("MicroMsg.Video.AbstractVideoView", "is show seek bar[%b]", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f165220r;
        if (z17) {
            n3Var.mo50293x3498a0(new ff1.x(this));
        } else {
            n3Var.mo50293x3498a0(new ff1.y(this));
        }
    }

    @Override // oe1.o1
    /* renamed from: setMinBufferDuration */
    public void mo51391x3dc294a4(long j17) {
        ff1.e0 e0Var = this.f165217o;
        if (e0Var != null) {
            e0Var.mo51455x3dc294a4(j17);
        }
    }

    @Override // oe1.o1
    /* renamed from: setMute */
    public void mo51392x764d819b(boolean z17) {
        ff1.e0 e0Var = this.f165217o;
        if (e0Var != null) {
            e0Var.mo51456x764d819b(z17);
        }
    }

    @Override // oe1.o1
    /* renamed from: setScaleType */
    public abstract /* synthetic */ void mo51395xebd28962(oe1.m1 m1Var);

    @Override // oe1.o1
    /* renamed from: setVideoContext */
    public void mo51396xc72d5636(oe1.s1 s1Var) {
        this.f165226x = s1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oe1.o1
    /* renamed from: setVideoFooterView */
    public void mo51397xb9405cf9(oe1.g1 g1Var) {
        if (!(g1Var instanceof android.view.View)) {
            l("MicroMsg.Video.AbstractVideoView", "set video footer view but is not view", new java.lang.Object[0]);
            return;
        }
        java.lang.Object obj = this.f165216n;
        if (obj != null) {
            this.f165214i.removeView((android.view.View) obj);
        }
        this.f165216n = g1Var;
        this.f165214i.addView((android.view.View) g1Var);
    }

    @Override // oe1.o1
    /* renamed from: setVideoSource */
    public abstract /* synthetic */ void mo51398xae209ab4(int i17);

    /* renamed from: setVideoTotalTime */
    public void m51471xa7077af8(int i17) {
        oe1.g1 g1Var = this.f165216n;
        if (g1Var == null || g1Var.m151120xdf1112ec() == i17) {
            return;
        }
        this.f165216n.mo51418xa7077af8(i17);
    }

    @Override // oe1.o1
    /* renamed from: stop */
    public void mo51400x360802() {
        android.graphics.SurfaceTexture surfaceTexture;
        k("MicroMsg.Video.AbstractVideoView", "stop", new java.lang.Object[0]);
        ff1.e0 e0Var = this.f165217o;
        if (e0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) e0Var;
            long j17 = abstractC12277x3bbbdb47.f165203u;
            long j18 = j17 > 0 ? j17 - abstractC12277x3bbbdb47.f165202t : 2147483647L;
            long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - abstractC12277x3bbbdb47.f165202t;
            if (((int) (j18 > i17 ? i17 : j18)) * 1000 > abstractC12277x3bbbdb47.mo51449x51e8b0a()) {
                abstractC12277x3bbbdb47.mo51449x51e8b0a();
            }
            abstractC12277x3bbbdb47.e("stop : dur:%d stop:%d comp:%d", java.lang.Integer.valueOf(abstractC12277x3bbbdb47.mo51449x51e8b0a()), java.lang.Long.valueOf(i17), java.lang.Long.valueOf(j18));
            if (abstractC12277x3bbbdb47.f165197o != null) {
                abstractC12277x3bbbdb47.mo51449x51e8b0a();
            }
            abstractC12277x3bbbdb47.j();
            ff1.f0 f0Var = abstractC12277x3bbbdb47.N;
            f0Var.f343142d = 0;
            f0Var.f343141c = 0;
            f0Var.f343144f = 0;
            f0Var.f343143e = 0;
            f0Var.f343146h = 0;
            f0Var.f343145g = 0;
            try {
                if (abstractC12277x3bbbdb47.f165191f != null && abstractC12277x3bbbdb47.f165193h && (surfaceTexture = abstractC12277x3bbbdb47.getSurfaceTexture()) != null) {
                    abstractC12277x3bbbdb47.e("releaseSurface", new java.lang.Object[0]);
                    abstractC12277x3bbbdb47.a(surfaceTexture);
                }
            } catch (java.lang.Exception e17) {
                abstractC12277x3bbbdb47.f(e17, "release surface", new java.lang.Object[0]);
            }
            abstractC12277x3bbbdb47.f165189d = "";
            abstractC12277x3bbbdb47.f165204v = 0;
            abstractC12277x3bbbdb47.f165193h = false;
            abstractC12277x3bbbdb47.f165196n = false;
            abstractC12277x3bbbdb47.G = 0L;
        }
        this.f165223u = -1;
        this.f165222t = true;
        this.f165225w = false;
        q();
        this.f165220r.mo50297x7c4d7ca2(new ff1.o(this), 10L);
    }

    public AbstractC12278xb84f839e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165210e = true;
        this.f165218p = false;
        this.f165220r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f165221s = 0;
        this.f165222t = true;
        this.f165223u = -1;
        this.f165224v = 0;
        this.f165225w = false;
        this.f165226x = null;
        this.f165227y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ff1.q(this), true);
        this.f165228z = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ff1.r(this), false);
        this.A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new ff1.s(this), true);
        ff1.t tVar = new ff1.t(this);
        ff1.u uVar = new ff1.u(this);
        this.B = false;
        this.C = new ff1.v(this);
        this.f165209d = context;
        k("MicroMsg.Video.AbstractVideoView", "init abstract video view", new java.lang.Object[0]);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569532e1, this);
        this.f165211f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p0l);
        this.f165212g = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f569096p06);
        this.f165213h = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.ozc);
        this.f165214i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f569087oz2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf c12275xe1ab67bf = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1120x4371eec6.C12275xe1ab67bf) findViewById(com.p314xaae8f345.mm.R.id.ozz);
        this.f165215m = c12275xe1ab67bf;
        this.f165216n = c12275xe1ab67bf;
        if (c12275xe1ab67bf != null) {
            c12275xe1ab67bf.m51415xbdcdae58(tVar);
            this.f165215m.setOnClickListener(uVar);
        }
        ff1.e0 f17 = f(context);
        this.f165217o = f17;
        f17.mo51464x360a109e(this);
        this.f165217o.mo51458x87223eb7(this);
        this.f165217o.mo51457xe6781b94(this);
        this.f165217o.mo51459x146557f1(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f165212g.addView((android.view.View) this.f165217o, 0, layoutParams);
    }
}

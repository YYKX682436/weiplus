package com.tencent.mm.plugin.appbrand.jsapi.video.videoview;

/* loaded from: classes15.dex */
public abstract class AbstractVideoView extends android.widget.RelativeLayout implements oe1.o1, ff1.z, ff1.d0, ff1.b0, ff1.a0, ff1.c0 {
    public final com.tencent.mm.sdk.platformtools.b4 A;
    public boolean B;
    public final java.lang.Runnable C;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f83676d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83677e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f83678f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f83679g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f83680h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f83681i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar f83682m;

    /* renamed from: n, reason: collision with root package name */
    public oe1.g1 f83683n;

    /* renamed from: o, reason: collision with root package name */
    public ff1.e0 f83684o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f83685p;

    /* renamed from: q, reason: collision with root package name */
    public oe1.h1 f83686q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f83687r;

    /* renamed from: s, reason: collision with root package name */
    public int f83688s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f83689t;

    /* renamed from: u, reason: collision with root package name */
    public int f83690u;

    /* renamed from: v, reason: collision with root package name */
    public int f83691v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f83692w;

    /* renamed from: x, reason: collision with root package name */
    public oe1.s1 f83693x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f83694y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f83695z;

    public AbstractVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // oe1.o1
    public boolean a(double d17, boolean z17) {
        ff1.e0 e0Var = this.f83684o;
        boolean z18 = (e0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(e0Var.getVideoPath()) || !this.f83692w) ? false : true;
        int videoDurationSec = getVideoDurationSec();
        int i17 = (int) d17;
        if (videoDurationSec > 0 && d17 > videoDurationSec) {
            i17 = videoDurationSec;
        }
        ff1.e0 e0Var2 = this.f83684o;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Video.AbstractVideoView", this.f83693x + " seek to [%d %s] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(videoDurationSec), java.lang.Boolean.valueOf((e0Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(e0Var2.getVideoPath())) ? false : true));
        if (!z18) {
            this.f83690u = i17;
            this.f83689t = z17;
        } else if (this.f83684o != null) {
            o();
            r(i17);
            com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) this.f83684o;
            abstractVideoTextureView.k(i17 * 1000);
            abstractVideoTextureView.f83663n = z17;
            return z17;
        }
        return false;
    }

    @Override // oe1.o1
    public boolean b(double d17) {
        return a(d17, isPlaying());
    }

    @Override // oe1.o1
    public void d() {
        k("MicroMsg.Video.AbstractVideoView", "onUIDestroy", new java.lang.Object[0]);
        stop();
        this.f83687r.removeCallbacksAndMessages(null);
        q();
        this.A.d();
    }

    @Override // oe1.o1
    public void e() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        k("MicroMsg.Video.AbstractVideoView", "onUIPause %s", new com.tencent.mm.sdk.platformtools.z3());
        getCurrPosSec();
        this.f83685p = isPlaying();
        pause();
        q();
        this.f83677e = false;
    }

    public ff1.e0 f(android.content.Context context) {
        return null;
    }

    @Override // oe1.o1
    public void g() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        k("MicroMsg.Video.AbstractVideoView", "onUIResume %s", new com.tencent.mm.sdk.platformtools.z3());
        this.f83677e = true;
    }

    @Override // oe1.o1
    public int getCacheTimeSec() {
        return 0;
    }

    @Override // oe1.o1
    public int getCurrPosMs() {
        ff1.e0 e0Var = this.f83684o;
        if (e0Var != null) {
            return e0Var.getCurrentPosition();
        }
        return 0;
    }

    @Override // oe1.o1
    public int getCurrPosSec() {
        if (this.f83684o != null) {
            return java.lang.Math.round((r0.getCurrentPosition() * 1.0f) / 1000.0f);
        }
        return 0;
    }

    public java.lang.String getMediaId() {
        return "";
    }

    @Override // oe1.o1
    public int getPlayerType() {
        return this.f83688s;
    }

    public java.lang.String getSessionId() {
        return "";
    }

    @Override // oe1.o1
    public int getVideoDurationSec() {
        if (this.f83684o != null) {
            return java.lang.Math.round((r0.getDuration() * 1.0f) / 1000.0f);
        }
        return -1;
    }

    public int getVideoSource() {
        return 0;
    }

    @Override // oe1.o1
    public abstract /* synthetic */ android.view.View getView();

    public void i() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f83687r;
        n3Var.removeCallbacks(this.C);
        n3Var.post(new ff1.w(this));
    }

    @Override // oe1.o1
    public boolean isPlaying() {
        ff1.e0 e0Var = this.f83684o;
        if (e0Var != null) {
            return ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) e0Var).c();
        }
        return false;
    }

    public final void k(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i(str, this.f83693x + " " + str2, objArr);
    }

    public final void l(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.w(str, this.f83693x + " " + str2, objArr);
    }

    public void n(int i17, int i18) {
        java.lang.String str;
        l("MicroMsg.Video.AbstractVideoView", "onError info [%d %d] errorCount[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f83691v));
        int i19 = this.f83691v + 1;
        this.f83691v = i19;
        if (i19 <= 0) {
            int currPosSec = getCurrPosSec();
            int i27 = this.f83690u;
            if (i27 == -1) {
                i27 = currPosSec;
            }
            k("MicroMsg.Video.AbstractVideoView", "onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f83690u), java.lang.Integer.valueOf(currPosSec));
            stop();
            o();
            this.f83687r.postDelayed(new ff1.p(this, i27), 200L);
            return;
        }
        oe1.h1 h1Var = this.f83686q;
        if (h1Var != null) {
            java.lang.String sessionId = getSessionId();
            java.lang.String mediaId = getMediaId();
            java.lang.String str2 = "MEDIA_ERR_SRC_NOT_SUPPORTED";
            if (i17 != -1010 && i17 != -1007) {
                str2 = "MEDIA_ERR_NETWORK";
                str = "MEDIA_ERR_DECODE";
                android.content.Context context = this.f83676d;
                if (i17 != -1004) {
                    h1Var.N(sessionId, mediaId, str, i17, i18);
                } else {
                    h1Var.N(sessionId, mediaId, str, i17, i18);
                }
            }
            str = str2;
            h1Var.N(sessionId, mediaId, str, i17, i18);
        }
        stop();
        i();
    }

    public void o() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f83687r;
        java.lang.Runnable runnable = this.C;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 500L);
    }

    @Override // ff1.z
    public void onCompletion() {
        k("MicroMsg.Video.AbstractVideoView", "onCompletion, curMs %d, duration %d", java.lang.Integer.valueOf(getCurrPosSec()), java.lang.Integer.valueOf(getVideoDurationSec()));
        r(getVideoDurationSec());
        i();
        q();
        oe1.h1 h1Var = this.f83686q;
        if (h1Var != null) {
            h1Var.E(getSessionId(), getMediaId());
        }
    }

    public void p(boolean z17) {
        java.util.Objects.toString(this.f83693x);
        this.f83694y.c(500L, 500L);
    }

    @Override // oe1.o1
    public boolean pause() {
        k("MicroMsg.Video.AbstractVideoView", "pause", new java.lang.Object[0]);
        if (this.f83684o == null) {
            return false;
        }
        s(false);
        ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) this.f83684o).i();
        q();
        oe1.h1 h1Var = this.f83686q;
        if (h1Var != null) {
            h1Var.i(getSessionId(), getMediaId());
        }
        return true;
    }

    @Override // oe1.o1
    public boolean play() {
        if (!this.f83677e) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            l("MicroMsg.Video.AbstractVideoView", "ui on pause now, why u call me to play? [%s]", new com.tencent.mm.sdk.platformtools.z3());
            return false;
        }
        ff1.e0 e0Var = this.f83684o;
        if (e0Var == null) {
            return false;
        }
        boolean l17 = ((com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) e0Var).l();
        k("MicroMsg.Video.AbstractVideoView", "video play [%b] isPlayOnUiPause[%b]", java.lang.Boolean.valueOf(l17), java.lang.Boolean.valueOf(this.f83685p));
        s(l17);
        if (l17) {
            this.f83685p = false;
            p(false);
            oe1.h1 h1Var = this.f83686q;
            if (h1Var != null) {
                h1Var.l(getSessionId(), getMediaId());
            }
        }
        return l17;
    }

    public void q() {
        this.f83694y.d();
        this.f83695z.d();
    }

    public void r(int i17) {
        oe1.g1 g1Var = this.f83683n;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar) g1Var).a(i17);
        }
    }

    public final void s(boolean z17) {
        oe1.g1 g1Var = this.f83683n;
        if (g1Var != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar) g1Var).setIsPlay(z17);
        }
    }

    @Override // oe1.o1
    public void setCover(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView;
        k("MicroMsg.Video.AbstractVideoView", "set cover", new java.lang.Object[0]);
        if (bitmap == null || bitmap.isRecycled() || (imageView = this.f83678f) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // oe1.o1
    public void setFullDirection(int i17) {
    }

    @Override // oe1.o1
    public void setIMMVideoViewCallback(oe1.h1 h1Var) {
        this.f83686q = h1Var;
    }

    @Override // oe1.o1
    public void setIsShowBasicControls(boolean z17) {
        k("MicroMsg.Video.AbstractVideoView", "is show seek bar[%b]", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f83687r;
        if (z17) {
            n3Var.post(new ff1.x(this));
        } else {
            n3Var.post(new ff1.y(this));
        }
    }

    @Override // oe1.o1
    public void setMinBufferDuration(long j17) {
        ff1.e0 e0Var = this.f83684o;
        if (e0Var != null) {
            e0Var.setMinBufferDuration(j17);
        }
    }

    @Override // oe1.o1
    public void setMute(boolean z17) {
        ff1.e0 e0Var = this.f83684o;
        if (e0Var != null) {
            e0Var.setMute(z17);
        }
    }

    @Override // oe1.o1
    public abstract /* synthetic */ void setScaleType(oe1.m1 m1Var);

    @Override // oe1.o1
    public void setVideoContext(oe1.s1 s1Var) {
        this.f83693x = s1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oe1.o1
    public void setVideoFooterView(oe1.g1 g1Var) {
        if (!(g1Var instanceof android.view.View)) {
            l("MicroMsg.Video.AbstractVideoView", "set video footer view but is not view", new java.lang.Object[0]);
            return;
        }
        java.lang.Object obj = this.f83683n;
        if (obj != null) {
            this.f83681i.removeView((android.view.View) obj);
        }
        this.f83683n = g1Var;
        this.f83681i.addView((android.view.View) g1Var);
    }

    @Override // oe1.o1
    public abstract /* synthetic */ void setVideoSource(int i17);

    public void setVideoTotalTime(int i17) {
        oe1.g1 g1Var = this.f83683n;
        if (g1Var == null || g1Var.getVideoTotalTime() == i17) {
            return;
        }
        this.f83683n.setVideoTotalTime(i17);
    }

    @Override // oe1.o1
    public void stop() {
        android.graphics.SurfaceTexture surfaceTexture;
        k("MicroMsg.Video.AbstractVideoView", "stop", new java.lang.Object[0]);
        ff1.e0 e0Var = this.f83684o;
        if (e0Var != null) {
            com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView abstractVideoTextureView = (com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView) e0Var;
            long j17 = abstractVideoTextureView.f83670u;
            long j18 = j17 > 0 ? j17 - abstractVideoTextureView.f83669t : 2147483647L;
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1() - abstractVideoTextureView.f83669t;
            if (((int) (j18 > i17 ? i17 : j18)) * 1000 > abstractVideoTextureView.getDuration()) {
                abstractVideoTextureView.getDuration();
            }
            abstractVideoTextureView.e("stop : dur:%d stop:%d comp:%d", java.lang.Integer.valueOf(abstractVideoTextureView.getDuration()), java.lang.Long.valueOf(i17), java.lang.Long.valueOf(j18));
            if (abstractVideoTextureView.f83664o != null) {
                abstractVideoTextureView.getDuration();
            }
            abstractVideoTextureView.j();
            ff1.f0 f0Var = abstractVideoTextureView.N;
            f0Var.f261609d = 0;
            f0Var.f261608c = 0;
            f0Var.f261611f = 0;
            f0Var.f261610e = 0;
            f0Var.f261613h = 0;
            f0Var.f261612g = 0;
            try {
                if (abstractVideoTextureView.f83658f != null && abstractVideoTextureView.f83660h && (surfaceTexture = abstractVideoTextureView.getSurfaceTexture()) != null) {
                    abstractVideoTextureView.e("releaseSurface", new java.lang.Object[0]);
                    abstractVideoTextureView.a(surfaceTexture);
                }
            } catch (java.lang.Exception e17) {
                abstractVideoTextureView.f(e17, "release surface", new java.lang.Object[0]);
            }
            abstractVideoTextureView.f83656d = "";
            abstractVideoTextureView.f83671v = 0;
            abstractVideoTextureView.f83660h = false;
            abstractVideoTextureView.f83663n = false;
            abstractVideoTextureView.G = 0L;
        }
        this.f83690u = -1;
        this.f83689t = true;
        this.f83692w = false;
        q();
        this.f83687r.postDelayed(new ff1.o(this), 10L);
    }

    public AbstractVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83677e = true;
        this.f83685p = false;
        this.f83687r = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f83688s = 0;
        this.f83689t = true;
        this.f83690u = -1;
        this.f83691v = 0;
        this.f83692w = false;
        this.f83693x = null;
        this.f83694y = new com.tencent.mm.sdk.platformtools.b4(new ff1.q(this), true);
        this.f83695z = new com.tencent.mm.sdk.platformtools.b4(new ff1.r(this), false);
        this.A = new com.tencent.mm.sdk.platformtools.b4(new ff1.s(this), true);
        ff1.t tVar = new ff1.t(this);
        ff1.u uVar = new ff1.u(this);
        this.B = false;
        this.C = new ff1.v(this);
        this.f83676d = context;
        k("MicroMsg.Video.AbstractVideoView", "init abstract video view", new java.lang.Object[0]);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487999e1, this);
        this.f83678f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p0l);
        this.f83679g = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f487563p06);
        this.f83680h = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.ozc);
        this.f83681i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f487554oz2);
        com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar videoPlayerSeekBar = (com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar) findViewById(com.tencent.mm.R.id.ozz);
        this.f83682m = videoPlayerSeekBar;
        this.f83683n = videoPlayerSeekBar;
        if (videoPlayerSeekBar != null) {
            videoPlayerSeekBar.setIplaySeekCallback(tVar);
            this.f83682m.setOnClickListener(uVar);
        }
        ff1.e0 f17 = f(context);
        this.f83684o = f17;
        f17.setVideoCallback(this);
        this.f83684o.setOnSeekCompleteCallback(this);
        this.f83684o.setOnInfoCallback(this);
        this.f83684o.setOnSurfaceCallback(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f83679g.addView((android.view.View) this.f83684o, 0, layoutParams);
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.video;

/* loaded from: classes15.dex */
public class AppBrandVideoWrapper extends android.widget.RelativeLayout implements oe1.o1, oe1.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f83556d;

    /* renamed from: e, reason: collision with root package name */
    public oe1.o1 f83557e;

    /* renamed from: f, reason: collision with root package name */
    public oe1.p1 f83558f;

    /* renamed from: g, reason: collision with root package name */
    public oe1.h1 f83559g;

    /* renamed from: h, reason: collision with root package name */
    public oe1.g1 f83560h;

    /* renamed from: i, reason: collision with root package name */
    public oe1.m1 f83561i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f83562m;

    /* renamed from: n, reason: collision with root package name */
    public long f83563n;

    /* renamed from: o, reason: collision with root package name */
    public float f83564o;

    /* renamed from: p, reason: collision with root package name */
    public int f83565p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f83566q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f83567r;

    /* renamed from: s, reason: collision with root package name */
    public int f83568s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f83569t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.q1 f83570u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f83571v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f83572w;

    /* renamed from: x, reason: collision with root package name */
    public int f83573x;

    /* renamed from: y, reason: collision with root package name */
    public oe1.s1 f83574y;

    /* renamed from: z, reason: collision with root package name */
    public static final bm5.x0 f83555z = new bm5.x0(new oe1.z$$b());
    public static final bm5.x0 A = new bm5.x0(new oe1.z$$c());

    public AppBrandVideoWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // oe1.h1
    public void E(java.lang.String str, java.lang.String str2) {
        p("onVideoEnded", new java.lang.Object[0]);
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.E(str, str2);
        }
    }

    @Override // oe1.h1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        p("onGetVideoSize[%d %d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.I(str, str2, i17, i18);
        }
    }

    @Override // oe1.h1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.w("MicroMsg.Video.AppBrandVideoWrapper", this.f83574y + " onError[%s %d, %d]", str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.N(str, str2, str3, i17, i18);
        }
    }

    @Override // oe1.o1
    public boolean a(double d17, boolean z17) {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            return o1Var.a(d17, z17);
        }
        return false;
    }

    @Override // oe1.o1
    public boolean b(double d17) {
        oe1.o1 o1Var = this.f83557e;
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
        this.f83564o = f17;
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            return o1Var.c(f17);
        }
        return false;
    }

    @Override // oe1.o1
    public void d() {
        p("onUIDestroy hasRequestFocusAudio：%b", java.lang.Boolean.valueOf(this.f83572w));
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.d();
        }
        if (this.f83571v && this.f83572w) {
            this.f83570u.a();
            this.f83572w = false;
        }
        setKeepScreenOn(false);
    }

    @Override // oe1.o1
    public void e() {
        p("onUIPause hasRequestFocusAudio：%b", java.lang.Boolean.valueOf(this.f83572w));
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.e();
        }
        if (this.f83571v && this.f83572w) {
            this.f83570u.a();
            this.f83572w = false;
        }
        setKeepScreenOn(false);
    }

    @Override // oe1.h1
    public void f(java.lang.String str, java.lang.String str2) {
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.f(str, str2);
        }
    }

    @Override // oe1.o1
    public void g() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.g();
        }
    }

    @Override // oe1.o1
    public int getCacheTimeSec() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            return o1Var.getCacheTimeSec();
        }
        return 0;
    }

    @Override // oe1.o1
    public int getCurrPosMs() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            return o1Var.getCurrPosMs();
        }
        return 0;
    }

    @Override // oe1.o1
    public int getCurrPosSec() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            return o1Var.getCurrPosSec();
        }
        return 0;
    }

    @Override // oe1.o1
    public int getPlayerType() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            return o1Var.getPlayerType();
        }
        return 0;
    }

    public android.view.TextureView getTexture() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var == null || !(o1Var.getView() instanceof gf1.e)) {
            return null;
        }
        return ((gf1.e) this.f83557e.getView()).getVideoTexture();
    }

    @Override // oe1.o1
    public int getVideoDurationSec() {
        oe1.o1 o1Var = this.f83557e;
        return o1Var != null ? o1Var.getVideoDurationSec() : this.f83565p;
    }

    @Override // oe1.o1
    public android.view.View getView() {
        return this;
    }

    @Override // oe1.o1
    public void h(boolean z17, java.lang.String str, int i17) {
        this.f83565p = i17;
        this.f83566q = z17;
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        pString.value = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && pString.value.indexOf("file://") == 0) {
            pString.value = pString.value.substring(7);
        }
        this.f83567r = pString.value;
        oe1.o1 o1Var = this.f83557e;
        boolean z18 = false;
        if (o1Var == null) {
            oe1.p1 p1Var = this.f83558f;
            p("setVideoPath, videoViewFactory: " + p1Var.getName(), new java.lang.Object[0]);
            oe1.o1 Td = p1Var.Td(this.f83556d, this.f83573x);
            this.f83557e = Td;
            oe1.s1 s1Var = this.f83574y;
            if (s1Var != null) {
                Td.setVideoContext(s1Var);
            }
            this.f83557e.setMinBufferDuration(this.f83563n);
            this.f83557e.setVideoSource(this.f83568s);
            this.f83557e.setIMMVideoViewCallback(this);
            z18 = true;
        } else {
            o1Var.stop();
        }
        setScaleType(this.f83561i);
        c(this.f83564o);
        setMute(this.f83562m);
        if (z18) {
            setVideoFooterView(this.f83560h);
            addView(this.f83557e.getView(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        this.f83557e.h(this.f83566q, this.f83567r, this.f83565p);
    }

    @Override // oe1.h1
    public void i(java.lang.String str, java.lang.String str2) {
        p("onVideoPause hasRequestFocusAudio：%b", java.lang.Boolean.valueOf(this.f83572w));
        setKeepScreenOn(false);
        if (this.f83571v && this.f83572w) {
            this.f83570u.a();
            this.f83572w = false;
        }
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.i(str, str2);
        }
    }

    @Override // oe1.o1
    public boolean isPlaying() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            return o1Var.isPlaying();
        }
        return false;
    }

    @Override // oe1.o1
    public boolean j() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            return o1Var.j();
        }
        return false;
    }

    @Override // oe1.h1
    public void k(java.lang.String str, java.lang.String str2) {
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.k(str, str2);
        }
    }

    @Override // oe1.h1
    public void l(java.lang.String str, java.lang.String str2) {
        p("onVideoPlay focusAudio:%b, mute:%b", java.lang.Boolean.valueOf(this.f83571v), java.lang.Boolean.valueOf(this.f83562m));
        setKeepScreenOn(true);
        if (this.f83571v && !this.f83562m) {
            this.f83570u.requestFocus();
            this.f83572w = true;
        }
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.l(str, str2);
        }
    }

    @Override // oe1.o1
    public void m() {
        p("preload video url %s", this.f83567r);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f83567r)) {
            return;
        }
        this.f83557e.m();
    }

    @Override // oe1.h1
    public void n(java.lang.String str, long j17) {
        p("onPreloadedMetaData preloadSize:%d", java.lang.Long.valueOf(j17));
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.n(str, j17);
        }
    }

    @Override // oe1.h1
    public void o(java.lang.String str, java.lang.String str2) {
        p("onPrepared", new java.lang.Object[0]);
        oe1.h1 h1Var = this.f83559g;
        if (h1Var != null) {
            h1Var.o(str, str2);
        }
    }

    public final void p(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.AppBrandVideoWrapper", this.f83574y + " " + str, objArr);
    }

    @Override // oe1.o1
    public boolean pause() {
        if (this.f83557e == null) {
            return false;
        }
        setKeepScreenOn(false);
        return this.f83557e.pause();
    }

    @Override // oe1.o1
    public boolean play() {
        if (this.f83557e == null) {
            return false;
        }
        setKeepScreenOn(true);
        return this.f83557e.play();
    }

    @Override // oe1.o1
    public void setCover(android.graphics.Bitmap bitmap) {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.setCover(bitmap);
        }
    }

    public void setFocusAudio(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.AppBrandVideoWrapper", "setFocusAudio:%s", java.lang.Boolean.valueOf(z17));
        this.f83571v = z17;
    }

    @Override // oe1.o1
    public void setFullDirection(int i17) {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.setFullDirection(i17);
        }
    }

    public void setHostComponent(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f83569t = lVar;
    }

    @Override // oe1.o1
    public void setIMMVideoViewCallback(oe1.h1 h1Var) {
        this.f83559g = h1Var;
    }

    @Override // oe1.o1
    public void setIsShowBasicControls(boolean z17) {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.setIsShowBasicControls(z17);
        }
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z17) {
        java.util.Objects.toString(this.f83574y);
        super.setKeepScreenOn(z17);
    }

    @Override // oe1.o1
    public void setMinBufferDuration(long j17) {
        this.f83563n = j17;
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.setMinBufferDuration(j17);
        }
    }

    @Override // oe1.o1
    public void setMute(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.AppBrandVideoWrapper", "setMute: %b", java.lang.Boolean.valueOf(z17));
        this.f83562m = z17;
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.setMute(z17);
        }
    }

    public void setMyVideoViewFactory(oe1.p1 p1Var) {
        p("setMyVideoViewFactory, videoViewFactory: " + p1Var.getName(), new java.lang.Object[0]);
        this.f83558f = p1Var;
    }

    public void setPlayerHint(int i17) {
        p("setPlayerHint, playerHint: " + i17, new java.lang.Object[0]);
        this.f83573x = i17;
    }

    @Override // oe1.o1
    public void setScaleType(oe1.m1 m1Var) {
        this.f83561i = m1Var;
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.setScaleType(m1Var);
        }
    }

    @Override // oe1.o1
    public void setVideoContext(oe1.s1 s1Var) {
        this.f83574y = s1Var;
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.setVideoContext(s1Var);
        }
    }

    @Override // oe1.o1
    public void setVideoFooterView(oe1.g1 g1Var) {
        this.f83560h = g1Var;
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.setVideoFooterView(g1Var);
        }
    }

    @Override // oe1.o1
    public void setVideoSource(int i17) {
        this.f83568s = i17;
    }

    @Override // oe1.o1
    public void start() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.start();
            setKeepScreenOn(true);
        }
    }

    @Override // oe1.o1
    public void stop() {
        oe1.o1 o1Var = this.f83557e;
        if (o1Var != null) {
            o1Var.stop();
            if (this.f83571v && this.f83572w) {
                this.f83570u.a();
                this.f83572w = false;
            }
            setKeepScreenOn(false);
        }
    }

    public AppBrandVideoWrapper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83558f = null;
        this.f83561i = oe1.m1.CONTAIN;
        this.f83562m = false;
        this.f83563n = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.f83564o = -1.0f;
        this.f83568s = 0;
        this.f83569t = null;
        this.f83571v = true;
        this.f83572w = false;
        this.f83573x = 0;
        this.f83574y = null;
        this.f83556d = context;
        this.f83558f = (oe1.p1) f83555z.b();
        this.f83570u = ((com.tencent.mm.plugin.appbrand.jsapi.media.p1) A.b()).sf(new yz5.a() { // from class: oe1.z$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                return com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper.this.f83569t;
            }
        }, new oe1.a0(this));
    }
}

package com.tencent.mm.plugin.brandservice.ui.timeline.video.lite;

/* loaded from: classes15.dex */
public class VideoLiteControBar extends com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar implements oe1.f1 {
    public static final /* synthetic */ int U = 0;
    public android.widget.ImageView C;
    public android.widget.ImageView D;
    public android.view.View E;
    public android.view.View F;
    public oe1.n1 G;
    public com.tencent.mm.sdk.platformtools.b4 H;
    public com.tencent.mm.sdk.platformtools.b4 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f94523J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean P;
    public boolean Q;
    public ns1.c R;
    public oe1.j1 S;
    public final java.util.concurrent.ConcurrentLinkedQueue T;

    public VideoLiteControBar(android.content.Context context) {
        super(context);
        this.Q = true;
        this.T = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, oe1.f1
    public void a(int i17) {
        super.a(i17);
        int i18 = this.f83636p;
        int i19 = this.f83635o;
        oe1.j1 j1Var = this.S;
        if (j1Var != null) {
            ((oe1.m) j1Var).a(i18, i19);
        }
    }

    @Override // oe1.f1
    public void b() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.H;
        if (b4Var != null) {
            b4Var.d();
            this.H.c(7000L, 7000L);
        }
    }

    @Override // oe1.f1
    public boolean c() {
        return this.f94523J;
    }

    @Override // oe1.f1
    public void d() {
    }

    @Override // oe1.f1
    public boolean e() {
        return false;
    }

    @Override // oe1.f1
    public void enterFullScreen() {
        this.f94523J = true;
        u();
    }

    @Override // oe1.f1
    public void f() {
    }

    @Override // oe1.f1
    public void g() {
        setVisibility(0);
        if (this.Q) {
            if (this.H == null) {
                this.H = new com.tencent.mm.sdk.platformtools.b4(new ns1.a(this), false);
            }
            this.H.d();
            this.H.c(7000L, 7000L);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d3j;
    }

    @Override // oe1.f1
    public boolean h() {
        return this.K;
    }

    @Override // oe1.f1
    public void hide() {
        setVisibility(8);
    }

    @Override // oe1.f1
    public void i() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.I;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    @Override // oe1.f1
    public boolean isShow() {
        return getVisibility() == 0;
    }

    @Override // oe1.f1
    public void j() {
        if (isShow()) {
            setVisibility(8);
        } else {
            g();
        }
    }

    @Override // oe1.f1
    public void k(oe1.k1 k1Var) {
        this.T.add(k1Var);
    }

    @Override // oe1.f1
    public void l() {
        this.f94523J = false;
        u();
    }

    @Override // oe1.f1
    public boolean m() {
        return this.Q;
    }

    @Override // oe1.f1
    public void n() {
        if (this.I == null) {
            this.I = new com.tencent.mm.sdk.platformtools.b4(new ns1.b(this), true);
        }
        x();
        this.I.d();
        this.I.c(500L, 500L);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public void o() {
        super.o();
        this.C = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.kxk);
        this.D = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487545oy5);
        this.E = findViewById(com.tencent.mm.R.id.m7g);
        this.F = findViewById(com.tencent.mm.R.id.ci_);
    }

    @Override // oe1.f1
    public void onDestroy() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.I;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.H;
        if (b4Var2 != null) {
            b4Var2.d();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public void q() {
        if (this.f83635o == 0 || this.f83639s || this.f83631h == null) {
            return;
        }
        this.f83633m.setText(p(this.f83636p / 60) + ":" + p(this.f83636p % 60));
        if (getBarLen() == 0) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f83631h.getLayoutParams();
        int barLen = getBarLen();
        layoutParams.leftMargin = t(this.f83636p, barLen);
        this.f83631h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f83629f.getLayoutParams();
        layoutParams2.width = (int) (((this.f83636p * 1.0d) / this.f83635o) * barLen);
        this.f83629f.setLayoutParams(layoutParams2);
        requestLayout();
        int i17 = this.f83636p;
        int i18 = this.f83635o;
        oe1.j1 j1Var = this.S;
        if (j1Var != null) {
            ((oe1.m) j1Var).a(i17, i18);
        }
    }

    public void setAutoHide(boolean z17) {
        this.Q = z17;
    }

    public void setBtnCloseListener(android.view.View.OnClickListener onClickListener) {
        this.D.setOnClickListener(onClickListener);
    }

    @Override // oe1.f1
    public void setDanmakuBtnOnClickListener(oe1.l1 l1Var) {
    }

    @Override // oe1.f1
    public void setDanmakuBtnOpen(boolean z17) {
        this.K = z17;
    }

    @Override // oe1.f1
    public void setExitFullScreenBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // oe1.f1
    public void setFullScreenBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar, oe1.f1
    public void setIsPlay(boolean z17) {
        android.widget.ImageView imageView;
        if (z17) {
            this.f83632i.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_pause, -1));
        } else {
            this.f83632i.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_play, -1));
        }
        ns1.c cVar = this.R;
        if (cVar == null || (imageView = ((ns1.e) cVar).f339353a.f94527g) == null) {
            return;
        }
        imageView.setVisibility(z17 ? 8 : 0);
    }

    @Override // oe1.f1
    public void setMuteBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // oe1.f1
    public void setMuteBtnState(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar, oe1.f1
    public void setOnPlayButtonClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnPlayButtonClickListener(onClickListener);
    }

    public void setOnPlayStatusChangeListener(ns1.c cVar) {
        this.R = cVar;
    }

    @Override // oe1.f1
    public void setOnUpdateProgressLenListener(oe1.j1 j1Var) {
        this.S = j1Var;
    }

    @Override // oe1.f1
    public void setPlayBtnInCenterPosition(boolean z17) {
        this.P = z17;
        v();
    }

    @Override // oe1.f1
    public void setShowControlProgress(boolean z17) {
        this.M = z17;
        w();
    }

    @Override // oe1.f1
    public void setShowDanmakuBtn(boolean z17) {
    }

    @Override // oe1.f1
    public void setShowFullScreenBtn(boolean z17) {
    }

    @Override // oe1.f1
    public void setShowMuteBtn(boolean z17) {
    }

    @Override // oe1.f1
    public void setShowPlayBtn(boolean z17) {
        this.N = z17;
        v();
    }

    @Override // oe1.f1
    public void setShowProgress(boolean z17) {
        this.L = z17;
        w();
    }

    @Override // oe1.f1
    public void setStatePorter(oe1.n1 n1Var) {
        this.G = n1Var;
    }

    @Override // oe1.f1
    public void setTitle(java.lang.String str) {
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.T;
        if (i17 == 0) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                oe1.k1 k1Var = (oe1.k1) it.next();
                if (k1Var != null) {
                    k1Var.a(true);
                }
            }
            return;
        }
        if (i17 == 8 || i17 == 4) {
            java.util.Iterator it6 = concurrentLinkedQueue.iterator();
            while (it6.hasNext()) {
                oe1.k1 k1Var2 = (oe1.k1) it6.next();
                if (k1Var2 != null) {
                    k1Var2.a(false);
                }
            }
        }
    }

    public final void u() {
        float dimensionPixelSize = this.f94523J ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.o_) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480101o4);
        this.f83633m.setTextSize(0, dimensionPixelSize);
        this.f83634n.setTextSize(0, dimensionPixelSize);
        int dimensionPixelSize2 = this.f94523J ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480104o7) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480096nz);
        android.widget.ImageView imageView = this.f83632i;
        if (imageView != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.setMarginStart(dimensionPixelSize2);
            this.f83632i.setLayoutParams(marginLayoutParams);
        }
    }

    public final void v() {
        if (!this.N) {
            this.f83632i.setVisibility(8);
        } else if (this.P) {
            this.f83632i.setVisibility(8);
        } else {
            this.f83632i.setVisibility(0);
        }
    }

    public final void w() {
        boolean z17 = this.M ? this.L : false;
        this.f83633m.setVisibility(z17 ? 0 : 8);
        this.f83634n.setVisibility(z17 ? 0 : 8);
    }

    public final boolean x() {
        oe1.n1 n1Var = this.G;
        if (n1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoLiteControlBar", "updateMiddleBar mStatePorter null");
            return false;
        }
        int cacheTimeSec = ((oe1.i) n1Var).f344712a.f83529f.getCacheTimeSec();
        int videoDurationSec = ((oe1.i) this.G).f344712a.f83529f.getVideoDurationSec();
        if (cacheTimeSec < 0 || videoDurationSec < 0) {
            return false;
        }
        if (cacheTimeSec > videoDurationSec) {
            cacheTimeSec = videoDurationSec;
        }
        int barLen = getBarLen();
        if (barLen <= 0) {
            return true;
        }
        int i17 = videoDurationSec != 0 ? (int) (barLen * ((cacheTimeSec * 1.0d) / videoDurationSec)) : 0;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams.width = i17;
        this.C.setLayoutParams(layoutParams);
        return true;
    }

    public VideoLiteControBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = true;
        this.T = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public VideoLiteControBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Q = true;
        this.T = new java.util.concurrent.ConcurrentLinkedQueue();
    }
}

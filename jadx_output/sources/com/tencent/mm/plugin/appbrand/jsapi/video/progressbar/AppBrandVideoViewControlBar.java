package com.tencent.mm.plugin.appbrand.jsapi.video.progressbar;

/* loaded from: classes15.dex */
public class AppBrandVideoViewControlBar extends com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar implements oe1.f1 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f83645p1 = 0;
    public android.widget.ImageView C;
    public android.widget.ImageView D;
    public android.widget.LinearLayout E;
    public android.widget.ImageView F;
    public android.widget.FrameLayout G;
    public android.widget.ImageView H;
    public android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f83646J;
    public android.widget.TextView K;
    public android.widget.LinearLayout L;
    public android.widget.LinearLayout M;
    public oe1.n1 N;
    public com.tencent.mm.sdk.platformtools.b4 P;
    public com.tencent.mm.sdk.platformtools.b4 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f83647l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f83648p0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f83649x0;

    /* renamed from: y0, reason: collision with root package name */
    public oe1.j1 f83650y0;

    public AppBrandVideoViewControlBar(android.content.Context context) {
        super(context);
        this.f83649x0 = true;
        this.f83647l1 = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, oe1.f1
    public void a(int i17) {
        super.a(i17);
        int i18 = this.f83636p;
        int i19 = this.f83635o;
        oe1.j1 j1Var = this.f83650y0;
        if (j1Var != null) {
            ((oe1.m) j1Var).a(i18, i19);
        }
    }

    @Override // oe1.f1
    public void b() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.P;
        if (b4Var != null) {
            b4Var.d();
            this.P.c(7000L, 7000L);
        }
    }

    @Override // oe1.f1
    public boolean c() {
        return this.R;
    }

    @Override // oe1.f1
    public void d() {
        if (this.W && this.f83648p0) {
            this.I.setVisibility(8);
        }
    }

    @Override // oe1.f1
    public boolean e() {
        return this.G != null && getVisibility() == 0 && this.G.getVisibility() == 0;
    }

    @Override // oe1.f1
    public void enterFullScreen() {
        this.R = true;
        u();
    }

    @Override // oe1.f1
    public void f() {
        if (this.W && this.f83648p0) {
            this.I.setVisibility(0);
        }
    }

    @Override // oe1.f1
    public void g() {
        setVisibility(0);
        if (this.f83649x0) {
            if (this.P == null) {
                this.P = new com.tencent.mm.sdk.platformtools.b4(new df1.e(this), false);
            }
            this.P.d();
            this.P.c(7000L, 7000L);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488116hl;
    }

    @Override // oe1.f1
    public boolean h() {
        return this.S;
    }

    @Override // oe1.f1
    public void hide() {
        setVisibility(8);
    }

    @Override // oe1.f1
    public void i() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.Q;
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
        this.f83647l1.add(k1Var);
    }

    @Override // oe1.f1
    public void l() {
        this.R = false;
        u();
    }

    @Override // oe1.f1
    public boolean m() {
        return this.f83649x0;
    }

    @Override // oe1.f1
    public void n() {
        if (this.Q == null) {
            this.Q = new com.tencent.mm.sdk.platformtools.b4(new df1.f(this), true);
        }
        y();
        this.Q.d();
        this.Q.c(500L, 500L);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public void o() {
        super.o();
        this.C = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.ggy);
        this.D = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.f484023cq4);
        this.F = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.kxk);
        this.G = (android.widget.FrameLayout) this.f83628e.findViewById(com.tencent.mm.R.id.kxn);
        this.E = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g);
        this.H = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.k0y);
        this.I = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.bdx);
        this.f83646J = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.djo);
        this.K = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.L = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ghm);
        this.M = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.kxh);
    }

    @Override // oe1.f1
    public void onDestroy() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.Q;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.P;
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
        oe1.j1 j1Var = this.f83650y0;
        if (j1Var != null) {
            ((oe1.m) j1Var).a(i17, i18);
        }
    }

    public void setAutoHide(boolean z17) {
        this.f83649x0 = z17;
    }

    @Override // oe1.f1
    public void setDanmakuBtnOnClickListener(oe1.l1 l1Var) {
        this.D.setOnClickListener(new df1.d(this, l1Var));
    }

    @Override // oe1.f1
    public void setDanmakuBtnOpen(boolean z17) {
        this.S = z17;
        if (z17) {
            this.D.setImageResource(com.tencent.mm.R.raw.app_brand_video_danmu_on);
        } else {
            this.D.setImageResource(com.tencent.mm.R.raw.app_brand_video_danmu_off);
        }
    }

    @Override // oe1.f1
    public void setExitFullScreenBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f83646J.setOnClickListener(onClickListener);
    }

    @Override // oe1.f1
    public void setFullScreenBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.C.setOnClickListener(onClickListener);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar, com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar, oe1.f1
    public void setIsPlay(boolean z17) {
        if (z17) {
            this.f83632i.setImageResource(com.tencent.mm.R.raw.app_brand_video_play_btn_pause);
            this.I.setImageResource(com.tencent.mm.R.raw.app_brand_video_play_btn_pause);
        } else {
            this.f83632i.setImageResource(com.tencent.mm.R.raw.app_brand_video_play_btn_play);
            this.I.setImageResource(com.tencent.mm.R.raw.app_brand_video_play_btn_play);
        }
    }

    @Override // oe1.f1
    public void setMuteBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.H.setOnClickListener(onClickListener);
    }

    @Override // oe1.f1
    public void setMuteBtnState(boolean z17) {
        if (z17) {
            this.H.setImageResource(com.tencent.mm.R.raw.app_brand_video_mute_btn_off);
        } else {
            this.H.setImageResource(com.tencent.mm.R.raw.app_brand_video_mute_btn_on);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar, oe1.f1
    public void setOnPlayButtonClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnPlayButtonClickListener(onClickListener);
        this.I.setOnClickListener(onClickListener);
    }

    @Override // oe1.f1
    public void setOnUpdateProgressLenListener(oe1.j1 j1Var) {
        this.f83650y0 = j1Var;
    }

    @Override // oe1.f1
    public void setPlayBtnInCenterPosition(boolean z17) {
        this.f83648p0 = z17;
        w();
    }

    @Override // oe1.f1
    public void setShowControlProgress(boolean z17) {
        this.V = z17;
        x();
    }

    @Override // oe1.f1
    public void setShowDanmakuBtn(boolean z17) {
        if (z17) {
            this.D.setVisibility(0);
        } else {
            this.D.setVisibility(8);
        }
    }

    @Override // oe1.f1
    public void setShowFullScreenBtn(boolean z17) {
        this.T = z17;
        v();
        if (this.R) {
            this.L.setVisibility(0);
        } else {
            this.L.setVisibility(8);
        }
    }

    @Override // oe1.f1
    public void setShowMuteBtn(boolean z17) {
        this.H.setVisibility(z17 ? 0 : 8);
    }

    @Override // oe1.f1
    public void setShowPlayBtn(boolean z17) {
        this.W = z17;
        w();
    }

    @Override // oe1.f1
    public void setShowProgress(boolean z17) {
        this.U = z17;
        x();
    }

    @Override // oe1.f1
    public void setStatePorter(oe1.n1 n1Var) {
        this.N = n1Var;
    }

    @Override // oe1.f1
    public void setTitle(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.K.setText(str);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f83647l1;
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
        android.view.ViewGroup.LayoutParams layoutParams = this.E.getLayoutParams();
        if (this.R) {
            layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480105o8);
        } else {
            layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480097o0);
        }
        this.E.setLayoutParams(layoutParams);
        int dimensionPixelSize = this.R ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480106o9) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480098o1);
        this.E.setPadding(0, 0, dimensionPixelSize, 0);
        android.widget.LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        v();
        if (this.R) {
            this.L.setVisibility(0);
        } else {
            this.L.setVisibility(8);
        }
        float dimensionPixelSize2 = this.R ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.o_) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480101o4);
        this.f83633m.setTextSize(0, dimensionPixelSize2);
        this.f83634n.setTextSize(0, dimensionPixelSize2);
        int dimensionPixelSize3 = this.R ? getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480104o7) : getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480096nz);
        android.widget.ImageView imageView = this.f83632i;
        if (imageView != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.setMarginStart(dimensionPixelSize3);
            this.f83632i.setLayoutParams(marginLayoutParams);
        }
        android.widget.LinearLayout linearLayout2 = this.M;
        if (linearLayout2 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
            marginLayoutParams2.setMarginStart(dimensionPixelSize3);
            this.M.setLayoutParams(marginLayoutParams2);
        }
        android.widget.ImageView imageView2 = this.D;
        if (imageView2 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            marginLayoutParams3.setMarginStart(dimensionPixelSize3);
            this.D.setLayoutParams(marginLayoutParams3);
        }
        android.widget.ImageView imageView3 = this.H;
        if (imageView3 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) imageView3.getLayoutParams();
            marginLayoutParams4.setMarginStart(dimensionPixelSize3);
            this.H.setLayoutParams(marginLayoutParams4);
        }
        android.widget.ImageView imageView4 = this.C;
        if (imageView4 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = (android.view.ViewGroup.MarginLayoutParams) imageView4.getLayoutParams();
            marginLayoutParams5.setMarginStart(dimensionPixelSize3);
            this.C.setLayoutParams(marginLayoutParams5);
        }
    }

    public void v() {
        if (!this.T) {
            this.C.setVisibility(8);
            return;
        }
        this.C.setVisibility(0);
        if (this.R) {
            this.C.setImageResource(com.tencent.mm.R.raw.app_brand_video_fullscreen_exit_btn);
        } else {
            this.C.setImageResource(com.tencent.mm.R.raw.app_brand_video_fullscreen_btn);
        }
    }

    public final void w() {
        if (!this.W) {
            this.f83632i.setVisibility(8);
            this.I.setVisibility(8);
        } else if (this.f83648p0) {
            this.f83632i.setVisibility(8);
            this.I.setVisibility(0);
        } else {
            this.f83632i.setVisibility(0);
            this.I.setVisibility(8);
        }
    }

    public final void x() {
        boolean z17 = this.V ? this.U : false;
        this.G.setVisibility(z17 ? 0 : 8);
        this.f83633m.setVisibility(z17 ? 0 : 8);
        this.f83634n.setVisibility(z17 ? 0 : 8);
    }

    public final boolean y() {
        oe1.n1 n1Var = this.N;
        if (n1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVideoViewControlBar", "updateMiddleBar mStatePorter null");
            return false;
        }
        int cacheTimeSec = ((oe1.i) n1Var).f344712a.f83529f.getCacheTimeSec();
        int videoDurationSec = ((oe1.i) this.N).f344712a.f83529f.getVideoDurationSec();
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
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.width = i17;
        this.F.setLayoutParams(layoutParams);
        return true;
    }

    public AppBrandVideoViewControlBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83649x0 = true;
        this.f83647l1 = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public AppBrandVideoViewControlBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83649x0 = true;
        this.f83647l1 = new java.util.concurrent.ConcurrentLinkedQueue();
    }
}

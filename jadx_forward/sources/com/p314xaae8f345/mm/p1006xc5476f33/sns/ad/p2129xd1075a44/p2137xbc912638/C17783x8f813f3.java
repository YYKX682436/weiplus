package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar */
/* loaded from: classes4.dex */
public class C17783x8f813f3 extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f245001d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313 f245002e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f245003f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f245004g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f245005h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f245006i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f245007m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e1 f245008n;

    public C17783x8f813f3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f245005h = z17;
        android.widget.ImageView imageView = this.f245003f;
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar swichScreenStatus, switchScreenIv is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        } else {
            if (z17) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79600xd8cb0859);
            } else {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79598xbf7b5812);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("switchScreenStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        }
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        android.widget.ImageView imageView = this.f245004g;
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar swichVoiceStatus, voiceIv is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        } else {
            if (z17) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79603x5954b0de);
            } else {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79602xd1416a50);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("switchVoiceStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 c17783x8f813f3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313 c17782xc2740313 = this.f245002e;
        if (c17782xc2740313 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar updateTime, seekBar is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return;
        }
        c17782xc2740313.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e1 e1Var = this.f245008n;
        if (e1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$8");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1 f1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.c1) e1Var).f244309a;
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1.Y(f1Var).S != null && f1Var.mo1022xc00617a4()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                boolean z17 = f1Var.L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                if (!z17 && (c17783x8f813f3 = f1Var.D) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
                    boolean z18 = c17783x8f813f3.f245005h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFullScreen", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
                    if (!z18) {
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1.Y(f1Var).S.f84421b;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                        f1Var.i0(i18, i17 * 1000);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent");
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$8");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    public void e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313 c17782xc2740313 = this.f245002e;
        if (c17782xc2740313 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar updateVideoStatus, seekBar is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        } else {
            c17782xc2740313.mo61296x11f3be80(z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateVideoStatus", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        }
    }

    /* renamed from: getLayoutId */
    public int m69555x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569506cy;
    }

    /* renamed from: getSeekBar */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313 m69556xb3543e45() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSeekBar", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313 c17782xc2740313 = this.f245002e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSeekBar", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return c17782xc2740313;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    /* renamed from: getVideoTotalTime */
    public int mo69557xdf1112ec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313 c17782xc2740313 = this.f245002e;
        if (c17782xc2740313 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar getVideoTotalTime, seekBar is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            return 0;
        }
        int mo69281xdf1112ec = c17782xc2740313.mo69281xdf1112ec();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return mo69281xdf1112ec;
    }

    @Override // android.view.View
    public int getVisibility() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        int visibility = this.f245002e.getVisibility();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        return visibility;
    }

    /* renamed from: setForceHideFullScreenIcon */
    public void m69558x3efad05f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setForceHideFullScreenIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f245007m = z17;
        android.widget.ImageView imageView = this.f245003f;
        if (imageView != null && z17) {
            imageView.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setForceHideFullScreenIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    /* renamed from: setForceHideVoiceIcon */
    public void m69559x47549480(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setForceHideVoiceIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f245006i = z17;
        android.widget.ImageView imageView = this.f245004g;
        if (imageView != null && z17) {
            imageView.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            android.widget.ImageView imageView2 = this.f245003f;
            if (imageView2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(11);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeToolBarLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setForceHideVoiceIcon", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    /* renamed from: setOnFullScreenClickListener */
    public void m69560x22441f20(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        android.widget.ImageView imageView = this.f245003f;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnFullScreenClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    /* renamed from: setOnVoiceButtonClickListener */
    public void m69561x5106dcb9(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnVoiceButtonClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        android.widget.ImageView imageView = this.f245004g;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnVoiceButtonClickListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    /* renamed from: setUpdateTimeListener */
    public void m69562xd547ea0c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        this.f245008n = e1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUpdateTimeListener", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.z0
    /* renamed from: setVideoTotalTime */
    public void mo61298xa7077af8(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313 c17782xc2740313 = this.f245002e;
        if (c17782xc2740313 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingVideoPlayerToolBar", "in adLandingVideoPlayerToolBar setVideoTotalTime, seekBar is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        } else {
            c17782xc2740313.mo61298xa7077af8(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoTotalTime", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313 c17782xc2740313 = this.f245002e;
        if (c17782xc2740313 != null && this.f245003f != null && this.f245004g != null) {
            c17782xc2740313.setVisibility(i17);
            if (!this.f245007m) {
                this.f245003f.setVisibility(i17);
            }
            if (!this.f245006i) {
                this.f245004g.setVisibility(i17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }

    public C17783x8f813f3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f245001d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        android.view.View inflate = android.view.View.inflate(getContext(), m69555x2ee31f5b(), this);
        this.f245001d = inflate;
        this.f245002e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17782xc2740313) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564174jz);
        this.f245003f = (android.widget.ImageView) this.f245001d.findViewById(com.p314xaae8f345.mm.R.id.f568535n55);
        this.f245004g = (android.widget.ImageView) this.f245001d.findViewById(com.p314xaae8f345.mm.R.id.f568536n56);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView */
/* loaded from: classes4.dex */
public class C17735x2c84e2c extends com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 {
    public int O1;
    public java.lang.String P1;
    public boolean Q1;
    public g54.d R1;

    public C17735x2c84e2c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getRootPath */
    private java.lang.String m69386x71e6559d() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P1)) {
            str = lp0.b.D() + "video/";
        } else {
            str = this.P1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return str;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 C(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.f271287w == 1) {
            this.f271286v = true;
            this.f271290z = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c c17737xd9711c0c = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c(context);
            c17737xd9711c0c.m69427x59cb9bd1(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return c17737xd9711c0c;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseThumbVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_general_comp_use_thumb_video_view, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "isUseThumbVideoView is " + Ni);
            r5 = Ni == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseThumbVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, "isUseThumbVideoView, exp is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseThumbVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        }
        if (!r5) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 C = super.C(context);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return C;
        }
        this.f271286v = true;
        this.f271290z = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return c18696xc5bcd349;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        super.I();
        this.f271272e = "MicroMsg.AdLandingGeneralVideoView";
        this.f271271d = "VideoView.AdLandingGeneralVideoView";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNeedOperateSurfaceTexture", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var).m75831x3593491a(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNeedOperateSurfaceTexture", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public java.lang.String N() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logTips", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        java.lang.String str = this.f153183y0 + " ";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logTips", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void W(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        super.W(i17);
        g54.d dVar = this.R1;
        if (dVar != null) {
            dVar.a(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean Z(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.O1 != 1) {
            boolean Z = super.Z(i17, c19767x257d7f, c19767x257d7f2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return Z;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcDownloadFirstRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        c19767x257d7f.f38864x6ac9171 = java.lang.Math.max(i17, this.E1);
        int i18 = this.f153184y1;
        if (i18 == 1) {
            c19767x257d7f.f38864x6ac9171 = i17;
        }
        if (i18 == 2) {
            int i19 = i17 - 8;
            c19767x257d7f.f38864x6ac9171 = i19;
            if (i19 < 0) {
                c19767x257d7f.f38864x6ac9171 = 0;
            }
        }
        if (i18 == 3 || i18 == 4) {
            c19767x257d7f.f38864x6ac9171 = this.E1;
        }
        c19767x257d7f2.f38864x6ac9171 = this.A1 + 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", N(), java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f153184y1), java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this.f153183y0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcDownloadFirstRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcDownloadRange", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean a0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        boolean z17 = true;
        if (this.O1 != 1) {
            boolean a07 = super.a0(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            return a07;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDownloadFirstCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.A1 - this.E1 > 1 && this.f153182x1 != 3) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDownloadFirstCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCanPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003b -> B:20:0x004f). Please report as a decompilation issue!!! */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        try {
            super.d();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
            boolean z17 = f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = f4Var;
            if (z17) {
                c19745xad58a1a4 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var;
                c19745xad58a1a4.getClass();
                try {
                    if (c19745xad58a1a4.G) {
                        android.graphics.SurfaceTexture surfaceTexture = c19745xad58a1a4.F;
                        c19745xad58a1a4 = c19745xad58a1a4;
                        if (surfaceTexture != null) {
                            if (android.os.Build.VERSION.SDK_INT >= 26) {
                                c19745xad58a1a4 = c19745xad58a1a4;
                                if (!surfaceTexture.isReleased()) {
                                    c19745xad58a1a4.F.release();
                                    c19745xad58a1a4.F = null;
                                    c19745xad58a1a4 = c19745xad58a1a4;
                                }
                            } else {
                                surfaceTexture.release();
                                c19745xad58a1a4.F = null;
                                c19745xad58a1a4 = c19745xad58a1a4;
                            }
                        }
                    } else {
                        c19745xad58a1a4 = c19745xad58a1a4;
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.String str = c19745xad58a1a4.f272981h;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, th6.toString());
                    c19745xad58a1a4 = str;
                }
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, th7.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public void d0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createVideoFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.T)) {
            this.f153183y0 = l44.c0.h("AdLandingGeneralVideo_" + this.T.hashCode(), this.Q1);
            java.lang.String str = m69386x71e6559d() + "AdLandingGeneralVideo_" + this.T.hashCode() + ".mp4";
            this.f153178l1 = str;
            com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s set video path [%s %s]", N(), this.f153183y0, this.f153178l1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "setVideoPath, cdnMediaId = " + this.f153183y0 + ", url = " + this.T);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createVideoFilePath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    /* renamed from: getInnerVideoView */
    public android.view.View mo48227xab066d00() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.f271286v) {
            java.lang.Object obj = this.f271281q;
            if ((obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) || (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c)) {
                android.view.View view = (android.view.View) obj;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
                return view;
            }
        }
        android.view.View mo48227xab066d00 = super.mo48227xab066d00();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return mo48227xab066d00;
    }

    /* renamed from: getThumbView */
    public android.widget.ImageView m69387x4eb0f6e5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        android.widget.ImageView imageView = this.f271275h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return imageView;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s set video path isLive [%b] url [%s] durationSec [%d]", N(), java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExptGeneralVideoAdEnableH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
        this.Q1 = true;
        this.S = z17;
        java.lang.String j17 = l44.c0.j(str, true);
        this.T = j17;
        this.U = i17;
        this.R.f272335i = j17;
        d0();
        if (this.f271286v && (this.f271281q instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c)) {
            this.f271276i.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean j0(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "seekTo, time = " + i17 + ", afterSeekPlay = " + z17);
        boolean j07 = super.j0(i17, z17);
        if (this.f153182x1 == 3 && this.O1 == 1) {
            this.B1 = -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        return j07;
    }

    /* renamed from: setAdMMVideoViewCallback */
    public void m69388x45d0c420(g54.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdMMVideoViewCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (dVar != null) {
            this.R1 = dVar;
            mo61532x526554de(dVar);
            mo64630x8fda8107(this.R1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdMMVideoViewCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    /* renamed from: setRootPath */
    public void mo48224x6c9eb6a9(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        this.P1 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRootPath", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setScaleType */
    public void mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        if (this.f271286v) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
            if (f4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) f4Var).mo69431xebd28962(e1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
                return;
            } else if (f4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c) f4Var).mo69431xebd28962(e1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
                return;
            }
        }
        super.mo48237xebd28962(e1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    /* renamed from: setVideoPlayerMode */
    public void m69389xe17c2e3d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        this.O1 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4
    public void z(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        super.z(z17);
        if (this.f271286v && (this.f271281q instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c)) {
            this.f271276i.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
    }

    public C17735x2c84e2c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public C17735x2c84e2c(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.O1 = 0;
        this.Q1 = false;
    }
}

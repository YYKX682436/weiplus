package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper */
/* loaded from: classes4.dex */
public class ViewOnTouchListenerC17736xfc8efac extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p2470x93e71c27.ui.a1, com.p314xaae8f345.mm.p2470x93e71c27.ui.c1, com.p314xaae8f345.mm.p2470x93e71c27.ui.b1, com.p314xaae8f345.mm.p2470x93e71c27.ui.d1, m34.e, android.view.View.OnTouchListener, android.view.View.OnClickListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, c01.i {
    public static final /* synthetic */ int S = 0;
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 f244530J;
    public long K;
    public int L;
    public int M;
    public long N;
    public int P;
    public android.graphics.Bitmap Q;
    public final android.content.Context R;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c f244531d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 f244532e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f244533f;

    /* renamed from: g, reason: collision with root package name */
    public int f244534g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f244535h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.GestureDetector f244536i;

    /* renamed from: m, reason: collision with root package name */
    public c01.k f244537m;

    /* renamed from: n, reason: collision with root package name */
    public g54.c f244538n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f244539o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f244540p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout.LayoutParams f244541q;

    /* renamed from: r, reason: collision with root package name */
    public int f244542r;

    /* renamed from: s, reason: collision with root package name */
    public int f244543s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout.LayoutParams f244544t;

    /* renamed from: u, reason: collision with root package name */
    public int f244545u;

    /* renamed from: v, reason: collision with root package name */
    public float f244546v;

    /* renamed from: w, reason: collision with root package name */
    public float f244547w;

    /* renamed from: x, reason: collision with root package name */
    public final float f244548x;

    /* renamed from: y, reason: collision with root package name */
    public float f244549y;

    /* renamed from: z, reason: collision with root package name */
    public float f244550z;

    public ViewOnTouchListenerC17736xfc8efac(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_general_comp_exit_native_page_show_thumb, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "isShowThumb is " + Ni);
            boolean z17 = Ni == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "isShowThumb, exp is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return false;
        }
    }

    public void A() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCurrentFrameBitmapToThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        try {
            android.view.View m69393xab066d00 = m69393xab066d00();
            if (v() && (m69393xab066d00 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349)) {
                if (!m69403xc00617a4() && (bitmap = this.Q) != null) {
                    m69406x52d31475(bitmap);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCurrentFrameBitmapToThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) m69393xab066d00;
                    android.graphics.Bitmap bitmap2 = c18696xc5bcd349.getBitmap(c18696xc5bcd349.getWidth() / 2, c18696xc5bcd349.getHeight() / 2);
                    if (bitmap2 != null) {
                        m69406x52d31475(bitmap2);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "setCurrentFrameBitmapToThumb, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCurrentFrameBitmapToThumb", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "start play, downloadFailed = " + this.f244539o);
        if (this.f244539o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "last download fail, try again");
            this.f244531d.h(false, this.f244535h, 0);
            z(0, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        if (m69403xc00617a4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "startPlay but player is playing");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        int m69392x898ffe25 = m69392x898ffe25();
        if (m69392x898ffe25 == m69400x6d590e18()) {
            z(0, true);
        } else {
            z(m69392x898ffe25, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStartPlayReportParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.K = java.lang.System.currentTimeMillis();
        this.M++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStartPlayReportParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoEnded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoEnded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f244539o = true;
        if (v()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, 23);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.t.f69748x366c91de, 10);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "player callback error, %s, %s, %s, %d, %d", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoWaiting", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.N = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "mediaId = " + str2 + ", start loading");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoWaiting", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // c01.i
    public void P0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // c01.i
    public void U5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lossTransient", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lossTransient", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // c01.i
    public void V3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gain", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gain", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        g54.c cVar = this.f244538n;
        if (cVar != null) {
            cVar.a(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // m34.e
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekPre", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        g54.c cVar = this.f244538n;
        if (cVar != null) {
            cVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekPre", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.d1
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        g54.c cVar = this.f244538n;
        if (cVar != null) {
            cVar.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // m34.e
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeeking", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeeking", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        c01.k kVar = this.f244537m;
        if (kVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return false;
        }
        boolean b17 = kVar.b(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("abandonAudioFocus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return b17;
    }

    public void g(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustVideoViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustVideoViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        if (z17) {
            android.widget.RelativeLayout.LayoutParams layoutParams = this.f244544t;
            if (layoutParams != null) {
                c17735x2c84e2c.setLayoutParams(layoutParams);
            }
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = this.f244541q;
            if (layoutParams2 != null) {
                c17735x2c84e2c.setLayoutParams(layoutParams2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustVideoViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // c01.i
    public void g3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loss", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loss", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: getAdLandingVideoFullScreenFloatBarReportInfo */
    public j64.a m69390x7f2d1eb1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var = this.f244530J;
        j64.a aVar = null;
        if (q0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtnComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = q0Var.f246956y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtnComponent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        if (o2Var != null) {
            aVar = new j64.a();
            q0Var.O();
            aVar.f379438d = o2Var.z();
            aVar.f379439e = o2Var.r();
            aVar.f379440f = o2Var.w();
            aVar.f379441g = o2Var.R();
            aVar.f379435a = q0Var.r();
            aVar.f379436b = q0Var.w();
            aVar.f379437c = q0Var.A;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingVideoFullScreenFloatBarReportInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return aVar;
    }

    /* renamed from: getCurrPosMs */
    public int m69391x25784152() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrPosMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrPosMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return 0;
        }
        int mo64621x25784152 = c17735x2c84e2c.mo64621x25784152();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrPosMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return mo64621x25784152;
    }

    /* renamed from: getCurrPosSec */
    public int m69392x898ffe25() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrPosSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrPosSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return 0;
        }
        int mo61523x898ffe25 = c17735x2c84e2c.mo61523x898ffe25();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrPosSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return mo61523x898ffe25;
    }

    /* renamed from: getInnerVideoView */
    public android.view.View m69393xab066d00() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return null;
        }
        android.view.View mo48227xab066d00 = c17735x2c84e2c.mo48227xab066d00();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInnerVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return mo48227xab066d00;
    }

    /* renamed from: getPlayCount */
    public int m69394x8df82785() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPlayCount", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        int i17 = this.M;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayCount", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return i17;
    }

    /* renamed from: getPlayTimeInterval */
    public int m69395xd168977c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPlayTimeInterval", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        int i17 = this.L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPlayTimeInterval", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return i17;
    }

    /* renamed from: getThumbView */
    public android.widget.ImageView m69396x4eb0f6e5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return null;
        }
        android.widget.ImageView m69387x4eb0f6e5 = c17735x2c84e2c.m69387x4eb0f6e5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return m69387x4eb0f6e5;
    }

    /* renamed from: getToolBar */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 m69397xf9d84f25() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getToolBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 c17783x8f813f3 = this.f244532e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getToolBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return c17783x8f813f3;
    }

    /* renamed from: getVideoCompContainer */
    public android.view.ViewGroup m69398xaac31b6d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoCompContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        android.view.ViewGroup viewGroup = this.f244533f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoCompContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return viewGroup;
    }

    /* renamed from: getVideoDurationMs */
    public int m69399x7723e6ff() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        android.view.View m69393xab066d00 = m69393xab066d00();
        if (m69393xab066d00 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c) {
            int mo69286x51e8b0a = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c) m69393xab066d00).mo69286x51e8b0a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return mo69286x51e8b0a;
        }
        if (m69393xab066d00 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) {
            int mo69286x51e8b0a2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) m69393xab066d00).mo69286x51e8b0a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return mo69286x51e8b0a2;
        }
        if (m69393xab066d00 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) {
            int mo69286x51e8b0a3 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) m69393xab066d00).mo69286x51e8b0a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return mo69286x51e8b0a3;
        }
        int m69400x6d590e18 = m69400x6d590e18() * 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return m69400x6d590e18;
    }

    /* renamed from: getVideoDurationSec */
    public int m69400x6d590e18() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoDurationSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c != null) {
            int mo61527x6d590e18 = c17735x2c84e2c.mo61527x6d590e18();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDurationSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return mo61527x6d590e18;
        }
        int i17 = this.f244534g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoDurationSec", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return i17;
    }

    /* renamed from: getVideoView */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c m69401x4ee17f0a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return c17735x2c84e2c;
    }

    public final void h(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animationLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        c17735x2c84e2c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c17735x2c84e2c, "rotation", f17, f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scaleAnimator", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c17735x2c84e2c, "scaleX", f19, f27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleAnimator", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scaleAnimator", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c17735x2c84e2c, "scaleY", f19, f27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleAnimator", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        linkedList2.add(ofFloat);
        linkedList2.add(ofFloat2);
        linkedList2.add(ofFloat3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
        linkedList.addAll(linkedList2);
        this.f244532e.setPivotX(this.B);
        this.f244532e.setPivotY(this.C);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 c17783x8f813f3 = this.f244532e;
        c17783x8f813f3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createAnimation", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(c17783x8f813f3, "rotation", f17, f18);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(c17783x8f813f3, "translationX", f28, f29);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(c17783x8f813f3, "translationY", f37, f38);
        android.animation.ValueAnimator ofFloat7 = android.animation.ValueAnimator.ofFloat(f39, f47);
        ofFloat7.addUpdateListener(new l84.a(c17783x8f813f3));
        ofFloat7.addListener(new l84.b(c17783x8f813f3));
        linkedList3.add(ofFloat4);
        linkedList3.add(ofFloat5);
        linkedList3.add(ofFloat6);
        linkedList3.add(ofFloat7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createAnimation", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar");
        linkedList.addAll(linkedList3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var = this.f244530J;
        if (q0Var != null && q0Var.q() != null) {
            android.view.View q17 = this.f244530J.q();
            q17.setPivotX(this.D);
            q17.setPivotY(this.E);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var2 = this.f244530J;
            q0Var2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(q0Var2.f246952u, "rotation", f17, f18);
            android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(q0Var2.f246952u, "translationX", f28, f29);
            android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(q0Var2.f246952u, "translationY", f37, f38);
            android.animation.ValueAnimator ofFloat11 = android.animation.ValueAnimator.ofFloat(f39, f47);
            ofFloat11.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o0(q0Var2));
            linkedList4.add(ofFloat8);
            linkedList4.add(ofFloat9);
            linkedList4.add(ofFloat10);
            linkedList4.add(ofFloat11);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            linkedList.addAll(linkedList4);
        }
        animatorSet.playTogether(linkedList);
        if (this.I) {
            animatorSet.setDuration(0L);
        } else {
            animatorSet.setDuration(500L);
        }
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animationLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        try {
            android.view.View m69393xab066d00 = m69393xab066d00();
            if (this.Q == null && v() && (m69393xab066d00 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349 c18696xc5bcd349 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18696xc5bcd349) m69393xab066d00;
                this.Q = c18696xc5bcd349.getBitmap(c18696xc5bcd349.getWidth() / 2, c18696xc5bcd349.getHeight() / 2);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "onVideoPause, ThumbPlayerVideoView is not playing and getBitmap from it but exp is " + th6);
        }
        g54.c cVar = this.f244538n;
        if (cVar != null) {
            cVar.i(str, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c1
    /* renamed from: idkeyStat */
    public void mo69402x336bdfd8(long j17, long j18, long j19, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idkeyStat", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idkeyStat", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: isPlaying */
    public boolean m69403xc00617a4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return false;
        }
        boolean mo61531xc00617a4 = c17735x2c84e2c.mo61531xc00617a4();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPlaying", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return mo61531xc00617a4;
    }

    public final void j(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcPortraitLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        float f19 = this.G;
        float f27 = f17 / f19;
        float f28 = this.H;
        if (f27 > f18 / f28) {
            int i17 = (int) f19;
            this.f244542r = i17;
            this.f244543s = ((int) ((i17 * f18) / f17)) + 1;
        } else {
            int i18 = (int) f28;
            this.f244543s = i18;
            this.f244542r = ((int) ((i18 * f17) / f18)) + 1;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(this.f244542r, this.f244543s);
        this.f244544t = layoutParams;
        int i19 = (((int) this.G) - this.f244542r) / 2;
        layoutParams.leftMargin = i19;
        layoutParams.rightMargin = i19;
        int i27 = (((int) this.H) - this.f244543s) / 2;
        layoutParams.topMargin = i27;
        layoutParams.bottomMargin = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPortraitLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void k(float f17, float f18, float f19, float f27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcVideoFullScreenParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        try {
            this.G = f19;
            this.H = f27;
            this.f244541q = (android.widget.RelativeLayout.LayoutParams) this.f244531d.getLayoutParams();
            j(f17, f18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcLandScapeScale", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            float f28 = this.H;
            float f29 = this.G;
            float f37 = f28 / f29;
            float f38 = this.f244542r;
            float f39 = this.f244543s;
            if (f37 > f38 / f39) {
                this.f244549y = f29 / f39;
            } else {
                this.f244549y = f28 / f38;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcLandScapeScale", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            this.f244550z = (f27 - f19) / 2.0f;
            this.B = f19 / 2.0f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 c17783x8f813f3 = this.f244532e;
            if (c17783x8f813f3 == null || c17783x8f813f3.getHeight() <= 0) {
                this.C = ((-f27) / 2.0f) + i65.a.b(getContext(), 64);
            } else {
                this.C = ((-f27) / 2.0f) + this.f244532e.getHeight();
            }
            this.D = this.B;
            this.E = ((-f27) / 2.0f) + i65.a.b(getContext(), 96);
            this.A = i65.a.b(getContext(), 64);
            this.F = f27 - ((int) (r8 * 2.0f));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingGeneralVideoWrapper", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcVideoFullScreenParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c1
    /* renamed from: kvStat */
    public void mo69404xbd3cda5f(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kvStat", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kvStat", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.Q = null;
        g54.c cVar = this.f244538n;
        if (cVar != null) {
            cVar.l(str, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public final void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        if (this.N != 0) {
            this.P = (int) (this.P + (java.lang.System.currentTimeMillis() - this.N));
            this.N = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "mediaId = " + str2 + ", end loading");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepared", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f244539o = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingGeneralVideoWrapper", "player callback onPrepared, %s", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepared", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        g54.c cVar = this.f244538n;
        if (cVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return false;
        }
        boolean mo69376xce1d2af3 = cVar.mo69376xce1d2af3(motionEvent);
        yj0.a.i(mo69376xce1d2af3, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return mo69376xce1d2af3;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDown", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDown", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFling", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFling", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShowPress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowPress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        g54.c cVar = this.f244538n;
        if (cVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return false;
        }
        boolean mo69377x2f29e7a3 = cVar.mo69377x2f29e7a3(motionEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return mo69377x2f29e7a3;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapUp", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapUp", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f244536i;
        if (gestureDetector == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return false;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/sns/ad/landingpage/component/view/AdLandingGeneralVideoWrapper", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return onTouchEvent;
    }

    public boolean p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFullScreenFloatBarShowing", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var = this.f244530J;
        if (q0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFullScreenFloatBarShowing", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return false;
        }
        q0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        boolean z17 = q0Var.f246952u.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFullScreenFloatBarShowing", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleFullScreenFloatBarStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        if (!this.f244540p) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleFullScreenFloatBarStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var = this.f244530J;
        if (q0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleFullScreenFloatBarStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        if (z17) {
            q0Var.R(true, 0L);
        } else {
            q0Var.U(true, 0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleFullScreenFloatBarStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a1
    public void r(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadFinish", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadFinish", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void s(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        android.content.Context context = this.R;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        if (i17 == 0) {
            this.f244531d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c(context, null);
        } else {
            this.f244531d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c(context, null, 0, i17);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f244531d, layoutParams);
        this.f244536i = new android.view.GestureDetector(this);
        this.f244537m = new c01.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: setAnimImmediately */
    public void m69405x4728a96b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimImmediately", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.I = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimImmediately", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: setCover */
    public void m69406x52d31475(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCover", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c != null) {
            c17735x2c84e2c.mo64626x52d31475(bitmap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCover", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: setFullScreen */
    public void m69407xec596ddd(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFullScreen", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f244540p = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFullScreen", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: setMute */
    public void m69408x764d819b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMute", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c != null) {
            c17735x2c84e2c.mo61536x764d819b(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMute", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: setPlayerMode */
    public void m69409x994df626(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c != null) {
            c17735x2c84e2c.m69389xe17c2e3d(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPlayerMode", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: setScaleType */
    public void m69410xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        android.widget.ImageView m69387x4eb0f6e5 = c17735x2c84e2c.m69387x4eb0f6e5();
        if (m69387x4eb0f6e5 != null) {
            if (e1Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER) {
                m69387x4eb0f6e5.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            } else if (e1Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN) {
                m69387x4eb0f6e5.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            }
        }
        this.f244531d.mo48237xebd28962(e1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScaleType", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: setVideoContainer */
    public void m69411xb0f16748(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f244533f = viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoContainer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    /* renamed from: setVideoToolBar */
    public void m69412x4a8133e2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 c17783x8f813f3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoToolBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f244532e = c17783x8f813f3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoToolBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void t(g54.c cVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        this.f244538n = cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c != null) {
            c17735x2c84e2c.mo48236x764cf626(true);
            this.f244531d.m75326x5d1e8363(this);
            this.f244531d.mo61532x526554de(this);
            this.f244531d.mo48221xf83edb22(this);
            this.f244531d.mo64630x8fda8107(this);
            setOnTouchListener(this);
            setOnClickListener(this);
            java.lang.String g17 = za4.t0.g();
            com.p314xaae8f345.mm.vfs.w6.u(g17);
            this.f244531d.mo48224x6c9eb6a9(g17);
            w54.g gVar = new w54.g();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPreAllocStorage", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
            gVar.f524574f = z17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPreAllocStorage", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
            this.f244531d.m48235xbc2f47ad(gVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVideoView", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public boolean v() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseTPPlayer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c != null) {
            c17735x2c84e2c.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseTPPlayer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            boolean z18 = c17735x2c84e2c.f271286v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseTPPlayer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoView");
            if (z18) {
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseTPPlayer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
                return z17;
            }
        }
        z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseTPPlayer", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void w(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        if (i17 == -1 || i17 == 180) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        int i18 = this.f244545u;
        if (i18 == i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            return;
        }
        if (i17 == 90) {
            this.f244547w = 90.0f;
            if (i18 == 0) {
                float f17 = this.f244546v;
                float f18 = this.f244548x;
                float f19 = this.f244549y;
                float f27 = this.f244550z;
                h(f17, 90.0f, f18, f19, 0.0f, f27, 0.0f, this.A + (-f27), this.G, this.F);
            } else {
                float f28 = this.f244546v;
                float f29 = this.f244549y;
                float f37 = this.f244550z;
                float f38 = -f37;
                float f39 = this.A;
                float f47 = this.F;
                h(f28, 90.0f, f29, f29, f38, f37, f37 - f39, f38 + f39, f47, f47);
            }
            this.f244546v = this.f244547w;
        } else if (i17 == -90) {
            this.f244547w = -90.0f;
            if (i18 == 0) {
                float f48 = this.f244546v;
                float f49 = this.f244548x;
                float f57 = this.f244549y;
                float f58 = this.f244550z;
                h(f48, -90.0f, f49, f57, 0.0f, -f58, 0.0f, f58 - this.A, this.G, this.F);
            } else {
                float f59 = this.f244546v;
                float f66 = this.f244549y;
                float f67 = this.f244550z;
                float f68 = -f67;
                float f69 = this.A;
                float f76 = this.F;
                h(f59, -90.0f, f66, f66, f67, f68, f68 + f69, f67 - f69, f76, f76);
            }
            this.f244546v = this.f244547w;
        } else {
            this.f244547w = 0.0f;
            if (i18 == 90) {
                float f77 = this.f244546v;
                float f78 = this.f244549y;
                float f79 = this.f244548x;
                float f86 = this.f244550z;
                h(f77, 0.0f, f78, f79, f86, 0.0f, this.A + (-f86), 0.0f, this.F, this.G);
            } else {
                float f87 = this.f244546v;
                float f88 = this.f244549y;
                float f89 = this.f244548x;
                float f96 = this.f244550z;
                h(f87, 0.0f, f88, f89, -f96, 0.0f, f96 - this.A, 0.0f, this.F, this.G);
            }
            this.f244546v = this.f244547w;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.q0 q0Var = this.f244530J;
        if (q0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoOrientation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
            q0Var.C = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoOrientation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
        }
        this.f244545u = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void x() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17735x2c84e2c c17735x2c84e2c = this.f244531d;
        if (c17735x2c84e2c != null) {
            c17735x2c84e2c.d();
        }
        m();
        ca4.e0.a("landing_page_video_comp_loading_time", java.lang.String.valueOf(this.P), 0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new g54.b(this));
        if (this.K != 0) {
            this.L = (int) (this.L + (java.lang.System.currentTimeMillis() - this.K));
            this.K = 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
    }

    public boolean z(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new g54.a(this, i17, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seekTo", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        return false;
    }

    public ViewOnTouchListenerC17736xfc8efac(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f244539o = false;
        this.f244545u = 0;
        this.f244546v = 0.0f;
        this.f244547w = 0.0f;
        this.f244548x = 1.0f;
        this.K = 0L;
        this.L = 0;
        this.M = 0;
        this.R = context;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView */
/* loaded from: classes4.dex */
public class C17780x7da32526 extends android.widget.FrameLayout implements k84.p4, p012xc85e97e9.p093xedfae76a.x, xn5.a0 {
    public static final /* synthetic */ int F = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public final android.view.ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f244952d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f244953e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f244954f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f244955g;

    /* renamed from: h, reason: collision with root package name */
    public u74.d f244956h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f244957i;

    /* renamed from: m, reason: collision with root package name */
    public int f244958m;

    /* renamed from: n, reason: collision with root package name */
    public k84.f6 f244959n;

    /* renamed from: o, reason: collision with root package name */
    public int f244960o;

    /* renamed from: p, reason: collision with root package name */
    public int f244961p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f244962q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f244963r;

    /* renamed from: s, reason: collision with root package name */
    public final int f244964s;

    /* renamed from: t, reason: collision with root package name */
    public int f244965t;

    /* renamed from: u, reason: collision with root package name */
    public int f244966u;

    /* renamed from: v, reason: collision with root package name */
    public int f244967v;

    /* renamed from: w, reason: collision with root package name */
    public final ym5.w1 f244968w;

    /* renamed from: x, reason: collision with root package name */
    public int f244969x;

    /* renamed from: y, reason: collision with root package name */
    public int f244970y;

    /* renamed from: z, reason: collision with root package name */
    public int f244971z;

    public C17780x7da32526(android.content.Context context) {
        this(context, null);
    }

    public static /* synthetic */ k84.f6 b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 c17780x7da32526) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        k84.f6 f6Var = c17780x7da32526.f244959n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        return f6Var;
    }

    /* renamed from: setLeftMarginOff */
    private void m69544x36256358(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f244956h.T.f506664a == 0) {
            ((android.widget.RelativeLayout.LayoutParams) getLayoutParams()).leftMargin -= i17;
        } else {
            ((android.widget.FrameLayout.LayoutParams) getLayoutParams()).leftMargin -= i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLeftMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    /* renamed from: setTopMarginOff */
    private void m69545xbc31448e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f244956h.T.f506664a == 0) {
            ((android.widget.RelativeLayout.LayoutParams) getLayoutParams()).topMargin -= i17;
        } else {
            ((android.widget.FrameLayout.LayoutParams) getLayoutParams()).topMargin -= i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTopMarginOff", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @Override // k84.p4
    public void a() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        int i17 = this.f244958m;
        if (i17 == 1 || i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(1612, 76);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f244955g;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            z17 = false;
        } else {
            java.lang.String str = c17933xe8d1b226.m70354x74235b3e().f38211x1b3eca3e.f72817x2b832701;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            if (str.equals(this.f244963r) && this.f244962q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "checkPAGFileDownload, return true directly");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                z17 = true;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f244955g;
                if (c17933xe8d1b2262 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                } else {
                    java.lang.String str2 = c17933xe8d1b2262.m70354x74235b3e().f38211x1b3eca3e.f72817x2b832701;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String str3 = this.f244955g.m70354x74235b3e().f38211x1b3eca3e.f406918j;
                    java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.b(str2, str3 != null ? str3 : "");
                    this.f244963r = str2;
                    this.f244962q = false;
                    if (android.text.TextUtils.isEmpty(b17)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.a(str2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "initPagAnimViewData, start download pagFile");
                        g0Var.A(1612, 77);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                    } else {
                        if (this.f244952d.getUseRfx()) {
                            com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77392x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77392x243906(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.e(b17));
                            this.f244960o = m77392x243906.m77368x6be2dc6();
                            this.f244961p = m77392x243906.m77365xb7389127();
                            this.f244952d.mo82566x3e3ac3e8(m77392x243906);
                        } else {
                            org.p3363xbe4143f1.C29690xfae77312 m154717x243906 = org.p3363xbe4143f1.C29690xfae77312.m154717x243906(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.e(b17));
                            this.f244960o = m154717x243906.m154689x6be2dc6();
                            this.f244961p = m154717x243906.m154680xb7389127();
                            this.f244952d.mo82568x3e3ac3e8(m154717x243906);
                        }
                        this.f244952d.m82584xebcf33cb(3);
                        this.f244952d.m82583xcde73672(1);
                        this.f244962q = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "initPagAnimViewData, use server file");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                        z17 = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                    }
                }
                z17 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkPAGFileDownload", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            }
        }
        if (!z17 || this.f244960o <= 0 || this.f244961p <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdAttitudePlayView", "pag file width or height <= 0 or may be download pag file");
        } else {
            this.f244952d.m82582x3ae760af(0.0d);
            setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizePagViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizePagViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            this.f244958m = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "mPagFileWidth is " + this.f244960o + ", mPagFileHeight is " + this.f244961p);
            this.f244952d.post(new k84.h(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShowAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public void c() {
        u74.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            dVar = this.f244956h;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AdAttitudePlayView", th6, "calculate error", new java.lang.Object[0]);
        }
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        android.view.View view = dVar.f506696x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = dVar.H;
        android.view.View view2 = dVar.f506698z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18409xf85d1ccf c18409xf85d1ccf = dVar.A;
        if (view != null && c17781x303781f != null && view2 != null && c18409xf85d1ccf != null) {
            int width = view2.getWidth();
            int height = view2.getHeight();
            if (width > 0 && height > 0) {
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                this.A = iArr[1];
                this.B = height;
                android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
                this.f244969x = java.lang.Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
                int[] iArr2 = new int[2];
                c18409xf85d1ccf.getLocationOnScreen(iArr2);
                int i17 = iArr2[0];
                int i18 = i17 - this.f244965t;
                this.C = i18;
                int i19 = i17 + this.f244966u + width + this.f244967v;
                this.D = i19;
                if (dVar.T.f506670g) {
                    this.f244969x = i19 - i18;
                }
                int[] iArr3 = new int[2];
                c17781x303781f.getLocationOnScreen(iArr3);
                int[] iArr4 = new int[2];
                view.getLocationOnScreen(iArr4);
                this.f244971z = iArr4[1];
                int[] iArr5 = new int[2];
                getLocationOnScreen(iArr5);
                m69544x36256358(iArr5[0] - this.C);
                m69545xbc31448e(iArr5[1] - iArr4[1]);
                this.f244970y = (iArr3[1] + c17781x303781f.getHeight()) - iArr4[1];
                if (this.f244956h.T.f506664a == 0) {
                    android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
                    layoutParams.width = this.f244969x;
                    layoutParams.height = this.f244970y;
                } else {
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) getLayoutParams();
                    layoutParams2.width = this.f244969x;
                    layoutParams2.height = this.f244970y;
                }
                android.view.ViewParent parent = getParent();
                if (parent instanceof android.widget.FrameLayout) {
                    android.view.ViewParent parent2 = parent.getParent();
                    if (parent2 instanceof android.widget.RelativeLayout) {
                        ((android.widget.RelativeLayout) parent2).setClipChildren(false);
                        ((android.widget.RelativeLayout) parent2).setClipToPadding(false);
                    }
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) ((android.widget.FrameLayout) parent).getLayoutParams();
                    if (layoutParams3.width == 0) {
                        layoutParams3.width = -1;
                    }
                    if (layoutParams3.height == 0) {
                        layoutParams3.height = -1;
                    }
                }
                d();
                requestLayout();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPagPlayViewParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (this.f244969x <= 0 || this.f244970y <= 0 || this.B <= 0 || this.f244960o == 0 || this.f244961p == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "start play pagView, but can not calcPagViewDisplayParams, mWidth or mHeight or mContentContainerHeight <= 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f244952d.getLayoutParams();
        int i17 = this.f244969x;
        layoutParams.width = i17;
        layoutParams.height = (i17 * this.f244961p) / this.f244960o;
        this.f244952d.setLayoutParams(layoutParams);
        int i18 = ((this.A + (this.B / 2)) - (this.f244971z + (layoutParams.height / 2))) + this.f244964s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "offsetY is " + i18 + ", showAnimLayoutParams height is " + layoutParams.height + ", mSnsLinearContentRightX is " + this.D + ", mSnsLinearContentLeftX is " + this.C + ", mWidth is " + this.f244969x + ", inLargeWindow is " + this.f244956h.T.f506670g);
        this.f244952d.setTranslationY((float) i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPagViewDisplayParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public void e(u74.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        u74.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m70367x7525eefd)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAttitudePlayView", "resetUI, snsId is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(m70367x7525eefd, this.f244957i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        this.f244957i = m70367x7525eefd;
        this.f244955g = c17933xe8d1b226;
        this.f244956h = dVar;
        if (dVar != null && (cVar = dVar.T) != null) {
            int i17 = cVar.f506664a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            if (i17 == 0) {
                this.f244965t = i65.a.b(getContext(), 14);
                this.f244966u = i65.a.b(getContext(), 56);
                this.f244967v = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            } else {
                android.content.Context context = this.f244954f;
                this.f244965t = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
                this.f244966u = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aa7) + context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                this.f244967v = this.f244965t;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        }
        h();
        f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            if (!this.f244953e) {
                this.f244953e = true;
                this.f244952d.a(this.f244968w);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "startListenPagView");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            if (this.f244953e) {
                this.f244953e = false;
                this.f244952d.i(this.f244968w);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "stopListenPagView");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            this.f244958m = 3;
            setVisibility(8);
            this.f244952d.post(new k84.i(this));
            k84.f6 f6Var = this.f244959n;
            if (f6Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f) f6Var).s();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopPAGAnimating", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        super.onConfigurationChanged(configuration);
        int i17 = configuration.orientation;
        int i18 = this.f244958m;
        if (i18 == 1 || i18 == 2) {
            h();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        u74.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            super.onDetachedFromWindow();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "onDetachedFromWindow");
            dVar = this.f244956h;
        } catch (java.lang.Throwable unused) {
        }
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
            return;
        }
        if (dVar.T.f506664a == 0) {
            this.f244957i = "";
            g();
        }
        h();
        getViewTreeObserver().removeOnPreDrawListener(this.E);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            super.onFinishInflate();
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById(com.p314xaae8f345.mm.R.id.f567767ko1);
            this.f244952d = c22789xd23e9a9b;
            boolean z17 = true;
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20316xf7a4b984()) != 1) {
                z17 = false;
            }
            c22789xd23e9a9b.o(z17);
            java.lang.Object obj = this.f244954f;
            if (obj instanceof p012xc85e97e9.p093xedfae76a.y) {
                ((p012xc85e97e9.p093xedfae76a.y) obj).mo273xed6858b4().a(this);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onUIPause */
    public void m69546xfe061103() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "onUIPause");
            h();
            g();
            getViewTreeObserver().removeOnPreDrawListener(this.E);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onUIResume */
    public void m69547xc65d3ec0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdAttitudePlayView", "onUIResume");
            f();
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIResume", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    /* renamed from: setOnAnimationStatusListener */
    public void m69548xe81bec49(k84.f6 f6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnAnimationStatusListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
        k84.f6 f6Var2 = this.f244959n;
        if (f6Var2 != null && f6Var2 != f6Var) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f) f6Var2).s();
        }
        this.f244959n = f6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnAnimationStatusListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView");
    }

    public C17780x7da32526(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C17780x7da32526(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f244953e = false;
        this.f244958m = 0;
        this.f244968w = new k84.g(this);
        this.E = new k84.j(this);
        this.f244954f = context;
        this.f244964s = i65.a.b(getContext(), 13);
    }
}

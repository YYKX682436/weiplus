package g44;

/* loaded from: classes4.dex */
public final class k extends j44.j {
    public final ya2.n1 A;
    public final jz5.g B;
    public android.widget.LinearLayout C;
    public android.widget.FrameLayout D;
    public android.widget.LinearLayout E;
    public android.widget.LinearLayout F;
    public android.widget.LinearLayout G;

    public k(android.content.Context context, ya2.n1 n1Var) {
        super(context);
        this.A = n1Var;
        this.B = jz5.h.b(new g44.h(context));
    }

    @Override // j44.j
    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDeleteHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDeleteHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aj8;
    }

    @Override // j44.j
    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDownloadHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDownloadHalfScreenLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dff;
    }

    @Override // j44.j
    public java.lang.String k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        return "AdFinderDownloadAppHalfScreenHelper";
    }

    @Override // j44.j
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        ya2.n1 n1Var = this.A;
        if (n1Var != null) {
            ((xc2.s1) n1Var).f534827a.P6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void n(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFinderDownloadAppHalfScreenHelper", "openUrl but url is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
            return;
        }
        ya2.n1 n1Var = this.A;
        if (n1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            xc2.s1 s1Var = (xc2.s1) n1Var;
            xc2.y2.f534876a.J(s1Var.f534828b, s1Var.f534829c, str, s1Var.f534830d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openUrl", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void r(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBtnOrProgressBarVisible", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRoundProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 c22713x95c5cea1 = this.f379219d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRoundProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            if (c22713x95c5cea1 != null) {
                c22713x95c5cea1.setVisibility(4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMDownloadAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17789xd2f68352 c17789xd2f68352 = this.f379221f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMDownloadAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            if (c17789xd2f68352 != null) {
                c17789xd2f68352.setVisibility(0);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRoundProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 c22713x95c5cea12 = this.f379219d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRoundProgress", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            if (c22713x95c5cea12 != null) {
                c22713x95c5cea12.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMDownloadAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17789xd2f68352 c17789xd2f683522 = this.f379221f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMDownloadAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            if (c17789xd2f683522 != null) {
                c17789xd2f683522.setVisibility(4);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBtnOrProgressBarVisible", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void s(int i17, int i18) {
        java.lang.String str;
        ya2.n1 n1Var;
        int i19;
        int i27;
        int i28;
        int i29;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        if (f() == null) {
            k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFinderDownloadAppHalfScreenHelper", "showBottomSheet, adDownloadParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
            return;
        }
        m();
        android.view.View g17 = g();
        this.C = g17 != null ? (android.widget.LinearLayout) g17.findViewById(com.p314xaae8f345.mm.R.id.ofg) : null;
        android.view.View g18 = g();
        this.D = g18 != null ? (android.widget.FrameLayout) g18.findViewById(com.p314xaae8f345.mm.R.id.ck9) : null;
        android.view.View g19 = g();
        this.E = g19 != null ? (android.widget.LinearLayout) g19.findViewById(com.p314xaae8f345.mm.R.id.f564969au4) : null;
        android.view.View i37 = i();
        this.F = i37 != null ? (android.widget.LinearLayout) i37.findViewById(com.p314xaae8f345.mm.R.id.ck6) : null;
        android.view.View i38 = i();
        this.G = i38 != null ? (android.widget.LinearLayout) i38.findViewById(com.p314xaae8f345.mm.R.id.ahd) : null;
        ya2.n1 n1Var2 = this.A;
        int a17 = n1Var2 != null ? ((xc2.s1) n1Var2).a() : 0;
        if (a17 <= 0) {
            k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFinderDownloadAppHalfScreenHelper", "half screen height less than 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showDownloadHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizeUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        int g27 = com.p314xaae8f345.mm.ui.bl.g(h());
        k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFinderDownloadAppHalfScreenHelper", "halfScreenHeight is " + a17 + ", navigationBarHeight is " + g27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizeDownloadUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        int b17 = (a17 - i65.a.b(h(), g27 == 0 ? 398 : com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a)) - g27;
        int b18 = i65.a.b(h(), 199);
        int b19 = i65.a.b(h(), 24);
        float f17 = b19 / 0.5f;
        k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFinderDownloadAppHalfScreenHelper", "resizeDownloadUI, remainSpace is " + b17 + ", minTotalMargins is " + f17 + ", maxMargins is " + b18 + ", topMarginRadio1 is 0.21428572, topMarginRadio2 is 0.5, topMarginRadio3 is 0.2857143");
        android.widget.LinearLayout linearLayout = this.E;
        android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
        if (g27 == 0) {
            if (layoutParams3 == null) {
                str = "showDownloadHalfScreen";
            } else {
                str = "showDownloadHalfScreen";
                layoutParams3.bottomMargin = i65.a.b(h(), 48);
            }
            android.widget.LinearLayout linearLayout2 = this.E;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(layoutParams3);
            }
        } else {
            str = "showDownloadHalfScreen";
        }
        if (b17 < b18) {
            float f18 = b17;
            if (f18 > f17) {
                i29 = (int) (0.21428572f * f18);
                i28 = (int) (f18 * 0.5f);
                i27 = (int) (f18 * 0.2857143f);
            } else {
                i27 = b19;
                i28 = i27;
                i29 = 0;
            }
            k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFinderDownloadAppHalfScreenHelper", "resizeDownloadUI, topMargin1 is " + i29 + ", topMargin2 is " + i28 + ", topMargin3 is " + i27);
            android.widget.LinearLayout linearLayout3 = this.C;
            android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout3 != null ? linearLayout3.getLayoutParams() : null;
            android.widget.LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : null;
            android.widget.FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
                n1Var = n1Var2;
            } else {
                n1Var = n1Var2;
                layoutParams = null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams5 != null) {
                layoutParams5.topMargin = i29;
            }
            if (layoutParams6 != null) {
                layoutParams6.topMargin = i28;
            }
            if (layoutParams3 != null) {
                layoutParams3.topMargin = i27;
            }
            android.widget.LinearLayout linearLayout4 = this.C;
            if (linearLayout4 != null) {
                linearLayout4.setLayoutParams(layoutParams5);
            }
            android.widget.FrameLayout frameLayout2 = this.D;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams6);
            }
            android.widget.LinearLayout linearLayout5 = this.E;
            if (linearLayout5 != null) {
                linearLayout5.setLayoutParams(layoutParams3);
            }
        } else {
            n1Var = n1Var2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeDownloadUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizeDownloadDeleteUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        int b27 = (a17 - i65.a.b(h(), g27 == 0 ? 292 : 228)) - g27;
        int b28 = i65.a.b(h(), 305);
        int b29 = i65.a.b(h(), 24);
        float f19 = b29 / 0.84210527f;
        k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFinderDownloadAppHalfScreenHelper", "resizeDownloadDeleteUI, remainSpace is " + b27 + ", minTotalMargins is " + f19 + ", maxMargins is " + b28 + ", topMarginRadio4 is 0.15789473, topMarginRadio5 is 0.84210527");
        android.widget.LinearLayout linearLayout6 = this.G;
        android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout6 != null ? linearLayout6.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
        if (g27 == 0) {
            if (layoutParams8 != null) {
                layoutParams8.bottomMargin = i65.a.b(h(), 64);
            }
            android.widget.LinearLayout linearLayout7 = this.G;
            if (linearLayout7 != null) {
                linearLayout7.setLayoutParams(layoutParams8);
            }
        }
        if (b27 < b28) {
            float f27 = b27;
            if (f27 > f19) {
                b29 = (int) (f27 * 0.84210527f);
                i19 = (int) (0.15789473f * f27);
            } else {
                i19 = 0;
            }
            k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFinderDownloadAppHalfScreenHelper", "resizeDownloadDeleteUI, topMargin4 is " + i19 + ", topMargin5 is " + b29);
            android.widget.LinearLayout linearLayout8 = this.F;
            android.view.ViewGroup.LayoutParams layoutParams9 = linearLayout8 != null ? linearLayout8.getLayoutParams() : null;
            android.widget.LinearLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams9 : null;
            if (layoutParams10 != null) {
                layoutParams10.topMargin = i19;
            }
            if (layoutParams8 != null) {
                layoutParams8.topMargin = b29;
            }
            android.widget.LinearLayout linearLayout9 = this.F;
            if (linearLayout9 != null) {
                linearLayout9.setLayoutParams(layoutParams10);
            }
            android.widget.LinearLayout linearLayout10 = this.G;
            if (linearLayout10 != null) {
                linearLayout10.setLayoutParams(layoutParams8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeDownloadDeleteUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        q();
        u().addView(g());
        if (n1Var != null) {
            android.widget.ScrollView customContent = u();
            g44.i iVar = new g44.i(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customContent, "customContent");
            gx2.q Q6 = ((xc2.s1) n1Var).f534827a.Q6(customContent);
            if (Q6 != null) {
                Q6.m132474x77f391b9(iVar);
            }
        }
        if (n1Var != null) {
            ((xc2.s1) n1Var).b(new g44.j(this));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        this.f379238w = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        b(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    @Override // j44.j
    public void t(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
            return;
        }
        u().removeAllViews();
        u().addView(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDownloadHalfScreenView", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
    }

    public final android.widget.ScrollView u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        android.widget.ScrollView scrollView = (android.widget.ScrollView) ((jz5.n) this.B).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderDownloadAppHalfScreenHelper");
        return scrollView;
    }
}

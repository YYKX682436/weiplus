package k84;

/* loaded from: classes4.dex */
public class n4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f f386682d;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f) {
        this.f386682d = c17781x303781f;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        int i18;
        int width;
        int i19;
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386682d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$8");
        try {
            c17781x303781f.getViewTreeObserver().removeOnPreDrawListener(this);
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.D1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            int i28 = c17781x303781f.f244991v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            try {
                if (i28 == 0) {
                    try {
                        int width2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.c(c17781x303781f).getWidth();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        str3 = "onPreDraw";
                        android.widget.LinearLayout linearLayout = c17781x303781f.f244996y;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int width3 = width2 - linearLayout.getWidth();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        i17 = width3;
                        i18 = c17781x303781f.F;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str3 = "onPreDraw";
                        str2 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$8";
                        str = str3;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f), th.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                        return false;
                    }
                } else {
                    str3 = "onPreDraw";
                    int width4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.c(c17781x303781f).getWidth();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    android.widget.LinearLayout linearLayout2 = c17781x303781f.f244996y;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int width5 = width4 - linearLayout2.getWidth();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    i17 = width5;
                    i18 = c17781x303781f.G;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                }
                int i29 = i17 - i18;
                java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parentViewGroupWidth is ");
                sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.c(c17781x303781f).getWidth());
                sb6.append(", adSocialLeftViewWidth is ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                android.widget.LinearLayout linearLayout3 = c17781x303781f.f244996y;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb6.append(linearLayout3.getWidth());
                sb6.append(", remainSpaceWidth is ");
                sb6.append(i29);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a17, sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                android.widget.FrameLayout frameLayout = c17781x303781f.f244981n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int width6 = frameLayout.getWidth();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                android.widget.ImageView imageView = c17781x303781f.f244983p;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int width7 = width6 + imageView.getWidth();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i37 = c17781x303781f.A;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i38 = width7 + i37;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i39 = c17781x303781f.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i47 = i38 + i39 + 1;
                android.view.View findViewById = c17781x303781f.findViewById(com.p314xaae8f345.mm.R.id.q4a);
                if (findViewById != null && findViewById.getWidth() > 0) {
                    i47 = java.lang.Math.max(i47, findViewById.getWidth());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f), "contentWidth = " + i47 + "  continuousContent width = " + findViewById.getWidth());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = c17781x303781f.f244990u;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (c17933xe8d1b226 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = c17781x303781f.f244990u;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (c17933xe8d1b2262.m70394x2cf577f()) {
                        int a18 = a84.d0.a(32);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        android.widget.ImageView imageView2 = c17781x303781f.f244983p;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int width8 = a18 + imageView2.getWidth();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i48 = c17781x303781f.A;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i49 = width8 + i48;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i57 = c17781x303781f.B;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        i47 = i49 + i57 + 1;
                    }
                }
                java.lang.String a19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("cheerTextMax is ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i58 = c17781x303781f.A;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb7.append(i58);
                sb7.append(", commentTextMax is ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i59 = c17781x303781f.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb7.append(i59);
                sb7.append(", contentWidth is ");
                sb7.append(i47);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a19, sb7.toString());
                int i66 = i29 - i47;
                java.lang.String a27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("marginWidth is ");
                sb8.append(i66);
                sb8.append(", maxMarginWidth is ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i67 = c17781x303781f.f244972J;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb8.append(i67);
                sb8.append(", minMarginWidth is ");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i68 = c17781x303781f.L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                sb8.append(i68);
                sb8.append(", mPreviousLineStatus is ");
                sb8.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.d(c17781x303781f));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a27, sb8.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                int i69 = c17781x303781f.L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (i66 >= i69) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i76 = c17781x303781f.f244972J;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (i66 < i76) {
                        float f18 = i66;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i77 = c17781x303781f.f244972J;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        f17 = f18 / i77;
                    } else {
                        f17 = 1.0f;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i78 = c17781x303781f.C;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2500", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i79 = (int) (i78 * f17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i86 = c17781x303781f.D;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i87 = (int) (i86 * f17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.e(c17781x303781f, i79, i87);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.f(c17781x303781f, false, 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.a(c17781x303781f), "marginOuter is " + i79 + ", marginInner is " + i87 + ", rate is " + f17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i88 = c17781x303781f.f244991v;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (i88 == 0) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.d(c17781x303781f) != 2 && com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.d(c17781x303781f) != 0) {
                            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c17781x303781f.getLayoutParams();
                            layoutParams.gravity = 8388629;
                            c17781x303781f.setLayoutParams(layoutParams);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            c17781x303781f.f244974e = 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2902", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        c17781x303781f.f244979l1 = true;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2902", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.g(c17781x303781f);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2902", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        c17781x303781f.f244979l1 = false;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2902", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.c(c17781x303781f);
                        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 8388629;
                        frameLayout2.addView(c17781x303781f, layoutParams2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        c17781x303781f.f244974e = 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.h(c17781x303781f, false);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i89 = c17781x303781f.f244991v;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (i89 == 0) {
                        width = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.i(c17781x303781f).getWidth();
                        int i96 = 0;
                        while (true) {
                            if (i96 >= com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.i(c17781x303781f).getChildCount()) {
                                i96 = 0;
                                break;
                            }
                            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.i(c17781x303781f).getChildAt(i96).getId() == com.p314xaae8f345.mm.R.id.afc) {
                                break;
                            }
                            i96++;
                        }
                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.d(c17781x303781f) != 1 && com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.d(c17781x303781f) != 0) {
                            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) c17781x303781f.getLayoutParams();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            int i97 = c17781x303781f.M;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            layoutParams3.topMargin = i97 / 2;
                            c17781x303781f.setLayoutParams(layoutParams3);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            c17781x303781f.f244974e = 2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            i19 = 1;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.g(c17781x303781f);
                        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        int i98 = c17781x303781f.M;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3300", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        layoutParams4.topMargin = i98 / 2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.i(c17781x303781f).addView(c17781x303781f, i96 + 1, layoutParams4);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        c17781x303781f.f244974e = 2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2402", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        i19 = 1;
                    } else {
                        width = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.c(c17781x303781f).getWidth();
                        i19 = 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.h(c17781x303781f, true);
                    }
                    int i99 = (width - i19) / 2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i100 = c17781x303781f.E;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    int i101 = c17781x303781f.D;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.e(c17781x303781f, i100, i101);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.f(c17781x303781f, true, i99);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3502", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                c17781x303781f.P = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3502", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                c17781x303781f.requestLayout();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3602", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                c17781x303781f.Q = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3602", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$8");
                return true;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            str = "onPreDraw";
            str2 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$8";
        }
    }
}

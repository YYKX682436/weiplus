package q74;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q74.t0 f442078a = new q74.t0();

    public static final void a(android.view.View view, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewGroup viewGroup3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        if (viewGroup2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCardLogicHelper", "adjustContentContainerLayout, adDisplayWidth <= 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        if (i18 == 0) {
            a84.y0.m(viewGroup3, false);
        }
        a84.y0.m(viewGroup, false);
        a84.y0.m(viewGroup2, false);
        layoutParams.width = i17;
        view.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        view.setTranslationX(-b17);
        view.requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
    }

    public static final void b(q74.y0 y0Var, int i17, int i18) {
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustInnerItemLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (i17 <= 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCardLogicHelper", "adjustInnerItemLayout, materialWidth is " + i17 + ", materialHeight is " + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustInnerItemLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = (y0Var == null || (frameLayout = y0Var.f442105e) == null) ? null : frameLayout.getLayoutParams();
        if (layoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustInnerItemLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        layoutParams.width = i17;
        layoutParams.height = i18;
        y0Var.f442105e.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustInnerItemLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
    }

    public static final int c(android.content.Context context, int i17, boolean z17) {
        int d17;
        int i18;
        int d18;
        android.view.Display defaultDisplay;
        android.view.Display defaultDisplay2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return 0;
        }
        if (z17) {
            d18 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aav);
        } else {
            java.lang.Object systemService = context.getSystemService("window");
            android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            int min = java.lang.Math.min((windowManager == null || (defaultDisplay2 = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay2.getWidth(), (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay.getHeight());
            q74.t0 t0Var = f442078a;
            int d19 = t0Var.d(56);
            if (i17 == 0) {
                d17 = t0Var.d(14);
                i18 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            } else {
                d17 = t0Var.d(12);
                i18 = d17;
            }
            d18 = (((min - d19) - d17) - i18) + t0Var.d(16);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardLogicHelper", "getAdDisplayWidth, remainSpace is " + d18 + " and inLargeWindow is " + z17);
        if (d18 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return d18;
    }

    public static final int e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSlideFullCardBreakFrameRightOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        int d17 = f442078a.d(12);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSlideFullCardBreakFrameRightOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return d17;
    }

    public static final boolean f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        boolean z17 = false;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return false;
        }
        if (c17933xe8d1b226.m70377x3172ed() && c17933xe8d1b226.m70411x94a088c9()) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSlideFullCardAd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return z17;
    }

    public static final void g(android.widget.ImageView imageView, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        if (imageView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardLogicHelper", "setBorderImage, the resInfo is img, thumbUrl is " + str);
        if (!(str == null || str.length() == 0)) {
            a84.y0.p(imageView, true);
            java.lang.String l17 = za4.t0.l("adId", str);
            imageView.setTag(com.p314xaae8f345.mm.R.id.nae, str);
            if (com.p314xaae8f345.mm.vfs.w6.j(l17)) {
                n74.a2.c(imageView, l17, 0);
            } else {
                n74.a2.a(imageView, str, 0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBorderImage", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
    }

    public final int d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardLogicHelper");
        return b17;
    }
}

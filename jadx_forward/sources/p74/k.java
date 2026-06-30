package p74;

/* loaded from: classes4.dex */
public abstract class k {
    public static final void a(android.view.View view, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, android.view.ViewGroup viewGroup3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        if (viewGroup2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdSlideCardLogicHelper", "adjustContentContainerLayout, adDisplayWidth <= 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return;
        }
        if (i18 == 0) {
            a84.y0.m(viewGroup3, false);
        }
        a84.y0.m(viewGroup, false);
        a84.y0.m(viewGroup2, false);
        layoutParams.width = i17;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
    }

    public static final int b(android.content.Context context, int i17, boolean z17) {
        int b17;
        int i18;
        int i19;
        android.view.Display defaultDisplay;
        android.view.Display defaultDisplay2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return 0;
        }
        if (z17) {
            i19 = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.aav);
        } else {
            java.lang.Object systemService = context.getSystemService("window");
            android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
            int min = java.lang.Math.min((windowManager == null || (defaultDisplay2 = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay2.getWidth(), (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay.getHeight());
            int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 56);
            if (i17 == 0) {
                b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14);
                i18 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            } else {
                b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
                i18 = b17;
            }
            i19 = ((min - b18) - b17) - i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideCardLogicHelper", "getAdDisplayWidth, source is " + i17 + ", remainSpace is " + i19 + " and inLargeWindow is " + z17);
        if (i19 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        return i19;
    }

    public static final p74.j c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardSizeInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        p74.j jVar = i17 != 1 ? i17 != 2 ? new p74.j(234.0f, 132.0f, 28.0f, 24.0f) : new p74.j(127.0f, 225.0f, 28.0f, 24.0f) : new p74.j(234.0f, 132.0f, 28.0f, 24.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardSizeInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        return jVar;
    }

    public static final int d(s34.x0 x0Var) {
        r45.jj4 jj4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardSpecType", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        if (x0Var == null || (jj4Var = x0Var.f484361e) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardSpecType", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
            return 1;
        }
        r45.lj4 lj4Var = jj4Var.f459398p;
        int i17 = (lj4Var != null ? (int) lj4Var.f461053d : 0) <= (lj4Var != null ? (int) lj4Var.f461054e : 0) ? 2 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardSpecType", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper");
        return i17;
    }
}

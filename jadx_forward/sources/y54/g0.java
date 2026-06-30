package y54;

/* loaded from: classes4.dex */
public final class g0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 f541074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190 f541075e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190 activityC17750xfe564190) {
        this.f541074d = c17742x250976b0;
        this.f541075e = activityC17750xfe564190;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 c17742x250976b0 = this.f541074d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$requestLayoutSpaceHeightIfNeed$1");
        try {
            android.view.ViewTreeObserver viewTreeObserver = c17742x250976b0.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfScreenVangogh", "remove an OnGlobalLayoutListener exception, message is " + e17.getMessage() + ' ');
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190 activityC17750xfe564190 = this.f541075e;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(activityC17750xfe564190);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfScreenVangogh", "OnGlobalLayoutListener:: the new naviHeight is " + c17);
        y54.y U6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190.U6(activityC17750xfe564190);
        U6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        int i17 = U6.f541106d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        if (i17 != c17) {
            y54.y U62 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190.U6(activityC17750xfe564190);
            U62.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            U62.f541106d = c17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNavigationBarVisibleChanged$default", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            activityC17750xfe564190.Z6(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNavigationBarVisibleChanged$default", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        }
        y54.y U63 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17750xfe564190.U6(activityC17750xfe564190);
        U63.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVisibleContentHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        int i18 = U63.f541107e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibleContentHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$ContentSizeAttr");
        c17742x250976b0.l(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setContentHasShown$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        activityC17750xfe564190.f244717h = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setContentHasShown$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$requestLayoutSpaceHeightIfNeed$1");
    }
}

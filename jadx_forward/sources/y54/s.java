package y54;

/* loaded from: classes15.dex */
public final class s implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f541092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 f541093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f541094c;

    public s(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725, android.view.View view) {
        this.f541092a = viewGroup;
        this.f541093b = activityC17748xd9e17725;
        this.f541094c = view;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541093b;
        android.view.View b76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.b7(activityC17748xd9e17725);
        if (b76 != null) {
            b76.setBackgroundColor(e3.b.c(activityC17748xd9e17725.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3), activityC17748xd9e17725.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), f17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
    }

    @Override // vb4.c
    /* renamed from: onAnimationEnd */
    public void mo69472xbb3aa236() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541093b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.e7(activityC17748xd9e17725, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenPageUI", "sns exit anim end");
        activityC17748xd9e17725.finish();
        activityC17748xd9e17725.overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
    }

    @Override // vb4.c
    /* renamed from: onAnimationStart */
    public void mo69473xd7e2f2fd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
        this.f541092a.setAlpha(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541093b;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.a7(activityC17748xd9e17725).g() == n44.h1.f416478e) {
            android.widget.FrameLayout c76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.c7(activityC17748xd9e17725);
            if (c76 != null) {
                c76.setAlpha(0.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getViewPagerContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            android.widget.FrameLayout frameLayout = activityC17748xd9e17725.f244695g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getViewPagerContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            if (frameLayout != null) {
                frameLayout.setAlpha(0.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getViewPager$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = activityC17748xd9e17725.f244696h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getViewPager$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            if (c21520x5bb48e5e != null) {
                c21520x5bb48e5e.setAlpha(0.0f);
            }
        }
        android.view.View view = this.f541094c;
        a84.y0.i(view);
        a84.y0.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.W6(activityC17748xd9e17725), view, 0);
        android.widget.FrameLayout W6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.W6(activityC17748xd9e17725);
        if (W6 != null) {
            W6.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 Z6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.Z6(activityC17748xd9e17725);
        if (Z6 != null) {
            Z6.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.e7(activityC17748xd9e17725, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenPageUI", "sns exit anim start");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExitAnimation$1");
    }
}

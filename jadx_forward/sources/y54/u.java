package y54;

/* loaded from: classes15.dex */
public final class u implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 f541097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f541098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f541099c;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        this.f541097a = activityC17748xd9e17725;
        this.f541098b = frameLayout;
        this.f541099c = frameLayout2;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541097a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 Z6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.Z6(activityC17748xd9e17725);
        if (Z6 != null) {
            Z6.setAlpha(f17);
        }
        n44.m0 V6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.V6(activityC17748xd9e17725);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doMultipleMaterialExpandAnimation$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        V6.c(f17, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMultipleMaterialExpandAnimation$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
    }

    @Override // vb4.c
    /* renamed from: onAnimationEnd */
    public void mo69472xbb3aa236() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.S;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setAlreadyExpend$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541097a;
        activityC17748xd9e17725.C = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setAlreadyExpend$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout = this.f541098b;
        frameLayout.setAlpha(1.0f);
        a84.y0.i(frameLayout);
        android.widget.FrameLayout W6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.W6(activityC17748xd9e17725);
        if (W6 != null) {
            W6.setVisibility(8);
        }
        n44.h1 g17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.a7(activityC17748xd9e17725).g();
        n44.h1 h1Var = n44.h1.f416478e;
        android.widget.FrameLayout frameLayout2 = this.f541099c;
        if (g17 == h1Var) {
            a84.y0.b(frameLayout2, frameLayout, 1);
        } else {
            a84.y0.b(frameLayout2, frameLayout, 0);
        }
        n44.m0 V6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.V6(activityC17748xd9e17725);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17748xd9e17725.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        android.graphics.drawable.Drawable d17 = V6.d(mo55332x76847179, true);
        if (d17 != null) {
            activityC17748xd9e17725.m78609x92231eec(d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.e7(activityC17748xd9e17725, false);
        if (activityC17748xd9e17725.getF147381t() && (m78735x28280f95 = activityC17748xd9e17725.m78735x28280f95()) != null) {
            m78735x28280f95.m81450x8e764904(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenPageUI", "sns shrink anim end");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
    }

    @Override // vb4.c
    /* renamed from: onAnimationStart */
    public void mo69473xd7e2f2fd() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541097a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.e7(activityC17748xd9e17725, true);
        if (activityC17748xd9e17725.getF147381t() && (m78735x28280f95 = activityC17748xd9e17725.m78735x28280f95()) != null) {
            m78735x28280f95.m81450x8e764904(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenPageUI", "sns shrink anim start");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayExpandOrShrinkAnimation$2");
    }
}

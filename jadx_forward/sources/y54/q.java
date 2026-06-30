package y54;

/* loaded from: classes15.dex */
public final class q implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f541087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 f541088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f541089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y54.c f541090d;

    public q(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725, android.view.View view, y54.c cVar) {
        this.f541087a = viewGroup;
        this.f541088b = activityC17748xd9e17725;
        this.f541089c = view;
        this.f541090d = cVar;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541088b;
        android.view.View b76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.b7(activityC17748xd9e17725);
        if (b76 != null) {
            b76.setBackgroundColor(e3.b.c(activityC17748xd9e17725.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), activityC17748xd9e17725.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3), 1.0f - f17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
    }

    @Override // vb4.c
    /* renamed from: onAnimationEnd */
    public void mo69472xbb3aa236() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
        android.view.View view = this.f541089c;
        a84.y0.i(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541088b;
        android.widget.FrameLayout W6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.W6(activityC17748xd9e17725);
        if (W6 != null) {
            W6.setVisibility(8);
        }
        android.view.ViewGroup viewGroup = this.f541087a;
        a84.y0.b(viewGroup, view, 0);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            y54.c cVar = this.f541090d;
            marginLayoutParams.width = cVar.d();
            marginLayoutParams.height = cVar.a();
            marginLayoutParams.topMargin = cVar.c();
            marginLayoutParams.leftMargin = cVar.b();
            marginLayoutParams.bottomMargin = (viewGroup.getHeight() - cVar.a()) - cVar.c();
            marginLayoutParams.rightMargin = (viewGroup.getWidth() - cVar.d()) - cVar.b();
        }
        viewGroup.setAlpha(1.0f);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.a7(activityC17748xd9e17725).g() == n44.h1.f416478e) {
            android.widget.FrameLayout c76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.c7(activityC17748xd9e17725);
            if (c76 != null) {
                c76.setAlpha(1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getViewPagerContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            android.widget.FrameLayout frameLayout = activityC17748xd9e17725.f244695g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getViewPagerContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getViewPager$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = activityC17748xd9e17725.f244696h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getViewPager$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            if (c21520x5bb48e5e != null) {
                c21520x5bb48e5e.setAlpha(1.0f);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getHalfScreenContainerHeader$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout2 = activityC17748xd9e17725.f244699n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getHalfScreenContainerHeader$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        android.view.View b76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.b7(activityC17748xd9e17725);
        if (b76 != null) {
            b76.setBackgroundColor(activityC17748xd9e17725.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.e7(activityC17748xd9e17725, false);
        n44.m0 V6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.V6(activityC17748xd9e17725);
        V6.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPlay", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        i64.z zVar = V6.f416516a;
        n44.h1 g17 = zVar != null ? zVar.g() : null;
        n44.h1 h1Var = n44.h1.f416479f;
        if (g17 == h1Var) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMute", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
            i64.z zVar2 = V6.f416516a;
            if ((zVar2 != null ? zVar2.g() : null) == h1Var) {
                n44.u0 h17 = V6.h();
                h17.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMute", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.ViewOnTouchListenerC17736xfc8efac viewOnTouchListenerC17736xfc8efac = h17.f416594d;
                if (viewOnTouchListenerC17736xfc8efac != null) {
                    viewOnTouchListenerC17736xfc8efac.m69408x764d819b(false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMute", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMute", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
            if (!V6.f416531p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenPageHelper", "initPlay");
                V6.p();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPlay", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenPageUI", "sns enter anim end");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
    }

    @Override // vb4.c
    /* renamed from: onAnimationStart */
    public void mo69473xd7e2f2fd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
        this.f541087a.setAlpha(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725 activityC17748xd9e17725 = this.f541088b;
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
        android.widget.FrameLayout W6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.W6(activityC17748xd9e17725);
        if (W6 != null) {
            W6.setVisibility(0);
        }
        android.view.View view = this.f541089c;
        a84.y0.i(view);
        a84.y0.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.W6(activityC17748xd9e17725), view, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getHalfScreenContainerHeader$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        android.widget.FrameLayout frameLayout2 = activityC17748xd9e17725.f244699n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getHalfScreenContainerHeader$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        android.view.View b76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.b7(activityC17748xd9e17725);
        if (b76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b76, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/ui/activity/AdHalfScreenPageUI$tryPlayEnterAnimation$1", "onAnimationStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            b76.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(b76, "com/tencent/mm/plugin/sns/ad/landingpage/ui/activity/AdHalfScreenPageUI$tryPlayEnterAnimation$1", "onAnimationStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View b77 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.b7(activityC17748xd9e17725);
        if (b77 != null) {
            b77.setBackgroundColor(activityC17748xd9e17725.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.e7(activityC17748xd9e17725, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenPageUI", "sns enter anim start");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$tryPlayEnterAnimation$1");
    }
}

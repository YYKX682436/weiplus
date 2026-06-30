package n44;

/* loaded from: classes8.dex */
public abstract class f1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f416463d;

    /* renamed from: e, reason: collision with root package name */
    public final i64.z f416464e;

    /* renamed from: f, reason: collision with root package name */
    public y54.c f416465f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f416466g = jz5.h.b(new n44.d1(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f416467h = jz5.h.b(new n44.c1(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f416468i = jz5.h.b(new n44.e1(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f416469m = jz5.h.b(new n44.z0(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f416470n = jz5.h.b(new n44.b1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f416471o = jz5.h.b(new n44.y0(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f416472p = jz5.h.b(new n44.a1(this));

    public f1(android.view.View view, i64.z zVar) {
        this.f416463d = view;
        this.f416464e = zVar;
    }

    public void a(y54.b contentSizeAttr, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentSizeAttr, "contentSizeAttr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        i64.z zVar = this.f416464e;
        if (zVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 d17 = d();
        if (d17 != null) {
            d17.m69461x9b36211f(zVar.a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 d18 = d();
        if (d18 != null) {
            d18.m69469x5755d9d7(contentSizeAttr.f());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 d19 = d();
        android.view.ViewGroup.LayoutParams layoutParams = d19 != null ? d19.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = contentSizeAttr.g() - contentSizeAttr.b();
            marginLayoutParams.height = contentSizeAttr.a(zVar.a());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f17 = f();
        android.view.ViewGroup.LayoutParams layoutParams2 = f17 != null ? f17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.height = contentSizeAttr.a(zVar.a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 d27 = d();
        if (d27 != null) {
            d27.m69447xf7608943(contentSizeAttr.c());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("screenWidth is ");
        sb6.append(contentSizeAttr.e());
        sb6.append(", screenHeight is ");
        sb6.append(contentSizeAttr.d());
        sb6.append(", statusBarHeight is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i17 = contentSizeAttr.f541055c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        sb6.append(i17);
        sb6.append(", actionBarHeight is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i18 = contentSizeAttr.f541056d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        sb6.append(i18);
        sb6.append(", statusBarAndActionBarHeight is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        int i19 = contentSizeAttr.f541057e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusBarAndActionBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ContentSizeAttr");
        sb6.append(i19);
        sb6.append(", spaceHolderHeight is ");
        sb6.append(contentSizeAttr.f());
        sb6.append(", halfScreenHeaderHeight is ");
        sb6.append(contentSizeAttr.b());
        sb6.append(", topContainerHeight is ");
        sb6.append(contentSizeAttr.g());
        sb6.append(", initVisibleHalfScreenHeight is ");
        sb6.append(contentSizeAttr.c());
        sb6.append(", contentViewHeight is ");
        sb6.append(contentSizeAttr.a(zVar.a()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("IAdHalfScreenConfigUI", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("configHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
    }

    public abstract void b(android.content.Intent intent);

    public final android.widget.FrameLayout c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenBottomContainerContent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f416471o).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenBottomContainerContent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return frameLayout;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971 c17741x52670971 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971) ((jz5.n) this.f416469m).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return c17741x52670971;
    }

    public final android.widget.FrameLayout e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenContentContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f416472p).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenContentContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return frameLayout;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) ((jz5.n) this.f416470n).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenRoundCornerContainer", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return c22646x1e9ca55;
    }

    public final i64.z g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return this.f416464e;
    }

    public final android.view.View h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRootView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRootView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.IAdHalfScreenConfigUI");
        return this.f416463d;
    }

    public abstract int i(y54.b bVar);
}

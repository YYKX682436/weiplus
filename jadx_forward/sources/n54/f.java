package n54;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f416661a;

    /* renamed from: b */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17740x1155a6bf f416662b;

    /* renamed from: c */
    public final android.view.View f416663c;

    /* renamed from: d */
    public final android.view.View f416664d;

    /* renamed from: e */
    public final int f416665e;

    /* renamed from: f */
    public final boolean f416666f;

    /* renamed from: g */
    public n54.e f416667g;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773) {
        this.f416666f = false;
        n54.b bVar = new n54.b(this);
        this.f416661a = activityC18007x6d5e9773;
        this.f416666f = activityC18007x6d5e9773.A7().u();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17740x1155a6bf c17740x1155a6bf = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17740x1155a6bf) activityC18007x6d5e9773.findViewById(com.p314xaae8f345.mm.R.id.gw6);
        this.f416662b = c17740x1155a6bf;
        c17740x1155a6bf.setBackgroundColor(-16777216);
        boolean z17 = true;
        c17740x1155a6bf.m69442x87247467(true);
        float b17 = i65.a.b(activityC18007x6d5e9773.getApplicationContext(), 12);
        c17740x1155a6bf.b(b17, b17, 0.0f, 0.0f);
        c17740x1155a6bf.m69441x1a815855(bVar);
        android.graphics.Point b18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b18.x;
        int i18 = b18.y;
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
            z17 = false;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            i18 = i18 >= i17 ? i18 : i17;
        }
        int c17 = com.p314xaae8f345.mm.ui.bl.c(activityC18007x6d5e9773);
        boolean u17 = com.p314xaae8f345.mm.ui.bk.u(activityC18007x6d5e9773, false);
        int p17 = u17 ? com.p314xaae8f345.mm.ui.bk.p(activityC18007x6d5e9773) : 0;
        int ceil = ((int) java.lang.Math.ceil(i18 * 0.75f)) + c17;
        ab4.n0 A7 = activityC18007x6d5e9773.A7();
        A7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        int i19 = A7.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        ceil = i19 > 0 ? i19 : ceil;
        boolean r17 = activityC18007x6d5e9773.A7().r();
        c(!r17);
        int i27 = (i18 - ceil) - p17;
        this.f416665e = i27;
        if (r17) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) c17740x1155a6bf.getLayoutParams();
            marginLayoutParams.topMargin += i27;
            c17740x1155a6bf.setLayoutParams(marginLayoutParams);
            this.f416665e = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1898, 10);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenLandingPageHelper", "screenH=" + i18 + ", navH=" + c17 + ", hasCutOut=" + u17 + ", cutOutH=" + p17 + ", contentH=" + ceil);
        com.p314xaae8f345.mm.ui.bk.u(activityC18007x6d5e9773, false);
        int i28 = this.f416665e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStayPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        c17740x1155a6bf.f244579g = i28;
        c17740x1155a6bf.f244580h = 0;
        c17740x1155a6bf.j(i28);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStayPosition", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        android.view.View findViewById = activityC18007x6d5e9773.findViewById(com.p314xaae8f345.mm.R.id.ght);
        this.f416663c = findViewById;
        findViewById.setOnClickListener(new n54.a(this));
        this.f416664d = activityC18007x6d5e9773.findViewById(com.p314xaae8f345.mm.R.id.gwf);
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 a(n54.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = fVar.f416661a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        return activityC18007x6d5e9773;
    }

    public static void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFullScreenForHalfMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        abstractActivityC21394xb3d2c0cf.getWindow().getDecorView().setSystemUiVisibility(1280);
        abstractActivityC21394xb3d2c0cf.getWindow().setStatusBarColor(0);
        abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().W0(abstractActivityC21394xb3d2c0cf, 0);
        abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().O0(true);
        abstractActivityC21394xb3d2c0cf.mo78514x143f1b92().E0(-16777216);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFullScreenForHalfMode", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
    }

    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17740x1155a6bf c17740x1155a6bf = this.f416662b;
        if (c17740x1155a6bf == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            return false;
        }
        c17740x1155a6bf.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        boolean z17 = c17740x1155a6bf.f244585p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdLandingPageHalfScreenContainer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStayTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        return z17;
    }

    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnableSlideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenLandingPageHelper", "setEnableSlideToTop, enable=" + z17);
        this.f416662b.m69440x7e2d540e(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnableSlideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
    }
}

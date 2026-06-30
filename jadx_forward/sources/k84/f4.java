package k84;

/* loaded from: classes4.dex */
public abstract class f4 {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, u74.d dVar) {
        android.view.ViewStub viewStub;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAttractAnimationView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if ((d(c17933xe8d1b226) || c17933xe8d1b226.m70394x2cf577f()) && !c17933xe8d1b226.m70476xc7eb81b5()) {
            if (dVar.M == null && (viewStub = dVar.L) != null) {
                dVar.M = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9) viewStub.inflate();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 c17779xdb9e82f9 = dVar.M;
            if (c17779xdb9e82f9 != null) {
                dVar.H.m69551x2dbabc32(c17779xdb9e82f9);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 c17779xdb9e82f92 = dVar.M;
                c17779xdb9e82f92.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m70367x7525eefd)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdAttitudeAttractView", "resetUI, snsId is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(m70367x7525eefd, c17779xdb9e82f92.f244937i)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                } else {
                    c17779xdb9e82f92.f244937i = m70367x7525eefd;
                    c17779xdb9e82f92.f244932d = c17933xe8d1b226;
                    c17779xdb9e82f92.f244933e = dVar;
                    u74.c cVar = dVar.T;
                    if (cVar != null) {
                        int i17 = cVar.f506664a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                        if (i17 == 0) {
                            c17779xdb9e82f92.f244949x = i65.a.b(c17779xdb9e82f92.getContext(), 14);
                            c17779xdb9e82f92.f244950y = i65.a.b(c17779xdb9e82f92.getContext(), 56);
                            c17779xdb9e82f92.f244951z = c17779xdb9e82f92.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
                        } else {
                            android.content.Context context = c17779xdb9e82f92.f244934f;
                            c17779xdb9e82f92.f244949x = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
                            c17779xdb9e82f92.f244950y = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aa7) + context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                            c17779xdb9e82f92.f244951z = c17779xdb9e82f92.f244949x;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    }
                    c17779xdb9e82f92.f244936h = false;
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) c17779xdb9e82f92.E).k(java.lang.Boolean.FALSE);
                    c17779xdb9e82f92.D = false;
                    c17779xdb9e82f92.f244938m = null;
                    c17779xdb9e82f92.j();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 c17779xdb9e82f93 = dVar.M;
            if (c17779xdb9e82f93 != null) {
                c17779xdb9e82f93.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAttractAnimationView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    public static void b(u74.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkShowAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        try {
            if (!g(c17933xe8d1b226) || c17933xe8d1b226.m70476xc7eb81b5()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 c17779xdb9e82f9 = dVar.M;
                if (c17779xdb9e82f9 != null) {
                    c17779xdb9e82f9.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = dVar.H;
                if (c17781x303781f != null) {
                    c17781x303781f.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 c17780x7da32526 = dVar.O;
                if (c17780x7da32526 != null) {
                    c17780x7da32526.setVisibility(8);
                }
                if (c17933xe8d1b226 != null && !c17933xe8d1b226.m70476xc7eb81b5()) {
                    f(0, dVar);
                }
            } else {
                boolean k17 = mb4.r.k(c17933xe8d1b226);
                if (dVar.O == null) {
                    dVar.O = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526) dVar.N.inflate();
                }
                if (!dVar.E && !k17) {
                    dVar.G = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f) dVar.F.inflate();
                    dVar.E = true;
                }
                if (!dVar.I && k17) {
                    dVar.K = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f) dVar.f506672J.inflate();
                    dVar.I = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f2 = dVar.G;
                if (c17781x303781f2 != null) {
                    c17781x303781f2.m69553xad2d381c(null);
                }
                if (k17) {
                    dVar.H = dVar.K;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f3 = dVar.G;
                    if (c17781x303781f3 != null) {
                        c17781x303781f3.setVisibility(8);
                    }
                } else {
                    dVar.H = dVar.G;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f4 = dVar.K;
                    if (c17781x303781f4 != null) {
                        c17781x303781f4.setVisibility(8);
                    }
                }
                dVar.H.m69553xad2d381c(dVar.O);
                dVar.O.m69548xe81bec49(dVar.H);
                a(c17933xe8d1b226, dVar);
                f(8, dVar);
                dVar.H.setTag(yVar);
                dVar.H.m69552xa5e969be(iVar);
                dVar.H.setVisibility(0);
                dVar.H.n(c17933xe8d1b226, dVar.T.f506664a, dVar.B, dVar.C, dVar.D);
                dVar.O.e(dVar, c17933xe8d1b226);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdSocialAttitudeHelper", "checkShowAdAttitude exp: " + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkShowAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    public static void c(int i17, u74.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        try {
            if (!g(c17933xe8d1b226)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 c17779xdb9e82f9 = dVar.M;
                if (c17779xdb9e82f9 != null) {
                    c17779xdb9e82f9.setVisibility(8);
                }
            } else if (h(c17933xe8d1b226, i17, dVar)) {
                if (dVar.T.f506670g) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = dVar.H;
                    if (c17781x303781f != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        boolean z17 = c17781x303781f.f244985p1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        if (!z17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f2 = dVar.H;
                            c17781x303781f2.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            c17781x303781f2.u(true);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSocialAttitudeHelper", "checkStartPlayAttractAnimation, but isMagicWindowUseAd, only start play icon attract animation");
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 c17779xdb9e82f92 = dVar.M;
                if (c17779xdb9e82f92 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    boolean z18 = c17779xdb9e82f92.f244936h;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    if (!z18) {
                        dVar.M.h(c17933xe8d1b226);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdSocialAttitudeHelper", "checkStartPlayAttractAnimation exp: " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    public static boolean d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasAdAttractAnimationInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        boolean z17 = g(c17933xe8d1b226) && (c17933xe8d1b226.m70354x74235b3e().f38211x1b3eca3e.f72812x15b9f491 != null || c17933xe8d1b226.m70394x2cf577f());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasAdAttractAnimationInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        return z17;
    }

    public static boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_social_comp_liked_haptic_feedback, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSocialAttitudeHelper", "isLikedHapticFeedback is " + Ni);
            boolean z17 = Ni == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdSocialAttitudeHelper", "isLikedHapticFeedback, exp is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
    }

    public static void f(int i17, u74.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if (dVar.T.f506664a == 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) dVar.f506696x.findViewById(com.p314xaae8f345.mm.R.id.f564427r2);
            if (imageView != null) {
                imageView.setVisibility(i17);
            }
        } else {
            android.widget.ImageButton imageButton = (android.widget.ImageButton) dVar.f506696x.findViewById(com.p314xaae8f345.mm.R.id.f564427r2);
            if (imageButton != null) {
                imageButton.setVisibility(i17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    public static boolean g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        boolean z17 = c17933xe8d1b226 != null && c17933xe8d1b226.m70412xa290b704();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        return z17;
    }

    public static boolean h(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, u74.d dVar) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if (!d(c17933xe8d1b226)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
        if (dVar == null || dVar.H == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdSocialAttitudeHelper", "showAdAttractAnimation, viewHolder or showAdAttitudeView is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
        mb4.c cVar = c17933xe8d1b226.m70354x74235b3e().f38211x1b3eca3e;
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        mb4.r rVar = cVar.f406921m;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
            i18 = rVar.f406994h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        } else {
            mb4.b bVar = cVar.f72812x15b9f491;
            if (bVar != null) {
                i18 = bVar.f406904a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
                i18 = 0;
            }
        }
        if (i17 < i18 || i17 >= i18 + 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
        boolean m17 = dVar.H.m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        return m17;
    }
}

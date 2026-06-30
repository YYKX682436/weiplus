package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class jb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f251038d;

    public jb(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773) {
        this.f251038d = activityC18007x6d5e9773;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$16");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f251038d;
        activityC18007x6d5e9773.m8();
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            java.lang.String str2 = activityC18007x6d5e9773.f248233d;
            switch (itemId) {
                case 1:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$4500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doShareToChat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.Y7()) {
                        activityC18007x6d5e9773.o7(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wb(activityC18007x6d5e9773));
                    } else {
                        activityC18007x6d5e9773.p7(activityC18007x6d5e9773.C, null);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doShareToChat", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 1);
                    break;
                case 2:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$4600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.Y7()) {
                        activityC18007x6d5e9773.o7(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yb(activityC18007x6d5e9773));
                    } else {
                        activityC18007x6d5e9773.q7(activityC18007x6d5e9773.C, null);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 2);
                    break;
                case 3:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$4700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    activityC18007x6d5e9773.f248291y0.f552634l++;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doFav snsAdNativeLadingPagesUI");
                    long j17 = activityC18007x6d5e9773.getIntent().getExtras().getLong("msg_id", -2147483648L);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC18007x6d5e9773.P)) {
                        str = null;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m69880xc3665610 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69880xc3665610(activityC18007x6d5e9773.P);
                        if (m69880xc3665610 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 3);
                            break;
                        } else {
                            str = m69880xc3665610.m70363x51f8f990();
                        }
                    }
                    java.lang.String stringExtra = activityC18007x6d5e9773.getIntent().getStringExtra("prePublishId");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    java.lang.String str3 = stringExtra;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tc B7 = activityC18007x6d5e9773.B7();
                    java.lang.String v76 = activityC18007x6d5e9773.v7();
                    java.lang.String u76 = activityC18007x6d5e9773.u7(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z7(activityC18007x6d5e9773.C, null, true, true));
                    if (B7 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69807xfac19be4(j17, str, activityC18007x6d5e9773.I, activityC18007x6d5e9773.N, str3, B7.f252037a, B7.f252038b, u76, 34, activityC18007x6d5e9773.C7(B7.f252039c), v76);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69807xfac19be4(j17, str, activityC18007x6d5e9773.I, activityC18007x6d5e9773.N, str3, activityC18007x6d5e9773.L, activityC18007x6d5e9773.M, u76, 34, activityC18007x6d5e9773.C7(activityC18007x6d5e9773.K), v76);
                    }
                    o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar = activityC18007x6d5e9773.f248250i3;
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.s1) e4Var).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.g(0, 34, activityC18007x6d5e9773, gVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFav", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 3);
                case 4:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    java.lang.String str4 = activityC18007x6d5e9773.G;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    java.lang.String str5 = activityC18007x6d5e9773.H;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    activityC18007x6d5e9773.d8(activityC18007x6d5e9773, str4, str5, 1, 14);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 4);
                    break;
                case 5:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$4800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOpenUrlInBrowser", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2185xb73a0fae.C18196x5d1f44b c18196x5d1f44b = activityC18007x6d5e9773.f248270p2;
                    if (c18196x5d1f44b != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
                        ab4.f fVar = c18196x5d1f44b.f250033d;
                        if (fVar != null && !android.text.TextUtils.isEmpty(fVar.F)) {
                            java.lang.String str6 = fVar.F;
                            java.lang.String n17 = activityC18007x6d5e9773.A7().n();
                            if (android.text.TextUtils.isEmpty(n17)) {
                                n17 = activityC18007x6d5e9773.A7().o();
                            }
                            if (!android.text.TextUtils.isEmpty(n17)) {
                                str6 = ca4.z0.b(str6, n17);
                            }
                            ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).getClass();
                            ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
                            new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.h().c(activityC18007x6d5e9773, str6);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doOpenInBrowser, url=" + str6);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOpenUrlInBrowser", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 5);
                    break;
                case 6:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$4900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOpenLBSAuthManagerPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    android.content.Intent intent = new android.content.Intent();
                    ab4.n0 A7 = activityC18007x6d5e9773.A7();
                    java.lang.String m17 = ca4.m0.m(A7.k());
                    java.lang.String o17 = A7.o();
                    intent.putExtra("sns_landig_pages_from_source", A7.l());
                    intent.putExtra("sns_landing_pages_rawSnsId", m17);
                    intent.putExtra("sns_landing_pages_ux_info", o17);
                    j45.l.j(activityC18007x6d5e9773, "sns", ".ui.SnsAdLBSAuthManagerUI", intent, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOpenLBSAuthManagerPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$4900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 6);
                    break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$16");
    }
}

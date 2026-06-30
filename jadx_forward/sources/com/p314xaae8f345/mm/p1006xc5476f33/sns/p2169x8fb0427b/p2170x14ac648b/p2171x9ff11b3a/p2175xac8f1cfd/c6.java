package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class c6 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public c6(android.content.Context context, ab4.u uVar, android.view.ViewGroup viewGroup) {
        super(context, uVar, viewGroup);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = uVar.H;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        this.f246919t.b("pkg", h17 == null ? "" : h17.f67386xa1e9e82c);
        this.f246919t.b("appid", uVar.H);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
        ab4.u X = X();
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = X.H;
        ((kt.c) i0Var).getClass();
        android.content.Context context = this.f246582d;
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(context, str)) {
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = X.H;
            ((kt.c) i0Var2).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str2);
            if (h17 != null && !android.text.TextUtils.isEmpty(h17.f67386xa1e9e82c)) {
                java.lang.String str3 = h17.f67386xa1e9e82c;
                java.lang.String Ui = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(context, h17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                boolean z17 = false;
                if (context == null || android.text.TextUtils.isEmpty(str3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                } else {
                    try {
                        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str3);
                        if (launchIntentForPackage != null) {
                            boolean z18 = context instanceof android.app.Activity;
                            p95.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.b6(this, context, launchIntentForPackage, Ui));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                            z17 = true;
                        }
                    } catch (java.lang.Exception e17) {
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageOpenAppBtnComp", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                }
                if (z17) {
                    P();
                }
            }
            super.Y();
        } else {
            super.Y();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
    }
}

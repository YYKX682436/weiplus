package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class e implements p64.b, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public q64.b f244324d;

    @Override // p64.b
    public android.os.Bundle a(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
        try {
            java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "COUPON_APP_ID");
            java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "COUPON_STOCK_ID");
            java.lang.String k19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "COMP_ID");
            java.lang.String k27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "UX_INFO");
            this.f244324d = bVar;
            java.lang.System.currentTimeMillis();
            gm0.j1.d().a(4743, this);
            gm0.j1.d().g(new k64.p(k17, k18, k27, k19));
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onServerCall has something invalid!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerCall", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            gm0.j1.d().q(4743, this);
            if (i17 == 0 && i18 == 0 && (m1Var instanceof k64.p)) {
                r45.eo3 eo3Var = (r45.eo3) ((k64.p) m1Var).I();
                if (eo3Var != null) {
                    bundle.putInt("ret", eo3Var.f455153d);
                    if (!android.text.TextUtils.isEmpty(eo3Var.f455154e)) {
                        bundle.putString("msg", eo3Var.f455154e);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onSceneEnd, the response is null!!!!");
                    bundle.putInt("call_ipc_result_key", -1);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onSceneEnd is return error errType is " + i17 + ", the error code is " + i18);
                bundle.putInt("call_ipc_result_key", -1);
            }
            q64.b bVar = this.f244324d;
            if (bVar != null) {
                ((r64.b) bVar).e(bundle);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.CouponCardBtnComp", "CouponRemoteCall::onSceneEnd has something invalid!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponRemoteCall");
    }
}

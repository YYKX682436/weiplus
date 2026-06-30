package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class m2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 f228694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var) {
        super(false);
        this.f228695e = activityC16363x8a0a619d;
        this.f228694d = e1Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.u0 u0Var;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d.f227580p3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228695e;
        activityC16363x8a0a619d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = this.f228694d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "onClick tips, jumpChangeType: %s, url: %s", java.lang.Integer.valueOf(e1Var.R), e1Var.N);
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.N)) {
            int i18 = e1Var.R;
            if (i18 != 1) {
                if (i18 == 2) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC16363x8a0a619d.mo55332x76847179(), e1Var.N, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13184, 1, e1Var.N);
                } else if (i18 == 3) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(e1Var.N);
                        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
                        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                        am.nx nxVar = c6113xa3727625.f136390g;
                        nxVar.f88999a = optString;
                        if (optString2 == null) {
                            optString2 = "";
                        }
                        nxVar.f89000b = optString2;
                        nxVar.f89002d = 1100;
                        nxVar.f89001c = 0;
                        nxVar.f89004f = activityC16363x8a0a619d;
                        c6113xa3727625.e();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13184, 1, e1Var.N);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyDetailUI", e17, "handle jump weapp error: %s", e17.getMessage());
                    }
                }
            } else if (e1Var.N.startsWith("weixin://wcpay/lqtdetail") || e1Var.N.startsWith("weixin://wcpay/lqt/detail")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.b(e1Var.N);
                if (!((h45.q) i95.n0.c(h45.q.class)).mo24812x391b2a71(activityC16363x8a0a619d.mo55332x76847179())) {
                    j45.l.h(activityC16363x8a0a619d.mo55332x76847179(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13184, 1, e1Var.N);
            } else if (e1Var.N.startsWith("weixin://wcpay/lqt/save")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.b(e1Var.N);
                java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.a(e1Var.N);
                boolean l17 = j62.e.g().l("clicfg_android_balance_jump_route_change", false, false, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyLqtSaveJumpHandler", "[isKindaRouteEnabled] enable: %s", java.lang.Boolean.valueOf(l17));
                if (l17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l4.a(activityC16363x8a0a619d, a17);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0) new em5.i().a(activityC16363x8a0a619d, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0.class);
                    if (z0Var == null || (u0Var = z0Var.f259288b) == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "fetchLqtDetail() interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null");
                    } else {
                        android.app.Dialog e18 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(activityC16363x8a0a619d, false, false, null);
                        ((km5.q) u0Var.b().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p2(activityC16363x8a0a619d, z0Var, e18, a17))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.n2(activityC16363x8a0a619d, e18));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13184, 1, e1Var.N);
            }
            z17 = true;
        }
        if (z17) {
            return;
        }
        if (android.text.TextUtils.isEmpty(e1Var.N)) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(12, 1);
            h45.a0.b(activityC16363x8a0a619d.mo55332x76847179(), 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13184, 0, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl is empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "detail.changeUrl:" + e1Var.N);
        if (e1Var.N.startsWith("weixin://wxpay")) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(12, 1);
            h45.a0.b(activityC16363x8a0a619d.mo55332x76847179(), 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13184, 0, e1Var.N);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(7, 1);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC16363x8a0a619d.mo55332x76847179(), e1Var.N, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13184, 1, e1Var.N);
        }
    }
}

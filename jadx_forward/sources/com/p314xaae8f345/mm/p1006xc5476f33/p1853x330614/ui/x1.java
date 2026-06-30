package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class x1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f230046d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e) {
        this.f230046d = activityC16480xce80140e;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = this.f230046d;
        at4.x0 x0Var = (at4.x0) activityC16480xce80140e.M.get(menuItem.getItemId());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "selected pay manga label, jump type = " + x0Var.f95521b);
        int i18 = x0Var.f95521b;
        if (i18 == 1) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f95522c)) {
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC16480xce80140e.mo55332x76847179(), x0Var.f95522c, false);
            return;
        }
        if (i18 != 2) {
            if (i18 == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23388, 2, 2);
                j45.l.m(activityC16480xce80140e.mo55332x76847179(), "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 65281);
                return;
            } else {
                if (i18 != 9) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23388, 2, 1);
                j45.l.h(activityC16480xce80140e.mo55332x76847179(), "mall", ".ui.MallFunctionSettingsUI");
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.f95523d)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        java.lang.String str = x0Var.f95523d;
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str;
        java.lang.String str2 = x0Var.f95524e;
        if (str2 == null) {
            str2 = "";
        }
        nxVar.f89000b = str2;
        nxVar.f89002d = 1066;
        nxVar.f89001c = 0;
        c6113xa3727625.e();
    }
}

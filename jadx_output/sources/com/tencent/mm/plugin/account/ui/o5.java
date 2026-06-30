package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class o5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f74085d;

    public o5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f74085d = loginHistoryUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f74085d;
        if (itemId == 7009) {
            com.tencent.mm.plugin.account.ui.LoginHistoryUI.k7(loginHistoryUI, loginHistoryUI.getString(com.tencent.mm.R.string.l8k) + com.tencent.mm.sdk.platformtools.m2.d());
            v61.d.f(1);
            return;
        }
        if (itemId == 7010) {
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
            java.lang.String str2 = wo.w0.k() + "_" + java.lang.System.currentTimeMillis();
            java.lang.String e17 = com.tencent.mm.sdk.platformtools.m2.e();
            u11.a a17 = u11.b.a(e17);
            if (a17 != null) {
                e17 = a17.f423728b;
                str = a17.f423729c;
            } else {
                str = "";
            }
            com.tencent.mm.plugin.account.ui.LoginHistoryUI.k7(loginHistoryUI, loginHistoryUI.getString(com.tencent.mm.R.string.lse, d17, str2, e17, str));
            v61.d.f(1);
            return;
        }
        if (itemId == 7012) {
            com.tencent.mm.plugin.account.ui.LoginHistoryUI.k7(loginHistoryUI, loginHistoryUI.getString(com.tencent.mm.R.string.ff_, com.tencent.mm.sdk.platformtools.m2.d()));
            v61.d.g("frozen_account_login", 1);
            v61.d.f(1);
            return;
        }
        switch (itemId) {
            case com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_HOWLING_DETECTED /* 7002 */:
                if ((loginHistoryUI instanceof com.tencent.mm.plugin.account.ui.LoginPasswordUI) || (loginHistoryUI instanceof com.tencent.mm.plugin.account.ui.LoginSmsUI)) {
                    int i18 = com.tencent.mm.plugin.account.ui.LoginHistoryUI.f73323y0;
                    loginHistoryUI.getClass();
                    v61.d.g("login_other_account", 1);
                }
                int i19 = com.tencent.mm.plugin.account.ui.LoginHistoryUI.f73323y0;
                loginHistoryUI.l7();
                v61.d.f(1);
                return;
            case 7003:
                int i27 = com.tencent.mm.plugin.account.ui.LoginHistoryUI.f73323y0;
                loginHistoryUI.getClass();
                com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p.a(loginHistoryUI, new android.content.Intent(loginHistoryUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class));
                v61.d.f(1);
                return;
            case 7004:
                com.tencent.mm.plugin.account.ui.LoginHistoryUI.T6(loginHistoryUI);
                v61.d.f(1);
                v61.d.g("security_center_login", 1);
                return;
            default:
                return;
        }
    }
}

package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class nj implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.WelcomeActivity f74070d;

    public nj(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity) {
        this.f74070d = welcomeActivity;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74070d;
        if (itemId == 1001) {
            com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p.a(welcomeActivity, new android.content.Intent(welcomeActivity, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class));
        } else {
            if (itemId != 1002) {
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = welcomeActivity.f73694f;
            thirdAppRegisterStruct.f61234d = 1L;
            thirdAppRegisterStruct.f61235e = 2L;
            thirdAppRegisterStruct.k();
            com.tencent.mm.ui.mmfb.sdk.l lVar = new com.tencent.mm.ui.mmfb.sdk.l();
            welcomeActivity.f73693e = lVar;
            lVar.a(welcomeActivity, com.tencent.mm.plugin.account.ui.WelcomeActivity.f73691h, new com.tencent.mm.plugin.account.ui.sj(welcomeActivity));
        }
    }
}

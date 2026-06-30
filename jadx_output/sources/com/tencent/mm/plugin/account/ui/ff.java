package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ff implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI f73864d;

    public ff(com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI) {
        this.f73864d = regByMobileRegAIOUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.Y;
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = this.f73864d;
        java.lang.String string = regByMobileRegAIOUI.getString(com.tencent.mm.R.string.f490573yv);
        java.lang.String string2 = regByMobileRegAIOUI.getString(com.tencent.mm.R.string.gic);
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0("facebook@wechat_auth", regByMobileRegAIOUI.H, 0, "", "", "", 0, "", true, false);
        regByMobileRegAIOUI.f73574r = db5.e1.Q(regByMobileRegAIOUI, string, string2, true, true, new com.tencent.mm.plugin.account.ui.hf(regByMobileRegAIOUI, v0Var));
        gm0.j1.d().g(v0Var);
        com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = regByMobileRegAIOUI.P;
        thirdAppRegisterStruct.f61234d = regByMobileRegAIOUI.f73562J;
        thirdAppRegisterStruct.f61235e = 8L;
        thirdAppRegisterStruct.k();
    }
}

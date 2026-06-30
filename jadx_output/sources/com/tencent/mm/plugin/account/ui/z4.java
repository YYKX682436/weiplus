package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class z4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f74355d;

    public z4(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI, int i17) {
        this.f74355d = loginHistoryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f74355d;
        com.tencent.mm.plugin.account.ui.w6 w6Var = loginHistoryUI.f73340u;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        java.lang.String str2 = loginHistoryUI.P;
        if (str2 != null) {
            str2.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(loginHistoryUI.P);
        java.lang.String str3 = loginHistoryUI.f73340u.f74287c;
        if (str3 != null) {
            str3.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(loginHistoryUI.f73340u.f74287c);
        com.tencent.mm.plugin.account.ui.w6 w6Var2 = loginHistoryUI.f73340u;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(w6Var2.f74286b, w6Var2.f74287c, w6Var2.f74292h, loginHistoryUI.f73339t.getSecImgCode(), loginHistoryUI.f73339t.getSecImgSid(), loginHistoryUI.f73339t.getSecImgEncryptKey(), 0, "", false, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(loginHistoryUI.f73340u.f74287c) && !com.tencent.mm.sdk.platformtools.t8.K0(loginHistoryUI.P)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "summervoice resetMd5BeforeDoSceneByVoice mAuthPwd:", com.tencent.mm.sdk.platformtools.t8.G1(loginHistoryUI.P));
            v0Var.T(loginHistoryUI.P);
        }
        gm0.j1.d().g(v0Var);
        loginHistoryUI.g7(true);
    }
}

package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class c4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI f73766d;

    public c4(com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI, int i17) {
        this.f73766d = loginByMobileSendSmsUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI = this.f73766d;
        com.tencent.mm.plugin.account.ui.w6 w6Var = loginByMobileSendSmsUI.f73298g;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        java.lang.String str2 = loginByMobileSendSmsUI.f73308t;
        if (str2 != null) {
            str2.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(loginByMobileSendSmsUI.f73308t);
        java.lang.String str3 = loginByMobileSendSmsUI.f73298g.f74287c;
        if (str3 != null) {
            str3.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(loginByMobileSendSmsUI.f73298g.f74287c);
        com.tencent.mm.plugin.account.ui.w6 w6Var2 = loginByMobileSendSmsUI.f73298g;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(w6Var2.f74286b, w6Var2.f74287c, w6Var2.f74292h, loginByMobileSendSmsUI.f73304p.getSecImgCode(), loginByMobileSendSmsUI.f73304p.getSecImgSid(), loginByMobileSendSmsUI.f73304p.getSecImgEncryptKey(), 0, "", false, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(loginByMobileSendSmsUI.f73298g.f74287c) && !com.tencent.mm.sdk.platformtools.t8.K0(loginByMobileSendSmsUI.f73308t)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginByMobileSendSmsUI", "summervoice resetMd5BeforeDoSceneByVoice mAuthPwd:", com.tencent.mm.sdk.platformtools.t8.G1(loginByMobileSendSmsUI.f73308t));
            v0Var.T(loginByMobileSendSmsUI.f73308t);
        }
        gm0.j1.d().g(v0Var);
        com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI loginByMobileSendSmsUI2 = this.f73766d;
        loginByMobileSendSmsUI2.f73309u = db5.e1.Q(loginByMobileSendSmsUI2, loginByMobileSendSmsUI2.getString(com.tencent.mm.R.string.f490573yv), loginByMobileSendSmsUI.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.b4(this, v0Var));
    }
}

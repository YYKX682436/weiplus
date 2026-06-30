package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f74351d;

    public z(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI, int i17) {
        this.f74351d = baseLoginVoiceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI = this.f74351d;
        com.tencent.mm.plugin.account.ui.w6 w6Var = baseLoginVoiceUI.f73255p;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        java.lang.String str2 = baseLoginVoiceUI.C;
        if (str2 != null) {
            str2.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(baseLoginVoiceUI.C);
        java.lang.String str3 = baseLoginVoiceUI.f73255p.f74287c;
        if (str3 != null) {
            str3.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(baseLoginVoiceUI.f73255p.f74287c);
        com.tencent.mm.plugin.account.ui.w6 w6Var2 = baseLoginVoiceUI.f73255p;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(w6Var2.f74286b, w6Var2.f74287c, w6Var2.f74292h, baseLoginVoiceUI.f73254o.getSecImgCode(), baseLoginVoiceUI.f73254o.getSecImgSid(), baseLoginVoiceUI.f73254o.getSecImgEncryptKey(), 0, "", false, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(baseLoginVoiceUI.f73255p.f74287c) && !com.tencent.mm.sdk.platformtools.t8.K0(baseLoginVoiceUI.C)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "summervoice resetMd5BeforeDoSceneByVoice mAuthPwd:", com.tencent.mm.sdk.platformtools.t8.G1(baseLoginVoiceUI.C));
            v0Var.T(baseLoginVoiceUI.C);
        }
        gm0.j1.d().g(v0Var);
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI2 = this.f74351d;
        baseLoginVoiceUI2.f73253n = db5.e1.Q(baseLoginVoiceUI2, baseLoginVoiceUI2.getString(com.tencent.mm.R.string.f490573yv), baseLoginVoiceUI.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.y(this, v0Var));
    }
}

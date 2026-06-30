package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class xc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ad f74321d;

    public xc(com.tencent.mm.plugin.account.ui.ad adVar) {
        this.f74321d = adVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.ad adVar = this.f74321d;
        com.tencent.mm.plugin.account.ui.w6 w6Var = adVar.f73723h;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        com.tencent.mm.plugin.account.ui.w6 w6Var2 = adVar.f73723h;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(w6Var2.f74286b, w6Var2.f74288d, w6Var2.f74292h, adVar.f73722g.getSecImgCode(), adVar.f73722g.getSecImgSid(), adVar.f73722g.getSecImgEncryptKey(), 1, "", false, true);
        gm0.j1.d().g(v0Var);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = adVar.f73719d;
        db5.e1.Q(mobileVerifyUI, mobileVerifyUI.getString(com.tencent.mm.R.string.f490573yv), adVar.f73719d.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.wc(this, v0Var));
    }
}

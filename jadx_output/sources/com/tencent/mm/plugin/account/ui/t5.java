package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class t5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginIndepPass f74211d;

    public t5(com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass) {
        this.f74211d = loginIndepPass;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass = this.f74211d;
        com.tencent.mm.plugin.account.ui.w6 w6Var = loginIndepPass.f73355g;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        com.tencent.mm.plugin.account.ui.w6 w6Var2 = loginIndepPass.f73355g;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(w6Var2.f74286b, w6Var2.f74287c, w6Var2.f74292h, loginIndepPass.f73354f.getSecImgCode(), loginIndepPass.f73354f.getSecImgSid(), loginIndepPass.f73354f.getSecImgEncryptKey(), 1, "", false, false);
        gm0.j1.d().g(v0Var);
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass2 = this.f74211d;
        loginIndepPass2.f73353e = db5.e1.Q(loginIndepPass2, loginIndepPass2.getString(com.tencent.mm.R.string.f490573yv), loginIndepPass.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.s5(this, v0Var));
    }
}

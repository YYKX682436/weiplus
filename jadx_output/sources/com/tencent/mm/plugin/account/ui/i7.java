package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class i7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginUI f73931d;

    public i7(com.tencent.mm.plugin.account.ui.LoginUI loginUI) {
        this.f73931d = loginUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.LoginUI loginUI = this.f73931d;
        if (loginUI.f73410n == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginUI", "secimg is null!");
            return;
        }
        com.tencent.mm.plugin.account.ui.w6 w6Var = loginUI.f73411o;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        com.tencent.mm.plugin.account.ui.w6 w6Var2 = loginUI.f73411o;
        gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(w6Var2.f74286b, w6Var2.f74287c, w6Var2.f74292h, loginUI.f73410n.getSecImgCode(), loginUI.f73410n.getSecImgSid(), loginUI.f73410n.getSecImgEncryptKey(), 2, "", false, false));
        loginUI.X6(true);
    }
}

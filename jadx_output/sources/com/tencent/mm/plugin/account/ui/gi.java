package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class gi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SimpleLoginUI f73890d;

    public gi(com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI) {
        this.f73890d = simpleLoginUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI = this.f73890d;
        com.tencent.mm.plugin.account.ui.w6 w6Var = simpleLoginUI.f73667n;
        java.lang.String str = w6Var.f74289e;
        int length = w6Var.f74291g.length;
        fp.k.c();
        com.tencent.mm.plugin.account.ui.w6 w6Var2 = simpleLoginUI.f73667n;
        gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(w6Var2.f74286b, w6Var2.f74287c, w6Var2.f74292h, simpleLoginUI.f73666m.getSecImgCode(), simpleLoginUI.f73666m.getSecImgSid(), simpleLoginUI.f73666m.getSecImgEncryptKey(), 0, "", false, false));
        simpleLoginUI.a7(true);
    }
}

package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public class v6 implements js.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginPasswordUI f74266a;

    public v6(com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI) {
        this.f74266a = loginPasswordUI;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = this.f74266a;
        if (str == null || str2 == null) {
            int i17 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "gateway login account or pwd is null");
            loginPasswordUI.n7();
        } else {
            gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(str, str2, 0, "", "", "", 0, "", false, true));
            loginPasswordUI.g7(true);
        }
    }
}

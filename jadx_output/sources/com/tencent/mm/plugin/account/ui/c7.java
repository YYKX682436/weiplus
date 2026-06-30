package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginSmsUI f73769d;

    public c7(com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI) {
        this.f73769d = loginSmsUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.account.ui.LoginSmsUI.f73395p1;
        com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI = this.f73769d;
        loginSmsUI.V6();
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(loginSmsUI).a(com.tencent.mm.plugin.account.ui.k3.class)).U6();
        h11.e eVar = new h11.e(loginSmsUI.f73345y, 17, loginSmsUI.M.getText().toString().trim(), 0, "");
        eVar.f278074g = loginSmsUI.E;
        eVar.f278075h = loginSmsUI.D;
        gm0.j1.d().g(eVar);
        loginSmsUI.g7(true);
    }
}

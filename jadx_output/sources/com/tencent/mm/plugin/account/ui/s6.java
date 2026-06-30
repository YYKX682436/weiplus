package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginPasswordUI f74185d;

    public s6(com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI) {
        this.f74185d = loginPasswordUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = this.f74185d;
        loginPasswordUI.V6();
        boolean z17 = loginPasswordUI.T == 1;
        com.tencent.mm.plugin.account.ui.w6 w6Var = loginPasswordUI.f73340u;
        com.tencent.mm.modelsimple.v0 v0Var = (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(w6Var.f74288d)) ? new com.tencent.mm.modelsimple.v0(w6Var.f74286b, w6Var.f74287c, loginPasswordUI.f73342w, 0) : new com.tencent.mm.modelsimple.v0(w6Var.f74286b, w6Var.f74288d, 0, "", "", "", 0, loginPasswordUI.f73342w, true, false);
        v0Var.f71436q = loginPasswordUI.E;
        v0Var.f71437r = loginPasswordUI.D;
        gm0.j1.d().g(v0Var);
        loginPasswordUI.g7(true);
    }
}

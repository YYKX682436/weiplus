package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginIndepPass f73903d;

    public h6(com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass) {
        this.f73903d = loginIndepPass;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String c17 = com.tencent.mm.plugin.account.ui.w6.c();
        java.lang.String d17 = com.tencent.mm.plugin.account.ui.w6.d();
        int i17 = com.tencent.mm.plugin.account.ui.LoginIndepPass.f73351t;
        com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass = this.f73903d;
        loginIndepPass.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            db5.e1.i(loginIndepPass, com.tencent.mm.R.string.k6d, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            db5.e1.i(loginIndepPass, com.tencent.mm.R.string.k67, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        loginIndepPass.f73352d.setText(d17);
        loginIndepPass.hideVKB();
        gm0.j1.d().a(701, loginIndepPass);
        gm0.j1.d().a(252, loginIndepPass);
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(c17, d17, (java.lang.String) null, 1);
        gm0.j1.d().g(v0Var);
        loginIndepPass.f73353e = db5.e1.Q(loginIndepPass, loginIndepPass.getString(com.tencent.mm.R.string.f490573yv), loginIndepPass.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.q5(loginIndepPass, v0Var));
    }
}

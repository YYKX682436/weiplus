package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class LoginPasswordUI$$d implements js.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginPasswordUI f73377a;

    public final void a(com.tencent.mm.ui.mmfb.sdk.t tVar) {
        final com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = this.f73377a;
        int i17 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
        loginPasswordUI.getClass();
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$j
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
                com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI2 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.this;
                android.app.ProgressDialog progressDialog = loginPasswordUI2.f73338s;
                if (progressDialog != null && progressDialog.isShowing()) {
                    loginPasswordUI2.f73338s.dismiss();
                    loginPasswordUI2.f73338s = null;
                }
                loginPasswordUI2.g7(false);
            }
        });
        if (tVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "gateway login param is null");
            loginPasswordUI.n7();
            return;
        }
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        com.tencent.mm.plugin.account.ui.v6 v6Var = new com.tencent.mm.plugin.account.ui.v6(loginPasswordUI);
        is.f fVar = (is.f) r0Var;
        fVar.getClass();
        java.lang.String str = tVar.f209231a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.Integer num = tVar.f209232b;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new is.e(loginPasswordUI, tVar, str2, num != null ? num.intValue() : 0, fVar, v6Var));
    }
}

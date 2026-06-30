package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class u6 implements wd0.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginPasswordUI f74239a;

    public u6(com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI) {
        this.f74239a = loginPasswordUI;
    }

    @Override // wd0.c1
    public void a(final wd0.e1 e1Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k());
        hashMap.put("fingerprint_verify_result", java.lang.Integer.valueOf(e1Var.f444703a));
        hashMap.put("login_sessionid", v61.d.a(1));
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai(null, "fingerprint_login_request_end", hashMap);
        int i17 = com.tencent.mm.plugin.account.ui.LoginPasswordUI.G1;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginPasswordUI", "[fingerprint login] showFingerprintDialog result %d,errMsg %s", java.lang.Integer.valueOf(e1Var.f444703a), e1Var.f444704b);
        int i18 = e1Var.f444703a;
        com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI = this.f74239a;
        if (i18 != 0) {
            loginPasswordUI.m7(i18);
        } else {
            loginPasswordUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.u6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.account.ui.LoginPasswordUI loginPasswordUI2 = com.tencent.mm.plugin.account.ui.u6.this.f74239a;
                    gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(loginPasswordUI2.E, e1Var.f444706d, 0, "", "", "", 0, "", false, true));
                    loginPasswordUI2.g7(true);
                }
            });
        }
    }

    @Override // wd0.c1
    public void b(boolean z17) {
        this.f74239a.g7(z17);
    }
}

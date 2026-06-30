package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI */
/* loaded from: classes9.dex */
public class ActivityC19170xd70060d7 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f262648d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f262649e = false;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p pVar, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, loginResult = " + pVar);
        int ordinal = pVar.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: login ok.");
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new ss4.e0(null, 19));
            android.app.Dialog dialog = this.f262648d;
            if (dialog != null) {
                dialog.dismiss();
                this.f262648d = null;
            }
            this.f262648d = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.i(this, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.b0(this));
            return;
        }
        if (ordinal == 1 || ordinal == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin fail, loginResult = " + pVar);
            a7(1, false, "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, unknown login result = " + pVar);
        }
        a7(2, true, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kea));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final void a7(int i17, boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: redirect to open fingerprint failed. errCode: %d", java.lang.Integer.valueOf(i17));
        android.app.Dialog dialog = this.f262648d;
        if (dialog != null && dialog.isShowing()) {
            this.f262648d.dismiss();
            this.f262648d = null;
        }
        if (z17) {
            db5.e1.G(this, str, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c0(this));
        } else {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(385, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ss4.e0) {
            if (this.f262649e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: is already handled");
                return;
            }
            this.f262649e = true;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query failed. inform fail.");
                a7(3, true, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kea));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query ok. start judge.");
            at4.x1 Ai = vr4.f1.wi().Ai();
            if (Ai == null || !Ai.w()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not open wechat payment. hint bind bankcard");
                a7(5, true, getString(com.p314xaae8f345.mm.R.C30867xcad56011.klw));
            } else if (!is4.a.c() || wo.v1.f529359f.f529401b != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not support wechat fp pay or not allow");
                a7(6, true, getString(com.p314xaae8f345.mm.R.C30867xcad56011.kly));
            } else {
                ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("paySettingsUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d0(this));
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        android.app.Dialog dialog = this.f262648d;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f262648d.dismiss();
        this.f262648d = null;
    }
}

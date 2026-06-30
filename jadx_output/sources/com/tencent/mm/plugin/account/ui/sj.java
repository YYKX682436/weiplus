package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class sj implements com.tencent.mm.ui.mmfb.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.WelcomeActivity f74204a;

    public sj(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity) {
        this.f74204a = welcomeActivity;
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void b(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WelcomeActivity", "facebook login success");
        java.lang.String[] strArr = com.tencent.mm.plugin.account.ui.WelcomeActivity.f73691h;
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74204a;
        welcomeActivity.getClass();
        gm0.j1.e().g(new com.tencent.mm.plugin.account.ui.rj(welcomeActivity));
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void c(com.tencent.mm.ui.mmfb.sdk.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", hVar.getMessage());
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74204a;
        db5.e1.s(welcomeActivity, welcomeActivity.getString(com.tencent.mm.R.string.c88), "");
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void d(com.tencent.mm.ui.mmfb.sdk.n nVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WelcomeActivity", "facebook-android login error! %s", nVar.getMessage());
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74204a;
        db5.e1.s(welcomeActivity, welcomeActivity.getString(com.tencent.mm.R.string.c88), "");
    }

    @Override // com.tencent.mm.ui.mmfb.sdk.k
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WelcomeActivity", "facebook login cancel");
    }
}

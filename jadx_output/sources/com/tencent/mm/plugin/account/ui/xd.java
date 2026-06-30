package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class xd implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileVerifyUI f74322a;

    public xd(com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI) {
        this.f74322a = mobileVerifyUI;
    }

    @Override // com.tencent.mm.ui.zc
    public void a(int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyUI", "onActivityResult() called with: resultCode = [" + i17 + "], data = [" + intent + "]");
        if (i17 == -1) {
            com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f74322a;
            if (intent != null) {
                mobileVerifyUI.f73534q = intent.getStringExtra("INTENT_KEY_LANGUAGE_CODE");
            }
            int i18 = com.tencent.mm.plugin.account.ui.MobileVerifyUI.B;
            mobileVerifyUI.f73524d.a();
            mobileVerifyUI.f73538u.a(com.tencent.mm.plugin.account.ui.fe.DoSend);
        }
    }
}

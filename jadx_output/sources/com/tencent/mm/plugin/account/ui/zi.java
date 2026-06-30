package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class zi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f74369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VerifyPwdUI f74370e;

    public zi(com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI, int i17) {
        this.f74370e = verifyPwdUI;
        this.f74369d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI = this.f74370e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(verifyPwdUI.f73681i.getHeight());
        int i17 = this.f74369d;
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyPwdUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (verifyPwdUI.f73681i.getHeight() > i17) {
            verifyPwdUI.f73680h.scrollBy(0, verifyPwdUI.f73681i.getHeight() - i17);
        }
    }
}

package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class aj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.VerifyPwdUI f73731d;

    public aj(com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI) {
        this.f73731d = verifyPwdUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.VerifyPwdUI verifyPwdUI = this.f73731d;
        verifyPwdUI.hideVKB();
        verifyPwdUI.finish();
    }
}

package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f73929d;

    public i5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f73929d = loginHistoryUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f73929d;
        loginHistoryUI.finish();
        loginHistoryUI.overridePendingTransition(-1, -1);
    }
}

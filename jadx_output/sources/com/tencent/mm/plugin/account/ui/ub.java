package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ub implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74249d;

    public ub(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74249d = mobileInputUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.account.ui.MobileInputUI.W;
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74249d;
        mobileInputUI.hideVKB();
        mobileInputUI.I.b(com.tencent.mm.plugin.account.ui.dc.GoNext);
    }
}

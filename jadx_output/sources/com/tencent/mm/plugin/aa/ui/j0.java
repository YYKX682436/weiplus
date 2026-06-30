package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72694d;

    public j0(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI) {
        this.f72694d = aARemittanceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = this.f72694d;
        if (aARemittanceUI.I == 2 && aARemittanceUI.isHandleAutoShowNormalStWcKb()) {
            aARemittanceUI.showNormalStWcKb();
        }
    }
}

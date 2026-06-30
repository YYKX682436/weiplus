package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AARemittanceUI f72667d;

    public h0(com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI) {
        this.f72667d = aARemittanceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.AARemittanceUI aARemittanceUI = this.f72667d;
        aARemittanceUI.f72454g = aARemittanceUI.f72460p.getWidth();
        aARemittanceUI.f72462r.setVisibility(8);
        int i17 = aARemittanceUI.f72454g;
    }
}

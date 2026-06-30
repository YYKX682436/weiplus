package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class w extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        super(false);
        this.f96335d = qrRewardMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96335d;
        qrRewardMainUI.hideVKB();
        int i17 = com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.f96227J;
        qrRewardMainUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) qrRewardMainUI, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.collect.reward.ui.m(qrRewardMainUI);
        k0Var.f211881s = new com.tencent.mm.plugin.collect.reward.ui.n(qrRewardMainUI);
        k0Var.v();
    }
}

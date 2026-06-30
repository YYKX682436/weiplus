package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes4.dex */
public class f0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI f96298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI) {
        super(false);
        this.f96298d = qrRewardSelectMoneyUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI.U6(this.f96298d, 0, 2);
    }
}

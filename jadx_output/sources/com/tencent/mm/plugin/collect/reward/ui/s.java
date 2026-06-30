package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class s extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96331d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        super(false);
        this.f96331d = qrRewardMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.U6(this.f96331d, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14721, 1, 1);
    }
}

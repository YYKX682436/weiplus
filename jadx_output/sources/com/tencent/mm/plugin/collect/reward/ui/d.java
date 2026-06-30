package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI f96292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI) {
        super(false);
        this.f96292d = qrRewardGrantUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f96292d.f96214o.setChecked(!r2.f96214o.isChecked());
    }
}

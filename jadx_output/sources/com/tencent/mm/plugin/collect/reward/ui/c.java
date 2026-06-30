package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI f96289e;

    public c(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI) {
        this.f96289e = qrRewardGrantUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI = this.f96289e;
        if (com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.U6(qrRewardGrantUI, (int) java.lang.Math.round(com.tencent.mm.sdk.platformtools.t8.F(qrRewardGrantUI.f96211i.getText(), 0.0d) * 100.0d))) {
            com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.X6(qrRewardGrantUI);
        }
    }
}

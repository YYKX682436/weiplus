package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class q implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96326a;

    public q(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        this.f96326a = qrRewardMainUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96326a;
        java.lang.String str = qrRewardMainUI.D;
        com.tencent.mm.wallet_core.ui.r1.X(qrRewardMainUI.getContext(), qrRewardMainUI.D, false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14721, 1, 6);
    }
}

package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class a0 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96287a;

    public a0(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        this.f96287a = qrRewardMainUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96287a;
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "click set code, %s", java.lang.Boolean.valueOf(qrRewardMainUI.H));
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.U6(qrRewardMainUI, false);
    }
}

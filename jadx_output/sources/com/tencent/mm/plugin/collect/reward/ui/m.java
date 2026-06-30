package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class m implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96316d;

    public m(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI) {
        this.f96316d = qrRewardMainUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96316d;
        java.lang.String string = qrRewardMainUI.getString(com.tencent.mm.R.string.f492745hp4);
        int i17 = com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.f96227J;
        g4Var.p(1, string, qrRewardMainUI.V6() ? qrRewardMainUI.getString(com.tencent.mm.R.string.hp_) : "", 0);
        g4Var.p(2, qrRewardMainUI.getString(com.tencent.mm.R.string.f492746hp5), qrRewardMainUI.V6() ? "" : qrRewardMainUI.getString(com.tencent.mm.R.string.hp_), 0);
    }
}

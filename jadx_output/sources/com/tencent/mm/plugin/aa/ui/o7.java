package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class o7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72761a;

    public o7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72761a = paylistAAUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "onClick() mBottomTipTv");
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72761a;
        if (!qVar.startWalletBalanceEntryUseCase(paylistAAUI)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_scene_balance_manager", 0);
            j45.l.j(paylistAAUI, "wallet", ".balance.ui.WalletBalanceManagerUI", intent, null);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 4, 4, java.lang.Integer.valueOf(paylistAAUI.R));
    }
}

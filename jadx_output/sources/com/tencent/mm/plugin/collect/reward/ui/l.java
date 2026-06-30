package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class l implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.j f96313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96314b;

    public l(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI, xw1.j jVar) {
        this.f96314b = qrRewardMainUI;
        this.f96313a = jVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        xw1.j jVar = this.f96313a;
        java.lang.String str2 = jVar.f457683p;
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96314b;
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "set succ: %s, %s", str2, qrRewardMainUI.f96237p.getText());
        if (jVar.f457683p.equals(qrRewardMainUI.A)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, qrRewardMainUI.A);
            qrRewardMainUI.Z6();
        }
    }
}

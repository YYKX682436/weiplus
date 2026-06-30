package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class k implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.j f96310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96311b;

    public k(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI, xw1.j jVar) {
        this.f96311b = qrRewardMainUI;
        this.f96310a = jVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        xw1.j jVar = this.f96310a;
        com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardMainUI", "set word error: %s, %s", java.lang.Integer.valueOf(jVar.f457681n.f381717d), jVar.f457681n.f381718e);
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96311b;
        qrRewardMainUI.A = str2;
        qrRewardMainUI.a7(qrRewardMainUI.V6());
        qrRewardMainUI.f96237p.setText("");
        qrRewardMainUI.Z6();
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f457681n.f381718e)) {
            return;
        }
        dp.a.makeText(qrRewardMainUI, jVar.f457681n.f381718e, 0).show();
    }
}

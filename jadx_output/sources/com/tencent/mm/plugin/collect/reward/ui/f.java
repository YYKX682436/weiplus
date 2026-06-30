package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class f implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.g f96296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI f96297b;

    public f(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI, xw1.g gVar) {
        this.f96297b = qrRewardGrantUI;
        this.f96296a = gVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        xw1.g gVar = this.f96296a;
        com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardGrantUI", "place order error: %s, %s", java.lang.Integer.valueOf(gVar.f457672n.f374665d), gVar.f457672n.f374666e);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(gVar.f457672n.f374666e);
        com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI = this.f96297b;
        if (!K0) {
            dp.a.makeText(qrRewardGrantUI, gVar.f457672n.f374666e, 0).show();
        }
        z17 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) qrRewardGrantUI).mKindaEnable;
        if (z17) {
            qrRewardGrantUI.hideLoading();
        }
    }
}

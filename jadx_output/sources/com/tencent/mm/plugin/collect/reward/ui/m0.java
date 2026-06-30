package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class m0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.i f96317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI f96318b;

    public m0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI, xw1.i iVar) {
        this.f96318b = qrRewardSetMoneyUI;
        this.f96317a = iVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        xw1.i iVar = this.f96317a;
        com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardSetMoneyUI", "set code error: %s, %s", java.lang.Integer.valueOf(iVar.f457678n.f383442d), iVar.f457678n.f383443e);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(iVar.f457678n.f383443e);
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI qrRewardSetMoneyUI = this.f96318b;
        if (K0) {
            dp.a.makeText(qrRewardSetMoneyUI, com.tencent.mm.R.string.hpc, 1).show();
        } else {
            dp.a.makeText(qrRewardSetMoneyUI, iVar.f457678n.f383443e, 1).show();
        }
    }
}

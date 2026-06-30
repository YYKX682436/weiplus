package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class h0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.h f96302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI f96303b;

    public h0(com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI, xw1.h hVar) {
        this.f96303b = qrRewardSelectMoneyUI;
        this.f96302a = hVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardSelectMoneyUI", "net error: %s", this.f96302a);
        com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI qrRewardSelectMoneyUI = this.f96303b;
        db5.e1.G(qrRewardSelectMoneyUI.getContext(), qrRewardSelectMoneyUI.getString(com.tencent.mm.R.string.l0g), null, false, new com.tencent.mm.plugin.collect.reward.ui.g0(this));
    }
}

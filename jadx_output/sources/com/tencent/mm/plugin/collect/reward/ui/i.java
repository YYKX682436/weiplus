package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class i implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.g f96304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI f96305b;

    public i(com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI, xw1.g gVar) {
        this.f96305b = qrRewardGrantUI;
        this.f96304a = gVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        xw1.g gVar = this.f96304a;
        r45.fx fxVar = gVar.f457672n;
        java.lang.String str2 = fxVar.f374667f;
        com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI qrRewardGrantUI = this.f96305b;
        qrRewardGrantUI.f96219t = str2;
        qrRewardGrantUI.f96220u = fxVar.f374668g;
        qrRewardGrantUI.f96221v = fxVar.f374669h;
        qrRewardGrantUI.f96222w = fxVar.f374672n;
        qrRewardGrantUI.f96223x = fxVar.f374673o;
        com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardGrantUI", "remind str: %s", fxVar.f374671m);
        if (com.tencent.mm.sdk.platformtools.t8.K0(gVar.f457672n.f374671m)) {
            com.tencent.mm.plugin.collect.reward.ui.QrRewardGrantUI.V6(qrRewardGrantUI);
        } else {
            db5.e1.A(qrRewardGrantUI.getContext(), gVar.f457672n.f374671m, "", qrRewardGrantUI.getString(com.tencent.mm.R.string.f492818hz5), qrRewardGrantUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.collect.reward.ui.g(this), new com.tencent.mm.plugin.collect.reward.ui.h(this));
        }
    }
}

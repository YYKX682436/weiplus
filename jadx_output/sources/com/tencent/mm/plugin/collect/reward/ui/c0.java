package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class c0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.d f96290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96291b;

    public c0(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI, xw1.d dVar) {
        this.f96291b = qrRewardMainUI;
        this.f96290a = dVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        xw1.d dVar = this.f96290a;
        com.tencent.mars.xlog.Log.e("MicroMsg.QrRewardMainUI", "get code error: %s, %s", java.lang.Integer.valueOf(dVar.f457664n.f378142d), dVar.f457664n.f378143e);
        r45.jw jwVar = dVar.f457664n;
        int i19 = jwVar.f378142d;
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96291b;
        if (i19 != 416) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jwVar.f378143e)) {
                dp.a.makeText(qrRewardMainUI, dVar.f457664n.f378143e, 0).show();
            }
            if (dVar.f457666p) {
                return;
            }
            com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.U6(qrRewardMainUI, false);
            return;
        }
        r45.lj5 lj5Var = jwVar.f378156u;
        qrRewardMainUI.f96229e.setVisibility(4);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("realname_verify_process_jump_activity", ".reward.ui.CollectMainUI");
        bundle.putString("realname_verify_process_jump_plugin", "collect");
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI2 = this.f96291b;
        r45.jw jwVar2 = dVar.f457664n;
        zs4.q.d(qrRewardMainUI2, jwVar2.f378142d, jwVar2.f378156u, bundle, true, new com.tencent.mm.plugin.collect.reward.ui.b0(this), null, 1011, 2);
    }
}

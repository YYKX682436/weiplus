package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class d0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.d f96293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI f96294b;

    public d0(com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI, xw1.d dVar) {
        this.f96294b = qrRewardMainUI;
        this.f96293a = dVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        xw1.d dVar = this.f96293a;
        r45.jw jwVar = dVar.f457664n;
        java.lang.String str2 = jwVar.f378147i;
        com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI qrRewardMainUI = this.f96294b;
        qrRewardMainUI.A = str2;
        qrRewardMainUI.E = jwVar.f378155t;
        qrRewardMainUI.F = jwVar.f378148m;
        qrRewardMainUI.B = jwVar.f378149n;
        java.lang.String str3 = jwVar.f378150o;
        qrRewardMainUI.getClass();
        r45.jw jwVar2 = dVar.f457664n;
        qrRewardMainUI.f96245x = !jwVar2.f378144f;
        qrRewardMainUI.C = jwVar2.f378153r;
        qrRewardMainUI.D = jwVar2.f378152q;
        qrRewardMainUI.f96244w = jwVar2.f378157v;
        qrRewardMainUI.H = true;
        qrRewardMainUI.f96247z = jwVar2.f378158w;
        qrRewardMainUI.b7();
        qrRewardMainUI.f96243v.setBannerData(qrRewardMainUI.f96244w);
        if (qrRewardMainUI.f96245x) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(qrRewardMainUI.f96247z)) {
                r45.jw jwVar3 = dVar.f457664n;
                qrRewardMainUI.W6(jwVar3.f378145g, jwVar3.f378146h, false);
            } else {
                qrRewardMainUI.c7();
            }
            qrRewardMainUI.Y6();
            qrRewardMainUI.Z6();
        } else {
            qrRewardMainUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.QrRewardMainUI", "show first guide view");
            qrRewardMainUI.f96232h.setVisibility(8);
            qrRewardMainUI.f96231g.setVisibility(0);
            qrRewardMainUI.f96230f.setOnClickListener(new com.tencent.mm.plugin.collect.reward.ui.s(qrRewardMainUI));
        }
        qrRewardMainUI.f96246y = dVar.f457664n.f378145g;
        qrRewardMainUI.getClass();
        java.lang.String str4 = qrRewardMainUI.f96246y;
    }
}

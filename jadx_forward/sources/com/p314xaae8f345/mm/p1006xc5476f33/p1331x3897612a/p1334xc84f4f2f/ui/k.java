package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class k implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.j f177843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd f177844b;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd, xw1.j jVar) {
        this.f177844b = activityC13135x13db66fd;
        this.f177843a = jVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        xw1.j jVar = this.f177843a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardMainUI", "set word error: %s, %s", java.lang.Integer.valueOf(jVar.f539214n.f463250d), jVar.f539214n.f463251e);
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_WORD_STRING_SYNC, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd = this.f177844b;
        activityC13135x13db66fd.A = str2;
        activityC13135x13db66fd.a7(activityC13135x13db66fd.V6());
        activityC13135x13db66fd.f177770p.setText("");
        activityC13135x13db66fd.Z6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f539214n.f463251e)) {
            return;
        }
        dp.a.m125854x26a183b(activityC13135x13db66fd, jVar.f539214n.f463251e, 0).show();
    }
}

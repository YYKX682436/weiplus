package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class i1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        super(false);
        this.f228544d = activityC16363x8a0a619d;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "mEmoji click");
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228544d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16363x8a0a619d.f227582a2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyDetailUI", "mEmojiMd5 == null");
                return;
            }
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Ni = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(activityC16363x8a0a619d.f227582a2);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(activityC16363x8a0a619d.L1, activityC16363x8a0a619d.W1);
            if (Ni == null || ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Ni).k()) {
                return;
            }
            qk.u uVar = new qk.u(activityC16363x8a0a619d.f227582a2, Ni);
            java.lang.String Q0 = Li.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            uVar.f445543l = Q0;
            uVar.f445541j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1(java.lang.Long.valueOf(Li.I0()));
            java.lang.String j17 = Li.j();
            if (j17 == null) {
                j17 = "";
            }
            uVar.f445542k = j17;
            java.lang.String Q02 = Li.Q0();
            if (Q02 == null) {
                Q02 = "";
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q02)) {
                Q02 = c01.w9.s(Li.j());
                if (Q02 == null) {
                    Q02 = "";
                }
                java.lang.String str = activityC16363x8a0a619d.L1;
                uVar.f445544m = str != null ? str : "";
            }
            uVar.f445540i = Q02;
            uVar.f445689b = true;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
            if (p6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyDetailUI", "emoticon liteapp service not found");
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(activityC16363x8a0a619d, uVar);
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class w3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x3 f234286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x3 x3Var) {
        super(false);
        this.f234286d = x3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        np5.b0 b0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click qr reward");
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.x3 x3Var = this.f234286d;
        x3Var.f234295g.f234033b2 = false;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(19);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = x3Var.f234295g;
        g0Var.d(14021, 5, java.lang.Integer.valueOf(activityC16764xd1ab6b38.T1));
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a g17 = bk0.a.g();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC;
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        if (g17.d(u3Var, u3Var2)) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(u3Var, u3Var2);
            x3Var.f234168d.setVisibility(8);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            j45.l.h(activityC16764xd1ab6b38.mo55332x76847179(), "collect", ".reward.ui.QrRewardMainUI");
            return;
        }
        pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
        b0Var = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC16764xd1ab6b38).f39904x9eeebfc;
        a3Var.f435499t.f(activityC16764xd1ab6b38, 4, b0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.v3(this), false, 1006, false);
        activityC16764xd1ab6b38.m83096xe7b1ccf7(new ys4.j(1, "reward"));
    }
}

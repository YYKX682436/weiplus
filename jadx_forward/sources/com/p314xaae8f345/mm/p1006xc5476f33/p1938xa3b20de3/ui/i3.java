package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class i3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.j3 f234182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.j3 j3Var) {
        super(false);
        this.f234182d = j3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click aa");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(16);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.j3 j3Var = this.f234182d;
        g0Var.d(14021, 3, java.lang.Integer.valueOf(j3Var.f234189g.T1));
        android.content.Intent intent = new android.content.Intent();
        int i17 = j3Var.f234189g.A1;
        if (i17 == 1) {
            intent.putExtra("enter_scene", 2);
        } else if (i17 == 2) {
            intent.putExtra("enter_scene", 4);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %s", java.lang.Integer.valueOf(i17));
        }
        j45.l.j(j3Var.f234189g.mo55332x76847179(), "aa", ".ui.AAEntranceUI", intent, null);
        j3Var.f234189g.f234033b2 = false;
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a g17 = bk0.a.g();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC;
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        if (g17.d(u3Var, u3Var2)) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().j(u3Var, u3Var2);
            j3Var.f234168d.setVisibility(8);
            g0Var.d(14396, 4);
        }
    }
}

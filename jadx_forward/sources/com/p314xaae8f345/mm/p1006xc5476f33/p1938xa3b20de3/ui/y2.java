package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class y2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234299e;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38, java.util.List list) {
        this.f234299e = activityC16764xd1ab6b38;
        this.f234298d = list;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234299e;
        if (activityC16764xd1ab6b38.H1 != null) {
            activityC16764xd1ab6b38.f234044h2 = null;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
            activityC16764xd1ab6b38.u7();
            final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f234298d.get(i17);
            if (c19091x9511676c.f69225xed6d60f6.equals(activityC16764xd1ab6b38.f234065s)) {
                activityC16764xd1ab6b38.H1.c();
            } else {
                activityC16764xd1ab6b38.b7(c19091x9511676c, true, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.offline.ui.y2$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b382 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.y2.this.f234299e;
                        activityC16764xd1ab6b382.H1.c();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = c19091x9511676c;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "click mmBottomSheet card：%s,status：%s", c19091x9511676c2.f69225xed6d60f6, java.lang.Integer.valueOf(c19091x9511676c2.f69232xff761ac5));
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.d(14515, 3);
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c2.f69240x24ff0512) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c2.f69239x93565523) || !c19091x9511676c2.f69260x2a326a79) {
                            g0Var.d(14515, 4);
                        }
                        if (c19091x9511676c2.z0()) {
                            activityC16764xd1ab6b382.E1 = false;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38.f7(3);
                        }
                    }
                });
            }
        }
    }
}

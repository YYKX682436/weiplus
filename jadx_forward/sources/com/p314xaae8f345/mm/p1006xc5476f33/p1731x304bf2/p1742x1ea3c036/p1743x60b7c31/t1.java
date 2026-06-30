package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class t1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "notifyAccountState";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        int optInt = e17.optInt("state", -1);
        if (!(1 <= optInt && optInt < 4)) {
            q5Var.a("state is invalid", null);
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameAccountManager", "gamelog.account, manage ,jsapi handleAccountStateChanged state = " + optInt);
        if (optInt == 1) {
            l33.c.a();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            l33.c.f396961a = 1;
        } else if (optInt == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o1 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
            Di.getClass();
            Di.m145253xb158737d("GameRawMessage", "update GameRawMessage set isHidden = 0 where isHidden = 2 and showType = 1");
            l33.c.f396961a = 0;
        } else if (optInt != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameAccountManager", "gamelog.account, manage , notify AccountStateChanged state = " + optInt);
        } else {
            l33.c.b();
            l33.c.f396961a = 0;
        }
        q5Var.a(null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}

package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f f290937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f290938e;

    public n5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f c5862x6c491c8f) {
        this.f290938e = c21357x5e7365bb;
        this.f290937d = c5862x6c491c8f;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f290938e;
        com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 c21370x5ce6d0c6 = (com.p314xaae8f345.mm.ui.C21370x5ce6d0c6) c21357x5e7365bb.f278189w.h("more_tab_game_recommend");
        if (c21370x5ce6d0c6 == null) {
            return;
        }
        if (c21357x5e7365bb.f278188v.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamemsg handleUpdateGameLife but in finder reddot.");
            return;
        }
        c21370x5ce6d0c6.h0();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.r().booleanValue()) {
            c21357x5e7365bb.q1(c21370x5ce6d0c6, 8, 8, 8, false, 8, 8, 8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamemsg handleUpdateGameLife but in silenceMode.");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f c5862x6c491c8f = this.f290937d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5862x6c491c8f.f136169g.f88016b);
        am.dp dpVar = c5862x6c491c8f.f136169g;
        if (!K0) {
            c21370x5ce6d0c6.d0(dpVar.f88016b, -1, android.graphics.Color.parseColor("#8c8c8c"));
        }
        c21370x5ce6d0c6.N();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dpVar.f88017c)) {
            c21357x5e7365bb.q1(c21370x5ce6d0c6, 8, 8, 0, false, 8, 8, 8);
        } else {
            c21370x5ce6d0c6.R(null);
            ng5.a.a(c21370x5ce6d0c6.S, dpVar.f88017c);
            c21357x5e7365bb.q1(c21370x5ce6d0c6, 8, 8, 0, false, 0, 0, 0);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_LIFE_REPORTED_MSG_ID_LONG;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) c17.m(u3Var, 0L)) != dpVar.f88019e) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(dpVar.f88019e));
            if (m33.a1.a() != null && c21357x5e7365bb.I) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, report, gamelife exposure | unreadcount:%d", java.lang.Integer.valueOf(dpVar.f88018d));
                int i17 = dpVar.f88018d;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                z53.j Ni = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ni();
                int i18 = Ni.f551787d;
                try {
                    jSONObject = new org.json.JSONObject(Ni.f551786c);
                    try {
                        jSONObject.put("chatmsg_num", java.lang.String.valueOf(i17));
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        jSONObject2 = jSONObject;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameDelegateImpl", e, "", new java.lang.Object[0]);
                        jSONObject = jSONObject2;
                        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 9, 901, 1, 1, 0, null, 0, i18, null, null, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(4), jSONObject.toString(), null));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamelife complete | unreadcount:%d ｜title:%s", java.lang.Integer.valueOf(dpVar.f88018d), dpVar.f88016b);
                        c21357x5e7365bb.G = true;
                        c21357x5e7365bb.f278181J = dpVar.f88018d;
                    }
                } catch (org.json.JSONException e18) {
                    e = e18;
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 9, 901, 1, 1, 0, null, 0, i18, null, null, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(4), jSONObject.toString(), null));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamelife complete | unreadcount:%d ｜title:%s", java.lang.Integer.valueOf(dpVar.f88018d), dpVar.f88016b);
        c21357x5e7365bb.G = true;
        c21357x5e7365bb.f278181J = dpVar.f88018d;
    }
}

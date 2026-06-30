package com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29;

/* loaded from: classes12.dex */
public class q implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.i) {
            gm0.j1.d().q(1947, com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253346b);
            if (i17 == 0 && i18 == 0) {
                r45.n87 n87Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.i) m1Var).f253325f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.SportConfigLogic", "onSceneEnd config=%s", n87Var.f462711d);
                java.lang.String str2 = n87Var.f462711d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c = new org.json.JSONObject(str2);
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.f253347c = null;
                    }
                }
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().put("checkWeSportInstall", com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e() ? 1 : 0);
                } catch (java.lang.Exception unused2) {
                }
                java.lang.String jSONObject = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.t.c().toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.z.f253359a.e("KEY_LAST_REQUEST_CONFIG_STRING", jSONObject);
                ((ue4.r) i95.n0.c(ue4.r.class)).wi().c(jSONObject);
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.p(this));
            }
        }
    }
}

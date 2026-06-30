package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes8.dex */
public class c0 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e
    public r45.js5 a() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_PLAN_INDEX_CACHE_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return (r45.m85) new r45.m85().mo11468x92b714fd(str.getBytes(s46.a.f484534a));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CgiPlanIndexAsyncLoader", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e
    public void b(com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiPlanIndexAsyncLoader", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152149b), java.lang.Integer.valueOf(fVar.f152148a));
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (((r45.m85) fVar2).f461771d == 0) {
                try {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_PLAN_INDEX_CACHE_STRING_SYNC, new java.lang.String(((r45.m85) fVar2).mo14344x5f01b1f6(), s46.a.f484534a));
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CgiPlanIndexAsyncLoader", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }
}

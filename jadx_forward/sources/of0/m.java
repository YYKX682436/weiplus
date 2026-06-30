package of0;

/* loaded from: classes8.dex */
public class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        wm4.n nVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5636xb8854922 c5636xb8854922 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5636xb8854922) abstractC20979x809547d1;
        am.gh ghVar = c5636xb8854922.f135964g;
        if (ghVar == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HaoKanActionEventIListener", "recv HaoKanActionEvent, serverData:%s, clientData:%s", ghVar.f88295a, ghVar.f88296b);
        am.gh ghVar2 = c5636xb8854922.f135964g;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ghVar2.f88295a) && (nVar = ((wm4.p) i95.n0.c(wm4.p.class)).f528833g) != null) {
            java.lang.String str = ghVar2.f88295a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.u) nVar).f256617a;
            if (jVar.E) {
                if (pm4.w.n(jVar.h() != null ? jVar.h().f528851b : 0)) {
                    long j17 = jVar.F;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("params", str);
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onWebRecommendInfoUpdate json exception: " + e17.getMessage());
                    }
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ri(j17, "onWebRecommendInfoUpdate", jSONObject);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.l lVar = jVar.f256526m;
            if (lVar != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("params", str);
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebRecommendInfoUpdate json exception: " + e18.getMessage());
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.n(lVar, jSONObject2.toString()));
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ghVar2.f88296b)) {
            try {
                cl0.g gVar = new cl0.g(ghVar2.f88296b);
                java.lang.String mo15074x2fec8307 = gVar.mo15074x2fec8307("action");
                cl0.g a17 = gVar.a("params");
                if (mo15074x2fec8307.equals("updateNumReddot")) {
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().k(a17.mo15082x48bce8a4("msgId"), a17.mo15072xb58848b9("latestTimeStamp"), true, a17.mo15072xb58848b9(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb), true);
                } else if (mo15074x2fec8307.equals("openProfile")) {
                    java.lang.String mo15074x2fec83072 = a17.mo15074x2fec8307("openId");
                    android.content.Context wi6 = ((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi();
                    o11.g gVar2 = wm4.u.f528842a;
                    sm4.d dVar = new sm4.d(mo15074x2fec83072);
                    gm0.j1.d().a(2830, new wm4.w(dVar, wi6));
                    gm0.j1.d().g(dVar);
                } else if (mo15074x2fec8307.equals("openWowColikeSetting")) {
                    wm4.u.t(((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi(), "normal");
                }
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HaoKanActionEventIListener", "HaoKanActionEvent error");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HaoKanActionEventIListener", e19, "", new java.lang.Object[0]);
            }
        }
        return true;
    }
}

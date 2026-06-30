package u93;

/* loaded from: classes.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int optInt = jSONObject != null ? jSONObject.optInt("count") : 8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLoadMoreGamePluginMessages", "invoke loadMoreGamePluginMessages count: %d", java.lang.Integer.valueOf(optInt));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        java.util.List z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().z1("gh_25d9ac85a4bc", r53.f.f474191f, optInt);
        if (z18 == null || z18.isEmpty()) {
            this.f224975e.b("no more message");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < z18.size(); i17++) {
            if (i17 == z18.size() - 1) {
                m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
                long mo78012x3fdd41df = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) z18.get(i17)).mo78012x3fdd41df();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) l1Var).getClass();
                r53.f.f474191f = mo78012x3fdd41df;
            }
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).ij((com.p314xaae8f345.mm.p2621x8fb0427b.f9) z18.get(i17)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLoadMoreGamePluginMessages", "loadMoreGamePluginMessages getMsgcount: %d return arr: %d", java.lang.Integer.valueOf(z18.size()), java.lang.Integer.valueOf(arrayList.size()));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("messageContent", new org.json.JSONArray((java.util.Collection) arrayList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLoadMoreGamePluginMessages", "messageContent:%s", hashMap.toString());
        this.f224975e.e(hashMap);
    }
}

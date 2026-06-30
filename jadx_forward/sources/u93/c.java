package u93;

/* loaded from: classes.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ai(c(), c01.z1.j());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetGameCenterEntranceState", "getGameCenterEntranceState is closed:" + Ai);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("open", java.lang.Boolean.valueOf(Ai ^ true));
        this.f224975e.e(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}

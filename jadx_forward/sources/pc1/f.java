package pc1;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76396x366c91de = 223;

    /* renamed from: NAME */
    private static final java.lang.String f76397x24728b = "getBeacons";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        pc1.d dVar = (pc1.d) ((java.util.concurrent.ConcurrentHashMap) pc1.e.f434881a).get(lVar.mo48798x74292566());
        if (dVar != null) {
            java.util.Map map = dVar.f434874b;
            java.util.Objects.toString(map);
            if (map != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
                if (concurrentHashMap.size() > 0) {
                    java.util.Iterator it = concurrentHashMap.values().iterator();
                    while (it.hasNext()) {
                        jSONArray.put((org.json.JSONObject) it.next());
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBeacons", "not found device");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("beacons", jSONArray);
        lVar.a(i17, p("ok", hashMap));
    }
}

package pc1;

/* loaded from: classes7.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76406x366c91de = 222;

    /* renamed from: NAME */
    private static final java.lang.String f76407x24728b = "stopBeaconDiscovery";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStopBeaconDiscovery", "stopBeaconDiscovery!");
        pc1.d dVar = (pc1.d) ((java.util.concurrent.ConcurrentHashMap) pc1.e.f434881a).get(lVar.mo48798x74292566());
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStopBeaconDiscovery", "beaconWorker is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 11004);
            lVar.a(i17, p("fail:not start", hashMap));
            return;
        }
        if (dVar.a()) {
            pc1.e.a(lVar.mo48798x74292566());
            new java.util.HashMap().put("errCode", 0);
            lVar.a(i17, o("ok"));
        } else {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", 11004);
            lVar.a(i17, p("fail:not start", hashMap2));
        }
        pc1.m mVar = new pc1.m(null);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("available", pc1.e.f434883c);
            jSONObject2.put("discovering", false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStopBeaconDiscovery", "put JSON data error : %s", e17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStopBeaconDiscovery", "OnBeaconServiceChangedEvent %s", jSONObject2.toString());
        int mo50260x9f1221c2 = lVar.mo50260x9f1221c2();
        mVar.p(lVar);
        mVar.f163909h = mo50260x9f1221c2;
        mVar.f163907f = jSONObject2.toString();
        mVar.m();
    }
}

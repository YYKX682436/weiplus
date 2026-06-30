package r53;

/* loaded from: classes8.dex */
public class l implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718 c15897x3884718 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718) obj;
        if (c15897x3884718 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("timeStamp", c15897x3884718.f221385d);
                jSONObject.put("cgiReponseStr", c15897x3884718.f221388g);
                jSONObject.put("cgiCostTimeMs", c15897x3884718.f221386e);
                jSONObject.put("isRequestFail", c15897x3884718.f221387f);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterUtil", e17.getMessage());
            }
            r53.f.f474190e.put("__gameIndexPreloadData__", jSONObject.toString());
        }
    }
}

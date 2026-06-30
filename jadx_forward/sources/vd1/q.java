package vd1;

/* loaded from: classes.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f77294x366c91de = 64;

    /* renamed from: NAME */
    private static final java.lang.String f77295x24728b = "reportIDKey";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("dataArray");
        if (optJSONArray == null) {
            lVar.a(i17, o("fail"));
            return;
        }
        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
            try {
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(jSONObject2.optInt(dm.i4.f66865x76d1ec5a), jSONObject2.optInt("key"), jSONObject2.optInt("value"), false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportIDKey", "parse json failed : %s", e17.getMessage());
            }
        }
        lVar.a(i17, o("ok"));
    }
}

package tc1;

/* loaded from: classes7.dex */
public class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76802x366c91de = 423;

    /* renamed from: NAME */
    private static final java.lang.String f76803x24728b = "sendRedPacket";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendRedPacket", "data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", -1);
            c0Var.a(i17, p("fail:system error {{data is null}}", hashMap));
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scope");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            new tc1.c(this, c0Var, c0Var.W0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.class), jSONObject, i17).d();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendRedPacket", "scope is nil");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("errCode", -1);
        c0Var.a(i17, p("fail:system error {{scope is nil}}", hashMap2));
    }
}

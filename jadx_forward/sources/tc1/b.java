package tc1;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76800x366c91de = 424;

    /* renamed from: NAME */
    private static final java.lang.String f76801x24728b = "openRedPacket";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRedPacket", "data is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", -1);
            e9Var.a(i17, p("fail:system error {{data is null}}", hashMap));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.optString("redPacketId", null))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRedPacket", "redPacketId is nil");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("errCode", -1);
            e9Var.a(i17, p("fail:system error {{redPacketId is nil}}", hashMap2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 != null) {
            ce.g gVar = (ce.g) V0.B1(ce.g.class);
            if (gVar != null) {
                ((ce.o) gVar).V(true, true, null);
            }
            new tc1.a(this, e9Var, V0, jSONObject, i17).d();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRedPacket", "associated page view is null!!");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("errCode", -1);
        e9Var.a(i17, p("fail:system error {{associated page view is null}}", hashMap3));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}

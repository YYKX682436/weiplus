package cb1;

/* loaded from: classes4.dex */
public class m0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4273x366c91de = 204;

    /* renamed from: NAME */
    public static final java.lang.String f4274x24728b = "getUserAutoFillData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData data is invalid");
            v5Var.a(i17, o("fail:data is invalid"));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("fields");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                linkedList.add(optJSONArray.optString(i18));
            }
        }
        if (linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData fields is empty");
            v5Var.a(i17, o("fail:fields is empty"));
            return;
        }
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        int optInt = jSONObject.optInt("clientVersion", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetUserAutoFillData", "getUserAutoFillData appId:%s, clientVersion:%s data:%s", mo48798x74292566, java.lang.Integer.valueOf(optInt), jSONObject.toString());
        r45.fq3 fq3Var = new r45.fq3();
        fq3Var.f456080f = linkedList;
        fq3Var.f456078d = mo48798x74292566;
        fq3Var.f456079e = jSONObject.optBoolean("getAllInfo", false);
        fq3Var.f456081g = 1;
        fq3Var.f456082h = optInt;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) v5Var.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo", mo48798x74292566, fq3Var, r45.gq3.class).n(new cb1.l0(this, v5Var, i17));
    }
}

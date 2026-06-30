package cb1;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4267x366c91de = 206;

    /* renamed from: NAME */
    public static final java.lang.String f4268x24728b = "deleteUserAutoFillData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData data is invalid");
            v5Var.a(i17, o("fail:data is invalid"));
            return;
        }
        java.lang.String optString = jSONObject.optString("groupKey");
        int optInt = jSONObject.optInt("groupId", 0);
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData groupKey is invalid");
            v5Var.a(i17, o("fail:groupKey is invalid"));
            return;
        }
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        int optInt2 = jSONObject.optInt("clientVersion", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDeleteUserAutoFillData", "deleteUserAutoFillData appId:%s, clientVersion:%s, groupId:%d, groupKey:%s", mo48798x74292566, java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt), optString);
        r45.nd0 nd0Var = new r45.nd0();
        nd0Var.f462790e = optString;
        nd0Var.f462789d = mo48798x74292566;
        nd0Var.f462791f = optInt;
        nd0Var.f462792g = 1;
        nd0Var.f462794i = optInt2;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) v5Var.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo", mo48798x74292566, nd0Var, r45.od0.class).n(new cb1.f(this, v5Var, i17));
    }
}

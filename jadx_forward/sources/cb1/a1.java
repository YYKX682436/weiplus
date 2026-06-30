package cb1;

/* loaded from: classes7.dex */
public class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4265x366c91de = 205;

    /* renamed from: NAME */
    public static final java.lang.String f4266x24728b = "setUserAutoFillData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData data is invalid");
            v5Var.a(i17, o("fail:data is invalid"));
            return;
        }
        java.lang.String optString = jSONObject.optString("dataList");
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        int optInt = jSONObject.optInt("clientVersion", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetUserAutoFillData", "setUserAutoFillData appId:%s, clientVersion:%s, dataList:%s", mo48798x74292566, java.lang.Integer.valueOf(optInt), optString);
        r45.ou5 ou5Var = new r45.ou5();
        ou5Var.f464062d = mo48798x74292566;
        ou5Var.f464063e = optString;
        ou5Var.f464064f = 1;
        ou5Var.f464065g = optInt;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) v5Var.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo", mo48798x74292566, ou5Var, r45.pu5.class).n(new cb1.z0(this, v5Var, i17));
    }
}

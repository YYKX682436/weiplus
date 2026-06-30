package cb1;

/* loaded from: classes4.dex */
public class y0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4277x366c91de = 208;

    /* renamed from: NAME */
    public static final java.lang.String f4278x24728b = "requestAuthUserAutoFillData";

    /* renamed from: g, reason: collision with root package name */
    public cb1.k1 f121869g;

    public static void C(cb1.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, r45.yb ybVar) {
        y0Var.getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) v5Var.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/autofill/authinfo", v5Var.mo48798x74292566(), ybVar, r45.zb.class).n(new cb1.x0(y0Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData data is invalid");
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
        java.lang.String optString = jSONObject.optString("wording");
        int optInt = jSONObject.optInt("authStatus", 2);
        int optInt2 = jSONObject.optInt("clientVersion", 0);
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData appId:%s, clientVersion:%s", mo48798x74292566, java.lang.Integer.valueOf(optInt2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData wording:%s, authStatus:%d, fieldIds:%s", optString, java.lang.Integer.valueOf(optInt), optJSONArray);
        r45.yb ybVar = new r45.yb();
        ybVar.f472473e = linkedList;
        ybVar.f472472d = mo48798x74292566;
        ybVar.f472475g = optInt;
        ybVar.f472477i = optInt2;
        if (optInt2 == 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new cb1.p0(this, v5Var, i17, ybVar, optString));
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("authGroupList");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                linkedList2.add("  " + optJSONArray2.optString(i19));
            }
        }
        if (linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData fields is empty");
            v5Var.a(i17, o("fail:fields is empty"));
        } else if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData wording is empty");
            v5Var.a(i17, o("fail:wording is empty"));
        } else {
            if (jSONObject.optJSONArray("authGroupList") != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "authGroupList:%s", jSONObject.optJSONArray("authGroupList").toString());
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new cb1.q0(this, v5Var, i17, ybVar, optInt, optString, linkedList2));
        }
    }
}

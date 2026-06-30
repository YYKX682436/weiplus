package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class je extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34374x366c91de = 626;

    /* renamed from: NAME */
    public static final java.lang.String f34375x24728b = "showImageOperateSheet";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) lVar;
        try {
            java.lang.String string = jSONObject.getString("imageUrl");
            java.lang.String string2 = jSONObject.getString("imageBase64");
            int c17 = ik1.w.c(jSONObject.getInt("elementLeft"));
            int c18 = ik1.w.c(jSONObject.getInt("elementTop"));
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.md(n7Var, string, string2, new android.graphics.Rect(c17, c18, ik1.w.c(jSONObject.getInt("elementWidth")) + c17, ik1.w.c(jSONObject.getInt("elementHeight")) + c18)).d();
            n7Var.a(i17, o("ok"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowImageOperateSheet", "fail exp:%s", e17.getLocalizedMessage());
            n7Var.a(i17, o("fail invalid params"));
        }
    }
}

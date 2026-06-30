package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes.dex */
public class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33758x366c91de = 657;

    /* renamed from: NAME */
    public static final java.lang.String f33759x24728b = "cancelDownloadTaskForNative";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("downloadIdArray");
        if (optJSONArray != null && optJSONArray.length() != 0) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11963x3e526e83(optJSONArray, this, e9Var, i17).d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCancelDownloadTaskForNative", "doCancelDownloadTask fail, invalid downloadIdArray");
            e9Var.a(i17, o("fail"));
        }
    }
}

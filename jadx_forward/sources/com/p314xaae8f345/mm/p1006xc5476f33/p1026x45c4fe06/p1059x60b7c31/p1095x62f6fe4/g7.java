package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes15.dex */
public class g7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34481x366c91de = 194;

    /* renamed from: NAME */
    public static final java.lang.String f34482x24728b = "uploadEncryptedFileToCDN";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  pageContext is null");
            lVar.a(i17, o("fail"));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        java.lang.String optString = jSONObject.optString("tempFilePath");
        boolean optBoolean = jSONObject.optBoolean("isShowProgressTips", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "JsApiUploadEncryptedFileToCDN appId:%s, data:%s", mo48798x74292566, jSONObject.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath is null");
            lVar.a(i17, o("fail:tempFilePath is null"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.d(mo48798x74292566, optString);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath file is not exist");
            lVar.a(i17, o("fail:file doesn't exist"));
            return;
        }
        if (android.text.TextUtils.isEmpty(d17.f157636e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail, fileFullPath is null");
            lVar.a(i17, o("fail:fileFullPath is null"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433 c12168x62e4d433 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433();
        c12168x62e4d433.f163205f = mo48798x74292566;
        c12168x62e4d433.f163206g = optString;
        c12168x62e4d433.f163207h = optBoolean;
        c12168x62e4d433.f163217u = (android.app.Activity) mo50352x76847179;
        c12168x62e4d433.f163218v = lVar;
        c12168x62e4d433.f163215s = d17.f157637f;
        c12168x62e4d433.f163216t = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u6(this, c12168x62e4d433, lVar, i17);
        if (com.p314xaae8f345.mm.p971x6de15a2e.y2.a(mo50352x76847179)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "wifi network available, do not show the gprs confirm dialog");
            c12168x62e4d433.d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "2G/3G/4G network available, do upload in mobile network and show the gprs confirm tips dialog");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x6(this, d17, mo50352x76847179, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0((int) com.p314xaae8f345.mm.vfs.w6.k(d17.f157636e)), c12168x62e4d433, lVar, i17));
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class y2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f35018x366c91de = 428;

    /* renamed from: NAME */
    private static final java.lang.String f35019x24728b = "addNativeDownloadTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddNativeDownloadTask", "data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("taskName");
        java.lang.String optString2 = jSONObject.optString("taskUrl");
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(jSONObject.optString("taskSize"), 0L);
        java.lang.String optString3 = jSONObject.optString("fileMD5");
        java.lang.String optString4 = jSONObject.optString("thumbUrl");
        java.lang.String optString5 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        android.content.Context mo50352x76847179 = e9Var.mo50352x76847179();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "taskUrl : %s, taskSize : %s, fileMD5:[%s], title : %s, thumbUrl : %s", optString2, java.lang.Long.valueOf(V), optString3, optString5, optString4);
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(mo50352x76847179)) {
            e9Var.a(i17, o("fail:fail network not connected"));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t2(this, mo50352x76847179));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "fail, network not ready");
            return;
        }
        if (!fp.i.b()) {
            e9Var.a(i17, o("fail:fail sdcard not ready"));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u2(this, mo50352x76847179));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "fail, sdcard not ready");
            return;
        }
        if (V > 0 && !fp.i.c(V)) {
            e9Var.a(i17, o("fail:fail sdcard has not enough space"));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v2(this, mo50352x76847179));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "fail, not enough space, require size = " + V);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddNativeDownloadTask", "doAddDownloadTask fail, url is null");
            e9Var.a(i17, o("fail:taskUrl is null or nil"));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("task_name", optString);
        intent.putExtra("task_url", optString2);
        intent.putExtra("task_size", V);
        intent.putExtra("file_md5", optString3);
        intent.putExtra("appid", e9Var.mo48798x74292566());
        intent.putExtra("thumb_url", optString4);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, optString5);
        intent.putExtra("app_developer", jSONObject.optString("developer"));
        intent.putExtra("app_version", jSONObject.optString("app_version"));
        intent.putExtra("app_desc", jSONObject.optString("app_desc"));
        intent.putExtra("app_privacy_url", jSONObject.optString("privacy_agreement_url"));
        intent.putExtra("app_permission_url", jSONObject.optString("permission_url"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 != null) {
            intent.putExtra("page_url", V0.X1());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddNativeDownloadTask", "getCurrentPageView is null");
        }
        intent.putExtra("page_scene", 1);
        j45.l.j(mo50352x76847179, "webview", ".ui.tools.WebViewDownloadUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11913xec00efba c11913xec00efba = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11913xec00efba();
        c11913xec00efba.f160027i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w2(this, c11913xec00efba, e9Var, i17);
        c11913xec00efba.d();
    }
}

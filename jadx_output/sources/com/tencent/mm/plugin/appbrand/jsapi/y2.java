package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class y2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 428;
    private static final java.lang.String NAME = "addNativeDownloadTask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddNativeDownloadTask", "data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("taskName");
        java.lang.String optString2 = jSONObject.optString("taskUrl");
        long V = com.tencent.mm.sdk.platformtools.t8.V(jSONObject.optString("taskSize"), 0L);
        java.lang.String optString3 = jSONObject.optString("fileMD5");
        java.lang.String optString4 = jSONObject.optString("thumbUrl");
        java.lang.String optString5 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        android.content.Context context = e9Var.getContext();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "taskUrl : %s, taskSize : %s, fileMD5:[%s], title : %s, thumbUrl : %s", optString2, java.lang.Long.valueOf(V), optString3, optString5, optString4);
        if (!com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(context)) {
            e9Var.a(i17, o("fail:fail network not connected"));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.t2(this, context));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "fail, network not ready");
            return;
        }
        if (!fp.i.b()) {
            e9Var.a(i17, o("fail:fail sdcard not ready"));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.u2(this, context));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "fail, sdcard not ready");
            return;
        }
        if (V > 0 && !fp.i.c(V)) {
            e9Var.a(i17, o("fail:fail sdcard has not enough space"));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.v2(this, context));
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddNativeDownloadTask", "fail, not enough space, require size = " + V);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddNativeDownloadTask", "doAddDownloadTask fail, url is null");
            e9Var.a(i17, o("fail:taskUrl is null or nil"));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("task_name", optString);
        intent.putExtra("task_url", optString2);
        intent.putExtra("task_size", V);
        intent.putExtra("file_md5", optString3);
        intent.putExtra("appid", e9Var.getAppId());
        intent.putExtra("thumb_url", optString4);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, optString5);
        intent.putExtra("app_developer", jSONObject.optString("developer"));
        intent.putExtra("app_version", jSONObject.optString("app_version"));
        intent.putExtra("app_desc", jSONObject.optString("app_desc"));
        intent.putExtra("app_privacy_url", jSONObject.optString("privacy_agreement_url"));
        intent.putExtra("app_permission_url", jSONObject.optString("permission_url"));
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 != null) {
            intent.putExtra("page_url", V0.X1());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddNativeDownloadTask", "getCurrentPageView is null");
        }
        intent.putExtra("page_scene", 1);
        j45.l.j(context, "webview", ".ui.tools.WebViewDownloadUI", intent, null);
        com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask = new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddNativeDownloadTask$AddNativeDownloadTaskTask();
        jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.f78494i = new com.tencent.mm.plugin.appbrand.jsapi.w2(this, jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask, e9Var, i17);
        jsApiAddNativeDownloadTask$AddNativeDownloadTaskTask.d();
    }
}

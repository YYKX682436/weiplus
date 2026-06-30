package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class j2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 958;
    private static final java.lang.String NAME = "addFileToFavorites";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.vfs.r6 absoluteFile;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, env is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        java.lang.String str3 = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, activity is null");
            lVar.a(i17, o("fail:activity is null"));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath is empty");
            lVar.a(i17, o("fail:filePath is empty"));
            return;
        }
        kotlin.jvm.internal.o.d(optString);
        java.lang.String c17 = r26.i0.y(optString, "wxfile://", false) ? s46.c.c(optString) : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath: " + optString + ", fileExt: " + c17);
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = lVar.getFileSystem();
        if (fileSystem != null && (absoluteFile = fileSystem.getAbsoluteFile(optString)) != null) {
            str3 = absoluteFile.o();
        }
        if (str3 == null || str3.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, filePath is illegal");
            lVar.a(i17, o("fail:filePath is illegal"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, realFilePath: " + str3);
        java.lang.Object opt = jSONObject.opt(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
        if (opt instanceof java.lang.String) {
            str2 = (java.lang.String) opt;
            str = c17;
        } else {
            str = c17;
            int O = r26.n0.O(optString, '/', 0, false, 6, null);
            if (O == -1) {
                str2 = optString;
            } else {
                java.lang.String substring = optString.substring(O + 1);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                str2 = substring;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "invoke, fileName: " + str2);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.jsapi.i2(this, activity, str3, str, str2, lVar, i17));
    }
}

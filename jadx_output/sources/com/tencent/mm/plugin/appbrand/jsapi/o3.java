package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class o3 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 959;
    private static final java.lang.String NAME = "addVideoToFavorites";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.vfs.r6 absoluteFile;
        com.tencent.mm.vfs.r6 absoluteFile2;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, env is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        java.lang.String str = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, activity is null");
            lVar.a(i17, o("fail:activity is null"));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("videoPath");
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath is empty");
            lVar.a(i17, o("fail:videoPath is empty"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath: " + optString);
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = lVar.getFileSystem();
        java.lang.String o17 = (fileSystem == null || (absoluteFile2 = fileSystem.getAbsoluteFile(optString)) == null) ? null : absoluteFile2.o();
        if (o17 == null || o17.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, videoPath is illegal");
            lVar.a(i17, o("fail:videoPath is illegal"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, realVideoPath: " + o17);
        java.lang.String optString2 = jSONObject.optString("thumbPath");
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem2 = lVar.getFileSystem();
        if (fileSystem2 != null && (absoluteFile = fileSystem2.getAbsoluteFile(optString2)) != null) {
            str = absoluteFile.o();
        }
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "invoke, thumbPath: " + optString2 + ", realThumbPath: " + str2);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.jsapi.n3(this, activity, o17, str2, lVar, i17));
    }
}

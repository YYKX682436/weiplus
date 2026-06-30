package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class le extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1534;
    public static final java.lang.String NAME = "startCircleToSearch";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem;
        com.tencent.mm.vfs.r6 absoluteFile;
        java.lang.String o17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartCircleToSearch", "[startCircleToSearch] data = " + jSONObject);
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (jSONObject.has("imageLocalId")) {
            java.lang.Object obj = jSONObject.get("imageLocalId");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null && lVar != null && (fileSystem = lVar.getFileSystem()) != null && (absoluteFile = fileSystem.getAbsoluteFile(str)) != null && (o17 = absoluteFile.o()) != null) {
                jSONObject.put("imgPath", o17);
            }
        }
        new com.tencent.mm.plugin.appbrand.jsapi.JsApiStartCircleToSearch$StartCircleToSearchTask(jSONObject).d();
        if (lVar != null) {
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
        }
    }
}

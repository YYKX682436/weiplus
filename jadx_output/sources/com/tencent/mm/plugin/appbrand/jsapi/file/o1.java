package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class o1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 778;
    private static final java.lang.String NAME = "private_fileSystemConvert";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: %s %s", NAME, jSONObject.toString());
        java.lang.String optString = jSONObject.optString("operationType", "");
        if (optString.equalsIgnoreCase("getAbsolutePath")) {
            java.lang.String optString2 = jSONObject.optString(dm.i4.COL_LOCALID);
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                lVar.a(i17, o(java.lang.String.format("fail: parmas error %s", jSONObject.toString())));
                return;
            }
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, optString2);
                if (optString2.contains("wxfile://")) {
                    com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(optString2);
                    if (absoluteFile == null) {
                        lVar.a(i17, o("fail:file doesn't exist"));
                        lVar.a(i17, o(java.lang.String.format("fail: %s not exists", optString2)));
                        return;
                    }
                    jSONObject2.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, absoluteFile.o());
                }
                lVar.a(i17, jSONObject2.toString());
                return;
            } catch (org.json.JSONException e17) {
                lVar.a(i17, o(java.lang.String.format("fail: error %s", e17.getMessage())));
                return;
            }
        }
        if (!optString.equalsIgnoreCase("getWxFilePath")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: invalid operate type: %s", optString);
            lVar.a(i17, o(java.lang.String.format("fail: not valid operate type: %s", optString)));
            return;
        }
        try {
            java.lang.String optString3 = jSONObject.optString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
                optString3 = "private_fileSystemConvert_" + java.lang.System.currentTimeMillis();
            }
            java.lang.String optString4 = jSONObject.optString("mimeType");
            boolean optBoolean = jSONObject.optBoolean("autoDeleteIfExists", true);
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
                lVar.a(i17, o(java.lang.String.format("fail: parmas error %s", jSONObject.toString())));
                return;
            }
            java.lang.String str = optString3 + "." + optString4;
            java.lang.String C = C(lVar, str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(C)) {
                lVar.a(i17, o("fail: getAbsoluteFile failed"));
                return;
            }
            if (optBoolean && com.tencent.mm.vfs.w6.j(C)) {
                com.tencent.mm.vfs.w6.h(C);
            }
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(C);
            com.tencent.mm.vfs.w6.u(r17);
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: getWxFilePath, fileName: %s, relativeFilePath: %s, relativeFileName: %s, parentAbsolutePath: %s!", optString3, str, C, r17);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, C);
            jSONObject3.put(dm.i4.COL_LOCALID, "wxfile://clientdata/" + str);
            lVar.a(i17, jSONObject3.toString());
        } catch (org.json.JSONException e18) {
            lVar.a(i17, o(java.lang.String.format("fail: error %s", e18.getMessage())));
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiPrivateFileSystem", e18, "hy: json error!", new java.lang.Object[0]);
        }
    }

    public final java.lang.String C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (lVar == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(lVar == null);
            objArr[1] = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: param error %b, %s", objArr);
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.l2 l2Var = (com.tencent.mm.plugin.appbrand.jsapi.file.l2) lVar.getFileSystem();
        if (l2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: fs is null");
            return null;
        }
        java.lang.String str2 = ((com.tencent.mm.plugin.appbrand.appstorage.j3) l2Var.a("wxfile://clientdata")).f76225d;
        if (!str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2 + ".nomedia");
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPrivateFileSystem", "hy: no nomedia file. trigger new");
            try {
                r6Var.k();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiPrivateFileSystem", e17, "hy: create no media file failed!", new java.lang.Object[0]);
            }
        }
        return str2 + str;
    }
}

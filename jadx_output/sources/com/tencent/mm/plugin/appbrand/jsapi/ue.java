package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class ue extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "uploadToCommonCDN";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadToCommonCDN", "data is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadToCommonCDN", "JsApiUploadToCommonCDN data=" + jSONObject);
        int optInt = jSONObject.optInt("appType");
        int optInt2 = jSONObject.optInt("fileType");
        java.lang.String optString = jSONObject.optString("fileKey");
        java.lang.String optString2 = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        java.lang.Object opt = jSONObject.opt("fileData");
        java.nio.ByteBuffer byteBuffer = null;
        java.nio.ByteBuffer wrap = opt instanceof java.lang.String ? java.nio.ByteBuffer.wrap(((java.lang.String) opt).getBytes()) : opt instanceof java.nio.ByteBuffer ? (java.nio.ByteBuffer) opt : null;
        java.lang.String optString3 = jSONObject.optString("thumbFilePath");
        java.lang.Object opt2 = jSONObject.opt("thumbFileData");
        if (opt2 instanceof java.lang.String) {
            byteBuffer = java.nio.ByteBuffer.wrap(((java.lang.String) opt2).getBytes());
        } else if (opt2 instanceof java.nio.ByteBuffer) {
            byteBuffer = (java.nio.ByteBuffer) opt2;
        }
        java.nio.ByteBuffer byteBuffer2 = byteBuffer;
        boolean optBoolean = jSONObject.optBoolean("isStorageMode");
        int optInt3 = jSONObject.optInt("snsUploadVersion");
        java.lang.String optString4 = jSONObject.optString("action");
        if (android.text.TextUtils.isEmpty(optString2) && wrap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUploadToCommonCDN", "filePath and fileData invalid");
            e9Var.a(i17, o("fail:filePath and fileData invalid"));
            return;
        }
        if (!android.text.TextUtils.isEmpty(optString2)) {
            com.tencent.mm.vfs.r6 absoluteFile = e9Var.t3().getFileSystem().getAbsoluteFile(optString2);
            optString2 = absoluteFile == null ? "" : absoluteFile.o();
            if (optString2.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUploadToCommonCDN", "get full file path fail: ".concat(optString2));
                e9Var.a(i17, o("fail:get full file path fail"));
                return;
            }
        }
        if (!android.text.TextUtils.isEmpty(optString3)) {
            com.tencent.mm.vfs.r6 absoluteFile2 = e9Var.t3().getFileSystem().getAbsoluteFile(optString3);
            optString3 = absoluteFile2 == null ? "" : absoluteFile2.o();
            if (optString3.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUploadToCommonCDN", "get full thumb file path fail: " + optString2);
                e9Var.a(i17, o("fail:get full thumb file path fail"));
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(optString)) {
            optString = kk.k.g(optString2.getBytes());
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("appType", optInt);
        bundle.putInt("fileType", optInt2);
        bundle.putString("fileKey", optString);
        bundle.putString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, optString2);
        bundle.putBoolean("isCancel", optString4.equals("cancel"));
        if (wrap != null) {
            byte[] bArr = new byte[wrap.remaining()];
            wrap.get(bArr);
            jz5.l b17 = za1.b.f470878a.b(bArr);
            if (((java.lang.Boolean) b17.f302833d).booleanValue()) {
                bundle.putString("fileDataKey", (java.lang.String) b17.f302834e);
            } else {
                bundle.putByteArray("fileData", bArr);
            }
        }
        bundle.putString("thumbFilePath", optString3);
        if (byteBuffer2 != null) {
            byte[] bArr2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr2);
            jz5.l b18 = za1.b.f470878a.b(bArr2);
            if (((java.lang.Boolean) b18.f302833d).booleanValue()) {
                bundle.putString("thumbFileDataKey", (java.lang.String) b18.f302834e);
            } else {
                bundle.putByteArray("thumbFileData", bArr2);
            }
        }
        bundle.putBoolean("isStorageMode", optBoolean);
        bundle.putInt("snsUploadVersion", optInt3);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.appbrand.jsapi.te.class, new com.tencent.mm.plugin.appbrand.jsapi.re(this, e9Var, i17));
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class ue extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34910x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34911x24728b = "uploadToCommonCDN";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadToCommonCDN", "data is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadToCommonCDN", "JsApiUploadToCommonCDN data=" + jSONObject);
        int optInt = jSONObject.optInt("appType");
        int optInt2 = jSONObject.optInt("fileType");
        java.lang.String optString = jSONObject.optString("fileKey");
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUploadToCommonCDN", "filePath and fileData invalid");
            e9Var.a(i17, o("fail:filePath and fileData invalid"));
            return;
        }
        if (!android.text.TextUtils.isEmpty(optString2)) {
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = e9Var.t3().mo48802x59eafec1().mo49620x1d537609(optString2);
            optString2 = mo49620x1d537609 == null ? "" : mo49620x1d537609.o();
            if (optString2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUploadToCommonCDN", "get full file path fail: ".concat(optString2));
                e9Var.a(i17, o("fail:get full file path fail"));
                return;
            }
        }
        if (!android.text.TextUtils.isEmpty(optString3)) {
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d5376092 = e9Var.t3().mo48802x59eafec1().mo49620x1d537609(optString3);
            optString3 = mo49620x1d5376092 == null ? "" : mo49620x1d5376092.o();
            if (optString3.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUploadToCommonCDN", "get full thumb file path fail: " + optString2);
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
        bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, optString2);
        bundle.putBoolean("isCancel", optString4.equals("cancel"));
        if (wrap != null) {
            byte[] bArr = new byte[wrap.remaining()];
            wrap.get(bArr);
            jz5.l b17 = za1.b.f552411a.b(bArr);
            if (((java.lang.Boolean) b17.f384366d).booleanValue()) {
                bundle.putString("fileDataKey", (java.lang.String) b17.f384367e);
            } else {
                bundle.putByteArray("fileData", bArr);
            }
        }
        bundle.putString("thumbFilePath", optString3);
        if (byteBuffer2 != null) {
            byte[] bArr2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr2);
            jz5.l b18 = za1.b.f552411a.b(bArr2);
            if (((java.lang.Boolean) b18.f384366d).booleanValue()) {
                bundle.putString("thumbFileDataKey", (java.lang.String) b18.f384367e);
            } else {
                bundle.putByteArray("thumbFileData", bArr2);
            }
        }
        bundle.putBoolean("isStorageMode", optBoolean);
        bundle.putInt("snsUploadVersion", optInt3);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.te.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.re(this, e9Var, i17));
    }
}

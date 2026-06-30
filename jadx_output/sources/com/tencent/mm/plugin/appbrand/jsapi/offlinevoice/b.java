package com.tencent.mm.plugin.appbrand.jsapi.offlinevoice;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 634;
    public static final java.lang.String NAME = "setCurrentPaySpeech";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "invoke JsApiSetCurrentPaySpeech!");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:component is null");
            return;
        }
        if (lVar.getContext() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:context is null");
            lVar.a(i17, o("fail：service.getContext() is null "));
            return;
        }
        java.lang.String optString = jSONObject.optString("dialectPackId");
        java.lang.String optString2 = jSONObject.optString("tempFilePath");
        java.lang.String optString3 = jSONObject.optString("md5Sum");
        java.lang.String optString4 = jSONObject.optString("version");
        boolean optBoolean = jSONObject.optBoolean("isOnlyDownload");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            str = "";
        } else {
            com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(optString2);
            if (absoluteFile == null || !absoluteFile.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:tempFile no exist");
                lVar.a(i17, o("fail:tempFile no exist"));
                return;
            }
            str = absoluteFile.o();
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech.IPCSetCurrentPaySpeechParam(optString, optString2, str, optBoolean, optString3, optString4), com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech.class, new kd1.d(this, lVar, i17));
    }
}

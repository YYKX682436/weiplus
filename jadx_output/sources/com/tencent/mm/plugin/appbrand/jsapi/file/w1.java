package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class w1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 117;
    private static final java.lang.String NAME = "removeSavedFile";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        lVar.a(i17, o(com.tencent.mm.sdk.platformtools.t8.K0(optString) ? "fail:invalid data" : !lVar.getFileSystem().isSavedFile(optString) ? "fail not a store filePath" : lVar.getFileSystem().removeSavedFile(optString) ? "ok" : "fail"));
    }
}

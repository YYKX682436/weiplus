package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class n0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 116;
    private static final java.lang.String NAME = "getSavedFileInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            lVar.a(i17, o("fail:invalid data"));
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.file.l.f81089h.execute(new com.tencent.mm.plugin.appbrand.jsapi.file.m0(this, lVar, optString, i17));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}

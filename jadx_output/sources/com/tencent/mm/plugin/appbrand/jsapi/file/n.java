package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.k0 f81099a;

    static {
        java.util.Map map = com.tencent.mm.plugin.appbrand.jsapi.file.z.f81145a;
    }

    public final com.tencent.mm.plugin.appbrand.jsapi.file.b0 a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, org.json.JSONObject jSONObject) {
        java.lang.String c17 = c(jSONObject);
        return com.tencent.mm.sdk.platformtools.t8.K0(c17) ? new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail invalid path", new java.lang.Object[0]) : !lVar.c(this.f81099a.k(), c0Var) ? new com.tencent.mm.plugin.appbrand.jsapi.file.b0("fail:interrupted", new java.lang.Object[0]) : b(lVar, c17, jSONObject);
    }

    public abstract com.tencent.mm.plugin.appbrand.jsapi.file.b0 b(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, org.json.JSONObject jSONObject);

    public java.lang.String c(org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = jSONObject.optString("dirPath", null);
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(optString) ? jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, null) : optString;
    }
}

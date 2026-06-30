package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class u implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.v f80275c;

    public u(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.channels.v vVar) {
        this.f80273a = lVar;
        this.f80274b = i17;
        this.f80275c = vVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String u17;
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveNoticeResult openChannelsLiveNoticeResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveNoticeResult) appBrandProxyUIProcessTask$ProcessResult;
        if (openChannelsLiveNoticeResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLiveNoticeInfo", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        boolean z17 = openChannelsLiveNoticeResult.f80210d;
        com.tencent.mm.plugin.appbrand.jsapi.channels.v vVar = this.f80275c;
        if (z17) {
            java.util.HashMap i17 = kz5.c1.i(new jz5.l("state", java.lang.Integer.valueOf(openChannelsLiveNoticeResult.f80211e)));
            vVar.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            i17.put("errno", 0);
            u17 = vVar.t("ok", i17);
        } else {
            vVar.getClass();
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            u17 = vVar.u(str2, jSONObject);
        }
        this.f80273a.a(this.f80274b, u17);
    }
}

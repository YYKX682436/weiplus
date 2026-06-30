package com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.f f80255c;

    public e(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.f fVar) {
        this.f80253a = lVar;
        this.f80254b = i17;
        this.f80255c = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.JsApiOpenChannelsActivityMB$EnterChannelActivityResult jsApiOpenChannelsActivityMB$EnterChannelActivityResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.JsApiOpenChannelsActivityMB$EnterChannelActivityResult) appBrandProxyUIProcessTask$ProcessResult;
        if (jsApiOpenChannelsActivityMB$EnterChannelActivityResult == null) {
            com.tencent.mars.xlog.Log.w("JsApiOpenChannelsActivityMB", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult#IProcessResultReceiver, errCode: ");
        int i17 = jsApiOpenChannelsActivityMB$EnterChannelActivityResult.f80251d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("JsApiOpenChannelsActivityMB", sb6.toString());
        com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.f fVar = this.f80255c;
        int i18 = this.f80254b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80253a;
        if (i17 != 0) {
            lVar.a(i18, fVar.o("fail:errCode from finder:" + i17));
            return;
        }
        fVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i18, fVar.u(str, jSONObject));
    }
}

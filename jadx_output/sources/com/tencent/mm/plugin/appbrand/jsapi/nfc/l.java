package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class l implements com.tencent.mm.plugin.appbrand.jsapi.nfc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.m f82416d;

    public l(com.tencent.mm.plugin.appbrand.jsapi.nfc.m mVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f82416d = mVar;
        this.f82413a = lVar;
        this.f82414b = i17;
        this.f82415c = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.nfc.f
    public void onResult(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        int i18 = this.f82414b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82413a;
        com.tencent.mm.plugin.appbrand.jsapi.nfc.m mVar = this.f82416d;
        if (i17 != 0) {
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(mVar, i17, "fail: " + str, hashMap);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCSendHCEResponseCommand", "sendHCEMessage callback json: %s", a17);
            if (lVar != null) {
                lVar.a(i18, a17);
                return;
            }
            return;
        }
        mVar.getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String optString = this.f82415c.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_apdu_command", optString);
            com.tencent.mm.plugin.appbrand.jsapi.nfc.d.a(lVar.getAppId(), 32, bundle);
            hashMap2.put("errCode", 0);
            lVar.a(i18, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(mVar, 0, "ok", hashMap2));
            return;
        }
        hashMap2.put("errCode", 13005);
        java.lang.String a18 = com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(mVar, 13005, "fail", hashMap2);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCSendHCEResponseCommand", "sendHCEMessage callback json: %s", a18);
        if (lVar != null) {
            lVar.a(i18, a18);
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class s implements com.tencent.mm.plugin.appbrand.jsapi.nfc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.t f82435c;

    public s(com.tencent.mm.plugin.appbrand.jsapi.nfc.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82435c = tVar;
        this.f82433a = lVar;
        this.f82434b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.nfc.f
    public void onResult(int i17, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        int i18 = this.f82434b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82433a;
        com.tencent.mm.plugin.appbrand.jsapi.nfc.t tVar = this.f82435c;
        if (i17 != 0) {
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(tVar, i17, "fail: " + str, hashMap);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "stopHCE callback result: %s", a17);
            if (lVar != null) {
                lVar.a(i18, a17);
                return;
            }
            return;
        }
        tVar.getClass();
        java.lang.String appId = lVar.getAppId();
        if (appId != null) {
            com.tencent.mm.plugin.appbrand.x0.e(appId, com.tencent.mm.plugin.appbrand.jsapi.nfc.d.f82401c);
        }
        com.tencent.mm.plugin.appbrand.jsapi.nfc.d.a(lVar.getAppId(), 13, null);
        java.util.HashMap hashMap2 = new java.util.HashMap(2);
        hashMap2.put("errCode", 0);
        java.lang.String a18 = com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(tVar, 0, "ok", hashMap2);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNFCStartHCE", "stopHCE callback result: %s", a18);
        lVar.a(i18, a18);
    }
}

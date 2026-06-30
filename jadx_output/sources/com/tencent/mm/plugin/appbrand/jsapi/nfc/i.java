package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.plugin.appbrand.jsapi.nfc.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.nfc.j f82412c;

    public i(com.tencent.mm.plugin.appbrand.jsapi.nfc.j jVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f82412c = jVar;
        this.f82410a = lVar;
        this.f82411b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.nfc.f
    public void onResult(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetHCEState", "checkIsSupport onResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.jsapi.nfc.j jVar = this.f82412c;
        int i18 = this.f82411b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82410a;
        if (i17 == 0) {
            lVar.a(i18, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(jVar, i17, "ok", hashMap));
            return;
        }
        lVar.a(i18, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(jVar, i17, "fail " + str, hashMap));
    }
}

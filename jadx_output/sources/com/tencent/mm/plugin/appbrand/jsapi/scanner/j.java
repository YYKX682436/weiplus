package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes.dex */
public class j implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.scanner.k f82960c;

    public j(com.tencent.mm.plugin.appbrand.jsapi.scanner.k kVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f82960c = kVar;
        this.f82958a = e9Var;
        this.f82959b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.scanner.k.f82961g = false;
        if (i17 != (this.f82960c.hashCode() & 65535)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenQRCode", "onActivityResult requestCode:%d  resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i18 != 0) {
                this.f82958a.a(this.f82959b, this.f82960c.o("fail"));
            } else {
                this.f82958a.a(this.f82959b, this.f82960c.o("cancel"));
            }
        } else {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenQRCode", "data is null, err");
                this.f82958a.a(this.f82959b, this.f82960c.o("fail:unknown err"));
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String stringExtra = intent.getStringExtra("key_scan_result");
            java.lang.String stringExtra2 = intent.getStringExtra("key_scan_result_code_name");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("scan_type", com.tencent.mm.plugin.scanner.j1.c(stringExtra2) ? "qrcode" : "barcode");
                jSONObject.put("scan_result", stringExtra);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenQRCode", e17, "", new java.lang.Object[0]);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("scan_code", jSONObject);
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenQRCode", e18, "", new java.lang.Object[0]);
            }
            hashMap.put("resultStr", jSONObject2.toString());
            this.f82958a.a(this.f82959b, this.f82960c.p("ok", hashMap));
        }
        return true;
    }
}

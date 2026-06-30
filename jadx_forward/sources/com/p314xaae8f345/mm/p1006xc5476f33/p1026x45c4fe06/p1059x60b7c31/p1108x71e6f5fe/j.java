package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

/* loaded from: classes.dex */
public class j implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.k f164493c;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f164493c = kVar;
        this.f164491a = e9Var;
        this.f164492b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.k.f164494g = false;
        if (i17 != (this.f164493c.hashCode() & 65535)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenQRCode", "onActivityResult requestCode:%d  resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i18 != 0) {
                this.f164491a.a(this.f164492b, this.f164493c.o("fail"));
            } else {
                this.f164491a.a(this.f164492b, this.f164493c.o("cancel"));
            }
        } else {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenQRCode", "data is null, err");
                this.f164491a.a(this.f164492b, this.f164493c.o("fail:unknown err"));
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String stringExtra = intent.getStringExtra("key_scan_result");
            java.lang.String stringExtra2 = intent.getStringExtra("key_scan_result_code_name");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("scan_type", com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.c(stringExtra2) ? "qrcode" : "barcode");
                jSONObject.put("scan_result", stringExtra);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenQRCode", e17, "", new java.lang.Object[0]);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("scan_code", jSONObject);
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenQRCode", e18, "", new java.lang.Object[0]);
            }
            hashMap.put("resultStr", jSONObject2.toString());
            this.f164491a.a(this.f164492b, this.f164493c.p("ok", hashMap));
        }
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes.dex */
public class d0 implements l72.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f218657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 f218659c;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970 c15533x22cea970, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f218659c = c15533x22cea970;
        this.f218657a = jSONObject;
        this.f218658b = str;
    }

    @Override // l72.b0
    public void a(java.lang.String str) {
        org.json.JSONObject jSONObject = this.f218657a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970.f218621t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionProcessLayout", "click feedback url ");
        try {
            java.lang.String str2 = this.f218658b + "?customInfo=" + fp.s0.b(java.lang.String.format("appid=%s;errcode=%d;identifyid=%s", jSONObject.optString("key_app_id", ""), java.lang.Integer.valueOf(jSONObject.optInt("err_code", 0)), jSONObject.optString("verify_result", "")), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            j45.l.j(this.f218659c.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Exception e17) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.C15533x22cea970.f218621t;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "face start feedback webview exception", new java.lang.Object[0]);
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class x9 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f83913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.y9 f83916d;

    public x9(com.tencent.mm.plugin.appbrand.jsapi.y9 y9Var, boolean z17, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f83916d = y9Var;
        this.f83913a = z17;
        this.f83914b = e9Var;
        this.f83915c = i17;
    }

    @Override // nf.j
    public void onResult(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONArray jSONArray;
        org.json.JSONObject jSONObject;
        if (intent != null) {
            str2 = intent.getStringExtra("key_app_authorize_state");
            str = intent.getStringExtra("key_app_subscriptions_setting");
        } else {
            str = "";
            str2 = str;
        }
        try {
            jSONArray = new org.json.JSONArray(str2);
        } catch (org.json.JSONException unused) {
            jSONArray = new org.json.JSONArray();
        }
        boolean z17 = this.f83913a;
        if (z17) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException unused2) {
                jSONObject = new org.json.JSONObject();
            }
        } else {
            jSONObject = null;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errMsg", this.f83916d.k() + ":ok");
            jSONObject2.put("authSetting", jSONArray);
            if (z17) {
                jSONObject2.put("subscriptionsSetting", jSONObject);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenSetting", "set json error!");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenSetting", e17, "", new java.lang.Object[0]);
        }
        this.f83914b.a(this.f83915c, jSONObject2.toString());
    }
}

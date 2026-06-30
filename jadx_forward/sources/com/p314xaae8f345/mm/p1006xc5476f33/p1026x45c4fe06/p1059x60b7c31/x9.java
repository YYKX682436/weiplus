package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class x9 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f165446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f165447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165448c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y9 f165449d;

    public x9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y9 y9Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f165449d = y9Var;
        this.f165446a = z17;
        this.f165447b = e9Var;
        this.f165448c = i17;
    }

    @Override // nf.j
    /* renamed from: onResult */
    public void mo14598x57429edc(int i17, android.content.Intent intent) {
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
        boolean z17 = this.f165446a;
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
            jSONObject2.put("errMsg", this.f165449d.k() + ":ok");
            jSONObject2.put("authSetting", jSONArray);
            if (z17) {
                jSONObject2.put("subscriptionsSetting", jSONObject);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenSetting", "set json error!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenSetting", e17, "", new java.lang.Object[0]);
        }
        this.f165447b.a(this.f165448c, jSONObject2.toString());
    }
}

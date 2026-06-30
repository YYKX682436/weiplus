package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class sc extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.oc {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f268059c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f268060d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f268061e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f268062f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f268063g;

    public sc(java.lang.String str) {
        super(str);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f267949a = true;
            }
            org.json.JSONObject jSONObject = str != null ? new org.json.JSONObject(str) : null;
            if (jSONObject != null) {
                this.f268059c = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                this.f268060d = jSONObject.optString("link");
                this.f268061e = jSONObject.optString("desc");
                this.f268062f = jSONObject.optString("img_url");
                this.f268063g = jSONObject.optString("appId");
            }
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "FixedShareData: RuntimeException, e = " + e17.getMessage());
            this.f267950b = true;
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareCustomContent", "FixedShareData: JSONException, e = " + e18.getMessage());
            this.f267950b = true;
        }
    }

    public boolean a() {
        if (this.f267949a) {
            return (this.f267950b || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f268059c) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f268060d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f268062f)) ? false : true;
        }
        return true;
    }
}

package fg;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f343298a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f343299b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f343300c;

    /* renamed from: d, reason: collision with root package name */
    public final pl1.f f343301d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f343302e;

    public i(java.lang.String json) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        this.f343298a = "";
        this.f343301d = new pl1.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextAreaInfo", "totalInfo:".concat(json));
        try {
            jSONObject = new org.json.JSONObject(json);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo convert to json error");
            jSONObject = new org.json.JSONObject();
        }
        try {
            if (jSONObject.has("element-tag")) {
                jSONObject.getString("element-tag");
            }
        } catch (org.json.JSONException unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add elementTag error");
        }
        try {
            if (jSONObject.has("keyboard-type")) {
                java.lang.String string = jSONObject.getString("keyboard-type");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                this.f343298a = string;
                this.f343301d.R = string;
            }
        } catch (org.json.JSONException unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add keyboardType error");
        }
        try {
            if (jSONObject.has("cursor-spacing")) {
                this.f343301d.f438144y = java.lang.Integer.valueOf(ik1.w.k(jSONObject, "cursor-spacing"));
            }
        } catch (java.lang.NumberFormatException unused4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
        } catch (org.json.JSONException unused5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing error");
        } catch (java.lang.Exception unused6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get cursor-spacing parseInt error");
        }
        try {
            if (jSONObject.has("adjust-position")) {
                this.f343301d.B = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("adjust-position"), true));
            }
        } catch (org.json.JSONException unused7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
        } catch (java.lang.Exception unused8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get adjust-position error");
        }
        try {
            if (jSONObject.has("show-confirm-bar")) {
                this.f343299b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("show-confirm-bar"), false);
            }
        } catch (org.json.JSONException unused9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
        } catch (java.lang.Exception unused10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
        }
        try {
            if (jSONObject.has("password")) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("password"), false);
            }
        } catch (org.json.JSONException unused11) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get password error");
        } catch (java.lang.Exception unused12) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get password error");
        }
        try {
            if (jSONObject.has("show-cover-view")) {
                this.f343300c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("show-cover-view"), false);
            }
        } catch (org.json.JSONException unused13) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
        } catch (java.lang.Exception unused14) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
        }
        try {
            if (jSONObject.has("confirm-hold")) {
                this.f343302e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("confirm-hold"), false);
            }
        } catch (org.json.JSONException unused15) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
        } catch (java.lang.Exception unused16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.d(jSONObject, this.f343301d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.d(jSONObject, this.f343301d);
    }
}

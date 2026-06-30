package hg;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362824a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f362825b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f362826c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f362827d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f362828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f362829f;

    public g(hg.h hVar, java.lang.String str) {
        org.json.JSONObject jSONObject;
        this.f362824a = "";
        this.f362825b = false;
        this.f362826c = false;
        this.f362827d = false;
        this.f362828e = false;
        this.f362829f = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextAreaInfo", "totalInfo:" + str);
        try {
            jSONObject = new org.json.JSONObject(str);
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
                this.f362824a = jSONObject.getString("keyboard-type");
            }
        } catch (org.json.JSONException unused3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo add keyboardType error");
        }
        try {
            if (jSONObject.has("show-confirm-bar")) {
                this.f362825b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("show-confirm-bar"), false);
            }
        } catch (org.json.JSONException unused4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
        } catch (java.lang.Exception unused5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-confirm-bar error");
        }
        try {
            if (jSONObject.has("password")) {
                this.f362826c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("password"), false);
            }
        } catch (org.json.JSONException unused6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get password error");
        } catch (java.lang.Exception unused7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get password error");
        }
        try {
            if (jSONObject.has("show-cover-view")) {
                this.f362827d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("show-cover-view"), false);
            }
        } catch (org.json.JSONException unused8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
        } catch (java.lang.Exception unused9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get show-cover-view error");
        }
        try {
            if (jSONObject.has("confirm-hold")) {
                this.f362828e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(jSONObject.getString("confirm-hold"), false);
            }
        } catch (org.json.JSONException unused10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
        } catch (java.lang.Exception unused11) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextAreaInfo", "TextAreaInfo get confirm-hold error");
        }
        if (jSONObject.has("view-id")) {
            this.f362829f = jSONObject.optInt("view-id");
        }
    }
}

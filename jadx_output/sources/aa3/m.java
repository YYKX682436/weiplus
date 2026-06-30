package aa3;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2553a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f2554b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f2555c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f2556d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f2557e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2558f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f2559g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f2560h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Long f2561i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f2562j;

    /* renamed from: k, reason: collision with root package name */
    public final org.json.JSONObject f2563k;

    public m(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        this.f2553a = "";
        this.f2554b = "";
        this.f2558f = true;
        java.lang.String jSONObject = json.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        this.f2554b = jSONObject;
        com.tencent.mars.xlog.Log.i("InputInfo", "totalInfo:" + jSONObject);
        java.lang.String optString = json.optString("type");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f2553a = optString;
        if (r26.i0.y(optString, "LiteAppKeyboardType.", false)) {
            java.lang.String substring = optString.substring(20);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            this.f2553a = substring;
        }
        if (json.has("confirmText")) {
            this.f2557e = json.getString("confirmText");
        }
        if (json.has("confirmColor")) {
            this.f2555c = java.lang.Integer.valueOf(json.getInt("confirmColor"));
        }
        if (json.has("confirmBgColor")) {
            this.f2556d = java.lang.Integer.valueOf(json.getInt("confirmBgColor"));
        }
        if (json.has("enableConfirm")) {
            this.f2558f = json.getBoolean("enableConfirm");
        }
        if (json.has("disableDarkMode")) {
            this.f2559g = java.lang.Boolean.valueOf(json.getBoolean("disableDarkMode"));
        }
        if (json.has(dm.i4.COL_ID)) {
            this.f2560h = java.lang.Integer.valueOf(json.getInt(dm.i4.COL_ID));
        }
        if (json.has("appUuid")) {
            this.f2561i = java.lang.Long.valueOf(json.getLong("appUuid"));
        }
        if (json.has("pwdEncryptMode")) {
            this.f2562j = json.getString("pwdEncryptMode");
        }
        if (json.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            try {
                this.f2563k = new org.json.JSONObject(json.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA));
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e("InputInfo", "extraData is invalid json object");
            }
        }
    }
}

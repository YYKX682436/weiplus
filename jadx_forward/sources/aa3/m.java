package aa3;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84086a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84087b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f84088c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f84089d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f84090e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84091f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Boolean f84092g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f84093h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Long f84094i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f84095j;

    /* renamed from: k, reason: collision with root package name */
    public final org.json.JSONObject f84096k;

    public m(org.json.JSONObject json) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        this.f84086a = "";
        this.f84087b = "";
        this.f84091f = true;
        java.lang.String jSONObject = json.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        this.f84087b = jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InputInfo", "totalInfo:" + jSONObject);
        java.lang.String optString = json.optString("type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f84086a = optString;
        if (r26.i0.y(optString, "LiteAppKeyboardType.", false)) {
            java.lang.String substring = optString.substring(20);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            this.f84086a = substring;
        }
        if (json.has("confirmText")) {
            this.f84090e = json.getString("confirmText");
        }
        if (json.has("confirmColor")) {
            this.f84088c = java.lang.Integer.valueOf(json.getInt("confirmColor"));
        }
        if (json.has("confirmBgColor")) {
            this.f84089d = java.lang.Integer.valueOf(json.getInt("confirmBgColor"));
        }
        if (json.has("enableConfirm")) {
            this.f84091f = json.getBoolean("enableConfirm");
        }
        if (json.has("disableDarkMode")) {
            this.f84092g = java.lang.Boolean.valueOf(json.getBoolean("disableDarkMode"));
        }
        if (json.has(dm.i4.f66865x76d1ec5a)) {
            this.f84093h = java.lang.Integer.valueOf(json.getInt(dm.i4.f66865x76d1ec5a));
        }
        if (json.has("appUuid")) {
            this.f84094i = java.lang.Long.valueOf(json.getLong("appUuid"));
        }
        if (json.has("pwdEncryptMode")) {
            this.f84095j = json.getString("pwdEncryptMode");
        }
        if (json.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            try {
                this.f84096k = new org.json.JSONObject(json.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099));
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("InputInfo", "extraData is invalid json object");
            }
        }
    }
}

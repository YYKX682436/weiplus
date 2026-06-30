package gs4;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f356625a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f356626b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f356627c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f356628d;

    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f356625a = str;
        this.f356626b = str2;
        this.f356627c = str3;
        this.f356628d = str4;
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f356625a);
            jSONObject.put("desc", this.f356626b);
            jSONObject.put("iconurl", this.f356627c);
            jSONObject.put("iconmd5", this.f356628d);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetHbRefundConfig", "HbRefundTimeParcelable getJSONObjectString() Exception: %s", e17.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: toString */
    public java.lang.String m132154x9616526c() {
        return "HbRefundTimeParcelable{title='" + this.f356625a + "', desc='" + this.f356626b + "', iconurl='" + this.f356627c + "', iconmd5='" + this.f356628d + "'}";
    }
}

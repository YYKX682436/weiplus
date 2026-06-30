package rf1;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f476155a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f476156b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f476157c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f476158d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f476159e = null;

    public boolean a() {
        return (android.text.TextUtils.isEmpty(this.f476155a) || this.f476155a.equals("<unknown ssid>") || android.text.TextUtils.isEmpty(this.f476156b) || this.f476156b.equals("02:00:00:00:00:00")) ? false : true;
    }

    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("SSID", this.f476155a);
        jSONObject.put("BSSID", this.f476156b);
        java.lang.Boolean bool = this.f476158d;
        if (bool != null) {
            jSONObject.put("secure", bool);
        }
        java.lang.Integer num = this.f476157c;
        if (num != null) {
            jSONObject.put("signalStrength", num);
        }
        java.lang.Integer num2 = this.f476159e;
        if (num2 != null) {
            jSONObject.put("frequency", num2);
        }
        return jSONObject;
    }

    /* renamed from: toString */
    public java.lang.String m162280x9616526c() {
        return "WiFiItem{mSsid='" + this.f476155a + "', mBssid='" + this.f476156b + "', mSignalStrength=" + this.f476157c + ", mSecurity=" + this.f476158d + ", frequency=" + this.f476159e + '}';
    }
}

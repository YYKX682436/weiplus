package gs4;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int f356636a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f356637b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f356638c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f356639d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f356640e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f356641f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f356642g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f356643h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f356644i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f356645j;

    public java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ret_code", this.f356636a);
            jSONObject.put("ret_msg", this.f356637b);
            jSONObject.put("is_show", this.f356638c);
            jSONObject.put("is_open", this.f356639d);
            jSONObject.put("entrance_name", this.f356640e);
            jSONObject.put("wording", this.f356641f);
            jSONObject.put("is_new_user", this.f356642g);
            jSONObject.put("compliance_item_wording", this.f356643h);
            jSONObject.put("compliance_item_title", this.f356644i);
            jSONObject.put("compliance_item_link", this.f356645j);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.NetSceneMobileRemitGetSwitch", "MobileRemitSwitchConfig getJSONObjectString() Exception: %s", e17.getMessage());
            return "";
        }
    }

    /* renamed from: toString */
    public java.lang.String m132155x9616526c() {
        return "MobileRemitSwitchConfig{ret_code=" + this.f356636a + ", ret_msg='" + this.f356637b + "', is_show=" + this.f356638c + ", is_open=" + this.f356639d + ", entrance_name='" + this.f356640e + "', wording='" + this.f356641f + "', is_new_user='" + this.f356642g + ", compliance_item_wording='" + this.f356643h + "', compliance_item_title='" + this.f356644i + "', compliance_item_link='" + this.f356645j + "'}";
    }
}

package at4;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: d, reason: collision with root package name */
    public static at4.n f95433d;

    /* renamed from: a, reason: collision with root package name */
    public int f95434a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f95435b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f95436c;

    public static at4.n a() {
        if (f95433d == null) {
            f95433d = new at4.n();
        }
        return f95433d;
    }

    public boolean b() {
        return this.f95434a == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f95435b);
    }

    public void c(org.json.JSONObject jSONObject) {
        this.f95436c = jSONObject;
        try {
            if (jSONObject != null) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bind_newcard_switch");
                this.f95434a = optJSONObject.optInt("forbid_bind_card");
                this.f95435b = optJSONObject.optString("forbid_word");
            } else {
                this.f95434a = 0;
                this.f95435b = "";
            }
        } catch (java.lang.Exception e17) {
            this.f95434a = 0;
            this.f95435b = "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BindQueryComplexSwitchInfo", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindQueryComplexSwitchInfo", "feed result %s forbid_bind_card %s forbid_word %s", this.f95436c, java.lang.Integer.valueOf(this.f95434a), this.f95435b);
    }
}

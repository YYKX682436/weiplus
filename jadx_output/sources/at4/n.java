package at4;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: d, reason: collision with root package name */
    public static at4.n f13900d;

    /* renamed from: a, reason: collision with root package name */
    public int f13901a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f13902b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f13903c;

    public static at4.n a() {
        if (f13900d == null) {
            f13900d = new at4.n();
        }
        return f13900d;
    }

    public boolean b() {
        return this.f13901a == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f13902b);
    }

    public void c(org.json.JSONObject jSONObject) {
        this.f13903c = jSONObject;
        try {
            if (jSONObject != null) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bind_newcard_switch");
                this.f13901a = optJSONObject.optInt("forbid_bind_card");
                this.f13902b = optJSONObject.optString("forbid_word");
            } else {
                this.f13901a = 0;
                this.f13902b = "";
            }
        } catch (java.lang.Exception e17) {
            this.f13901a = 0;
            this.f13902b = "";
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BindQueryComplexSwitchInfo", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BindQueryComplexSwitchInfo", "feed result %s forbid_bind_card %s forbid_word %s", this.f13903c, java.lang.Integer.valueOf(this.f13901a), this.f13902b);
    }
}

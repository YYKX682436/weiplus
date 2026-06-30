package od;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final od.f f426037a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f426038b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f426039c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f426040d;

    /* renamed from: e, reason: collision with root package name */
    public final int f426041e;

    /* renamed from: f, reason: collision with root package name */
    public final long f426042f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f426043g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f426044h;

    public g(od.f fVar, od.i iVar, boolean z17) {
        this.f426037a = fVar;
        org.json.JSONObject jSONObject = iVar.f426030b;
        this.f426038b = jSONObject.getString(ya.b.f77491x8758c4e1);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        this.f426039c = optJSONObject;
        if (optJSONObject == null) {
            this.f426039c = new org.json.JSONObject("{}");
        }
        this.f426040d = z17;
        this.f426041e = jSONObject.optInt("callbackId", 0);
        this.f426042f = jSONObject.optLong("liteCallbackId", 0L);
        this.f426044h = new org.json.JSONObject();
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (str == null) {
            str = "";
        }
        this.f426043g = str;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject2 = jSONObject;
        this.f426044h = jSONObject2;
        int i17 = this.f426041e;
        if (i17 == 0 && this.f426042f == 0) {
            return;
        }
        this.f426037a.a(new od.c(this.f426042f, i17, this.f426043g, jSONObject2, false));
    }
}

package rx4;

/* loaded from: classes8.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f482824a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONArray f482825b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f482827d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482828e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f482829f;

    /* renamed from: g, reason: collision with root package name */
    public final int f482830g;

    public u2(java.lang.String jsonString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonString, "jsonString");
        this.f482824a = jsonString;
        this.f482826c = "";
        this.f482828e = "";
        this.f482829f = "";
        org.json.JSONObject jSONObject = new org.json.JSONObject(jsonString);
        this.f482825b = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.lang.String optString = jSONObject.optString("placeholder", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482826c = optString;
        this.f482827d = jSONObject.optInt("placeholderSource", 0);
        java.lang.String optString2 = jSONObject.optString("placeholderMixerCommonContext", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f482828e = optString2;
        java.lang.String optString3 = jSONObject.optString("searchID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        this.f482829f = optString3;
        this.f482830g = jSONObject.optInt("reqtype", 0);
    }

    /* renamed from: equals */
    public boolean m163424xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.u2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482824a, ((rx4.u2) obj).f482824a);
    }

    /* renamed from: hashCode */
    public int m163425x8cdac1b() {
        return this.f482824a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163426x9616526c() {
        return "WebSearchTeachRespJSON(jsonString=" + this.f482824a + ')';
    }
}

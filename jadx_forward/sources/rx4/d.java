package rx4;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482656a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f482658c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f482659d;

    /* renamed from: e, reason: collision with root package name */
    public final rx4.c f482660e;

    public d(org.json.JSONObject raw) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482656a = raw;
        this.f482657b = "";
        this.f482659d = new java.util.ArrayList();
        java.lang.String optString = raw.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482657b = optString;
        raw.optInt("type", 1);
        this.f482658c = raw.optInt("parenttype", com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(raw.optString("docInfo", ""), "optString(...)");
        try {
            org.json.JSONObject optJSONObject = raw.optJSONObject("moreInfo");
            if (optJSONObject != null) {
                this.f482660e = new rx4.c(optJSONObject);
            }
        } catch (org.json.JSONException unused) {
        }
        try {
            org.json.JSONArray optJSONArray = this.f482656a.optJSONArray("list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.util.List list = this.f482659d;
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optJSONObject2, "optJSONObject(...)");
                    list.add(new rx4.b(optJSONObject2));
                }
            }
        } catch (org.json.JSONException unused2) {
        }
    }

    /* renamed from: equals */
    public boolean m163399xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482656a, ((rx4.d) obj).f482656a);
    }

    /* renamed from: hashCode */
    public int m163400x8cdac1b() {
        return this.f482656a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163401x9616526c() {
        return "FTSDramaTab(raw=" + this.f482656a + ')';
    }
}

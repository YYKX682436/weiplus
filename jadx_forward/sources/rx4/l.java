package rx4;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final rx4.k f482751g = new rx4.k(null);

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482752a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482753b;

    /* renamed from: c, reason: collision with root package name */
    public final int f482754c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f482755d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482756e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f482757f;

    public l(org.json.JSONObject raw) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482752a = raw;
        this.f482753b = "";
        this.f482755d = new java.util.ArrayList();
        this.f482756e = "";
        this.f482757f = "";
        java.lang.String optString = raw.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482753b = optString;
        this.f482754c = raw.optInt("parenttype", 68);
        java.lang.String optString2 = raw.optString("bgImage", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f482756e = optString2;
        java.lang.String optString3 = raw.optString("bgImageDark", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        this.f482757f = optString3;
        try {
            org.json.JSONArray optJSONArray = raw.optJSONArray("items");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.util.List list = this.f482755d;
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optJSONObject, "optJSONObject(...)");
                    list.add(new rx4.m(optJSONObject));
                }
            }
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: equals */
    public boolean m163415xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482752a, ((rx4.l) obj).f482752a);
    }

    /* renamed from: hashCode */
    public int m163416x8cdac1b() {
        return this.f482752a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163417x9616526c() {
        return "FTSHotspotBlock(raw=" + this.f482752a + ')';
    }
}

package rx4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482627a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482628b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482629c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482630d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482631e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f482632f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f482633g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f482634h;

    public b(org.json.JSONObject raw) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482627a = raw;
        this.f482628b = "";
        this.f482629c = "";
        this.f482630d = "";
        this.f482631e = "";
        this.f482632f = "";
        this.f482633g = "";
        this.f482634h = new java.util.ArrayList();
        java.lang.String optString = raw.optString("hotword", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482628b = optString;
        java.lang.String optString2 = raw.optString(dm.i4.f66865x76d1ec5a, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f482629c = optString2;
        java.lang.String optString3 = raw.optString("subtitle", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        this.f482630d = optString3;
        java.lang.String optString4 = raw.optString("coverUrl", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
        this.f482631e = optString4;
        java.lang.String optString5 = raw.optString("mixerCommonContext", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
        this.f482632f = optString5;
        java.lang.String optString6 = raw.optString("docInfo", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString6, "optString(...)");
        this.f482633g = optString6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(raw.optString("finderSessionBuffer", ""), "optString(...)");
        try {
            org.json.JSONArray optJSONArray = raw.optJSONArray("tags");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        this.f482634h.add(new rx4.y0(optJSONObject));
                    }
                }
            }
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: equals */
    public boolean m163393xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482627a, ((rx4.b) obj).f482627a);
    }

    /* renamed from: hashCode */
    public int m163394x8cdac1b() {
        return this.f482627a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163395x9616526c() {
        return "FTSDramaItem(raw=" + this.f482627a + ')';
    }
}

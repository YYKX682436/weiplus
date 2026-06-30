package rx4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482761a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482762b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482763c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482764d;

    /* renamed from: e, reason: collision with root package name */
    public final int f482765e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f482766f;

    public m(org.json.JSONObject raw) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482761a = raw;
        java.lang.String str = "";
        this.f482762b = "";
        this.f482763c = "";
        this.f482764d = "";
        this.f482765e = -1;
        this.f482766f = "";
        java.lang.String optString = raw.optString("hotword", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482762b = optString;
        java.lang.String optString2 = raw.optString(dm.i4.f66865x76d1ec5a, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f482763c = optString2;
        java.lang.String optString3 = raw.optString("mixerCommonContext", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        this.f482764d = optString3;
        this.f482765e = raw.optInt("isOpenSearchWebView", -1);
        try {
            java.lang.String optString4 = raw.optJSONArray("tags").optJSONObject(0).optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
            str = optString4;
        } catch (java.lang.Exception unused) {
        }
        this.f482766f = str;
    }

    /* renamed from: equals */
    public boolean m163418xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482761a, ((rx4.m) obj).f482761a);
    }

    /* renamed from: hashCode */
    public int m163419x8cdac1b() {
        return this.f482761a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163420x9616526c() {
        return "FTSHotspotItem(raw=" + this.f482761a + ')';
    }
}

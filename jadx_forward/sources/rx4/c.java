package rx4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482642a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482643b;

    /* renamed from: c, reason: collision with root package name */
    public final int f482644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f482645d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482646e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f482647f;

    public c(org.json.JSONObject raw) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482642a = raw;
        this.f482643b = "";
        this.f482646e = "";
        this.f482647f = "";
        java.lang.String optString = raw.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482643b = optString;
        this.f482644c = raw.optInt("type", 0);
        try {
            org.json.JSONObject optJSONObject = raw.optJSONObject("jumpInfo");
            if (optJSONObject != null) {
                this.f482645d = optJSONObject.optInt("jumpType", 0);
                java.lang.String optString2 = optJSONObject.optString("appId", "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                this.f482646e = optString2;
                java.lang.String optString3 = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
                this.f482647f = optString3;
            }
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: equals */
    public boolean m163396xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482642a, ((rx4.c) obj).f482642a);
    }

    /* renamed from: hashCode */
    public int m163397x8cdac1b() {
        return this.f482642a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163398x9616526c() {
        return "FTSDramaMoreInfo(raw=" + this.f482642a + ')';
    }
}

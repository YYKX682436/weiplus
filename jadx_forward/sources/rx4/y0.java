package rx4;

/* loaded from: classes8.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482870a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f482872c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482873d;

    public y0(org.json.JSONObject raw) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482870a = raw;
        this.f482871b = "";
        this.f482873d = "";
        java.lang.String optString = raw.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482871b = optString;
        this.f482872c = raw.optInt("type", 0);
        java.lang.String optString2 = raw.optString("color", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f482873d = optString2;
    }

    /* renamed from: equals */
    public boolean m163436xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.y0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482870a, ((rx4.y0) obj).f482870a);
    }

    /* renamed from: hashCode */
    public int m163437x8cdac1b() {
        return this.f482870a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163438x9616526c() {
        return "FTSTeachTag(raw=" + this.f482870a + ')';
    }
}

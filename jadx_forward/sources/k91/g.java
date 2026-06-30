package k91;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f387116a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f387117b;

    public g(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f387116a = str;
        this.f387117b = jSONObject.getString("desc");
    }

    /* renamed from: toString */
    public java.lang.String m142157x9616526c() {
        return "Permission{name='" + this.f387116a + "', desc='" + this.f387117b + "'}";
    }
}

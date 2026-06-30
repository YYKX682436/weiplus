package xf1;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    public static final xf1.n f535779c = new xf1.n(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f535780a;

    /* renamed from: b, reason: collision with root package name */
    public final long f535781b;

    public o(java.lang.String name, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f535780a = name;
        this.f535781b = j17;
    }

    public org.json.JSONObject a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f535780a);
            jSONObject.put("lastModified", this.f535781b);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "FileMetaData#toJson, fail since " + e17);
            return null;
        }
    }
}

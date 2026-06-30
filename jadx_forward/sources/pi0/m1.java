package pi0;

/* loaded from: classes11.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f436198a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436199b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f436200c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436201d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436202e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f436203f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashMap f436204g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f436205h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f436206i = true;

    public m1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap hashMap) {
        this.f436198a = str;
        this.f436199b = str2;
        this.f436200c = str3;
        this.f436203f = hashMap;
    }

    public java.lang.String a() {
        java.lang.String str = this.f436200c;
        boolean isEmpty = str.isEmpty();
        java.lang.String str2 = this.f436198a;
        if (isEmpty || str.equals("/")) {
            return str2;
        }
        return str2 + "/" + str;
    }

    public java.lang.String b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("plugin", this.f436198a);
            jSONObject.put("entry", this.f436199b);
            jSONObject.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16281x190f801f, this.f436200c);
            jSONObject.put("engineId", this.f436201d);
            jSONObject.put("paramsKey", this.f436202e);
            if (this.f436204g != null) {
                jSONObject.put("initParams", new org.json.JSONObject(this.f436204g));
            }
            jSONObject.put("parentPageType", 0);
            jSONObject.put("isInitRoute", this.f436205h);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: toString */
    public java.lang.String m158564x9616526c() {
        return b();
    }
}

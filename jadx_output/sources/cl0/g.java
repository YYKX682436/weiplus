package cl0;

/* loaded from: classes15.dex */
public class g extends org.json.JSONObject implements cl0.c {

    /* renamed from: a, reason: collision with root package name */
    public final cl0.c f42848a;

    public g() {
        this.f42848a = new cl0.d();
    }

    @Override // cl0.c
    public cl0.c c(java.lang.String str, boolean z17) {
        this.f42848a.c(str, z17);
        return this;
    }

    @Override // cl0.c
    public /* bridge */ /* synthetic */ cl0.c d(java.lang.String str, double d17) {
        n(str, d17);
        return this;
    }

    @Override // cl0.c
    public cl0.c e(java.lang.String str, java.lang.Object obj) {
        this.f42848a.e(str, obj);
        return this;
    }

    @Override // cl0.c
    public java.lang.String g(java.lang.String str) {
        return this.f42848a.g(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public java.lang.Object get(java.lang.String str) {
        return this.f42848a.get(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public boolean getBoolean(java.lang.String str) {
        return this.f42848a.getBoolean(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public double getDouble(java.lang.String str) {
        return this.f42848a.getDouble(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public int getInt(java.lang.String str) {
        return this.f42848a.getInt(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public long getLong(java.lang.String str) {
        return this.f42848a.getLong(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public java.lang.String getString(java.lang.String str) {
        return this.f42848a.getString(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public boolean has(java.lang.String str) {
        return this.f42848a.has(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public boolean isNull(java.lang.String str) {
        return this.f42848a.isNull(str);
    }

    @Override // cl0.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.e i(java.lang.String str) {
        cl0.a i17 = this.f42848a.i(str);
        if (i17 == null) {
            return null;
        }
        return new cl0.e(i17);
    }

    @Override // org.json.JSONObject
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.g getJSONObject(java.lang.String str) {
        cl0.c jSONObject = this.f42848a.getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return new cl0.g(jSONObject);
    }

    @Override // org.json.JSONObject, cl0.c
    public java.util.Iterator keys() {
        return this.f42848a.keys();
    }

    @Override // org.json.JSONObject
    /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.e optJSONArray(java.lang.String str) {
        cl0.a optJSONArray = this.f42848a.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new cl0.e(optJSONArray);
    }

    @Override // org.json.JSONObject, cl0.c
    public int length() {
        return this.f42848a.length();
    }

    @Override // org.json.JSONObject
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.g optJSONObject(java.lang.String str) {
        cl0.c optJSONObject = this.f42848a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return new cl0.g(optJSONObject);
    }

    public cl0.g n(java.lang.String str, double d17) {
        this.f42848a.d(g(str), d17);
        return this;
    }

    public cl0.g o(java.lang.String str, int i17) {
        this.f42848a.put(g(str), i17);
        return this;
    }

    @Override // org.json.JSONObject, cl0.c
    public java.lang.Object opt(java.lang.String str) {
        return this.f42848a.opt(str);
    }

    @Override // org.json.JSONObject
    public boolean optBoolean(java.lang.String str) {
        return this.f42848a.optBoolean(str, false);
    }

    @Override // org.json.JSONObject
    public double optDouble(java.lang.String str) {
        return this.f42848a.optDouble(str, Double.NaN);
    }

    @Override // org.json.JSONObject
    public int optInt(java.lang.String str) {
        return this.f42848a.optInt(str, 0);
    }

    @Override // org.json.JSONObject
    public long optLong(java.lang.String str) {
        return this.f42848a.optLong(str, 0L);
    }

    @Override // org.json.JSONObject, cl0.c
    public java.lang.String optString(java.lang.String str) {
        return this.f42848a.optString(str, "");
    }

    public cl0.g p(java.lang.String str, long j17) {
        this.f42848a.put(g(str), j17);
        return this;
    }

    @Override // org.json.JSONObject, cl0.c
    public /* bridge */ /* synthetic */ cl0.c put(java.lang.String str, int i17) {
        o(str, i17);
        return this;
    }

    @Override // org.json.JSONObject
    public org.json.JSONObject putOpt(java.lang.String str, java.lang.Object obj) {
        this.f42848a.e(str, obj);
        return this;
    }

    @Override // org.json.JSONObject
    /* renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.g put(java.lang.String str, java.lang.Object obj) {
        if (obj instanceof cl0.g) {
            return h(str, ((cl0.g) obj).f42848a);
        }
        this.f42848a.put(str, obj);
        return this;
    }

    public cl0.g r(java.lang.String str, boolean z17) {
        this.f42848a.c(str, z17);
        return this;
    }

    @Override // org.json.JSONObject, cl0.c
    public java.lang.Object remove(java.lang.String str) {
        return this.f42848a.remove(str);
    }

    public cl0.g s(java.lang.String str, java.lang.Object obj) {
        this.f42848a.e(str, obj);
        return this;
    }

    @Override // org.json.JSONObject
    public java.lang.String toString() {
        return this.f42848a.toString();
    }

    @Override // org.json.JSONObject, cl0.c
    public boolean optBoolean(java.lang.String str, boolean z17) {
        return this.f42848a.optBoolean(str, z17);
    }

    @Override // org.json.JSONObject, cl0.c
    public double optDouble(java.lang.String str, double d17) {
        return this.f42848a.optDouble(str, d17);
    }

    @Override // org.json.JSONObject, cl0.c
    public int optInt(java.lang.String str, int i17) {
        return this.f42848a.optInt(str, i17);
    }

    @Override // org.json.JSONObject, cl0.c
    public long optLong(java.lang.String str, long j17) {
        return this.f42848a.optLong(str, j17);
    }

    @Override // org.json.JSONObject, cl0.c
    public java.lang.String optString(java.lang.String str, java.lang.String str2) {
        return this.f42848a.optString(str, str2);
    }

    @Override // org.json.JSONObject, cl0.c
    public /* bridge */ /* synthetic */ cl0.c put(java.lang.String str, long j17) {
        p(str, j17);
        return this;
    }

    @Override // org.json.JSONObject
    public /* bridge */ /* synthetic */ org.json.JSONObject put(java.lang.String str, double d17) {
        n(str, d17);
        return this;
    }

    public g(cl0.c cVar) {
        iz5.a.d(null, cVar);
        this.f42848a = cVar;
    }

    @Override // org.json.JSONObject
    public /* bridge */ /* synthetic */ org.json.JSONObject put(java.lang.String str, int i17) {
        o(str, i17);
        return this;
    }

    @Override // org.json.JSONObject
    public /* bridge */ /* synthetic */ org.json.JSONObject put(java.lang.String str, long j17) {
        p(str, j17);
        return this;
    }

    public g(java.util.Map map) {
        this.f42848a = new cl0.d(map);
    }

    @Override // org.json.JSONObject
    public org.json.JSONObject put(java.lang.String str, boolean z17) {
        this.f42848a.c(str, z17);
        return this;
    }

    public g(java.lang.String str) {
        this.f42848a = new cl0.d(str);
    }
}

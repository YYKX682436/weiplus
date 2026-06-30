package cl0;

/* loaded from: classes15.dex */
public class g extends org.json.JSONObject implements cl0.c {

    /* renamed from: a, reason: collision with root package name */
    public final cl0.c f124381a;

    public g() {
        this.f124381a = new cl0.d();
    }

    @Override // cl0.c
    public cl0.c c(java.lang.String str, boolean z17) {
        this.f124381a.c(str, z17);
        return this;
    }

    @Override // cl0.c
    public /* bridge */ /* synthetic */ cl0.c d(java.lang.String str, double d17) {
        n(str, d17);
        return this;
    }

    @Override // cl0.c
    public cl0.c e(java.lang.String str, java.lang.Object obj) {
        this.f124381a.e(str, obj);
        return this;
    }

    @Override // cl0.c
    public java.lang.String g(java.lang.String str) {
        return this.f124381a.g(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public java.lang.Object get(java.lang.String str) {
        return this.f124381a.get(str);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: getBoolean */
    public boolean mo15070x41a8a7f2(java.lang.String str) {
        return this.f124381a.mo15070x41a8a7f2(str);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: getDouble */
    public double mo15071x160e9ec7(java.lang.String str) {
        return this.f124381a.mo15071x160e9ec7(str);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: getInt */
    public int mo15072xb58848b9(java.lang.String str) {
        return this.f124381a.mo15072xb58848b9(str);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: getLong */
    public long mo15073xfb822ef2(java.lang.String str) {
        return this.f124381a.mo15073xfb822ef2(str);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: getString */
    public java.lang.String mo15074x2fec8307(java.lang.String str) {
        return this.f124381a.mo15074x2fec8307(str);
    }

    @Override // org.json.JSONObject, cl0.c
    public boolean has(java.lang.String str) {
        return this.f124381a.has(str);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: isNull */
    public boolean mo15075xb9a6a1d1(java.lang.String str) {
        return this.f124381a.mo15075xb9a6a1d1(str);
    }

    @Override // cl0.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.e i(java.lang.String str) {
        cl0.a i17 = this.f124381a.i(str);
        if (i17 == null) {
            return null;
        }
        return new cl0.e(i17);
    }

    @Override // org.json.JSONObject
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.g getJSONObject(java.lang.String str) {
        cl0.c jSONObject = this.f124381a.getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return new cl0.g(jSONObject);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: keys */
    public java.util.Iterator mo15076x322df4() {
        return this.f124381a.mo15076x322df4();
    }

    @Override // org.json.JSONObject
    /* renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.e optJSONArray(java.lang.String str) {
        cl0.a optJSONArray = this.f124381a.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new cl0.e(optJSONArray);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: length */
    public int mo15077xbe0e3ae6() {
        return this.f124381a.mo15077xbe0e3ae6();
    }

    @Override // org.json.JSONObject
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.g optJSONObject(java.lang.String str) {
        cl0.c optJSONObject = this.f124381a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return new cl0.g(optJSONObject);
    }

    public cl0.g n(java.lang.String str, double d17) {
        this.f124381a.d(g(str), d17);
        return this;
    }

    public cl0.g o(java.lang.String str, int i17) {
        this.f124381a.put(g(str), i17);
        return this;
    }

    @Override // org.json.JSONObject, cl0.c
    public java.lang.Object opt(java.lang.String str) {
        return this.f124381a.opt(str);
    }

    @Override // org.json.JSONObject
    public boolean optBoolean(java.lang.String str) {
        return this.f124381a.mo15078x42e4f5f5(str, false);
    }

    @Override // org.json.JSONObject
    public double optDouble(java.lang.String str) {
        return this.f124381a.mo15079x2edf0464(str, Double.NaN);
    }

    @Override // org.json.JSONObject
    public int optInt(java.lang.String str) {
        return this.f124381a.mo15080xc3ca103c(str, 0);
    }

    @Override // org.json.JSONObject
    public long optLong(java.lang.String str) {
        return this.f124381a.mo15081xb57957cf(str, 0L);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: optString */
    public java.lang.String mo15082x48bce8a4(java.lang.String str) {
        return this.f124381a.mo15083x48bce8a4(str, "");
    }

    public cl0.g p(java.lang.String str, long j17) {
        this.f124381a.put(g(str), j17);
        return this;
    }

    @Override // org.json.JSONObject, cl0.c
    public /* bridge */ /* synthetic */ cl0.c put(java.lang.String str, int i17) {
        o(str, i17);
        return this;
    }

    @Override // org.json.JSONObject
    public org.json.JSONObject putOpt(java.lang.String str, java.lang.Object obj) {
        this.f124381a.e(str, obj);
        return this;
    }

    @Override // org.json.JSONObject
    /* renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.g put(java.lang.String str, java.lang.Object obj) {
        if (obj instanceof cl0.g) {
            return h(str, ((cl0.g) obj).f124381a);
        }
        this.f124381a.put(str, obj);
        return this;
    }

    public cl0.g r(java.lang.String str, boolean z17) {
        this.f124381a.c(str, z17);
        return this;
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: remove */
    public java.lang.Object mo15084xc84af884(java.lang.String str) {
        return this.f124381a.mo15084xc84af884(str);
    }

    public cl0.g s(java.lang.String str, java.lang.Object obj) {
        this.f124381a.e(str, obj);
        return this;
    }

    @Override // org.json.JSONObject
    public java.lang.String toString() {
        return this.f124381a.toString();
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: optBoolean */
    public boolean mo15078x42e4f5f5(java.lang.String str, boolean z17) {
        return this.f124381a.mo15078x42e4f5f5(str, z17);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: optDouble */
    public double mo15079x2edf0464(java.lang.String str, double d17) {
        return this.f124381a.mo15079x2edf0464(str, d17);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: optInt */
    public int mo15080xc3ca103c(java.lang.String str, int i17) {
        return this.f124381a.mo15080xc3ca103c(str, i17);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: optLong */
    public long mo15081xb57957cf(java.lang.String str, long j17) {
        return this.f124381a.mo15081xb57957cf(str, j17);
    }

    @Override // org.json.JSONObject, cl0.c
    /* renamed from: optString */
    public java.lang.String mo15083x48bce8a4(java.lang.String str, java.lang.String str2) {
        return this.f124381a.mo15083x48bce8a4(str, str2);
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
        this.f124381a = cVar;
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
        this.f124381a = new cl0.d(map);
    }

    @Override // org.json.JSONObject
    public org.json.JSONObject put(java.lang.String str, boolean z17) {
        this.f124381a.c(str, z17);
        return this;
    }

    public g(java.lang.String str) {
        this.f124381a = new cl0.d(str);
    }
}

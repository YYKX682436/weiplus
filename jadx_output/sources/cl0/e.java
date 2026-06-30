package cl0;

/* loaded from: classes15.dex */
public class e extends org.json.JSONArray implements cl0.a {

    /* renamed from: a, reason: collision with root package name */
    public final cl0.a f42847a;

    public e() {
        this.f42847a = new cl0.b();
    }

    @Override // cl0.a
    public cl0.a b(int i17, double d17) {
        this.f42847a.b(i17, d17);
        return this;
    }

    @Override // cl0.a
    public cl0.a c(int i17, int i18) {
        this.f42847a.c(i17, i18);
        return this;
    }

    @Override // cl0.a
    public cl0.a d(int i17, long j17) {
        this.f42847a.d(i17, j17);
        return this;
    }

    @Override // cl0.a
    public cl0.a e(double d17) {
        this.f42847a.e(d17);
        return this;
    }

    @Override // cl0.a
    public cl0.a f(int i17) {
        this.f42847a.f(i17);
        return this;
    }

    @Override // cl0.a
    public cl0.a g(long j17) {
        this.f42847a.g(j17);
        return this;
    }

    @Override // org.json.JSONArray, cl0.a
    public java.lang.Object get(int i17) {
        return this.f42847a.get(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public boolean getBoolean(int i17) {
        return this.f42847a.getBoolean(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public double getDouble(int i17) {
        return this.f42847a.getDouble(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public int getInt(int i17) {
        return this.f42847a.getInt(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public long getLong(int i17) {
        return this.f42847a.getLong(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public java.lang.String getString(int i17) {
        return this.f42847a.getString(i17);
    }

    @Override // cl0.a
    public cl0.a h(boolean z17) {
        this.f42847a.h(z17);
        return this;
    }

    @Override // cl0.a
    public cl0.a i(int i17, boolean z17) {
        this.f42847a.i(i17, z17);
        return this;
    }

    @Override // org.json.JSONArray, cl0.a
    public boolean isNull(int i17) {
        return this.f42847a.isNull(i17);
    }

    @Override // cl0.a
    public cl0.a j(int i17) {
        return new cl0.e(this.f42847a.j(i17));
    }

    @Override // org.json.JSONArray, cl0.a
    public int length() {
        return this.f42847a.length();
    }

    @Override // cl0.a
    public cl0.a m(int i17, java.lang.Object obj) {
        this.f42847a.m(i17, obj);
        return this;
    }

    @Override // org.json.JSONArray
    /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.e getJSONArray(int i17) {
        return new cl0.e(this.f42847a.getJSONArray(i17));
    }

    @Override // cl0.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.g l(int i17) {
        return new cl0.g(this.f42847a.l(i17));
    }

    @Override // org.json.JSONArray, cl0.a
    public java.lang.Object opt(int i17) {
        return this.f42847a.opt(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public boolean optBoolean(int i17) {
        return this.f42847a.optBoolean(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public double optDouble(int i17) {
        return this.f42847a.optDouble(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public int optInt(int i17) {
        return this.f42847a.optInt(i17);
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray optJSONArray(int i17) {
        return new cl0.e(this.f42847a.j(i17));
    }

    @Override // org.json.JSONArray, cl0.a
    public long optLong(int i17) {
        return this.f42847a.optLong(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public java.lang.String optString(int i17) {
        return this.f42847a.optString(i17);
    }

    @Override // org.json.JSONArray
    /* renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public cl0.g optJSONObject(int i17) {
        return new cl0.g(this.f42847a.optJSONObject(i17));
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(boolean z17) {
        this.f42847a.h(z17);
        return this;
    }

    public cl0.e q(java.lang.Object obj) {
        this.f42847a.put(obj);
        return this;
    }

    @Override // org.json.JSONArray, cl0.a
    public java.lang.Object remove(int i17) {
        return this.f42847a.remove(i17);
    }

    @Override // org.json.JSONArray, cl0.a
    public java.lang.String toString() {
        return this.f42847a.toString();
    }

    @Override // org.json.JSONArray, cl0.a
    public boolean optBoolean(int i17, boolean z17) {
        return this.f42847a.optBoolean(i17, z17);
    }

    @Override // org.json.JSONArray, cl0.a
    public double optDouble(int i17, double d17) {
        return this.f42847a.optDouble(i17, d17);
    }

    @Override // org.json.JSONArray, cl0.a
    public int optInt(int i17, int i18) {
        return this.f42847a.optInt(i17, i18);
    }

    @Override // org.json.JSONArray, cl0.a
    public long optLong(int i17, long j17) {
        return this.f42847a.optLong(i17, j17);
    }

    @Override // org.json.JSONArray, cl0.a
    public java.lang.String optString(int i17, java.lang.String str) {
        return this.f42847a.optString(i17, str);
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(double d17) {
        this.f42847a.e(d17);
        return this;
    }

    @Override // org.json.JSONArray, cl0.a
    public java.lang.String toString(int i17) {
        return this.f42847a.toString(i17);
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(int i17) {
        this.f42847a.f(i17);
        return this;
    }

    public e(java.util.Collection collection) {
        this.f42847a = new cl0.b(collection);
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(long j17) {
        this.f42847a.g(j17);
        return this;
    }

    @Override // org.json.JSONArray, cl0.a
    public cl0.a put(java.lang.Object obj) {
        this.f42847a.put(obj);
        return this;
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(java.lang.Object obj) {
        this.f42847a.put(obj);
        return this;
    }

    public e(java.lang.String str) {
        this.f42847a = new cl0.b(str);
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(int i17, boolean z17) {
        this.f42847a.i(i17, z17);
        return this;
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(int i17, double d17) {
        this.f42847a.b(i17, d17);
        return this;
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(int i17, int i18) {
        this.f42847a.c(i17, i18);
        return this;
    }

    public e(cl0.a aVar) {
        iz5.a.d(null, aVar);
        this.f42847a = aVar;
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(int i17, long j17) {
        this.f42847a.d(i17, j17);
        return this;
    }

    @Override // org.json.JSONArray
    public org.json.JSONArray put(int i17, java.lang.Object obj) {
        this.f42847a.m(i17, obj);
        return this;
    }
}

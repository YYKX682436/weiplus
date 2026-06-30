package i04;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final i04.e f368070f = new i04.e(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368071a;

    /* renamed from: b, reason: collision with root package name */
    public final int f368072b;

    /* renamed from: c, reason: collision with root package name */
    public final j04.f f368073c;

    /* renamed from: d, reason: collision with root package name */
    public long f368074d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f368075e;

    public f(java.lang.String sessionId, int i17, j04.f callback, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f368071a = sessionId;
        this.f368072b = i17;
        this.f368073c = callback;
        this.f368074d = j17;
        this.f368075e = z17;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.f66865x76d1ec5a, this.f368071a);
        jSONObject.put("i", this.f368072b);
        f06.d a17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(this.f368073c.getClass());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "<this>");
        jSONObject.put("cb", ((i06.k1) a17).f368213e.getName());
        jSONObject.put("t", this.f368074d);
        jSONObject.put("o", this.f368075e);
        return jSONObject;
    }

    /* renamed from: equals */
    public boolean m134333xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i04.f)) {
            return false;
        }
        i04.f fVar = (i04.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368071a, fVar.f368071a) && this.f368072b == fVar.f368072b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368073c, fVar.f368073c) && this.f368074d == fVar.f368074d && this.f368075e == fVar.f368075e;
    }

    /* renamed from: hashCode */
    public int m134334x8cdac1b() {
        return (((((((this.f368071a.hashCode() * 31) + java.lang.Integer.hashCode(this.f368072b)) * 31) + this.f368073c.hashCode()) * 31) + java.lang.Long.hashCode(this.f368074d)) * 31) + java.lang.Boolean.hashCode(this.f368075e);
    }

    /* renamed from: toString */
    public java.lang.String m134335x9616526c() {
        return "MTimerTask(sessionId=" + this.f368071a + ", interval=" + this.f368072b + ", callback=" + this.f368073c + ", time=" + this.f368074d + ", offline=" + this.f368075e + ')';
    }
}

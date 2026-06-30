package pu2;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f439955a;

    /* renamed from: b, reason: collision with root package name */
    public final int f439956b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f439957c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f439958d;

    public a(int i17, int i18, org.json.JSONObject resultJson, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultJson, "resultJson");
        this.f439955a = i17;
        this.f439956b = i18;
        this.f439957c = resultJson;
        this.f439958d = map;
    }

    /* renamed from: equals */
    public boolean m159017xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu2.a)) {
            return false;
        }
        pu2.a aVar = (pu2.a) obj;
        return this.f439955a == aVar.f439955a && this.f439956b == aVar.f439956b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439957c, aVar.f439957c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439958d, aVar.f439958d);
    }

    /* renamed from: hashCode */
    public int m159018x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f439955a) * 31) + java.lang.Integer.hashCode(this.f439956b)) * 31) + this.f439957c.hashCode()) * 31;
        java.util.Map map = this.f439958d;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m159019x9616526c() {
        return "CollectorReportStruct(type=" + this.f439955a + ", scene=" + this.f439956b + ", resultJson=" + this.f439957c + ", extraData=" + this.f439958d + ')';
    }
}

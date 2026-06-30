package hr5;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final hr5.m f365939f;

    /* renamed from: a, reason: collision with root package name */
    public final float f365940a;

    /* renamed from: b, reason: collision with root package name */
    public final float f365941b;

    /* renamed from: c, reason: collision with root package name */
    public final float f365942c;

    /* renamed from: d, reason: collision with root package name */
    public final zq5.v f365943d;

    /* renamed from: e, reason: collision with root package name */
    public final zq5.v f365944e;

    static {
        zq5.v vVar = zq5.v.f556627f;
        f365939f = new hr5.m(1.0f, 1.0f, 1.0f, vVar, vVar);
    }

    public m(float f17, float f18, float f19, zq5.v baseTransform, zq5.v userTransform) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseTransform, "baseTransform");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userTransform, "userTransform");
        this.f365940a = f17;
        this.f365941b = f18;
        this.f365942c = f19;
        this.f365943d = baseTransform;
        this.f365944e = userTransform;
    }

    /* renamed from: equals */
    public boolean m134010xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr5.m)) {
            return false;
        }
        hr5.m mVar = (hr5.m) obj;
        return java.lang.Float.compare(this.f365940a, mVar.f365940a) == 0 && java.lang.Float.compare(this.f365941b, mVar.f365941b) == 0 && java.lang.Float.compare(this.f365942c, mVar.f365942c) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365943d, mVar.f365943d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f365944e, mVar.f365944e);
    }

    /* renamed from: hashCode */
    public int m134011x8cdac1b() {
        return (((((((java.lang.Float.hashCode(this.f365940a) * 31) + java.lang.Float.hashCode(this.f365941b)) * 31) + java.lang.Float.hashCode(this.f365942c)) * 31) + this.f365943d.m179348x8cdac1b()) * 31) + this.f365944e.m179348x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m134012x9616526c() {
        return "InitialZoom(minScale=" + this.f365940a + ", mediumScale=" + this.f365941b + ", maxScale=" + this.f365942c + ", baseTransform=" + this.f365943d + ", userTransform=" + this.f365944e + ')';
    }
}

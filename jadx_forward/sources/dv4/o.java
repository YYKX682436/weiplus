package dv4;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final float f325557a;

    /* renamed from: b, reason: collision with root package name */
    public final float f325558b;

    /* renamed from: c, reason: collision with root package name */
    public final float f325559c;

    /* renamed from: d, reason: collision with root package name */
    public final float f325560d;

    public o(float f17, float f18, float f19, float f27) {
        this.f325557a = f17;
        this.f325558b = f18;
        this.f325559c = f19;
        this.f325560d = f27;
    }

    public final org.json.JSONObject a() {
        return ri.l0.a(kz5.c1.k(new jz5.l("x1", java.lang.Float.valueOf(this.f325557a)), new jz5.l("y1", java.lang.Float.valueOf(this.f325558b)), new jz5.l("x2", java.lang.Float.valueOf(this.f325559c)), new jz5.l("y2", java.lang.Float.valueOf(this.f325560d))));
    }

    /* renamed from: equals */
    public boolean m126302xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv4.o)) {
            return false;
        }
        dv4.o oVar = (dv4.o) obj;
        return java.lang.Float.compare(this.f325557a, oVar.f325557a) == 0 && java.lang.Float.compare(this.f325558b, oVar.f325558b) == 0 && java.lang.Float.compare(this.f325559c, oVar.f325559c) == 0 && java.lang.Float.compare(this.f325560d, oVar.f325560d) == 0;
    }

    /* renamed from: hashCode */
    public int m126303x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f325557a) * 31) + java.lang.Float.hashCode(this.f325558b)) * 31) + java.lang.Float.hashCode(this.f325559c)) * 31) + java.lang.Float.hashCode(this.f325560d);
    }

    /* renamed from: toString */
    public java.lang.String m126304x9616526c() {
        return "SliceBox(x1=" + this.f325557a + ", y1=" + this.f325558b + ", x2=" + this.f325559c + ", y2=" + this.f325560d + ')';
    }
}

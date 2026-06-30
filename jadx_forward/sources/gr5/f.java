package gr5;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final gr5.f f356453e = new gr5.f(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f356454a;

    /* renamed from: b, reason: collision with root package name */
    public final float f356455b;

    /* renamed from: c, reason: collision with root package name */
    public final float f356456c;

    /* renamed from: d, reason: collision with root package name */
    public final float f356457d;

    public f(float f17, float f18, float f19, float f27) {
        this.f356454a = f17;
        this.f356455b = f18;
        this.f356456c = f19;
        this.f356457d = f27;
    }

    /* renamed from: equals */
    public boolean m132103xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.f)) {
            return false;
        }
        gr5.f fVar = (gr5.f) obj;
        return java.lang.Float.compare(this.f356454a, fVar.f356454a) == 0 && java.lang.Float.compare(this.f356455b, fVar.f356455b) == 0 && java.lang.Float.compare(this.f356456c, fVar.f356456c) == 0 && java.lang.Float.compare(this.f356457d, fVar.f356457d) == 0;
    }

    /* renamed from: hashCode */
    public int m132104x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f356454a) * 31) + java.lang.Float.hashCode(this.f356455b)) * 31) + java.lang.Float.hashCode(this.f356456c)) * 31) + java.lang.Float.hashCode(this.f356457d);
    }

    /* renamed from: toString */
    public java.lang.String m132105x9616526c() {
        return "ContainerWhitespace(left=" + this.f356454a + ", top=" + this.f356455b + ", right=" + this.f356456c + ", bottom=" + this.f356457d + ')';
    }
}

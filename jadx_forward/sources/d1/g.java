package d1;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final d1.g f307161e = new d1.g(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f307162a;

    /* renamed from: b, reason: collision with root package name */
    public final float f307163b;

    /* renamed from: c, reason: collision with root package name */
    public final float f307164c;

    /* renamed from: d, reason: collision with root package name */
    public final float f307165d;

    public g(float f17, float f18, float f19, float f27) {
        this.f307162a = f17;
        this.f307163b = f18;
        this.f307164c = f19;
        this.f307165d = f27;
    }

    public final long a() {
        float f17 = this.f307164c;
        float f18 = this.f307162a;
        float f19 = f18 + ((f17 - f18) / 2.0f);
        float f27 = this.f307165d;
        float f28 = this.f307163b;
        return d1.f.a(f19, f28 + ((f27 - f28) / 2.0f));
    }

    public final boolean b(d1.g other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f307164c > other.f307162a && other.f307164c > this.f307162a && this.f307165d > other.f307163b && other.f307165d > this.f307163b;
    }

    public final d1.g c(float f17, float f18) {
        return new d1.g(this.f307162a + f17, this.f307163b + f18, this.f307164c + f17, this.f307165d + f18);
    }

    public final d1.g d(long j17) {
        return new d1.g(this.f307162a + d1.e.c(j17), this.f307163b + d1.e.d(j17), this.f307164c + d1.e.c(j17), this.f307165d + d1.e.d(j17));
    }

    /* renamed from: equals */
    public boolean m123318xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1.g)) {
            return false;
        }
        d1.g gVar = (d1.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f307162a), java.lang.Float.valueOf(gVar.f307162a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f307163b), java.lang.Float.valueOf(gVar.f307163b)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f307164c), java.lang.Float.valueOf(gVar.f307164c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f307165d), java.lang.Float.valueOf(gVar.f307165d));
    }

    /* renamed from: hashCode */
    public int m123319x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f307162a) * 31) + java.lang.Float.hashCode(this.f307163b)) * 31) + java.lang.Float.hashCode(this.f307164c)) * 31) + java.lang.Float.hashCode(this.f307165d);
    }

    /* renamed from: toString */
    public java.lang.String m123320x9616526c() {
        return "Rect.fromLTRB(" + d1.c.a(this.f307162a, 1) + ", " + d1.c.a(this.f307163b, 1) + ", " + d1.c.a(this.f307164c, 1) + ", " + d1.c.a(this.f307165d, 1) + ')';
    }
}

package p2;

/* loaded from: classes14.dex */
public final class g implements p2.f {

    /* renamed from: d, reason: collision with root package name */
    public final float f432911d;

    /* renamed from: e, reason: collision with root package name */
    public final float f432912e;

    public g(float f17, float f18) {
        this.f432911d = f17;
        this.f432912e = f18;
    }

    @Override // p2.f
    public int G(float f17) {
        return p2.e.a(this, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return p2.e.d(this, j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * mo7005x9a59d0b2();
    }

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    /* renamed from: equals */
    public boolean m157732xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2.g)) {
            return false;
        }
        p2.g gVar = (p2.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f432911d), java.lang.Float.valueOf(gVar.f432911d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f432912e), java.lang.Float.valueOf(gVar.f432912e));
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f432911d;
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f432912e;
    }

    /* renamed from: hashCode */
    public int m157733x8cdac1b() {
        return (java.lang.Float.hashCode(this.f432911d) * 31) + java.lang.Float.hashCode(this.f432912e);
    }

    @Override // p2.f
    public float n(int i17) {
        return i17 / mo7005x9a59d0b2();
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / mo7005x9a59d0b2();
    }

    @Override // p2.f
    public long t(long j17) {
        return p2.e.e(this, j17);
    }

    /* renamed from: toString */
    public java.lang.String m157734x9616526c() {
        return "DensityImpl(density=" + this.f432911d + ", fontScale=" + this.f432912e + ')';
    }

    @Override // p2.f
    public long z(float f17) {
        return p2.e.f(this, f17);
    }
}

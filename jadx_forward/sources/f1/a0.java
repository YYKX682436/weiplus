package f1;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f339995a;

    /* renamed from: b, reason: collision with root package name */
    public final float f339996b;

    public a0(float f17, float f18) {
        this.f339995a = f17;
        this.f339996b = f18;
    }

    public final float[] a() {
        float f17 = this.f339995a;
        float f18 = this.f339996b;
        return new float[]{f17 / f18, 1.0f, ((1.0f - f17) - f18) / f18};
    }

    /* renamed from: equals */
    public boolean m128670xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1.a0)) {
            return false;
        }
        f1.a0 a0Var = (f1.a0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f339995a), java.lang.Float.valueOf(a0Var.f339995a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f339996b), java.lang.Float.valueOf(a0Var.f339996b));
    }

    /* renamed from: hashCode */
    public int m128671x8cdac1b() {
        return (java.lang.Float.hashCode(this.f339995a) * 31) + java.lang.Float.hashCode(this.f339996b);
    }

    /* renamed from: toString */
    public java.lang.String m128672x9616526c() {
        return "WhitePoint(x=" + this.f339995a + ", y=" + this.f339996b + ')';
    }
}

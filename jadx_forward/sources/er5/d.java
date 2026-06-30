package er5;

/* loaded from: classes5.dex */
public final class d implements gr5.d {

    /* renamed from: c, reason: collision with root package name */
    public static final er5.d f337766c;

    /* renamed from: d, reason: collision with root package name */
    public static final er5.d f337767d;

    /* renamed from: a, reason: collision with root package name */
    public final int f337768a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.Interpolator f337769b;

    static {
        android.view.animation.AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new android.view.animation.AccelerateDecelerateInterpolator();
        f337766c = new er5.d(300, accelerateDecelerateInterpolator);
        f337767d = new er5.d(0, accelerateDecelerateInterpolator);
    }

    public d(int i17, android.view.animation.Interpolator interpolator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interpolator, "interpolator");
        this.f337768a = i17;
        this.f337769b = interpolator;
    }

    /* renamed from: equals */
    public boolean m128068xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er5.d)) {
            return false;
        }
        er5.d dVar = (er5.d) obj;
        return this.f337768a == dVar.f337768a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337769b, dVar.f337769b);
    }

    /* renamed from: hashCode */
    public int m128069x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f337768a) * 31) + this.f337769b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m128070x9616526c() {
        return "ZoomAnimationSpec(durationMillis=" + this.f337768a + ", interpolator=" + this.f337769b + ')';
    }
}

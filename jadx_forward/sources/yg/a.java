package yg;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f543551a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f543552b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f543553c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f543554d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f543555e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f543556f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f543557g = 0;

    /* renamed from: equals */
    public boolean m176998xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg.a)) {
            return false;
        }
        yg.a aVar = (yg.a) obj;
        return java.lang.Float.compare(this.f543551a, aVar.f543551a) == 0 && java.lang.Float.compare(this.f543552b, aVar.f543552b) == 0 && this.f543553c == aVar.f543553c && this.f543554d == aVar.f543554d && java.lang.Float.compare(this.f543555e, aVar.f543555e) == 0 && this.f543556f == aVar.f543556f && this.f543557g == aVar.f543557g;
    }

    /* renamed from: hashCode */
    public int m176999x8cdac1b() {
        return (((((((((((java.lang.Float.hashCode(this.f543551a) * 31) + java.lang.Float.hashCode(this.f543552b)) * 31) + java.lang.Integer.hashCode(this.f543553c)) * 31) + java.lang.Integer.hashCode(this.f543554d)) * 31) + java.lang.Float.hashCode(this.f543555e)) * 31) + java.lang.Integer.hashCode(this.f543556f)) * 31) + java.lang.Integer.hashCode(this.f543557g);
    }

    /* renamed from: toString */
    public java.lang.String m177000x9616526c() {
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "fps(%.2f, %.2f, %d, %d, %.2f%%)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(this.f543551a), java.lang.Float.valueOf(this.f543552b), java.lang.Integer.valueOf(this.f543553c), java.lang.Integer.valueOf(this.f543554d), java.lang.Float.valueOf(this.f543555e * 100)}, 5));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}

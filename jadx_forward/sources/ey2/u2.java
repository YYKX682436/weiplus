package ey2;

/* loaded from: classes2.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f339077a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f339078b;

    /* renamed from: c, reason: collision with root package name */
    public final float f339079c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f339080d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f339081e;

    /* renamed from: f, reason: collision with root package name */
    public float f339082f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f339083g;

    public u2(long j17, boolean z17, float f17) {
        this.f339077a = j17;
        this.f339078b = z17;
        this.f339079c = f17;
        this.f339081e = j17;
        this.f339082f = f17;
        this.f339083g = z17;
    }

    /* renamed from: equals */
    public boolean m128391xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.u2)) {
            return false;
        }
        ey2.u2 u2Var = (ey2.u2) obj;
        return this.f339077a == u2Var.f339077a && this.f339078b == u2Var.f339078b && java.lang.Float.compare(this.f339079c, u2Var.f339079c) == 0;
    }

    /* renamed from: hashCode */
    public int m128392x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f339077a) * 31) + java.lang.Boolean.hashCode(this.f339078b)) * 31) + java.lang.Float.hashCode(this.f339079c);
    }

    /* renamed from: toString */
    public java.lang.String m128393x9616526c() {
        return "StartStateCache(pos=" + this.f339077a + ", isPauseOnStart=" + this.f339078b + ", speedRatio=" + this.f339079c + ')';
    }
}

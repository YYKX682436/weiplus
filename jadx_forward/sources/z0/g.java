package z0;

/* loaded from: classes14.dex */
public final class g implements z0.d {

    /* renamed from: b, reason: collision with root package name */
    public final float f550439b;

    /* renamed from: c, reason: collision with root package name */
    public final float f550440c;

    public g(float f17, float f18) {
        this.f550439b = f17;
        this.f550440c = f18;
    }

    public long a(long j17, long j18, p2.s layoutDirection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        float f17 = (((int) (j18 >> 32)) - ((int) (j17 >> 32))) / 2.0f;
        float b17 = (p2.q.b(j18) - p2.q.b(j17)) / 2.0f;
        p2.s sVar = p2.s.Ltr;
        float f18 = this.f550439b;
        if (layoutDirection != sVar) {
            f18 *= -1;
        }
        float f19 = 1;
        return p2.n.a(a06.d.b(f17 * (f18 + f19)), a06.d.b(b17 * (f19 + this.f550440c)));
    }

    /* renamed from: equals */
    public boolean m178210xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0.g)) {
            return false;
        }
        z0.g gVar = (z0.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f550439b), java.lang.Float.valueOf(gVar.f550439b)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f550440c), java.lang.Float.valueOf(gVar.f550440c));
    }

    /* renamed from: hashCode */
    public int m178211x8cdac1b() {
        return (java.lang.Float.hashCode(this.f550439b) * 31) + java.lang.Float.hashCode(this.f550440c);
    }

    /* renamed from: toString */
    public java.lang.String m178212x9616526c() {
        return "BiasAlignment(horizontalBias=" + this.f550439b + ", verticalBias=" + this.f550440c + ')';
    }
}

package z;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public double f550413a;

    /* renamed from: b, reason: collision with root package name */
    public double f550414b;

    public z(double d17, double d18) {
        this.f550413a = d17;
        this.f550414b = d18;
    }

    /* renamed from: equals */
    public boolean m178199xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z.z)) {
            return false;
        }
        z.z zVar = (z.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f550413a), java.lang.Double.valueOf(zVar.f550413a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f550414b), java.lang.Double.valueOf(zVar.f550414b));
    }

    /* renamed from: hashCode */
    public int m178200x8cdac1b() {
        return (java.lang.Double.hashCode(this.f550413a) * 31) + java.lang.Double.hashCode(this.f550414b);
    }

    /* renamed from: toString */
    public java.lang.String m178201x9616526c() {
        return "ComplexDouble(_real=" + this.f550413a + ", _imaginary=" + this.f550414b + ')';
    }
}

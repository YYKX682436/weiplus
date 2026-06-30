package q1;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f441017a;

    /* renamed from: b, reason: collision with root package name */
    public final float f441018b;

    public c(java.util.List coefficients, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coefficients, "coefficients");
        this.f441017a = coefficients;
        this.f441018b = f17;
    }

    /* renamed from: equals */
    public boolean m159257xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1.c)) {
            return false;
        }
        q1.c cVar = (q1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441017a, cVar.f441017a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f441018b), java.lang.Float.valueOf(cVar.f441018b));
    }

    /* renamed from: hashCode */
    public int m159258x8cdac1b() {
        return (this.f441017a.hashCode() * 31) + java.lang.Float.hashCode(this.f441018b);
    }

    /* renamed from: toString */
    public java.lang.String m159259x9616526c() {
        return "PolynomialFit(coefficients=" + this.f441017a + ", confidence=" + this.f441018b + ')';
    }
}

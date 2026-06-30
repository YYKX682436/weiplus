package gr5;

/* loaded from: classes13.dex */
public final class u implements gr5.h0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f356481b;

    public u(float f17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f356481b = (i17 & 1) != 0 ? 3.0f : f17;
    }

    @Override // gr5.h0
    public gr5.g0 a(long j17, long j18, long j19, gr5.n contentScale, float f17, float f18) {
        float max;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentScale, "contentScale");
        float f19 = this.f356481b;
        float f27 = f17 * f19;
        int i17 = gr5.n.f356474a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contentScale, gr5.m.f356473g)) {
            max = f19 * f27;
        } else {
            float max2 = zq5.h.c(j19) ? java.lang.Math.max(((int) (j19 >> 32)) / ((int) (j18 >> 32)), zq5.g.b(j19) / zq5.g.b(j18)) : 1.0f;
            if (f18 <= f17) {
                f18 = java.lang.Math.max(f27, java.lang.Math.max(java.lang.Math.max(((int) (j17 >> 32)) / ((int) (j18 >> 32)), zq5.g.b(j17) / zq5.g.b(j18)), max2));
            }
            max = java.lang.Math.max(f19 * f18, max2);
            f27 = f18;
        }
        return new gr5.g0(f17, f27, max);
    }

    /* renamed from: equals */
    public boolean m132122xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr5.u) && java.lang.Float.compare(this.f356481b, ((gr5.u) obj).f356481b) == 0;
    }

    /* renamed from: hashCode */
    public int m132123x8cdac1b() {
        return java.lang.Float.hashCode(this.f356481b);
    }

    /* renamed from: toString */
    public java.lang.String m132124x9616526c() {
        return "DynamicScalesCalculator(multiple=" + zq5.b.c(this.f356481b, 2) + ')';
    }
}

package gr5;

/* loaded from: classes13.dex */
public final class x implements gr5.h0 {
    @Override // gr5.h0
    public gr5.g0 a(long j17, long j18, long j19, gr5.n contentScale, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentScale, "contentScale");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(contentScale, gr5.m.f356473g) || f18 <= f17) {
            f18 = f17 * 0.0f;
        }
        return new gr5.g0(f17, f18, 0.0f * f18);
    }

    /* renamed from: equals */
    public boolean m132131xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.x)) {
            return false;
        }
        ((gr5.x) obj).getClass();
        return java.lang.Float.compare(0.0f, 0.0f) == 0;
    }

    /* renamed from: hashCode */
    public int m132132x8cdac1b() {
        return java.lang.Float.hashCode(0.0f);
    }

    /* renamed from: toString */
    public java.lang.String m132133x9616526c() {
        return "FixedScalesCalculator(multiple=" + zq5.b.c(0.0f, 2) + ')';
    }
}

package z;

/* loaded from: classes13.dex */
public final class b0 implements z.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f550125a;

    public b0(float f17, float f18, float f19, float f27) {
        this.f550125a = f19;
    }

    @Override // z.h0
    public float a(float f17) {
        if (f17 <= 0.0f || f17 >= 1.0f) {
            return f17;
        }
        float f18 = 0.0f;
        float f19 = 1.0f;
        while (true) {
            float f27 = (f18 + f19) / 2;
            float f28 = 3;
            float f29 = 1 - f27;
            float f37 = f27 * f27 * f27;
            float f38 = (0.4f * f28 * f29 * f29 * f27) + (this.f550125a * f28 * f29 * f27 * f27) + f37;
            if (java.lang.Math.abs(f17 - f38) < 0.001f) {
                return (0.0f * f28 * f29 * f29 * f27) + (f28 * 1.0f * f29 * f27 * f27) + f37;
            }
            if (f38 < f17) {
                f18 = f27;
            } else {
                f19 = f27;
            }
        }
    }

    /* renamed from: equals */
    public boolean m178140xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof z.b0)) {
            return false;
        }
        z.b0 b0Var = (z.b0) obj;
        b0Var.getClass();
        return (this.f550125a > b0Var.f550125a ? 1 : (this.f550125a == b0Var.f550125a ? 0 : -1)) == 0;
    }

    /* renamed from: hashCode */
    public int m178141x8cdac1b() {
        return (((((java.lang.Float.hashCode(0.4f) * 31) + java.lang.Float.hashCode(0.0f)) * 31) + java.lang.Float.hashCode(this.f550125a)) * 31) + java.lang.Float.hashCode(1.0f);
    }
}

package z;

/* loaded from: classes13.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public float f550301a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f550303c;

    /* renamed from: d, reason: collision with root package name */
    public double f550304d;

    /* renamed from: e, reason: collision with root package name */
    public double f550305e;

    /* renamed from: f, reason: collision with root package name */
    public double f550306f;

    /* renamed from: b, reason: collision with root package name */
    public double f550302b = java.lang.Math.sqrt(50.0d);

    /* renamed from: g, reason: collision with root package name */
    public float f550307g = 1.0f;

    public o1(float f17) {
        this.f550301a = f17;
    }

    public final long a(float f17, float f18, long j17) {
        double cos;
        double d17;
        if (!this.f550303c) {
            if (this.f550301a == Float.MAX_VALUE) {
                throw new java.lang.IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f19 = this.f550307g;
            double d18 = f19;
            double d19 = d18 * d18;
            if (f19 > 1.0f) {
                double d27 = this.f550302b;
                double d28 = d19 - 1;
                this.f550304d = ((-f19) * d27) + (d27 * java.lang.Math.sqrt(d28));
                double d29 = -this.f550307g;
                double d37 = this.f550302b;
                this.f550305e = (d29 * d37) - (d37 * java.lang.Math.sqrt(d28));
            } else if (f19 >= 0.0f && f19 < 1.0f) {
                this.f550306f = this.f550302b * java.lang.Math.sqrt(1 - d19);
            }
            this.f550303c = true;
        }
        float f27 = f17 - this.f550301a;
        double d38 = j17 / 1000.0d;
        float f28 = this.f550307g;
        if (f28 > 1.0f) {
            double d39 = f27;
            double d47 = this.f550305e;
            double d48 = f18;
            double d49 = this.f550304d;
            double d57 = d39 - (((d47 * d39) - d48) / (d47 - d49));
            double d58 = ((d39 * d47) - d48) / (d47 - d49);
            d17 = (java.lang.Math.exp(d47 * d38) * d57) + (java.lang.Math.exp(this.f550304d * d38) * d58);
            double d59 = this.f550305e;
            double exp = d57 * d59 * java.lang.Math.exp(d59 * d38);
            double d66 = this.f550304d;
            cos = exp + (d58 * d66 * java.lang.Math.exp(d66 * d38));
        } else {
            if (f28 == 1.0f) {
                double d67 = this.f550302b;
                double d68 = f27;
                double d69 = f18 + (d67 * d68);
                double d76 = d68 + (d69 * d38);
                double exp2 = java.lang.Math.exp((-d67) * d38) * d76;
                double exp3 = d76 * java.lang.Math.exp((-this.f550302b) * d38);
                double d77 = this.f550302b;
                d17 = exp2;
                cos = (exp3 * (-d77)) + (d69 * java.lang.Math.exp((-d77) * d38));
            } else {
                double d78 = 1 / this.f550306f;
                double d79 = this.f550302b;
                double d86 = f27;
                double d87 = d78 * ((f28 * d79 * d86) + f18);
                double exp4 = java.lang.Math.exp((-f28) * d79 * d38) * ((java.lang.Math.cos(this.f550306f * d38) * d86) + (java.lang.Math.sin(this.f550306f * d38) * d87));
                double d88 = this.f550302b;
                double d89 = (-d88) * exp4 * this.f550307g;
                double exp5 = java.lang.Math.exp((-r5) * d88 * d38);
                double d96 = this.f550306f;
                double sin = (-d96) * d86 * java.lang.Math.sin(d96 * d38);
                double d97 = this.f550306f;
                cos = d89 + (exp5 * (sin + (d87 * d97 * java.lang.Math.cos(d97 * d38))));
                d17 = exp4;
            }
        }
        return (java.lang.Float.floatToIntBits((float) cos) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (java.lang.Float.floatToIntBits((float) (d17 + this.f550301a)) << 32);
    }
}

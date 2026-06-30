package y;

/* loaded from: classes14.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f539915a;

    /* renamed from: b, reason: collision with root package name */
    public final float f539916b;

    public k1(float f17, p2.f density) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        this.f539915a = f17;
        float mo7005x9a59d0b2 = density.mo7005x9a59d0b2();
        float f18 = y.l1.f539927a;
        this.f539916b = mo7005x9a59d0b2 * 386.0878f * 160.0f * 0.84f;
    }

    public final y.j1 a(float f17) {
        double b17 = b(f17);
        float f18 = y.l1.f539927a;
        double d17 = f18 - 1.0d;
        return new y.j1(f17, (float) (this.f539915a * this.f539916b * java.lang.Math.exp((f18 / d17) * b17)), (long) (java.lang.Math.exp(b17 / d17) * 1000.0d));
    }

    public final double b(float f17) {
        y.b bVar = y.b.f539842a;
        return java.lang.Math.log((java.lang.Math.abs(f17) * 0.35f) / (this.f539915a * this.f539916b));
    }
}

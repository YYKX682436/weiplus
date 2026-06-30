package b1;

/* loaded from: classes14.dex */
public final class c implements p2.f {

    /* renamed from: d, reason: collision with root package name */
    public b1.b f16990d = b1.m.f16998a;

    /* renamed from: e, reason: collision with root package name */
    public b1.k f16991e;

    @Override // p2.f
    public int G(float f17) {
        return p2.e.a(this, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return p2.e.d(this, j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * getDensity();
    }

    public final long a() {
        return this.f16990d.a();
    }

    public final b1.k b(yz5.l block) {
        kotlin.jvm.internal.o.g(block, "block");
        b1.k kVar = new b1.k(block);
        this.f16991e = kVar;
        return kVar;
    }

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    @Override // p2.f
    public float getDensity() {
        return this.f16990d.getDensity().getDensity();
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f16990d.getDensity().getFontScale();
    }

    @Override // p2.f
    public float n(int i17) {
        return i17 / getDensity();
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / getDensity();
    }

    @Override // p2.f
    public long t(long j17) {
        return p2.e.e(this, j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return p2.e.f(this, f17);
    }
}

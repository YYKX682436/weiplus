package b1;

/* loaded from: classes14.dex */
public final class c implements p2.f {

    /* renamed from: d, reason: collision with root package name */
    public b1.b f98523d = b1.m.f98531a;

    /* renamed from: e, reason: collision with root package name */
    public b1.k f98524e;

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
        return f17 * mo7005x9a59d0b2();
    }

    public final long a() {
        return this.f98523d.a();
    }

    public final b1.k b(yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        b1.k kVar = new b1.k(block);
        this.f98524e = kVar;
        return kVar;
    }

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f98523d.mo9554x9a59d0b2().mo7005x9a59d0b2();
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f98523d.mo9554x9a59d0b2().mo7006xa2f3d785();
    }

    @Override // p2.f
    public float n(int i17) {
        return i17 / mo7005x9a59d0b2();
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / mo7005x9a59d0b2();
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

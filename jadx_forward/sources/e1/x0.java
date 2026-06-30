package e1;

/* loaded from: classes14.dex */
public final class x0 implements e1.e0 {

    /* renamed from: d, reason: collision with root package name */
    public float f327828d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f327829e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f327830f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f327831g;

    /* renamed from: h, reason: collision with root package name */
    public float f327832h;

    /* renamed from: i, reason: collision with root package name */
    public float f327833i;

    /* renamed from: m, reason: collision with root package name */
    public long f327834m;

    /* renamed from: n, reason: collision with root package name */
    public long f327835n;

    /* renamed from: o, reason: collision with root package name */
    public float f327836o;

    /* renamed from: p, reason: collision with root package name */
    public float f327837p;

    /* renamed from: q, reason: collision with root package name */
    public float f327838q;

    /* renamed from: r, reason: collision with root package name */
    public float f327839r;

    /* renamed from: s, reason: collision with root package name */
    public long f327840s;

    /* renamed from: t, reason: collision with root package name */
    public e1.a1 f327841t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f327842u;

    /* renamed from: v, reason: collision with root package name */
    public p2.f f327843v;

    public x0() {
        long j17 = e1.f0.f327785a;
        this.f327834m = j17;
        this.f327835n = j17;
        this.f327839r = 8.0f;
        this.f327840s = e1.i1.f327805b;
        this.f327841t = e1.v0.f327822a;
        this.f327843v = new p2.g(1.0f, 1.0f);
    }

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

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f327843v.mo7005x9a59d0b2();
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f327843v.mo7006xa2f3d785();
    }

    @Override // p2.f
    public float n(int i17) {
        return p2.e.b(this, i17);
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

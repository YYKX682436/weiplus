package s1;

/* loaded from: classes14.dex */
public final class x implements s1.x0, p2.f {

    /* renamed from: d, reason: collision with root package name */
    public final p2.s f483624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2.f f483625e;

    public x(p2.f density, p2.s layoutDirection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        this.f483624d = layoutDirection;
        this.f483625e = density;
    }

    @Override // p2.f
    public int G(float f17) {
        return this.f483625e.G(f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return this.f483625e.H(j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return this.f483625e.R(f17);
    }

    @Override // s1.x0
    public s1.u0 W(int i17, int i18, java.util.Map map, yz5.l lVar) {
        return s1.v0.a(this, i17, i18, map, lVar);
    }

    @Override // p2.f
    public long e(long j17) {
        return this.f483625e.e(j17);
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f483625e.mo7005x9a59d0b2();
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f483625e.mo7006xa2f3d785();
    }

    @Override // s1.u
    /* renamed from: getLayoutDirection */
    public p2.s mo7007x6fcfed3f() {
        return this.f483624d;
    }

    @Override // p2.f
    public float n(int i17) {
        return this.f483625e.n(i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return this.f483625e.o(f17);
    }

    @Override // p2.f
    public long t(long j17) {
        return this.f483625e.t(j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return this.f483625e.z(f17);
    }
}

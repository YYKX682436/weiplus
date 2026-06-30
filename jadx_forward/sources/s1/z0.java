package s1;

/* loaded from: classes14.dex */
public final class z0 implements s1.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final s1.t f483628d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.b1 f483629e;

    /* renamed from: f, reason: collision with root package name */
    public final s1.c1 f483630f;

    public z0(s1.t measurable, s1.b1 minMax, s1.c1 widthHeight) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(minMax, "minMax");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widthHeight, "widthHeight");
        this.f483628d = measurable;
        this.f483629e = minMax;
        this.f483630f = widthHeight;
    }

    @Override // s1.t
    public java.lang.Object g() {
        return this.f483628d.g();
    }

    @Override // s1.t
    public int i(int i17) {
        return this.f483628d.i(i17);
    }

    @Override // s1.t
    public int j(int i17) {
        return this.f483628d.j(i17);
    }

    @Override // s1.t
    public int k(int i17) {
        return this.f483628d.k(i17);
    }

    @Override // s1.t
    public int l(int i17) {
        return this.f483628d.l(i17);
    }

    @Override // s1.r0
    public s1.o1 m(long j17) {
        s1.c1 c1Var = s1.c1.Width;
        s1.b1 b1Var = s1.b1.Max;
        s1.b1 b1Var2 = this.f483629e;
        s1.t tVar = this.f483628d;
        if (this.f483630f == c1Var) {
            return new s1.a1(b1Var2 == b1Var ? tVar.l(p2.c.g(j17)) : tVar.k(p2.c.g(j17)), p2.c.g(j17));
        }
        return new s1.a1(p2.c.h(j17), b1Var2 == b1Var ? tVar.i(p2.c.h(j17)) : tVar.j(p2.c.h(j17)));
    }
}

package s1;

/* loaded from: classes14.dex */
public final class q implements s1.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final s1.t f483591d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.v f483592e;

    /* renamed from: f, reason: collision with root package name */
    public final s1.w f483593f;

    public q(s1.t measurable, s1.v minMax, s1.w widthHeight) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(minMax, "minMax");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widthHeight, "widthHeight");
        this.f483591d = measurable;
        this.f483592e = minMax;
        this.f483593f = widthHeight;
    }

    @Override // s1.t
    public java.lang.Object g() {
        return this.f483591d.g();
    }

    @Override // s1.t
    public int i(int i17) {
        return this.f483591d.i(i17);
    }

    @Override // s1.t
    public int j(int i17) {
        return this.f483591d.j(i17);
    }

    @Override // s1.t
    public int k(int i17) {
        return this.f483591d.k(i17);
    }

    @Override // s1.t
    public int l(int i17) {
        return this.f483591d.l(i17);
    }

    @Override // s1.r0
    public s1.o1 m(long j17) {
        s1.w wVar = s1.w.Width;
        s1.v vVar = s1.v.Max;
        s1.v vVar2 = this.f483592e;
        s1.t tVar = this.f483591d;
        if (this.f483593f == wVar) {
            return new s1.r(vVar2 == vVar ? tVar.l(p2.c.g(j17)) : tVar.k(p2.c.g(j17)), p2.c.g(j17));
        }
        return new s1.r(p2.c.h(j17), vVar2 == vVar ? tVar.i(p2.c.h(j17)) : tVar.j(p2.c.h(j17)));
    }
}

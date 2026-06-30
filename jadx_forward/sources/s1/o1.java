package s1;

/* loaded from: classes14.dex */
public abstract class o1 implements s1.y0 {

    /* renamed from: d, reason: collision with root package name */
    public int f483583d;

    /* renamed from: e, reason: collision with root package name */
    public int f483584e;

    /* renamed from: f, reason: collision with root package name */
    public long f483585f = p2.r.a(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public long f483586g = s1.q1.f483606a;

    public abstract void B(long j17, float f17, yz5.l lVar);

    public final void E() {
        this.f483583d = e06.p.f((int) (this.f483585f >> 32), p2.c.j(this.f483586g), p2.c.h(this.f483586g));
        this.f483584e = e06.p.f(p2.q.b(this.f483585f), p2.c.i(this.f483586g), p2.c.g(this.f483586g));
    }

    public final void N(long j17) {
        if (p2.q.a(this.f483585f, j17)) {
            return;
        }
        this.f483585f = j17;
        E();
    }

    public final void O(long j17) {
        if (p2.c.b(this.f483586g, j17)) {
            return;
        }
        this.f483586g = j17;
        E();
    }

    public java.lang.Object g() {
        return null;
    }

    public final long u() {
        int i17 = this.f483583d;
        long j17 = this.f483585f;
        return p2.n.a((i17 - ((int) (j17 >> 32))) / 2, (this.f483584e - p2.q.b(j17)) / 2);
    }

    public int x() {
        return p2.q.b(this.f483585f);
    }

    public int y() {
        return (int) (this.f483585f >> 32);
    }
}

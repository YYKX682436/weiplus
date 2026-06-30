package z;

/* loaded from: classes13.dex */
public final class b4 implements z.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final z.x3 f550133a;

    /* renamed from: b, reason: collision with root package name */
    public final z.j1 f550134b;

    /* renamed from: c, reason: collision with root package name */
    public final long f550135c;

    /* renamed from: d, reason: collision with root package name */
    public final long f550136d;

    public b4(z.x3 x3Var, z.j1 j1Var, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f550133a = x3Var;
        this.f550134b = j1Var;
        this.f550135c = (x3Var.e() + x3Var.g()) * 1000000;
        this.f550136d = j17 * 1000000;
    }

    @Override // z.r3
    public boolean a() {
        return true;
    }

    @Override // z.r3
    public z.w b(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValue, "targetValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        d(initialValue, targetValue, initialVelocity);
        return f(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, initialValue, targetValue, initialVelocity);
    }

    @Override // z.r3
    public z.w c(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValue, "targetValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        z.x3 x3Var = this.f550133a;
        long h17 = h(j17);
        long j18 = this.f550136d;
        long j19 = j17 + j18;
        long j27 = this.f550135c;
        return x3Var.c(h17, initialValue, targetValue, j19 > j27 ? f(j27 - j18, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // z.r3
    public long d(z.w initialValue, z.w targetValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValue, "targetValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        return com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
    }

    @Override // z.r3
    public z.w f(long j17, z.w initialValue, z.w targetValue, z.w initialVelocity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialValue, "initialValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetValue, "targetValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialVelocity, "initialVelocity");
        z.x3 x3Var = this.f550133a;
        long h17 = h(j17);
        long j18 = this.f550136d;
        long j19 = j17 + j18;
        long j27 = this.f550135c;
        return x3Var.f(h17, initialValue, targetValue, j19 > j27 ? f(j27 - j18, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    public final long h(long j17) {
        long j18 = this.f550136d;
        if (j17 + j18 <= 0) {
            return 0L;
        }
        long j19 = j17 + j18;
        long j27 = this.f550135c;
        long j28 = j19 / j27;
        return (this.f550134b == z.j1.Restart || j28 % ((long) 2) == 0) ? j19 - (j28 * j27) : ((j28 + 1) * j27) - j19;
    }
}

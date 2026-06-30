package z;

/* loaded from: classes13.dex */
public final class p0 implements z.p {

    /* renamed from: a, reason: collision with root package name */
    public final z.g0 f550311a;

    /* renamed from: b, reason: collision with root package name */
    public final z.j1 f550312b;

    /* renamed from: c, reason: collision with root package name */
    public final long f550313c;

    public p0(z.g0 g0Var, z.j1 j1Var, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f550311a = g0Var;
        this.f550312b = j1Var;
        this.f550313c = j17;
    }

    @Override // z.p
    public z.r3 a(z.w2 converter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(converter, "converter");
        return new z.b4(this.f550311a.a(converter), this.f550312b, this.f550313c, null);
    }

    /* renamed from: equals */
    public boolean m178178xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof z.p0)) {
            return false;
        }
        z.p0 p0Var = (z.p0) obj;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p0Var.f550311a, this.f550311a) && p0Var.f550312b == this.f550312b) {
            return (p0Var.f550313c > this.f550313c ? 1 : (p0Var.f550313c == this.f550313c ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178179x8cdac1b() {
        return (((this.f550311a.hashCode() * 31) + this.f550312b.hashCode()) * 31) + java.lang.Long.hashCode(this.f550313c);
    }
}

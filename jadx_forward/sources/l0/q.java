package l0;

/* loaded from: classes14.dex */
public final class q implements l0.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f395992a;

    /* renamed from: b, reason: collision with root package name */
    public final long f395993b;

    /* renamed from: c, reason: collision with root package name */
    public final long f395994c;

    /* renamed from: d, reason: collision with root package name */
    public final long f395995d;

    public q(long j17, long j18, long j19, long j27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f395992a = j17;
        this.f395993b = j18;
        this.f395994c = j19;
        this.f395995d = j27;
    }

    /* renamed from: equals */
    public boolean m144750xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(l0.q.class), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(obj.getClass()))) {
            return false;
        }
        l0.q qVar = (l0.q) obj;
        return e1.y.c(this.f395992a, qVar.f395992a) && e1.y.c(this.f395993b, qVar.f395993b) && e1.y.c(this.f395994c, qVar.f395994c) && e1.y.c(this.f395995d, qVar.f395995d);
    }

    /* renamed from: hashCode */
    public int m144751x8cdac1b() {
        int i17 = e1.y.f327854l;
        return (((((java.lang.Long.hashCode(this.f395992a) * 31) + java.lang.Long.hashCode(this.f395993b)) * 31) + java.lang.Long.hashCode(this.f395994c)) * 31) + java.lang.Long.hashCode(this.f395995d);
    }
}

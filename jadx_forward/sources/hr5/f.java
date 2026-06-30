package hr5;

/* loaded from: classes15.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.l f365865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hr5.l lVar) {
        super(0);
        this.f365865d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zq5.n nVar;
        hr5.l lVar = this.f365865d;
        if (!zq5.h.b(lVar.f365922a)) {
            long j17 = lVar.f365923b;
            if (!zq5.h.b(j17)) {
                int i17 = lVar.f365926e;
                if (!(i17 % 90 == 0)) {
                    throw new java.lang.IllegalArgumentException("rotation must be multiple of 90".toString());
                }
                if (i17 % 180 == 0) {
                    nVar = new zq5.n(0.0f, 0.0f, (int) (r1 >> 32), zq5.g.b(r1));
                } else {
                    long b17 = zq5.u.b(zq5.h.g(j17));
                    float b18 = zq5.l.b(b17) - zq5.l.c(b17);
                    float c17 = zq5.l.c(b17) - zq5.l.b(b17);
                    nVar = new zq5.n(b18, c17, zq5.g.b(j17) + b18, ((int) (j17 >> 32)) + c17);
                }
                long j18 = zq5.c.f556590b;
                long a17 = zq5.m.a(nVar.f556615a, nVar.f556616b);
                return new zq5.l(zq5.m.d(zq5.m.a(((int) (j18 >> 32)) - zq5.l.b(a17), zq5.c.a(j18) - zq5.l.c(a17)), lVar.c()));
            }
        }
        nVar = zq5.n.f556614e;
        long j182 = zq5.c.f556590b;
        long a172 = zq5.m.a(nVar.f556615a, nVar.f556616b);
        return new zq5.l(zq5.m.d(zq5.m.a(((int) (j182 >> 32)) - zq5.l.b(a172), zq5.c.a(j182) - zq5.l.c(a172)), lVar.c()));
    }
}

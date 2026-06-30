package y;

/* loaded from: classes14.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.h1 f539876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f539877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(y.h1 h1Var, long j17) {
        super(1);
        this.f539876d = h1Var;
        this.f539877e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17;
        y.g0 it = (y.g0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        long j18 = this.f539877e;
        y.h1 h1Var = this.f539876d;
        h1Var.getClass();
        if (h1Var.f539895i == null) {
            j17 = p2.m.f432921b;
        } else {
            n0.e5 e5Var = h1Var.f539894h;
            if (e5Var.mo128745x754a37bb() == null) {
                j17 = p2.m.f432921b;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h1Var.f539895i, e5Var.mo128745x754a37bb())) {
                j17 = p2.m.f432921b;
            } else {
                int ordinal = it.ordinal();
                if (ordinal == 0) {
                    j17 = p2.m.f432921b;
                } else if (ordinal == 1) {
                    j17 = p2.m.f432921b;
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    y.u uVar = (y.u) h1Var.f539893g.mo128745x754a37bb();
                    if (uVar != null) {
                        long j19 = ((p2.q) uVar.f539983b.mo146xb9724478(new p2.q(j18))).f432929a;
                        java.lang.Object mo128745x754a37bb = e5Var.mo128745x754a37bb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo128745x754a37bb);
                        p2.s sVar = p2.s.Ltr;
                        long a17 = ((z0.g) ((z0.d) mo128745x754a37bb)).a(j18, j19, sVar);
                        z0.d dVar = h1Var.f539895i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                        long a18 = ((z0.g) dVar).a(j18, j19, sVar);
                        j17 = p2.n.a(((int) (a17 >> 32)) - ((int) (a18 >> 32)), p2.m.b(a17) - p2.m.b(a18));
                    } else {
                        j17 = p2.m.f432921b;
                    }
                }
            }
        }
        return new p2.m(j17);
    }
}

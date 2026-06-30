package y;

/* loaded from: classes14.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.x1 f539990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f539991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(y.x1 x1Var, long j17) {
        super(1);
        this.f539990d = x1Var;
        this.f539991e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.l lVar;
        yz5.l lVar2;
        y.g0 it = (y.g0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        y.x1 x1Var = this.f539990d;
        x1Var.getClass();
        y.t1 t1Var = (y.t1) x1Var.f540008e.mo128745x754a37bb();
        long j17 = this.f539991e;
        long j18 = (t1Var == null || (lVar2 = t1Var.f539980a) == null) ? p2.m.f432921b : ((p2.m) lVar2.mo146xb9724478(new p2.q(j17))).f432923a;
        y.t1 t1Var2 = (y.t1) x1Var.f540009f.mo128745x754a37bb();
        long j19 = (t1Var2 == null || (lVar = t1Var2.f539980a) == null) ? p2.m.f432921b : ((p2.m) lVar.mo146xb9724478(new p2.q(j17))).f432923a;
        int ordinal = it.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                j18 = p2.m.f432921b;
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                j18 = j19;
            }
        }
        return new p2.m(j18);
    }
}

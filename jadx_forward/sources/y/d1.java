package y;

/* loaded from: classes14.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y.h1 f539859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f539860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(y.h1 h1Var, long j17) {
        super(1);
        this.f539859d = h1Var;
        this.f539860e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17;
        long j18;
        y.g0 it = (y.g0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        y.h1 h1Var = this.f539859d;
        h1Var.getClass();
        y.u uVar = (y.u) h1Var.f539892f.mo128745x754a37bb();
        long j19 = this.f539860e;
        if (uVar != null) {
            j17 = ((p2.q) uVar.f539983b.mo146xb9724478(new p2.q(j19))).f432929a;
        } else {
            j17 = j19;
        }
        y.u uVar2 = (y.u) h1Var.f539893g.mo128745x754a37bb();
        if (uVar2 != null) {
            j18 = ((p2.q) uVar2.f539983b.mo146xb9724478(new p2.q(j19))).f432929a;
        } else {
            j18 = j19;
        }
        int ordinal = it.ordinal();
        if (ordinal == 0) {
            j19 = j17;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            j19 = j18;
        }
        return new p2.q(j19);
    }
}

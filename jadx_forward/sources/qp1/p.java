package qp1;

/* loaded from: classes7.dex */
public class p implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qp1.k0 f447269a;

    public p(qp1.k0 k0Var) {
        this.f447269a = k0Var;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallPermissionUtil", "float window permission granted");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        qp1.q.c(this.f447269a, qp1.j0.Allow);
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallPermissionUtil", "onResultCancel ok:%b", java.lang.Boolean.valueOf(Ui));
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        qp1.q.c(this.f447269a, Ui ? qp1.j0.Allow : qp1.j0.Cancel);
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallPermissionUtil", "float window permission refused");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        qp1.q.c(this.f447269a, qp1.j0.Refuse);
    }
}

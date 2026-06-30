package vv1;

/* loaded from: classes3.dex */
public class m implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vv1.n f521956d;

    public m(vv1.n nVar) {
        this.f521956d = nVar;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.lang.String str = r1Var.f527062a;
        vv1.n nVar = this.f521956d;
        if (str.equals(nVar.f521958n.d())) {
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            java.lang.String str2 = r1Var.f527062a;
            t21.v2 h17 = t21.d3.h(str2);
            if (h17 != null) {
                nVar.b(h17.f496540e, h17.f496541f);
                if (h17.i()) {
                    tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = nVar.f521957m;
                    java.lang.String rj6 = ((k90.b) u0Var).rj(f9Var, bm5.f0.f104104s, f9Var.z0(), false);
                    if (com.p314xaae8f345.mm.vfs.w6.j(rj6)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFileWorker_Video", "notifyChanged notifyInfo:%s", str2);
                        nVar.l(h17, rj6);
                        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                        t21.o2.Ui().A(this);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFileWorker_Video", "video fullPath:%s isn't exist, return", rj6);
                    nVar.a();
                    ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                    t21.o2.Ui().A(this);
                }
            }
        }
    }
}

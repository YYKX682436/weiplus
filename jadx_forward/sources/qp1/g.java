package qp1;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f447254d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f447254d = c12886x91aa2b6d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f447254d;
        boolean z17 = c12886x91aa2b6d.f174589q.f174615d;
        qp1.i.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo ballCollapseInfo = c12886x91aa2b6d.f174589q;
        if (!ballCollapseInfo.f174615d || ballCollapseInfo.f174616e <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseHelper", "checkAutoCollapseWhenAdded taskId: " + currentTimeMillis);
        ku5.u0 u0Var = ku5.t0.f394148d;
        qp1.f fVar = new qp1.f(currentTimeMillis);
        long j17 = c12886x91aa2b6d.f174589q.f174616e;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c z18 = t0Var.z(fVar, j17, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z18);
        qp1.i.f447258a = new qp1.d(currentTimeMillis, z18);
    }
}

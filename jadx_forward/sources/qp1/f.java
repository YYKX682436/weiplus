package qp1;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447252d;

    public f(long j17) {
        this.f447252d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseHelper", "checkAutoCollapseWhenAdded run autoCollapseTask taskId: " + this.f447252d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e();
        e17.getClass();
        pm0.v.W(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.i0(e17, 3));
        ((ku5.t0) ku5.t0.f394148d).h(new qp1.e(this.f447252d), "MicroMsg.FloatBallCollapseHelper");
    }
}

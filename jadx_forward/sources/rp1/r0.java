package rp1;

/* loaded from: classes14.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.v0 f480051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f480052e;

    public r0(rp1.v0 v0Var, long j17) {
        this.f480051d = v0Var;
        this.f480052e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f480051d.f480070a, "checkIdleInner run taskId: " + this.f480052e);
        this.f480051d.d(true);
        ku5.u0 u0Var = ku5.t0.f394148d;
        rp1.v0 v0Var = this.f480051d;
        ((ku5.t0) u0Var).h(new rp1.q0(v0Var, this.f480052e), v0Var.f480070a);
    }
}

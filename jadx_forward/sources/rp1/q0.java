package rp1;

/* loaded from: classes14.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.v0 f480047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f480048e;

    public q0(rp1.v0 v0Var, long j17) {
        this.f480047d = v0Var;
        this.f480048e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rp1.n0 n0Var = this.f480047d.f480071b;
        boolean z17 = false;
        if (n0Var != null && n0Var.f480018a == this.f480048e) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f480047d.f480070a, "checkIdleInner task done.");
            this.f480047d.f480071b = null;
        }
    }
}

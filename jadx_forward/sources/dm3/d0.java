package dm3;

/* loaded from: classes11.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.e0 f323208d;

    public d0(dm3.e0 e0Var) {
        this.f323208d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm3.e0 e0Var = this.f323208d;
        if (e0Var.f323225x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.o(), "startTimerToReplace overTime and replace player");
            b66.n nVar = e0Var.f323214m;
            if (nVar != null) {
                e0Var.f323217p = true;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Vi(true);
                dm3.e0.m(e0Var, e0Var.q(), nVar);
            }
            jm4.n2 q17 = e0Var.q();
            e0Var.f323214m = q17 != null ? ((jm4.p2) q17).f() : null;
            b66.n nVar2 = e0Var.f323214m;
            if (nVar2 != null) {
                ((b66.q) nVar2).a(e0Var.f323219r);
            }
        }
    }
}

package sj3;

/* loaded from: classes5.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f490338d;

    public x3(sj3.d4 d4Var) {
        this.f490338d = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        sj3.q3 q3Var = this.f490338d.f490008d;
        if (q3Var != null) {
            q3Var.d();
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            sj3.w3 w3Var = new sj3.w3(this.f490338d);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(w3Var, 2000L, false);
        }
    }
}

package mi1;

/* loaded from: classes7.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.j0 f408143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.m0 f408144e;

    public l0(mi1.j0 j0Var, mi1.m0 m0Var) {
        this.f408143d = j0Var;
        this.f408144e = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        mi1.j0 j0Var = this.f408143d;
        j0Var.f408123f = uptimeMillis;
        mi1.m0 m0Var = this.f408144e;
        boolean d17 = m0Var.d(m0Var.f408151d, j0Var);
        if (d17) {
            j0Var.f408125h = 0;
        }
        if (j0Var.f408118a == 1) {
            m0Var.d(m0Var.f408153f, j0Var);
        }
        if (d17) {
            m0Var.b();
        }
    }
}

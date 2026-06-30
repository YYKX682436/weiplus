package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.g0 f90734d;

    public p(p012xc85e97e9.p016x746ad0e3.app.g0 g0Var) {
        this.f90734d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = this.f90734d;
        if ((g0Var.R & 1) != 0) {
            g0Var.n(0);
        }
        if ((g0Var.R & 4096) != 0) {
            g0Var.n(108);
        }
        g0Var.Q = false;
        g0Var.R = 0;
    }
}

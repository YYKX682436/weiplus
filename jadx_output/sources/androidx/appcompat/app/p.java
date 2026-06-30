package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g0 f9201d;

    public p(androidx.appcompat.app.g0 g0Var) {
        this.f9201d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.app.g0 g0Var = this.f9201d;
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

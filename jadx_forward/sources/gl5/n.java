package gl5;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f354578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354579e;

    public n(gl5.e0 e0Var, gl5.k kVar) {
        this.f354579e = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f354578d) {
            return;
        }
        gl5.e0 e0Var = this.f354579e;
        e0Var.U.removeCallbacks(this);
        if (e0Var.E()) {
            if (e0Var.U.m81661x22f21e20() != null) {
                e0Var.U.P();
            }
            e0Var.U.postDelayed(this, 500L);
        }
    }
}

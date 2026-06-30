package z63;

/* loaded from: classes5.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.a1 f551986d;

    public z0(z63.a1 a1Var) {
        this.f551986d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        z63.a1 a1Var = this.f551986d;
        z63.f1 f1Var = a1Var.f551898d;
        f1Var.f551918f.getLocationInWindow(f1Var.f551929q);
        z63.f1 f1Var2 = a1Var.f551898d;
        f1Var2.f551926n = (f1Var2.f551918f.getWidth() - f1Var2.f551917e.getWidth()) - i65.a.b(f1Var2.f551914b, 8);
        f1Var2.f551927o = (f1Var2.f551929q[1] - f1Var2.f551917e.getHeight()) - i65.a.b(f1Var2.f551914b, 8);
        z63.d1 d1Var = f1Var2.f551933u;
        if (d1Var != null) {
            if (!(((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t2) d1Var).f272194a.f271503d2 == 0)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ed edVar = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t2) d1Var).f272194a.J2;
                f1Var2.f551927o += edVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ac) edVar).a() : 0;
            }
        }
        f1Var2.f551913a = android.animation.ValueAnimator.ofInt(f1Var2.f551928p, f1Var2.f551927o);
        f1Var2.f551913a.setDuration(175L);
        f1Var2.f551913a.setInterpolator(new y3.b());
        f1Var2.f551913a.addUpdateListener(new z63.y0(this));
        f1Var2.f551913a.start();
        f1Var2.f551928p = f1Var2.f551927o;
    }
}

package gl5;

/* loaded from: classes15.dex */
public class w implements gl5.p {

    /* renamed from: d, reason: collision with root package name */
    public gl5.u f354638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354639e;

    public w(gl5.e0 e0Var) {
        this.f354639e = e0Var;
    }

    @Override // gl5.p
    public boolean a() {
        gl5.u uVar = this.f354638d;
        return uVar != null && uVar.k();
    }

    public gl5.u b() {
        if (this.f354638d == null) {
            gl5.e0 e0Var = this.f354639e;
            e0Var.w(false);
            this.f354638d = new gl5.u(e0Var, e0Var.I);
        }
        return this.f354638d;
    }

    @Override // gl5.p
    public boolean e() {
        gl5.u uVar = this.f354638d;
        return uVar != null && uVar.f354599o;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z17) {
        gl5.u uVar;
        if (z17 || (uVar = this.f354638d) == null) {
            return;
        }
        uVar.i();
    }

    @Override // gl5.p
    /* renamed from: show */
    public void mo131740x35dafd() {
        b().o();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        float[] fArr = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.f293104o2;
        long j17 = uptimeMillis - 0;
        gl5.e0 e0Var = this.f354639e;
        java.lang.Runnable runnable = e0Var.P;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
        gl5.f0 f0Var = e0Var.O;
        if (runnable != null) {
            int i17 = f0Var.f354510e;
            if ((i17 == 2 || i17 == 3) || e0Var.u()) {
                viewTreeObserverOnPreDrawListenerC22668xe0605023.removeCallbacks(e0Var.P);
            }
        }
        int i18 = f0Var.f354510e;
        if (!(i18 == 2 || i18 == 3) && !e0Var.u() && j17 < 15000 && e0Var.t()) {
            if (e0Var.P == null) {
                e0Var.P = new gl5.v(this);
            }
            viewTreeObserverOnPreDrawListenerC22668xe0605023.postDelayed(e0Var.P, android.view.ViewConfiguration.getDoubleTapTimeout() + 1);
        }
        b().t();
        gl5.b0 b0Var = e0Var.f354477b;
        if (b0Var != null) {
            b0Var.c();
        }
    }
}

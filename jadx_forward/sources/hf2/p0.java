package hf2;

/* loaded from: classes5.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f362668d;

    public p0(hf2.y0 y0Var) {
        this.f362668d = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = this.f362668d.f362733a.N6();
        android.view.WindowManager.LayoutParams attributes = (N6 == null || (window = N6.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.softInputMode = 48;
        }
        hf2.y0 y0Var = this.f362668d;
        if (y0Var.f362736d == null) {
            y0Var.f362736d = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(y0Var.f362733a.N6());
            hf2.y0 y0Var2 = this.f362668d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = y0Var2.f362736d;
            if (f5Var != null) {
                f5Var.f291933e = new hf2.o0(y0Var2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f362668d.f362736d;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}

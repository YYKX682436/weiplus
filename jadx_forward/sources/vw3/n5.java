package vw3;

/* loaded from: classes.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw3.q5 f522575d;

    public n5(vw3.q5 q5Var) {
        this.f522575d = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vw3.q5 q5Var = this.f522575d;
        java.lang.Object systemService = q5Var.f522617f.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(q5Var.f522621m, 0);
    }
}

package im2;

/* loaded from: classes.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f373946e;

    public k0(im2.z3 z3Var, android.view.View view) {
        this.f373945d = z3Var;
        this.f373946e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = this.f373945d.m80379x76847179().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(this.f373946e.getWindowToken(), 0);
    }
}

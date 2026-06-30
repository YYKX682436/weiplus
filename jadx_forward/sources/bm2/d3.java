package bm2;

/* loaded from: classes3.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.z2 f103376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f103377e;

    public d3(bm2.z2 z2Var, android.widget.EditText editText) {
        this.f103376d = z2Var;
        this.f103377e = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.z2 z2Var = this.f103376d;
        z2Var.f104011d.requestFocus();
        java.lang.Object systemService = this.f103377e.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(z2Var.f104011d, 2);
    }
}

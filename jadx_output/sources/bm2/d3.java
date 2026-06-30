package bm2;

/* loaded from: classes3.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.z2 f21843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f21844e;

    public d3(bm2.z2 z2Var, android.widget.EditText editText) {
        this.f21843d = z2Var;
        this.f21844e = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.z2 z2Var = this.f21843d;
        z2Var.f22478d.requestFocus();
        java.lang.Object systemService = this.f21844e.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(z2Var.f22478d, 2);
    }
}

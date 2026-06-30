package bm2;

/* loaded from: classes3.dex */
public final class c3 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.z2 f21811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f21812e;

    public c3(bm2.z2 z2Var, android.widget.EditText editText) {
        this.f21811d = z2Var;
        this.f21812e = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (6 != i17) {
            return false;
        }
        bm2.z2 z2Var = this.f21811d;
        z2Var.f22478d.clearFocus();
        java.lang.Object systemService = this.f21812e.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(z2Var.f22478d.getWindowToken(), 0);
        return true;
    }
}

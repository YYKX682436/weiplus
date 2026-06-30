package bm2;

/* loaded from: classes3.dex */
public final class c3 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.z2 f103344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f103345e;

    public c3(bm2.z2 z2Var, android.widget.EditText editText) {
        this.f103344d = z2Var;
        this.f103345e = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (6 != i17) {
            return false;
        }
        bm2.z2 z2Var = this.f103344d;
        z2Var.f104011d.clearFocus();
        java.lang.Object systemService = this.f103345e.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(z2Var.f104011d.getWindowToken(), 0);
        return true;
    }
}

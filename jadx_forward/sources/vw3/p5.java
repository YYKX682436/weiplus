package vw3;

/* loaded from: classes.dex */
public final class p5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw3.q5 f522602d;

    public p5(vw3.q5 q5Var) {
        this.f522602d = q5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        vw3.q5 q5Var = this.f522602d;
        java.lang.Object systemService = q5Var.f522617f.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        android.widget.EditText editText = q5Var.f522621m;
        inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
    }
}

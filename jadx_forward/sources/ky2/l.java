package ky2;

/* loaded from: classes.dex */
public final class l implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f395094f;

    public l(ky2.w wVar, int i17, android.widget.EditText editText) {
        this.f395092d = wVar;
        this.f395093e = i17;
        this.f395094f = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (6 != i17) {
            return false;
        }
        ky2.r rVar = (ky2.r) this.f395092d.f395118e.get(this.f395093e);
        android.widget.EditText editText = this.f395094f;
        java.lang.String obj = r26.n0.u0(editText.getText().toString()).toString();
        rVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        rVar.f395108a = obj;
        editText.clearFocus();
        java.lang.Object systemService = editText.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        return true;
    }
}

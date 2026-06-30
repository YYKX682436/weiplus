package in2;

/* loaded from: classes10.dex */
public final class w implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f374447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f374449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in2.t f374450g;

    public w(in2.f0 f0Var, int i17, android.widget.EditText editText, in2.t tVar) {
        this.f374447d = f0Var;
        this.f374448e = i17;
        this.f374449f = editText;
        this.f374450g = tVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (6 != i17) {
            return false;
        }
        in2.f0 f0Var = this.f374447d;
        dk2.yg ygVar = (dk2.yg) f0Var.f374359h.get(this.f374448e);
        android.widget.EditText editText = this.f374449f;
        java.lang.String obj = r26.n0.u0(editText.getText().toString()).toString();
        ygVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        ygVar.f315926a = obj;
        android.content.Context context = editText.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!f0Var.x(context)) {
            return true;
        }
        in2.t tVar = this.f374450g;
        tVar.f374435h.clearFocus();
        java.lang.Object systemService = editText.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(tVar.f374435h.getWindowToken(), 0);
        f0Var.f374367s = false;
        return true;
    }
}

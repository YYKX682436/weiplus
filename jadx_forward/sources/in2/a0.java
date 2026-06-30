package in2;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f374323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f374324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in2.t f374325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f374326g;

    public a0(int i17, in2.f0 f0Var, in2.t tVar, android.widget.EditText editText) {
        this.f374323d = i17;
        this.f374324e = f0Var;
        this.f374325f = tVar;
        this.f374326g = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        boolean hasFocus = view.hasFocus();
        android.widget.EditText editText = this.f374326g;
        int i17 = this.f374323d;
        in2.t tVar = this.f374325f;
        in2.f0 f0Var = this.f374324e;
        if (!hasFocus) {
            dk2.yg ygVar = (dk2.yg) f0Var.f374359h.get(i17);
            java.lang.String obj = r26.n0.u0(editText.getText().toString()).toString();
            ygVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
            ygVar.f315926a = obj;
            tVar.f374433f.setVisibility(8);
            return;
        }
        if (i17 != f0Var.f374365q) {
            android.content.Context context = tVar.f374435h.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (!f0Var.x(context) && f0Var.f374365q >= 0 && f0Var.f374368t) {
                f0Var.f374368t = false;
                view.post(new in2.x(editText, f0Var));
                return;
            }
        }
        tVar.f374433f.setVisibility(0);
        tVar.f3639x46306858.post(new in2.z(i17, f0Var, tVar));
    }
}

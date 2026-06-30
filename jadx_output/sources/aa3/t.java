package aa3;

/* loaded from: classes7.dex */
public final class t implements aa3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f2593d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f2594e;

    /* renamed from: f, reason: collision with root package name */
    public final aa3.b f2595f;

    /* renamed from: g, reason: collision with root package name */
    public int f2596g;

    /* renamed from: h, reason: collision with root package name */
    public final aa3.k0 f2597h;

    /* renamed from: i, reason: collision with root package name */
    public final nl1.b f2598i;

    public t(android.view.View appBrandPageView, android.view.inputmethod.InputConnection inputConnection, aa3.b keyboardAction) {
        aa3.k0 k0Var;
        kotlin.jvm.internal.o.g(appBrandPageView, "appBrandPageView");
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        kotlin.jvm.internal.o.g(keyboardAction, "keyboardAction");
        this.f2593d = appBrandPageView;
        this.f2594e = inputConnection;
        this.f2595f = keyboardAction;
        aa3.r rVar = new aa3.r(this);
        int i17 = aa3.k0.f2543o;
        aa3.k0 k0Var2 = (aa3.k0) appBrandPageView.getRootView().findViewById(com.tencent.mm.R.id.f483159y6);
        if (k0Var2 == null) {
            md.f b17 = md.f.b(appBrandPageView);
            if (b17 == null) {
                k0Var = null;
                k0Var.setOnDoneListener(rVar);
                this.f2597h = k0Var;
                this.f2598i = new aa3.s(this);
            }
            aa3.k0 k0Var3 = new aa3.k0(appBrandPageView.getContext());
            b17.a(k0Var3, false);
            k0Var2 = k0Var3;
        }
        k0Var = k0Var2;
        k0Var.setOnDoneListener(rVar);
        this.f2597h = k0Var;
        this.f2598i = new aa3.s(this);
    }

    @Override // aa3.c
    public void a(boolean z17) {
    }

    @Override // aa3.c
    public void b() {
        this.f2593d.requestFocus();
        int i17 = this.f2596g;
        aa3.k0 k0Var = this.f2597h;
        k0Var.setXMode(i17);
        nl1.b bVar = this.f2598i;
        if (bVar != null) {
            k0Var.setInputEventReceiver(bVar);
            k0Var.setVisibility(0);
        }
        ((aa3.o) this.f2595f).f2567a.d();
    }

    @Override // aa3.c
    public android.view.View getView() {
        return this.f2597h;
    }

    @Override // aa3.c
    public void hideKeyboard() {
        aa3.k0 k0Var = this.f2597h;
        k0Var.setVisibility(8);
        android.widget.EditText editText = k0Var.f2549i;
        if (editText != null) {
            editText.clearFocus();
            k0Var.f2549i = null;
            k0Var.f2547g = null;
            k0Var.f2546f = false;
        }
        this.f2593d.clearFocus();
        aa3.o oVar = (aa3.o) this.f2595f;
        oVar.getClass();
        oVar.f2567a.e(android.graphics.Insets.of(0, 0, 0, 0));
        if (k0Var.getParent() != null) {
            android.view.ViewParent parent = k0Var.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(k0Var);
        }
    }

    @Override // aa3.c
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        this.f2594e = inputConnection;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        return this.f2597h.q();
    }

    @Override // aa3.c
    public void setXMode(int i17) {
        this.f2596g = i17;
        this.f2597h.setXMode(i17);
    }
}

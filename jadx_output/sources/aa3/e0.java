package aa3;

/* loaded from: classes9.dex */
public final class e0 implements aa3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f2515d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f2516e;

    /* renamed from: f, reason: collision with root package name */
    public final aa3.b f2517f;

    /* renamed from: g, reason: collision with root package name */
    public final aa3.x0 f2518g;

    /* renamed from: h, reason: collision with root package name */
    public final nl1.b f2519h;

    public e0(android.view.View appBrandPageView, android.view.inputmethod.InputConnection inputConnection, aa3.b keyboardAction) {
        aa3.x0 x0Var;
        kotlin.jvm.internal.o.g(appBrandPageView, "appBrandPageView");
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        kotlin.jvm.internal.o.g(keyboardAction, "keyboardAction");
        this.f2515d = appBrandPageView;
        this.f2516e = inputConnection;
        this.f2517f = keyboardAction;
        int i17 = aa3.x0.f2610t;
        aa3.x0 x0Var2 = (aa3.x0) appBrandPageView.getRootView().findViewById(com.tencent.mm.R.id.pyp);
        if (x0Var2 == null) {
            md.f b17 = md.f.b(appBrandPageView);
            if (b17 == null) {
                x0Var = null;
                this.f2518g = x0Var;
                this.f2519h = new aa3.c0(this);
            } else {
                aa3.x0 x0Var3 = new aa3.x0(appBrandPageView.getContext());
                b17.a(x0Var3, false);
                x0Var2 = x0Var3;
            }
        }
        x0Var = x0Var2;
        this.f2518g = x0Var;
        this.f2519h = new aa3.c0(this);
    }

    @Override // aa3.c
    public void a(boolean z17) {
    }

    @Override // aa3.c
    public void b() {
        this.f2515d.requestFocus();
        aa3.l.f2552a.d(this.f2518g, new aa3.d0(this));
    }

    @Override // aa3.c
    public android.view.View getView() {
        return this.f2518g;
    }

    @Override // aa3.c
    public void hideKeyboard() {
        aa3.l.f2552a.c(this.f2518g, new aa3.b0(this));
    }

    @Override // aa3.c
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        this.f2516e = inputConnection;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        aa3.x0 x0Var = this.f2518g;
        kotlin.jvm.internal.o.d(x0Var);
        return x0Var.q();
    }

    @Override // aa3.c
    public void setXMode(int i17) {
    }
}

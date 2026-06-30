package aa3;

/* loaded from: classes15.dex */
public final class z implements aa3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f2625d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f2626e;

    /* renamed from: f, reason: collision with root package name */
    public final aa3.b f2627f;

    /* renamed from: g, reason: collision with root package name */
    public final aa3.p0 f2628g;

    /* renamed from: h, reason: collision with root package name */
    public final nl1.b f2629h;

    public z(android.view.View appBrandPageView, java.lang.String inputType, android.view.inputmethod.InputConnection inputConnection, aa3.b keyboardAction) {
        aa3.p0 p0Var;
        kotlin.jvm.internal.o.g(appBrandPageView, "appBrandPageView");
        kotlin.jvm.internal.o.g(inputType, "inputType");
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        kotlin.jvm.internal.o.g(keyboardAction, "keyboardAction");
        this.f2625d = appBrandPageView;
        this.f2626e = inputConnection;
        this.f2627f = keyboardAction;
        aa3.w wVar = new aa3.w(this);
        int i17 = aa3.p0.f2569p;
        aa3.p0 p0Var2 = (aa3.p0) appBrandPageView.getRootView().findViewById(com.tencent.mm.R.id.f485560i43);
        if (p0Var2 == null || !inputType.equals(p0Var2.f2570d)) {
            md.f b17 = md.f.b(appBrandPageView);
            if (b17 == null) {
                p0Var = null;
                p0Var.setOnDoneListener(wVar);
                this.f2628g = p0Var;
                this.f2629h = new aa3.x(this);
            }
            aa3.p0 p0Var3 = new aa3.p0(appBrandPageView.getContext());
            p0Var3.f2570d = inputType;
            b17.a(p0Var3, false);
            p0Var2 = p0Var3;
        }
        p0Var = p0Var2;
        p0Var.setOnDoneListener(wVar);
        this.f2628g = p0Var;
        this.f2629h = new aa3.x(this);
    }

    @Override // aa3.c
    public void a(boolean z17) {
    }

    @Override // aa3.c
    public void b() {
        this.f2625d.requestFocus();
        aa3.l.f2552a.d(this.f2628g, new aa3.y(this));
    }

    @Override // aa3.c
    public android.view.View getView() {
        return this.f2628g;
    }

    @Override // aa3.c
    public void hideKeyboard() {
        aa3.l.f2552a.c(this.f2628g, new aa3.v(this));
    }

    @Override // aa3.c
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        kotlin.jvm.internal.o.g(inputConnection, "inputConnection");
        this.f2626e = inputConnection;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        return this.f2628g.q();
    }

    @Override // aa3.c
    public void setXMode(int i17) {
        this.f2628g.setXMode(i17);
    }
}

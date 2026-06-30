package aa3;

/* loaded from: classes7.dex */
public final class t implements aa3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f84126d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f84127e;

    /* renamed from: f, reason: collision with root package name */
    public final aa3.b f84128f;

    /* renamed from: g, reason: collision with root package name */
    public int f84129g;

    /* renamed from: h, reason: collision with root package name */
    public final aa3.k0 f84130h;

    /* renamed from: i, reason: collision with root package name */
    public final nl1.b f84131i;

    public t(android.view.View appBrandPageView, android.view.inputmethod.InputConnection inputConnection, aa3.b keyboardAction) {
        aa3.k0 k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandPageView, "appBrandPageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyboardAction, "keyboardAction");
        this.f84126d = appBrandPageView;
        this.f84127e = inputConnection;
        this.f84128f = keyboardAction;
        aa3.r rVar = new aa3.r(this);
        int i17 = aa3.k0.f84076o;
        aa3.k0 k0Var2 = (aa3.k0) appBrandPageView.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564692y6);
        if (k0Var2 == null) {
            md.f b17 = md.f.b(appBrandPageView);
            if (b17 == null) {
                k0Var = null;
                k0Var.m902x87046ad7(rVar);
                this.f84130h = k0Var;
                this.f84131i = new aa3.s(this);
            }
            aa3.k0 k0Var3 = new aa3.k0(appBrandPageView.getContext());
            b17.a(k0Var3, false);
            k0Var2 = k0Var3;
        }
        k0Var = k0Var2;
        k0Var.m902x87046ad7(rVar);
        this.f84130h = k0Var;
        this.f84131i = new aa3.s(this);
    }

    @Override // aa3.c
    public void a(boolean z17) {
    }

    @Override // aa3.c
    public void b() {
        this.f84126d.requestFocus();
        int i17 = this.f84129g;
        aa3.k0 k0Var = this.f84130h;
        k0Var.m903x53eb72f9(i17);
        nl1.b bVar = this.f84131i;
        if (bVar != null) {
            k0Var.m901x9a97bb01(bVar);
            k0Var.setVisibility(0);
        }
        ((aa3.o) this.f84128f).f84100a.d();
    }

    @Override // aa3.c
    /* renamed from: getView */
    public android.view.View mo890xfb86a31b() {
        return this.f84130h;
    }

    @Override // aa3.c
    /* renamed from: hideKeyboard */
    public void mo891x3f895349() {
        aa3.k0 k0Var = this.f84130h;
        k0Var.setVisibility(8);
        android.widget.EditText editText = k0Var.f84082i;
        if (editText != null) {
            editText.clearFocus();
            k0Var.f84082i = null;
            k0Var.f84080g = null;
            k0Var.f84079f = false;
        }
        this.f84126d.clearFocus();
        aa3.o oVar = (aa3.o) this.f84128f;
        oVar.getClass();
        oVar.f84100a.e(android.graphics.Insets.of(0, 0, 0, 0));
        if (k0Var.getParent() != null) {
            android.view.ViewParent parent = k0Var.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(k0Var);
        }
    }

    @Override // aa3.c
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        this.f84127e = inputConnection;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        return this.f84130h.q();
    }

    @Override // aa3.c
    /* renamed from: setXMode */
    public void mo892x53eb72f9(int i17) {
        this.f84129g = i17;
        this.f84130h.m903x53eb72f9(i17);
    }
}

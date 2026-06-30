package aa3;

/* loaded from: classes9.dex */
public final class e0 implements aa3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f84048d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f84049e;

    /* renamed from: f, reason: collision with root package name */
    public final aa3.b f84050f;

    /* renamed from: g, reason: collision with root package name */
    public final aa3.x0 f84051g;

    /* renamed from: h, reason: collision with root package name */
    public final nl1.b f84052h;

    public e0(android.view.View appBrandPageView, android.view.inputmethod.InputConnection inputConnection, aa3.b keyboardAction) {
        aa3.x0 x0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandPageView, "appBrandPageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyboardAction, "keyboardAction");
        this.f84048d = appBrandPageView;
        this.f84049e = inputConnection;
        this.f84050f = keyboardAction;
        int i17 = aa3.x0.f84143t;
        aa3.x0 x0Var2 = (aa3.x0) appBrandPageView.getRootView().findViewById(com.p314xaae8f345.mm.R.id.pyp);
        if (x0Var2 == null) {
            md.f b17 = md.f.b(appBrandPageView);
            if (b17 == null) {
                x0Var = null;
                this.f84051g = x0Var;
                this.f84052h = new aa3.c0(this);
            } else {
                aa3.x0 x0Var3 = new aa3.x0(appBrandPageView.getContext());
                b17.a(x0Var3, false);
                x0Var2 = x0Var3;
            }
        }
        x0Var = x0Var2;
        this.f84051g = x0Var;
        this.f84052h = new aa3.c0(this);
    }

    @Override // aa3.c
    public void a(boolean z17) {
    }

    @Override // aa3.c
    public void b() {
        this.f84048d.requestFocus();
        aa3.l.f84085a.d(this.f84051g, new aa3.d0(this));
    }

    @Override // aa3.c
    /* renamed from: getView */
    public android.view.View mo890xfb86a31b() {
        return this.f84051g;
    }

    @Override // aa3.c
    /* renamed from: hideKeyboard */
    public void mo891x3f895349() {
        aa3.l.f84085a.c(this.f84051g, new aa3.b0(this));
    }

    @Override // aa3.c
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        this.f84049e = inputConnection;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        aa3.x0 x0Var = this.f84051g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x0Var);
        return x0Var.q();
    }

    @Override // aa3.c
    /* renamed from: setXMode */
    public void mo892x53eb72f9(int i17) {
    }
}

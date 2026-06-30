package aa3;

/* loaded from: classes15.dex */
public final class z implements aa3.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f84158d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f84159e;

    /* renamed from: f, reason: collision with root package name */
    public final aa3.b f84160f;

    /* renamed from: g, reason: collision with root package name */
    public final aa3.p0 f84161g;

    /* renamed from: h, reason: collision with root package name */
    public final nl1.b f84162h;

    public z(android.view.View appBrandPageView, java.lang.String inputType, android.view.inputmethod.InputConnection inputConnection, aa3.b keyboardAction) {
        aa3.p0 p0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandPageView, "appBrandPageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputType, "inputType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyboardAction, "keyboardAction");
        this.f84158d = appBrandPageView;
        this.f84159e = inputConnection;
        this.f84160f = keyboardAction;
        aa3.w wVar = new aa3.w(this);
        int i17 = aa3.p0.f84102p;
        aa3.p0 p0Var2 = (aa3.p0) appBrandPageView.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f567093i43);
        if (p0Var2 == null || !inputType.equals(p0Var2.f84103d)) {
            md.f b17 = md.f.b(appBrandPageView);
            if (b17 == null) {
                p0Var = null;
                p0Var.m913x87046ad7(wVar);
                this.f84161g = p0Var;
                this.f84162h = new aa3.x(this);
            }
            aa3.p0 p0Var3 = new aa3.p0(appBrandPageView.getContext());
            p0Var3.f84103d = inputType;
            b17.a(p0Var3, false);
            p0Var2 = p0Var3;
        }
        p0Var = p0Var2;
        p0Var.m913x87046ad7(wVar);
        this.f84161g = p0Var;
        this.f84162h = new aa3.x(this);
    }

    @Override // aa3.c
    public void a(boolean z17) {
    }

    @Override // aa3.c
    public void b() {
        this.f84158d.requestFocus();
        aa3.l.f84085a.d(this.f84161g, new aa3.y(this));
    }

    @Override // aa3.c
    /* renamed from: getView */
    public android.view.View mo890xfb86a31b() {
        return this.f84161g;
    }

    @Override // aa3.c
    /* renamed from: hideKeyboard */
    public void mo891x3f895349() {
        aa3.l.f84085a.c(this.f84161g, new aa3.v(this));
    }

    @Override // aa3.c
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        this.f84159e = inputConnection;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        return this.f84161g.q();
    }

    @Override // aa3.c
    /* renamed from: setXMode */
    public void mo892x53eb72f9(int i17) {
        this.f84161g.m914x53eb72f9(i17);
    }
}

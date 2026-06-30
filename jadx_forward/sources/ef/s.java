package ef;

/* loaded from: classes7.dex */
public final class s implements ef.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f333686d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 f333687e;

    public s(ef.b appBrandXWebKeyboard, ef.c keyboardAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandXWebKeyboard, "appBrandXWebKeyboard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyboardAction, "keyboardAction");
        android.view.View a17 = appBrandXWebKeyboard.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        this.f333686d = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 G = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3.G(a17, appBrandXWebKeyboard.b(), null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(G, "settleKeyboard(...)");
        this.f333687e = G;
    }

    @Override // ef.e
    public void a(boolean z17) {
        this.f333687e.a(z17);
    }

    @Override // ef.e
    public void b() {
        android.view.View view = this.f333686d;
        view.requestFocus();
        android.view.inputmethod.InputMethodManager b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(view);
        if (b17.showSoftInput(view, 1)) {
            return;
        }
        b17.showSoftInput(view, 2);
    }

    @Override // ef.e
    public int c() {
        return this.f333687e.getMinimumHeight();
    }

    @Override // ef.e
    public void d(int i17) {
        this.f333687e.d(i17);
    }

    @Override // ef.e
    public boolean e(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        return this.f333687e.e(text);
    }

    @Override // ef.e
    public void f(pl1.i params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
    }

    @Override // ef.e
    public void g(yz5.l l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
        this.f333687e.m53531x87046ad7(new ef.r(l17));
    }

    @Override // ef.e
    /* renamed from: getView */
    public android.view.View mo127526xfb86a31b() {
        return this.f333687e;
    }

    @Override // ef.e
    public void h(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f333687e.f173224x = text;
    }

    @Override // ef.e
    /* renamed from: hideKeyboard */
    public void mo127527x3f895349() {
        android.view.View view = this.f333686d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(view).hideSoftInputFromWindow(view.getWindowToken(), 0);
        view.clearFocus();
    }

    @Override // ef.e
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
    }

    @Override // ef.e
    public void j(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var = this.f333687e;
        u3Var.m53529xb5ed2800(z17);
        u3Var.M();
    }

    @Override // ef.e
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f333687e.k(listener);
    }

    @Override // ef.e
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 p3Var) {
        this.f333687e.m(p3Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        return this.f333687e.q();
    }

    @Override // ef.e
    /* renamed from: setXMode */
    public void mo127528x53eb72f9(int i17) {
    }
}

package ef;

/* loaded from: classes7.dex */
public final class w implements ef.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f333691d;

    /* renamed from: e, reason: collision with root package name */
    public final ef.c f333692e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f333693f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 f333694g;

    /* renamed from: h, reason: collision with root package name */
    public nl1.b f333695h;

    public w(android.view.View appBrandPageView, android.view.inputmethod.InputConnection inputConnection, ef.c keyboardAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandPageView, "appBrandPageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyboardAction, "keyboardAction");
        this.f333691d = appBrandPageView;
        this.f333692e = keyboardAction;
        ef.t tVar = new ef.t(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 v17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3.v(appBrandPageView, null);
        v17.m53543x87046ad7(tVar);
        this.f333694g = v17;
        this.f333695h = new ef.u(inputConnection);
    }

    @Override // ef.e
    public void a(boolean z17) {
    }

    @Override // ef.e
    public void b() {
        this.f333691d.requestFocus();
        this.f333694g.w(this.f333695h);
        ((ef.i) this.f333692e).f333652a.d();
    }

    @Override // ef.e
    public int c() {
        return this.f333694g.getMinimumHeight();
    }

    @Override // ef.e
    public void d(int i17) {
    }

    @Override // ef.e
    public boolean e(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        return true;
    }

    @Override // ef.e
    public void f(pl1.i params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
    }

    @Override // ef.e
    public void g(yz5.l l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
        this.f333693f = l17;
    }

    @Override // ef.e
    /* renamed from: getView */
    public android.view.View mo127526xfb86a31b() {
        return this.f333694g;
    }

    @Override // ef.e
    public void h(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
    }

    @Override // ef.e
    /* renamed from: hideKeyboard */
    public void mo127527x3f895349() {
        this.f333694g.u();
        this.f333691d.clearFocus();
        ((ef.i) this.f333692e).f333652a.e(0);
    }

    @Override // ef.e
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        this.f333695h = new ef.v(inputConnection);
        b();
    }

    @Override // ef.e
    public void j(boolean z17) {
    }

    @Override // ef.e
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
    }

    @Override // ef.e
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 p3Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        return this.f333694g.q();
    }

    @Override // ef.e
    /* renamed from: setXMode */
    public void mo127528x53eb72f9(int i17) {
    }
}

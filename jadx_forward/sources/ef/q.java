package ef;

/* loaded from: classes7.dex */
public final class q implements ef.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f333679d;

    /* renamed from: e, reason: collision with root package name */
    public final ef.c f333680e;

    /* renamed from: f, reason: collision with root package name */
    public int f333681f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f333682g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 f333683h;

    /* renamed from: i, reason: collision with root package name */
    public nl1.b f333684i;

    public q(android.view.View appBrandPageView, android.view.inputmethod.InputConnection inputConnection, ef.c keyboardAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandPageView, "appBrandPageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyboardAction, "keyboardAction");
        this.f333679d = appBrandPageView;
        this.f333680e = keyboardAction;
        ef.n nVar = new ef.n(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 v17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2.v(appBrandPageView, null);
        v17.m53512x87046ad7(nVar);
        this.f333683h = v17;
        this.f333684i = new ef.o(inputConnection);
    }

    @Override // ef.e
    public void a(boolean z17) {
    }

    @Override // ef.e
    public void b() {
        this.f333679d.requestFocus();
        int i17 = this.f333681f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f333683h;
        o2Var.m53513x53eb72f9(i17);
        nl1.b bVar = this.f333684i;
        if (bVar != null) {
            o2Var.m53511x9a97bb01(bVar);
            o2Var.setVisibility(0);
        }
        ((ef.i) this.f333680e).f333652a.d();
    }

    @Override // ef.e
    public int c() {
        return this.f333683h.getMinimumHeight();
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
        this.f333682g = l17;
    }

    @Override // ef.e
    /* renamed from: getView */
    public android.view.View mo127526xfb86a31b() {
        return this.f333683h;
    }

    @Override // ef.e
    public void h(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
    }

    @Override // ef.e
    /* renamed from: hideKeyboard */
    public void mo127527x3f895349() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f333683h;
        o2Var.setVisibility(8);
        android.widget.EditText editText = o2Var.f173115h;
        if (editText != null) {
            editText.clearFocus();
            o2Var.f173115h = null;
            o2Var.f173113f = null;
            o2Var.f173112e = false;
        }
        this.f333679d.clearFocus();
        ((ef.i) this.f333680e).f333652a.e(0);
    }

    @Override // ef.e
    public void i(android.view.inputmethod.InputConnection inputConnection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        this.f333684i = new ef.p(inputConnection);
        b();
    }

    @Override // ef.e
    public void j(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f333683h;
        o2Var.m53509xb5ed2800(z17);
        o2Var.w();
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
        return this.f333683h.q();
    }

    @Override // ef.e
    /* renamed from: setXMode */
    public void mo127528x53eb72f9(int i17) {
        this.f333681f = i17;
        this.f333683h.m53513x53eb72f9(i17);
    }
}

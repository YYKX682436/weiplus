package fg;

/* loaded from: classes7.dex */
public final class o0 implements fg.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputConnection f343327a;

    /* renamed from: b, reason: collision with root package name */
    public pl1.f f343328b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 f343329c;

    /* renamed from: d, reason: collision with root package name */
    public final nl1.b f343330d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 f343331e;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t appBrandPage, android.view.inputmethod.InputConnection inputConnection, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandPage, "appBrandPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        this.f343327a = inputConnection;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 v17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3.v(appBrandPage.mo51310xc2a54588(), appBrandPage instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) appBrandPage).V1() : null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v17, "settleKeyboard(...)");
        this.f343329c = v17;
        this.f343330d = new fg.m0(this);
    }

    @Override // fg.g
    public void a(boolean z17) {
    }

    @Override // fg.g
    public void b() {
        this.f343329c.w(this.f343330d);
    }

    @Override // fg.g
    public int c() {
        return this.f343329c.getMinimumHeight();
    }

    @Override // fg.g
    public void d(int i17) {
    }

    @Override // fg.g
    public boolean e(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        return true;
    }

    @Override // fg.g
    public void f(pl1.i params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        pl1.f fVar = this.f343328b;
        if (fVar == null) {
            this.f343328b = (pl1.f) params;
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        fVar.a(params);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.f173015a.a(fVar, params);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.a(fVar, params);
    }

    @Override // fg.g
    public void g(yz5.l l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
        this.f343329c.m53543x87046ad7(new fg.n0(l17));
    }

    @Override // fg.g
    /* renamed from: getParams */
    public pl1.f mo129515x29c21c7c() {
        return this.f343328b;
    }

    @Override // fg.g
    /* renamed from: getView */
    public android.view.View mo129516xfb86a31b() {
        return this.f343329c;
    }

    @Override // fg.g
    public void h(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
    }

    @Override // fg.g
    /* renamed from: hideKeyboard */
    public void mo129517x3f895349() {
        this.f343329c.u();
    }

    @Override // fg.g
    public void i(pl1.f params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        f(params);
    }

    @Override // fg.g
    public void j(boolean z17) {
    }

    @Override // fg.g
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
    }

    @Override // fg.g
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 v4Var;
        v4Var = this.f343331e;
        if (v4Var == null) {
            pl1.f fVar = this.f343328b;
            android.view.inputmethod.BaseInputConnection baseInputConnection = null;
            java.lang.String str = fVar != null ? fVar.R : null;
            android.view.inputmethod.InputConnection inputConnection = this.f343327a;
            android.view.inputmethod.BaseInputConnection baseInputConnection2 = inputConnection instanceof android.view.inputmethod.BaseInputConnection ? (android.view.inputmethod.BaseInputConnection) inputConnection : null;
            if (baseInputConnection2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewExtendWcPayNumberKeyboard", "getInputConnection, inputConnection: " + inputConnection);
            } else {
                baseInputConnection = baseInputConnection2;
            }
            v4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o(str, baseInputConnection);
            this.f343331e = v4Var;
        }
        return v4Var;
    }

    @Override // fg.g
    /* renamed from: setText */
    public void mo129518x765074af(java.lang.String str) {
    }
}

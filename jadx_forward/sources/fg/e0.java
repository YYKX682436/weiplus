package fg;

/* loaded from: classes7.dex */
public final class e0 implements fg.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.inputmethod.InputConnection f343284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f343285b;

    /* renamed from: c, reason: collision with root package name */
    public pl1.f f343286c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 f343287d;

    /* renamed from: e, reason: collision with root package name */
    public final nl1.b f343288e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 f343289f;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t appBrandPage, android.view.inputmethod.InputConnection inputConnection, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandPage, "appBrandPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        this.f343284a = inputConnection;
        this.f343285b = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 v17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2.v(appBrandPage.mo51310xc2a54588(), appBrandPage instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) appBrandPage).V1() : null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v17, "settleKeyboard(...)");
        this.f343287d = v17;
        this.f343288e = new fg.c0(this);
    }

    @Override // fg.g
    public void a(boolean z17) {
    }

    @Override // fg.g
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f343287d;
        o2Var.m53513x53eb72f9(this.f343285b);
        nl1.b bVar = this.f343288e;
        if (bVar == null) {
            return;
        }
        o2Var.m53511x9a97bb01(bVar);
        o2Var.setVisibility(0);
    }

    @Override // fg.g
    public int c() {
        return this.f343287d.getMinimumHeight();
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
        pl1.f fVar = this.f343286c;
        if (fVar == null) {
            this.f343286c = (pl1.f) params;
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
        this.f343287d.m53512x87046ad7(new fg.d0(l17));
    }

    @Override // fg.g
    /* renamed from: getParams */
    public pl1.f mo129515x29c21c7c() {
        return this.f343286c;
    }

    @Override // fg.g
    /* renamed from: getView */
    public android.view.View mo129516xfb86a31b() {
        return this.f343287d;
    }

    @Override // fg.g
    public void h(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
    }

    @Override // fg.g
    /* renamed from: hideKeyboard */
    public void mo129517x3f895349() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f343287d;
        o2Var.setVisibility(8);
        android.widget.EditText editText = o2Var.f173115h;
        if (editText != null) {
            editText.clearFocus();
            o2Var.f173115h = null;
            o2Var.f173113f = null;
            o2Var.f173112e = false;
        }
    }

    @Override // fg.g
    public void i(pl1.f params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        f(params);
    }

    @Override // fg.g
    public void j(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o2 o2Var = this.f343287d;
        o2Var.m53509xb5ed2800(z17);
        o2Var.w();
    }

    @Override // fg.g
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
    }

    @Override // fg.g
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 v4Var;
        v4Var = this.f343289f;
        if (v4Var == null) {
            pl1.f fVar = this.f343286c;
            android.view.inputmethod.BaseInputConnection baseInputConnection = null;
            java.lang.String str = fVar != null ? fVar.R : null;
            android.view.inputmethod.InputConnection inputConnection = this.f343284a;
            android.view.inputmethod.BaseInputConnection baseInputConnection2 = inputConnection instanceof android.view.inputmethod.BaseInputConnection ? (android.view.inputmethod.BaseInputConnection) inputConnection : null;
            if (baseInputConnection2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewExtendNumberKeyboard", "getInputConnection, inputConnection: " + inputConnection);
            } else {
                baseInputConnection = baseInputConnection2;
            }
            v4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o(str, baseInputConnection);
            this.f343289f = v4Var;
        }
        return v4Var;
    }

    @Override // fg.g
    /* renamed from: setText */
    public void mo129518x765074af(java.lang.String str) {
    }
}

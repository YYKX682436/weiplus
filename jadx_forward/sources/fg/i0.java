package fg;

/* loaded from: classes7.dex */
public final class i0 implements fg.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f343303a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.r f343304b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 f343305c;

    /* renamed from: d, reason: collision with root package name */
    public pl1.f f343306d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f343307e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f343308f;

    /* renamed from: g, reason: collision with root package name */
    public final fg.f f343309g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f343310h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w f343311i;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t appBrandPage, android.view.inputmethod.InputConnection inputConnection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandPage, "appBrandPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputConnection, "inputConnection");
        this.f343303a = appBrandPage;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d3 d3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3.f172975n;
        android.view.View mo51310xc2a54588 = appBrandPage.mo51310xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo51310xc2a54588, "getContentView(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 b17 = d3Var.b(mo51310xc2a54588, false, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        this.f343305c = b17;
        android.content.Context mo50352x76847179 = appBrandPage.mo50352x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x76847179, "getContext(...)");
        this.f343309g = new fg.f(mo50352x76847179, inputConnection);
        this.f343311i = new fg.f0(this);
    }

    @Override // fg.g
    public void a(boolean z17) {
    }

    @Override // fg.g
    public void b() {
        java.lang.String str;
        c01.l2 b17;
        java.lang.Integer num;
        boolean z17 = true;
        this.f343308f = true;
        pl1.f fVar = this.f343306d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f343303a;
        if (fVar == null || (num = fVar.X) == null) {
            str = null;
        } else {
            str = java.lang.String.format("AppBrandSecureInput#%s#%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(tVar.mo50260x9f1221c2()), num}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
        }
        this.f343310h = str;
        tVar.w(this.f343311i);
        java.lang.String str2 = this.f343310h;
        java.lang.String f17 = (str2 == null || (b17 = c01.n2.d().b(str2)) == null) ? null : b17.f("SecureInputValue", null);
        if (f17 != null && f17.length() != 0) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 f3Var = this.f343305c;
        fg.f fVar2 = this.f343309g;
        if (z17 || this.f343307e) {
            fVar2.setText((java.lang.CharSequence) null);
            android.widget.EditText m53473x517ff734 = f3Var.m53473x517ff734();
            if (m53473x517ff734 != null) {
                m53473x517ff734.setText((java.lang.CharSequence) null);
            }
        } else {
            fVar2.setText(f17);
            android.widget.EditText m53473x517ff7342 = f3Var.m53473x517ff734();
            if (m53473x517ff7342 != null) {
                m53473x517ff7342.setText(f17);
            }
        }
        fVar2.m129522xc6cf6336(new fg.h0(this));
        f3Var.u(fVar2);
        this.f343308f = false;
    }

    @Override // fg.g
    public int c() {
        return this.f343305c.getMinimumHeight();
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
        pl1.f fVar = this.f343306d;
        if (fVar == null) {
            this.f343306d = (pl1.f) params;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
            fVar.a(params);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.f173015a.a(fVar, params);
        }
        fg.f fVar2 = this.f343309g;
        pl1.f fVar3 = this.f343306d;
        pl1.f fVar4 = fVar2.A;
        if (fVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.input.params.InsertParams");
            fVar2.A = fVar3;
        } else if (fVar3 != null) {
            fVar4.a(fVar3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.f173015a.a(fVar3, fVar3);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        pl1.f fVar5 = fVar2.A;
        java.lang.Integer num = fVar5 != null ? fVar5.I : null;
        h0Var.f391656d = num;
        if (num != null) {
            fVar2.f343291w.m121728x5137b98e(num.intValue(), ((java.lang.Number) h0Var.f391656d).intValue());
            fVar2.setMaxEms(((java.lang.Number) h0Var.f391656d).intValue());
        }
        ((ku5.t0) ku5.t0.f394148d).B(new fg.e(h0Var, fVar2));
    }

    @Override // fg.g
    public void g(yz5.l l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
    }

    @Override // fg.g
    /* renamed from: getParams */
    public pl1.f mo129515x29c21c7c() {
        return this.f343306d;
    }

    @Override // fg.g
    /* renamed from: getView */
    public android.view.View mo129516xfb86a31b() {
        return this.f343305c;
    }

    @Override // fg.g
    public void h(android.widget.EditText text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
    }

    @Override // fg.g
    /* renamed from: hideKeyboard */
    public void mo129517x3f895349() {
        java.lang.String str;
        android.text.Editable m17 = m();
        java.lang.String obj = m17 != null ? m17.toString() : null;
        if (obj != null && (str = this.f343310h) != null) {
            c01.n2.d().c(str, true).k("SecureInputValue", obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.f3 f3Var = this.f343305c;
        f3Var.setVisibility(8);
        android.widget.EditText editText = f3Var.f172980h;
        if (editText != null) {
            editText.clearFocus();
            f3Var.f172980h = null;
            f3Var.f172981i = null;
            f3Var.f172982m = false;
        }
    }

    @Override // fg.g
    public void i(pl1.f params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        f(params);
    }

    @Override // fg.g
    public void j(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f343303a;
        this.f343305c.v(z17, tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) tVar).V1() : null);
    }

    @Override // fg.g
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
    }

    @Override // fg.g
    public /* bridge */ /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v4 l() {
        return null;
    }

    public final android.text.Editable m() {
        android.widget.EditText m53473x517ff734 = this.f343305c.m53473x517ff734();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m53473x517ff734, "null cannot be cast to non-null type com.tencent.luggage.xweb_ext.extendplugin.input.DelegateEditText");
        return ((fg.f) m53473x517ff734).m129520x95ccead2();
    }

    @Override // fg.g
    /* renamed from: setText */
    public void mo129518x765074af(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f343307e = true;
        }
    }
}

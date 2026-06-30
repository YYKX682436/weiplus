package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f202218h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f202219i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f202220m;

    /* renamed from: n, reason: collision with root package name */
    public long f202221n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f202222o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.content.Context context, p012xc85e97e9.p093xedfae76a.y owner, yz5.p completeCallback) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completeCallback, "completeCallback");
        this.f202218h = completeCallback;
        this.f202220m = "";
        this.f199917g.f526369c.b().setGravity(5);
        this.f199917g.f526369c.b().setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f576037ot);
        this.f202222o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y0(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f202219i;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        c22621x7603e017.clearFocus();
        java.lang.Object systemService = this.f199914d.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f202219i;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        inputMethodManager.hideSoftInputFromWindow(c22621x7603e0172.getWindowToken(), 0);
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f202222o).mo141623x754a37bb()).d();
        super.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        android.widget.TextView textView = new android.widget.TextView(this.f199914d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        textView.setBackground(textView.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0r));
        int b17 = i65.a.b(textView.getContext(), 12);
        int b18 = i65.a.b(textView.getContext(), 4);
        textView.setPadding(b17, b18, b17, b18);
        textView.setEnabled(false);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        return textView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ano;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1;
        layoutParams.height = ym5.x.a(context, 412.0f - 64) + (com.p314xaae8f345.mm.ui.bl.c(this.f199914d) * 2);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.d6q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById;
        this.f202219i = c22621x7603e017;
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.w0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void s() {
        this.f202218h.mo149xb9724478(this.f202220m, java.lang.Long.valueOf(this.f202221n));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void u() {
        a();
        this.f202218h.mo149xb9724478(this.f202220m, java.lang.Long.valueOf(this.f202221n));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        long j17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f202219i;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        java.lang.String obj = c22621x7603e017.getText().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<this>");
        try {
            j17 = java.lang.Long.parseLong(obj);
        } catch (java.lang.NumberFormatException unused) {
            j17 = 0;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long l17 = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1)) > 0 ? valueOf : null;
        long longValue = l17 != null ? l17.longValue() : this.f202221n;
        jz5.g gVar = ae2.in.U1;
        if (longValue > ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue()) {
            android.content.Context context = this.f199914d;
            db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dk9, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue())));
        } else {
            a();
            this.f202218h.mo149xb9724478(this.f202220m, java.lang.Long.valueOf(longValue));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        pm0.v.V(100L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.z0(this));
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f202222o).mo141623x754a37bb()).f();
    }
}

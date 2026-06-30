package kl2;

/* loaded from: classes3.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final jl2.b f390303h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f390304i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f390305m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f390306n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f390307o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f390308p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.CheckBox f390309q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f390310r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f390311s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f390312t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f390313u;

    /* renamed from: v, reason: collision with root package name */
    public long f390314v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, jl2.b service, yz5.l verifyCallback, yz5.a aVar) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyCallback, "verifyCallback");
        this.f390303h = service;
        this.f390304i = verifyCallback;
        this.f390305m = aVar;
        this.f390312t = "";
        this.f390313u = "";
        this.f199917g.c(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570409dr1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.odb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f390306n = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f567068i05);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f390307o = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.m3m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f390308p = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.enc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f390309q = (android.widget.CheckBox) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.enf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f390310r = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.ene);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f390311s = findViewById6;
        findViewById6.setOnClickListener(new kl2.a(this));
        android.widget.CheckBox checkBox = this.f390309q;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new kl2.b(this));
        android.widget.TextView textView = this.f390306n;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleText");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f390307o;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("leftBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f390308p;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        android.widget.TextView textView4 = this.f390307o;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("leftBtn");
            throw null;
        }
        textView4.setOnClickListener(new kl2.c(this));
        android.widget.TextView textView5 = this.f390308p;
        if (textView5 != null) {
            textView5.setOnClickListener(new kl2.d(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        yz5.a aVar = this.f390305m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public final void y(java.lang.String id6, java.lang.String url, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f390312t = id6;
        this.f390313u = url;
        this.f390314v = j17;
        w();
        android.widget.TextView textView = this.f390310r;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceTv");
            throw null;
        }
        java.lang.String string = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dab, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        int length = string.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        spannableString.setSpan(new kl2.f(this), L, length, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        android.widget.CheckBox checkBox = this.f390309q;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setChecked(false);
        android.widget.TextView textView2 = this.f390308p;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightBtn");
            throw null;
        }
        android.widget.CheckBox checkBox2 = this.f390309q;
        if (checkBox2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        textView2.setEnabled(checkBox2.isChecked());
        il2.s.f373619a.a(zl2.e5.f555276m, j17);
    }
}

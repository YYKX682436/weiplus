package kl2;

/* loaded from: classes3.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final jl2.a f390324h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f390325i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f390326m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f390327n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f390328o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f390329p;

    /* renamed from: q, reason: collision with root package name */
    public long f390330q;

    /* renamed from: r, reason: collision with root package name */
    public zl2.d5 f390331r;

    /* renamed from: s, reason: collision with root package name */
    public final int f390332s;

    /* renamed from: t, reason: collision with root package name */
    public mm2.p5 f390333t;

    /* renamed from: u, reason: collision with root package name */
    public long f390334u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, jl2.a service) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f390324h = service;
        this.f390331r = zl2.d5.f555256d;
        this.f199917g.c(null);
        dk2.ef efVar = dk2.ef.f314905a;
        int i17 = dk2.ef.Q;
        this.f390332s = i17 <= 0 ? 1000 : i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ayi;
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
        this.f390325i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.chx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f390326m = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.m1m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f390327n = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f567068i05);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f390328o = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.m3m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f390329p = (android.widget.TextView) findViewById5;
        android.widget.TextView textView = this.f390325i;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleText");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        android.widget.TextView textView2 = this.f390328o;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("leftBtn");
            throw null;
        }
        textView2.setOnClickListener(new kl2.h(this));
        android.widget.TextView textView3 = this.f390329p;
        if (textView3 != null) {
            textView3.setOnClickListener(new kl2.i(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void s() {
        il2.r rVar = (il2.r) this.f390324h;
        rVar.getClass();
        ((mm2.v5) rVar.P0(mm2.v5.class)).f411021n.mo7808x76db6cb1(mm2.r5.f410913a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        this.f390334u = java.lang.System.currentTimeMillis() + 100;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RestrictConsumeDialogWidget", "openPanel curTime: " + this.f390334u);
    }
}

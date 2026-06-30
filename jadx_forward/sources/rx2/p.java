package rx2;

/* loaded from: classes10.dex */
public final class p implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5, ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f482516d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f482517e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f482518f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b f482519g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f482520h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f482521i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f482522m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f482523n;

    public p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, yz5.l changeEditViewCallback, yz5.p doVerify) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changeEditViewCallback, "changeEditViewCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doVerify, "doVerify");
        this.f482516d = activity;
        this.f482517e = changeEditViewCallback;
        this.f482518f = doVerify;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activity);
        this.f482520h = f5Var;
        this.f482521i = true;
        ya2.h.f542017a.b(xy2.c.e(activity));
        f5Var.f291933e = this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b c15280xb0aa035b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b(activity);
        this.f482519g = c15280xb0aa035b;
        rx2.f fVar = new rx2.f(this);
        rx2.g gVar = new rx2.g(this);
        c15280xb0aa035b.f212569d = fVar;
        c15280xb0aa035b.f212570e = gVar;
        sr2.o1 o1Var = (sr2.o1) pf5.z.f435481a.a(activity).a(sr2.o1.class);
        o1Var.getClass();
        o1Var.f493186d = c15280xb0aa035b;
        o1Var.Q6();
        rx2.h hVar = new rx2.h(this);
        rx2.i iVar = new rx2.i(this);
        rx2.j jVar = new rx2.j(this);
        o1Var.f493191i = hVar;
        o1Var.f493189g = iVar;
        o1Var.f493190h = jVar;
        activity.getWindow().getDecorView().post(new rx2.k(this));
    }

    public final void a() {
        this.f482517e.mo146xb9724478(java.lang.Boolean.FALSE);
        this.f482522m = false;
        this.f482520h.d();
        this.f482516d.mo48674x36654fab();
        boolean z17 = this.f482523n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b c15280xb0aa035b = this.f482519g;
        if (z17) {
            c15280xb0aa035b.f212578p.setVisibility(0);
            c15280xb0aa035b.f212577o.setVisibility(8);
            c15280xb0aa035b.f212574i.setVisibility(8);
            c15280xb0aa035b.f212575m.setVisibility(8);
            c15280xb0aa035b.f212572g.setVisibility(8);
            c15280xb0aa035b.f212573h.setText(c15280xb0aa035b.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572889li2));
        }
        c15280xb0aa035b.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = c15280xb0aa035b.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = 0;
        c15280xb0aa035b.setLayoutParams(layoutParams2);
    }

    public final void b() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f482516d;
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oxn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        c(string, "", string2);
    }

    public final void c(java.lang.String title, java.lang.String titleTips, java.lang.String hint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleTips, "titleTips");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hint, "hint");
        this.f482523n = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b c15280xb0aa035b = this.f482519g;
        c15280xb0aa035b.getClass();
        c15280xb0aa035b.f212578p.setVisibility(8);
        android.widget.TextView textView = c15280xb0aa035b.f212577o;
        textView.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15280xb0aa035b.f212574i;
        c22621x7603e017.setVisibility(0);
        c15280xb0aa035b.f212572g.setVisibility(0);
        c15280xb0aa035b.f212573h.setText(title);
        textView.setText(titleTips);
        c22621x7603e017.setText("");
        c22621x7603e017.setHint(hint);
        textView.setTextColor(c15280xb0aa035b.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        if (this.f482521i) {
            c15280xb0aa035b.post(new rx2.n(this));
        }
        this.f482520h.f();
        c22621x7603e017.requestFocus();
        this.f482516d.mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15280xb0aa035b c15280xb0aa035b = this.f482519g;
        android.view.ViewGroup.LayoutParams layoutParams = c15280xb0aa035b.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        if (((android.widget.FrameLayout.LayoutParams) layoutParams).bottomMargin != i17) {
            rx2.o oVar = new rx2.o(this, i17);
            if (i17 != 0) {
                oVar.setDuration(200L);
            } else {
                oVar.setDuration(300L);
            }
            c15280xb0aa035b.startAnimation(oVar);
        }
        c15280xb0aa035b.setVisibility(0);
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        ya2.h.f542017a.b(xy2.c.e(this.f482516d));
    }
}

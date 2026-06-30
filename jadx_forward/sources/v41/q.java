package v41;

/* loaded from: classes15.dex */
public final class q extends v41.c implements l75.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f514757h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f514758i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f514759m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f514760n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f514761o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f514762p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f514763q;

    /* renamed from: r, reason: collision with root package name */
    public j41.u f514764r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.app.Activity context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f514737d = context;
        android.view.View findViewById = context.findViewById(com.p314xaae8f345.mm.R.id.c_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f514757h = viewGroup;
        viewGroup.setVisibility(0);
        android.view.View findViewById2 = context.findViewById(com.p314xaae8f345.mm.R.id.c_w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = context.findViewById(com.p314xaae8f345.mm.R.id.c_5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f514758i = textView;
        android.view.View findViewById4 = context.findViewById(com.p314xaae8f345.mm.R.id.c_3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById4;
        this.f514759m = textView2;
        android.view.View findViewById5 = context.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = context.findViewById(com.p314xaae8f345.mm.R.id.f566995hr4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById6;
        this.f514760n = imageView;
        android.view.View findViewById7 = context.findViewById(com.p314xaae8f345.mm.R.id.hr6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById7;
        this.f514761o = textView3;
        android.view.View findViewById8 = context.findViewById(com.p314xaae8f345.mm.R.id.f566996hr5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f514762p = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = context.findViewById(com.p314xaae8f345.mm.R.id.f566994hr3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f514763q = (android.widget.TextView) findViewById9;
        ((i41.l) i95.n0.c(i41.l.class)).Ui().add(this);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById2).getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        ((android.widget.TextView) findViewById5).setOnClickListener(new v41.n(this));
        textView.setVisibility(8);
        imageView.setVisibility(8);
        textView3.setVisibility(8);
        textView2.setEnabled(false);
    }

    public static final void h(v41.q qVar) {
        qVar.g(0, "");
    }

    @Override // v41.c, v41.s
    public void a() {
        super.a();
    }

    @Override // v41.s
    public void b() {
        ku5.u0 u0Var = ku5.t0.f394148d;
        v41.o oVar = new v41.o(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(oVar, 400L, false);
    }

    @Override // v41.c, v41.s
    public void c(int i17, int i18, j41.i0 confirmData) {
        java.lang.String str;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator startDelay;
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmData, "confirmData");
        super.c(i17, i18, confirmData);
        j41.u uVar = confirmData.f379176d;
        this.f514764r = uVar;
        v41.p pVar = new v41.p(this, i17);
        android.widget.TextView textView = this.f514759m;
        textView.setOnClickListener(pVar);
        this.f514758i.setVisibility(0);
        android.widget.ImageView imageView = this.f514760n;
        imageView.setVisibility(0);
        android.widget.TextView textView2 = this.f514761o;
        textView2.setVisibility(0);
        textView.setEnabled(true);
        if (uVar == null || (str = ((k41.g0) uVar).f68604x21f9b213) == null) {
            str = "";
        }
        textView2.setText(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uVar);
        k41.g0 g0Var = (k41.g0) uVar;
        i(g0Var.f68607xd03b1ae9, ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(g0Var.f68607xd03b1ae9, g0Var.f68608x1223b30f));
        java.lang.String str2 = confirmData.f379178f;
        boolean z17 = str2 == null || str2.length() == 0;
        android.widget.TextView textView3 = this.f514763q;
        if (z17) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(confirmData.f379178f);
            textView3.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.a(imageView, g0Var.f68613xdec927b);
        android.view.ViewGroup viewGroup = this.f514757h;
        viewGroup.setVisibility(0);
        l41.m mVar = this.f514738e;
        int i19 = -1;
        if (mVar != null && (c11207x71c7a1c1 = ((l41.j1) mVar).f397377c) != null) {
            i19 = c11207x71c7a1c1.f153807f;
        }
        if (!(i19 == 3 || i19 == 5)) {
            viewGroup.setAlpha(1.0f);
            return;
        }
        viewGroup.setAlpha(0.0f);
        android.view.ViewPropertyAnimator animate = viewGroup.animate();
        if (animate == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(200L)) == null || (startDelay = duration.setStartDelay(100L)) == null) {
            return;
        }
        startDelay.start();
    }

    @Override // v41.c, v41.s
    public void d(l41.m confirmController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmController, "confirmController");
        super.d(confirmController);
        this.f514757h.setVisibility(0);
        android.app.Activity activity = this.f514737d;
        if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo78514x143f1b92();
            android.app.Activity activity2 = this.f514737d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity2);
            mo78514x143f1b92.G0(activity2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
    }

    @Override // v41.c, v41.s
    public void e() {
        l41.m mVar = this.f514738e;
        boolean z17 = false;
        if (mVar != null && ((l41.j1) mVar).i()) {
            z17 = true;
        }
        if (z17) {
            super.e();
        }
    }

    @Override // v41.c, v41.s
    public void f() {
        l41.m mVar = this.f514738e;
        boolean z17 = false;
        if (mVar != null && ((l41.j1) mVar).h()) {
            z17 = true;
        }
        if (z17) {
            super.f();
        }
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        boolean z17 = str2 == null || str2.length() == 0;
        android.widget.TextView textView = this.f514762p;
        if (z17) {
            textView.setText("");
            textView.setVisibility(8);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", str)) {
            str2 = "@" + str2;
        }
        textView.setText(str2);
        textView.setVisibility(0);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if ((str == null || str.length() == 0) || w0Var == null) {
            return;
        }
        java.lang.Object obj = w0Var.f398509d;
        if (obj instanceof u41.k) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.openim.storage.OpenIMWordingInfo");
            u41.k kVar = (u41.k) obj;
            java.lang.String str2 = kVar.f69018x28d46377;
            j41.u uVar = this.f514764r;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, uVar != null ? ((k41.g0) uVar).f68607xd03b1ae9 : null)) {
                java.lang.String str3 = kVar.f69024xd0366ace;
                j41.u uVar2 = this.f514764r;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, uVar2 != null ? ((k41.g0) uVar2).f68608x1223b30f : null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmFullUIModelImpl", "onNotifyChange openImAppId: %s, wordingId: %s, wording: %s", kVar.f69018x28d46377, kVar.f69024xd0366ace, kVar.f69023xcf77aa53);
                    i(kVar.f69018x28d46377, kVar.f69023xcf77aa53);
                }
            }
        }
    }

    @Override // v41.c, v41.s
    /* renamed from: release */
    public void mo171084x41012807() {
        this.f514737d = null;
        ((i41.l) i95.n0.c(i41.l.class)).Ui().mo49775xc84af884(this);
    }
}

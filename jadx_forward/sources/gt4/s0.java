package gt4;

/* loaded from: classes14.dex */
public final class s0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public android.widget.TextView A;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 B;
    public android.widget.FrameLayout C;
    public android.widget.TextView D;
    public final java.util.List E;
    public final java.util.Map F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public gt4.a1 f357066J;
    public y9.i K;
    public gt4.y L;
    public int M;
    public int N;
    public int P;
    public int Q;
    public long R;
    public long S;
    public final gt4.n0 T;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n U;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f357067d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f357068e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f357069f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f357070g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f357071h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f357072i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f357073m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 f357074n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f357075o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f357076p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 f357077q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f357078r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f357079s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f357080t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f357081u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.Button f357082v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Button f357083w;

    /* renamed from: x, reason: collision with root package name */
    public int f357084x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f357085y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f357086z;

    public s0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f357067d = context;
        this.E = new java.util.ArrayList();
        this.F = new java.util.LinkedHashMap();
        this.T = new gt4.n0(this);
        this.K = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ddu, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f357068e = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.cqo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f357070g = (android.widget.LinearLayout) findViewById;
        android.view.View view = this.f357068e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.q2c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f357075o = (android.widget.LinearLayout) findViewById2;
        android.view.View view2 = this.f357068e;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.q2e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f357078r = (android.widget.TextView) findViewById3;
        android.view.View view3 = this.f357068e;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.p314xaae8f345.mm.R.id.q2f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f357079s = (android.widget.TextView) findViewById4;
        android.view.View view4 = this.f357068e;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.p314xaae8f345.mm.R.id.q2b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f357076p = (android.widget.LinearLayout) findViewById5;
        android.view.View view5 = this.f357068e;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById6 = view5.findViewById(com.p314xaae8f345.mm.R.id.q2d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f357077q = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361) findViewById6;
        android.view.View view6 = this.f357068e;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById7 = view6.findViewById(com.p314xaae8f345.mm.R.id.q27);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f357080t = (android.widget.LinearLayout) findViewById7;
        this.f357074n = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613(context);
        android.widget.LinearLayout linearLayout = this.f357070g;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dateView");
            throw null;
        }
        linearLayout.removeAllViews();
        android.widget.LinearLayout linearLayout2 = this.f357070g;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dateView");
            throw null;
        }
        linearLayout2.setGravity(17);
        android.widget.LinearLayout linearLayout3 = this.f357070g;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dateView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f357074n;
        if (c22705x7e16f613 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
            throw null;
        }
        linearLayout3.addView(c22705x7e16f613.m82057xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.N = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.u(0L, "yyyyMM");
        android.view.View inflate2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ddv, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        this.f357085y = inflate2;
        android.view.View findViewById8 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.vot);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.view.View view7 = this.f357085y;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
            throw null;
        }
        android.view.View findViewById9 = view7.findViewById(com.p314xaae8f345.mm.R.id.vos);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById9;
        this.f357081u = button;
        button.setOnClickListener(new gt4.c0(this));
        android.view.View view8 = this.f357085y;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
            throw null;
        }
        android.view.View findViewById10 = view8.findViewById(com.p314xaae8f345.mm.R.id.vor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById10;
        this.f357082v = button2;
        button2.setOnClickListener(new gt4.d0(this));
        android.view.View view9 = this.f357085y;
        if (view9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
            throw null;
        }
        android.view.View findViewById11 = view9.findViewById(com.p314xaae8f345.mm.R.id.vou);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        android.widget.Button button3 = (android.widget.Button) findViewById11;
        this.f357083w = button3;
        button3.setOnClickListener(new gt4.e0(this));
        android.view.View view10 = this.f357085y;
        if (view10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
            throw null;
        }
        android.view.View findViewById12 = view10.findViewById(com.p314xaae8f345.mm.R.id.f569207q31);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f357086z = (android.widget.TextView) findViewById12;
        android.view.View view11 = this.f357085y;
        if (view11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
            throw null;
        }
        android.view.View findViewById13 = view11.findViewById(com.p314xaae8f345.mm.R.id.q2x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById13;
        android.view.View view12 = this.f357085y;
        if (view12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
            throw null;
        }
        android.view.View findViewById14 = view12.findViewById(com.p314xaae8f345.mm.R.id.q2y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.B = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById14;
        android.view.View view13 = this.f357085y;
        if (view13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
            throw null;
        }
        android.view.View findViewById15 = view13.findViewById(com.p314xaae8f345.mm.R.id.qc7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById15;
        this.C = frameLayout;
        frameLayout.setOnClickListener(new gt4.f0(this));
        android.widget.FrameLayout frameLayout2 = this.C;
        if (frameLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
            throw null;
        }
        android.view.View findViewById16 = frameLayout2.findViewById(com.p314xaae8f345.mm.R.id.f569206q30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById16;
        this.D = textView;
        textView.setTextSize(1, 22.0f);
        android.view.View view14 = this.f357068e;
        if (view14 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById17 = view14.findViewById(com.p314xaae8f345.mm.R.id.khs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById17, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button4 = (android.widget.Button) findViewById17;
        this.f357071h = button4;
        button4.setOnClickListener(new gt4.g0(this));
        android.view.View view15 = this.f357068e;
        if (view15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById18 = view15.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById18, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button5 = (android.widget.Button) findViewById18;
        this.f357072i = button5;
        button5.setOnClickListener(new gt4.h0(this));
        android.view.View view16 = this.f357068e;
        if (view16 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById19 = view16.findViewById(com.p314xaae8f345.mm.R.id.b1e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById19, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button6 = (android.widget.Button) findViewById19;
        this.f357073m = button6;
        button6.setOnClickListener(new gt4.i0(this));
        y9.i iVar = this.K;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
        android.view.View view17 = this.f357068e;
        if (view17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        iVar.setContentView(view17);
        y9.i iVar2 = this.K;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar2);
        iVar2.setOnCancelListener(new gt4.j0(this));
        this.M = com.p314xaae8f345.mm.ui.zk.a(context, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df);
        android.view.View view18 = this.f357068e;
        if (view18 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        java.lang.Object parent = view18.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) parent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A, "from(...)");
        this.f357069f = A;
        A.f125976p = false;
        A.C(this.M);
        y9.i iVar3 = this.K;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar3);
        iVar3.setOnDismissListener(new gt4.k0(this));
        j(true);
        android.widget.TextView textView2 = this.f357078r;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("monthView");
            throw null;
        }
        textView2.setOnClickListener(new gt4.a0(this));
        android.widget.TextView textView3 = this.f357079s;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionView");
            throw null;
        }
        textView3.setOnClickListener(new gt4.b0(this));
        android.widget.TextView textView4 = this.f357086z;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startText");
            throw null;
        }
        textView4.post(new sp5.b(textView4));
        android.view.View view19 = this.f357085y;
        if (view19 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
            throw null;
        }
        android.widget.TextView textView5 = (android.widget.TextView) view19.findViewById(com.p314xaae8f345.mm.R.id.f569208q32);
        textView5.post(new sp5.b(textView5));
        android.widget.TextView textView6 = this.A;
        if (textView6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endText");
            throw null;
        }
        textView6.post(new sp5.b(textView6));
        android.widget.Button button7 = this.f357072i;
        if (button7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(button7.getPaint(), 0.8f);
        android.widget.Button button8 = this.f357071h;
        if (button8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("okBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(button8.getPaint(), 0.8f);
        android.widget.Button button9 = this.f357073m;
        if (button9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singleBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(button9.getPaint(), 0.8f);
        n();
        gt4.l0 l0Var = new gt4.l0(this);
        android.view.View view20 = this.f357068e;
        if (view20 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        view20.getViewTreeObserver().addOnGlobalLayoutListener(l0Var);
        this.U = new gt4.m0(this);
    }

    public static final void a(gt4.s0 s0Var, boolean z17, int i17, int i18, int i19) {
        if (!z17) {
            s0Var.getClass();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 c19147x541bc361 = s0Var.f357077q;
        if (c19147x541bc361 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionLayout");
            throw null;
        }
        if (c19147x541bc361.getVisibility() != 0) {
            gt4.y yVar = s0Var.L;
            if (yVar != null) {
                yVar.b((i17 * 100) + i18);
            }
            s0Var.g(i17, i18, i19);
            return;
        }
        gt4.y yVar2 = s0Var.L;
        if (yVar2 != null) {
            yVar2.c(s0Var.P, s0Var.Q, s0Var.f357084x);
        }
        s0Var.P = 0;
        s0Var.Q = 0;
        gt4.a1 a1Var = s0Var.f357066J;
        if (a1Var != null) {
            a1Var.f356921f = 0;
        }
        if (a1Var != null) {
            a1Var.f356922g = 0;
        }
        s0Var.f();
    }

    public static final void b(gt4.s0 s0Var) {
        s0Var.o();
        gt4.a1 a1Var = s0Var.f357066J;
        if (a1Var != null) {
            a1Var.f356921f = s0Var.P;
        }
        if (a1Var != null) {
            a1Var.f356922g = s0Var.Q;
        }
        if (a1Var != null) {
            a1Var.m8146xced61ae5();
        }
    }

    public static final void c(gt4.s0 s0Var, gt4.z zVar) {
        s0Var.getClass();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Date time = calendar.getTime();
        s0Var.f357084x = zVar.ordinal();
        int ordinal = zVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                calendar.add(6, -6);
            } else if (ordinal == 2) {
                calendar.add(2, -1);
            } else if (ordinal == 3) {
                calendar.add(2, -3);
            }
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault());
            java.lang.String format = simpleDateFormat.format(calendar.getTime());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            s0Var.P = java.lang.Integer.parseInt(format);
            java.lang.String format2 = simpleDateFormat.format(time);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            s0Var.Q = java.lang.Integer.parseInt(format2);
        }
    }

    public static final void d(gt4.s0 s0Var) {
        s0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletComplexDatePicker", "showInnerDatePicker");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(s0Var.f357067d);
        oVar.g(true, true, false);
        int i17 = s0Var.N;
        oVar.d(i17 / 100, i17 % 100, 1);
        long j17 = s0Var.R;
        if (j17 > 0) {
            oVar.f293839m.m82060xe3874070(java.lang.Long.valueOf(j17));
        }
        long j18 = s0Var.S;
        if (j18 > 0) {
            oVar.f293839m.m82061xf0a11a5e(java.lang.Long.valueOf(j18));
        }
        oVar.f293840n = s0Var.U;
        oVar.h();
    }

    public final void e() {
        y9.i iVar = this.K;
        if (iVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
            iVar.dismiss();
        }
    }

    public final void f() {
        android.widget.Button button = this.f357081u;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("oneWeekBtn");
            throw null;
        }
        button.setSelected(false);
        android.widget.Button button2 = this.f357082v;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("oneMonthBtn");
            throw null;
        }
        button2.setSelected(false);
        android.widget.Button button3 = this.f357083w;
        if (button3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("threeMonthsBtn");
            throw null;
        }
        button3.setSelected(false);
        this.f357084x = 0;
    }

    public final void g(int i17, int i18, int i19) {
        if (i17 < 0 || i18 < 0 || i19 < 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f357074n;
        if (c22705x7e16f613 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
            throw null;
        }
        c22705x7e16f613.f293736r = i17;
        c22705x7e16f613.f293737s = i18;
        c22705x7e16f613.f293738t = i19;
        if (c22705x7e16f613.f293725d == null) {
            c22705x7e16f613.f293725d = c22705x7e16f613.f293726e.d();
        }
    }

    public final void h(int i17, int i18, int i19) {
        if (i17 < 0 || i18 < 0 || i19 < 0) {
            return;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
        calendar.set(i17, i18 - 1, i19);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f357074n;
        if (c22705x7e16f613 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
            throw null;
        }
        c22705x7e16f613.m82060xe3874070(java.lang.Long.valueOf(calendar.getTimeInMillis()));
        this.R = calendar.getTimeInMillis();
    }

    public final void i(int i17, int i18, int i19) {
        java.util.Map map;
        if (i17 < 0 || i18 < 0 || i19 < 0) {
            return;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
        calendar.set(i17, i18 - 1, i19);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f357074n;
        if (c22705x7e16f613 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
            throw null;
        }
        c22705x7e16f613.m82061xf0a11a5e(java.lang.Long.valueOf(calendar.getTimeInMillis()));
        gt4.a1 a1Var = this.f357066J;
        if (a1Var != null && (map = a1Var.f356924i) != null) {
            ((java.util.LinkedHashMap) map).clear();
        }
        gt4.a1 a1Var2 = this.f357066J;
        if (a1Var2 != null) {
            a1Var2.f356923h = 0;
        }
        this.S = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(5, calendar2.getActualMaximum(5));
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        calendar3.setTimeInMillis(this.S);
        this.G = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(calendar2.getTimeInMillis());
        java.util.List list = this.E;
        list.clear();
        int i27 = calendar3.get(2);
        int i28 = calendar3.get(1);
        gt4.j1 j1Var = new gt4.j1();
        j1Var.f356989a = 1;
        j1Var.f356990b = 0;
        int i29 = (i28 * 100) + i27 + 1;
        j1Var.f356992d = i29;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i29);
        java.util.Map map2 = this.F;
        map2.put(valueOf, 0);
        list.add(j1Var);
        gt4.j1 j1Var2 = new gt4.j1();
        j1Var2.f356989a = 2;
        j1Var2.f356990b = 0;
        j1Var2.f356992d = j1Var.f356992d;
        list.add(j1Var2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (calendar3.compareTo(calendar2) <= 0) {
            if (calendar3.get(2) != i27) {
                while (arrayList.size() < 7) {
                    gt4.k1 k1Var = new gt4.k1();
                    k1Var.f356997a = 0;
                    arrayList.add(k1Var);
                }
                gt4.j1 j1Var3 = new gt4.j1();
                j1Var3.f356989a = 3;
                j1Var3.f356990b = j1Var.f356990b;
                j1Var3.f356991c = j1Var.f356991c;
                j1Var3.f356992d = j1Var.f356992d;
                j1Var3.f356993e = arrayList;
                list.add(j1Var3);
                arrayList = new java.util.ArrayList();
                i27 = calendar3.get(2);
                int i37 = calendar3.get(1);
                j1Var.f356991c = list.size();
                j1Var = new gt4.j1();
                j1Var.f356989a = 1;
                j1Var.f356990b = list.size();
                int i38 = (i37 * 100) + i27 + 1;
                j1Var.f356992d = i38;
                map2.put(java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(j1Var.f356990b));
                list.add(j1Var);
                gt4.j1 j1Var4 = new gt4.j1();
                j1Var4.f356989a = 2;
                j1Var4.f356990b = j1Var.f356990b;
                j1Var4.f356992d = j1Var.f356992d;
                list.add(j1Var4);
            }
            int i39 = calendar3.get(7) - 1;
            int i47 = calendar3.get(5);
            if (i47 == 1) {
                while (arrayList.size() < i39) {
                    gt4.k1 k1Var2 = new gt4.k1();
                    k1Var2.f356997a = 0;
                    arrayList.add(k1Var2);
                }
            }
            if (i39 == 0 && (!arrayList.isEmpty())) {
                gt4.j1 j1Var5 = new gt4.j1();
                j1Var5.f356989a = 3;
                j1Var5.f356990b = j1Var.f356990b;
                j1Var5.f356991c = j1Var.f356991c;
                j1Var5.f356992d = j1Var.f356992d;
                j1Var5.f356993e = arrayList;
                list.add(j1Var5);
                arrayList = new java.util.ArrayList();
            }
            gt4.k1 k1Var3 = new gt4.k1();
            k1Var3.f356997a = i47 + (j1Var.f356992d * 100);
            arrayList.add(k1Var3);
            calendar3.add(5, 1);
        }
        while (arrayList.size() < 7) {
            gt4.k1 k1Var4 = new gt4.k1();
            k1Var4.f356997a = 0;
            arrayList.add(k1Var4);
        }
        gt4.j1 j1Var6 = new gt4.j1();
        j1Var6.f356989a = 3;
        j1Var6.f356990b = j1Var.f356990b;
        j1Var6.f356991c = j1Var.f356991c;
        j1Var6.f356992d = j1Var.f356992d;
        j1Var6.f356993e = arrayList;
        list.add(j1Var6);
        this.H = (calendar2.get(1) * 100) + calendar2.get(2) + 1;
        m();
    }

    public final void j(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.f357078r;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("monthView");
                throw null;
            }
            android.widget.TextView textView2 = this.f357079s;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionView");
                throw null;
            }
            k(textView, textView2);
            android.widget.LinearLayout linearLayout = this.f357076p;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("monthLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 c19147x541bc361 = this.f357077q;
            if (c19147x541bc361 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionLayout");
                throw null;
            }
            c19147x541bc361.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 c19147x541bc3612 = this.f357077q;
            if (c19147x541bc3612 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionLayout");
                throw null;
            }
            c19147x541bc3612.removeAllViews();
            o();
            return;
        }
        android.widget.TextView textView3 = this.f357079s;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionView");
            throw null;
        }
        android.widget.TextView textView4 = this.f357078r;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("monthView");
            throw null;
        }
        k(textView3, textView4);
        android.widget.LinearLayout linearLayout2 = this.f357076p;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("monthLayout");
            throw null;
        }
        linearLayout2.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 c19147x541bc3613 = this.f357077q;
        if (c19147x541bc3613 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionLayout");
            throw null;
        }
        c19147x541bc3613.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 c19147x541bc3614 = this.f357077q;
        if (c19147x541bc3614 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionLayout");
            throw null;
        }
        if (c19147x541bc3614.getChildCount() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 c19147x541bc3615 = this.f357077q;
            if (c19147x541bc3615 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionLayout");
                throw null;
            }
            android.view.View view = this.f357085y;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionRoot");
                throw null;
            }
            c19147x541bc3615.addView(view);
        }
        n();
    }

    public final void k(android.widget.TextView textView, android.widget.TextView textView2) {
        textView2.setSelected(false);
        com.p314xaae8f345.mm.ui.bk.t0(textView2.getPaint());
        textView2.setTextColor(this.f357067d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        android.view.View view = this.f357068e;
        if (view != null) {
            view.post(new gt4.o0(textView, this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
    }

    public final void l() {
        if (this.K != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = this.f357074n;
            if (c22705x7e16f613 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
                throw null;
            }
            c22705x7e16f613.a();
            y9.i iVar = this.K;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
            iVar.show();
        }
        n();
    }

    public final void m() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = this.H;
        calendar.set(i17 / 100, (i17 % 100) - 1, 1);
        java.lang.String format = new java.text.SimpleDateFormat(this.f357067d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgo)).format(new java.util.Date(calendar.getTimeInMillis()));
        android.widget.TextView textView = this.D;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerText");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        textView.setText(r26.i0.t(format, " ", "  ", false));
    }

    public final void n() {
        gt4.a1 a1Var = this.f357066J;
        java.util.List list = this.E;
        if (a1Var == null) {
            android.content.Context context = this.f357067d;
            gt4.a1 a1Var2 = new gt4.a1(context, list);
            this.f357066J = a1Var2;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.B;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dayListView");
                throw null;
            }
            c1163xf1deaba4.mo7960x6cab2c8d(a1Var2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.B;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dayListView");
                throw null;
            }
            c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.B;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dayListView");
                throw null;
            }
            c1163xf1deaba43.i(this.T);
            gt4.a1 a1Var3 = this.f357066J;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a1Var3);
            a1Var3.f356928p = new gt4.p0(this);
        } else if (a1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
            a1Var.f356920e = list;
        }
        gt4.a1 a1Var4 = this.f357066J;
        if ((a1Var4 != null && a1Var4.f356923h == 0) && a1Var4 != null) {
            a1Var4.f356923h = this.G;
        }
        if (a1Var4 != null) {
            a1Var4.m8146xced61ae5();
        }
        java.lang.Integer num = (java.lang.Integer) this.F.get(java.lang.Integer.valueOf(this.N));
        if (num != null) {
            int intValue = num.intValue();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.B;
            if (c1163xf1deaba44 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dayListView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba44.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker", "updateSectionView", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker", "updateSectionView", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        o();
        android.widget.FrameLayout frameLayout = this.C;
        if (frameLayout != null) {
            frameLayout.post(new gt4.q0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
            throw null;
        }
    }

    public final void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19147x541bc361 c19147x541bc361 = this.f357077q;
        if (c19147x541bc361 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sectionLayout");
            throw null;
        }
        if (c19147x541bc361.getVisibility() == 0) {
            int i17 = this.P;
            android.content.Context context = this.f357067d;
            if (i17 > 0) {
                android.widget.TextView textView = this.f357086z;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startText");
                    throw null;
                }
                textView.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q((int) (com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(i17) / 1000), new java.text.SimpleDateFormat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2)), new java.text.SimpleDateFormat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl))));
                android.widget.TextView textView2 = this.f357086z;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startText");
                    throw null;
                }
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                int i18 = this.Q;
                if (i18 > 0) {
                    if (i18 / 10000 == this.P / 10000) {
                        android.widget.TextView textView3 = this.A;
                        if (textView3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endText");
                            throw null;
                        }
                        textView3.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(this.Q)));
                    } else {
                        android.widget.TextView textView4 = this.A;
                        if (textView4 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endText");
                            throw null;
                        }
                        textView4.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f(this.Q)));
                    }
                    android.widget.TextView textView5 = this.A;
                    if (textView5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endText");
                        throw null;
                    }
                    textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                } else {
                    android.widget.TextView textView6 = this.A;
                    if (textView6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endText");
                        throw null;
                    }
                    textView6.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgn));
                    android.widget.TextView textView7 = this.A;
                    if (textView7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endText");
                        throw null;
                    }
                    textView7.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                }
            } else {
                android.widget.TextView textView8 = this.f357086z;
                if (textView8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startText");
                    throw null;
                }
                textView8.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgr));
                android.widget.TextView textView9 = this.f357086z;
                if (textView9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startText");
                    throw null;
                }
                textView9.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                android.widget.TextView textView10 = this.A;
                if (textView10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endText");
                    throw null;
                }
                textView10.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgn));
                android.widget.TextView textView11 = this.A;
                if (textView11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endText");
                    throw null;
                }
                textView11.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
            android.widget.Button button = this.f357071h;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("okBtn");
                throw null;
            }
            button.setEnabled(this.P > 0 && this.Q > 0);
        } else {
            android.widget.Button button2 = this.f357071h;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("okBtn");
                throw null;
            }
            button2.setEnabled(true);
        }
        android.view.View view = this.f357068e;
        if (view != null) {
            view.post(new gt4.r0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}

package m31;

/* loaded from: classes9.dex */
public class p1 implements fl1.b2 {
    public final android.widget.CheckBox A;
    public final android.widget.TextView B;
    public final android.view.View C;
    public android.view.View D;
    public final java.util.List E;
    public boolean F;
    public java.lang.Integer G;
    public fl1.g2 H;
    public final m31.p0 I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f404712J;
    public boolean K;
    public m31.o0 L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public boolean Q;
    public java.lang.String R;
    public boolean S;
    public java.lang.String T;
    public java.lang.String U;
    public int V;
    public m31.e1 W;
    public int X;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f404713d;

    /* renamed from: e, reason: collision with root package name */
    public final m31.c1 f404714e;

    /* renamed from: f, reason: collision with root package name */
    public final m31.d1 f404715f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f404716g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f404717h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ScrollView f404718i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f404719m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f404720n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f404721o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f404722p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f404723q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.Button f404724r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.Button f404725s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f404726t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.FrameLayout f404727u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f404728v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f404729w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f404730x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f404731y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f404732z;

    public p1(android.content.Context context, java.util.List items, m31.c1 c1Var, boolean z17, boolean z18, m31.d1 d1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f404713d = context;
        this.f404714e = c1Var;
        this.f404715f = d1Var;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cx_, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f404716g = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.E = arrayList;
        m31.p0 p0Var = m31.p0.f404708d;
        this.I = p0Var;
        this.M = "";
        this.N = "";
        this.P = "";
        this.Q = true;
        this.R = "";
        this.S = true;
        this.T = "";
        this.U = "";
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.hia);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f404717h = frameLayout;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.mcm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f404718i = (android.widget.ScrollView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f404719m = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f563957e6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f404720n = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f404722p = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.o_1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f404723q = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.a1p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f404721o = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.cz6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById8;
        this.f404724r = button;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.czm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById9;
        this.f404725s = button2;
        android.view.View findViewById10 = inflate.findViewById(com.p314xaae8f345.mm.R.id.m9j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f404726t = findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.p314xaae8f345.mm.R.id.m9l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = inflate.findViewById(com.p314xaae8f345.mm.R.id.czz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById12;
        this.f404727u = frameLayout2;
        android.view.View findViewById13 = inflate.findViewById(com.p314xaae8f345.mm.R.id.czy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.f404728v = findViewById13;
        android.view.View findViewById14 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bzv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.f404729w = findViewById14;
        findViewById14.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571551im));
        android.view.View findViewById15 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564483sn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.f404730x = (android.widget.TextView) findViewById15;
        android.view.View findViewById16 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ki8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        this.f404732z = findViewById16;
        android.view.View findViewById17 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564482sm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById17, "findViewById(...)");
        this.A = (android.widget.CheckBox) findViewById17;
        android.view.View findViewById18 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564484so);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById18, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById18;
        this.f404731y = textView;
        android.view.View findViewById19 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568908og4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById19, "findViewById(...)");
        this.C = findViewById19;
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new m31.h0(this));
        frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new m31.i0(this));
        arrayList.addAll(items);
        if (z17) {
            this.I = m31.p0.f404709e;
            frameLayout.setVisibility(8);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById19, arrayList2.toArray(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Listener;ZZLcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ShowToastListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById19, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$Listener;ZZLcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ShowToastListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById19.setOnClickListener(new m31.j0(this, items));
        } else if (z18) {
            this.I = m31.p0.f404710f;
            java.lang.Object obj = items.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestDialog.ItemWithVoice");
            m31.a1 a1Var = (m31.a1) obj;
            frameLayout.removeAllViews();
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            linearLayout.setBackgroundColor(0);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxc, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) inflate2.findViewById(com.p314xaae8f345.mm.R.id.ntc);
            viewOnClickListenerC22631x1cc07cc8.setVisibility(0);
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new m31.g1(a1Var));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f566823h63);
            c22699x3dcdb352.setVisibility(8);
            java.lang.String str = a1Var.f404651e;
            if (!(str == null || str.length() == 0)) {
                c22699x3dcdb352.setVisibility(0);
                c22699x3dcdb352.setOnClickListener(new m31.i1(a1Var, this));
            }
            ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.akl));
            m31.j1 j1Var = new m31.j1(this);
            int applyDimension = (int) android.util.TypedValue.applyDimension(1, 56.0f, context.getResources().getDisplayMetrics());
            linearLayout.addView((android.view.View) j1Var.mo152xb9724478());
            linearLayout.addView(inflate2, new android.view.ViewGroup.LayoutParams(-1, applyDimension));
            linearLayout.addView((android.view.View) j1Var.mo152xb9724478());
            frameLayout.addView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -2));
        } else {
            this.I = p0Var;
            c(items);
        }
        button2.setOnClickListener(new m31.k0(this));
        button.setOnClickListener(new m31.l0(this));
        findViewById16.setOnClickListener(new m31.m0(this, items));
        textView.setOnClickListener(new m31.n0(this));
        this.X = 2;
    }

    @Override // fl1.b2
    public boolean a() {
        if (!this.F) {
            return false;
        }
        o(false, new m31.l1(this));
        this.F = false;
        return true;
    }

    public final void b(android.content.Context context) {
        boolean z17 = this.K;
        android.widget.FrameLayout frameLayout = this.f404717h;
        if (!z17) {
            android.view.View view = this.D;
            if (view == null || frameLayout.indexOfChild(view) <= -1) {
                return;
            }
            frameLayout.removeView(view);
            return;
        }
        android.view.View view2 = this.D;
        if (view2 != null) {
            if (frameLayout.indexOfChild(view2) > -1) {
                return;
            }
            frameLayout.addView(view2);
            return;
        }
        android.view.View view3 = new android.view.View(context);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) android.util.TypedValue.applyDimension(1, 64.0f, context.getResources().getDisplayMetrics()));
        layoutParams.gravity = 80;
        view3.setLayoutParams(layoutParams);
        view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d9q);
        frameLayout.addView(view3);
        this.D = view3;
    }

    public final void c(java.util.List list) {
        android.content.Context context = this.f404713d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(context, null);
        android.widget.FrameLayout frameLayout = this.f404717h;
        frameLayout.removeAllViews();
        frameLayout.addView(c1163xf1deaba4, new android.view.ViewGroup.LayoutParams(-1, -2));
        b(context);
        c1163xf1deaba4.mo7960x6cab2c8d(new m31.y0(list, this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        c1163xf1deaba4.N(new m31.f1(this));
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        f(2);
        dismiss();
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        h31.a aVar;
        fl1.g2 g2Var = this.H;
        if (g2Var != null) {
            g2Var.a(this);
        }
        m31.e1 e1Var = this.W;
        if (e1Var != null && (aVar = ((h31.p) e1Var).f359958a.f359967h) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "subscribeMsgRequest onDismissDialog");
            int i17 = com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.f153407u;
            ((m31.y1) aVar).f404773a.getClass();
        }
        yz5.a aVar2 = this.f404712J;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
    }

    public final void e(int i17) {
        m31.v vVar = m31.w.f404757a;
        android.view.View view = this.f404716g;
        vVar.a(i17, view);
        android.widget.ScrollView scrollView = this.f404718i;
        android.view.View view2 = this.f404728v;
        if (i17 != 1 && i17 != 3) {
            android.widget.FrameLayout frameLayout = this.f404727u;
            if (frameLayout.indexOfChild(view2) == -1) {
                android.view.ViewParent parent = view2.getParent();
                if (parent != null) {
                    ((android.view.ViewGroup) parent).removeView(view2);
                }
                frameLayout.addView(view2);
                scrollView.setVisibility(8);
            }
        } else if (scrollView.indexOfChild(view2) == -1) {
            android.view.ViewParent parent2 = view2.getParent();
            if (parent2 != null) {
                ((android.view.ViewGroup) parent2).removeView(view2);
            }
            scrollView.addView(view2);
            scrollView.setVisibility(0);
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new m31.k1(this));
    }

    public final void f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SubscribeMsgRequestDialog", "dispatchEvent " + i17);
        m31.c1 c1Var = this.f404714e;
        if (c1Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(this.E);
            c1Var.a(i17, arrayList);
        }
    }

    @Override // fl1.b2
    /* renamed from: getContentView */
    public android.view.View mo81952xc2a54588() {
        return this.f404716g;
    }

    @Override // fl1.b2
    /* renamed from: getPosition */
    public int mo14604xa86cd69f() {
        return this.X;
    }

    public final void h(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.P = value;
        android.view.View view = this.f404732z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setAlwaysKeepText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setAlwaysKeepText", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f404730x.setText(this.P);
    }

    public final void i(int i17) {
        this.X = i17;
        android.content.Context context = this.f404713d;
        android.view.View view = this.f404716g;
        if (i17 == 1) {
            view.findViewById(com.p314xaae8f345.mm.R.id.f565626d00).setBackground(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.b4m));
        } else {
            if (i17 != 2) {
                return;
            }
            view.findViewById(com.p314xaae8f345.mm.R.id.f565626d00).setBackground(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.b4l));
        }
    }

    @Override // fl1.b2
    public boolean j() {
        return this instanceof h31.n;
    }

    public final void k(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.U = value;
        android.widget.TextView textView = this.f404723q;
        textView.setText(value);
        textView.setVisibility(this.U.length() == 0 ? 8 : 0);
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f404716g);
    }

    public final void o(boolean z17, android.animation.Animator.AnimatorListener animatorListener) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View view = this.f404726t;
        android.widget.FrameLayout frameLayout = this.f404727u;
        if (z17) {
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(frameLayout, (android.util.Property<android.widget.FrameLayout, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, -frameLayout.getWidth()).setDuration(200L);
            duration.setInterpolator(new n31.a());
            android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, view.getWidth(), 0.0f).setDuration(200L);
            duration2.setInterpolator(new n31.a());
            animatorSet.playTogether(duration, duration2);
        } else {
            android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(frameLayout, (android.util.Property<android.widget.FrameLayout, java.lang.Float>) android.view.View.TRANSLATION_X, -frameLayout.getWidth(), 0.0f).setDuration(200L);
            duration3.setInterpolator(new n31.a());
            android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, view.getWidth()).setDuration(200L);
            duration4.setInterpolator(new n31.a());
            animatorSet.playTogether(duration3, duration4);
        }
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.start();
    }

    @Override // fl1.b2
    /* renamed from: onCancel */
    public void mo123830x3d6f0539() {
        f(2);
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        l01.d0.f396294a.a(this.f404719m, this.M, this.V, new l01.n0());
        this.H = g2Var;
        java.lang.Object systemService = this.f404713d.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        e(((android.view.WindowManager) systemService).getDefaultDisplay().getRotation());
        m31.e1 e1Var = this.W;
        if (e1Var != null) {
            h31.r rVar = ((h31.p) e1Var).f359958a;
            h31.a aVar = rVar.f359967h;
            if (aVar != null) {
                fl1.c0 c0Var = rVar.f359972m;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "subscribeMsgRequest onShowDialog");
                int i17 = com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca.f153407u;
                com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca activityC11168xbe8821ca = ((m31.y1) aVar).f404773a;
                activityC11168xbe8821ca.getClass();
                activityC11168xbe8821ca.f153408d = c0Var;
            }
            j31.e.f378925a.c(1, rVar.f359978s);
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        e(i17);
    }
}

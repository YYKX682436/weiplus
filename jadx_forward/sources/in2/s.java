package in2;

/* loaded from: classes10.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener, gn2.a {
    public final in2.n0 A1;
    public final rl5.r B1;
    public final int[] C1;
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f374421J;
    public final int K;
    public final int L;
    public android.view.View M;
    public android.widget.FrameLayout N;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public android.widget.LinearLayout S;
    public android.view.View T;
    public android.view.View U;
    public android.view.View V;
    public android.view.View W;
    public android.view.View X;
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 Y;
    public android.widget.TextView Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f374422l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.FrameLayout f374423p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f374424p1;

    /* renamed from: x0, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f374425x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t7 f374426x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.ProgressBar f374427y0;

    /* renamed from: y1, reason: collision with root package name */
    public in2.a1 f374428y1;

    /* renamed from: z1, reason: collision with root package name */
    public final in2.v0 f374429z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.f374421J = "FinderLiveAnchorMusicSingSongViewCallback";
        this.K = 1;
        this.L = 2;
        this.f374429z1 = controller.f488878n;
        this.A1 = controller.f488879o;
        this.B1 = new rl5.r(context);
        this.C1 = new int[2];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.anb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        android.widget.FrameLayout frameLayout;
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374421J, "initView");
        this.f374428y1 = new in2.a1(this.H, this.f199716e);
        this.M = rootView.findViewById(com.p314xaae8f345.mm.R.id.emw);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.v5y);
        if (textView != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ojx);
        }
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.v5x);
        if (textView2 != null) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p0x);
        }
        android.widget.TextView textView3 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.v5r);
        if (textView3 != null) {
            textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p1s);
        }
        android.widget.TextView textView4 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.v5u);
        if (textView4 != null) {
            textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p1v);
        }
        android.widget.TextView textView5 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxl);
        if (textView5 != null) {
            textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575283ox0);
        }
        android.widget.TextView textView6 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxm);
        if (textView6 != null) {
            textView6.setText(com.p314xaae8f345.mm.R.C30867xcad56011.owz);
        }
        android.widget.TextView textView7 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxk);
        if (textView7 != null) {
            textView7.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p1q);
        }
        this.N = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.if7);
        this.P = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) rootView.findViewById(com.p314xaae8f345.mm.R.id.f567164if5);
        this.Q = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.if6);
        e0();
        this.R = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.emp);
        this.S = (android.widget.LinearLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.emq);
        android.widget.TextView textView8 = this.R;
        if (textView8 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView8);
        }
        android.widget.TextView textView9 = this.R;
        if (textView9 != null) {
            textView9.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575316p21);
        }
        this.f374423p0 = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxx);
        this.f374425x0 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxv);
        this.f374427y0 = (android.widget.ProgressBar) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxy);
        rootView.setOnClickListener(this);
        this.T = rootView.findViewById(com.p314xaae8f345.mm.R.id.emo);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.fm6);
        this.U = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.V = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568464mx2);
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.jg_);
        this.W = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f564219l9);
        this.X = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        this.Y = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxn);
        android.widget.TextView textView10 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxk);
        this.Z = textView10;
        if (textView10 != null) {
            textView10.setOnClickListener(this);
        }
        this.f374422l1 = rootView.findViewById(com.p314xaae8f345.mm.R.id.mx9);
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.emo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f374426x1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t7((android.view.ViewGroup) findViewById4, in2.a.f374322d);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f374424p1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d25 != null ? c22849x81a93d25.mo7946xf939df19() : null;
        in2.a1 a1Var = mo7946xf939df19 instanceof in2.a1 ? (in2.a1) mo7946xf939df19 : null;
        if (((a1Var == null || (arrayList = a1Var.f374331h) == null) ? 0 : arrayList.size()) >= 10) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f374425x0;
            if (c1073x7e08a787 != null) {
                c1073x7e08a787.setVisibility(0);
            }
        } else {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.f374425x0;
            if (c1073x7e08a7872 != null) {
                c1073x7e08a7872.setVisibility(8);
            }
        }
        android.widget.TextView textView11 = this.Q;
        if (textView11 != null) {
            textView11.setOnClickListener(new in2.d(this, rootView));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t7 t7Var = this.f374426x1;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = t7Var != null ? t7Var.f201406a : null;
        this.f374424p1 = c22849x81a93d252;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.P(new in2.e(this));
        }
        if (!f0() && (frameLayout = this.f374423p0) != null) {
            frameLayout.setVisibility(8);
        }
        in2.a1 a1Var2 = this.f374428y1;
        if (a1Var2 != null) {
            a1Var2.f374334n = new in2.f(this, a1Var2);
            a1Var2.f374332i = new in2.g(this, a1Var2);
            a1Var2.f374333m = new in2.h(this);
            a1Var2.f374335o = new in2.i(this);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f374424p1;
        if (c22849x81a93d253 != null) {
            c22849x81a93d253.mo7960x6cab2c8d(a1Var2);
            c22849x81a93d253.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d253.getContext()));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean O() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return !zl2.r4.f555483a.Y1(this.f199716e);
    }

    @Override // gn2.a
    public void b(boolean z17) {
        yz5.l lVar;
        in2.a1 a1Var = this.f374428y1;
        if (a1Var != null) {
            java.util.ArrayList arrayList = a1Var.f374331h;
            arrayList.clear();
            gk2.e eVar = a1Var.f374327d;
            arrayList.addAll(((mm2.m6) eVar.a(mm2.m6.class)).f410774f.f315586b);
            if (z17) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((dk2.yg) it.next()).f315931f = false;
                }
            }
            mm2.j7 j7Var = (mm2.j7) ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo3195x754a37bb();
            java.lang.String str = j7Var != null ? j7Var.f410716a : null;
            if (!(str == null || str.length() == 0)) {
                java.util.Iterator it6 = arrayList.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dk2.yg) next).f315926a, str) && (lVar = a1Var.f374335o) != null) {
                        lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
                    }
                    i17 = i18;
                }
                ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo7808x76db6cb1(null);
            }
            java.lang.Boolean bool = (java.lang.Boolean) ((mm2.m6) eVar.a(mm2.m6.class)).f410778m.mo3195x754a37bb();
            a1Var.B(bool != null ? bool.booleanValue() : false);
            java.util.LinkedList linkedList = ((mm2.m6) eVar.a(mm2.m6.class)).f410780o;
            java.util.Iterator it7 = arrayList.iterator();
            int i19 = 0;
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                dk2.yg ygVar = (dk2.yg) next2;
                if (linkedList.contains(ygVar.f315926a)) {
                    ygVar.f315930e = false;
                    ygVar.f315927b = 0L;
                    ygVar.f315933h = "";
                    if (ygVar.f315928c == 4) {
                        a1Var.z(i19, ygVar);
                    }
                }
                i19 = i27;
            }
            a1Var.m8146xced61ae5();
            dk2.yg ygVar2 = (dk2.yg) kz5.n0.Z(arrayList);
            if (ygVar2 != null && ygVar2.f315928c == 4) {
                a1Var.f374338r = 1;
            } else {
                a1Var.f374338r = 0;
            }
            a1Var.m8146xced61ae5();
        }
    }

    @Override // gn2.a
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        android.view.View view = this.V;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.Y;
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setVisibility(8);
        }
        android.view.View view2 = this.f374422l1;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.N;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f374424p1;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f374427y0;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(0);
    }

    @Override // gn2.a
    public void d(boolean z17) {
        android.widget.TextView textView;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        }
        android.view.View view = this.V;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.N;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.Y;
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        android.view.View view2 = this.f374422l1;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = this.f374427y0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.content.Context context = this.f199716e;
        if (context.getResources().getConfiguration().orientation != 2 || (textView = this.Z) == null) {
            return;
        }
        if (textView == null || (layoutParams = textView.getLayoutParams()) == null) {
            layoutParams = null;
        } else {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // gn2.a
    public void e() {
        android.view.ViewTreeObserver viewTreeObserver;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        int size = ((mm2.m6) this.H.a(mm2.m6.class)).f410774f.f315586b.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374421J, "showMusicView size:" + size);
        if (size == 0) {
            d(true);
            return;
        }
        if (f0()) {
            android.widget.FrameLayout frameLayout = this.f374423p0;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            android.widget.FrameLayout frameLayout2 = this.f374423p0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        android.widget.TextView textView = this.R;
        if (textView != null) {
            textView.setText(this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p2f, java.lang.String.valueOf(size)));
        }
        e0();
        android.view.View view = this.V;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.Y;
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setVisibility(8);
        }
        android.view.View view2 = this.f374422l1;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout3 = this.N;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f374424p1;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f374427y0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f374424p1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d252 != null ? c22849x81a93d252.mo7946xf939df19() : null;
        in2.a1 a1Var = mo7946xf939df19 instanceof in2.a1 ? (in2.a1) mo7946xf939df19 : null;
        if (((a1Var == null || (arrayList = a1Var.f374331h) == null) ? 0 : arrayList.size()) >= 10) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.f374425x0;
            if (c1073x7e08a7872 != null) {
                c1073x7e08a7872.setVisibility(0);
            }
        } else {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = this.f374425x0;
            if (c1073x7e08a7873 != null) {
                c1073x7e08a7873.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f374424p1;
        if (c22849x81a93d253 == null || (viewTreeObserver = c22849x81a93d253.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new in2.p(this));
    }

    public final void e0() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.P;
        gk2.e eVar = this.H;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(zl2.r4.f555483a.h2(eVar));
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        o(r4Var.h2(eVar));
        ((mm2.m6) eVar.a(mm2.m6.class)).f410778m.mo7808x76db6cb1(java.lang.Boolean.valueOf(r4Var.h2(eVar)));
    }

    public final boolean f0() {
        return ((mm2.c1) this.H.a(mm2.c1.class)).a8();
    }

    @Override // gn2.a
    public void j() {
        s(true);
    }

    @Override // gn2.a
    public void k(int i17) {
        android.widget.TextView textView = this.R;
        if (textView == null) {
            return;
        }
        android.content.Context context = this.f199716e;
        textView.setText(i17 > 0 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p2f, java.lang.String.valueOf(i17)) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p2f, "-"));
    }

    @Override // gn2.a
    public int m() {
        in2.a1 a1Var = this.f374428y1;
        if (a1Var != null) {
            return a1Var.mo1894x7e414b06();
        }
        return 0;
    }

    @Override // gn2.a
    public void n(int i17) {
        in2.a1 a1Var = this.f374428y1;
        if (a1Var != null) {
            a1Var.f374331h.remove(i17);
            a1Var.m8146xced61ae5();
        }
    }

    @Override // gn2.a
    public void o(boolean z17) {
        in2.a1 a1Var = this.f374428y1;
        if (a1Var != null) {
            a1Var.B(z17);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        in2.v0 v0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.fm6) {
            s(true);
        } else {
            in2.n0 n0Var = this.A1;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxk) {
                boolean f07 = f0();
                sf2.x xVar = this.I;
                if (f07) {
                    xVar.q7(true);
                    xVar.n7(true, new in2.o(this));
                } else {
                    if (n0Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(n0Var, this, false, 0, 6, null);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.P;
                    if (viewOnClickListenerC22631x1cc07cc8 != null) {
                        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(true);
                    }
                    ((mm2.m6) this.H.a(mm2.m6.class)).f410778m.mo7808x76db6cb1(java.lang.Boolean.TRUE);
                    xVar.q7(true);
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f564219l9) {
                if (n0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(n0Var, this, false, 0, 6, null);
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jg_ && (v0Var = this.f374429z1) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(v0Var, this, false, 0, 6, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // gn2.a
    public java.util.ArrayList p(java.lang.String str) {
        in2.a1 a1Var = this.f374428y1;
        if (a1Var == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = a1Var.f374331h.iterator();
        while (it.hasNext()) {
            dk2.yg ygVar = (dk2.yg) it.next();
            if ((ygVar.f315926a.length() > 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ygVar.f315926a)) {
                arrayList.add(ygVar.f315926a);
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void s(boolean z17) {
        android.os.IBinder windowToken;
        super.s(z17);
        android.view.View view = this.T;
        if (view == null || (windowToken = view.getWindowToken()) == null) {
            return;
        }
        java.lang.Object systemService = this.f199716e.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
    }
}

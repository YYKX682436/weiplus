package jn2;

/* loaded from: classes10.dex */
public final class r1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener, gn2.a {
    public mm2.j6 A1;
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f382215J;
    public final int K;
    public android.widget.TextView L;
    public android.widget.LinearLayout M;
    public android.view.View N;
    public android.view.View P;
    public android.view.View Q;
    public android.view.View R;
    public android.view.View S;
    public android.view.View T;
    public android.view.View U;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 V;
    public android.widget.FrameLayout W;
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 X;
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 Y;
    public android.widget.TextView Z;

    /* renamed from: l1, reason: collision with root package name */
    public jn2.m0 f382216l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ProgressBar f382217p0;

    /* renamed from: p1, reason: collision with root package name */
    public final rl5.r f382218p1;

    /* renamed from: x0, reason: collision with root package name */
    public jn2.z1 f382219x0;

    /* renamed from: x1, reason: collision with root package name */
    public final int[] f382220x1;

    /* renamed from: y0, reason: collision with root package name */
    public jn2.j f382221y0;

    /* renamed from: y1, reason: collision with root package name */
    public jn2.d1 f382222y1;

    /* renamed from: z1, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f382223z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.f382215J = "FinderLiveAnchorSingSongListPanel";
        this.K = 1;
        this.f382218p1 = new rl5.r(context);
        this.f382220x1 = new int[2];
        this.f382222y1 = jn2.d1.f382114g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        android.widget.FrameLayout frameLayout;
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f382215J, "initView");
        android.content.Context context = this.f199716e;
        sf2.x xVar = this.I;
        gk2.e eVar = this.H;
        this.f382219x0 = new jn2.z1(eVar, context, xVar);
        this.L = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.emp);
        this.M = (android.widget.LinearLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.emq);
        android.widget.TextView textView = this.L;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        this.W = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxx);
        this.X = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxv);
        this.f382217p0 = (android.widget.ProgressBar) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxy);
        rootView.setOnClickListener(this);
        this.S = rootView.findViewById(com.p314xaae8f345.mm.R.id.emo);
        this.T = rootView.findViewById(com.p314xaae8f345.mm.R.id.emw);
        this.N = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568464mx2);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f567437ug0);
        this.P = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.jg_);
        this.Q = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f564219l9);
        this.R = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        this.Y = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxn);
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxk);
        this.Z = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        this.U = rootView.findViewById(com.p314xaae8f345.mm.R.id.mx9);
        android.view.View view = this.P;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view : null;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(this.f382222y1.f382117d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.V;
        java.lang.Object mo7946xf939df19 = c22849x81a93d25 != null ? c22849x81a93d25.mo7946xf939df19() : null;
        jn2.z1 z1Var = mo7946xf939df19 instanceof jn2.z1 ? (jn2.z1) mo7946xf939df19 : null;
        if (((z1Var == null || (arrayList = z1Var.f382302h) == null) ? 0 : arrayList.size()) >= 10) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.X;
            if (c1073x7e08a787 != null) {
                c1073x7e08a787.setVisibility(0);
            }
        } else {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.X;
            if (c1073x7e08a7872 != null) {
                c1073x7e08a7872.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.tgh);
        this.V = c22849x81a93d252;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.P(new jn2.f1(this));
        }
        if (!((mm2.c1) eVar.a(mm2.c1.class)).a8() && (frameLayout = this.W) != null) {
            frameLayout.setVisibility(8);
        }
        jn2.z1 z1Var2 = this.f382219x0;
        if (z1Var2 != null) {
            z1Var2.f382306o = new jn2.g1(z1Var2, this);
            z1Var2.f382304m = new jn2.h1(z1Var2, this);
            z1Var2.f382305n = new jn2.i1(this);
            z1Var2.f382303i = new jn2.j1(this, z1Var2);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.V;
        if (c22849x81a93d253 != null) {
            c22849x81a93d253.mo7960x6cab2c8d(z1Var2);
            c22849x81a93d253.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d253.getContext()));
            jn2.z1 z1Var3 = this.f382219x0;
            if (z1Var3 != null) {
                z1Var3.f382307p = c22849x81a93d253;
            }
        }
        e0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean O() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // gn2.a
    public void b(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        jn2.z1 z1Var = this.f382219x0;
        if (z1Var != null) {
            java.util.ArrayList arrayList = z1Var.f382302h;
            arrayList.clear();
            gk2.e eVar = z1Var.f382298d;
            arrayList.addAll(((mm2.m6) eVar.a(mm2.m6.class)).f410782q.f315618a);
            mm2.j7 j7Var = (mm2.j7) ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo3195x754a37bb();
            java.lang.String str = j7Var != null ? j7Var.f410717b : null;
            z1Var.m8146xced61ae5();
            int i17 = 0;
            if (str == null || str.length() == 0) {
                return;
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.z22) it.next()).f473162f, str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0 && (c1163xf1deaba4 = z1Var.f382307p) != null) {
                c1163xf1deaba4.post(new jn2.y1(z1Var, i17));
            }
            ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo7808x76db6cb1(null);
        }
    }

    @Override // gn2.a
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        android.view.View view = this.N;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.Y;
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setVisibility(8);
        }
        android.view.View view2 = this.T;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.U;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.V;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f382217p0;
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
        android.view.View view = this.N;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.Y;
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setVisibility(0);
        }
        android.view.View view2 = this.T;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        android.view.View view3 = this.U;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = this.f382217p0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
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
        e0();
        gk2.e eVar = this.H;
        int size = ((mm2.m6) eVar.a(mm2.m6.class)).f410782q.f315618a.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f382215J, "showMusicView size:" + size);
        if (size == 0) {
            d(true);
            return;
        }
        if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
            android.widget.FrameLayout frameLayout = this.W;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            android.widget.FrameLayout frameLayout2 = this.W;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setText(this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eiu, java.lang.String.valueOf(size)));
        }
        android.view.View view = this.N;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.Y;
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setVisibility(8);
        }
        android.view.View view2 = this.T;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.U;
        if (view3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.V;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f382217p0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.V;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d252 != null ? c22849x81a93d252.mo7946xf939df19() : null;
        jn2.z1 z1Var = mo7946xf939df19 instanceof jn2.z1 ? (jn2.z1) mo7946xf939df19 : null;
        if (((z1Var == null || (arrayList = z1Var.f382302h) == null) ? 0 : arrayList.size()) >= 10) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.X;
            if (c1073x7e08a7872 != null) {
                c1073x7e08a7872.setVisibility(0);
            }
        } else {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = this.X;
            if (c1073x7e08a7873 != null) {
                c1073x7e08a7873.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.V;
        if (c22849x81a93d253 == null || (viewTreeObserver = c22849x81a93d253.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new jn2.o1(this));
    }

    public final void e0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f382223z1;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.A1 = null;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.E;
        this.f382223z1 = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.l1(this, null), 3, null) : null;
    }

    public final void f0() {
        if (this.f382221y0 == null) {
            this.f382221y0 = new jn2.j(this.f199716e, this.H, this.I);
        }
        jn2.j jVar = this.f382221y0;
        if (jVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(jVar, this, false, 0, 6, null);
        }
    }

    @Override // gn2.a
    public void j() {
        s(true);
    }

    @Override // gn2.a
    public void k(int i17) {
        android.widget.TextView textView = this.L;
        if (textView == null) {
            return;
        }
        android.content.Context context = this.f199716e;
        textView.setText(i17 > 0 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eiu, java.lang.String.valueOf(i17)) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eiu, "-"));
    }

    @Override // gn2.a
    public int m() {
        jn2.z1 z1Var = this.f382219x0;
        if (z1Var != null) {
            return z1Var.mo1894x7e414b06();
        }
        return 0;
    }

    @Override // gn2.a
    public void n(int i17) {
        jn2.z1 z1Var = this.f382219x0;
        if (z1Var != null) {
            java.util.ArrayList arrayList = z1Var.f382302h;
            if (i17 >= 0 && i17 < arrayList.size()) {
                arrayList.remove(i17);
                z1Var.m8155x27702c4(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z1Var.f382301g, "deleteSongItem pos:" + i17 + ", remaining size:" + arrayList.size());
            }
        }
    }

    @Override // gn2.a
    public void o(boolean z17) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        jn2.d1 d1Var;
        mm2.k6 k6Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        te2.a9 a9Var = te2.a9.f499416a;
        sf2.x xVar = this.I;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxk) {
            te2.a9.f(a9Var, xVar.h7(), 1, null, null, 12, null);
            f0();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f564219l9) {
            te2.a9.f(a9Var, xVar.h7(), 1, null, null, 12, null);
            f0();
        } else {
            android.content.Context context = this.f199716e;
            gk2.e eVar = this.H;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jg_) {
                te2.a9.f(a9Var, xVar.h7(), 5, null, null, 12, null);
                if (this.f382216l1 == null) {
                    this.f382216l1 = new jn2.m0(context, eVar, xVar);
                }
                jn2.m0 m0Var = this.f382216l1;
                if (m0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(m0Var, this, false, 0, 6, null);
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f567437ug0) {
                int ordinal = this.f382222y1.ordinal();
                if (ordinal == 0) {
                    d1Var = jn2.d1.f382114g;
                } else if (ordinal == 1) {
                    d1Var = jn2.d1.f382115h;
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    d1Var = jn2.d1.f382113f;
                }
                this.f382222y1 = d1Var;
                android.view.View view2 = this.P;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = view2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2 : null;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setImageResource(d1Var.f382117d);
                }
                int ordinal2 = this.f382222y1.ordinal();
                if (ordinal2 == 0) {
                    k6Var = mm2.k6.f410733e;
                } else if (ordinal2 == 1) {
                    k6Var = mm2.k6.f410732d;
                } else {
                    if (ordinal2 != 2) {
                        throw new jz5.j();
                    }
                    k6Var = mm2.k6.f410734f;
                }
                xVar.getClass();
                te2.a9.f(a9Var, xVar.h7(), 10, null, k6Var, 4, null);
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.m6) eVar.a(mm2.m6.class)).f410785t).k(k6Var);
                java.lang.String string = context.getString(this.f382222y1.f382118e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oto, string);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                db5.t7.m(context, string2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f382215J, "switchLoopMode: " + this.f382222y1 + " -> " + k6Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // gn2.a
    public java.util.ArrayList p(java.lang.String str) {
        r45.ay1 ay1Var;
        jn2.z1 z1Var = this.f382219x0;
        if (z1Var == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = z1Var.f382302h.iterator();
        while (it.hasNext()) {
            r45.by1 by1Var = ((r45.z22) it.next()).f473164h;
            java.lang.String str2 = (by1Var == null || (ay1Var = by1Var.f452676d) == null) ? null : ay1Var.f451884e;
            if (str2 == null) {
                str2 = "";
            }
            if ((str2.length() > 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void s(boolean z17) {
        android.os.IBinder windowToken;
        super.s(z17);
        android.view.View view = this.S;
        if (view == null || (windowToken = view.getWindowToken()) == null) {
            return;
        }
        java.lang.Object systemService = this.f199716e.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return true;
    }
}

package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.MainUI */
/* loaded from: classes11.dex */
public class C22376x88ed722d extends com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment implements com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m6 {
    public hh4.a C;
    public ih5.d D;
    public final e75.a E;
    public final e75.a F;
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22377x93874272 G;
    public boolean H;
    public fg5.b I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.Runnable f288903J;
    public android.content.SharedPreferences K;
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j7 L;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f288904n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f288905o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.u f288906p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f288907q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f288908r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f288909s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f288910t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f288911u;

    /* renamed from: v, reason: collision with root package name */
    public yf5.j0 f288912v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q f288913w = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q();

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f288914x = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5();

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 f288915y = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5();

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa f288916z = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa();
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 A = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9();
    public final int[] B = new int[2];

    public C22376x88ed722d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "create mainUI");
        this.D = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x6(this);
        this.E = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y6(this);
        this.F = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b7(this);
        this.G = null;
        this.H = false;
        this.I = null;
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar;
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onTabSwitchOut");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            viewOnTouchListenerC22366xcd5c2226.u();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar = viewOnTouchListenerC22366xcd5c2226.f288851m;
            if (rVar != null && (view = (zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).I1) != null) {
                zVar.H = true;
                view.setTranslationY(0.0f);
            }
        }
        if (this.f288912v != null) {
            com.p314xaae8f345.mm.ui.p2731xc84c5534.m0.f291233c.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void V() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "turn to fg");
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void e0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "turn to bg");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutView */
    public android.view.View mo78651x29ebce5() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22377x93874272 c22377x93874272 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22377x93874272) com.p314xaae8f345.mm.ui.td.f291426c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(mo7438x76847179()), com.p314xaae8f345.mm.R.C30864xbddafb2a.bvn, null, false);
        this.G = c22377x93874272;
        return c22377x93874272;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void l0(android.os.Bundle bundle) {
        j13.a aVar;
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onTabCreate, %d", java.lang.Integer.valueOf(m7479x8cdac1b()));
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (gaVar != null) {
            gaVar.f290176f0 = 4;
            gaVar.f290180h0 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "mainUIOnCreate");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        m7571x41119ed3(true);
        gm0.j1.e().o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "main ui init view");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f288914x;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar = this.f288913w;
            if (qVar.f289519p != null) {
                qVar.f(qVar.f289510d);
                qVar.f(qVar.f289511e);
                qVar.f(qVar.f289512f);
                qVar.f(qVar.f289513g);
            }
            android.widget.LinearLayout linearLayout3 = o5Var.f289461h;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
        }
        this.f288910t = (android.widget.TextView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.df_);
        this.f288911u = (android.widget.LinearLayout) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.j8f);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22262 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.j8g);
        this.f288905o = viewOnTouchListenerC22366xcd5c22262;
        viewOnTouchListenerC22366xcd5c22262.D = m78645x9f88d943();
        android.content.Context context = viewOnTouchListenerC22366xcd5c22262.getContext();
        if (viewOnTouchListenerC22366xcd5c22262.f288850i == null) {
            ((pe0.l) ((qe0.e) i95.n0.c(qe0.e.class))).getClass();
            viewOnTouchListenerC22366xcd5c22262.f288850i = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3(context);
            if (com.p314xaae8f345.mm.ui.t7.f291414a.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) viewOnTouchListenerC22366xcd5c22262.f288850i;
                viewOnTouchListenerC18555xc58183f3.getClass();
                viewOnTouchListenerC18555xc58183f3.f254041r.setVisibility(8);
                android.view.View view = viewOnTouchListenerC18555xc58183f3.f254045v;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "setHideSearchIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "setHideSearchIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((android.widget.RelativeLayout) viewOnTouchListenerC22366xcd5c22262.f288850i).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            qe0.e eVar = (qe0.e) i95.n0.c(qe0.e.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = viewOnTouchListenerC22366xcd5c22262.f288850i;
            ((pe0.l) eVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z(context, viewOnTouchListenerC22366xcd5c22262, (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar);
            viewOnTouchListenerC22366xcd5c22262.f288851m = zVar;
            java.util.LinkedList linkedList = (java.util.LinkedList) zVar.f254303n;
            if (!linkedList.contains(viewOnTouchListenerC22366xcd5c22262)) {
                linkedList.add(viewOnTouchListenerC22366xcd5c22262);
            }
            viewOnTouchListenerC22366xcd5c22262.f288850i.mo71601xf1f1958f(viewOnTouchListenerC22366xcd5c22262.f288851m);
            if (viewOnTouchListenerC22366xcd5c22262.f288848g) {
                viewOnTouchListenerC22366xcd5c22262.f288849h = true;
                viewOnTouchListenerC22366xcd5c22262.addHeaderView((android.widget.RelativeLayout) viewOnTouchListenerC22366xcd5c22262.f288850i);
            }
        }
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.nhm);
        this.f288907q = mo26077x4ff8c0f0;
        this.f288905o.m80530x8a07dd50(mo26077x4ff8c0f0);
        x0();
        ia0.n nVar = (ia0.n) i95.n0.c(ia0.n.class);
        android.app.Activity context2 = mo7438x76847179();
        ((ia0.o) nVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d c16607x5430141d = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d(context2, null, 0, 6, null);
        this.f288908r = c16607x5430141d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c16607x5430141d, arrayList2.toArray(), "com/tencent/mm/ui/conversation/MainUI", "addDynamicBackgroundView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c16607x5430141d.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c16607x5430141d, "com/tencent/mm/ui/conversation/MainUI", "addDynamicBackgroundView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.G.addView(this.f288908r, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f288905o.setDrawingCacheEnabled(false);
        this.f288905o.setScrollingCacheEnabled(false);
        android.view.View mo26077x4ff8c0f02 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564634wl);
        this.f288909s = mo26077x4ff8c0f02;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22263 = this.f288905o;
        android.view.View view2 = this.f288908r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar2 = viewOnTouchListenerC22366xcd5c22263.f288850i;
        if (sVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f32 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d c16607x5430141d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d) view2;
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 c10436x212919c6 = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6) mo26077x4ff8c0f02;
            viewOnTouchListenerC18555xc58183f32.f254032f = c16607x5430141d2;
            viewOnTouchListenerC18555xc58183f32.f254033g = c10436x212919c6;
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar2 = viewOnTouchListenerC18555xc58183f32.f254030d;
            if (zVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "setBackgroundView");
                zVar2.f254305p = c16607x5430141d2;
                zVar2.f254311t = c10436x212919c6;
                c16607x5430141d2.mo67181xa37004dc(c10436x212919c6);
            }
        }
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f7(this));
        com.p314xaae8f345.mm.ui.t7 t7Var = com.p314xaae8f345.mm.ui.t7.f291414a;
        if (t7Var.a()) {
            this.f288905o.addHeaderView(t7Var.b(mo7438x76847179(), com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().f7()));
        }
        android.app.Activity context3 = mo7438x76847179();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22264 = this.f288905o;
        yf5.j0 j0Var = this.f288912v;
        android.widget.LinearLayout linearLayout4 = this.f288911u;
        o5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        o5Var.f289458e = context3;
        o5Var.f289459f = viewOnTouchListenerC22366xcd5c22264;
        o5Var.f289457d = j0Var;
        o5Var.f289461h = linearLayout4;
        o5Var.f289464n = (int) (context3.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561429i9) + 0.5f);
        o5Var.f289465o = (int) (context3.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561405hl) + 0.5f);
        o5Var.f289466p = (int) (i65.a.f(context3, com.p314xaae8f345.mm.R.C30860x5b28f31.f561160b2) * i65.a.m(context3));
        if (com.p314xaae8f345.mm.ui.a4.f278650a.h(context3)) {
            o5Var.f289466p += com.p314xaae8f345.mm.ui.bl.c(context3);
        }
        o5Var.H = 0;
        o5Var.c(com.p314xaae8f345.mm.ui.bk.h(context3).y, true);
        s35.a a17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(o5Var.f289458e, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.CHATTING_FOLD_BANNER, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.banner.BaseBanner");
        s35.b bVar = (s35.b) a17;
        o5Var.f289460g = bVar;
        android.widget.LinearLayout linearLayout5 = o5Var.f289461h;
        if (linearLayout5 != null) {
            linearLayout5.addView(bVar.f484376h);
        }
        android.widget.LinearLayout linearLayout6 = o5Var.f289461h;
        if (linearLayout6 != null) {
            linearLayout6.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f5(o5Var, bVar));
        }
        s35.b bVar2 = o5Var.f289460g;
        o5Var.f289462i = (bVar2 == null || (linearLayout2 = bVar2.f484376h) == null) ? null : linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.mj_);
        s35.b bVar3 = o5Var.f289460g;
        o5Var.f289463m = (bVar3 == null || (linearLayout = bVar3.f484376h) == null) ? null : (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.g_u);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22265 = o5Var.f289459f;
        if (viewOnTouchListenerC22366xcd5c22265 != null) {
            viewOnTouchListenerC22366xcd5c22265.m80526xae6cb88f(o5Var.f289461h);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22266 = o5Var.f289459f;
        if (viewOnTouchListenerC22366xcd5c22266 != null) {
            viewOnTouchListenerC22366xcd5c22266.m80527xb8e14911(o5Var);
        }
        android.widget.LinearLayout linearLayout7 = o5Var.f289461h;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout7 != null ? linearLayout7.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = o5Var.f289466p;
        }
        android.widget.LinearLayout linearLayout8 = o5Var.f289461h;
        if (linearLayout8 != null) {
            linearLayout8.setLayoutParams(marginLayoutParams);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22267 = o5Var.f289459f;
        ag5.a aVar2 = viewOnTouchListenerC22366xcd5c22267 != null ? new ag5.a(viewOnTouchListenerC22366xcd5c22267) : null;
        o5Var.D = aVar2 != null ? new ag5.b(aVar2) : null;
        c01.d9.b().a(o5Var);
        c01.d9.b().getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f01.w1.INSTANCE.f339939d.f378507a;
        if (!concurrentHashMap.contains(o5Var)) {
            concurrentHashMap.put(o5Var, java.lang.Boolean.FALSE);
        }
        c01.d9.b().getClass();
        j01.c cVar = f01.s1.INSTANCE.f339924d;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = cVar.f378507a;
        if (!concurrentHashMap2.contains(o5Var)) {
            if (mainLooper != null) {
                concurrentHashMap2.put(o5Var, new android.os.Handler(mainLooper));
            } else {
                concurrentHashMap2.put(o5Var, java.lang.Boolean.FALSE);
            }
        }
        o5Var.E.mo48813x58998cd();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22268 = this.f288905o;
        yf5.j0 j0Var2 = this.f288912v;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 x9Var = this.A;
        x9Var.f289772a = viewOnTouchListenerC22366xcd5c22268;
        x9Var.f289773b = j0Var2;
        x9Var.f289774c = o5Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 b0Var = x9Var.f289779h;
        viewOnTouchListenerC22366xcd5c22268.setOnScrollListener(b0Var);
        ((yf5.w0) j0Var2).f543520s = b0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v9(x9Var));
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().f7().n();
        yf5.j0 j0Var3 = this.f288912v;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 listView = this.f288905o;
        yf5.w0 w0Var = (yf5.w0) j0Var3;
        w0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listView, "listView");
        w0Var.f543512h = listView;
        listView.setAdapter((android.widget.ListAdapter) w0Var);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22269 = this.f288905o;
        viewOnTouchListenerC22366xcd5c22269.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w2(this.f288912v, viewOnTouchListenerC22366xcd5c22269, mo7430x19263085()));
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c222610 = this.f288905o;
        viewOnTouchListenerC22366xcd5c222610.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r3(this.f288912v, viewOnTouchListenerC22366xcd5c222610, mo7430x19263085(), this.B));
        this.f288905o.m80531xbc4e7d2a(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.g7(this));
        hh4.a aVar3 = this.C;
        if (aVar3 != null) {
            this.f288905o.m80524x989890c9(aVar3);
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f288904n;
        if (activityC21401x6ce6f73f != null) {
            this.f288905o.m80525x13de9191(activityC21401x6ce6f73f);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j7 j7Var = this.L;
        if (j7Var != null) {
            u0(j7Var.f289312a, j7Var.f289313b, j7Var.f289314c);
        }
        this.f288905o.setSelection(0);
        ((pe0.l) ((qe0.e) i95.n0.c(qe0.e.class))).getClass();
        this.f288906p = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2();
        if (this.f288905o.m80523x367742dd() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.t m80523x367742dd = this.f288905o.m80523x367742dd();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.u uVar = this.f288906p;
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) m80523x367742dd;
            c18557xc00aa3f3.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "TaskBarView initPresenter");
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2) uVar;
            c18557xc00aa3f3.f254056c2 = o2Var;
            o2Var.getClass();
            o2Var.f254188a = c18557xc00aa3f3;
            o2Var.A.mo48813x58998cd();
            o2Var.f254212y.mo48813x58998cd();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q2.f254225d = new java.lang.ref.WeakReference(o2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w.f254270d = new java.lang.ref.WeakReference(o2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b.f254094d = new java.lang.ref.WeakReference(o2Var);
            gh4.o0 Bi = ((gh4.e0) i95.n0.c(gh4.e0.class)).Bi();
            if (Bi != null) {
                Bi.add(o2Var.f254213z);
            }
            ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(o2Var.B);
            pv.z zVar3 = (pv.z) i95.n0.c(pv.z.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c2 c2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c2) ((jz5.n) o2Var.C).mo141623x754a37bb();
            ov.b bVar4 = (ov.b) zVar3;
            if (c2Var != null) {
                synchronized (bVar4.f430600e) {
                    bVar4.f430600e.remove(c2Var);
                }
            } else {
                bVar4.getClass();
            }
            pv.z zVar4 = (pv.z) i95.n0.c(pv.z.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c2 c2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c2) ((jz5.n) o2Var.C).mo141623x754a37bb();
            ov.b bVar5 = (ov.b) zVar4;
            if (c2Var2 != null) {
                synchronized (bVar5.f430600e) {
                    bVar5.f430600e.add(c2Var2);
                }
            } else {
                bVar5.getClass();
            }
            o2Var.n();
            o2Var.b(true, 2000L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "forceReloadData");
            java.lang.Runnable runnable = c18557xc00aa3f3.Y2;
            c18557xc00aa3f3.removeCallbacks(runnable);
            c18557xc00aa3f3.postDelayed(runnable, 2000L);
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.i2(o2Var));
        }
        final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f288915y;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar2 = this.f288913w;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var2 = this.f288914x;
        q5Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "onCreate %s", java.lang.Integer.valueOf(mo7430x19263085.hashCode()));
        q5Var.f289542o = mo7430x19263085;
        q5Var.f289544q = qVar2;
        q5Var.f289545r = o5Var2;
        q5Var.f289546s = this;
        q5Var.f289543p = new java.lang.ref.WeakReference(mo7430x19263085);
        q5Var.f289538h = ((android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power")).newWakeLock(26, "NetSceneInit Lock");
        c01.d9.e().a(-1, q5Var);
        q5Var.f289539i = false;
        q5Var.f289548u.mo48813x58998cd();
        q5Var.f289549v.mo48813x58998cd();
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.conversation.q5$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var2 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5.this;
                q5Var2.getClass();
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir(), "DBRecoverStarted");
                if (r6Var.m()) {
                    jx3.f.INSTANCE.i("DBRepair", "Last recovery interrupted.", null);
                    r6Var.l();
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.C20992x3fea691 c20992x3fea691 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20992x3fea691(com.p314xaae8f345.mm.vfs.w6.i(new com.p314xaae8f345.mm.vfs.z7(null, null, new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir(), "MMStarted").getPath(), null, null).m82499x9616526c(), true), true);
                q5Var2.f289550w = c20992x3fea691;
                if (c20992x3fea691.d()) {
                    q5Var2.f289550w.e();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DuplicateDetect", "No data multiple instance detected.");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DuplicateDetect", "Data multiple instance detected.");
                    jx3.f.INSTANCE.mo68477x336bdfd8(579L, 0L, 1L, true);
                }
                q5Var2.f289550w.b();
            }
        }, "InitHelper-Report");
        final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa paVar = this.f288916z;
        yf5.j0 j0Var4 = this.f288912v;
        final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c222611 = this.f288905o;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
        paVar.f289503e = j0Var4;
        paVar.f289502d = mo7430x192630852;
        paVar.f289504f = viewOnTouchListenerC22366xcd5c222611;
        if (paVar.f289505g == null) {
            final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.fa faVar = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.fa(paVar);
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            paVar.f289505g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5870x9faf102d>(paVar, a0Var, faVar) { // from class: com.tencent.mm.ui.conversation.RefreshHelper$2

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f288945d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(a0Var);
                    this.f288945d = faVar;
                    this.f39173x3fe91575 = -474068419;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5870x9faf102d c5870x9faf102d) {
                    this.f288945d.mo50305x3d8a09a2(0);
                    return false;
                }
            };
        }
        if (paVar.f289506h == null) {
            paVar.f289506h = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22381xe5ed8498(paVar, com.p314xaae8f345.mm.app.a0.f134821d);
        }
        if (paVar.f289507i == null) {
            final com.p314xaae8f345.mm.app.a0 a0Var2 = com.p314xaae8f345.mm.app.a0.f134821d;
            paVar.f289507i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5699xa5cbf45a>(paVar, a0Var2, viewOnTouchListenerC22366xcd5c222611) { // from class: com.tencent.mm.ui.conversation.RefreshHelper$4

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 f288947d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(a0Var2);
                    this.f288947d = viewOnTouchListenerC22366xcd5c222611;
                    this.f39173x3fe91575 = -765268918;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5699xa5cbf45a c5699xa5cbf45a) {
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c222612 = this.f288947d;
                    if (viewOnTouchListenerC22366xcd5c222612 != null) {
                        viewOnTouchListenerC22366xcd5c222612.setSelection(0);
                    }
                    return false;
                }
            };
        }
        paVar.f289505g.mo48813x58998cd();
        paVar.f289506h.mo48813x58998cd();
        paVar.f289507i.mo48813x58998cd();
        viewOnTouchListenerC22366xcd5c222611.post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ia(paVar));
        zr.b bVar6 = (zr.b) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.b.class);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f lifecycleOwner = mo78409x676b27cd();
        e75.a observer = this.F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        bVar6.f273902d.m127127x9d92d11c(lifecycleOwner, e75.g.f69659x9393ed43, observer);
        gm0.m.f354765u = false;
        dm.e2.D2.m127126x9d92d11c(this, com.p314xaae8f345.mm.p670x38b72420.d.f146388g);
        yf5.w0 w0Var2 = (yf5.w0) this.f288912v;
        w0Var2.d().l();
        java.util.List a18 = w0Var2.c().a();
        yf5.a aVar4 = w0Var2.f543518q;
        aVar4.a(a18);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2696xbb6ca34f.C22385x8ef10852 c22385x8ef10852 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2696xbb6ca34f.C22385x8ef10852(w0Var2.d(), new xm3.n0(), w0Var2.f543508d, a18);
        yf5.s0 callback = (yf5.s0) ((jz5.n) w0Var2.f543519r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        c22385x8ef10852.f233600q = callback;
        w0Var2.f543517p = c22385x8ef10852;
        yf5.w d17 = w0Var2.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = w0Var2.f543517p;
        if (c16718x7059cefe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmList");
            throw null;
        }
        d17.f543495f = c16718x7059cefe;
        w0Var2.d().f543497h = aVar4;
        w0Var2.d().f543498i = w0Var2;
        w0Var2.d().f543496g = w0Var2.c();
        yf5.m c17 = w0Var2.c();
        v65.i.b(c17.f543442c, null, new yf5.h(c17, c17.f543445f.f543397b, null, null), 1, null);
        if (((f13.e) i95.n0.c(f13.e.class)) != null && (aVar = j13.a.f378710d) != null) {
            aVar.add((yf5.q0) ((jz5.n) w0Var2.f543525x).mo141623x754a37bb());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "kevin mainUIOnCreate time:%d uin:%d ver:%x", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(c01.d9.b().C()), java.lang.Integer.valueOf(o45.wf.f424562g));
        if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b() != null) {
            boolean isInMultiWindowMode = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().isInMultiWindowMode();
            this.H = isInMultiWindowMode;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "initMultiWindowModeListener %s", java.lang.Boolean.valueOf(isInMultiWindowMode));
        }
        fg5.b bVar7 = this.I;
        if (bVar7 != null) {
            bVar7.m43072x2efc64();
        }
        fg5.b bVar8 = new fg5.b(this.f288912v);
        this.I = bVar8;
        bVar8.m43071x58998cd();
        this.f288905o.postDelayed(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r6(this), 200L);
        m78697x5913ff35(this.D);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void m0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onTabDestroy  acc:%b", java.lang.Boolean.valueOf(gm0.j1.a()));
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w6(this));
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f288914x;
        o5Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "onTabDestroy");
        o5Var.t();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = o5Var.f289459f;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            viewOnTouchListenerC22366xcd5c2226.removeCallbacks(o5Var.C);
        }
        s35.b bVar = o5Var.f289460g;
        if (bVar != null) {
            bVar.a();
        }
        ag5.b bVar2 = o5Var.D;
        if (bVar2 != null) {
            bVar2.a();
        }
        if (gm0.j1.a()) {
            c01.d9.b().G(o5Var);
            c01.d9.b().getClass();
            f01.w1.INSTANCE.f339939d.f378507a.remove(o5Var);
            c01.d9.b().getClass();
            f01.s1.INSTANCE.f339924d.f378507a.remove(o5Var);
        }
        o5Var.E.mo48814x2efc64();
        o5Var.f289458e = null;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f288915y;
        q5Var.getClass();
        try {
            q5Var.f289550w.e();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InitHelper", "onTabDestroy, dupDetectLock unlock failed : " + th6.getMessage());
        }
        c01.d9.e().q(-1, q5Var);
        android.app.ProgressDialog progressDialog = q5Var.f289541n;
        if (progressDialog != null) {
            progressDialog.dismiss();
            q5Var.f289541n = null;
        }
        q5Var.f289548u.mo48814x2efc64();
        q5Var.f289549v.mo48814x2efc64();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa paVar = this.f288916z;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = paVar.f289505g;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
            paVar.f289505g = null;
        }
        paVar.f289506h.mo48814x2efc64();
        paVar.f289507i.mo48814x2efc64();
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).f(paVar);
        }
        if (gm0.j1.a()) {
            int i17 = x51.t1.f533619a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Util", "memory usage: h=%s/%s, e=%s/%s, n=%s/%s", x51.t1.a(android.os.Debug.getGlobalAllocSize()), x51.t1.a(android.os.Debug.getGlobalAllocSize() + android.os.Debug.getGlobalFreedSize()), x51.t1.a(android.os.Debug.getGlobalExternalAllocSize()), x51.t1.a(android.os.Debug.getGlobalExternalAllocSize() + android.os.Debug.getGlobalExternalFreedSize()), x51.t1.a(android.os.Debug.getNativeHeapAllocatedSize()), x51.t1.a(android.os.Debug.getNativeHeapSize()));
        }
        this.D = null;
        m78697x5913ff35(null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void n0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onTabPause");
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            return;
        }
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u6(this));
        this.f288915y.d();
        mo78661x36654fab();
        this.f288916z.a();
        yf5.j0 j0Var = this.f288912v;
        if (j0Var != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            if (w0Var.f543524w) {
                w0Var.f543524w = false;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: noActionBar */
    public boolean mo48374x69604d3c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void o0() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22262;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onTabResume");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        s0();
        nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s6(this));
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.pa paVar = this.f288916z;
        paVar.getClass();
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).a(paVar);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ja(paVar));
        android.app.Activity activity = paVar.f289502d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("NewShowRating");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(d17, "ShowRatingNode", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                java.lang.String str = "0";
                int intValue = java.lang.Integer.decode((d18 == null || d18.get(".ShowRatingNode.MinVer") == null) ? "0" : (java.lang.String) d18.get(".ShowRatingNode.MinVer")).intValue();
                int intValue2 = java.lang.Integer.decode((d18 == null || d18.get(".ShowRatingNode.MaxVer") == null) ? "0" : (java.lang.String) d18.get(".ShowRatingNode.MaxVer")).intValue();
                if (d18 != null && d18.get(".ShowRatingNode.WaitDays") != null) {
                    str = (java.lang.String) d18.get(".ShowRatingNode.WaitDays");
                }
                int intValue3 = java.lang.Integer.decode(str).intValue();
                int i17 = o45.wf.f424562g;
                if (intValue <= i17 && i17 <= intValue2) {
                    android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences("show_rating_preferences", 0);
                    int i18 = sharedPreferences.getInt("show_rating_flag", 0);
                    int i19 = sharedPreferences.getInt("show_rating_version", 0);
                    long j17 = sharedPreferences.getLong("show_rating_timestamp", 0L);
                    boolean z18 = sharedPreferences.getBoolean("show_rating_again", false);
                    long j18 = (intValue3 == 0 ? 7 : intValue3) * 86400000;
                    if (i19 == 0 || intValue > i19 || i19 > intValue2) {
                        sharedPreferences.edit().putInt("show_rating_version", o45.wf.f424562g).commit();
                        sharedPreferences.edit().putInt("show_rating_flag", 0).commit();
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        sharedPreferences.edit().putLong("show_rating_timestamp", currentTimeMillis).commit();
                        sharedPreferences.edit().putBoolean("show_rating_again", false).commit();
                        sharedPreferences.edit().putInt("show_rating_wait_days", intValue3).commit();
                        sharedPreferences.edit().putInt("show_rating_first_second_time", (int) (java.lang.System.currentTimeMillis() / 1000)).commit();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]current clientVersion=%s,has rating clientVersion=%s,dynamic config showRatting min version=%s,max version:%s,waitDaysMillis:%s", java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Long.valueOf(j18));
                        j17 = currentTimeMillis;
                        i18 = 0;
                    }
                    int i27 = o45.wf.f424562g;
                    if (intValue <= i27 && i27 <= intValue2 && i18 == 0 && j17 != 0 && java.lang.System.currentTimeMillis() >= j17 + j18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show enjoy app dialog.");
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.f289188a = db5.e1.K(activity, false, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574689j54), "", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4x), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4w), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.y9(sharedPreferences, activity), new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.z9(sharedPreferences, activity));
                    } else if (z18 && j17 != 0 && java.lang.System.currentTimeMillis() >= j17 + j18 + 345600000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog again.");
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.b(activity, false);
                        sharedPreferences.edit().putInt("show_rating_flag", 3).commit();
                    } else if (i18 == 1) {
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.b(activity, true);
                    } else if (i18 == 2) {
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.a(activity);
                    } else if (i18 == 3) {
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ea.b(activity, false);
                    }
                }
            }
        }
        android.app.Activity activity2 = paVar.f289502d;
        if (activity2 != null && activity2.getIntent() != null && paVar.f289502d.getIntent().getBooleanExtra("resend_fail_messages", false)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ma(paVar), 500L);
            paVar.f289502d.getIntent().putExtra("resend_fail_messages", false);
        }
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) paVar.f289502d;
        if (activityC21387x976b8e54 != null) {
            com.p314xaae8f345.mm.ui.C21374x812c2fd3 m78446x1cde66a9 = activityC21387x976b8e54.m78446x1cde66a9();
            java.lang.Runnable runnable = paVar.f289508m;
            java.util.LinkedList linkedList = m78446x1cde66a9.T;
            if (!linkedList.contains(runnable)) {
                linkedList.add(runnable);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(paVar.f289502d.getIntent(), "Main_ListToTop", false) && (viewOnTouchListenerC22366xcd5c22262 = paVar.f289504f) != null) {
            viewOnTouchListenerC22366xcd5c22262.post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.oa(paVar));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.m(paVar.f289502d.getIntent(), "Main_ListToTop", false);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f288915y;
        java.lang.Object[] objArr = new java.lang.Object[2];
        android.app.ProgressDialog progressDialog = q5Var.f289541n;
        objArr[0] = java.lang.Integer.valueOf(progressDialog == null ? -1 : progressDialog.isShowing() ? 1 : 0);
        w11.k0 k0Var = q5Var.f289540m;
        objArr[1] = java.lang.Integer.valueOf(k0Var == null ? -2 : k0Var.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "onTabResume tip:%d initscene:%d", objArr);
        q5Var.e();
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.c6(q5Var), 300L);
        if (gm0.j1.a()) {
            if (!(this.f288915y.f289540m != null)) {
                int i28 = j62.e.g().i("clicfg_exdevice_not_sync_data_in_mainui", 1, true, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessReclaimSwitch", "isExDeviceMainUISyncDataDisabled:" + i28);
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (i28 == 0) {
                    ((zr.d) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.d.class)).O6(new java.lang.Object());
                }
                ((ve4.f) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(ve4.f.class)).O6(4);
            }
        }
        ul5.k m78645x9f88d943 = m78645x9f88d943();
        if (m78645x9f88d943 != 0) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4) m78645x9f88d943).g(false);
            m78645x9f88d943.mo82165xac752035(mo7438x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t6 t6Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t6(this);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c22263 = this.f288905o;
            if (viewOnTouchListenerC22366xcd5c22263 != null) {
                viewOnTouchListenerC22366xcd5c22263.setTag(com.p314xaae8f345.mm.R.id.plp, t6Var);
            }
        }
        com.p314xaae8f345.mm.ui.ga m78647x143f1b92 = m78647x143f1b92();
        if (m78647x143f1b92 != null) {
            int color = mo7430x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
            android.widget.FrameLayout frameLayout = m78647x143f1b92.f290177g;
            if (frameLayout != null) {
                android.view.View findViewById = frameLayout.findViewById(com.p314xaae8f345.mm.R.id.og9);
                if (findViewById == null) {
                    findViewById = new android.view.View(m78647x143f1b92.x());
                    findViewById.setId(com.p314xaae8f345.mm.R.id.og9);
                    m78647x143f1b92.f290177g.addView(findViewById);
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = com.p314xaae8f345.mm.ui.bl.i(m78647x143f1b92.x(), -1);
                }
                findViewById.setBackgroundColor(color);
            }
        }
        java.lang.String str3 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290735f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "facebook resetCheck");
        ((qf0.u) ((rf0.p) i95.n0.c(rf0.p.class))).getClass();
        ((ku5.t0) ku5.t0.f394148d).g(qf0.t.f443786d);
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Ni(false);
        if (!com.p314xaae8f345.mm.ui.a4.f278650a.h(mo78409x676b27cd()) || (viewOnTouchListenerC22366xcd5c2226 = this.f288905o) == null || viewOnTouchListenerC22366xcd5c2226.r()) {
            return;
        }
        com.p314xaae8f345.mm.ui.C21369x9726cc7b c21369x9726cc7b = (com.p314xaae8f345.mm.ui.C21369x9726cc7b) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.jlt);
        com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b = (com.p314xaae8f345.mm.ui.C21389xb8f36d3b) c21369x9726cc7b.getRootView().findViewById(com.p314xaae8f345.mm.R.id.huj);
        c21369x9726cc7b.a(true, c21389xb8f36d3b.getHeight(), c21389xb8f36d3b.getTranslationY());
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f288913w.h();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f288914x;
        o5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        o5Var.c(com.p314xaae8f345.mm.ui.bk.h(o5Var.f289458e).y, true);
        o5Var.A(true);
        if (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b() == null || this.H == com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().isInMultiWindowMode()) {
            return;
        }
        this.H = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b().isInMultiWindowMode();
        x0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "MainUI.onCreate");
        yf5.w0 w0Var = new yf5.w0(mo7430x19263085(), this.f288914x, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.d7(this));
        this.f288912v = w0Var;
        w0Var.f543526y = new yf5.d(w0Var.f543508d, 18);
        c01.f b17 = c01.d9.b();
        yf5.j0 j0Var = this.f288912v;
        b17.getClass();
        j01.c cVar = f01.s1.INSTANCE.f339924d;
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = cVar.f378507a;
        if (!concurrentHashMap.contains(j0Var)) {
            if (mainLooper != null) {
                concurrentHashMap.put(j0Var, new android.os.Handler(mainLooper));
            } else {
                concurrentHashMap.put(j0Var, java.lang.Boolean.FALSE);
            }
        }
        ((l75.a1) c01.d9.b().q()).a(this.f288912v);
        final yf5.w0 w0Var2 = (yf5.w0) this.f288912v;
        if (w0Var2.B == null) {
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            w0Var2.B = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5181x6d2f4734>(a0Var) { // from class: com.tencent.mm.ui.conversation.adapter.MvvmConversationAdapter$addBackupResetAccUinListener$1
                {
                    this.f39173x3fe91575 = -991574716;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5181x6d2f4734 c5181x6d2f4734) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5181x6d2f4734 event = c5181x6d2f4734;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    yf5.w0.this.C = true;
                    return false;
                }
            };
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = w0Var2.B;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        yf5.j0 j0Var2 = this.f288912v;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e7 e7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e7(this);
        yf5.w0 w0Var3 = (yf5.w0) j0Var2;
        w0Var3.getClass();
        w0Var3.D = e7Var;
        zr.c cVar2 = (zr.c) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.c.class);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f lifecycleOwner = mo78409x676b27cd();
        e75.a observer = this.E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        cVar2.f273902d.m127127x9d92d11c(lifecycleOwner, e75.g.f69659x9393ed43, observer);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        j13.a aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onDestroy");
        this.A.b();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "onDestroy");
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar = viewOnTouchListenerC22366xcd5c2226.f288850i;
            if (sVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "onDestroy");
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = viewOnTouchListenerC18555xc58183f3.f254031e;
                if (c18557xc00aa3f3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "TaskBarView onDestroy %d", java.lang.Integer.valueOf(c18557xc00aa3f3.hashCode()));
                    c18557xc00aa3f3.f254056c2.f254188a = null;
                    c18557xc00aa3f3.N2.mo48814x2efc64();
                    try {
                        synchronized (c18557xc00aa3f3) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c18557xc00aa3f3.f254057d2;
                            if (n3Var != null) {
                                n3Var.mo50302x6b17ad39(null);
                            }
                            c18557xc00aa3f3.f254057d2 = null;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TaskBarView", e17, "onDestroy exception", new java.lang.Object[0]);
                    }
                }
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = viewOnTouchListenerC18555xc58183f3.N;
                if (abstractC20980x9b9ad01d != null) {
                    abstractC20980x9b9ad01d.mo48814x2efc64();
                }
                java.lang.Runnable runnable = viewOnTouchListenerC18555xc58183f3.M;
                if (runnable != null) {
                    viewOnTouchListenerC18555xc58183f3.removeCallbacks(runnable);
                    viewOnTouchListenerC18555xc58183f3.M = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d c16607x5430141d = viewOnTouchListenerC18555xc58183f3.f254032f;
                if (c16607x5430141d != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "release");
                    c16607x5430141d.released = true;
                    if (c16607x5430141d.dynamicBgSurfaceView != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "removed");
                        c16607x5430141d.removeView(c16607x5430141d.dynamicBgSurfaceView);
                        c16607x5430141d.dynamicBgSurfaceView = null;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar = viewOnTouchListenerC22366xcd5c2226.f288851m;
            if (rVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "DesktopAnimController onDestroy");
                android.widget.ListView listView = zVar.f254296e;
                if (listView != null) {
                    java.lang.Runnable runnable2 = zVar.f254321z;
                    if (runnable2 != null) {
                        listView.removeCallbacks(runnable2);
                        zVar.f254321z = null;
                    }
                    java.lang.Runnable runnable3 = zVar.f254318y;
                    if (runnable3 != null) {
                        zVar.f254296e.removeCallbacks(runnable3);
                        zVar.f254318y = null;
                    }
                    java.lang.Runnable runnable4 = zVar.X;
                    if (runnable4 != null) {
                        zVar.f254296e.removeCallbacks(runnable4);
                        zVar.X = null;
                    }
                }
                ((ku5.t0) ku5.t0.f394148d).A("AppBrandDesktopPerformanceMonitor");
                kh4.f fVar = kh4.f.INSTANCE;
                synchronized (fVar.f389596g) {
                    if (fVar.f389594e) {
                        wu5.c cVar = fVar.f389595f;
                        if (cVar != null) {
                            cVar.cancel(false);
                        }
                        fVar.f389594e = false;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PerformanceMonitor", "PerformanceMonitor release");
                java.util.HashMap hashMap = fVar.f389593d;
                if (hashMap != null) {
                    hashMap.clear();
                }
                zVar.D = false;
            }
            java.lang.Runnable runnable5 = viewOnTouchListenerC22366xcd5c2226.A;
            if (runnable5 != null) {
                viewOnTouchListenerC22366xcd5c2226.removeCallbacks(runnable5);
            }
            java.lang.Runnable runnable6 = viewOnTouchListenerC22366xcd5c2226.f288865z;
            if (runnable6 != null) {
                viewOnTouchListenerC22366xcd5c2226.removeCallbacks(runnable6);
            }
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = viewOnTouchListenerC22366xcd5c2226.N;
            if (abstractC20980x9b9ad01d2 != null) {
                abstractC20980x9b9ad01d2.mo48814x2efc64();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.u uVar = this.f288906p;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2) uVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "onDestroy");
            o2Var.f254188a = null;
            o2Var.A.mo48814x2efc64();
            o2Var.f254212y.mo48814x2efc64();
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q2.f254225d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w.f254270d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b.f254094d = null;
            ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(o2Var.B);
            gh4.o0 Bi = ((gh4.e0) i95.n0.c(gh4.e0.class)).Bi();
            if (Bi != null) {
                Bi.mo49775xc84af884(o2Var.f254213z);
            }
            ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelTaskBarController", "releaseAudioPanelTaskBarController " + ip1.q.f375129a.hashCode());
            kp1.l1 l1Var = ip1.q.f375130b;
            if (l1Var != null) {
                l1Var.mo54039x41012807();
            }
            ip1.q.f375130b = null;
            ip1.q.f375134f = null;
            ip1.q.f375135g = null;
            pv.z zVar2 = (pv.z) i95.n0.c(pv.z.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c2 c2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.c2) ((jz5.n) o2Var.C).mo141623x754a37bb();
            ov.b bVar = (ov.b) zVar2;
            if (c2Var != null) {
                synchronized (bVar.f430600e) {
                    bVar.f430600e.remove(c2Var);
                }
            } else {
                bVar.getClass();
            }
        }
        super.mo7504xac79a11b();
        zr.c cVar2 = (zr.c) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.c.class);
        e75.a observer = this.E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        cVar2.f273902d.mo127128xb5bdeb7a(observer);
        fg5.b bVar2 = this.I;
        if (bVar2 != null) {
            bVar2.m43072x2efc64();
            this.I = null;
        }
        yf5.j0 j0Var = this.f288912v;
        if (j0Var != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d3 = w0Var.B;
            if (abstractC20980x9b9ad01d3 != null) {
                abstractC20980x9b9ad01d3.mo48814x2efc64();
            }
            w0Var.B = null;
            yf5.w0 w0Var2 = (yf5.w0) this.f288912v;
            w0Var2.D = null;
            w0Var2.D = null;
            w0Var2.f543522u.clear();
            if (((f13.e) i95.n0.c(f13.e.class)) != null && (aVar = j13.a.f378710d) != null) {
                aVar.mo49775xc84af884((yf5.q0) ((jz5.n) w0Var2.f543525x).mo141623x754a37bb());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w0Var2.f543511g, "onDestroy");
        }
        if (!gm0.j1.a() || this.f288912v == null) {
            return;
        }
        c01.f b17 = c01.d9.b();
        yf5.j0 j0Var2 = this.f288912v;
        b17.getClass();
        f01.s1.INSTANCE.f339924d.f378507a.remove(j0Var2);
        ((l75.a1) c01.d9.b().q()).e(this.f288912v);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onKeyDown */
    public boolean mo78345x1f03f0c2(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 0) {
            return super.mo78345x1f03f0c2(i17, keyEvent);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        if (viewOnTouchListenerC22366xcd5c2226 == null || !viewOnTouchListenerC22366xcd5c2226.r()) {
            return super.mo78345x1f03f0c2(i17, keyEvent);
        }
        this.f288905o.j(10L, 11, false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onPause");
        super.mo7512xb01dfb57();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            if (viewOnTouchListenerC22366xcd5c2226.f288848g && (sVar = viewOnTouchListenerC22366xcd5c2226.f288850i) != null && (c18557xc00aa3f3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar).f254031e) != null) {
                c18557xc00aa3f3.f254079z2 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onPause isHeaderOpen: %b, needProcess: %b", java.lang.Boolean.valueOf(c18557xc00aa3f3.f254075v2), java.lang.Boolean.valueOf(c18557xc00aa3f3.B2));
                if (c18557xc00aa3f3.f254075v2 && c18557xc00aa3f3.B2) {
                    c18557xc00aa3f3.C2 = true;
                    c18557xc00aa3f3.v1();
                }
                if (c18557xc00aa3f3.E2) {
                    c18557xc00aa3f3.E2 = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = c18557xc00aa3f3.f254059f2;
                    if (viewOnTouchListenerC18555xc58183f3 != null) {
                        int i17 = c18557xc00aa3f3.G2;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = viewOnTouchListenerC18555xc58183f3.f254030d;
                        if (zVar != null) {
                            zVar.b(1000L, i17, false);
                        }
                        c18557xc00aa3f3.G2 = 0;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = c18557xc00aa3f3.f254056c2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var = o2Var.f254188a;
                if (a2Var != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var).f254075v2) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = o2Var.f254208u;
                    if (currentTimeMillis >= j17) {
                        o2Var.f254209v += currentTimeMillis - j17;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "onPause lastStartTime:%d,duration:%d,currentTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(o2Var.f254209v), java.lang.Long.valueOf(currentTimeMillis));
                }
                ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
                ip1.q qVar = ip1.q.f375129a;
            }
            if (!viewOnTouchListenerC22366xcd5c2226.f288848g || (rVar = viewOnTouchListenerC22366xcd5c2226.f288851m) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar;
            if (zVar2.h() && zVar2.N) {
                return;
            }
            zVar2.g();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar2;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar;
        kp1.l1 l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f32;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onResume");
        super.mo7517x57429eec();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            if (viewOnTouchListenerC22366xcd5c2226.f288848g && (sVar = viewOnTouchListenerC22366xcd5c2226.f288850i) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f33 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar;
                viewOnTouchListenerC18555xc58183f33.h();
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = viewOnTouchListenerC18555xc58183f33.f254031e;
                if (c18557xc00aa3f3 != null) {
                    c18557xc00aa3f3.f254079z2 = false;
                    c18557xc00aa3f3.A2 = false;
                    c18557xc00aa3f3.f254078y2 = false;
                    if (c18557xc00aa3f3.C) {
                        c18557xc00aa3f3.mo7966xf161ffec(false);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onResume isHeaderOpen: %b, needProcessSurfaceWhenResumed: %b, needCloseWhenPaused: %b", java.lang.Boolean.valueOf(c18557xc00aa3f3.f254075v2), java.lang.Boolean.valueOf(c18557xc00aa3f3.C2), java.lang.Boolean.valueOf(c18557xc00aa3f3.D2));
                    if (c18557xc00aa3f3.f254075v2 && c18557xc00aa3f3.C2) {
                        if (gh4.j0.b() && (viewOnTouchListenerC18555xc58183f32 = c18557xc00aa3f3.f254059f2) != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = viewOnTouchListenerC18555xc58183f32.f254030d;
                            if (zVar != null ? zVar.h() : false) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "switchToDynamicBackgroundView");
                                ((android.view.View) c18557xc00aa3f3.f254059f2.getParent()).setBackgroundColor(c18557xc00aa3f3.f254060g2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d m71591x13a1e17d = c18557xc00aa3f3.f254059f2.m71591x13a1e17d();
                                if (m71591x13a1e17d != null && c18557xc00aa3f3.L2) {
                                    synchronized (m71591x13a1e17d) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "resume");
                                        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView = m71591x13a1e17d.getGradientBgView();
                                        if (gradientBgView != null) {
                                            gradientBgView.setVisibility(0);
                                        }
                                        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView2 = m71591x13a1e17d.getGradientBgView();
                                        if (gradientBgView2 != null) {
                                            gradientBgView2.setAlpha(1.0f);
                                        }
                                        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d40 = m71591x13a1e17d.dynamicBgSurfaceView;
                                        if (c10434xd4fc3d40 != null) {
                                            c10434xd4fc3d40.c();
                                        }
                                        m71591x13a1e17d.postDelayed(new sk3.a(m71591x13a1e17d), 100L);
                                    }
                                    c18557xc00aa3f3.L2 = false;
                                }
                            }
                        }
                        c18557xc00aa3f3.B2 = true;
                        c18557xc00aa3f3.C2 = true;
                    }
                    if (c18557xc00aa3f3.D2 && (viewOnTouchListenerC18555xc58183f3 = c18557xc00aa3f3.f254059f2) != null) {
                        if (c18557xc00aa3f3.f254075v2) {
                            int i18 = c18557xc00aa3f3.G2;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar2 = viewOnTouchListenerC18555xc58183f3.f254030d;
                            if (zVar2 != null) {
                                zVar2.b(0L, i18, true);
                            }
                        }
                        c18557xc00aa3f3.G2 = 0;
                        c18557xc00aa3f3.D2 = false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = c18557xc00aa3f3.f254056c2;
                    if (o2Var != null) {
                        o2Var.n();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var = o2Var.f254188a;
                        if (a2Var != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var).f254075v2) {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            if (currentTimeMillis >= o2Var.f254208u) {
                                o2Var.f254208u = currentTimeMillis;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "onResume lastStartTime:%d,duration:%d,currentTime:%d", java.lang.Long.valueOf(o2Var.f254208u), java.lang.Long.valueOf(o2Var.f254209v), java.lang.Long.valueOf(currentTimeMillis));
                        }
                        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).getClass();
                        if (ip1.q.f375131c && (l1Var = ip1.q.f375130b) != null) {
                            l1Var.mo54038x57429eec();
                        }
                        if ((o2Var.f254203p == 0) && o2Var.f254198k == 1) {
                            ((ku5.t0) ku5.t0.f394148d).k(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.g2.f254149d, 1000L);
                        }
                    }
                    c18557xc00aa3f3.post(c18557xc00aa3f3.X2);
                    c18557xc00aa3f3.m1();
                }
                viewOnTouchListenerC18555xc58183f33.b();
            }
            if (viewOnTouchListenerC22366xcd5c2226.f288848g && (rVar2 = viewOnTouchListenerC22366xcd5c2226.f288851m) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar2).h() && (obj = viewOnTouchListenerC22366xcd5c2226.f288850i) != null && ((android.widget.RelativeLayout) obj).getBottom() < i65.a.b(viewOnTouchListenerC22366xcd5c2226.getContext(), 100)) {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    viewOnTouchListenerC22366xcd5c2226.z(1.0f, viewOnTouchListenerC22366xcd5c2226.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7), viewOnTouchListenerC22366xcd5c2226.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by));
                } else {
                    viewOnTouchListenerC22366xcd5c2226.z(1.0f, viewOnTouchListenerC22366xcd5c2226.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07), viewOnTouchListenerC22366xcd5c2226.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560132bx));
                }
            }
            if (viewOnTouchListenerC22366xcd5c2226.f288848g && (rVar = viewOnTouchListenerC22366xcd5c2226.f288851m) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(zVar3.h());
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f34 = zVar3.f254297f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "onResume isVisibleHeader: %b, bottom: %d, height: %d, scrollOffset:%d isCurrentMainUI: %b", valueOf, java.lang.Integer.valueOf(viewOnTouchListenerC18555xc58183f34.getBottom()), java.lang.Integer.valueOf(viewOnTouchListenerC18555xc58183f34.getHeight()), java.lang.Integer.valueOf(zVar3.f254302m), java.lang.Boolean.valueOf(zVar3.Y));
                zVar3.f254322z1 = false;
                if (zVar3.h() && viewOnTouchListenerC18555xc58183f34.getBottom() < viewOnTouchListenerC18555xc58183f34.getHeight()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "onResume fastCloseHeader");
                    zVar3.b(0L, 0, true);
                }
                if (!zVar3.N) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "onResume enableBottomTabSwitch true");
                    zVar3.d(true);
                } else if (!zVar3.Y) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "onResume not main ui and header open, then close header");
                    zVar3.b(0L, 0, true);
                }
            }
            ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
            ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
            viewOnTouchListenerC22366xcd5c2226.A(true);
        }
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        this.K = d17;
        if (d17 != null) {
            if (d17.getBoolean("conversation_box_tip", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "firstInit ConvBox navigation page");
                yf5.j0 j0Var = this.f288912v;
                if (j0Var != null && (i17 = ((yf5.w0) j0Var).f543518q.f543377a) > 0) {
                    int firstVisiblePosition = (this.f288905o.getFirstVisiblePosition() - this.f288905o.getHeaderViewsCount()) + 1;
                    if (firstVisiblePosition < 0) {
                        firstVisiblePosition = 0;
                    }
                    int abs = java.lang.Math.abs((firstVisiblePosition + 1) % i17);
                    while (true) {
                        if (abs != firstVisiblePosition) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.l4 item = ((yf5.w0) this.f288912v).getItem(abs);
                            if (item != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.N3(item.h1())) {
                                break;
                            } else {
                                abs = (abs + 1) % i17;
                            }
                        } else {
                            abs = 0;
                            break;
                        }
                    }
                    this.f288905o.post(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i7(this, this.f288905o.getHeaderViewsCount() + abs));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f288903J);
                    com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q6 q6Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q6(this);
                    this.f288903J = q6Var;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(q6Var, 1000L);
                    this.K.edit().putBoolean("conversation_box_tip", false).apply();
                }
            }
            if (this.f288912v != null) {
                this.K.edit().putInt("heavy_user_session_cnt", ((yf5.w0) this.f288912v).f543518q.f543377a).commit();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void p0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onTabStart");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void q0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "onTabStop");
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.v6(this));
            this.f288915y.d();
            mo78661x36654fab();
            this.f288916z.a();
            yf5.j0 j0Var = this.f288912v;
            if (j0Var != null) {
                yf5.w0 w0Var = (yf5.w0) j0Var;
                if (w0Var.f543524w) {
                    w0Var.f543524w = false;
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        if (viewOnTouchListenerC22366xcd5c2226 != null) {
            if (viewOnTouchListenerC22366xcd5c2226.f288848g && (sVar = viewOnTouchListenerC22366xcd5c2226.f288850i) != null && (c18557xc00aa3f3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3) sVar).f254031e) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onStop");
                c18557xc00aa3f3.A2 = true;
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            int hashCode = viewOnTouchListenerC22366xcd5c2226.hashCode();
            iy1.c cVar = iy1.c.MainUI;
            ((cy1.a) rVar).vj("MainUI_PullDown", hashCode, 1005, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "dkinit onTabSwitchIn");
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f288915y;
        android.app.ProgressDialog progressDialog = q5Var.f289541n;
        objArr[0] = java.lang.Integer.valueOf(progressDialog == null ? -1 : progressDialog.isShowing() ? 1 : 0);
        w11.k0 k0Var = q5Var.f289540m;
        objArr[1] = java.lang.Integer.valueOf(k0Var == null ? -2 : k0Var.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "onTabSwitchIn tip:%d initscene:%d", objArr);
        if (q5Var.f289538h != null) {
            q5Var.e();
        }
        com.p314xaae8f345.mm.ui.ga gaVar = this.f39345x2305be9;
        if (gaVar != null) {
            gaVar.l0();
        }
        if (this.f288912v != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.b1.f275292a = c01.id.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21335xebcf6f18.AbStractTabFragment
    public void r0() {
    }

    public void s0() {
        yf5.h0 h0Var;
        yf5.j0 j0Var = this.f288912v;
        if (j0Var != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            if (w0Var.f543524w) {
                return;
            }
            boolean z17 = true;
            w0Var.f543524w = true;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(6);
            java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
            if (w0Var.F == i17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w0Var.G, d17)) {
                z17 = false;
            }
            w0Var.F = i17;
            w0Var.G = d17;
            if (z17) {
                yf5.w d18 = w0Var.d();
                java.util.Iterator it = d18.f543505s.entrySet().iterator();
                while (it.hasNext()) {
                    yf5.x xVar = (yf5.x) ((java.util.Map.Entry) it.next()).getValue();
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 conv = xVar.f543528d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(conv, "conv");
                    xVar.f543531g = d18.f(conv);
                }
                yf5.m mVar = d18.f543496g;
                if (mVar != null) {
                    mVar.b();
                }
            }
            if (w0Var.C && (h0Var = w0Var.D) != null) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e7) h0Var).f289182a;
                ((yf5.w0) c22376x88ed722d.f288912v).d().f543505s.clear();
                c01.f b17 = c01.d9.b();
                yf5.j0 j0Var2 = c22376x88ed722d.f288912v;
                b17.getClass();
                j01.c cVar = f01.s1.INSTANCE.f339924d;
                android.os.Looper mainLooper = android.os.Looper.getMainLooper();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = cVar.f378507a;
                if (!concurrentHashMap.contains(j0Var2)) {
                    if (mainLooper != null) {
                        concurrentHashMap.put(j0Var2, new android.os.Handler(mainLooper));
                    } else {
                        concurrentHashMap.put(j0Var2, java.lang.Boolean.FALSE);
                    }
                }
                ((l75.a1) c01.d9.b().q()).a(c22376x88ed722d.f288912v);
                w0Var.C = false;
                yf5.m c17 = w0Var.c();
                if (c17 != null) {
                    c17.b();
                }
            }
            w0Var.d().l();
        }
    }

    public final void t0(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "setListMargin isInMultiWindowMode: %b", java.lang.Boolean.valueOf(this.H));
        android.view.ViewGroup.LayoutParams layoutParams = this.f288905o.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        }
        if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            int i19 = layoutParams2.topMargin;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "setListMargin origin: %d, topMargin: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
            if (i19 <= 0 || this.H) {
                if (this.H) {
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.topMargin = i17;
                }
                this.f288905o.setLayoutParams(layoutParams);
            }
        }
        android.view.View view = this.f288907q;
        if (view != null) {
            int i27 = view.getLayoutParams().height;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "setStatusBarMaskView height origin: %d, new: %d isInMultiWindowMode:%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.H));
            if (i27 <= 0 || this.H) {
                if (this.H) {
                    this.f288907q.getLayoutParams().height = 0;
                } else {
                    this.f288907q.getLayoutParams().height = i18;
                }
            }
        }
    }

    public void u0(boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar2;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        if (!(viewOnTouchListenerC22366xcd5c2226 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226)) {
            this.L = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j7(this, z17, z18, z19);
            return;
        }
        viewOnTouchListenerC22366xcd5c2226.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationListView", "[showAppBrandHeader] isShow:" + z17 + " isAnim:" + z18 + " isScrollFirst:" + z19);
        if (z17) {
            if (!viewOnTouchListenerC22366xcd5c2226.f288848g || (rVar2 = viewOnTouchListenerC22366xcd5c2226.f288851m) == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar2).l(true, 600L, 2000);
            return;
        }
        if (!viewOnTouchListenerC22366xcd5c2226.f288848g || (rVar = viewOnTouchListenerC22366xcd5c2226.f288851m) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar).a(0);
    }

    public void w0(long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22377x93874272 c22377x93874272 = this.G;
        if (c22377x93874272 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MainUI", "Unexpected. Call suspendRequestLayoutForAnimation() failed");
            return;
        }
        if (j17 > 800) {
            c22377x93874272.f288921h = j17;
        } else {
            c22377x93874272.f288921h = 800L;
        }
        synchronized (c22377x93874272) {
            c22377x93874272.f288918e = true;
            c22377x93874272.f288919f = java.lang.System.currentTimeMillis();
            c22377x93874272.f288917d.mo50300x3fa464aa(c22377x93874272.f288922i);
            c22377x93874272.f288917d.mo50297x7c4d7ca2(c22377x93874272.f288922i, c22377x93874272.f288921h);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUIView", "Pending further layout request for %sms.", java.lang.Long.valueOf(c22377x93874272.f288921h));
    }

    public final void x0() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226 = this.f288905o;
        if (viewOnTouchListenerC22366xcd5c2226 == null) {
            return;
        }
        boolean m80522x1495d881 = viewOnTouchListenerC22366xcd5c2226.m80522x1495d881();
        int i17 = com.p314xaae8f345.mm.ui.bl.i(mo7438x76847179(), -1);
        int a17 = o25.n1.a(this.f288905o.getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "initListViewPadding actionBarHeight: %d, statusBarHeight: %d, showHeadrContainer: %b", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(m80522x1495d881));
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h7 h7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h7(this, m80522x1495d881);
        if (i17 <= 0) {
            this.f288905o.post(h7Var);
            return;
        }
        t0(m80522x1495d881 ? 0 : a17, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUI", "[trySetListViewMargin] statusHeight: %s, actionBarHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
        this.f288905o.postDelayed(h7Var, 100L);
    }
}

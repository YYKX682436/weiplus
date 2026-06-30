package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer */
/* loaded from: classes8.dex */
public class ViewOnTouchListenerC18555xc58183f3 extends android.widget.RelativeLayout implements android.view.View.OnTouchListener, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s {
    public static final /* synthetic */ int P = 0;
    public android.view.View A;
    public boolean B;
    public boolean C;
    public android.widget.TextView D;
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f E;
    public boolean F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f254029J;
    public boolean K;
    public final boolean L;
    public java.lang.Runnable M;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d N;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z f254030d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254031e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d f254032f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 f254033g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f254034h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f254035i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f254036m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f254037n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f254038o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f254039p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f254040q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254041r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254042s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254043t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f254044u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f254045v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f254046w;

    /* renamed from: x, reason: collision with root package name */
    public int f254047x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18554x7dbdf23e f254048y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 f254049z;

    public ViewOnTouchListenerC18555xc58183f3(android.content.Context context) {
        super(context);
        this.f254034h = new android.graphics.Rect();
        this.f254047x = com.p314xaae8f345.mm.ui.bl.h(getContext());
        this.B = false;
        this.C = false;
        this.F = true;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.f254029J = 0;
        this.K = true;
        this.L = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j();
        this.M = null;
        this.N = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.1
            {
                this.f39173x3fe91575 = -1600912022;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a2 = c6200xc9d0535a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "updateMainActionBarView updateField: %d", java.lang.Integer.valueOf(c6200xc9d0535a2.f136454g.f87646a));
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.a(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.this, c6200xc9d0535a2);
                return false;
            }
        };
        c(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a) {
        viewOnTouchListenerC18555xc58183f3.getClass();
        am.a00 a00Var = c6200xc9d0535a.f136454g;
        int i17 = a00Var.f87646a;
        if (i17 == 1) {
            viewOnTouchListenerC18555xc58183f3.m71588x5272cb5d(a00Var.f87647b);
            return;
        }
        if (i17 == 2) {
            android.view.View view = viewOnTouchListenerC18555xc58183f3.f254045v;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = viewOnTouchListenerC18555xc58183f3.f254046w;
            if (view2 != null) {
                int i18 = c6200xc9d0535a.f136454g.f87648c ? 0 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarIconTips", "(Lcom/tencent/mm/autogen/events/UpdateMainActionBarViewEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: setActionBarTitle */
    private void m71588x5272cb5d(java.lang.String str) {
        if (gm0.j1.a() && this.f254040q != null) {
            this.f254040q.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(getContext(), str, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k)));
            float f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b) * i65.a.m(getContext());
            if (this.f254040q.getTextSize() != f17) {
                this.f254040q.setTextSize(0, f17);
            }
            com.p314xaae8f345.mm.ui.bk.r0(this.f254040q.getPaint(), 0.8f);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).pj(this.f254040q, en1.a.a(), bi4.c.PLANET, bi4.d.OUTLINED);
        }
    }

    public final void b() {
        if (gm0.j1.a()) {
            boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
            boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20685x2f3c5f64()) == 1;
            if (mo168058x74219ae7 || z17) {
                android.view.View view = this.A;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "checkShowSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "checkShowSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = this.A;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "checkShowSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "checkShowSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z17 != this.C) {
                this.C = z17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254031e;
                if (c18557xc00aa3f3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "forceReloadData");
                    java.lang.Runnable runnable = c18557xc00aa3f3.Y2;
                    c18557xc00aa3f3.removeCallbacks(runnable);
                    c18557xc00aa3f3.post(runnable);
                }
            }
            this.A.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.P;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.this;
                    viewOnTouchListenerC18555xc58183f3.getClass();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(view3);
                    java.lang.Object[] array = arrayList3.toArray();
                    arrayList3.clear();
                    yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", viewOnTouchListenerC18555xc58183f3, array);
                    if (viewOnTouchListenerC18555xc58183f3.f254031e != null) {
                        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_weapp_mainframe_search_style, 0) == 1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "isSupportSearchStyle:%b", java.lang.Boolean.valueOf(z18));
                        if (!z18) {
                            viewOnTouchListenerC18555xc58183f3.f254031e.s1();
                        } else if (!viewOnTouchListenerC18555xc58183f3.B) {
                            viewOnTouchListenerC18555xc58183f3.B = true;
                            android.view.View view4 = viewOnTouchListenerC18555xc58183f3.A;
                            float x17 = view4.getX();
                            float y17 = view4.getY();
                            float scaleX = view4.getScaleX();
                            float scaleY = view4.getScaleY();
                            float translationX = view4.getTranslationX();
                            float translationY = view4.getTranslationY();
                            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view4.getLayoutParams();
                            int width = ((android.widget.RelativeLayout) view4.getParent()).getWidth() - (layoutParams.rightMargin * 2);
                            int i18 = layoutParams.width;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view4, "scaleY", 1.0f, 1.35f);
                            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(view4.getWidth(), width);
                            arrayList4.add(ofFloat);
                            arrayList4.add(ofInt);
                            ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.q0(viewOnTouchListenerC18555xc58183f3, width, view4));
                            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                            animatorSet.playTogether(arrayList4);
                            animatorSet.setDuration(300L);
                            animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s0(viewOnTouchListenerC18555xc58183f3, view4, scaleX, scaleY, x17, y17, translationX, translationY, i18));
                            animatorSet.start();
                            arrayList4.clear();
                            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                            arrayList4.add(android.animation.ObjectAnimator.ofFloat(viewOnTouchListenerC18555xc58183f3.D, "alpha", 1.0f, 0.0f));
                            animatorSet2.playTogether(arrayList4);
                            animatorSet2.setDuration(300L);
                            animatorSet2.start();
                        }
                    }
                    yj0.a.h(viewOnTouchListenerC18555xc58183f3, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
    }

    public final void c(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "HeaderContainer init");
        setImportantForAccessibility(2);
        this.f254029J = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.m_);
        int i17 = getResources().getConfiguration().orientation;
        setBackground(null);
        jh4.c.f381379a.a();
        android.view.View a17 = com.p314xaae8f345.mm.ui.td.f291426c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(context), com.p314xaae8f345.mm.R.C30864xbddafb2a.cxv, null, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) a17.findViewById(com.p314xaae8f345.mm.R.id.f564636wn);
        this.f254035i = linearLayout;
        ((android.widget.FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = this.f254047x;
        this.f254036m = (android.view.ViewGroup) a17.findViewById(com.p314xaae8f345.mm.R.id.a0i);
        this.A = a17.findViewById(com.p314xaae8f345.mm.R.id.f568293md5);
        this.D = (android.widget.TextView) a17.findViewById(com.p314xaae8f345.mm.R.id.f564638wp);
        b();
        this.f254049z = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730) a17.findViewById(com.p314xaae8f345.mm.R.id.cvn);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) a17.findViewById(com.p314xaae8f345.mm.R.id.f564633wk);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxw, (android.view.ViewGroup) null);
        this.f254038o = inflate;
        this.f254039p = inflate.findViewById(com.p314xaae8f345.mm.R.id.cg7);
        frameLayout.addView(this.f254038o, -1, -1);
        android.widget.TextView textView = (android.widget.TextView) this.f254038o.findViewById(android.R.id.text1);
        this.f254040q = textView;
        textView.setVisibility(0);
        this.f254041r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f254038o.findViewById(com.p314xaae8f345.mm.R.id.meb);
        this.f254042s = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f254038o.findViewById(com.p314xaae8f345.mm.R.id.f78305xa7d1d7fe);
        this.f254044u = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f254038o.findViewById(com.p314xaae8f345.mm.R.id.h0y);
        this.f254045v = this.f254038o.findViewById(com.p314xaae8f345.mm.R.id.med);
        this.f254046w = this.f254038o.findViewById(com.p314xaae8f345.mm.R.id.ky_);
        this.f254048y = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18554x7dbdf23e) this.f254038o.findViewById(com.p314xaae8f345.mm.R.id.f564631wi);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f254038o.findViewById(com.p314xaae8f345.mm.R.id.f78239x65c2f76a);
        this.f254043t = c22699x3dcdb352;
        c22699x3dcdb352.setImageResource(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? com.p314xaae8f345.mm.R.raw.f79989x906fa3af : com.p314xaae8f345.mm.R.raw.f80201x151107e6);
        this.f254041r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.n0(this));
        this.f254042s.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o0(this));
        d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a17.findViewById(com.p314xaae8f345.mm.R.id.f564639wq);
        this.f254031e = c18557xc00aa3f3;
        c18557xc00aa3f3.m71611xffc883b2(this);
        this.f254031e.setId(com.p314xaae8f345.mm.R.id.f564639wq);
        addView(a17, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    public final void d() {
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "initViewScale measuredWidth: %d", java.lang.Integer.valueOf(getMeasuredWidth()));
        if (this.K && (linearLayout = this.f254035i) != null) {
            linearLayout.setScaleX(0.6f);
            this.f254035i.setScaleY(0.6f);
        }
    }

    public void e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254031e;
        if (c18557xc00aa3f3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "notifyMultiWindowModeChanged: %b, old: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(c18557xc00aa3f3.M2));
            if (c18557xc00aa3f3.M2 != z17) {
                c18557xc00aa3f3.M2 = z17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d.m67175x90bef41b(z17);
    }

    public void g(boolean z17) {
        long j17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        java.lang.String str;
        r45.nw1 m76794xd0557130;
        java.util.List list;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var;
        java.util.List list2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254031e;
        c18557xc00aa3f3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onStartPull isStart:%b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            c18557xc00aa3f3.f254074u2 = false;
            return;
        }
        c18557xc00aa3f3.f254074u2 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.o2 o2Var = c18557xc00aa3f3.f254056c2;
        o2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "onStartToPull");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.h2(o2Var));
        synchronized (o2Var) {
            lh4.n a17 = o2Var.a(4);
            if (a17 == null || (list2 = a17.f400256c) == null) {
                j17 = currentTimeMillis;
                z18 = false;
            } else {
                int size = list2.size();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_taskbar_recent_timeout, 3600L) * 1000;
                java.util.Iterator it = list2.iterator();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) it.next();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("item[");
                    sb6.append(c16601x7ed0e40c2.v0().m75945x2fec8307(1));
                    sb6.append(", ");
                    sb6.append(c16601x7ed0e40c2.f66791xc8a07680);
                    sb6.append("] time:");
                    long j18 = currentTimeMillis;
                    sb6.append(c16601x7ed0e40c2.f66794xa783a79b);
                    sb6.append(" now:");
                    sb6.append(currentTimeMillis2);
                    sb6.append(" limit:");
                    sb6.append(Ui);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", sb6.toString());
                    if (currentTimeMillis2 - c16601x7ed0e40c2.f66794xa783a79b > Ui) {
                        linkedList.add(c16601x7ed0e40c2);
                        it.remove();
                    }
                    currentTimeMillis = j18;
                }
                j17 = currentTimeMillis;
                ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.l2(linkedList, o2Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "remove Timeout Data done " + size + ' ' + list2.size());
                z18 = size != list2.size();
            }
        }
        if (z18 && (a2Var = o2Var.f254188a) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f32 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var;
            int indexOf = c18557xc00aa3f32.f254058e2.indexOf(4);
            if (indexOf != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "do reloadOtherData");
                long j19 = c18557xc00aa3f32.E0() ? 200L : 0L;
                if (c18557xc00aa3f32.f254056c2.a(4).f400256c.isEmpty()) {
                    c18557xc00aa3f32.w1();
                    c18557xc00aa3f32.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.t1(c18557xc00aa3f32, indexOf), j19);
                } else {
                    c18557xc00aa3f32.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.u1(c18557xc00aa3f32, indexOf), j19);
                }
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        lh4.n a18 = o2Var.a(4);
        if (a18 == null || (list = a18.f400256c) == null) {
            c16601x7ed0e40c = null;
        } else {
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj = it6.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) obj).f66793x2262335f == 21) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) obj;
        }
        if (c16601x7ed0e40c != null) {
            r45.b22 b22Var = new r45.b22();
            try {
                b22Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
                if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7)) != null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                    hashMap.put(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()), c16601x7ed0e40c);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
                    if (((c19792x256d27252 == null || (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) == null) ? 2 : m76794xd0557130.m75939xb282bd08(2)) != 2) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27253);
                        hashMap2.put(java.lang.Long.valueOf(c19792x256d27253.m76784x5db1b11()), b22Var);
                    }
                }
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TaskBarViewPresenter", "FinderLiveMultiTaskData parse failed");
            }
        }
        if (!hashMap2.isEmpty()) {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() / 1000;
            if (currentTimeMillis3 - o2Var.f254204q <= o2Var.f254205r) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "not check because of interval: " + o2Var.f254205r + " last:" + o2Var.f254204q);
            } else {
                o2Var.f254204q = currentTimeMillis3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "start check live status");
                i95.m c17 = i95.n0.c(s40.w0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.util.Collection values = hashMap2.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                java.util.Collection<r45.b22> collection = values;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
                for (r45.b22 b22Var2 : collection) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var2.m75936x14adae67(7);
                    java.lang.Long valueOf = java.lang.Long.valueOf(c19792x256d27254 != null ? c19792x256d27254.m76784x5db1b11() : 0L);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27255 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var2.m75936x14adae67(7);
                    if (c19792x256d27255 == null || (str = c19792x256d27255.m76803x6c285d75()) == null) {
                        str = "";
                    }
                    arrayList.add(new android.util.Pair(valueOf, str));
                }
                java.util.List V0 = kz5.n0.V0(arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.e2(o2Var, hashMap2, hashMap);
                java.lang.Object obj2 = o2Var.f254188a;
                android.content.Context context = obj2 instanceof android.content.Context ? (android.content.Context) obj2 : null;
                r45.qt2 wi6 = context != null ? ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(context) : null;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
                if (arrayList2.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLiveFeatureService", "batchGetLiveInfo: finderObject list is null!");
                } else {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(V0, 10));
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        android.util.Pair pair = (android.util.Pair) it7.next();
                        arrayList3.add(new jz5.l(pair.first, pair.second));
                    }
                    db2.u uVar = new db2.u(arrayList3, 1, 0, null, null, wi6, 28, null);
                    uVar.f97670p = false;
                    pm0.v.T(uVar.l(), new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.y1(e2Var));
                }
            }
        }
        if (!o2Var.f254206s) {
            ((ku5.t0) ku5.t0.f394148d).A("TaskBarReloadData");
            o2Var.b(true, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.a2 a2Var2 = o2Var.f254188a;
            if (a2Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f33 = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) a2Var2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "forceReloadData");
                java.lang.Runnable runnable = c18557xc00aa3f33.Y2;
                c18557xc00aa3f33.removeCallbacks(runnable);
                c18557xc00aa3f33.post(runnable);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarViewPresenter", "onStartToPull done " + (java.lang.System.currentTimeMillis() - j17));
    }

    /* renamed from: getAnimationScrollOffset */
    public int m71589x493c45ae() {
        return this.f254030d.Q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s
    /* renamed from: getBackUpFooterRect */
    public android.graphics.Rect mo71590x94e28117() {
        return this.f254034h;
    }

    /* renamed from: getBackgroundGLSurfaceContainer */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d m71591x13a1e17d() {
        return this.f254032f;
    }

    /* renamed from: getBackgroundGLSurfaceView */
    public android.view.View m71592x8f147829() {
        return this.f254032f.getDynamicBgSurfaceView();
    }

    /* renamed from: getBackgroundGradientView */
    public android.view.View m71593x7a375939() {
        return this.f254033g;
    }

    /* renamed from: getDesktopContainerView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12765x7ca3e730 m71594xf3e53c80() {
        return this.f254049z;
    }

    /* renamed from: getExtraBottomHeight */
    public int m71595xaf562ac() {
        return this.I;
    }

    /* renamed from: getRootLayout */
    public android.widget.LinearLayout m71596x8ad66ea2() {
        return this.f254035i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s
    /* renamed from: getTaskBarView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.t mo71597x367742dd() {
        return this.f254031e;
    }

    /* renamed from: getViewHeight */
    public int m71598x6ba62022() {
        return this.H;
    }

    public void h() {
        android.view.WindowInsets rootWindowInsets;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.E;
        if (activityC21401x6ce6f73f == null) {
            return;
        }
        android.util.Pair pair = new android.util.Pair(0, 0);
        if (activityC21401x6ce6f73f != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            try {
                int rotation = activityC21401x6ce6f73f.getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != 0 && rotation != 2) {
                    if (android.os.Build.VERSION.SDK_INT < 28 || (rootWindowInsets = activityC21401x6ce6f73f.getWindow().getDecorView().getRootWindowInsets()) == null || rootWindowInsets.getDisplayCutout() == null) {
                        int p17 = com.p314xaae8f345.mm.ui.bk.p(activityC21401x6ce6f73f);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarUIUtils", "getLeftRightSafeInsets from statusbar %d %d", java.lang.Integer.valueOf(p17), java.lang.Integer.valueOf(rotation));
                        pair = rotation == 1 ? new android.util.Pair(java.lang.Integer.valueOf(p17), 0) : new android.util.Pair(0, java.lang.Integer.valueOf(p17));
                    } else {
                        android.view.DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarUIUtils", "getLeftRightSafeInsets from insets %d %d", java.lang.Integer.valueOf(displayCutout.getSafeInsetLeft()), java.lang.Integer.valueOf(displayCutout.getSafeInsetRight()));
                        pair = new android.util.Pair(java.lang.Integer.valueOf(displayCutout.getSafeInsetLeft()), java.lang.Integer.valueOf(displayCutout.getSafeInsetRight()));
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TaskBarUIUtils", "getSafeInsetsFailed", e17);
            }
        }
        ((android.widget.FrameLayout.LayoutParams) this.f254039p.getLayoutParams()).setMargins(((java.lang.Integer) pair.first).intValue(), 0, ((java.lang.Integer) pair.second).intValue(), 0);
        this.f254038o.requestLayout();
        android.view.View view = this.f254038o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarSafeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateActionBarSafeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i() {
        android.view.View view;
        if (this.f254040q == null || (view = this.f254037n) == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "updateFakeActionBarLeftMargin location x: %d, y: %d", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
        if (this.E.isInMultiWindowMode()) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f254040q.getLayoutParams();
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561106p);
            layoutParams.leftMargin = dimensionPixelSize;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "updateFakeActionBarLeftMargin leftMargin: %d", java.lang.Integer.valueOf(dimensionPixelSize));
            if (this.f254040q.getParent() != null) {
                this.f254040q.getParent().requestLayout();
            }
            android.view.View view2 = this.f254038o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateFakeActionBarLeftMargin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "updateFakeActionBarLeftMargin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "desktopContainer onAttachedToWindow");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.N;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5611xeee5db20 c5611xeee5db20 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5611xeee5db20();
        c5611xeee5db20.e();
        am.fg fgVar = c5611xeee5db20.f135937g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "updateUnReadCount unReadCount: %d", java.lang.Integer.valueOf(fgVar.f88207a));
        java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp);
        if (fgVar.f88207a > 0) {
            if (!this.L) {
                string = string + " ";
            }
            string = string + "(" + fgVar.f88207a + ")";
        }
        m71588x5272cb5d(string);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "desktopContainer onDetachedFromWindow");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.N;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int makeMeasureSpec;
        int i19 = getResources().getConfiguration().orientation;
        int i27 = getResources().getConfiguration().orientation;
        if (this.F) {
            int measuredHeight = ((((android.view.ViewGroup) getParent()).getMeasuredHeight() - 0) - this.I) - this.f254029J;
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            this.H = measuredHeight;
        } else {
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        super.onMeasure(i17, makeMeasureSpec);
        if (getMeasuredWidth() != this.G) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "onMeasure width new: %d, old: %d", java.lang.Integer.valueOf(getMeasuredWidth()), java.lang.Integer.valueOf(this.G));
            this.G = getMeasuredWidth();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "initViewPivot getMeasuredWidth: %d", java.lang.Integer.valueOf(getMeasuredWidth()));
            this.f254035i.setPivotX(getMeasuredWidth() / 2.0f);
            this.f254035i.setPivotY(com.p314xaae8f345.mm.ui.bl.a(getContext()));
            d();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f254030d != null && (motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f254030d.onTouch(view, motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s
    /* renamed from: setActionBar */
    public void mo71599x679283bb(android.view.View view) {
        this.f254037n = view;
        i();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s
    /* renamed from: setActivity */
    public void mo71600x13de9191(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f) {
        this.E = activityC21401x6ce6f73f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s
    /* renamed from: setAnimController */
    public void mo71601xf1f1958f(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z) rVar;
        this.f254030d = zVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254031e;
        if (c18557xc00aa3f3 == null || zVar == null) {
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) zVar.f254303n;
        if (linkedList.contains(c18557xc00aa3f3)) {
            return;
        }
        linkedList.add(c18557xc00aa3f3);
    }

    /* renamed from: setDynamicBackgroundView */
    public void m71602xd3d893d0(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d c16607x5430141d = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d) view;
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 c10436x212919c6 = this.f254033g;
        this.f254032f = c16607x5430141d;
        this.f254033g = c10436x212919c6;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254030d;
        if (zVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarAnimController", "setBackgroundView");
            zVar.f254305p = c16607x5430141d;
            zVar.f254311t = c10436x212919c6;
            c16607x5430141d.mo67181xa37004dc(c10436x212919c6);
        }
    }

    /* renamed from: setExtraBottomHeight */
    public void m71603xe68b6f20(int i17) {
        this.I = i17;
    }

    /* renamed from: setFixedHeight */
    public void m71604x9bf1b7f9(boolean z17) {
        this.F = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.s
    /* renamed from: setFoldBanner */
    public void mo71605xae6cb88f(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254030d;
        if (zVar != null) {
            zVar.f254312u = view;
        }
    }

    public ViewOnTouchListenerC18555xc58183f3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f254034h = new android.graphics.Rect();
        this.f254047x = com.p314xaae8f345.mm.ui.bl.h(getContext());
        this.B = false;
        this.C = false;
        this.F = true;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.f254029J = 0;
        this.K = true;
        this.L = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j();
        this.M = null;
        this.N = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.1
            {
                this.f39173x3fe91575 = -1600912022;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a2 = c6200xc9d0535a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "updateMainActionBarView updateField: %d", java.lang.Integer.valueOf(c6200xc9d0535a2.f136454g.f87646a));
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.a(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.this, c6200xc9d0535a2);
                return false;
            }
        };
        c(context);
    }

    public ViewOnTouchListenerC18555xc58183f3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f254034h = new android.graphics.Rect();
        this.f254047x = com.p314xaae8f345.mm.ui.bl.h(getContext());
        this.B = false;
        this.C = false;
        this.F = true;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.f254029J = 0;
        this.K = true;
        this.L = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j();
        this.M = null;
        this.N = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarContainer.1
            {
                this.f39173x3fe91575 = -1600912022;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a2 = c6200xc9d0535a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopContainer", "updateMainActionBarView updateField: %d", java.lang.Integer.valueOf(c6200xc9d0535a2.f136454g.f87646a));
                com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.a(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3.this, c6200xc9d0535a2);
                return false;
            }
        };
        c(context);
    }
}

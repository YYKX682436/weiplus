package te2;

/* loaded from: classes10.dex */
public final class fa implements te2.lc, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499541d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499542e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f499543f;

    /* renamed from: g, reason: collision with root package name */
    public final te2.kc f499544g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f499545h;

    /* renamed from: i, reason: collision with root package name */
    public final int f499546i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f499547m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f499548n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f499549o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f499550p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f499551q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.FrameLayout f499552r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ProgressBar f499553s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f499554t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f499555u;

    public fa(android.view.View root, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, gk2.e liveData, te2.kc kcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f499541d = root;
        this.f499542e = activity;
        this.f499543f = liveData;
        this.f499544g = kcVar;
        this.f499545h = "FinderLiveVisitorMusicSingSongViewCallback";
        this.f499546i = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * (ae2.in.f85221a.h0() / 100.0f));
    }

    @Override // te2.lc
    public void b() {
        android.view.ViewGroup.LayoutParams layoutParams;
        java.lang.String str = this.f499545h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initView");
        android.view.View view = this.f499541d;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.fq_);
        this.f499547m = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f499548n = view.findViewById(com.p314xaae8f345.mm.R.id.my7);
        this.f499549o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) view.findViewById(com.p314xaae8f345.mm.R.id.fpu);
        this.f499553s = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.mxy);
        this.f499551q = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.fqa);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499549o;
        if (c22613xe7040d9c != null) {
            c22613xe7040d9c.setOnClickListener(this);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c2 = this.f499549o;
        int i17 = this.f499546i;
        if (c22613xe7040d9c2 != null) {
            c22613xe7040d9c2.m81307xf9cef5a7(new te2.z9(this));
            if (view.getContext().getResources().getConfiguration().orientation == 2) {
                c22613xe7040d9c2.setTranslationX(com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y);
            } else {
                c22613xe7040d9c2.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y);
            }
            c22613xe7040d9c2.getLayoutParams().height = i17;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.my6);
        this.f499550p = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View view2 = this.f499550p;
        if (view2 != null) {
            view2.setContentDescription(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkw));
        }
        this.f499552r = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.my8);
        this.f499555u = view.findViewById(com.p314xaae8f345.mm.R.id.my9);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view.findViewById(com.p314xaae8f345.mm.R.id.my_);
        this.f499554t = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(view.getContext()));
            c22849x81a93d25.P(new te2.aa());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f499554t;
        if (c22849x81a93d252 != null) {
            int c17 = com.p314xaae8f345.mm.ui.bl.c(view.getContext());
            android.view.View view3 = this.f499548n;
            int i18 = (view3 == null || (layoutParams = view3.getLayoutParams()) == null) ? 0 : layoutParams.height;
            if (i18 <= 0) {
                i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            }
            int i19 = (i17 - c17) - i18;
            c22849x81a93d252.getLayoutParams().height = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "adjustRvHeight height:" + i19);
        }
        if (view.getContext().getResources().getConfiguration().orientation != 2) {
            view.post(new te2.ba(this));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c3 = this.f499549o;
            if (c22613xe7040d9c3 != null) {
                c22613xe7040d9c3.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + com.p314xaae8f345.mm.ui.bl.c(view.getContext()));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c4 = this.f499549o;
        android.view.ViewGroup.LayoutParams layoutParams2 = c22613xe7040d9c4 != null ? c22613xe7040d9c4.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c5 = this.f499549o;
        android.view.ViewGroup.LayoutParams layoutParams3 = c22613xe7040d9c5 != null ? c22613xe7040d9c5.getLayoutParams() : null;
        if (layoutParams3 == null) {
            return;
        }
        layoutParams3.height = com.p314xaae8f345.mm.ui.bl.b(view.getContext()).x;
    }

    @Override // te2.lc
    public void c(boolean z17) {
        android.view.View view = this.f499548n;
        boolean z18 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f499552r;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.TextView textView = this.f499551q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view2 = this.f499555u;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f499554t;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f499553s;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499549o;
            if (c22613xe7040d9c != null && !c22613xe7040d9c.isShowing) {
                z18 = true;
            }
            if (!z18 || c22613xe7040d9c == null) {
                return;
            }
            c22613xe7040d9c.post(new te2.da(this));
        }
    }

    @Override // te2.lc
    public void d(boolean z17) {
        android.view.View view = this.f499548n;
        boolean z18 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f499551q;
        if (textView != null) {
            textView.setText(this.f499541d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575316p21));
        }
        android.widget.TextView textView2 = this.f499551q;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f499552r;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f499554t;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(0);
        }
        android.view.View view2 = this.f499555u;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = this.f499553s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499549o;
            if (c22613xe7040d9c != null && !c22613xe7040d9c.isShowing) {
                z18 = true;
            }
            if (!z18 || c22613xe7040d9c == null) {
                return;
            }
            c22613xe7040d9c.post(new te2.ca(this));
        }
    }

    @Override // te2.lc
    public void e() {
        int size = ((java.util.ArrayList) ((mm2.m6) this.f499543f.a(mm2.m6.class)).f410774f.b()).size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499545h, "showMusicView size:" + size);
        android.view.View view = this.f499548n;
        boolean z17 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f499552r;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.view.View view2 = this.f499555u;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f499554t;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f499553s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.widget.TextView textView = this.f499551q;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = this.f499551q;
        if (textView2 != null) {
            android.view.View view3 = this.f499541d;
            textView2.setText(size > 0 ? view3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p2f, java.lang.String.valueOf(size)) : view3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575316p21));
        }
        android.widget.TextView textView3 = this.f499551q;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499549o;
        if (c22613xe7040d9c != null && !c22613xe7040d9c.isShowing) {
            z17 = true;
        }
        if (!z17 || c22613xe7040d9c == null) {
            return;
        }
        c22613xe7040d9c.post(new te2.ea(this));
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499542e;
    }

    @Override // te2.lc
    public void k() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499549o;
        if (c22613xe7040d9c != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.fq_) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c2 = this.f499549o;
            if (c22613xe7040d9c2 != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c2, null, 1, null);
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.my6 && (c22613xe7040d9c = this.f499549o) != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

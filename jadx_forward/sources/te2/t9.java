package te2;

/* loaded from: classes10.dex */
public final class t9 implements te2.lc, android.view.View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final int f499975t = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * (ae2.in.f85221a.h0() / 100.0f));

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499976d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499977e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f499978f;

    /* renamed from: g, reason: collision with root package name */
    public final te2.kc f499979g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f499980h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f499981i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f499982m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f499983n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f499984o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f499985p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ProgressBar f499986q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f499987r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f499988s;

    public t9(android.view.View root, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, gk2.e liveData, te2.kc kcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f499976d = root;
        this.f499977e = activity;
        this.f499978f = liveData;
        this.f499979g = kcVar;
    }

    @Override // te2.lc
    public void b() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view = this.f499976d;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.fq_);
        this.f499980h = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.f499981i = view.findViewById(com.p314xaae8f345.mm.R.id.f568478v61);
        this.f499982m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) view.findViewById(com.p314xaae8f345.mm.R.id.fpu);
        this.f499986q = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.v5w);
        this.f499984o = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tqt);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499982m;
        if (c22613xe7040d9c != null) {
            c22613xe7040d9c.setOnClickListener(this);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c2 = this.f499982m;
        int i17 = f499975t;
        int i18 = 0;
        if (c22613xe7040d9c2 != null) {
            c22613xe7040d9c2.m81307xf9cef5a7(new te2.n9(this));
            if (view.getContext().getResources().getConfiguration().orientation == 2) {
                c22613xe7040d9c2.m81310xa060b0f0(true);
                c22613xe7040d9c2.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y);
            } else {
                c22613xe7040d9c2.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y);
            }
            c22613xe7040d9c2.m81308x2c770903(false);
            c22613xe7040d9c2.getLayoutParams().height = i17;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f568477v60);
        this.f499983n = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View view2 = this.f499983n;
        if (view2 != null) {
            view2.setContentDescription(view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkw));
        }
        this.f499985p = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f568479v62);
        this.f499988s = view.findViewById(com.p314xaae8f345.mm.R.id.f568480v63);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view.findViewById(com.p314xaae8f345.mm.R.id.f568481v64);
        this.f499987r = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(view.getContext()));
            c22849x81a93d25.P(new te2.o9());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f499987r;
        if (c22849x81a93d252 != null) {
            int c17 = com.p314xaae8f345.mm.ui.bl.c(view.getContext());
            android.view.View view3 = this.f499981i;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                i18 = layoutParams.height;
            }
            if (i18 <= 0) {
                i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            }
            int i19 = (i17 - c17) - i18;
            c22849x81a93d252.getLayoutParams().height = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveVisitorMusicSingSongNewPanelViewCallback", "adjustRvHeight height:" + i19);
        }
        if (view.getContext().getResources().getConfiguration().orientation != 2) {
            view.post(new te2.p9(this));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c3 = this.f499982m;
            if (c22613xe7040d9c3 != null) {
                c22613xe7040d9c3.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + com.p314xaae8f345.mm.ui.bl.c(view.getContext()));
                return;
            }
            return;
        }
        int min = java.lang.Math.min(com.p314xaae8f345.mm.ui.bl.b(view.getContext()).x, com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c4 = this.f499982m;
        android.view.ViewGroup.LayoutParams layoutParams2 = c22613xe7040d9c4 != null ? c22613xe7040d9c4.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = min;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c5 = this.f499982m;
        android.view.ViewGroup.LayoutParams layoutParams3 = c22613xe7040d9c5 != null ? c22613xe7040d9c5.getLayoutParams() : null;
        if (layoutParams3 == null) {
            return;
        }
        layoutParams3.height = min - com.p314xaae8f345.mm.ui.bl.h(view.getContext());
    }

    @Override // te2.lc
    public void c(boolean z17) {
        android.view.View view = this.f499981i;
        boolean z18 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f499985p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.TextView textView = this.f499984o;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view2 = this.f499988s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f499987r;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f499986q;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499982m;
            if (c22613xe7040d9c != null && !c22613xe7040d9c.isShowing) {
                z18 = true;
            }
            if (!z18 || c22613xe7040d9c == null) {
                return;
            }
            c22613xe7040d9c.post(new te2.r9(this));
        }
    }

    @Override // te2.lc
    public void d(boolean z17) {
        android.view.View view = this.f499981i;
        boolean z18 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f499984o;
        if (textView != null) {
            textView.setText(this.f499976d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eiv));
        }
        android.widget.TextView textView2 = this.f499984o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout = this.f499985p;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f499987r;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(0);
        }
        android.view.View view2 = this.f499988s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = this.f499986q;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499982m;
            if (c22613xe7040d9c != null && !c22613xe7040d9c.isShowing) {
                z18 = true;
            }
            if (!z18 || c22613xe7040d9c == null) {
                return;
            }
            c22613xe7040d9c.post(new te2.q9(this));
        }
    }

    @Override // te2.lc
    public void e() {
        int size = ((mm2.m6) this.f499978f.a(mm2.m6.class)).f410782q.f315618a.size();
        android.view.View view = this.f499981i;
        boolean z17 = false;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f499985p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.view.View view2 = this.f499988s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f499987r;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f499986q;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.widget.TextView textView = this.f499984o;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = this.f499984o;
        if (textView2 != null) {
            android.view.View view3 = this.f499976d;
            textView2.setText(size > 0 ? view3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eiu, java.lang.String.valueOf(size)) : view3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eiv));
        }
        android.widget.TextView textView3 = this.f499984o;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499982m;
        if (c22613xe7040d9c != null && !c22613xe7040d9c.isShowing) {
            z17 = true;
        }
        if (!z17 || c22613xe7040d9c == null) {
            return;
        }
        c22613xe7040d9c.post(new te2.s9(this));
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499977e;
    }

    @Override // te2.lc
    public void k() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f499982m;
        if (c22613xe7040d9c != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = true;
        if ((valueOf == null || valueOf.intValue() != com.p314xaae8f345.mm.R.id.fq_) && (valueOf == null || valueOf.intValue() != com.p314xaae8f345.mm.R.id.f568477v60)) {
            z17 = false;
        }
        if (z17) {
            k();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongNewPanelViewCallback", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

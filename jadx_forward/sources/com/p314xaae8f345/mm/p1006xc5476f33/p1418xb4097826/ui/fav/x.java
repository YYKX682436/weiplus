package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f210750a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00 f210751b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a f210752c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f210753d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f210754e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f210755f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f210756g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f210757h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f210758i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f210759j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f210760k;

    /* renamed from: l, reason: collision with root package name */
    public final yz5.r f210761l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 f210762m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15108xb0956cb5 f210763n;

    public x(android.app.Activity context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00 fragment, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a presenter, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f210750a = context;
        this.f210751b = fragment;
        this.f210752c = presenter;
        this.f210753d = view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.w(this);
        this.f210761l = wVar;
        this.f210762m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.q(wVar);
    }

    public final android.view.View a(int i17) {
        android.view.View view = this.f210753d;
        android.view.View findViewById = view != null ? view.findViewById(i17) : null;
        if (findViewById != null) {
            return findViewById;
        }
        android.view.View findViewById2 = this.f210750a.findViewById(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        return findViewById2;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 b() {
        return this.f210762m;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15108xb0956cb5 c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15108xb0956cb5(context, null);
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 d() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f210756g;
        if (c22849x81a93d25 != null) {
            return c22849x81a93d25;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = this.f210754e;
        if (c15343x638a173f != null) {
            return c15343x638a173f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final void f() {
        android.widget.FrameLayout frameLayout = this.f210757h;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(8);
        android.view.View view = this.f210760k;
        if (view != null) {
            view.setOnClickListener(null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
    }

    public final void g() {
        fc2.o Z6;
        this.f210757h = (android.widget.FrameLayout) a(com.p314xaae8f345.mm.R.id.f565762dg3);
        this.f210758i = a(com.p314xaae8f345.mm.R.id.lbi);
        this.f210759j = a(com.p314xaae8f345.mm.R.id.dft);
        this.f210760k = a(com.p314xaae8f345.mm.R.id.m2g);
        this.f210754e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) a(com.p314xaae8f345.mm.R.id.m6e);
        android.app.Activity activity = this.f210750a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15108xb0956cb5 c17 = c(activity);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a aVar = this.f210752c;
        c17.m60922xe131cdea(aVar.c());
        c17.removeAllViews();
        android.view.View.inflate(c17.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bsa, c17);
        this.f210763n = c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f e17 = e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15108xb0956cb5 c15108xb0956cb5 = this.f210763n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15108xb0956cb5);
        e17.D(c15108xb0956cb5);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = e().m62367x4905e9fa();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m62367x4905e9fa, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        this.f210756g = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) m62367x4905e9fa;
        d().mo7967x900dcbe1(b().d(activity));
        d().m7964x8d4ad49c(null);
        this.f210755f = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(b().a(), aVar.c(), false, 4, null);
        d().N(b().c());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 d17 = d();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f210755f;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        d17.mo7960x6cab2c8d(c22848x6ddd90cf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00 fragment = this.f210751b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null && (Z6 = nyVar.Z6(-1)) != null) {
            Z6.d(d());
        }
        in5.o.b(d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.r(this), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.s.f210736d);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f210755f;
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf2.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.t(this);
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf2.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.u(this);
        e().m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.v(this));
    }

    public boolean h(r45.qt2 qt2Var, android.view.View view, int i17, so2.j5 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        return false;
    }

    public final void i(java.util.List positionList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(positionList, "positionList");
        java.util.ArrayList<so2.j5> arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.a aVar = this.f210752c;
        int i17 = 0;
        for (java.lang.Object obj : aVar.c()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj;
            if (positionList.contains(java.lang.Integer.valueOf(i17))) {
                arrayList.add(j5Var);
            }
            i17 = i18;
        }
        java.util.Collections.reverse(arrayList);
        for (so2.j5 j5Var2 : arrayList) {
            int indexOf = aVar.c().indexOf(j5Var2);
            aVar.c().remove(j5Var2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = d().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8155x27702c4(indexOf);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = d().mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8151xc67946d3(indexOf, aVar.c().size() - indexOf);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15108xb0956cb5 c15108xb0956cb5 = this.f210763n;
        if (c15108xb0956cb5 != null) {
            c15108xb0956cb5.k();
        }
    }

    public final void j() {
        android.widget.FrameLayout frameLayout = this.f210757h;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f210758i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f210759j;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f210760k;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void k() {
        android.widget.FrameLayout frameLayout = this.f210757h;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f210758i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f210759j;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f210760k;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class d1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f215590d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f215591e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f215592f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f215593g;

    /* renamed from: h, reason: collision with root package name */
    public so2.a2 f215594h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg f215595i;

    /* renamed from: m, reason: collision with root package name */
    public in5.s0 f215596m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a f215597n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f215598o;

    /* renamed from: p, reason: collision with root package name */
    public int f215599p;

    /* renamed from: q, reason: collision with root package name */
    public int f215600q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f215601r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u0 f215602s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215591e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w0(this));
        this.f215592f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v0(this));
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f215593g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f215598o = new int[2];
        this.f215601r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z0(this));
    }

    public static void S6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1 d1Var, boolean z17, java.lang.CharSequence charSequence, long j17, android.graphics.drawable.Drawable drawable, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            j17 = 3000;
        }
        if ((i17 & 8) != 0) {
            drawable = null;
        }
        d1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u0(0);
        u0Var.f217606a = charSequence;
        u0Var.f217607b = j17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = d1Var.f215590d;
        java.lang.Object layoutManager = c1163xf1deaba4 != null ? c1163xf1deaba4.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        u0Var.f217609d = c1162x665295de != null ? c1162x665295de.w() : -1;
        u0Var.f217610e = java.lang.System.currentTimeMillis();
        if (drawable != null) {
            u0Var.f217608c = drawable;
        }
        d1Var.U6(z17, u0Var);
    }

    public final android.view.ViewGroup O6() {
        return (android.view.ViewGroup) this.f215592f.mo141623x754a37bb();
    }

    public final void P6(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u0 u0Var) {
        u0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DoubleClickTipUIC", "[hideCompleted] isBegin=" + z17 + " action=0");
    }

    public final boolean Q6() {
        in5.s0 s0Var = this.f215596m;
        so2.a2 a2Var = this.f215594h;
        if (s0Var != null && a2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar = this.f215595i;
            if (qgVar != null) {
                qgVar.h(s0Var, a2Var, 0, 2019, false, null);
            }
            return this.f215595i != null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.DoubleClickTipUIC", "notifyHeaderFullMergedView fail,feedFullMergedHeaderHolder:" + this.f215596m + ",headerFullMergedData:" + this.f215594h);
        return false;
    }

    public final void R6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, so2.a2 headerFullMergedData, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerFullMergedData, "headerFullMergedData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f215594h = headerFullMergedData;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f563960eb);
        viewGroup.setVisibility(0);
        this.f215595i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg(presenter);
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(m80379x76847179());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f215595i);
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569371h, viewGroup, false);
        viewGroup.addView(inflate);
        in5.s0 s0Var = new in5.s0(inflate);
        s0Var.f374659m = recyclerView;
        this.f215596m = s0Var;
        s0Var.f374658i = headerFullMergedData;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar = this.f215595i;
        if (qgVar != null) {
            qgVar.i(recyclerView, s0Var, 2019);
            qgVar.h(s0Var, headerFullMergedData, 0, 2019, false, null);
        }
    }

    public final void T6(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u0 u0Var) {
        u0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DoubleClickTipUIC", "[showCompleted] isBegin=" + z17 + " action=0");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f215593g;
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.oa_);
        if (textView != null) {
            textView.setText(u0Var.f217606a);
            textView.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.oaf);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        n3Var.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a1(this, u0Var), u0Var.f217607b);
    }

    public final void U6(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u0 u0Var) {
        android.view.View mo144222x4ff8c0f0;
        boolean z18 = false;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u0 u0Var2 = this.f215602s;
            if (u0Var2 != null) {
                u0Var.getClass();
                z18 = true;
            }
            if ((z18 || u0Var2 == null) && (mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f563962ed)) != null) {
                mo144222x4ff8c0f0.animate().cancel();
                if (mo144222x4ff8c0f0.getVisibility() == 0) {
                    P6(true, u0Var);
                    mo144222x4ff8c0f0.animate().alpha(0.0f).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.c1(mo144222x4ff8c0f0, this, u0Var)).start();
                    return;
                }
                return;
            }
            return;
        }
        this.f215602s = u0Var;
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f563962ed);
        if (mo144222x4ff8c0f02 != null) {
            mo144222x4ff8c0f02.setBackground(u0Var.f217608c);
            mo144222x4ff8c0f02.animate().cancel();
            T6(true, u0Var);
            if (mo144222x4ff8c0f02.getVisibility() == 8) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo144222x4ff8c0f02, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mo144222x4ff8c0f02.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mo144222x4ff8c0f02.animate().alpha(1.0f).setDuration(300L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.b1(this, u0Var)).start();
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ya0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ya0.class)).P6();
    }

    public final void V6() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DoubleClickTipUIC", "unRegisteActionBarLayoutChangeListener!");
        android.view.ViewGroup O6 = O6();
        if (O6 != null && (viewTreeObserver = O6.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) ((jz5.n) this.f215601r).mo141623x754a37bb());
        }
        this.f215597n = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.o8_);
        this.f215590d = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f215593g.mo50302x6b17ad39(null);
        V6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f215591e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w0(this));
        this.f215592f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v0(this));
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f215593g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f215598o = new int[2];
        this.f215601r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.z0(this));
    }
}

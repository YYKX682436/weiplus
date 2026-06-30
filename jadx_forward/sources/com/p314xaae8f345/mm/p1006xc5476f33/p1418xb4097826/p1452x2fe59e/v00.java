package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class v00 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct, ym5.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f192379d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt f192380e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f192381f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f192382g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f192383h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e f192384i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e f192385m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f192386n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f192387o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f192388p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f192389q;

    /* renamed from: r, reason: collision with root package name */
    public ym5.q3 f192390r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f192391s;

    /* renamed from: t, reason: collision with root package name */
    public int f192392t;

    public v00(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf baseContext, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bt presenter, android.view.View parent, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseContext, "baseContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f192379d = baseContext;
        this.f192380e = presenter;
        this.f192381f = parent;
        this.f192382g = componentCallbacksC1101xa17d4670;
        this.f192383h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s00(this));
        this.f192386n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i00(this));
        this.f192387o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u00(this));
        this.f192388p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r00(this));
        this.f192391s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k00(this));
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineViewCallback", "[onOverStop]");
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f192379d;
    }

    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa() {
        return l().m82555x4905e9fa();
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 l() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f192383h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) mo141623x754a37bb;
    }

    public final boolean o() {
        return ((java.lang.Boolean) ((jz5.n) this.f192388p).mo141623x754a37bb()).booleanValue() && this.f192392t == 4 && !this.f192389q;
    }

    public void q(boolean z17) {
        android.view.View findViewById = this.f192381f.findViewById(com.p314xaae8f345.mm.R.id.f565889e04);
        if (findViewById != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void s(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56655x4905e9fa = m56655x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m56655x4905e9fa.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.TimelineViewCallback", "can not cast layoutManager to FinderLinearLayoutManager: " + m56655x4905e9fa.getLayoutManager());
        } else {
            int w17 = z17 ? c15415x74224fd8.w() + 1 : c15415x74224fd8.w() - 1;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m56655x4905e9fa.mo7946xf939df19();
            if (w17 >= 0 && w17 < (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0)) {
                m56655x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t00(m56655x4905e9fa, w17));
            }
        }
    }
}

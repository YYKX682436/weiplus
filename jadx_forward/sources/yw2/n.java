package yw2;

/* loaded from: classes2.dex */
public final class n implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20 f548184d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f548185e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f548186f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e f548187g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f548188h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f548189i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f548190m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f548191n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f548192o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f548193p;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20 presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f548184d = presenter;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        this.f548184d.mo56042x3f5eee52();
        k().t(this);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20 w20Var = this.f548184d;
        if (z17 && z18) {
            w20Var.h(this, k().getFeedObj(), k().getLikeBuffer(), k().m62147xe496edb3());
        } else if (!z17 && z18) {
            w20Var.mo56042x3f5eee52();
        }
        if (z17) {
            this.f548193p = false;
        } else {
            int mo56041x7520bed6 = w20Var.mo56041x7520bed6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.D;
            if (mo56041x7520bed6 == 1 && !this.f548193p) {
                this.f548193p = true;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = o().m82555x4905e9fa().mo7946xf939df19();
                if (mo7946xf939df19 != null && (mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf)) {
                    java.lang.String nk6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nk();
                    int f17 = w20Var.f();
                    android.util.LongSparseArray longSparseArray = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19).C;
                    int size = longSparseArray.size();
                    java.lang.String exposeItems = "";
                    for (int i18 = 0; i18 < size; i18++) {
                        in5.x0 x0Var = (in5.x0) longSparseArray.valueAt(i18);
                        in5.c cVar = x0Var.f374691a;
                        if (cVar instanceof so2.f1) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(exposeItems);
                            so2.f1 f1Var = (so2.f1) cVar;
                            sb6.append(f1Var.f491869d.m75945x2fec8307(5));
                            sb6.append(';');
                            sb6.append(x0Var.f374693c);
                            sb6.append(';');
                            sb6.append(f1Var.f491869d.m75939xb282bd08(3));
                            sb6.append('#');
                            exposeItems = sb6.toString();
                        }
                    }
                    android.content.Context context = this.f548192o;
                    if (context == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj = k().getFeedObj();
                    if (V6 != null && feedObj != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                        long m59251x5db1b11 = feedObj.m59251x5db1b11();
                        o3Var.getClass();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeItems, "exposeItems");
                        if (o3Var.dk(m59251x5db1b11) != null) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6569xfdf25d14 c6569xfdf25d14 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6569xfdf25d14();
                            c6569xfdf25d14.f139203j = V6.m75939xb282bd08(5);
                            c6569xfdf25d14.f139198e = c6569xfdf25d14.b("ContextId", V6.m75945x2fec8307(1), true);
                            c6569xfdf25d14.f139199f = c6569xfdf25d14.b("ClickTabContextId", V6.m75945x2fec8307(2), true);
                            c6569xfdf25d14.f139205l = c6569xfdf25d14.b("EnterContextId", nk6, true);
                            c6569xfdf25d14.f139197d = c6569xfdf25d14.b("SessionId", V6.m75945x2fec8307(0), true);
                            c6569xfdf25d14.f139202i = c6569xfdf25d14.b("FeedId", pm0.v.u(m59251x5db1b11), true);
                            c6569xfdf25d14.f139201h = f17 > 0 ? 1L : 0L;
                            c6569xfdf25d14.f139200g = c6569xfdf25d14.b("ExposeItems", exposeItems, true);
                            c6569xfdf25d14.f139204k = f17;
                            c6569xfdf25d14.k();
                            o3Var.Zk(c6569xfdf25d14);
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
        android.content.Context context2 = this.f548192o;
        if (context2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        c14727x5e078d.a(context2, 5);
    }

    public final void g(boolean z17) {
        if (!z17) {
            o().m82690xd3a27e96(false);
            return;
        }
        o().m82690xd3a27e96(true);
        if (o().getRefreshHeader() == null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17 = o();
            android.content.Context context = this.f548192o;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cdl, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            o17.m82701x7344efcb(inflate);
        }
    }

    public final android.widget.TextView h() {
        android.widget.TextView textView = this.f548185e;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = this.f548187g;
        if (c15307x329a684e != null) {
            return c15307x329a684e;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("likeDrawer");
        throw null;
    }

    public final android.widget.TextView l() {
        android.widget.TextView textView = this.f548190m;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
        throw null;
    }

    public final android.view.View n() {
        android.view.View view = this.f548191n;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f548186f;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final void p() {
        android.widget.FrameLayout frameLayout = this.f548188h;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f548189i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l().setVisibility(8);
        android.view.View n17 = n();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(n17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(n17, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void q() {
        android.widget.FrameLayout frameLayout = this.f548188h;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f548189i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l().setVisibility(0);
        android.view.View n17 = n();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(n17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(n17, "com/tencent/mm/plugin/finder/view/builder/FinderLikeDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

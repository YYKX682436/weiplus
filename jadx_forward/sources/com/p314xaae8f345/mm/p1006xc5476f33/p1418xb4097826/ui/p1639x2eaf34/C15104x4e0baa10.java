package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lq40/e;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment */
/* loaded from: classes10.dex */
public final class C15104x4e0baa10 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 implements q40.e {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l A;
    public int B;
    public yz5.a C;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f210536t;

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f210537u;

    /* renamed from: v, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f210538v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f210539w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f210540x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f210541y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.c f210542z;

    public C15104x4e0baa10(java.lang.String conversation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        this.f210536t = conversation;
        this.f210537u = new p012xc85e97e9.p093xedfae76a.j0();
        this.f210538v = new p012xc85e97e9.p093xedfae76a.j0();
        this.f210541y = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bcp;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class});
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        if (this.f210542z != null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        fc2.o Z6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        this.f210542z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.c();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f m7548xe6e42394 = m7548xe6e42394();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7548xe6e42394, "requireActivity(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.c cVar = this.f210542z;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l(m7548xe6e42394, this, cVar, view, this.f210536t);
        this.A = lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.c cVar2 = this.f210542z;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        cVar2.f210546e = lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l c17 = cVar2.c();
        c17.f210564j = (android.widget.FrameLayout) c17.a(com.p314xaae8f345.mm.R.id.f565762dg3);
        c17.f210565k = c17.a(com.p314xaae8f345.mm.R.id.lbi);
        c17.f210566l = c17.a(com.p314xaae8f345.mm.R.id.dft);
        c17.f210567m = c17.a(com.p314xaae8f345.mm.R.id.m2g);
        c17.f210561g = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) c17.a(com.p314xaae8f345.mm.R.id.m6e);
        android.view.View a17 = c17.a(com.p314xaae8f345.mm.R.id.ebt);
        c17.f210568n = a17;
        android.app.Activity activity = c17.f210555a;
        a17.setBackgroundColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.view.View view2 = c17.f210568n;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dateHeaderContainer");
            throw null;
        }
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.ebs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        c17.f210569o = (android.widget.TextView) findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629 c15430xb1d1f629 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629(activity, null);
        c15430xb1d1f629.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5);
        c17.f210571q = c15430xb1d1f629;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c18 = c17.c();
        on5.c cVar3 = c17.f210571q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar3);
        c18.D(cVar3);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = c17.c().m62367x4905e9fa();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m62367x4905e9fa, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        c17.f210563i = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) m62367x4905e9fa;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b17 = c17.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 vj0Var = c17.f210570p;
        b17.mo7967x900dcbe1(vj0Var.d(activity));
        c17.b().m7964x8d4ad49c(null);
        c17.f210562h = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15105xb0a59557((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.d) vj0Var, null), c17.f210557c.f210545d, false);
        c17.b().N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ij0());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b18 = c17.b();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = c17.f210562h;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        b18.mo7960x6cab2c8d(c22848x6ddd90cf);
        c17.b().i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.g(c17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 fragment = c17.f210556b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null && (Z6 = nyVar.Z6(-1)) != null) {
            Z6.d(c17.b());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = c17.f210562h;
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf2.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.h(c17);
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf2.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.k(c17);
        this.f210537u.mo7806x9d92d11c(m7548xe6e42394(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.a(this));
        this.f210538v.mo7806x9d92d11c(m7548xe6e42394(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.b(this));
        this.f210539w = true;
        if (this.f210540x) {
            z0();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getF203048s() {
        return 197;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180
    public int x0() {
        return 3;
    }

    public void y0(java.lang.String query, java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ConvSearchFeedFragment", "onSearchResult query=" + query + " size=" + dataList.size());
        this.f210541y = query;
        this.f210537u.mo7808x76db6cb1(dataList);
    }

    public void z0() {
        if (!this.f210539w) {
            this.f210540x = true;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.l lVar = this.A;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.widget.FrameLayout frameLayout = lVar.f210564j;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = lVar.f210565k;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = lVar.f210566l;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = lVar.f210567m;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

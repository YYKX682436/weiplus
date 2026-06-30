package qq2;

/* loaded from: classes2.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq2.b f447462d;

    public a(qq2.b bVar) {
        this.f447462d = bVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        qq2.b bVar = this.f447462d;
        bVar.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7) layoutManager;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        int[] iArr = new int[2];
        c15416x1f1f78b7.u(new int[2]);
        c15416x1f1f78b7.v(iArr);
        int i19 = iArr[1];
        if (i19 != -1 && mo1894x7e414b06 - i19 <= bVar.f447468f && i18 > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreload tabId:");
            r45.dd2 dd2Var = bVar.f447464b;
            sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : null);
            sb6.append('-');
            sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = bVar.f447466d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            boolean z17 = bVar.f447467e;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreload return for open:" + z17);
            } else if (!bVar.f447469g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreload return for hasInitDone:" + bVar.f447469g);
            } else if (bVar.f447470h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreload return for isPreloading:" + bVar.f447470h);
            } else if (!bVar.f447471i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreload return for hasMore:" + bVar.f447471i);
            } else if (bVar.f447472j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreload return for isRefreshing:" + bVar.f447472j);
            } else if (dp2.a.f323716a.a("startPreload next page", dd2Var, bVar.f447465c)) {
                bVar.f447463a.mo56123x84fe90a(dd2Var);
                bVar.f447470h = true;
                bVar.f447473k = java.lang.System.currentTimeMillis();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPreload return for canStartPreload");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/preload/nextpage/NearbyNextPagePreload$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

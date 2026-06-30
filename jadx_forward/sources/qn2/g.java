package qn2;

/* loaded from: classes3.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f446598d;

    public g(qn2.n nVar) {
        this.f446598d = nVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        r45.jz1 jz1Var;
        java.util.LinkedList m75941xfb821914;
        r45.cz1 cz1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int x17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).x();
        qn2.n nVar = this.f446598d;
        qn2.c0 c0Var = nVar.Y;
        if (c0Var != null) {
            r45.ht1 ht1Var = ((on2.z2) nVar.P0(on2.z2.class)).f428627o;
            if (!(ht1Var != null && ht1Var.m75939xb282bd08(3) == 1) || x17 < 0 || x17 < c0Var.mo1894x7e414b06() - nVar.E) {
                pm0.v.X(new qn2.m(nVar, 8));
            } else {
                km2.z zVar = ((on2.z2) nVar.P0(on2.z2.class)).f428625m;
                java.lang.String m75945x2fec8307 = (zVar == null || (cz1Var = zVar.f390765d) == null) ? null : cz1Var.m75945x2fec8307(0);
                if (!nVar.Z && m75945x2fec8307 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load more product,product size:");
                    r45.ht1 ht1Var2 = ((on2.z2) nVar.P0(on2.z2.class)).f428627o;
                    sb6.append((ht1Var2 == null || (jz1Var = (r45.jz1) ht1Var2.m75936x14adae67(4)) == null || (m75941xfb821914 = jz1Var.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.B, sb6.toString());
                    nVar.Z = true;
                    pm0.v.X(new qn2.m(nVar, 0));
                    dk2.xf W0 = nVar.W0();
                    if (W0 != null) {
                        r45.ht1 ht1Var3 = ((on2.z2) nVar.P0(on2.z2.class)).f428627o;
                        ((dk2.r4) W0).N(m75945x2fec8307, ht1Var3 != null ? ht1Var3.m75934xbce7f2f(2) : null, new qn2.b(nVar));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initDoneView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

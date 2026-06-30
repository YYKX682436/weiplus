package f84;

/* loaded from: classes4.dex */
public final class p extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f84.u f341732d;

    public p(f84.u uVar) {
        this.f341732d = uVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnScrollListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        boolean canScrollHorizontally = recyclerView.canScrollHorizontally(1);
        boolean canScrollHorizontally2 = recyclerView.canScrollHorizontally(-1);
        f84.u uVar = this.f341732d;
        uVar.j();
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.j(), "onScrollStateChanged, idle");
            if (!canScrollHorizontally) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                uVar.H = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View E = uVar.E();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                if (E != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(E, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    E.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(E, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (!canScrollHorizontally2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                uVar.I = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View y17 = f84.u.y(uVar);
                if (y17 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(y17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    y17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(y17, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnScrollListener$1");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnScrollListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        boolean canScrollHorizontally = recyclerView.canScrollHorizontally(1);
        boolean canScrollHorizontally2 = recyclerView.canScrollHorizontally(-1);
        f84.u uVar = this.f341732d;
        uVar.j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        if (canScrollHorizontally) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            boolean z17 = uVar.H;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                uVar.H = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMInStayLeft$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View E = uVar.E();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                if (E != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(E, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    E.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(E, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        if (canScrollHorizontally2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            boolean z18 = uVar.I;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                uVar.I = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMInStayRight$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
                android.view.View y17 = f84.u.y(uVar);
                if (y17 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(y17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    y17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(y17, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adbrandtopic/AdBrandTopicComponent$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnScrollListener$1");
    }
}

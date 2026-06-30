package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class sh extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public float f217434d = 100.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f217435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th f217436f;

    public sh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th thVar) {
        this.f217436f = thVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        android.view.View view;
        java.util.List m82898xfb7e5820;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th thVar = this.f217436f;
        if (i17 == 0) {
            int i18 = -1;
            if (thVar.f217559e == null && !thVar.f217561g && thVar.f217564m != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                if (c22848x6ddd90cf != null && (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) != null) {
                    java.util.Iterator it = m82898xfb7e5820.iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        in5.c cVar = (in5.c) it.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = thVar.f217564m;
                        if (abstractC14490x69736cb5 != null && cVar.mo2128x1ed62e84() == abstractC14490x69736cb5.mo2128x1ed62e84()) {
                            i18 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 >= 0) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = recyclerView.p0(i18);
                    thVar.f217559e = (p07 == null || (view = p07.f3639x46306858) == null) ? null : view.findViewById(com.p314xaae8f345.mm.R.id.gvs);
                    android.view.View view2 = thVar.f217559e;
                    if (view2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            } else if (thVar.f217563i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = thVar.f217564m;
                if (abstractC14490x69736cb52 != null && abstractC14490x69736cb52.getIsShowGuideTips() == 1) {
                    android.view.View view3 = thVar.f217559e;
                    if (view3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    thVar.getClass();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) && ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).t() == 1) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, java.lang.Boolean.TRUE);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = thVar.f217564m;
                if (abstractC14490x69736cb53 != null) {
                    abstractC14490x69736cb53.U1(-1);
                }
            }
            this.f217435e = false;
        } else if (thVar.f217559e != null && i17 == 1) {
            thVar.f217563i = true;
            this.f217435e = true;
        }
        if (i17 == 1) {
            thVar.f217565n.mo50302x6b17ad39(null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        android.view.View view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (this.f217435e && (view = this.f217436f.f217559e) != null) {
            float f17 = this.f217434d - (i18 / 5.0f);
            this.f217434d = f17;
            float a17 = h3.a.a(f17, 0.0f, 100.0f);
            this.f217434d = a17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(a17 / 100.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFullFeedGuideUIC$setRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

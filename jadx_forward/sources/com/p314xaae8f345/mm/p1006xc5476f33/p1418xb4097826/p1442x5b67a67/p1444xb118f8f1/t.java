package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186809d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var) {
        this.f186809d = e0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int i18 = -1;
        int w17 = c1162x665295de != null ? c1162x665295de.w() : -1;
        if (w17 == -1) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var = this.f186809d;
        r45.bn2 bn2Var = (r45.bn2) ((zb2.b) e0Var.f186759p.get(w17)).f552791d.m75936x14adae67(1);
        int m75939xb282bd08 = bn2Var != null ? bn2Var.m75939xb282bd08(2) : 1;
        java.util.Iterator it = e0Var.f186758o.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zb2.c cVar = (zb2.c) it.next();
            r45.ft4 ft4Var = (r45.ft4) cVar.f552792d.m75936x14adae67(0);
            int m75939xb282bd082 = ft4Var != null ? ft4Var.m75939xb282bd08(0) : 0;
            r45.ft4 ft4Var2 = (r45.ft4) cVar.f552792d.m75936x14adae67(0);
            if (m75939xb282bd08 <= (ft4Var2 != null ? ft4Var2.m75939xb282bd08(1) : 0) && m75939xb282bd082 <= m75939xb282bd08) {
                i18 = i19;
                break;
            }
            i19++;
        }
        if (i18 != e0Var.f186767x) {
            e0Var.f186767x = i18;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = e0Var.f186761r;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeRv");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Undefined", "scrollToPosition", "(I)V");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = e0Var.f186761r;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeRv");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba42.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.s(e0Var.m80379x76847179());
            sVar.f93582a = i18;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = e0Var.f186761r;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeRv");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c1163xf1deaba43.getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.m8099x6305639d(sVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

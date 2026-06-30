package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class d5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f188080b;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, fp0.r rVar) {
        this.f188079a = a7Var;
        this.f188080b = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y yVar;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188079a;
        boolean z17 = true;
        a7Var.G = true;
        java.util.List list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m2) obj).f188877b;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.DrawerPresenter", "[preloadPrevPage] empty!");
            a7Var.G = false;
        } else {
            yw2.a0 a0Var = a7Var.f187749o;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = a0Var != null ? a0Var.s().m82555x4905e9fa() : null;
            if (m82555x4905e9fa != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m82555x4905e9fa.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                int childCount = m82555x4905e9fa.getChildCount();
                int i19 = 0;
                while (true) {
                    yVar = a7Var.f187743g;
                    if (i19 >= childCount) {
                        i17 = 0;
                        i18 = -1;
                        break;
                    }
                    android.view.View childAt = m82555x4905e9fa.getChildAt(i19);
                    i18 = m82555x4905e9fa.u0(childAt);
                    so2.y0 y0Var = (so2.y0) kz5.n0.a0(yVar.f190002d, i18);
                    if (y0Var != null && !(y0Var instanceof so2.z0)) {
                        i17 = childAt.getTop();
                        break;
                    }
                    i19++;
                }
                yVar.b(list, true, false);
                mo7946xf939df19.m8153xd399a4d9(yVar.f190001c == null ? 0 : 1, list.size());
                if (i18 != -1) {
                    int size = i18 + list.size();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    arrayList.add(java.lang.Integer.valueOf(size));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "insertItemsOnPreloadPrev", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "insertItemsOnPreloadPrev", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
            }
        }
        a7Var.f187764y0 = false;
        a7Var.I(false);
        this.f188080b.b(fp0.u.f346823f);
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.B(a7Var, list);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.i(a7Var);
        return jz5.f0.f384359a;
    }
}

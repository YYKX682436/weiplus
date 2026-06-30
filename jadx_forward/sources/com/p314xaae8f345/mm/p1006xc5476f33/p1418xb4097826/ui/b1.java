package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class b1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca f210458d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca c15012x2d1e2eca) {
        this.f210458d = c15012x2d1e2eca;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        qb2.t tVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca.B;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca c15012x2d1e2eca = this.f210458d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c15012x2d1e2eca.K0().f516139b.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c15012x2d1e2eca.K0().f516139b.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).y();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderConversationParentUI", "reportChatExpose:" + w17 + "--" + y17);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (w17 >= 0 && y17 >= w17) {
                if (w17 <= y17) {
                    while (true) {
                        if (c15012x2d1e2eca.w0() instanceof qb2.i0) {
                            wn.a w07 = c15012x2d1e2eca.w0();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
                            qb2.i0 i0Var = (qb2.i0) w07;
                            tVar = (w17 < 0 || w17 >= i0Var.K()) ? (qb2.t) i0Var.f442705n.get(w17 - i0Var.K()) : i0Var.L(w17);
                        } else {
                            java.util.List x17 = c15012x2d1e2eca.w0().x();
                            tVar = x17 != null ? (qb2.t) x17.get(w17) : null;
                        }
                        java.lang.String str = tVar != null ? tVar.f65866xbed8694c : null;
                        if (str == null) {
                            str = "";
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            linkedHashSet.add(str);
                        }
                        if (w17 == y17) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderConversationParentUI", "pageSet" + linkedHashSet + " size:" + linkedHashSet.size());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a6 a6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206757c;
                if (a6Var.f206482a) {
                    a6Var.e(linkedHashSet);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206756b.e(linkedHashSet);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment$getRecyclerView$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

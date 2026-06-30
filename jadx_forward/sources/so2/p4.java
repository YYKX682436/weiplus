package so2;

/* loaded from: classes2.dex */
public final class p4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f492069d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f492070e;

    public p4(int i17, java.lang.ref.WeakReference rPopupUIC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rPopupUIC, "rPopupUIC");
        this.f492069d = i17;
        this.f492070e = rPopupUIC;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu nuVar;
        r45.f03 f03Var;
        so2.a2 a2Var;
        so2.s4 s4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/model/FinderPopupLogic$PopupRvScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            int x17 = c1162x665295de != null ? c1162x665295de.x() : -1;
            if (x17 != -1 && (nuVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu) this.f492070e.get()) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrollIdle updateFinderPopupScroll tabType:");
                int i18 = this.f492069d;
                sb6.append(i18);
                sb6.append(" scroll update, ");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.toString());
                android.util.SparseArray sparseArray = nuVar.f216886d;
                so2.o4 o4Var = sparseArray != null ? (so2.o4) sparseArray.get(i18) : null;
                if (((o4Var == null || (a2Var = o4Var.f492057a) == null || (s4Var = a2Var.f491784h) == null) ? null : s4Var.f492125a) == so2.r4.f492107d) {
                    sb7.append("finder popup tips is show!");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderPopupUIC", sb7.toString());
                } else {
                    if (o4Var != null) {
                        if (o4Var.f492061e != x17) {
                            nuVar.f216887e++;
                            o4Var.f492062f = android.os.SystemClock.elapsedRealtime();
                            o4Var.f492061e = x17;
                        }
                        sb7.append("swipeCnt=" + nuVar.f216887e);
                    } else {
                        sb7.append("tabPopupCache is empty;");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopupUIC", sb7.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = nuVar.f216888f;
                    if (aVar != null && (f03Var = aVar.f186861b) != null) {
                        r45.hp2 hp2Var = f03Var.E;
                        r45.fp2 fp2Var = hp2Var != null ? hp2Var.f457910g : null;
                        int i19 = fp2Var != null ? fp2Var.f456036d : 0;
                        if (1 <= i19 && i19 <= nuVar.f216887e) {
                            nuVar.P6("onScrollIdle", i18);
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderPopupLogic$PopupRvScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/model/FinderPopupLogic$PopupRvScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderPopupLogic$PopupRvScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

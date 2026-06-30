package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class dx extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx f199701d;

    public dx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar) {
        this.f199701d = rxVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.lang.String str;
        r45.f62 f62Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initContentView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar = this.f199701d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rxVar.I, "[onScrollStateChanged] newState:" + i17);
        rxVar.Y = true;
        if (i17 == 0 || i17 == 2) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rxVar.I, "[onCardSelected] pos = " + w17 + ", oldSelectedPos = " + rxVar.f0().f519665e);
            if (rxVar.f0().f519665e != w17) {
                vm2.y f07 = rxVar.f0();
                if (f07.f519665e != w17) {
                    f07.f519665e = w17;
                    f07.m8146xced61ae5();
                }
                android.widget.TextView textView = rxVar.L;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    throw null;
                }
                java.util.LinkedList linkedList = rxVar.S;
                if (linkedList == null || (f62Var = (r45.f62) kz5.n0.a0(linkedList, w17)) == null || (str = f62Var.m75945x2fec8307(10)) == null) {
                    str = "";
                }
                textView.setText(str);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = rxVar.N;
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeRv");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c1163xf1deaba4.getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2 : null;
                if (c1162x665295de != null) {
                    int t17 = c1162x665295de.t();
                    int t18 = c1162x665295de.t();
                    if (w17 <= t17) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = rxVar.N;
                        if (c1163xf1deaba42 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeRv");
                            throw null;
                        }
                        c1163xf1deaba42.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jx(rxVar, w17), 100L);
                    }
                    if (w17 >= t18) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = rxVar.N;
                        if (c1163xf1deaba43 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeRv");
                            throw null;
                        }
                        c1163xf1deaba43.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kx(rxVar, w17, t18, t17), 100L);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initContentView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initContentView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$initContentView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i f233370d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i iVar) {
        this.f233370d = iVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrollStateChanged:");
        sb6.append(i17);
        sb6.append(", snapPosition:");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i iVar = this.f233370d;
        sb6.append(iVar.f233397m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CenterPagerSnapHelper", sb6.toString());
        if (i17 == 0) {
            iVar.f233394j = false;
            iVar.n();
        }
        if (i17 == 1) {
            iVar.f233394j = true;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.c cVar = iVar.f233400p;
            if (cVar != null) {
                int i18 = iVar.f233397m;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m2) cVar).f232823a;
                java.lang.String str = c16668xffb9dd68.f232507d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onPageStartChange:");
                sb7.append(i18);
                sb7.append(", dataList.size:");
                java.util.ArrayList arrayList2 = c16668xffb9dd68.f232510g;
                sb7.append(arrayList2.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
                if (i18 < arrayList2.size() && i18 >= 0) {
                    if (arrayList2.size() > 1) {
                        c16668xffb9dd68.X6(i18);
                    }
                    c16668xffb9dd68.f232523w = true;
                    pk4.c cVar2 = c16668xffb9dd68.f232516p;
                    if (cVar2 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l2(c16668xffb9dd68, i18);
                        gk4.r rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar2).f256099f;
                        rVar.getClass();
                        rVar.f354136h.i(new gk4.i(l2Var));
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/CenterPagerSnapHelper$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

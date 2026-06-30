package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class o4 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 f207335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f207336e;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var, yz5.l lVar) {
        this.f207335d = u4Var;
        this.f207336e = lVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u4 u4Var = this.f207335d;
        u4Var.f207424l = u4Var.f207421i.getItem(i17).toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchSuggestion", "onItemClick : " + i17 + " query:" + u4Var.f207424l);
        u4Var.c(u4Var.f207416d, 2);
        this.f207336e.mo146xb9724478(u4Var.f207424l);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u4Var.f207424l, u4Var.f207414b.m80966xdb574fcd().getText().toString())) {
            u4Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

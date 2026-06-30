package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class o5 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u5 f207337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f207338e;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u5 u5Var, yz5.p pVar) {
        this.f207337d = u5Var;
        this.f207338e = pVar;
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
        yj0.a.b("com/tencent/mm/plugin/finder/search/RingtoneSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.u5 u5Var = this.f207337d;
        u5Var.f207433m = u5Var.f207431h.getItem(i17).toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SearchSuggestion", "onItemClick : " + i17 + " query:" + u5Var.f207433m);
        this.f207338e.mo149xb9724478(java.lang.Integer.valueOf(i17), u5Var.f207433m);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u5Var.f207433m, u5Var.f207428e.m80966xdb574fcd().getText().toString())) {
            u5Var.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/RingtoneSearchSuggestionManager$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class f5 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m5 f207230d;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m5 m5Var) {
        this.f207230d = m5Var;
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
        yj0.a.b("com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        yz5.p pVar = this.f207230d.f207310b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207280a;
        r45.ju2 ju2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207281b;
        java.lang.String m75945x2fec8307 = ((r45.ku2) ju2Var.m75941xfb821914(0).get(i17)).m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        pVar.mo149xb9724478(valueOf, m75945x2fec8307);
        java.lang.String m75945x2fec83072 = ((r45.ku2) ju2Var.m75941xfb821914(0).get(i17)).m75945x2fec8307(1);
        k5Var.b(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

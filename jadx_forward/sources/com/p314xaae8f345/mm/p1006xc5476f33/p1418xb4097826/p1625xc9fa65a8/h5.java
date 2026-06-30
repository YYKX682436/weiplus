package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m5 f207247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207249f;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.m5 m5Var, int i17, java.lang.String str) {
        this.f207247d = m5Var;
        this.f207248e = i17;
        this.f207249f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f207247d.f207311c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f207248e);
        java.lang.String str = this.f207249f;
        if (str == null) {
            str = "";
        }
        pVar.mo149xb9724478(valueOf, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5 k5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207280a;
        int i17 = this.f207248e;
        synchronized (k5Var) {
            java.util.LinkedList m75941xfb821914 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k5.f207281b.m75941xfb821914(0);
            if (m75941xfb821914 != null) {
            }
        }
        k5Var.a();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.j5(k5Var));
        this.f207247d.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/RingtoneSearchHistoryLogic$HistoryAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

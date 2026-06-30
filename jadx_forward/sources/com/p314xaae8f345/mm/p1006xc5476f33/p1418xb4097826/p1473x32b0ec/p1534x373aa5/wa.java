package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class wa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb f198314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.a52 f198316f;

    public wa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar, int i17, r45.a52 a52Var) {
        this.f198314d = gbVar;
        this.f198315e = i17;
        this.f198316f = a52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f198314d.T;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(this.f198315e), (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f198316f.m75936x14adae67(8));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

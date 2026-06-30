package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class na implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb f198063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198064e;

    public na(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar, int i17) {
        this.f198063d = gbVar;
        this.f198064e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f198063d.W;
        if (pVar != null) {
            pVar.mo149xb9724478(999, java.lang.Integer.valueOf(this.f198064e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

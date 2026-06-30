package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class n4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p4 f198811d;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p4 p4Var) {
        this.f198811d = p4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGuideCardViewHolder$bind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f198811d.f3639x46306858.getContext();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGuideCard", "closeGuideCard: close guide card");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGuideCardViewHolder$bind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

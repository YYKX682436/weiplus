package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 f206397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e95 f206398e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var, r45.e95 e95Var) {
        this.f206397d = b0Var;
        this.f206398e = e95Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f206397d.f204853n;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f206398e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

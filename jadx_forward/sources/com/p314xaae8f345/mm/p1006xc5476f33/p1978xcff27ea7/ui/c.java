package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class c implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab f236679d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab) {
        this.f236679d = viewOnFocusChangeListenerC16958xba487cab;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/MallEditText$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab = this.f236679d;
        viewOnFocusChangeListenerC16958xba487cab.f236630u = viewOnFocusChangeListenerC16958xba487cab.f236622m.getItem(i17);
        vs3.a aVar = viewOnFocusChangeListenerC16958xba487cab.f236630u;
        if (aVar != null) {
            java.lang.String str = aVar.f521408a;
            java.lang.String str2 = aVar.f521409b;
            viewOnFocusChangeListenerC16958xba487cab.m67838x53271888(aVar);
        }
        viewOnFocusChangeListenerC16958xba487cab.f236619g.dismissDropDown();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/MallEditText$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

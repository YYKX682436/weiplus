package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class z0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 f234912d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 activityC16817xdad885e7) {
        this.f234912d = activityC16817xdad885e7;
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
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i) view.getTag();
        int i18 = iVar.f234835f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7 activityC16817xdad885e7 = this.f234912d;
        if (i18 == 1) {
            java.lang.Object obj = iVar.f234836g;
            if (obj instanceof java.lang.String) {
                activityC16817xdad885e7.f234777w.f530092l = (java.lang.String) obj;
            }
        } else if (i18 == 2) {
            wq3.t tVar = activityC16817xdad885e7.f234777w.f530082b;
            java.util.LinkedList linkedList = tVar.f530132e.f537597i;
            if (linkedList != null && linkedList.size() > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = tVar.f530132e.f537597i.iterator();
                while (it.hasNext()) {
                    arrayList2.add((java.lang.String) it.next());
                }
                iVar.f234836g = arrayList2;
            }
        }
        activityC16817xdad885e7.f234775u.a(activityC16817xdad885e7, view, i17);
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

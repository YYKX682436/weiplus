package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class k implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 f181068d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1) {
        this.f181068d = activityC13457xf0c8f0d1;
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
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        int headerViewsCount = i17 - ((android.widget.ListView) adapterView).getHeaderViewsCount();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1 = this.f181068d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u) ((java.util.LinkedList) activityC13457xf0c8f0d1.f180697e.f181195d).get(headerViewsCount);
        if (uVar.f181218e != com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v.NORMAL) {
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (!activityC13457xf0c8f0d1.U6(uVar.f181215b, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "try connect device failed.");
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            activityC13457xf0c8f0d1.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.c(activityC13457xf0c8f0d1, uVar.f181215b));
            uVar.f181218e = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v.ADDING;
            activityC13457xf0c8f0d1.f180697e.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}

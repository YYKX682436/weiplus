package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class k implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI f99535d;

    public k(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
        this.f99535d = exdeviceAddDataSourceUI;
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
        com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = this.f99535d;
        com.tencent.mm.plugin.exdevice.ui.u uVar = (com.tencent.mm.plugin.exdevice.ui.u) ((java.util.LinkedList) exdeviceAddDataSourceUI.f99164e.f99662d).get(headerViewsCount);
        if (uVar.f99685e != com.tencent.mm.plugin.exdevice.ui.v.NORMAL) {
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (!exdeviceAddDataSourceUI.U6(uVar.f99682b, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceAddDataSourceUI", "try connect device failed.");
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            exdeviceAddDataSourceUI.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.c(exdeviceAddDataSourceUI, uVar.f99682b));
            uVar.f99685e = com.tencent.mm.plugin.exdevice.ui.v.ADDING;
            exdeviceAddDataSourceUI.f99164e.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceAddDataSourceUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}

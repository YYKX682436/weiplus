package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class u implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceListUI f74628d;

    public u(com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI) {
        this.f74628d = invoiceListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        i83.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        synchronized (this.f74628d.f74428g) {
            if (i17 < this.f74628d.f74430i.size()) {
                com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI = this.f74628d;
                invoiceListUI.f74425d = (i83.b) invoiceListUI.f74430i.get(i17);
                com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI2 = this.f74628d;
                if (invoiceListUI2.f74431m || (bVar = invoiceListUI2.f74425d) == null) {
                    i83.b bVar2 = invoiceListUI2.f74425d;
                    if (bVar2 != null && bVar2.f289634d != 0) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("choose_invoice_title_info", t71.e.a(this.f74628d.f74425d));
                        this.f74628d.setResult(-1, intent);
                        this.f74628d.finish();
                    }
                } else {
                    invoiceListUI2.T6(bVar.f289634d);
                }
            }
        }
        this.f74628d.f74426e.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/InvoiceListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

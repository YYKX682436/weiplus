package com.tencent.mm.plugin.address.ui;

/* loaded from: classes8.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceListUI f74625d;

    public t(com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI) {
        this.f74625d = invoiceListUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.address.ui.InvoiceListUI.f74424o;
        com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI = this.f74625d;
        invoiceListUI.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14199, 2);
        invoiceListUI.T6(0);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/InvoiceListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

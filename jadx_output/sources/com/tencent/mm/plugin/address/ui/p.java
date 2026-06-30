package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceEditView f74610d;

    public p(com.tencent.mm.plugin.address.ui.InvoiceEditView invoiceEditView) {
        this.f74610d = invoiceEditView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.address.ui.InvoiceEditView invoiceEditView = this.f74610d;
        if (invoiceEditView.f74415i.getVisibility() == 0) {
            if (!invoiceEditView.f74420q || invoiceEditView.f74419p == 2 || com.tencent.mm.sdk.platformtools.t8.K0(invoiceEditView.getText())) {
                invoiceEditView.getClass();
            } else {
                invoiceEditView.f74414h.setText("");
                invoiceEditView.d(invoiceEditView.f74414h.isFocused());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/InvoiceEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

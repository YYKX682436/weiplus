package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74553d;

    public h0(com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView) {
        this.f74553d = invoiceQrcodeTextView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView = this.f74553d;
        if (invoiceQrcodeTextView.f74436g.getVisibility() == 0) {
            if (!invoiceQrcodeTextView.f74440n || invoiceQrcodeTextView.f74439m == 2 || com.tencent.mm.sdk.platformtools.t8.K0(invoiceQrcodeTextView.getText())) {
                invoiceQrcodeTextView.getClass();
            } else {
                invoiceQrcodeTextView.f74435f.setText("");
                invoiceQrcodeTextView.c(invoiceQrcodeTextView.f74435f.isFocused());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

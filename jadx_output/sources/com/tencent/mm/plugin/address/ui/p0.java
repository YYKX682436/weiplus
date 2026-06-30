package com.tencent.mm.plugin.address.ui;

/* loaded from: classes4.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI f74611d;

    public p0(com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI) {
        this.f74611d = qrcodeInvoiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI = this.f74611d;
        db5.d5 d5Var = qrcodeInvoiceUI.f74456r;
        if (d5Var != null && d5Var.isShowing()) {
            qrcodeInvoiceUI.f74456r.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

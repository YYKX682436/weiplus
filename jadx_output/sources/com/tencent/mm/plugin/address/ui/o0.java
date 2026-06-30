package com.tencent.mm.plugin.address.ui;

/* loaded from: classes4.dex */
public class o0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI f74607d;

    public o0(com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI) {
        this.f74607d = qrcodeInvoiceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI = this.f74607d;
        intent.setClass(qrcodeInvoiceUI, com.tencent.mm.plugin.address.ui.AddInvoiceUI.class);
        intent.putExtra("invoice_id", qrcodeInvoiceUI.f74445d);
        com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI2 = this.f74607d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(qrcodeInvoiceUI2, arrayList.toArray(), "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        qrcodeInvoiceUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(qrcodeInvoiceUI2, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}

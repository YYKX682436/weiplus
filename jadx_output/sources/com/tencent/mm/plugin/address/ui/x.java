package com.tencent.mm.plugin.address.ui;

/* loaded from: classes8.dex */
public class x implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceListUI f74640d;

    public x(com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI) {
        this.f74640d = invoiceListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI = this.f74640d;
        invoiceListUI.setResult(0);
        invoiceListUI.finish();
        return true;
    }
}

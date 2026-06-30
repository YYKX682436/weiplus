package com.tencent.mm.plugin.address.ui;

/* loaded from: classes8.dex */
public class y implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceListUI f74646d;

    public y(com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI) {
        this.f74646d = invoiceListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.address.ui.InvoiceListUI.f74424o;
        com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI = this.f74646d;
        invoiceListUI.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14199, 2);
        invoiceListUI.T6(0);
        return true;
    }
}

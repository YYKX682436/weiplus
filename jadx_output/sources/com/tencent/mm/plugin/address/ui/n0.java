package com.tencent.mm.plugin.address.ui;

/* loaded from: classes4.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI f74599d;

    public n0(com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI) {
        this.f74599d = qrcodeInvoiceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI = this.f74599d;
        qrcodeInvoiceUI.setResult(0);
        qrcodeInvoiceUI.finish();
        return true;
    }
}

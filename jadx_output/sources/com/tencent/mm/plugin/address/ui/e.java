package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.AddInvoiceUI f74536d;

    public e(com.tencent.mm.plugin.address.ui.AddInvoiceUI addInvoiceUI) {
        this.f74536d = addInvoiceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.address.ui.AddInvoiceUI addInvoiceUI = this.f74536d;
        addInvoiceUI.setResult(0);
        addInvoiceUI.finish();
    }
}

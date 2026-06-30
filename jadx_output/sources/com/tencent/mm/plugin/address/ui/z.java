package com.tencent.mm.plugin.address.ui;

/* loaded from: classes8.dex */
public class z implements android.content.DialogInterface.OnClickListener {
    public z(com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.InvoiceListUI", "dismiss DisclaimerDailog...");
        dialogInterface.dismiss();
    }
}

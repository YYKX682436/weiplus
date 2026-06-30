package com.tencent.mm.plugin.address.ui;

/* loaded from: classes8.dex */
public class w implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceListUI f74636d;

    public w(com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI) {
        this.f74636d = invoiceListUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.address.ui.InvoiceListUI invoiceListUI = this.f74636d;
        db5.e1.e(invoiceListUI.getContext(), null, invoiceListUI.getResources().getStringArray(com.tencent.mm.R.array.f478006u), null, new com.tencent.mm.plugin.address.ui.v(this, i17));
        return true;
    }
}

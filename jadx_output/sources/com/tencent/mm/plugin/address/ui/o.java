package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceEditView f74606d;

    public o(com.tencent.mm.plugin.address.ui.InvoiceEditView invoiceEditView) {
        this.f74606d = invoiceEditView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.address.ui.s sVar;
        com.tencent.mm.plugin.address.ui.InvoiceEditView invoiceEditView = this.f74606d;
        if (invoiceEditView.f74419p == 5 && invoiceEditView.f74418o != editable.toString().length()) {
            invoiceEditView.f74418o = editable.toString().length();
            invoiceEditView.setBankNumberValStr(editable.toString());
        }
        boolean b17 = invoiceEditView.b();
        if (b17 != invoiceEditView.f74421r && (sVar = invoiceEditView.f74411e) != null) {
            java.lang.String str = invoiceEditView.f74417n;
            int i17 = invoiceEditView.f74419p;
            invoiceEditView.f74421r = b17;
            ((com.tencent.mm.plugin.address.ui.AddInvoiceUI) sVar).T6();
        }
        boolean z17 = invoiceEditView.f74410d;
        if ((!z17 || invoiceEditView.f74421r) && z17 && invoiceEditView.f74421r) {
            invoiceEditView.f74414h.setTextColor(invoiceEditView.getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        invoiceEditView.d(invoiceEditView.f74414h.isFocused());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

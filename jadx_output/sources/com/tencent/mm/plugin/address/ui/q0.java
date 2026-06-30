package com.tencent.mm.plugin.address.ui;

/* loaded from: classes4.dex */
public class q0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI f74614d;

    public q0(com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI) {
        this.f74614d = qrcodeInvoiceUI;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        int i17 = com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI.f74444x;
        com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI = this.f74614d;
        android.view.WindowManager.LayoutParams attributes = qrcodeInvoiceUI.getWindow().getAttributes();
        float f17 = attributes.screenBrightness;
        float f18 = qrcodeInvoiceUI.f74459u;
        if (f17 > f18) {
            attributes.screenBrightness = f18;
            qrcodeInvoiceUI.getWindow().setAttributes(attributes);
        }
    }
}

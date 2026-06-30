package com.tencent.mm.plugin.address.ui;

/* loaded from: classes4.dex */
public class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI f74621d;

    public s0(com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI) {
        this.f74621d = qrcodeInvoiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.hfr) {
            com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI = this.f74621d;
            if (qrcodeInvoiceUI.f74456r != null) {
                qrcodeInvoiceUI.showPopupWindow(view);
                android.view.WindowManager.LayoutParams attributes = qrcodeInvoiceUI.getWindow().getAttributes();
                float f17 = attributes.screenBrightness;
                if (f17 < 0.85f) {
                    qrcodeInvoiceUI.f74459u = f17;
                    attributes.screenBrightness = 0.85f;
                    qrcodeInvoiceUI.getWindow().setAttributes(attributes);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.address.ui;

/* loaded from: classes4.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI f74617d;

    public r0(com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI) {
        this.f74617d = qrcodeInvoiceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI qrcodeInvoiceUI;
        db5.d5 d5Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.hfp && (d5Var = (qrcodeInvoiceUI = this.f74617d).f74456r) != null && d5Var.isShowing()) {
            qrcodeInvoiceUI.f74456r.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/QrcodeInvoiceUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

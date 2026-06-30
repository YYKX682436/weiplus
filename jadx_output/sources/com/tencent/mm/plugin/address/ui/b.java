package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.AddInvoiceUI f74519d;

    public b(com.tencent.mm.plugin.address.ui.AddInvoiceUI addInvoiceUI) {
        this.f74519d = addInvoiceUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/AddInvoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        com.tencent.mm.plugin.address.ui.AddInvoiceUI addInvoiceUI = this.f74519d;
        if (!addInvoiceUI.f74378e.isActivated()) {
            addInvoiceUI.f74378e.setActivated(true);
        }
        if (addInvoiceUI.f74378e.isActivated()) {
            addInvoiceUI.f74379f.setActivated(false);
            addInvoiceUI.f74391u.f289635e = "1";
        }
        addInvoiceUI.T6();
        yj0.a.i(true, this, "com/tencent/mm/plugin/address/ui/AddInvoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

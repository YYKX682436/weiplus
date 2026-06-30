package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class c0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74526d;

    public c0(com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView) {
        this.f74526d = invoiceQrcodeTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int rawX = (int) motionEvent.getRawX();
        com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView = this.f74526d;
        invoiceQrcodeTextView.f74442p = rawX;
        invoiceQrcodeTextView.f74443q = (int) motionEvent.getRawY();
        yj0.a.i(false, this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

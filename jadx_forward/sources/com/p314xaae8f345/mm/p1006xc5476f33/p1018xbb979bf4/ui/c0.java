package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes5.dex */
public class c0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d f156059d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d viewOnFocusChangeListenerC11490xd5b31b8d) {
        this.f156059d = viewOnFocusChangeListenerC11490xd5b31b8d;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d viewOnFocusChangeListenerC11490xd5b31b8d = this.f156059d;
        viewOnFocusChangeListenerC11490xd5b31b8d.f155975p = rawX;
        viewOnFocusChangeListenerC11490xd5b31b8d.f155976q = (int) motionEvent.getRawY();
        yj0.a.i(false, this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

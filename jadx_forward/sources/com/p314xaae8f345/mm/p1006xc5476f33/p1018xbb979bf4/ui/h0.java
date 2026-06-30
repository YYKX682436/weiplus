package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes5.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d f156086d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d viewOnFocusChangeListenerC11490xd5b31b8d) {
        this.f156086d = viewOnFocusChangeListenerC11490xd5b31b8d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d viewOnFocusChangeListenerC11490xd5b31b8d = this.f156086d;
        if (viewOnFocusChangeListenerC11490xd5b31b8d.f155969g.getVisibility() == 0) {
            if (!viewOnFocusChangeListenerC11490xd5b31b8d.f155973n || viewOnFocusChangeListenerC11490xd5b31b8d.f155972m == 2 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnFocusChangeListenerC11490xd5b31b8d.m48740xfb85ada3())) {
                viewOnFocusChangeListenerC11490xd5b31b8d.getClass();
            } else {
                viewOnFocusChangeListenerC11490xd5b31b8d.f155968f.setText("");
                viewOnFocusChangeListenerC11490xd5b31b8d.c(viewOnFocusChangeListenerC11490xd5b31b8d.f155968f.isFocused());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

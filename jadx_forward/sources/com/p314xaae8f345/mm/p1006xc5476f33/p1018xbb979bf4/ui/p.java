package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f156143d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc viewOnFocusChangeListenerC11488x5fd5e9fc) {
        this.f156143d = viewOnFocusChangeListenerC11488x5fd5e9fc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc viewOnFocusChangeListenerC11488x5fd5e9fc = this.f156143d;
        if (viewOnFocusChangeListenerC11488x5fd5e9fc.f155948i.getVisibility() == 0) {
            if (!viewOnFocusChangeListenerC11488x5fd5e9fc.f155953q || viewOnFocusChangeListenerC11488x5fd5e9fc.f155952p == 2 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnFocusChangeListenerC11488x5fd5e9fc.m48726xfb85ada3())) {
                viewOnFocusChangeListenerC11488x5fd5e9fc.getClass();
            } else {
                viewOnFocusChangeListenerC11488x5fd5e9fc.f155947h.setText("");
                viewOnFocusChangeListenerC11488x5fd5e9fc.d(viewOnFocusChangeListenerC11488x5fd5e9fc.f155947h.isFocused());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/InvoiceEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

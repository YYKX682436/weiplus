package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 f156180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f156181e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.l1 l1Var, int i17) {
        this.f156180d = l1Var;
        this.f156181e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d K = this.f156180d.K();
        if (K != null) {
            K.m80845x940d026a(this.f156181e, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

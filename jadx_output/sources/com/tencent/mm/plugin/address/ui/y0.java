package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.l1 f74647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74648e;

    public y0(com.tencent.mm.plugin.address.ui.l1 l1Var, int i17) {
        this.f74647d = l1Var;
        this.f74648e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.base.CustomViewPager K = this.f74647d.K();
        if (K != null) {
            K.setCurrentItem(this.f74648e, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/SelectAddressDialog$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

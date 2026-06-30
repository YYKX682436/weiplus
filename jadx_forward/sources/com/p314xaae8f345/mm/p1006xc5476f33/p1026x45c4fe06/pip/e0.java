package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 f168984d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var) {
        this.f168984d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168984d.f169051a, "onCloseButtonClick");
        if (this.f168984d.f169068r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f168984d.f169051a, "onCloseButtonClick when mPipClickProcessing, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f168984d;
        if (o0Var.f169071u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(o0Var.f169051a, "onCloseButtonClick when mIsTransfering, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.c cVar = o0Var.f169066p;
        if (cVar != null && (kVar = o0Var.C) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.p0) kVar).b(cVar.f168970i, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.n.PIP_CLOSE_BUTTON_CLICKED);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0.c(this.f168984d);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

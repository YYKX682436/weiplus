package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87451d;

    public e0(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87451d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.pip.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(this.f87451d.f87518a, "onCloseButtonClick");
        if (this.f87451d.f87535r) {
            com.tencent.mars.xlog.Log.w(this.f87451d.f87518a, "onCloseButtonClick when mPipClickProcessing, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87451d;
        if (o0Var.f87538u) {
            com.tencent.mars.xlog.Log.w(o0Var.f87518a, "onCloseButtonClick when mIsTransfering, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.pip.c cVar = o0Var.f87533p;
        if (cVar != null && (kVar = o0Var.C) != null) {
            ((com.tencent.mm.plugin.appbrand.pip.p0) kVar).b(cVar.f87437i, com.tencent.mm.plugin.appbrand.pip.n.PIP_CLOSE_BUTTON_CLICKED);
        }
        com.tencent.mm.plugin.appbrand.pip.o0.c(this.f87451d);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87458d;

    public f0(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87458d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(this.f87458d.f87518a, "onClick, mIsPipVideoRelatedPagePushed: " + this.f87458d.f87532o + ", mPipVideoRelatedPage: " + com.tencent.mm.plugin.appbrand.pip.o0.k(this.f87458d.f87531n));
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var2 = this.f87458d;
        if (o0Var2.f87538u) {
            com.tencent.mars.xlog.Log.i(o0Var2.f87518a, "onClick when mIsTransfering, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!o0Var2.f87535r && (w2Var = (o0Var = this.f87458d).f87531n) != null) {
            if (o0Var.f87532o) {
                com.tencent.mm.plugin.appbrand.page.i3 i3Var = o0Var.f87521d;
                i3Var.getClass();
                i3Var.c0(new com.tencent.mm.plugin.appbrand.page.m3(i3Var, w2Var, "scene_other"));
            } else {
                java.lang.String currentUrl = w2Var.getCurrentUrl();
                com.tencent.mm.plugin.appbrand.page.i3 i3Var2 = this.f87458d.f87521d;
                i3Var2.getClass();
                i3Var2.c0(new com.tencent.mm.plugin.appbrand.page.k4(i3Var2, currentUrl, null, null));
            }
            this.f87458d.f87535r = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

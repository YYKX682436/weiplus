package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCloseTaskView f91970d;

    public e(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCloseTaskView appBrandCloseTaskView) {
        this.f91970d = appBrandCloseTaskView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCloseTaskView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCloseTaskView appBrandCloseTaskView = this.f91970d;
        if (appBrandCloseTaskView.getTaskViewListener() != null) {
            com.tencent.mm.plugin.appbrand.page.t7 t7Var = (com.tencent.mm.plugin.appbrand.page.t7) appBrandCloseTaskView.getTaskViewListener();
            t7Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "onClickClose");
            com.tencent.mm.plugin.appbrand.page.n7 n7Var = t7Var.f87116c;
            n7Var.U1 = 2;
            n7Var.T1 = false;
            n7Var.S1.a();
            n7Var.R1.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCloseTaskView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

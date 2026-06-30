package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCloseTaskView f91973d;

    public f(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCloseTaskView appBrandCloseTaskView) {
        this.f91973d = appBrandCloseTaskView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCloseTaskView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCloseTaskView appBrandCloseTaskView = this.f91973d;
        if (appBrandCloseTaskView.getTaskViewListener() != null) {
            final com.tencent.mm.plugin.appbrand.page.t7 t7Var = (com.tencent.mm.plugin.appbrand.page.t7) appBrandCloseTaskView.getTaskViewListener();
            t7Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "onClickHome");
            com.tencent.mm.plugin.appbrand.page.n7 n7Var = t7Var.f87116c;
            n7Var.U1 = 4;
            n7Var.S1.a();
            n7Var.R1.a();
            n7Var.T1 = false;
            com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.t7$$b
                @Override // java.lang.Runnable
                public final void run() {
                    mi1.i iVar = com.tencent.mm.plugin.appbrand.page.t7.this.f87116c.getRuntime().f74821z.f326704c;
                    if (iVar == null) {
                        kotlin.jvm.internal.o.o("capsuleBarView");
                        throw null;
                    }
                    com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton capsuleHomeButton = iVar.getCapsuleHomeButton();
                    kotlin.jvm.internal.o.f(capsuleHomeButton, "getCapsuleHomeButton(...)");
                    capsuleHomeButton.performClick();
                }
            }, 200L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandCloseTaskView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

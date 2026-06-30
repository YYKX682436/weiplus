package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes4.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.h1 f91493d;

    public i1(com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var) {
        this.f91493d = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = this.f91493d;
        android.view.View view = h1Var.f91463d;
        if (view == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIdRootFrameLayout", "hideInactivePanelView, mPanel %s", view.getClass().getSimpleName());
        for (int i17 = 0; i17 < h1Var.getChildCount(); i17++) {
            android.view.View childAt = h1Var.getChildAt(i17);
            if (childAt != null && childAt != h1Var.f91464e && childAt != h1Var.f91463d) {
                h1Var.getClass();
                if (childAt != null && childAt.getVisibility() != 8) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "fast_setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "fast_setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }
}

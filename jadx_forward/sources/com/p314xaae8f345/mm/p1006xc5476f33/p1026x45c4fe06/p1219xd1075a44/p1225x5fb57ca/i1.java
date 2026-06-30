package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes4.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 f173026d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var) {
        this.f173026d = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = this.f173026d;
        android.view.View view = h1Var.f172996d;
        if (view == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIdRootFrameLayout", "hideInactivePanelView, mPanel %s", view.getClass().getSimpleName());
        for (int i17 = 0; i17 < h1Var.getChildCount(); i17++) {
            android.view.View childAt = h1Var.getChildAt(i17);
            if (childAt != null && childAt != h1Var.f172997e && childAt != h1Var.f172996d) {
                h1Var.getClass();
                if (childAt != null && childAt.getVisibility() != 8) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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

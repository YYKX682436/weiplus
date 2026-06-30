package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class r0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer f92042d;

    public r0(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer) {
        this.f92042d = appBrandTaskContainer;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        float rawX = motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer = this.f92042d;
        if (!appBrandTaskContainer.f91891n.contains((int) rawX, rawY)) {
            float rawX2 = motionEvent.getRawX();
            int rawY2 = (int) motionEvent.getRawY();
            if (!appBrandTaskContainer.f91892o.contains((int) rawX2, rawY2) && appBrandTaskContainer.getTaskViewListener() != null) {
                com.tencent.mm.plugin.appbrand.page.t7 t7Var = (com.tencent.mm.plugin.appbrand.page.t7) appBrandTaskContainer.getTaskViewListener();
                t7Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "onClickClose");
                com.tencent.mm.plugin.appbrand.page.n7 n7Var = t7Var.f87116c;
                n7Var.U1 = 3;
                n7Var.T1 = false;
                n7Var.S1.a();
                n7Var.R1.a();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

package al1;

/* loaded from: classes.dex */
public final /* synthetic */ class m$$b implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i17 = com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.f91025e;
        java.lang.Object obj = new java.lang.Object();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBarNavButtonContainerLayout", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", obj, array);
        int action = motionEvent.getAction();
        if (action == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(0.5f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBarNavButtonContainerLayout", "lambda$onViewAdded$0", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBarNavButtonContainerLayout", "lambda$onViewAdded$0", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else if (action == 1 || action == 3 || action == 4) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBarNavButtonContainerLayout", "lambda$onViewAdded$0", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBarNavButtonContainerLayout", "lambda$onViewAdded$0", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        yj0.a.i(false, new java.lang.Object(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBarNavButtonContainerLayout", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

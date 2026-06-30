package al1;

/* renamed from: al1.m$$b */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0023x321855 implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.f172558e;
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
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.5f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBarNavButtonContainerLayout", "lambda$onViewAdded$0", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBarNavButtonContainerLayout", "lambda$onViewAdded$0", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else if (action == 1 || action == 3 || action == 4) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
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

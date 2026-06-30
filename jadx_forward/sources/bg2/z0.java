package bg2;

/* loaded from: classes2.dex */
public final class z0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f102213d;

    public z0(android.view.View view) {
        this.f102213d = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertGuideBubbleController$getTouchInterceptor$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        android.view.View view2 = this.f102213d;
        if (pm0.v.r(view2).contains(rawX, rawY) && motionEvent.getAction() == 0) {
            view2.performClick();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertGuideBubbleController$getTouchInterceptor$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

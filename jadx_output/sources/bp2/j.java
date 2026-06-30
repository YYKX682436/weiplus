package bp2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.m f23069d;

    public j(bp2.m mVar) {
        this.f23069d = mVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$attachFloatView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f23069d.f23079h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$attachFloatView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$attachFloatView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper$attachFloatView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}

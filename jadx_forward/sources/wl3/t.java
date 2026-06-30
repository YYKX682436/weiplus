package wl3;

/* loaded from: classes2.dex */
public final class t implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.GestureDetector f528614d;

    public t(android.view.GestureDetector gestureDetector) {
        this.f528614d = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean z17 = false;
        if (view instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) {
            android.view.GestureDetector gestureDetector = this.f528614d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(motionEvent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            z17 = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
            yj0.a.g(gestureDetector, z17, "com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$1", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}

package ov0;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ov0.x f430691d = new ov0.x();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        view.getParent().requestDisallowInterceptTouchEvent(true);
        yj0.a.i(false, this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

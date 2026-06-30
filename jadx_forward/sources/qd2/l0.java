package qd2;

/* loaded from: classes3.dex */
public final class l0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f443328d;

    public l0(android.widget.ScrollView scrollView) {
        this.f443328d = scrollView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.widget.ScrollView scrollView = this.f443328d;
        if (scrollView.canScrollVertically(-1)) {
            scrollView.requestDisallowInterceptTouchEvent(true);
        } else {
            scrollView.requestDisallowInterceptTouchEvent(false);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

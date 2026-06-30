package ut2;

/* loaded from: classes2.dex */
public final class v0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ut2.v0 f512656d = new ut2.v0();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getActionMasked() == 0) {
            view.setTag(com.p314xaae8f345.mm.R.id.ohu, new float[]{motionEvent.getRawX(), motionEvent.getRawY()});
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

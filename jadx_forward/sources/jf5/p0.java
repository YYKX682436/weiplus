package jf5;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22096x6bae5f79 f381029d;

    public p0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22096x6bae5f79 c22096x6bae5f79) {
        this.f381029d = c22096x6bae5f79;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView$initPopup$window$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22096x6bae5f79 c22096x6bae5f79 = this.f381029d;
        if (action == 0 && (x17 < 0 || x17 >= c22096x6bae5f79.getWidth() || y17 < 0 || y17 >= c22096x6bae5f79.getHeight())) {
            yz5.a onOutsideTouched = c22096x6bae5f79.getOnOutsideTouched();
            if (onOutsideTouched != null) {
                onOutsideTouched.mo152xb9724478();
            }
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView$initPopup$window$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (motionEvent.getAction() != 4) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView$initPopup$window$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        yz5.a onOutsideTouched2 = c22096x6bae5f79.getOnOutsideTouched();
        if (onOutsideTouched2 != null) {
            onOutsideTouched2.mo152xb9724478();
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView$initPopup$window$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

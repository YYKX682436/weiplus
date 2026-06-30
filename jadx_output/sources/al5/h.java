package al5;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f5917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.BasePopupWindow f5918e;

    public h(android.graphics.Rect rect, com.tencent.mm.ui.widget.BasePopupWindow basePopupWindow) {
        this.f5917d = rect;
        this.f5918e = basePopupWindow;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/BasePopupWindow$showOnAnchor$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 4) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            android.graphics.Rect rect = this.f5917d;
            boolean contains = rect.contains(rawX, rawY);
            com.tencent.mm.ui.widget.BasePopupWindow basePopupWindow = this.f5918e;
            com.tencent.mars.xlog.Log.i(basePopupWindow.f211244a, "doShowTips() ACTION_OUTSIDE called with: event rawX,rawY:" + motionEvent.getRawX() + ' ' + motionEvent.getRawY() + " rect:" + rect + " isClickInBubbleTab:" + contains);
            basePopupWindow.dismiss();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/BasePopupWindow$showOnAnchor$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

package al5;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f87450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b f87451e;

    public h(android.graphics.Rect rect, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b c22598x77e1a40b) {
        this.f87450d = rect;
        this.f87451e = c22598x77e1a40b;
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
            android.graphics.Rect rect = this.f87450d;
            boolean contains = rect.contains(rawX, rawY);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22598x77e1a40b c22598x77e1a40b = this.f87451e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c22598x77e1a40b.f292777a, "doShowTips() ACTION_OUTSIDE called with: event rawX,rawY:" + motionEvent.getRawX() + ' ' + motionEvent.getRawY() + " rect:" + rect + " isClickInBubbleTab:" + contains);
            c22598x77e1a40b.dismiss();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/BasePopupWindow$showOnAnchor$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class k1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow f9627d;

    public k1(androidx.appcompat.widget.ListPopupWindow listPopupWindow) {
        this.f9627d = listPopupWindow;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        androidx.appcompat.widget.ListPopupWindow listPopupWindow = this.f9627d;
        if (action == 0 && (popupWindow = listPopupWindow.E) != null && popupWindow.isShowing() && x17 >= 0 && x17 < listPopupWindow.E.getWidth() && y17 >= 0 && y17 < listPopupWindow.E.getHeight()) {
            listPopupWindow.A.postDelayed(listPopupWindow.f9433w, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        listPopupWindow.A.removeCallbacks(listPopupWindow.f9433w);
        return false;
    }
}

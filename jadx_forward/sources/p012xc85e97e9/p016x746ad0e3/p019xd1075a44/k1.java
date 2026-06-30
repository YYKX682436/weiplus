package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class k1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e f91160d;

    public k1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e) {
        this.f91160d = c0099x7ccac81e;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e = this.f91160d;
        if (action == 0 && (popupWindow = c0099x7ccac81e.E) != null && popupWindow.isShowing() && x17 >= 0 && x17 < c0099x7ccac81e.E.getWidth() && y17 >= 0 && y17 < c0099x7ccac81e.E.getHeight()) {
            c0099x7ccac81e.A.postDelayed(c0099x7ccac81e.f90966w, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0099x7ccac81e.A.removeCallbacks(c0099x7ccac81e.f90966w);
        return false;
    }
}

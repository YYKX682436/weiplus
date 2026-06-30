package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class b1 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f11963d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.g1 f11964e;

    public b1(androidx.recyclerview.widget.g1 g1Var) {
        this.f11964e = g1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        androidx.recyclerview.widget.g1 g1Var;
        android.view.View i17;
        androidx.recyclerview.widget.k3 w07;
        if (this.f11963d && (i17 = (g1Var = this.f11964e).i(motionEvent)) != null && (w07 = g1Var.f12046x.w0(i17)) != null && g1Var.f12041s.hasDragFlag(g1Var.f12046x, w07)) {
            int pointerId = motionEvent.getPointerId(0);
            int i18 = g1Var.f12040r;
            if (pointerId == i18) {
                int findPointerIndex = motionEvent.findPointerIndex(i18);
                float x17 = motionEvent.getX(findPointerIndex);
                float y17 = motionEvent.getY(findPointerIndex);
                g1Var.f12032g = x17;
                g1Var.f12033h = y17;
                g1Var.f12037o = 0.0f;
                g1Var.f12036n = 0.0f;
                if (g1Var.f12041s.isLongPressDragEnabled()) {
                    g1Var.n(w07, 2);
                }
            }
        }
    }
}

package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class b1 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f93496d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f93497e;

    public b1(p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var) {
        this.f93497e = g1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var;
        android.view.View i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07;
        if (this.f93496d && (i17 = (g1Var = this.f93497e).i(motionEvent)) != null && (w07 = g1Var.f93579x.w0(i17)) != null && g1Var.f93574s.m8123x7923a37a(g1Var.f93579x, w07)) {
            int pointerId = motionEvent.getPointerId(0);
            int i18 = g1Var.f93573r;
            if (pointerId == i18) {
                int findPointerIndex = motionEvent.findPointerIndex(i18);
                float x17 = motionEvent.getX(findPointerIndex);
                float y17 = motionEvent.getY(findPointerIndex);
                g1Var.f93565g = x17;
                g1Var.f93566h = y17;
                g1Var.f93570o = 0.0f;
                g1Var.f93569n = 0.0f;
                if (g1Var.f93574s.mo8127x3b3ada10()) {
                    g1Var.n(w07, 2);
                }
            }
        }
    }
}

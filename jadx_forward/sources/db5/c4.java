package db5;

/* loaded from: classes15.dex */
public class c4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e f309838d;

    public c4(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e, db5.w3 w3Var) {
        this.f309838d = c21505x98c24a7e;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        db5.d5 d5Var;
        int action = motionEvent.getAction();
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f309838d;
        if (action == 0 && (d5Var = c21505x98c24a7e.f279010g) != null && d5Var.isShowing() && x17 >= 0 && x17 < c21505x98c24a7e.f279010g.getWidth() && y17 >= 0 && y17 < c21505x98c24a7e.f279010g.getHeight()) {
            c21505x98c24a7e.f279022s.postDelayed(c21505x98c24a7e.f279004a, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c21505x98c24a7e.f279022s.removeCallbacks(c21505x98c24a7e.f279004a);
        return false;
    }
}

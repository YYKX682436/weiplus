package db5;

/* loaded from: classes15.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e f309850d;

    public d4(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e, db5.w3 w3Var) {
        this.f309850d = c21505x98c24a7e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f309850d;
        db5.y3 y3Var = c21505x98c24a7e.f279012i;
        if (y3Var == null || y3Var.getCount() <= c21505x98c24a7e.f279012i.getChildCount() || c21505x98c24a7e.f279012i.getChildCount() > c21505x98c24a7e.f279008e) {
            return;
        }
        c21505x98c24a7e.f279010g.setInputMethodMode(2);
        c21505x98c24a7e.d();
    }
}

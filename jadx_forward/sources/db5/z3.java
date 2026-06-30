package db5;

/* loaded from: classes15.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e f310125d;

    public z3(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e, db5.w3 w3Var) {
        this.f310125d = c21505x98c24a7e;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.y3 y3Var = this.f310125d.f279012i;
        if (y3Var != null) {
            y3Var.f310112d = true;
            y3Var.requestLayout();
        }
    }
}

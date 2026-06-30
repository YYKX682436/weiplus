package yf;

/* loaded from: classes7.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.view.MotionEvent f542873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542874e;

    public e1(yf.i0 i0Var, yf.t0 t0Var) {
        this.f542874e = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        yf.i0 i0Var = this.f542874e;
        if (!i0Var.f542905v || i0Var.f542900q == 0 || i0Var.f542901r == 0) {
            return;
        }
        i0Var.A(this.f542873d.getX(), this.f542873d.getY());
    }
}

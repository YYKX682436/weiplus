package sr2;

/* loaded from: classes5.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f493107d;

    public h0(sr2.w0 w0Var) {
        this.f493107d = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        sr2.w0 w0Var = this.f493107d;
        android.view.View decorView = w0Var.m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) decorView).addView(w0Var.I, layoutParams);
        w0Var.m158354x19263085().getWindow().getDecorView().post(new sr2.g0(w0Var));
    }
}

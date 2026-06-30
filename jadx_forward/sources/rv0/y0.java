package rv0;

/* loaded from: classes5.dex */
public final class y0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481867e;

    public y0(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f481866d = n1Var;
        this.f481867e = a0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        rv0.n1 n1Var = this.f481866d;
        n1Var.r7().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        rv0.n1.t7(n1Var, this.f481867e, null, 2, null);
    }
}

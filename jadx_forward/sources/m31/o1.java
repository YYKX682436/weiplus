package m31;

/* loaded from: classes9.dex */
public final class o1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f404706d;

    public o1(m31.p1 p1Var) {
        this.f404706d = p1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m31.p1 p1Var = this.f404706d;
        p1Var.f404726t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        p1Var.o(true, new m31.n1(p1Var));
    }
}

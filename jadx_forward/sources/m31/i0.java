package m31;

/* loaded from: classes9.dex */
public final class i0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f404685d;

    public i0(m31.p1 p1Var) {
        this.f404685d = p1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m31.p1 p1Var = this.f404685d;
        if (p1Var.f404727u.getHeight() > 0) {
            p1Var.f404726t.getLayoutParams().height = p1Var.f404727u.getHeight();
        }
    }
}

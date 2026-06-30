package nu0;

/* loaded from: classes5.dex */
public final class x1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421670d;

    public x1(nu0.b4 b4Var) {
        this.f421670d = b4Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        nu0.b4 b4Var = this.f421670d;
        b4Var.t7().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        zu0.a aVar = (zu0.a) kz5.n0.Z(b4Var.f421420w);
        if (aVar == null) {
            return;
        }
        b4Var.C7(aVar, null);
    }
}

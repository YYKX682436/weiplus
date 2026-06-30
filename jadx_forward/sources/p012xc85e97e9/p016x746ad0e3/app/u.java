package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class u extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.g0 f90757a;

    public u(p012xc85e97e9.p016x746ad0e3.app.g0 g0Var) {
        this.f90757a = g0Var;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = this.f90757a;
        g0Var.f90654s.setAlpha(1.0f);
        g0Var.f90657v.d(null);
        g0Var.f90657v = null;
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = this.f90757a;
        g0Var.f90654s.setVisibility(0);
        g0Var.f90654s.sendAccessibilityEvent(32);
        if (g0Var.f90654s.getParent() instanceof android.view.View) {
            android.view.View view2 = (android.view.View) g0Var.f90654s.getParent();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.y0.c(view2);
        }
    }
}

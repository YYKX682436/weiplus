package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class u extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g0 f9224a;

    public u(androidx.appcompat.app.g0 g0Var) {
        this.f9224a = g0Var;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        androidx.appcompat.app.g0 g0Var = this.f9224a;
        g0Var.f9121s.setAlpha(1.0f);
        g0Var.f9124v.d(null);
        g0Var.f9124v = null;
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        androidx.appcompat.app.g0 g0Var = this.f9224a;
        g0Var.f9121s.setVisibility(0);
        g0Var.f9121s.sendAccessibilityEvent(32);
        if (g0Var.f9121s.getParent() instanceof android.view.View) {
            android.view.View view2 = (android.view.View) g0Var.f9121s.getParent();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.y0.c(view2);
        }
    }
}

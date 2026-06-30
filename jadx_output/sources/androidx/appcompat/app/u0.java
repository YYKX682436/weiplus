package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class u0 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.y0 f9225a;

    public u0(androidx.appcompat.app.y0 y0Var) {
        this.f9225a = y0Var;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        android.view.View view2;
        androidx.appcompat.app.y0 y0Var = this.f9225a;
        if (y0Var.f9252o && (view2 = y0Var.f9244g) != null) {
            view2.setTranslationY(0.0f);
            y0Var.f9241d.setTranslationY(0.0f);
        }
        y0Var.f9241d.setVisibility(8);
        y0Var.f9241d.setTransitioning(false);
        y0Var.f9257t = null;
        n.a aVar = y0Var.f9248k;
        if (aVar != null) {
            aVar.d(y0Var.f9247j);
            y0Var.f9247j = null;
            y0Var.f9248k = null;
        }
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = y0Var.f9240c;
        if (actionBarOverlayLayout != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.y0.c(actionBarOverlayLayout);
        }
    }
}

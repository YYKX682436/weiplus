package androidx.fragment.app;

/* loaded from: classes14.dex */
public class o extends androidx.fragment.app.n {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f11425c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11426d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f11427e;

    public o(androidx.fragment.app.m3 m3Var, j3.h hVar, boolean z17, boolean z18) {
        super(m3Var, hVar);
        androidx.fragment.app.l3 l3Var = m3Var.f11400a;
        androidx.fragment.app.l3 l3Var2 = androidx.fragment.app.l3.VISIBLE;
        androidx.fragment.app.Fragment fragment = m3Var.f11402c;
        if (l3Var == l3Var2) {
            this.f11425c = z17 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            this.f11426d = z17 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        } else {
            this.f11425c = z17 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f11426d = true;
        }
        if (!z18) {
            this.f11427e = null;
        } else if (z17) {
            this.f11427e = fragment.getSharedElementReturnTransition();
        } else {
            this.f11427e = fragment.getSharedElementEnterTransition();
        }
    }

    public final androidx.fragment.app.b3 c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        androidx.fragment.app.b3 b3Var = androidx.fragment.app.r2.f11468b;
        if (obj instanceof android.transition.Transition) {
            return b3Var;
        }
        androidx.fragment.app.b3 b3Var2 = androidx.fragment.app.r2.f11469c;
        if (b3Var2 != null && b3Var2.e(obj)) {
            return b3Var2;
        }
        throw new java.lang.IllegalArgumentException("Transition " + obj + " for fragment " + this.f11407a.f11402c + " is not a valid framework Transition or AndroidX Transition");
    }
}

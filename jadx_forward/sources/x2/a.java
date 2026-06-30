package x2;

/* loaded from: classes14.dex */
public class a implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a f533008a;

    public a(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a) {
        this.f533008a = c1081xa22a3e5a;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = this.f533008a;
        if (!m3.c.a(c1081xa22a3e5a.f92532s, g3Var)) {
            c1081xa22a3e5a.f92532s = g3Var;
            boolean z17 = g3Var != null && g3Var.e() > 0;
            c1081xa22a3e5a.f92533t = z17;
            c1081xa22a3e5a.setWillNotDraw(!z17 && c1081xa22a3e5a.getBackground() == null);
            if (!g3Var.f415871a.n()) {
                int childCount = c1081xa22a3e5a.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = c1081xa22a3e5a.getChildAt(i17);
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    if (n3.u0.b(childAt) && ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) childAt.getLayoutParams()).f92539a != null && g3Var.f415871a.n()) {
                        break;
                    }
                }
            }
            c1081xa22a3e5a.requestLayout();
        }
        return g3Var;
    }
}

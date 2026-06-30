package y9;

/* loaded from: classes14.dex */
public class b extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f541773a;

    public b(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046) {
        this.f541773a = c2690x46972046;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View view, int i17, int i18) {
        return view.getLeft();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int b(android.view.View view, int i17, int i18) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f541773a;
        return h3.a.b(i17, c2690x46972046.B(), c2690x46972046.f125976p ? c2690x46972046.f125983w : c2690x46972046.f125975o);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int d(android.view.View view) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f541773a;
        return c2690x46972046.f125976p ? c2690x46972046.f125983w : c2690x46972046.f125975o;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void h(int i17) {
        if (i17 == 1) {
            this.f541773a.E(1);
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f541773a.y(i18);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View view, float f17, float f18) {
        int i17;
        int i18 = 0;
        int i19 = 6;
        int i27 = 3;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f541773a;
        if (f18 < 0.0f) {
            if (c2690x46972046.f125967d) {
                i17 = c2690x46972046.f125973m;
            } else {
                int top = view.getTop();
                int i28 = c2690x46972046.f125974n;
                if (top > i28) {
                    i18 = i28;
                    i17 = i18;
                    i27 = i19;
                }
                i19 = 3;
                i17 = i18;
                i27 = i19;
            }
        } else if (c2690x46972046.f125976p && c2690x46972046.F(view, f18) && (view.getTop() > c2690x46972046.f125975o || java.lang.Math.abs(f17) < java.lang.Math.abs(f18))) {
            i17 = c2690x46972046.f125983w;
            i27 = 5;
        } else if (f18 == 0.0f || java.lang.Math.abs(f17) > java.lang.Math.abs(f18)) {
            int top2 = view.getTop();
            if (!c2690x46972046.f125967d) {
                int i29 = c2690x46972046.f125974n;
                if (top2 < i29) {
                    if (top2 >= java.lang.Math.abs(top2 - c2690x46972046.f125975o)) {
                        i18 = c2690x46972046.f125974n;
                    }
                    i19 = 3;
                } else if (java.lang.Math.abs(top2 - i29) < java.lang.Math.abs(top2 - c2690x46972046.f125975o)) {
                    i18 = c2690x46972046.f125974n;
                } else {
                    i18 = c2690x46972046.f125975o;
                    i19 = 4;
                }
            } else if (java.lang.Math.abs(top2 - c2690x46972046.f125973m) < java.lang.Math.abs(top2 - c2690x46972046.f125975o)) {
                i18 = c2690x46972046.f125973m;
                i19 = 3;
            } else {
                i18 = c2690x46972046.f125975o;
                i19 = 4;
            }
            i17 = i18;
            i27 = i19;
        } else {
            i17 = c2690x46972046.f125975o;
            i27 = 4;
        }
        if (!c2690x46972046.f125979s.s(view.getLeft(), i17)) {
            c2690x46972046.E(i27);
            return;
        }
        c2690x46972046.E(2);
        y9.d dVar = new y9.d(c2690x46972046, view, i27);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(view, dVar);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View view, int i17) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view2;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f541773a;
        int i18 = c2690x46972046.f125978r;
        if (i18 == 1 || c2690x46972046.D) {
            return false;
        }
        return ((i18 == 3 && c2690x46972046.B == i17 && (view2 = (android.view.View) c2690x46972046.f125985y.get()) != null && view2.canScrollVertically(-1)) || (weakReference = c2690x46972046.f125984x) == null || weakReference.get() != view) ? false : true;
    }
}

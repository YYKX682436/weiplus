package c;

/* loaded from: classes14.dex */
public class b extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 f118384a;

    public b(p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6) {
        this.f118384a = c0029xbc4672a6;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View view, int i17, int i18) {
        return view.getLeft();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int b(android.view.View view, int i17, int i18) {
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = this.f118384a;
        return h3.a.b(i17, c0029xbc4672a6.f90420h, c0029xbc4672a6.f90422m ? c0029xbc4672a6.f90429t : c0029xbc4672a6.f90421i);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int d(android.view.View view) {
        int i17;
        int i18;
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = this.f118384a;
        if (c0029xbc4672a6.f90422m) {
            i17 = c0029xbc4672a6.f90429t;
            i18 = c0029xbc4672a6.f90420h;
        } else {
            i17 = c0029xbc4672a6.f90421i;
            i18 = c0029xbc4672a6.f90420h;
        }
        return i17 - i18;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void h(int i17) {
        if (i17 == 1) {
            this.f118384a.D(1);
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f118384a.y(i18);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View view, float f17, float f18) {
        int i17;
        int i18 = 3;
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = this.f118384a;
        if (f18 < 0.0f) {
            i17 = c0029xbc4672a6.f90420h;
        } else if (c0029xbc4672a6.f90422m && c0029xbc4672a6.E(view, f18)) {
            i17 = c0029xbc4672a6.f90429t;
            i18 = 5;
        } else {
            if (f18 == 0.0f) {
                int top = view.getTop();
                if (java.lang.Math.abs(top - c0029xbc4672a6.f90420h) < java.lang.Math.abs(top - c0029xbc4672a6.f90421i)) {
                    i17 = c0029xbc4672a6.f90420h;
                } else {
                    i17 = c0029xbc4672a6.f90421i;
                }
            } else {
                i17 = c0029xbc4672a6.f90421i;
            }
            i18 = 4;
        }
        if (!c0029xbc4672a6.f90425p.s(view.getLeft(), i17)) {
            c0029xbc4672a6.D(i18);
            return;
        }
        c0029xbc4672a6.D(2);
        c.e eVar = new c.e(c0029xbc4672a6, view, i18);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(view, eVar);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View view, int i17) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view2;
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = this.f118384a;
        int i18 = c0029xbc4672a6.f90424o;
        if (i18 == 1 || c0029xbc4672a6.D) {
            return false;
        }
        return ((i18 == 3 && c0029xbc4672a6.f90434y == i17 && (view2 = (android.view.View) c0029xbc4672a6.f90431v.get()) != null && view2.canScrollVertically(-1)) || (weakReference = c0029xbc4672a6.f90430u) == null || weakReference.get() != view) ? false : true;
    }
}

package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.n f12172a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.m f12173b = new androidx.recyclerview.widget.m();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f12174c = new java.util.ArrayList();

    public o(androidx.recyclerview.widget.n nVar) {
        this.f12172a = nVar;
    }

    public void a(android.view.View view, int i17, boolean z17) {
        androidx.recyclerview.widget.n nVar = this.f12172a;
        int a17 = i17 < 0 ? ((androidx.recyclerview.widget.d2) nVar).a() : f(i17);
        this.f12173b.e(a17, z17);
        if (z17) {
            i(view);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = ((androidx.recyclerview.widget.d2) nVar).f11999a;
        recyclerView.addView(view, a17);
        androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
        androidx.recyclerview.widget.f2 f2Var = recyclerView.f11901r;
        if (f2Var != null && x07 != null) {
            f2Var.onViewAttachedToWindow(x07);
        }
        java.util.List list = recyclerView.H;
        if (list == null) {
            return;
        }
        int size = ((java.util.ArrayList) list).size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((androidx.recyclerview.widget.RecyclerView.a) ((java.util.ArrayList) recyclerView.H).get(size)).R3(view);
            }
        }
    }

    public void b(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        androidx.recyclerview.widget.n nVar = this.f12172a;
        int a17 = i17 < 0 ? ((androidx.recyclerview.widget.d2) nVar).a() : f(i17);
        this.f12173b.e(a17, z17);
        if (z17) {
            i(view);
        }
        androidx.recyclerview.widget.d2 d2Var = (androidx.recyclerview.widget.d2) nVar;
        d2Var.getClass();
        androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
        androidx.recyclerview.widget.RecyclerView recyclerView = d2Var.f11999a;
        if (x07 != null) {
            if (!x07.isTmpDetached() && !x07.shouldIgnore()) {
                throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + x07 + recyclerView.i0());
            }
            x07.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, a17, layoutParams);
    }

    public void c(int i17) {
        androidx.recyclerview.widget.k3 x07;
        int f17 = f(i17);
        this.f12173b.f(f17);
        androidx.recyclerview.widget.d2 d2Var = (androidx.recyclerview.widget.d2) this.f12172a;
        android.view.View childAt = d2Var.f11999a.getChildAt(f17);
        androidx.recyclerview.widget.RecyclerView recyclerView = d2Var.f11999a;
        if (childAt != null && (x07 = androidx.recyclerview.widget.RecyclerView.x0(childAt)) != null) {
            if (x07.isTmpDetached() && !x07.shouldIgnore()) {
                throw new java.lang.IllegalArgumentException("called detach on an already detached child " + x07 + recyclerView.i0());
            }
            x07.addFlags(256);
        }
        recyclerView.detachViewFromParent(f17);
    }

    public android.view.View d(int i17) {
        return ((androidx.recyclerview.widget.d2) this.f12172a).f11999a.getChildAt(f(i17));
    }

    public int e() {
        return ((androidx.recyclerview.widget.d2) this.f12172a).a() - ((java.util.ArrayList) this.f12174c).size();
    }

    public final int f(int i17) {
        if (i17 < 0) {
            return -1;
        }
        int a17 = ((androidx.recyclerview.widget.d2) this.f12172a).a();
        int i18 = i17;
        while (i18 < a17) {
            androidx.recyclerview.widget.m mVar = this.f12173b;
            int b17 = i17 - (i18 - mVar.b(i18));
            if (b17 == 0) {
                while (mVar.d(i18)) {
                    i18++;
                }
                return i18;
            }
            i18 += b17;
        }
        return -1;
    }

    public android.view.View g(int i17) {
        return ((androidx.recyclerview.widget.d2) this.f12172a).f11999a.getChildAt(i17);
    }

    public int h() {
        return ((androidx.recyclerview.widget.d2) this.f12172a).a();
    }

    public final void i(android.view.View view) {
        ((java.util.ArrayList) this.f12174c).add(view);
        androidx.recyclerview.widget.d2 d2Var = (androidx.recyclerview.widget.d2) this.f12172a;
        d2Var.getClass();
        androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
        if (x07 != null) {
            x07.onEnteredHiddenState(d2Var.f11999a);
        }
    }

    public int j(android.view.View view) {
        int indexOfChild = ((androidx.recyclerview.widget.d2) this.f12172a).f11999a.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        androidx.recyclerview.widget.m mVar = this.f12173b;
        if (mVar.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - mVar.b(indexOfChild);
    }

    public boolean k(android.view.View view) {
        return ((java.util.ArrayList) this.f12174c).contains(view);
    }

    public void l(int i17) {
        int f17 = f(i17);
        androidx.recyclerview.widget.d2 d2Var = (androidx.recyclerview.widget.d2) this.f12172a;
        android.view.View childAt = d2Var.f11999a.getChildAt(f17);
        if (childAt == null) {
            return;
        }
        if (this.f12173b.f(f17)) {
            m(childAt);
        }
        d2Var.b(f17);
    }

    public final boolean m(android.view.View view) {
        if (!((java.util.ArrayList) this.f12174c).remove(view)) {
            return false;
        }
        androidx.recyclerview.widget.d2 d2Var = (androidx.recyclerview.widget.d2) this.f12172a;
        d2Var.getClass();
        androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
        if (x07 == null) {
            return true;
        }
        x07.onLeftHiddenState(d2Var.f11999a);
        return true;
    }

    public java.lang.String toString() {
        return this.f12173b.toString() + ", hidden list:" + ((java.util.ArrayList) this.f12174c).size();
    }
}

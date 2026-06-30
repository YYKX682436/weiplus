package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class n2 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.l2 f12166a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f12167b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public long f12168c = 120;

    /* renamed from: d, reason: collision with root package name */
    public long f12169d = 120;

    /* renamed from: e, reason: collision with root package name */
    public long f12170e = 250;

    /* renamed from: f, reason: collision with root package name */
    public long f12171f = 250;

    public static int e(androidx.recyclerview.widget.k3 k3Var) {
        int i17 = k3Var.mFlags & 14;
        if (k3Var.isInvalid()) {
            return 4;
        }
        if ((i17 & 4) != 0) {
            return i17;
        }
        int oldPosition = k3Var.getOldPosition();
        int adapterPosition = k3Var.getAdapterPosition();
        return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i17 : i17 | 2048;
    }

    public abstract boolean a(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.m2 m2Var, androidx.recyclerview.widget.m2 m2Var2);

    public abstract boolean b(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, androidx.recyclerview.widget.m2 m2Var, androidx.recyclerview.widget.m2 m2Var2);

    public abstract boolean c(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.m2 m2Var, androidx.recyclerview.widget.m2 m2Var2);

    public abstract boolean d(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.m2 m2Var, androidx.recyclerview.widget.m2 m2Var2);

    public abstract boolean f(androidx.recyclerview.widget.k3 k3Var);

    public boolean g(androidx.recyclerview.widget.k3 k3Var, java.util.List list) {
        return f(k3Var);
    }

    public final void h(androidx.recyclerview.widget.k3 k3Var) {
        q(k3Var);
        androidx.recyclerview.widget.l2 l2Var = this.f12166a;
        if (l2Var != null) {
            androidx.recyclerview.widget.o2 o2Var = (androidx.recyclerview.widget.o2) l2Var;
            boolean z17 = true;
            k3Var.setIsRecyclable(true);
            if (k3Var.mShadowedHolder != null && k3Var.mShadowingHolder == null) {
                k3Var.mShadowedHolder = null;
            }
            k3Var.mShadowingHolder = null;
            if (k3Var.shouldBeKeptAsChild()) {
                return;
            }
            android.view.View view = k3Var.itemView;
            androidx.recyclerview.widget.RecyclerView recyclerView = o2Var.f12181a;
            recyclerView.d1();
            androidx.recyclerview.widget.o oVar = recyclerView.f11891h;
            androidx.recyclerview.widget.d2 d2Var = (androidx.recyclerview.widget.d2) oVar.f12172a;
            int indexOfChild = d2Var.f11999a.indexOfChild(view);
            if (indexOfChild == -1) {
                oVar.m(view);
            } else {
                androidx.recyclerview.widget.m mVar = oVar.f12173b;
                if (mVar.d(indexOfChild)) {
                    mVar.f(indexOfChild);
                    oVar.m(view);
                    d2Var.b(indexOfChild);
                } else {
                    z17 = false;
                }
            }
            if (z17) {
                androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(view);
                recyclerView.f11888e.n(x07);
                recyclerView.f11888e.j(x07);
            }
            recyclerView.e1(!z17);
            if (z17 || !k3Var.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(k3Var.itemView, false);
        }
    }

    public final void i() {
        java.util.ArrayList arrayList = this.f12167b;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.recyclerview.widget.k2) arrayList.get(i17)).a();
        }
        arrayList.clear();
    }

    public abstract void j(androidx.recyclerview.widget.k3 k3Var);

    public abstract void k();

    public long l() {
        return n();
    }

    public long m() {
        return this.f12168c;
    }

    public long n() {
        return this.f12169d;
    }

    public abstract boolean o();

    public final boolean p(androidx.recyclerview.widget.k2 k2Var) {
        boolean o17 = o();
        if (k2Var != null) {
            if (o17) {
                this.f12167b.add(k2Var);
            } else {
                k2Var.a();
            }
        }
        return o17;
    }

    public void q(androidx.recyclerview.widget.k3 k3Var) {
    }

    public androidx.recyclerview.widget.m2 r(androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        androidx.recyclerview.widget.m2 m2Var = new androidx.recyclerview.widget.m2();
        m2Var.a(k3Var, 0);
        return m2Var;
    }

    public abstract void s();
}

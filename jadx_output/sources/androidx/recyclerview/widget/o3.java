package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public abstract class o3 extends androidx.recyclerview.widget.n2 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f12182g = true;

    public void A(androidx.recyclerview.widget.k3 k3Var) {
    }

    public void B(androidx.recyclerview.widget.k3 k3Var) {
    }

    public void C(androidx.recyclerview.widget.k3 k3Var) {
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean a(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.m2 m2Var, androidx.recyclerview.widget.m2 m2Var2) {
        int i17;
        int i18;
        return (m2Var == null || ((i17 = m2Var.f12139a) == (i18 = m2Var2.f12139a) && m2Var.f12140b == m2Var2.f12140b)) ? t(k3Var) : v(k3Var, i17, m2Var.f12140b, i18, m2Var2.f12140b);
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean b(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, androidx.recyclerview.widget.m2 m2Var, androidx.recyclerview.widget.m2 m2Var2) {
        int i17;
        int i18;
        int i19 = m2Var.f12139a;
        int i27 = m2Var.f12140b;
        if (k3Var2.shouldIgnore()) {
            int i28 = m2Var.f12139a;
            i18 = m2Var.f12140b;
            i17 = i28;
        } else {
            i17 = m2Var2.f12139a;
            i18 = m2Var2.f12140b;
        }
        return u(k3Var, k3Var2, i19, i27, i17, i18);
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean c(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.m2 m2Var, androidx.recyclerview.widget.m2 m2Var2) {
        int i17 = m2Var.f12139a;
        int i18 = m2Var.f12140b;
        android.view.View view = k3Var.itemView;
        int left = m2Var2 == null ? view.getLeft() : m2Var2.f12139a;
        int top = m2Var2 == null ? view.getTop() : m2Var2.f12140b;
        if (k3Var.isRemoved() || (i17 == left && i18 == top)) {
            return w(k3Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return v(k3Var, i17, i18, left, top);
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean d(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.m2 m2Var, androidx.recyclerview.widget.m2 m2Var2) {
        int i17 = m2Var.f12139a;
        int i18 = m2Var2.f12139a;
        if (i17 != i18 || m2Var.f12140b != m2Var2.f12140b) {
            return v(k3Var, i17, m2Var.f12140b, i18, m2Var2.f12140b);
        }
        x(k3Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.n2
    public boolean f(androidx.recyclerview.widget.k3 k3Var) {
        return !this.f12182g || k3Var.isInvalid();
    }

    public abstract boolean t(androidx.recyclerview.widget.k3 k3Var);

    public abstract boolean u(androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, int i17, int i18, int i19, int i27);

    public abstract boolean v(androidx.recyclerview.widget.k3 k3Var, int i17, int i18, int i19, int i27);

    public abstract boolean w(androidx.recyclerview.widget.k3 k3Var);

    public final void x(androidx.recyclerview.widget.k3 k3Var) {
        z(k3Var);
        h(k3Var);
    }

    public final void y(androidx.recyclerview.widget.k3 k3Var) {
        B(k3Var);
        h(k3Var);
    }

    public void z(androidx.recyclerview.widget.k3 k3Var) {
    }
}

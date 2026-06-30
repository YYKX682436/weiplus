package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes3.dex */
public abstract class o3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f93715g = true;

    public void A(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }

    public void B(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }

    public void C(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2) {
        int i17;
        int i18;
        return (m2Var == null || ((i17 = m2Var.f93672a) == (i18 = m2Var2.f93672a) && m2Var.f93673b == m2Var2.f93673b)) ? t(k3Var) : v(k3Var, i17, m2Var.f93673b, i18, m2Var2.f93673b);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2) {
        int i17;
        int i18;
        int i19 = m2Var.f93672a;
        int i27 = m2Var.f93673b;
        if (k3Var2.m8209xa033ad65()) {
            int i28 = m2Var.f93672a;
            i18 = m2Var.f93673b;
            i17 = i28;
        } else {
            i17 = m2Var2.f93672a;
            i18 = m2Var2.f93673b;
        }
        return u(k3Var, k3Var2, i19, i27, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2) {
        int i17 = m2Var.f93672a;
        int i18 = m2Var.f93673b;
        android.view.View view = k3Var.f3639x46306858;
        int left = m2Var2 == null ? view.getLeft() : m2Var2.f93672a;
        int top = m2Var2 == null ? view.getTop() : m2Var2.f93673b;
        if (k3Var.m8195x1e855fd6() || (i17 == left && i18 == top)) {
            return w(k3Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return v(k3Var, i17, i18, left, top);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2) {
        int i17 = m2Var.f93672a;
        int i18 = m2Var2.f93672a;
        if (i17 != i18 || m2Var.f93673b != m2Var2.f93673b) {
            return v(k3Var, i17, m2Var.f93673b, i18, m2Var2.f93673b);
        }
        x(k3Var);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean f(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return !this.f93715g || k3Var.m8193x5241396d();
    }

    public abstract boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var);

    public abstract boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, int i17, int i18, int i19, int i27);

    public abstract boolean v(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18, int i19, int i27);

    public abstract boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var);

    public final void x(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        z(k3Var);
        h(k3Var);
    }

    public final void y(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        B(k3Var);
        h(k3Var);
    }

    public void z(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }
}

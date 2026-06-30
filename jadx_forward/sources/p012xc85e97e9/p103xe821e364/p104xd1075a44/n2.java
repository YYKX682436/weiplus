package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public abstract class n2 {

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.l2 f93699a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f93700b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public long f93701c = 120;

    /* renamed from: d, reason: collision with root package name */
    public long f93702d = 120;

    /* renamed from: e, reason: collision with root package name */
    public long f93703e = 250;

    /* renamed from: f, reason: collision with root package name */
    public long f93704f = 250;

    public static int e(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        int i17 = k3Var.f3640xbe0d3a1a & 14;
        if (k3Var.m8193x5241396d()) {
            return 4;
        }
        if ((i17 & 4) != 0) {
            return i17;
        }
        int m8187x9323db3a = k3Var.m8187x9323db3a();
        int m8183xf806b362 = k3Var.m8183xf806b362();
        return (m8187x9323db3a == -1 || m8183xf806b362 == -1 || m8187x9323db3a == m8183xf806b362) ? i17 : i17 | 2048;
    }

    public abstract boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2);

    public abstract boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2);

    public abstract boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2);

    public abstract boolean d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var2);

    public abstract boolean f(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var);

    public boolean g(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.util.List list) {
        return f(k3Var);
    }

    public final void h(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        q(k3Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.l2 l2Var = this.f93699a;
        if (l2Var != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.o2 o2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.o2) l2Var;
            boolean z17 = true;
            k3Var.m8206x3c5056b8(true);
            if (k3Var.f3653x74cdf618 != null && k3Var.f3654xaa505ae1 == null) {
                k3Var.f3653x74cdf618 = null;
            }
            k3Var.f3654xaa505ae1 = null;
            if (k3Var.m8208x20b73616()) {
                return;
            }
            android.view.View view = k3Var.f3639x46306858;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = o2Var.f93714a;
            c1163xf1deaba4.d1();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.o oVar = c1163xf1deaba4.f93424h;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) oVar.f93705a;
            int indexOfChild = d2Var.f93532a.indexOfChild(view);
            if (indexOfChild == -1) {
                oVar.m(view);
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.m mVar = oVar.f93706b;
                if (mVar.d(indexOfChild)) {
                    mVar.f(indexOfChild);
                    oVar.m(view);
                    d2Var.b(indexOfChild);
                } else {
                    z17 = false;
                }
            }
            if (z17) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
                c1163xf1deaba4.f93421e.n(x07);
                c1163xf1deaba4.f93421e.j(x07);
            }
            c1163xf1deaba4.e1(!z17);
            if (z17 || !k3Var.m8197x46e8461f()) {
                return;
            }
            c1163xf1deaba4.removeDetachedView(k3Var.f3639x46306858, false);
        }
    }

    public final void i() {
        java.util.ArrayList arrayList = this.f93700b;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k2) arrayList.get(i17)).a();
        }
        arrayList.clear();
    }

    public abstract void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var);

    public abstract void k();

    public long l() {
        return n();
    }

    public long m() {
        return this.f93701c;
    }

    public long n() {
        return this.f93702d;
    }

    public abstract boolean o();

    public final boolean p(p012xc85e97e9.p103xe821e364.p104xd1075a44.k2 k2Var) {
        boolean o17 = o();
        if (k2Var != null) {
            if (o17) {
                this.f93700b.add(k2Var);
            } else {
                k2Var.a();
            }
        }
        return o17;
    }

    public void q(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 r(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.m2();
        m2Var.a(k3Var, 0);
        return m2Var;
    }

    public abstract void s();
}

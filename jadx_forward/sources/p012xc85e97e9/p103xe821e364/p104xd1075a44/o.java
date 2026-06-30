package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.n f93705a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.m f93706b = new p012xc85e97e9.p103xe821e364.p104xd1075a44.m();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f93707c = new java.util.ArrayList();

    public o(p012xc85e97e9.p103xe821e364.p104xd1075a44.n nVar) {
        this.f93705a = nVar;
    }

    public void a(android.view.View view, int i17, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n nVar = this.f93705a;
        int a17 = i17 < 0 ? ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) nVar).a() : f(i17);
        this.f93706b.e(a17, z17);
        if (z17) {
            i(view);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) nVar).f93532a;
        c1163xf1deaba4.addView(view, a17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = c1163xf1deaba4.f93434r;
        if (f2Var != null && x07 != null) {
            f2Var.mo8160xd8bfd53(x07);
        }
        java.util.List list = c1163xf1deaba4.H;
        if (list == null) {
            return;
        }
        int size = ((java.util.ArrayList) list).size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a) ((java.util.ArrayList) c1163xf1deaba4.H).get(size)).R3(view);
            }
        }
    }

    public void b(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n nVar = this.f93705a;
        int a17 = i17 < 0 ? ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) nVar).a() : f(i17);
        this.f93706b.e(a17, z17);
        if (z17) {
            i(view);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) nVar;
        d2Var.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = d2Var.f93532a;
        if (x07 != null) {
            if (!x07.m8197x46e8461f() && !x07.m8209xa033ad65()) {
                throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + x07 + c1163xf1deaba4.i0());
            }
            x07.m8180x87c8d4c9();
        }
        c1163xf1deaba4.attachViewToParent(view, a17, layoutParams);
    }

    public void c(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07;
        int f17 = f(i17);
        this.f93706b.f(f17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a;
        android.view.View childAt = d2Var.f93532a.getChildAt(f17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = d2Var.f93532a;
        if (childAt != null && (x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(childAt)) != null) {
            if (x07.m8197x46e8461f() && !x07.m8209xa033ad65()) {
                throw new java.lang.IllegalArgumentException("called detach on an already detached child " + x07 + c1163xf1deaba4.i0());
            }
            x07.m8176xb4f2c266(256);
        }
        c1163xf1deaba4.detachViewFromParent(f17);
    }

    public android.view.View d(int i17) {
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a).f93532a.getChildAt(f(i17));
    }

    public int e() {
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a).a() - ((java.util.ArrayList) this.f93707c).size();
    }

    public final int f(int i17) {
        if (i17 < 0) {
            return -1;
        }
        int a17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a).a();
        int i18 = i17;
        while (i18 < a17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.m mVar = this.f93706b;
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
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a).f93532a.getChildAt(i17);
    }

    public int h() {
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a).a();
    }

    public final void i(android.view.View view) {
        ((java.util.ArrayList) this.f93707c).add(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a;
        d2Var.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
        if (x07 != null) {
            x07.m8201xfca98b4f(d2Var.f93532a);
        }
    }

    public int j(android.view.View view) {
        int indexOfChild = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a).f93532a.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m mVar = this.f93706b;
        if (mVar.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - mVar.b(indexOfChild);
    }

    public boolean k(android.view.View view) {
        return ((java.util.ArrayList) this.f93707c).contains(view);
    }

    public void l(int i17) {
        int f17 = f(i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a;
        android.view.View childAt = d2Var.f93532a.getChildAt(f17);
        if (childAt == null) {
            return;
        }
        if (this.f93706b.f(f17)) {
            m(childAt);
        }
        d2Var.b(f17);
    }

    public final boolean m(android.view.View view) {
        if (!((java.util.ArrayList) this.f93707c).remove(view)) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d2 d2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.d2) this.f93705a;
        d2Var.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(view);
        if (x07 == null) {
            return true;
        }
        x07.m8202x65210ea1(d2Var.f93532a);
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m8216x9616526c() {
        return this.f93706b.m8214x9616526c() + ", hidden list:" + ((java.util.ArrayList) this.f93707c).size();
    }
}

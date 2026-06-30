package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f11420a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f11421b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f11422c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f11423d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11424e = false;

    public n3(android.view.ViewGroup viewGroup) {
        this.f11420a = viewGroup;
    }

    public static androidx.fragment.app.n3 f(android.view.ViewGroup viewGroup, androidx.fragment.app.FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.getSpecialEffectsControllerFactory());
    }

    public static androidx.fragment.app.n3 g(android.view.ViewGroup viewGroup, androidx.fragment.app.o3 o3Var) {
        java.lang.Object tag = viewGroup.getTag(com.tencent.mm.R.id.nem);
        if (tag instanceof androidx.fragment.app.n3) {
            return (androidx.fragment.app.n3) tag;
        }
        ((androidx.fragment.app.f1) o3Var).getClass();
        androidx.fragment.app.p pVar = new androidx.fragment.app.p(viewGroup);
        viewGroup.setTag(com.tencent.mm.R.id.nem, pVar);
        return pVar;
    }

    public final void a(androidx.fragment.app.l3 l3Var, androidx.fragment.app.k3 k3Var, androidx.fragment.app.d2 d2Var) {
        synchronized (this.f11421b) {
            j3.h hVar = new j3.h();
            androidx.fragment.app.m3 d17 = d(d2Var.f11304c);
            if (d17 != null) {
                d17.c(l3Var, k3Var);
                return;
            }
            androidx.fragment.app.i3 i3Var = new androidx.fragment.app.i3(l3Var, k3Var, d2Var, hVar);
            this.f11421b.add(i3Var);
            ((java.util.ArrayList) i3Var.f11403d).add(new androidx.fragment.app.g3(this, i3Var));
            ((java.util.ArrayList) i3Var.f11403d).add(new androidx.fragment.app.h3(this, i3Var));
        }
    }

    public abstract void b(java.util.List list, boolean z17);

    public void c() {
        if (this.f11424e) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f11420a;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.b(viewGroup)) {
            e();
            this.f11423d = false;
            return;
        }
        synchronized (this.f11421b) {
            if (!this.f11421b.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f11422c);
                this.f11422c.clear();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.m3 m3Var = (androidx.fragment.app.m3) it.next();
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        java.util.Objects.toString(m3Var);
                    }
                    m3Var.a();
                    if (!m3Var.f11406g) {
                        this.f11422c.add(m3Var);
                    }
                }
                i();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f11421b);
                this.f11421b.clear();
                this.f11422c.addAll(arrayList2);
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    ((androidx.fragment.app.m3) it6.next()).d();
                }
                b(arrayList2, this.f11423d);
                this.f11423d = false;
            }
        }
    }

    public final androidx.fragment.app.m3 d(androidx.fragment.app.Fragment fragment) {
        java.util.Iterator it = this.f11421b.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.m3 m3Var = (androidx.fragment.app.m3) it.next();
            if (m3Var.f11402c.equals(fragment) && !m3Var.f11405f) {
                return m3Var;
            }
        }
        return null;
    }

    public void e() {
        android.view.ViewGroup viewGroup = this.f11420a;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean b17 = n3.x0.b(viewGroup);
        synchronized (this.f11421b) {
            i();
            java.util.Iterator it = this.f11421b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.m3) it.next()).d();
            }
            java.util.Iterator it6 = new java.util.ArrayList(this.f11422c).iterator();
            while (it6.hasNext()) {
                androidx.fragment.app.m3 m3Var = (androidx.fragment.app.m3) it6.next();
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    if (!b17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("Container ");
                        sb6.append(this.f11420a);
                        sb6.append(" is not attached to window. ");
                    }
                    java.util.Objects.toString(m3Var);
                }
                m3Var.a();
            }
            java.util.Iterator it7 = new java.util.ArrayList(this.f11421b).iterator();
            while (it7.hasNext()) {
                androidx.fragment.app.m3 m3Var2 = (androidx.fragment.app.m3) it7.next();
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    if (!b17) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("Container ");
                        sb7.append(this.f11420a);
                        sb7.append(" is not attached to window. ");
                    }
                    java.util.Objects.toString(m3Var2);
                }
                m3Var2.a();
            }
        }
    }

    public void h() {
        synchronized (this.f11421b) {
            i();
            this.f11424e = false;
            int size = this.f11421b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                androidx.fragment.app.m3 m3Var = (androidx.fragment.app.m3) this.f11421b.get(size);
                androidx.fragment.app.l3 d17 = androidx.fragment.app.l3.d(m3Var.f11402c.mView);
                androidx.fragment.app.l3 l3Var = m3Var.f11400a;
                androidx.fragment.app.l3 l3Var2 = androidx.fragment.app.l3.VISIBLE;
                if (l3Var == l3Var2 && d17 != l3Var2) {
                    this.f11424e = m3Var.f11402c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        java.util.Iterator it = this.f11421b.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.m3 m3Var = (androidx.fragment.app.m3) it.next();
            if (m3Var.f11401b == androidx.fragment.app.k3.ADDING) {
                m3Var.c(androidx.fragment.app.l3.b(m3Var.f11402c.requireView().getVisibility()), androidx.fragment.app.k3.NONE);
            }
        }
    }
}

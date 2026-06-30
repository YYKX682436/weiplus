package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f92953a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f92954b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f92955c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f92956d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f92957e = false;

    public n3(android.view.ViewGroup viewGroup) {
        this.f92953a = viewGroup;
    }

    public static p012xc85e97e9.p087x9da2e250.app.n3 f(android.view.ViewGroup viewGroup, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        return g(viewGroup, abstractC1104xc1ad431d.m7681xbcf8108f());
    }

    public static p012xc85e97e9.p087x9da2e250.app.n3 g(android.view.ViewGroup viewGroup, p012xc85e97e9.p087x9da2e250.app.o3 o3Var) {
        java.lang.Object tag = viewGroup.getTag(com.p314xaae8f345.mm.R.id.nem);
        if (tag instanceof p012xc85e97e9.p087x9da2e250.app.n3) {
            return (p012xc85e97e9.p087x9da2e250.app.n3) tag;
        }
        ((p012xc85e97e9.p087x9da2e250.app.f1) o3Var).getClass();
        p012xc85e97e9.p087x9da2e250.app.p pVar = new p012xc85e97e9.p087x9da2e250.app.p(viewGroup);
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.nem, pVar);
        return pVar;
    }

    public final void a(p012xc85e97e9.p087x9da2e250.app.l3 l3Var, p012xc85e97e9.p087x9da2e250.app.k3 k3Var, p012xc85e97e9.p087x9da2e250.app.d2 d2Var) {
        synchronized (this.f92954b) {
            j3.h hVar = new j3.h();
            p012xc85e97e9.p087x9da2e250.app.m3 d17 = d(d2Var.f92837c);
            if (d17 != null) {
                d17.c(l3Var, k3Var);
                return;
            }
            p012xc85e97e9.p087x9da2e250.app.i3 i3Var = new p012xc85e97e9.p087x9da2e250.app.i3(l3Var, k3Var, d2Var, hVar);
            this.f92954b.add(i3Var);
            ((java.util.ArrayList) i3Var.f92936d).add(new p012xc85e97e9.p087x9da2e250.app.g3(this, i3Var));
            ((java.util.ArrayList) i3Var.f92936d).add(new p012xc85e97e9.p087x9da2e250.app.h3(this, i3Var));
        }
    }

    public abstract void b(java.util.List list, boolean z17);

    public void c() {
        if (this.f92957e) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f92953a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.b(viewGroup)) {
            e();
            this.f92956d = false;
            return;
        }
        synchronized (this.f92954b) {
            if (!this.f92954b.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f92955c);
                this.f92955c.clear();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    p012xc85e97e9.p087x9da2e250.app.m3 m3Var = (p012xc85e97e9.p087x9da2e250.app.m3) it.next();
                    if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                        java.util.Objects.toString(m3Var);
                    }
                    m3Var.a();
                    if (!m3Var.f92939g) {
                        this.f92955c.add(m3Var);
                    }
                }
                i();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f92954b);
                this.f92954b.clear();
                this.f92955c.addAll(arrayList2);
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    ((p012xc85e97e9.p087x9da2e250.app.m3) it6.next()).d();
                }
                b(arrayList2, this.f92956d);
                this.f92956d = false;
            }
        }
    }

    public final p012xc85e97e9.p087x9da2e250.app.m3 d(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        java.util.Iterator it = this.f92954b.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var = (p012xc85e97e9.p087x9da2e250.app.m3) it.next();
            if (m3Var.f92935c.m7427xb2c87fbf(componentCallbacksC1101xa17d4670) && !m3Var.f92938f) {
                return m3Var;
            }
        }
        return null;
    }

    public void e() {
        android.view.ViewGroup viewGroup = this.f92953a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean b17 = n3.x0.b(viewGroup);
        synchronized (this.f92954b) {
            i();
            java.util.Iterator it = this.f92954b.iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p087x9da2e250.app.m3) it.next()).d();
            }
            java.util.Iterator it6 = new java.util.ArrayList(this.f92955c).iterator();
            while (it6.hasNext()) {
                p012xc85e97e9.p087x9da2e250.app.m3 m3Var = (p012xc85e97e9.p087x9da2e250.app.m3) it6.next();
                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                    if (!b17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("Container ");
                        sb6.append(this.f92953a);
                        sb6.append(" is not attached to window. ");
                    }
                    java.util.Objects.toString(m3Var);
                }
                m3Var.a();
            }
            java.util.Iterator it7 = new java.util.ArrayList(this.f92954b).iterator();
            while (it7.hasNext()) {
                p012xc85e97e9.p087x9da2e250.app.m3 m3Var2 = (p012xc85e97e9.p087x9da2e250.app.m3) it7.next();
                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                    if (!b17) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("Container ");
                        sb7.append(this.f92953a);
                        sb7.append(" is not attached to window. ");
                    }
                    java.util.Objects.toString(m3Var2);
                }
                m3Var2.a();
            }
        }
    }

    public void h() {
        synchronized (this.f92954b) {
            i();
            this.f92957e = false;
            int size = this.f92954b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                p012xc85e97e9.p087x9da2e250.app.m3 m3Var = (p012xc85e97e9.p087x9da2e250.app.m3) this.f92954b.get(size);
                p012xc85e97e9.p087x9da2e250.app.l3 d17 = p012xc85e97e9.p087x9da2e250.app.l3.d(m3Var.f92935c.f3462x628b0b2);
                p012xc85e97e9.p087x9da2e250.app.l3 l3Var = m3Var.f92933a;
                p012xc85e97e9.p087x9da2e250.app.l3 l3Var2 = p012xc85e97e9.p087x9da2e250.app.l3.VISIBLE;
                if (l3Var == l3Var2 && d17 != l3Var2) {
                    this.f92957e = m3Var.f92935c.m7488xbe8d7484();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        java.util.Iterator it = this.f92954b.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.m3 m3Var = (p012xc85e97e9.p087x9da2e250.app.m3) it.next();
            if (m3Var.f92934b == p012xc85e97e9.p087x9da2e250.app.k3.ADDING) {
                m3Var.c(p012xc85e97e9.p087x9da2e250.app.l3.b(m3Var.f92935c.m7554x159e75aa().getVisibility()), p012xc85e97e9.p087x9da2e250.app.k3.NONE);
            }
        }
    }
}

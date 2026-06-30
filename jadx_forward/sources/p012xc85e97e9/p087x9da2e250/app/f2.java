package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f92845a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f92846b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.w1 f92847c;

    public void a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (this.f92845a.contains(componentCallbacksC1101xa17d4670)) {
            throw new java.lang.IllegalStateException("Fragment already added: " + componentCallbacksC1101xa17d4670);
        }
        synchronized (this.f92845a) {
            this.f92845a.add(componentCallbacksC1101xa17d4670);
        }
        componentCallbacksC1101xa17d4670.f3414xbdc32c93 = true;
    }

    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 b(java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.d2 d2Var = (p012xc85e97e9.p087x9da2e250.app.d2) this.f92846b.get(str);
        if (d2Var != null) {
            return d2Var.f92837c;
        }
        return null;
    }

    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 c(java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7428x7a44823e;
        for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var : this.f92846b.values()) {
            if (d2Var != null && (m7428x7a44823e = d2Var.f92837c.m7428x7a44823e(str)) != null) {
                return m7428x7a44823e;
            }
        }
        return null;
    }

    public java.util.List d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var : this.f92846b.values()) {
            if (d2Var != null) {
                arrayList.add(d2Var);
            }
        }
        return arrayList;
    }

    public java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p087x9da2e250.app.d2 d2Var : this.f92846b.values()) {
            if (d2Var != null) {
                arrayList.add(d2Var.f92837c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public java.util.List f() {
        java.util.ArrayList arrayList;
        if (this.f92845a.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.f92845a) {
            arrayList = new java.util.ArrayList(this.f92845a);
        }
        return arrayList;
    }

    public void g(p012xc85e97e9.p087x9da2e250.app.d2 d2Var) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
        java.lang.String str = componentCallbacksC1101xa17d4670.f3465x32e011;
        java.util.HashMap hashMap = this.f92846b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(componentCallbacksC1101xa17d4670.f3465x32e011, d2Var);
        if (componentCallbacksC1101xa17d4670.f3450xe2089496) {
            if (componentCallbacksC1101xa17d4670.f3449xa8c71e87) {
                this.f92847c.N6(componentCallbacksC1101xa17d4670);
            } else {
                this.f92847c.P6(componentCallbacksC1101xa17d4670);
            }
            componentCallbacksC1101xa17d4670.f3450xe2089496 = false;
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            componentCallbacksC1101xa17d4670.mo7591x9616526c();
        }
    }

    public void h(p012xc85e97e9.p087x9da2e250.app.d2 d2Var) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = d2Var.f92837c;
        if (componentCallbacksC1101xa17d4670.f3449xa8c71e87) {
            this.f92847c.P6(componentCallbacksC1101xa17d4670);
        }
        if (((p012xc85e97e9.p087x9da2e250.app.d2) this.f92846b.put(componentCallbacksC1101xa17d4670.f3465x32e011, null)) != null && p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            componentCallbacksC1101xa17d4670.mo7591x9616526c();
        }
    }
}

package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class m3 {

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.l3 f92933a;

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.k3 f92934b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92935c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f92936d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f92937e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public boolean f92938f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92939g = false;

    public m3(p012xc85e97e9.p087x9da2e250.app.l3 l3Var, p012xc85e97e9.p087x9da2e250.app.k3 k3Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, j3.h hVar) {
        this.f92933a = l3Var;
        this.f92934b = k3Var;
        this.f92935c = componentCallbacksC1101xa17d4670;
        hVar.b(new p012xc85e97e9.p087x9da2e250.app.j3(this));
    }

    public final void a() {
        if (this.f92938f) {
            return;
        }
        this.f92938f = true;
        java.util.HashSet hashSet = this.f92937e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((j3.h) it.next()).a();
        }
    }

    public abstract void b();

    public final void c(p012xc85e97e9.p087x9da2e250.app.l3 l3Var, p012xc85e97e9.p087x9da2e250.app.k3 k3Var) {
        int ordinal = k3Var.ordinal();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92935c;
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var2 = p012xc85e97e9.p087x9da2e250.app.l3.REMOVED;
        if (ordinal == 0) {
            if (this.f92933a != l3Var2) {
                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                    java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                    java.util.Objects.toString(this.f92933a);
                    java.util.Objects.toString(l3Var);
                }
                this.f92933a = l3Var;
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (this.f92933a == l3Var2) {
                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                    java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                    java.util.Objects.toString(this.f92934b);
                }
                this.f92933a = p012xc85e97e9.p087x9da2e250.app.l3.VISIBLE;
                this.f92934b = p012xc85e97e9.p087x9da2e250.app.k3.ADDING;
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
            java.util.Objects.toString(this.f92933a);
            java.util.Objects.toString(this.f92934b);
        }
        this.f92933a = l3Var2;
        this.f92934b = p012xc85e97e9.p087x9da2e250.app.k3.REMOVING;
    }

    public abstract void d();

    /* renamed from: toString */
    public java.lang.String m7756x9616526c() {
        return "Operation {" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "} {mFinalState = " + this.f92933a + "} {mLifecycleImpact = " + this.f92934b + "} {mFragment = " + this.f92935c + "}";
    }
}

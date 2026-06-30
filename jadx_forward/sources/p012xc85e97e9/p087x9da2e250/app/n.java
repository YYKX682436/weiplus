package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.m3 f92940a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.h f92941b;

    public n(p012xc85e97e9.p087x9da2e250.app.m3 m3Var, j3.h hVar) {
        this.f92940a = m3Var;
        this.f92941b = hVar;
    }

    public void a() {
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var = this.f92940a;
        java.util.HashSet hashSet = m3Var.f92937e;
        if (hashSet.remove(this.f92941b) && hashSet.isEmpty()) {
            m3Var.b();
        }
    }

    public boolean b() {
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var;
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var = this.f92940a;
        p012xc85e97e9.p087x9da2e250.app.l3 d17 = p012xc85e97e9.p087x9da2e250.app.l3.d(m3Var.f92935c.f3462x628b0b2);
        p012xc85e97e9.p087x9da2e250.app.l3 l3Var2 = m3Var.f92933a;
        return d17 == l3Var2 || !(d17 == (l3Var = p012xc85e97e9.p087x9da2e250.app.l3.VISIBLE) || l3Var2 == l3Var);
    }
}

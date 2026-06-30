package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.m3 f11407a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.h f11408b;

    public n(androidx.fragment.app.m3 m3Var, j3.h hVar) {
        this.f11407a = m3Var;
        this.f11408b = hVar;
    }

    public void a() {
        androidx.fragment.app.m3 m3Var = this.f11407a;
        java.util.HashSet hashSet = m3Var.f11404e;
        if (hashSet.remove(this.f11408b) && hashSet.isEmpty()) {
            m3Var.b();
        }
    }

    public boolean b() {
        androidx.fragment.app.l3 l3Var;
        androidx.fragment.app.m3 m3Var = this.f11407a;
        androidx.fragment.app.l3 d17 = androidx.fragment.app.l3.d(m3Var.f11402c.mView);
        androidx.fragment.app.l3 l3Var2 = m3Var.f11400a;
        return d17 == l3Var2 || !(d17 == (l3Var = androidx.fragment.app.l3.VISIBLE) || l3Var2 == l3Var);
    }
}

package androidx.fragment.app;

/* loaded from: classes14.dex */
public abstract class m3 {

    /* renamed from: a, reason: collision with root package name */
    public androidx.fragment.app.l3 f11400a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.fragment.app.k3 f11401b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f11402c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f11403d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f11404e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public boolean f11405f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11406g = false;

    public m3(androidx.fragment.app.l3 l3Var, androidx.fragment.app.k3 k3Var, androidx.fragment.app.Fragment fragment, j3.h hVar) {
        this.f11400a = l3Var;
        this.f11401b = k3Var;
        this.f11402c = fragment;
        hVar.b(new androidx.fragment.app.j3(this));
    }

    public final void a() {
        if (this.f11405f) {
            return;
        }
        this.f11405f = true;
        java.util.HashSet hashSet = this.f11404e;
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

    public final void c(androidx.fragment.app.l3 l3Var, androidx.fragment.app.k3 k3Var) {
        int ordinal = k3Var.ordinal();
        androidx.fragment.app.Fragment fragment = this.f11402c;
        androidx.fragment.app.l3 l3Var2 = androidx.fragment.app.l3.REMOVED;
        if (ordinal == 0) {
            if (this.f11400a != l3Var2) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    java.util.Objects.toString(fragment);
                    java.util.Objects.toString(this.f11400a);
                    java.util.Objects.toString(l3Var);
                }
                this.f11400a = l3Var;
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (this.f11400a == l3Var2) {
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    java.util.Objects.toString(fragment);
                    java.util.Objects.toString(this.f11401b);
                }
                this.f11400a = androidx.fragment.app.l3.VISIBLE;
                this.f11401b = androidx.fragment.app.k3.ADDING;
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            java.util.Objects.toString(fragment);
            java.util.Objects.toString(this.f11400a);
            java.util.Objects.toString(this.f11401b);
        }
        this.f11400a = l3Var2;
        this.f11401b = androidx.fragment.app.k3.REMOVING;
    }

    public abstract void d();

    public java.lang.String toString() {
        return "Operation {" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "} {mFinalState = " + this.f11400a + "} {mLifecycleImpact = " + this.f11401b + "} {mFragment = " + this.f11402c + "}";
    }
}

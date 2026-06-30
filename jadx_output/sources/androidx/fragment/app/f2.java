package androidx.fragment.app;

/* loaded from: classes14.dex */
public class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f11312a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f11313b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.w1 f11314c;

    public void a(androidx.fragment.app.Fragment fragment) {
        if (this.f11312a.contains(fragment)) {
            throw new java.lang.IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f11312a) {
            this.f11312a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public androidx.fragment.app.Fragment b(java.lang.String str) {
        androidx.fragment.app.d2 d2Var = (androidx.fragment.app.d2) this.f11313b.get(str);
        if (d2Var != null) {
            return d2Var.f11304c;
        }
        return null;
    }

    public androidx.fragment.app.Fragment c(java.lang.String str) {
        androidx.fragment.app.Fragment findFragmentByWho;
        for (androidx.fragment.app.d2 d2Var : this.f11313b.values()) {
            if (d2Var != null && (findFragmentByWho = d2Var.f11304c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public java.util.List d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.d2 d2Var : this.f11313b.values()) {
            if (d2Var != null) {
                arrayList.add(d2Var);
            }
        }
        return arrayList;
    }

    public java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.d2 d2Var : this.f11313b.values()) {
            if (d2Var != null) {
                arrayList.add(d2Var.f11304c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public java.util.List f() {
        java.util.ArrayList arrayList;
        if (this.f11312a.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.f11312a) {
            arrayList = new java.util.ArrayList(this.f11312a);
        }
        return arrayList;
    }

    public void g(androidx.fragment.app.d2 d2Var) {
        androidx.fragment.app.Fragment fragment = d2Var.f11304c;
        java.lang.String str = fragment.mWho;
        java.util.HashMap hashMap = this.f11313b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(fragment.mWho, d2Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f11314c.N6(fragment);
            } else {
                this.f11314c.P6(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }

    public void h(androidx.fragment.app.d2 d2Var) {
        androidx.fragment.app.Fragment fragment = d2Var.f11304c;
        if (fragment.mRetainInstance) {
            this.f11314c.P6(fragment);
        }
        if (((androidx.fragment.app.d2) this.f11313b.put(fragment.mWho, null)) != null && androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }
}

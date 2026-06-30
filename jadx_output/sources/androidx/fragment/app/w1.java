package androidx.fragment.app;

/* loaded from: classes14.dex */
public final class w1 extends androidx.lifecycle.c1 {

    /* renamed from: n, reason: collision with root package name */
    public static final androidx.lifecycle.f1 f11501n = new androidx.fragment.app.v1();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11505g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f11502d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f11503e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f11504f = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f11506h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11507i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11508m = false;

    public w1(boolean z17) {
        this.f11505g = z17;
    }

    public void N6(androidx.fragment.app.Fragment fragment) {
        if (this.f11508m) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            return;
        }
        java.util.HashMap hashMap = this.f11502d;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }

    public androidx.fragment.app.t1 O6() {
        java.util.HashMap hashMap = this.f11502d;
        boolean isEmpty = hashMap.isEmpty();
        java.util.HashMap hashMap2 = this.f11503e;
        java.util.HashMap hashMap3 = this.f11504f;
        if (isEmpty && hashMap2.isEmpty() && hashMap3.isEmpty()) {
            return null;
        }
        java.util.HashMap hashMap4 = new java.util.HashMap();
        for (java.util.Map.Entry entry : hashMap2.entrySet()) {
            androidx.fragment.app.t1 O6 = ((androidx.fragment.app.w1) entry.getValue()).O6();
            if (O6 != null) {
                hashMap4.put(entry.getKey(), O6);
            }
        }
        this.f11507i = true;
        if (hashMap.isEmpty() && hashMap4.isEmpty() && hashMap3.isEmpty()) {
            return null;
        }
        return new androidx.fragment.app.t1(new java.util.ArrayList(hashMap.values()), hashMap4, new java.util.HashMap(hashMap3));
    }

    public void P6(androidx.fragment.app.Fragment fragment) {
        if (this.f11508m) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            return;
        }
        if ((this.f11502d.remove(fragment.mWho) != null) && androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            fragment.toString();
        }
    }

    public void Q6(androidx.fragment.app.t1 t1Var) {
        java.util.HashMap hashMap = this.f11502d;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f11503e;
        hashMap2.clear();
        java.util.HashMap hashMap3 = this.f11504f;
        hashMap3.clear();
        if (t1Var != null) {
            java.util.Collection<androidx.fragment.app.Fragment> collection = t1Var.f11477a;
            if (collection != null) {
                for (androidx.fragment.app.Fragment fragment : collection) {
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
            java.util.Map map = t1Var.f11478b;
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    androidx.fragment.app.w1 w1Var = new androidx.fragment.app.w1(this.f11505g);
                    w1Var.Q6((androidx.fragment.app.t1) entry.getValue());
                    hashMap2.put(entry.getKey(), w1Var);
                }
            }
            java.util.Map map2 = t1Var.f11479c;
            if (map2 != null) {
                hashMap3.putAll(map2);
            }
        }
        this.f11507i = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.fragment.app.w1.class != obj.getClass()) {
            return false;
        }
        androidx.fragment.app.w1 w1Var = (androidx.fragment.app.w1) obj;
        return this.f11502d.equals(w1Var.f11502d) && this.f11503e.equals(w1Var.f11503e) && this.f11504f.equals(w1Var.f11504f);
    }

    public int hashCode() {
        return (((this.f11502d.hashCode() * 31) + this.f11503e.hashCode()) * 31) + this.f11504f.hashCode();
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            toString();
        }
        this.f11506h = true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append("} Fragments (");
        java.util.Iterator it = this.f11502d.values().iterator();
        while (it.hasNext()) {
            sb6.append(it.next());
            if (it.hasNext()) {
                sb6.append(", ");
            }
        }
        sb6.append(") Child Non Config (");
        java.util.Iterator it6 = this.f11503e.keySet().iterator();
        while (it6.hasNext()) {
            sb6.append((java.lang.String) it6.next());
            if (it6.hasNext()) {
                sb6.append(", ");
            }
        }
        sb6.append(") ViewModelStores (");
        java.util.Iterator it7 = this.f11504f.keySet().iterator();
        while (it7.hasNext()) {
            sb6.append((java.lang.String) it7.next());
            if (it7.hasNext()) {
                sb6.append(", ");
            }
        }
        sb6.append(')');
        return sb6.toString();
    }
}

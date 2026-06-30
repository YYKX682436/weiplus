package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public final class w1 extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: n, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.f1 f93034n = new p012xc85e97e9.p087x9da2e250.app.v1();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93038g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f93035d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f93036e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f93037f = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f93039h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93040i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f93041m = false;

    public w1(boolean z17) {
        this.f93038g = z17;
    }

    public void N6(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (this.f93041m) {
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2);
            return;
        }
        java.util.HashMap hashMap = this.f93035d;
        if (hashMap.containsKey(componentCallbacksC1101xa17d4670.f3465x32e011)) {
            return;
        }
        hashMap.put(componentCallbacksC1101xa17d4670.f3465x32e011, componentCallbacksC1101xa17d4670);
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            componentCallbacksC1101xa17d4670.mo7591x9616526c();
        }
    }

    public p012xc85e97e9.p087x9da2e250.app.t1 O6() {
        java.util.HashMap hashMap = this.f93035d;
        boolean isEmpty = hashMap.isEmpty();
        java.util.HashMap hashMap2 = this.f93036e;
        java.util.HashMap hashMap3 = this.f93037f;
        if (isEmpty && hashMap2.isEmpty() && hashMap3.isEmpty()) {
            return null;
        }
        java.util.HashMap hashMap4 = new java.util.HashMap();
        for (java.util.Map.Entry entry : hashMap2.entrySet()) {
            p012xc85e97e9.p087x9da2e250.app.t1 O6 = ((p012xc85e97e9.p087x9da2e250.app.w1) entry.getValue()).O6();
            if (O6 != null) {
                hashMap4.put(entry.getKey(), O6);
            }
        }
        this.f93040i = true;
        if (hashMap.isEmpty() && hashMap4.isEmpty() && hashMap3.isEmpty()) {
            return null;
        }
        return new p012xc85e97e9.p087x9da2e250.app.t1(new java.util.ArrayList(hashMap.values()), hashMap4, new java.util.HashMap(hashMap3));
    }

    public void P6(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (this.f93041m) {
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2);
            return;
        }
        if ((this.f93035d.remove(componentCallbacksC1101xa17d4670.f3465x32e011) != null) && p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            componentCallbacksC1101xa17d4670.mo7591x9616526c();
        }
    }

    public void Q6(p012xc85e97e9.p087x9da2e250.app.t1 t1Var) {
        java.util.HashMap hashMap = this.f93035d;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f93036e;
        hashMap2.clear();
        java.util.HashMap hashMap3 = this.f93037f;
        hashMap3.clear();
        if (t1Var != null) {
            java.util.Collection<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> collection = t1Var.f93010a;
            if (collection != null) {
                for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : collection) {
                    if (componentCallbacksC1101xa17d4670 != null) {
                        hashMap.put(componentCallbacksC1101xa17d4670.f3465x32e011, componentCallbacksC1101xa17d4670);
                    }
                }
            }
            java.util.Map map = t1Var.f93011b;
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    p012xc85e97e9.p087x9da2e250.app.w1 w1Var = new p012xc85e97e9.p087x9da2e250.app.w1(this.f93038g);
                    w1Var.Q6((p012xc85e97e9.p087x9da2e250.app.t1) entry.getValue());
                    hashMap2.put(entry.getKey(), w1Var);
                }
            }
            java.util.Map map2 = t1Var.f93012c;
            if (map2 != null) {
                hashMap3.putAll(map2);
            }
        }
        this.f93040i = false;
    }

    /* renamed from: equals */
    public boolean m7761xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p012xc85e97e9.p087x9da2e250.app.w1.class != obj.getClass()) {
            return false;
        }
        p012xc85e97e9.p087x9da2e250.app.w1 w1Var = (p012xc85e97e9.p087x9da2e250.app.w1) obj;
        return this.f93035d.equals(w1Var.f93035d) && this.f93036e.equals(w1Var.f93036e) && this.f93037f.equals(w1Var.f93037f);
    }

    /* renamed from: hashCode */
    public int m7762x8cdac1b() {
        return (((this.f93035d.hashCode() * 31) + this.f93036e.hashCode()) * 31) + this.f93037f.hashCode();
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
            m7763x9616526c();
        }
        this.f93039h = true;
    }

    /* renamed from: toString */
    public java.lang.String m7763x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append("} Fragments (");
        java.util.Iterator it = this.f93035d.values().iterator();
        while (it.hasNext()) {
            sb6.append(it.next());
            if (it.hasNext()) {
                sb6.append(", ");
            }
        }
        sb6.append(") Child Non Config (");
        java.util.Iterator it6 = this.f93036e.keySet().iterator();
        while (it6.hasNext()) {
            sb6.append((java.lang.String) it6.next());
            if (it6.hasNext()) {
                sb6.append(", ");
            }
        }
        sb6.append(") ViewModelStores (");
        java.util.Iterator it7 = this.f93037f.keySet().iterator();
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

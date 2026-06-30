package x6;

/* loaded from: classes13.dex */
public final class l implements x6.b {

    /* renamed from: a, reason: collision with root package name */
    public final x6.h f533690a = new x6.h();

    /* renamed from: b, reason: collision with root package name */
    public final x6.k f533691b = new x6.k();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f533692c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f533693d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f533694e;

    /* renamed from: f, reason: collision with root package name */
    public int f533695f;

    public l(int i17) {
        this.f533694e = i17;
    }

    public final void a(int i17, java.lang.Class cls) {
        java.util.NavigableMap f17 = f(cls);
        java.lang.Integer num = (java.lang.Integer) f17.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            if (num.intValue() == 1) {
                f17.remove(java.lang.Integer.valueOf(i17));
                return;
            } else {
                f17.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + i17 + ", this: " + this);
    }

    public final void b(int i17) {
        while (this.f533695f > i17) {
            java.lang.Object c17 = this.f533690a.c();
            q7.n.b(c17);
            x6.a d17 = d(c17.getClass());
            this.f533695f -= d17.a(c17) * d17.b();
            a(d17.a(c17), c17.getClass());
            if (android.util.Log.isLoggable(d17.mo175052xb5887064(), 2)) {
                d17.mo175052xb5887064();
                d17.a(c17);
            }
        }
    }

    public synchronized java.lang.Object c(int i17, java.lang.Class cls) {
        x6.j jVar;
        boolean z17;
        java.lang.Integer num = (java.lang.Integer) f(cls).ceilingKey(java.lang.Integer.valueOf(i17));
        boolean z18 = false;
        if (num != null) {
            int i18 = this.f533695f;
            if (i18 != 0 && this.f533694e / i18 < 2) {
                z17 = false;
                if (!z17 || num.intValue() <= i17 * 8) {
                    z18 = true;
                }
            }
            z17 = true;
            if (!z17) {
            }
            z18 = true;
        }
        if (z18) {
            x6.k kVar = this.f533691b;
            int intValue = num.intValue();
            jVar = (x6.j) kVar.b();
            jVar.f533688b = intValue;
            jVar.f533689c = cls;
        } else {
            x6.j jVar2 = (x6.j) this.f533691b.b();
            jVar2.f533688b = i17;
            jVar2.f533689c = cls;
            jVar = jVar2;
        }
        return e(jVar, cls);
    }

    public final x6.a d(java.lang.Class cls) {
        java.util.Map map = this.f533693d;
        x6.a aVar = (x6.a) ((java.util.HashMap) map).get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new x6.i();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new java.lang.IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                aVar = new x6.f();
            }
            ((java.util.HashMap) map).put(cls, aVar);
        }
        return aVar;
    }

    public final java.lang.Object e(x6.j jVar, java.lang.Class cls) {
        x6.a d17 = d(cls);
        java.lang.Object a17 = this.f533690a.a(jVar);
        if (a17 != null) {
            this.f533695f -= d17.a(a17) * d17.b();
            a(d17.a(a17), cls);
        }
        if (a17 != null) {
            return a17;
        }
        if (android.util.Log.isLoggable(d17.mo175052xb5887064(), 2)) {
            d17.mo175052xb5887064();
            int i17 = jVar.f533688b;
        }
        return d17.mo175053x5070dc99(jVar.f533688b);
    }

    public final java.util.NavigableMap f(java.lang.Class cls) {
        java.util.Map map = this.f533692c;
        java.util.NavigableMap navigableMap = (java.util.NavigableMap) ((java.util.HashMap) map).get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        ((java.util.HashMap) map).put(cls, treeMap);
        return treeMap;
    }

    public synchronized void g(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        x6.a d17 = d(cls);
        int a17 = d17.a(obj);
        int b17 = d17.b() * a17;
        int i17 = 1;
        if (b17 <= this.f533694e / 2) {
            x6.j jVar = (x6.j) this.f533691b.b();
            jVar.f533688b = a17;
            jVar.f533689c = cls;
            this.f533690a.b(jVar, obj);
            java.util.NavigableMap f17 = f(cls);
            java.lang.Integer num = (java.lang.Integer) f17.get(java.lang.Integer.valueOf(jVar.f533688b));
            java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.f533688b);
            if (num != null) {
                i17 = 1 + num.intValue();
            }
            f17.put(valueOf, java.lang.Integer.valueOf(i17));
            this.f533695f += b17;
            b(this.f533694e);
        }
    }
}

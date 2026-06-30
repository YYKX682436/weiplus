package nd;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedHashMap f417779a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f417780b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        f417779a = linkedHashMap;
        nd.a aVar = new nd.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Luggage", "plugin:[%s] installed", "luggage-core");
        linkedHashMap.put("luggage-core", aVar);
        f417780b = new java.util.HashMap();
    }

    public static nd.b a(java.lang.Class cls) {
        nd.b bVar;
        java.util.Map map;
        if (cls == null) {
            return null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48900x42891314();
        java.util.LinkedHashMap linkedHashMap = f417779a;
        java.util.ListIterator listIterator = new java.util.ArrayList(linkedHashMap.values()).listIterator(linkedHashMap.size());
        while (listIterator.hasPrevious()) {
            if (((nd.c) listIterator.previous()) != null && (map = nd.a.f417777a) != null && ((java.util.concurrent.ConcurrentHashMap) map).get(cls) != null) {
                return (nd.b) ((java.util.concurrent.ConcurrentHashMap) map).get(cls);
            }
        }
        if (i95.m.class.isAssignableFrom(cls)) {
            try {
                bVar = (nd.b) i95.n0.c(cls);
            } catch (java.lang.Exception unused) {
                bVar = null;
            }
            if (bVar != null) {
                return bVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Luggage", "no customize found for [%s]", cls.getCanonicalName());
        return null;
    }

    public static nd.d b(java.lang.Class cls) {
        java.util.Map map = f417780b;
        if (((java.util.HashMap) map).get(cls) != null) {
            return (nd.d) ((java.util.HashMap) map).get(cls);
        }
        nd.d dVar = (nd.d) java.lang.reflect.Proxy.newProxyInstance(nd.d.class.getClassLoader(), new java.lang.Class[]{cls}, new nd.e());
        ((java.util.HashMap) map).put(cls, dVar);
        return dVar;
    }

    public static nd.d c(java.lang.Class cls) {
        return d(cls, true);
    }

    public static nd.d d(java.lang.Class cls, boolean z17) {
        java.util.Map map;
        if (cls == null) {
            if (z17) {
                return b(cls);
            }
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = f417779a;
        java.util.ListIterator listIterator = new java.util.ArrayList(linkedHashMap.values()).listIterator(linkedHashMap.size());
        while (listIterator.hasPrevious()) {
            if (((nd.c) listIterator.previous()) != null && (map = nd.a.f417778b) != null && ((java.util.concurrent.ConcurrentHashMap) map).get(cls) != null) {
                return (nd.d) ((java.util.concurrent.ConcurrentHashMap) map).get(cls);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Luggage", "no profiler found for [%s], genDummy[%b]", cls.getCanonicalName(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return b(cls);
        }
        return null;
    }

    public static void e(java.lang.Class cls, nd.b bVar) {
        if (cls == null || bVar == null) {
            return;
        }
        ((nd.a) ((nd.c) f417779a.get("luggage-core"))).getClass();
        ((java.util.concurrent.ConcurrentHashMap) nd.a.f417777a).put(cls, bVar);
    }

    public static void f(java.lang.Class cls, nd.d dVar) {
        if (cls == null || dVar == null) {
            return;
        }
        ((nd.a) ((nd.c) f417779a.get("luggage-core"))).getClass();
        ((java.util.concurrent.ConcurrentHashMap) nd.a.f417778b).put(cls, dVar);
    }
}

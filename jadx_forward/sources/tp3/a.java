package tp3;

/* loaded from: classes12.dex */
public enum a {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f502679d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f502680e = new java.util.concurrent.ConcurrentHashMap();

    a() {
    }

    public tp3.c a(java.lang.Class cls) {
        return (tp3.c) ((java.util.concurrent.ConcurrentHashMap) this.f502680e).get(cls);
    }

    public void b(java.util.Map map) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f502679d).iterator();
        while (it.hasNext()) {
            tp3.c cVar = (tp3.c) it.next();
            if (map.containsKey(cVar.b())) {
                cVar.c(map);
            }
        }
    }

    public void d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DiagnosticManager", "received cmd: %s", str);
        b(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "cmd", null));
    }

    public void e(tp3.c cVar) {
        java.util.Map map = this.f502680e;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(cVar.getClass())) {
            return;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) this.f502679d).add(cVar);
        ((java.util.concurrent.ConcurrentHashMap) map).put(cVar.getClass(), cVar);
        cVar.d();
    }
}

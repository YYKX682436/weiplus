package lm0;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f400868a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public lm0.d f400869b = null;

    static {
        new lm0.e();
    }

    public void a(java.lang.Class cls, lm0.c cVar) {
        this.f400868a.put(cls, cVar);
        if (cVar instanceof lm0.b) {
            ((lm0.b) cVar).c();
        }
        lm0.d dVar = this.f400869b;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ga) dVar).f159728a.f159805c.add(cls);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceHub", "register service %s %s", cls, cVar);
    }

    public lm0.a b(java.lang.Class cls) {
        boolean z17;
        lm0.a aVar;
        lm0.c cVar = (lm0.c) this.f400868a.get(cls);
        if (cls.isInterface() || !java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ServiceHub", "Did you call service by using the service implementation class ?? Use interface class instead!! Carl is warning u!");
            z17 = true;
        }
        if (cVar != null) {
            aVar = ((lm0.f) cVar).f400870d;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceHub", "Service(%s) not found!!! ", cls);
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceHub", "This error must cause by using implementation class to call service! Use interface instead! Understand?");
            }
            aVar = null;
        }
        lm0.d dVar = this.f400869b;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ga) dVar).f159728a.getClass();
        }
        return aVar;
    }

    public void c(java.lang.Class cls) {
        lm0.c cVar = (lm0.c) this.f400868a.remove(cls);
        if (cVar instanceof lm0.b) {
            ((lm0.b) cVar).b();
        }
        lm0.d dVar = this.f400869b;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ga) dVar).f159728a.getClass();
        }
    }
}

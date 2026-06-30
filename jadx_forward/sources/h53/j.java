package h53;

/* loaded from: classes8.dex */
public class j extends sd.m0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.LinkedList f360588m = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final h53.q f360589f;

    /* renamed from: g, reason: collision with root package name */
    public final sd.g f360590g;

    /* renamed from: h, reason: collision with root package name */
    public h53.i f360591h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f360592i;

    public j() {
        super(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, h53.p.class);
        java.util.LinkedList linkedList;
        this.f360591h = h53.i.none;
        sd.g gVar = (sd.g) this.f488158e;
        this.f360590g = gVar;
        this.f360589f = new h53.q(gVar);
        synchronized (h53.k.class) {
            h53.k.f360593a = new java.util.LinkedList();
            h53.k.b();
            linkedList = h53.k.f360593a;
        }
        gVar.g(linkedList, this);
        jh0.t tVar = (jh0.t) i95.n0.c(jh0.t.class);
        h53.b bVar = new h53.b(this);
        ((jh0.q) tVar).getClass();
        java.lang.String str = vz4.h.f523267a;
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
            vz4.h.a(bVar);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.a("", new vz4.g(bVar));
        }
        b("initing");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsCore", "JS CORE CREATE");
    }

    public static h53.j d() {
        return (h53.j) f360588m.peek();
    }

    public synchronized void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsCore", "destroyDirectly");
        if (this.f360591h != h53.i.destroyed) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f360592i;
        if (b4Var != null && !b4Var.e()) {
            this.f360592i.d();
        }
        h53.q qVar = this.f360589f;
        qVar.f360599c = true;
        qVar.f360600d.clear();
        qVar.f360601e.clear();
        this.f360590g.a();
        f360588m.remove(this);
    }

    public final void b(java.lang.String str) {
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.b().iterator();
        while (it.hasNext()) {
            sd.u0 u0Var = (sd.u0) it.next();
            u0Var.f488188i.c(new h53.c(this));
            u0Var.f488188i.f488166i.mo32260x738236e6(java.lang.String.format("window.__jscore_state__='%s';", str), null);
        }
    }

    public void c(h53.r rVar) {
        h53.q qVar = this.f360589f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "evaluateMessage, hasDestroyed = %b, hasReady = %b", java.lang.Boolean.valueOf(qVar.f360599c), java.lang.Boolean.valueOf(qVar.f360598b));
        if (qVar.f360599c) {
            return;
        }
        if (!qVar.f360598b) {
            qVar.f360601e.add(rVar);
        } else {
            qVar.f360597a.h(java.lang.String.format("WxGameJsCoreBridge.invokeEvent(%s,\"%s\")", rVar.f360603b.toString(), rVar.f360602a), null);
        }
    }
}

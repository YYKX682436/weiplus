package g9;

/* loaded from: classes15.dex */
public final class k implements d9.a0, h9.m {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f351149a;

    /* renamed from: b, reason: collision with root package name */
    public final g9.g f351150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f351151c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.g f351152d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.h0 f351153e;

    /* renamed from: f, reason: collision with root package name */
    public h9.n f351154f;

    /* renamed from: g, reason: collision with root package name */
    public d9.y f351155g;

    static {
        java.util.HashSet hashSet = m8.q.f406197a;
        synchronized (m8.q.class) {
            if (m8.q.f406197a.add("goog.exo.hls")) {
                m8.q.f406198b += ", goog.exo.hls";
            }
        }
    }

    public k(android.net.Uri uri, r9.j jVar, android.os.Handler handler, d9.h hVar) {
        g9.b bVar = new g9.b(jVar);
        h9.g gVar = new h9.g();
        this.f351149a = uri;
        this.f351150b = bVar;
        this.f351151c = 3;
        this.f351153e = gVar;
        this.f351152d = new d9.g(handler, hVar);
    }

    @Override // d9.a0
    public void a(m8.i iVar, boolean z17, d9.y yVar) {
        t9.a.d(this.f351154f == null);
        android.net.Uri uri = this.f351149a;
        g9.g gVar = this.f351150b;
        d9.g gVar2 = this.f351152d;
        int i17 = this.f351151c;
        r9.h0 h0Var = this.f351153e;
        h9.n nVar = new h9.n(uri, gVar, gVar2, i17, this, h0Var);
        this.f351154f = nVar;
        this.f351155g = yVar;
        nVar.f361198n.d(new r9.i0(((g9.b) gVar).f351094a.mo10288xb8a7ce81(), uri, 4, h0Var), nVar, i17);
    }

    @Override // d9.a0
    public void b(d9.x xVar) {
        g9.j jVar = (g9.j) xVar;
        ((java.util.ArrayList) jVar.f351135d.f361197m).remove(jVar);
        jVar.f351142n.removeCallbacksAndMessages(null);
        for (g9.o oVar : jVar.f351146r) {
            boolean c17 = oVar.f351165m.c(oVar);
            if (oVar.f351174v && !c17) {
                for (d9.f0 f0Var : oVar.f351171s) {
                    f0Var.h();
                }
            }
            oVar.f351170r.removeCallbacksAndMessages(null);
            oVar.f351177y = true;
        }
    }

    @Override // d9.a0
    public void c() {
        h9.n nVar = this.f351154f;
        nVar.f361198n.b();
        h9.a aVar = nVar.f361201q;
        if (aVar != null) {
            h9.i iVar = (h9.i) nVar.f361194g.get(aVar);
            iVar.f361181e.b();
            java.io.IOException iOException = iVar.f361189p;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // d9.a0
    public d9.x d(d9.z zVar, r9.b bVar) {
        t9.a.a(zVar.f308960a == 0);
        return new g9.j(this.f351154f, this.f351150b, this.f351151c, this.f351152d, bVar);
    }

    @Override // d9.a0
    public void e() {
        h9.n nVar = this.f351154f;
        if (nVar != null) {
            nVar.f361198n.c(null);
            java.util.IdentityHashMap identityHashMap = nVar.f361194g;
            java.util.Iterator it = identityHashMap.values().iterator();
            while (it.hasNext()) {
                ((h9.i) it.next()).f361181e.c(null);
            }
            nVar.f361195h.removeCallbacksAndMessages(null);
            identityHashMap.clear();
            this.f351154f = null;
        }
        this.f351155g = null;
    }
}

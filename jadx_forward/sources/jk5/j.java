package jk5;

/* loaded from: classes13.dex */
public class j implements jk5.l {

    /* renamed from: a, reason: collision with root package name */
    public final m56.b f381701a;

    /* renamed from: b, reason: collision with root package name */
    public l56.i f381702b;

    /* renamed from: c, reason: collision with root package name */
    public l56.i f381703c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f381704d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f381705e = false;

    /* renamed from: f, reason: collision with root package name */
    public jk5.b f381706f = null;

    /* renamed from: g, reason: collision with root package name */
    public jk5.a f381707g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f381708h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f381709i = new jk5.d(this);

    public j() {
        l56.i iVar = null;
        this.f381701a = null;
        this.f381702b = null;
        l56.h hVar = l56.h.Header;
        n56.c.b(i56.c.class, "Api class cannot be null");
        try {
            i56.a aVar = (i56.a) i56.c.class.newInstance();
            n56.c.a("XMr2y8FEVEqZBcZ1TU3gLA", "Invalid Api key");
            n56.c.a("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "Invalid Api secret");
            n56.c.b("wechatapp://sign-in-twitter.wechatapp.com/", "Callback can't be null");
            n56.c.b(aVar, "You must specify a valid api through the provider() method");
            n56.c.a("XMr2y8FEVEqZBcZ1TU3gLA", "You must provide an api key");
            n56.c.a("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "You must provide an api secret");
            l56.a aVar2 = new l56.a("XMr2y8FEVEqZBcZ1TU3gLA", "kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "wechatapp://sign-in-twitter.wechatapp.com/", hVar, null, null);
            i56.b bVar = (i56.b) aVar;
            bVar.getClass();
            this.f381701a = new m56.a(bVar, aVar2);
            if (gm0.j1.b().m()) {
                java.lang.String str = (java.lang.String) gm0.j1.u().c().l(69377, null);
                java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(69378, null);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    iVar = new l56.i(str, str2, null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Twitter", "acchas not ready for restoreTwitterAccessToken");
            }
            this.f381702b = iVar;
        } catch (java.lang.Exception e17) {
            throw new j56.b("Error while creating the Api object", e17);
        }
    }

    public final void a(jk5.c cVar) {
        this.f381704d = false;
        this.f381703c = null;
        jk5.b bVar = this.f381706f;
        if (bVar != null) {
            bVar.I4(cVar);
        }
    }

    public void b(jk5.b bVar, android.content.Context context) {
        if (this.f381704d) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(583L, 0L, 1L, false);
        this.f381706f = bVar;
        this.f381708h = context;
        this.f381704d = true;
        s75.d.b(new jk5.e(this), "Twitter_doOAuth");
    }

    public void c() {
        d(false);
        a(jk5.c.Canceled);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(583L, 3L, 1L, false);
    }

    public final void d(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new e21.p(10251, z17 ? "1" : "2"));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.q(arrayList));
    }

    public final void e(l56.i iVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        if (iVar == null) {
            gm0.j1.u().c().w(69377, "");
            gm0.j1.u().c().w(69378, "");
        } else {
            gm0.j1.u().c().w(69377, iVar.f398225d);
            gm0.j1.u().c().w(69378, iVar.f398226e);
        }
    }
}

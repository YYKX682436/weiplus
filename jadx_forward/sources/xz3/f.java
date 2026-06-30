package xz3;

/* loaded from: classes15.dex */
public final class f implements xz3.l {

    /* renamed from: d, reason: collision with root package name */
    public final sz3.p f539748d;

    /* renamed from: e, reason: collision with root package name */
    public final xz3.a f539749e;

    /* renamed from: f, reason: collision with root package name */
    public xz3.j f539750f;

    /* renamed from: g, reason: collision with root package name */
    public xz3.p f539751g;

    /* renamed from: h, reason: collision with root package name */
    public final xz3.e f539752h;

    /* renamed from: i, reason: collision with root package name */
    public final xz3.b f539753i;

    public f(sz3.p request, xz3.a getProductCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getProductCallback, "getProductCallback");
        this.f539748d = request;
        this.f539749e = getProductCallback;
        this.f539752h = new xz3.e(this);
        this.f539753i = new xz3.b(this);
    }

    public static final void a(xz3.f fVar, sz3.x0 x0Var) {
        sz3.p pVar = fVar.f539748d;
        long j17 = pVar.f495479c;
        sz3.n nVar = new sz3.n(pVar.f495478b, x0Var);
        nVar.f495479c = pVar.f495479c;
        nVar.f495480d = pVar.f495480d;
        nVar.f495481e = pVar.f495481e;
        xz3.j jVar = new xz3.j(j17, nVar, fVar.f539753i);
        xz3.g gVar = jVar.f539763g;
        gVar.b(jVar);
        jVar.f539782d = false;
        gm0.j1.d().a(5057, jVar);
        sz3.n nVar2 = jVar.f539762f;
        int i17 = nVar2.f495480d;
        java.lang.Long valueOf = java.lang.Long.valueOf(jVar.f539761e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        sz3.x0 x0Var2 = nVar2.f495608h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageRetrievalTask", "doRetrieval session: %d, source: %d, reqKey size: %s", valueOf, valueOf2, java.lang.Integer.valueOf(x0Var2.f495684e.size()));
        if (i17 == 3 || i17 == 4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = x0Var2.f495684e.iterator();
            while (it.hasNext()) {
                sz3.w0 w0Var = (sz3.w0) it.next();
                w0Var.f495670h = 6;
                jVar.f539766m.add(java.lang.Integer.valueOf(w0Var.f495671i));
                arrayList.add(w0Var.f495672j);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.z(arrayList, false, null, 4, null);
            nVar2.f495482f = zVar;
            gm0.j1.d().g(zVar);
            gVar.i(nVar2);
        } else {
            jVar.a(i17, -1, "invalid source: " + i17);
        }
        fVar.f539750f = jVar;
    }

    public void b() {
        xz3.p pVar = this.f539751g;
        if (pVar != null) {
            boolean z17 = pVar.f539782d;
            pVar.f539781h = true;
            if (!z17) {
                pVar.f539780g.g(pVar);
            }
            gm0.j1.d().q(5105, pVar);
            gm0.j1.d().d(pVar.f539779f.f495482f);
        }
        xz3.j jVar = this.f539750f;
        if (jVar != null) {
            boolean z18 = jVar.f539782d;
            jVar.f539765i = true;
            if (!z18) {
                jVar.f539763g.g(jVar);
            }
            gm0.j1.d().q(5057, jVar);
            gm0.j1.d().d(jVar.f539762f.f495482f);
        }
        if (this.f539751g == null && this.f539750f == null) {
            this.f539749e.g(this);
        }
    }
}

package sz3;

/* loaded from: classes15.dex */
public final class m implements xz3.a {

    /* renamed from: a, reason: collision with root package name */
    public final xz3.a f495598a;

    /* renamed from: b, reason: collision with root package name */
    public final int f495599b;

    /* renamed from: c, reason: collision with root package name */
    public final int f495600c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f495601d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f495602e;

    /* renamed from: f, reason: collision with root package name */
    public long f495603f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f495604g;

    static {
        new sz3.b(null);
    }

    public m(xz3.a getProductCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getProductCallback, "getProductCallback");
        this.f495598a = getProductCallback;
        this.f495599b = 2;
        this.f495600c = 1000;
        this.f495601d = new java.util.ArrayList();
        this.f495602e = new java.util.ArrayList();
        this.f495603f = -1L;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
        int i17 = o4Var != null ? o4Var.getInt("scan_config_request_time_interval", 1000) : 1000;
        this.f495600c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "runTaskMinDurationInMs " + i17);
    }

    public static final void l(sz3.m mVar) {
        if (mVar.f495602e.size() >= mVar.f495599b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AiScanImageGetProductManager", "doNextTask running queue full and skip");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = mVar.f495603f;
        if (j17 < 0 || currentTimeMillis - j17 >= mVar.f495600c) {
            m(mVar);
            return;
        }
        if (true ^ mVar.f495601d.isEmpty()) {
            long j18 = (mVar.f495603f + mVar.f495600c) - currentTimeMillis;
            mVar.f495601d.size();
            sz3.d dVar = new sz3.d(mVar);
            if (j18 > 0) {
                ((ku5.t0) ku5.t0.f394148d).l(dVar, j18, "AiScanImageGetProductManager");
            } else {
                ((ku5.t0) ku5.t0.f394148d).h(dVar, "AiScanImageGetProductManager");
            }
        }
    }

    public static final void m(sz3.m mVar) {
        xz3.f fVar = (xz3.f) kz5.h0.E(mVar.f495601d);
        if (fVar != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.hashCode());
            sz3.p pVar = fVar.f539748d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "doRunNextTask task: %s, trackId: %s, session: %s", valueOf, java.lang.Integer.valueOf(pVar.f495478b.f495492a.getId()), java.lang.Long.valueOf(pVar.f495479c));
            mVar.f495602e.add(fVar);
            mVar.f495603f = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductTask", "run getProductTask");
            xz3.p pVar2 = new xz3.p(pVar.f495479c, pVar, fVar.f539752h);
            xz3.m mVar2 = pVar2.f539780g;
            mVar2.b(pVar2);
            pVar2.f539782d = false;
            gm0.j1.d().a(5105, pVar2);
            long j17 = pVar2.f539778e;
            sz3.p pVar3 = pVar2.f539779f;
            int i17 = pVar3.f495480d;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(pVar3.f495477a);
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(pVar3.f495481e);
            byte[] bArr = pVar3.f495619h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageUploadTask", "doUploadImage session: %d, source: %d, scanImageType: %s, mode: %s, imageData: %s, %s", valueOf2, valueOf3, valueOf4, valueOf5, java.lang.Integer.valueOf(bArr.length), pVar3.f495619h);
            sz3.a1 a1Var = pVar3.f495478b;
            if (i17 == 3 || i17 == 4) {
                int i18 = pVar3.f495481e;
                int i19 = pVar3.f495620i;
                int i27 = pVar3.f495621j;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageUploadTask", "uploadImage imageData: %d", java.lang.Integer.valueOf(bArr.length));
                int i28 = pVar3.f495477a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = a1Var.f495492a;
                sz3.z0 z0Var = pVar3.f495483g;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.x(bArr, i19, i27, i18, i28, j17, c17282x335f2f60, null, null, null, z0Var != null ? z0Var.f495714c : null);
                pVar3.f495482f = xVar;
                gm0.j1.d().g(xVar);
                mVar2.e(pVar3);
            } else {
                pVar2.b(i17, 3, -1, "source invalid: " + i17, kz5.c0.d(java.lang.Integer.valueOf(a1Var.f495492a.getId())));
            }
            fVar.f539751g = pVar2;
        }
    }

    @Override // xz3.g
    public void a(sz3.x0 result, int i17, long j17, int i18, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        ((ku5.t0) ku5.t0.f394148d).B(new sz3.f(this, result, i17, j17, i18, str));
    }

    @Override // xz3.k
    public void b(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onTaskStart isCancelled and ignore");
        } else {
            this.f495598a.b(task);
        }
    }

    @Override // xz3.m
    public void c(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        ((ku5.t0) ku5.t0.f394148d).B(new sz3.k(this, result));
    }

    @Override // xz3.m
    public void d(sz3.x0 result, int i17, long j17, int i18, int i19, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        ((ku5.t0) ku5.t0.f394148d).B(new sz3.j(this, result, i17, j17, i18, i19, str));
    }

    @Override // xz3.m
    public void e(sz3.p request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (this.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onUploadStart isCancelled and ignore");
        } else {
            this.f495598a.e(request);
        }
    }

    @Override // xz3.a
    public void f(sz3.c1 c1Var, sz3.x0 result, yz5.l addResultCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addResultCallback, "addResultCallback");
        ((ku5.t0) ku5.t0.f394148d).B(new sz3.e(this, c1Var, result, addResultCallback));
    }

    @Override // xz3.k
    public void g(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f495598a.g(task);
    }

    @Override // xz3.g
    public void h(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        ((ku5.t0) ku5.t0.f394148d).B(new sz3.g(this, result));
    }

    @Override // xz3.g
    public void i(sz3.n request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (this.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onRetrievalStart isCancelled and ignore");
        } else {
            this.f495598a.i(request);
        }
    }

    @Override // xz3.k
    public void j(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        ((ku5.t0) ku5.t0.f394148d).B(new sz3.h(this, task));
        ((ku5.t0) ku5.t0.f394148d).h(new sz3.i(this, task), "AiScanImageGetProductManager");
    }

    @Override // xz3.k
    public void k(xz3.l task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f495604g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "onTaskAdd isCancelled and ignore");
        } else {
            this.f495598a.k(task);
        }
    }

    public final void n(sz3.p request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ((ku5.t0) ku5.t0.f394148d).h(new sz3.l(request, this), "AiScanImageGetProductManager");
    }
}

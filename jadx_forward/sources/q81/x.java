package q81;

/* loaded from: classes7.dex */
public enum x implements q81.z {
    _INSTANCE;


    /* renamed from: e, reason: collision with root package name */
    public volatile pq5.g f442262e;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f442261d = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f442263f = new java.util.concurrent.ConcurrentSkipListSet();

    x() {
    }

    public static void a(q81.x xVar) {
        xVar.getClass();
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but disconnected");
            km5.u.b().a(null);
            synchronized (xVar) {
                xVar.f442261d = false;
                ((java.util.concurrent.ConcurrentSkipListSet) xVar.f442263f).clear();
            }
            return;
        }
        if (!gm0.j1.b().f354787q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but account not ready");
            km5.u.b().a(null);
            synchronized (xVar) {
                xVar.f442261d = false;
                ((java.util.concurrent.ConcurrentSkipListSet) xVar.f442263f).clear();
            }
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context) ? 1 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context) ? 2 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context) ? 4 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context) ? 8 : -1;
        java.util.LinkedList<t81.c> linkedList = new java.util.LinkedList();
        t81.d dVar = (t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class);
        dVar.getClass();
        linkedList.addAll(dVar.D0("networkType=?", java.lang.String.valueOf(0)));
        t81.d dVar2 = (t81.d) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.d.class);
        dVar2.getClass();
        for (t81.c cVar : dVar2.D0("networkType<>?", java.lang.String.valueOf(0))) {
            if ((cVar.f67705xf813eec3 & i17) > 0) {
                linkedList.add(cVar);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry but records empty, interrupt");
            km5.u.b().a(null);
            synchronized (xVar) {
                xVar.f442261d = false;
                ((java.util.concurrent.ConcurrentSkipListSet) xVar.f442263f).clear();
            }
            return;
        }
        boolean z17 = q81.y.f442264a;
        for (t81.c cVar2 : linkedList) {
            if (!z17 || cVar2.f67715x2262335f != 0) {
                xVar.f442262e.K(new q81.u(xVar, cVar2));
            }
        }
        xVar.f442262e.K(new q81.w(xVar));
    }

    @Override // q81.z
    public synchronized void h() {
        if (this.f442262e != null) {
            this.f442262e.B();
        }
        this.f442261d = false;
        ((java.util.concurrent.ConcurrentSkipListSet) this.f442263f).clear();
    }

    @Override // q81.z
    public synchronized void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        if (!gm0.j1.b().f354787q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, account not ready");
            if (this.f442262e != null) {
                this.f442262e.B();
            }
            this.f442261d = false;
            ((java.util.concurrent.ConcurrentSkipListSet) this.f442263f).clear();
            return;
        }
        if (this.f442261d) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, set flag queue running");
        this.f442261d = true;
        this.f442262e = pq5.h.a();
        this.f442262e.i(new q81.t(this));
    }

    @Override // q81.z
    public boolean k(java.lang.String str) {
        return !u46.l.e(str) && ((java.util.concurrent.ConcurrentSkipListSet) this.f442263f).contains(str);
    }
}

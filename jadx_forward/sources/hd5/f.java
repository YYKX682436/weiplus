package hd5;

/* loaded from: classes9.dex */
public final class f implements he5.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ he5.t f362130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd5.j f362131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hd5.n f362132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd5.q f362133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hd5.o f362134e;

    public f(he5.t tVar, hd5.j jVar, hd5.n nVar, hd5.q qVar, hd5.o oVar) {
        this.f362130a = tVar;
        this.f362131b = jVar;
        this.f362132c = nVar;
        this.f362133d = qVar;
        this.f362134e = oVar;
    }

    public final void a() {
        this.f362130a.mo133462x5a5ddf8();
        ((tb5.d0) ((tb5.n0) this.f362131b.f362145c.f542241c.a(tb5.n0.class))).m0("preProcessDataList", this.f362132c);
        this.f362133d.f362167f = this.f362130a.a();
        hd5.q qVar = this.f362133d;
        qVar.f362165d = ((java.util.LinkedList) qVar.f362164c).size();
        this.f362133d.f362170i = this.f362130a.d();
        sd5.p.a("preProcessDataList", new hd5.d(this.f362131b, this.f362133d));
        this.f362131b.a();
        ((tb5.d0) ((tb5.n0) this.f362131b.f362145c.f542241c.a(tb5.n0.class))).m0("handleMsgPreLoad", this.f362132c);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sd5.p.a("handleMsgPreLoad", new hd5.e(this.f362131b, this.f362133d, this.f362132c));
        hd5.v loader = this.f362133d.f362173l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loader, "loader");
        hd5.q qVar2 = this.f362133d;
        hd5.j jVar = this.f362131b;
        synchronized (loader) {
            if (qVar2.f362171j.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "cancel source apply");
                return;
            }
            yb5.l lVar = jVar.f362145c.f542259u;
            java.util.List dataListToSet = qVar2.f362172k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataListToSet, "dataListToSet");
            lVar.getClass();
            lVar.f542273a = dataListToSet;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "sourceFinish action:" + this.f362132c + " addCount:" + this.f362133d.f362165d + " totalCount:" + this.f362133d.f362167f + " calDuration:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " queryCreateTime:" + this.f362133d.f362170i);
            this.f362131b.a();
            hd5.o oVar = this.f362134e;
            if (oVar != null) {
                oVar.mo133232x338af3();
            }
        }
    }
}

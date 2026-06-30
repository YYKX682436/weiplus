package oq3;

/* loaded from: classes12.dex */
public final class c extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final int f428909f;

    /* renamed from: g, reason: collision with root package name */
    public final int f428910g;

    /* renamed from: h, reason: collision with root package name */
    public final int f428911h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jm0.o plugin) {
        super(plugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f428909f = -10041;
        this.f428910g = -5103059;
        this.f428911h = com.p3249xcbb51f6b.tsm.C28041x16492e41.f65620xb0d7a408;
    }

    public final void T6(java.lang.String msgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgId, "msgId");
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        nVar.A.b7(msgId, 5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: downloaded by other way, msgSvrId_type:".concat(msgId));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r32) {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq3.c.U6(com.tencent.mm.storage.f9):void");
    }

    public final void V6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        sq3.b bVar = nVar.A;
        long m124847x74d37ac6 = msg.m124847x74d37ac6();
        bVar.getClass();
        p75.m0 i17 = dm.n1.f320136w.i(java.lang.Long.valueOf(m124847x74d37ac6));
        p75.i0 i18 = dm.n1.f320134u.i();
        i18.f434189c = "MicroMsg.C2CPreDownloadStorage";
        i18.f434190d = i17;
        for (sq3.a aVar : i18.a().k(bVar.f274680g.Q4(), sq3.a.class)) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.m134976x2690a4ac();
            nVar2.B.d(msg.m124847x74d37ac6(), aVar.D0(), msg.I0());
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.m134976x2690a4ac();
            sq3.b bVar2 = nVar3.A;
            java.lang.String A0 = aVar.A0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A0, "getMsgItemId(...)");
            bVar2.X6(A0);
        }
    }

    public final void W6() {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        pq3.j jVar = nVar.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jVar, "getC2CMsgPreDownloader(...)");
        jVar.h(false);
    }

    public final void X6(java.lang.String msgItemId) {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        pq3.j jVar = nVar.B;
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemId, "msgItemId");
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) jVar.f439176h).mo141623x754a37bb(), null, new pq3.g(msgItemId, jVar, null), 1, null);
    }
}

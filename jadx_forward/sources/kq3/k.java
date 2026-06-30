package kq3;

/* loaded from: classes12.dex */
public class k extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kq3.l f392810a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kq3.l lVar, java.lang.String str) {
        super(str);
        this.f392810a = lVar;
        m77789xc5a5549d(false);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        try {
            int i17 = message.what;
            if (i17 != 0) {
                if (i17 == 1) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    tq3.a aVar = (tq3.a) message.obj;
                    try {
                        aVar.run();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Priority.PriorityTaskRunner", e17, "MESSAGE_ONCE_RUN_TASK %s", aVar.a());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityTaskRunner", "Once Run Task %s Use Time %d", aVar.a(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    return;
                }
                if (i17 != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Priority.PriorityTaskRunner", "msg.what = " + message.what);
                    return;
                } else {
                    kq3.k kVar = this.f392810a.f392812b;
                    if (kVar != null) {
                        kVar.mo50303x856b99f0(2);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityTaskRunner", "MESSAGE_PRE_DOWNLOAD_CHECK");
                    ((ku5.t0) ku5.t0.f394148d).g(new oq3.f(((fq3.n) i95.n0.c(fq3.n.class)).bj()));
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityTaskRunner", "priority runner tick");
            kq3.k kVar2 = this.f392810a.f392812b;
            if (kVar2 != null) {
                kVar2.mo50303x856b99f0(0);
            }
            kq3.k kVar3 = this.f392810a.f392812b;
            if (kVar3 != null) {
                kVar3.mo50307xb9e94560(0, u04.d.f505010c);
            }
            if (!((fq3.n) i95.n0.c(fq3.n.class)).f347073y.c() && ((fq3.n) i95.n0.c(fq3.n.class)).f347073y.b()) {
                ((fq3.n) i95.n0.c(fq3.n.class)).f347073y.d();
            }
            ((fq3.n) i95.n0.c(fq3.n.class)).m134976x2690a4ac();
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11.f347074z.f420525d))) {
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.m134976x2690a4ac();
                if (nVar.f347074z.a()) {
                    fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar2.m134976x2690a4ac();
                    nVar2.f347074z.c();
                }
            }
            if (tq3.c.c()) {
                this.f392810a.a(new tq3.c());
            }
            ((yk.h) ((pt0.p) i95.n0.c(pt0.p.class))).wi(null, false);
            kq3.l lVar = this.f392810a;
            lVar.getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new kq3.j(lVar));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Priority.PriorityTaskRunner", e18, "handle priority msg", new java.lang.Object[0]);
        }
    }
}

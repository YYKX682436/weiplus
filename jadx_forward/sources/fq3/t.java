package fq3;

/* loaded from: classes12.dex */
public class t extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f347089d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f347090e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f347091f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f347092g;

    public t(fq3.w wVar, long j17, java.lang.String str, boolean z17, boolean z18) {
        this.f347089d = j17;
        this.f347090e = str;
        this.f347091f = z17;
        this.f347092g = z18;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.onC2CImgDownloadedTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f347090e, this.f347089d);
        long mo78012x3fdd41df = Li.mo78012x3fdd41df();
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        if (mo78012x3fdd41df <= nVar.f347061m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityService", "onC2CImgDownloaded time condition not support %s", k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, Li.mo78012x3fdd41df() / 1000));
            return;
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.m134976x2690a4ac();
        if (nVar2.f347070v != null) {
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.m134976x2690a4ac();
            nVar3.f347070v.getClass();
            if (!this.f347091f) {
                if (this.f347092g) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "updateStatus download cancel %d", java.lang.Long.valueOf(Li.m124847x74d37ac6()));
                    fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar4.m134976x2690a4ac();
                    nVar4.f347063o.f(Li.m124847x74d37ac6(), 1);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "updateStatus download fail %d", java.lang.Long.valueOf(Li.m124847x74d37ac6()));
                    fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar5.m134976x2690a4ac();
                    nVar5.f347063o.f(Li.m124847x74d37ac6(), 4);
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(957L, 32L, 1L, false);
                return;
            }
            fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar6.m134976x2690a4ac();
            r45.rc c17 = nVar6.f347063o.c(Li.m124847x74d37ac6());
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "sender img %d", java.lang.Long.valueOf(Li.m124847x74d37ac6()));
                return;
            }
            if (c17.f466248m == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "already auto download msgid %d", java.lang.Long.valueOf(Li.m124847x74d37ac6()));
                return;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(957L, 20L, 1L, false);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(Li.Q0(), c17.f466250o);
            c17.f466251p = b27.f404169d;
            kq3.i.c(1, currentTimeMillis, 0, c17);
            ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Bi(1L, c17.f466250o, c17.f466243e, kq3.i.b(c17.f466253r), oq3.k.f428927a.f(Li.G).f428922b, r7.f428923c, Li.mo78012x3fdd41df());
            fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar7.m134976x2690a4ac();
            com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar = nVar7.f347063o;
            long j17 = c17.f466242d;
            int i17 = b27.f404169d;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = eVar.f234721g;
            c26970x63d6eaa3.m107799x37fbf859(1, currentTimeMillis);
            c26970x63d6eaa3.m107799x37fbf859(2, 3);
            c26970x63d6eaa3.m107799x37fbf859(3, i17);
            c26970x63d6eaa3.m107799x37fbf859(4, j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "updateStatusAndDownloadTime %d res %d %d %d", java.lang.Integer.valueOf(c26970x63d6eaa3.m107871x91d1f3e9()), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis), 3);
            if (hq3.a.b(c17.f466247i, 1)) {
                fVar.mo68477x336bdfd8(957L, 21L, 1L, false);
                fVar.mo68477x336bdfd8(957L, 22L, b27.f404169d, false);
            }
            if (hq3.a.b(c17.f466247i, 8)) {
                fVar.mo68477x336bdfd8(957L, 23L, 1L, false);
                fVar.mo68477x336bdfd8(957L, 24L, b27.f404169d, false);
            }
            if (hq3.a.b(c17.f466247i, 2) || hq3.a.b(c17.f466247i, 4)) {
                fVar.mo68477x336bdfd8(957L, 25L, 1L, false);
                fVar.mo68477x336bdfd8(957L, 26L, b27.f404169d, false);
            }
            if (hq3.a.b(c17.f466247i, 16)) {
                fVar.mo68477x336bdfd8(957L, 27L, 1L, false);
                fVar.mo68477x336bdfd8(957L, 28L, b27.f404169d, false);
            }
            if (hq3.a.b(c17.f466247i, 32)) {
                fVar.mo68477x336bdfd8(957L, 29L, 1L, false);
                fVar.mo68477x336bdfd8(957L, 30L, b27.f404169d, false);
            }
            if (hq3.a.b(c17.f466247i, 64)) {
                fVar.mo68477x336bdfd8(957L, 33L, 1L, false);
                fVar.mo68477x336bdfd8(957L, 34L, b27.f404169d, false);
            }
            if (hq3.a.b(c17.f466247i, 128)) {
                fVar.mo68477x336bdfd8(957L, 35L, 1L, false);
                fVar.mo68477x336bdfd8(957L, 36L, b27.f404169d, false);
            }
        }
    }
}

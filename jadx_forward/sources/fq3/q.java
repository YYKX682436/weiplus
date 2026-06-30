package fq3;

/* loaded from: classes12.dex */
public class q extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f347079d;

    /* renamed from: e, reason: collision with root package name */
    public final long f347080e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f347081f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f347082g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f347083h;

    public q(fq3.w wVar, boolean z17, java.lang.String str, long j17, boolean z18, boolean z19) {
        this.f347083h = z17;
        this.f347079d = str;
        this.f347080e = j17;
        this.f347081f = z18;
        this.f347082g = z19;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.onC2CFileDownloadedTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        if (nVar.f347071w != null) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.m134976x2690a4ac();
            nVar2.f347071w.getClass();
            java.lang.String str = this.f347079d;
            long j17 = this.f347080e;
            if (!this.f347081f) {
                if (this.f347082g) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "updateStatus download cancel %s %s", str, java.lang.Long.valueOf(j17));
                    fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar3.m134976x2690a4ac();
                    nVar3.f347064p.f(str, j17, 1);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "updateStatus download fail %s %s", str, java.lang.Long.valueOf(j17));
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.m134976x2690a4ac();
                nVar4.f347064p.f(str, j17, 4);
                return;
            }
            fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar5.m134976x2690a4ac();
            r45.qc c17 = nVar5.f347064p.c(str, j17);
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "sender file %s %s", str, java.lang.Long.valueOf(j17));
                return;
            }
            int i18 = c17.f465357m;
            if (i18 != 1 && i18 != 2 && i18 != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "already auto download msgid %s %s", str, java.lang.Long.valueOf(j17));
                return;
            }
            if (this.f347083h) {
                oq3.h e17 = oq3.k.f428927a.e(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(c17.f465352e, c17.f465359o).G);
                ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Bi(4L, c17.f465359o, c17.f465352e, kq3.i.b(c17.f465363s), e17.f428919b, e17.f428920c, c17.f465355h);
                i17 = 3;
            } else {
                i17 = 5;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            kq3.i.d(1, currentTimeMillis, i17, c17);
            fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar6.m134976x2690a4ac();
            nq3.f fVar = nVar6.f347064p;
            java.lang.String str2 = c17.f465351d;
            long j18 = c17.f465359o;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = fVar.f420533g;
            c26970x63d6eaa3.m107799x37fbf859(1, currentTimeMillis);
            c26970x63d6eaa3.m107799x37fbf859(2, i17);
            c26970x63d6eaa3.m107801x35198eae(3, str2);
            c26970x63d6eaa3.m107799x37fbf859(4, j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "updateStatusAndDownloadTime %s res %s %s %s %s", java.lang.Integer.valueOf(c26970x63d6eaa3.m107871x91d1f3e9()), str2, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17));
        }
    }
}

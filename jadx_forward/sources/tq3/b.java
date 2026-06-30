package tq3;

/* loaded from: classes12.dex */
public class b extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f502764d;

    public b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f502764d = f9Var;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.onC2CImgReceiveTask";
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, double d17, int i19) {
        int i27;
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        if (nVar.f347070v != null) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.m134976x2690a4ac();
            nVar2.f347070v.getClass();
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.m134976x2690a4ac();
            if (nVar3.f347063o.e(f9Var.m124847x74d37ac6())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "onImgReceive %d %s Update Status %d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var.Q0(), java.lang.Integer.valueOf(i18));
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.m134976x2690a4ac();
                nVar4.f347063o.g(f9Var.m124847x74d37ac6(), i17, i18);
                return;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(957L, 0L, 1L, false);
            if (hq3.a.b(i17, 8)) {
                fVar.mo68477x336bdfd8(957L, 1L, 1L, false);
            }
            if (hq3.a.b(i17, 4)) {
                fVar.mo68477x336bdfd8(957L, 2L, 1L, false);
            }
            if (hq3.a.b(i17, 2)) {
                fVar.mo68477x336bdfd8(957L, 3L, 1L, false);
            }
            if (hq3.a.b(i17, 16)) {
                fVar.mo68477x336bdfd8(957L, 4L, 1L, false);
            }
            if (hq3.a.b(i17, 1)) {
                i27 = 1;
                fVar.mo68477x336bdfd8(957L, 5L, 1L, false);
            } else {
                i27 = 1;
            }
            if (hq3.a.b(i17, 32)) {
                fVar.mo68477x336bdfd8(957L, 6L, 1L, false);
            }
            if (hq3.a.b(i17, 64)) {
                fVar.mo68477x336bdfd8(957L, 7L, 1L, false);
            }
            if (hq3.a.b(i17, 128)) {
                fVar.mo68477x336bdfd8(957L, 8L, 1L, false);
            }
            r45.rc rcVar = new r45.rc();
            rcVar.f466242d = f9Var.m124847x74d37ac6();
            rcVar.f466243e = f9Var.Q0();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
                java.lang.String s17 = c01.w9.s(f9Var.j());
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (s17 == null) {
                    s17 = "";
                }
                rcVar.f466244f = s17;
            } else {
                rcVar.f466244f = f9Var.Q0();
            }
            rcVar.f466245g = i27;
            rcVar.f466246h = f9Var.mo78012x3fdd41df();
            rcVar.f466247i = i17;
            rcVar.f466248m = i18;
            rcVar.f466249n = 0L;
            rcVar.f466250o = f9Var.I0();
            rcVar.f466251p = 0;
            rcVar.f466253r = d17;
            rcVar.f466254s = i19;
            fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar5.m134976x2690a4ac();
            com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar = nVar5.f347063o;
            eVar.getClass();
            long j17 = rcVar.f466242d;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = eVar.f234716b;
            c26970x63d6eaa3.m107799x37fbf859(i27, j17);
            c26970x63d6eaa3.m107801x35198eae(2, rcVar.f466243e);
            c26970x63d6eaa3.m107801x35198eae(3, rcVar.f466244f);
            c26970x63d6eaa3.m107799x37fbf859(4, rcVar.f466245g);
            c26970x63d6eaa3.m107799x37fbf859(5, rcVar.f466246h);
            c26970x63d6eaa3.m107799x37fbf859(6, rcVar.f466247i);
            c26970x63d6eaa3.m107799x37fbf859(7, rcVar.f466248m);
            c26970x63d6eaa3.m107799x37fbf859(8, rcVar.f466249n);
            c26970x63d6eaa3.m107799x37fbf859(9, rcVar.f466250o);
            c26970x63d6eaa3.m107799x37fbf859(10, rcVar.f466251p);
            c26970x63d6eaa3.m107799x37fbf859(11, rcVar.f466252q);
            c26970x63d6eaa3.m107798x1b3baa6e(12, rcVar.f466253r);
            c26970x63d6eaa3.m107799x37fbf859(13, rcVar.f466254s);
            c26970x63d6eaa3.m107867xb158f775();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "onImgReceive %d %s Insert Res %d %d %.2f %d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var.Q0(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i19));
            kq3.i.c(3, rcVar.f466246h, i18, rcVar);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
                fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar6.m134976x2690a4ac();
                nVar6.f347065q.k(rcVar.f466243e, "@all");
            }
            fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar7.m134976x2690a4ac();
            nVar7.f347065q.k(f9Var.Q0(), rcVar.f466244f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tq3.b.run():void");
    }
}

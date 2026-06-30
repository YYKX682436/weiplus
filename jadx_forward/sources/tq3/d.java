package tq3;

/* loaded from: classes12.dex */
public class d extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f502765d;

    public d(java.lang.String str) {
        this.f502765d = str;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "PriorityDeleteContactTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String userName = this.f502765d;
        if (Bi.n(userName, true).r2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityDeleteContactTask", "%s is Contact", userName);
            return;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.e eVar = nVar.f347063o;
        eVar.f234718d.m107801x35198eae(1, userName);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "delete %d img %s", java.lang.Integer.valueOf(eVar.f234717c.m107871x91d1f3e9()), userName);
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.m134976x2690a4ac();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = nVar2.f347065q.f401993e;
        c26970x63d6eaa3.m107801x35198eae(1, userName);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "delete %d img usage %s", java.lang.Integer.valueOf(c26970x63d6eaa3.m107871x91d1f3e9()), userName);
        fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar3.m134976x2690a4ac();
        nq3.f fVar = nVar3.f347064p;
        fVar.f420530d.m107801x35198eae(1, userName);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "delete %d file %s", java.lang.Integer.valueOf(fVar.f420529c.m107871x91d1f3e9()), userName);
        fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar4.m134976x2690a4ac();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa32 = nVar4.f347066r.f401993e;
        c26970x63d6eaa32.m107801x35198eae(1, userName);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgBaseUsageStorage", "delete %d img usage %s", java.lang.Integer.valueOf(c26970x63d6eaa32.m107871x91d1f3e9()), userName);
        fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar5.m134976x2690a4ac();
        mq3.c cVar = nVar5.f347068t;
        cVar.getClass();
        cVar.f412308a.d(java.lang.String.format("DELETE FROM %s WHERE chat = ?", "C2CChatUsageResult"), new java.lang.String[]{userName});
        fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar6.m134976x2690a4ac();
        mq3.d dVar = nVar6.f347067s;
        dVar.getClass();
        dVar.f412309a.d(java.lang.String.format("DELETE FROM %s WHERE chat = ?", "C2CChatUsage"), new java.lang.String[]{userName});
        fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar7.m134976x2690a4ac();
        sq3.b bVar = nVar7.A;
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p75.n0 n0Var = dm.n1.f320134u;
        n0Var.getClass();
        p75.m0 j17 = dm.n1.f320137x.j(userName);
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        p75.h hVar = (p75.h) j17;
        java.lang.String b17 = hVar.b();
        java.lang.String[] e17 = hVar.e();
        java.lang.String table = n0Var.f434209a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        l75.k0 Q4 = bVar.f274680g.Q4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadStorage", "deleteByMsgUserName >> userName:" + userName + ", result:" + (Q4 != null ? Q4.mo70514xb06685ab(table, b17, e17) : -1));
    }
}

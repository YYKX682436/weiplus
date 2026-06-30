package bq;

/* loaded from: classes.dex */
public final class i extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105021o;

    /* renamed from: p, reason: collision with root package name */
    public final int f105022p;

    public i(int i17, int i18, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f105021o = i17;
        this.f105022p = i18;
        r45.mw0 mw0Var = new r45.mw0();
        db2.t4 t4Var = db2.t4.f309704a;
        mw0Var.set(1, t4Var.a(4239));
        mw0Var.set(2, t4Var.n());
        mw0Var.set(7, java.lang.Integer.valueOf(i17));
        mw0Var.set(3, java.lang.Integer.valueOf(i18));
        mw0Var.set(4, java.lang.Integer.valueOf(i19));
        mw0Var.set(5, gVar);
        mw0Var.set(6, gVar2);
        mw0Var.set(8, xy2.c.f(qt2Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCatelogStreamCGI", "init: tabType=" + i18 + ", pullType=" + i17 + ", scene=" + i19 + ", finder_username=" + mw0Var.m75945x2fec8307(8) + ", extBuff=" + gVar + ", lastBuffer=" + gVar2);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = mw0Var;
        lVar.f152200d = 4239;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercatelogstream";
        lVar.f152198b = new r45.nw0();
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.nw0 resp = (r45.nw0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCatelogStreamCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str + ", tabType:" + this.f105022p + ", server increatment size:" + resp.m75941xfb821914(3).size());
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = t().m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject : m75941xfb821914) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).cl(finderObject, this.f105016m);
            }
        }
    }

    public final r45.nw0 t() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCatelogStreamResponse");
        return (r45.nw0) fVar;
    }
}

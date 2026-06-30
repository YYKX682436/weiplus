package ek2;

/* loaded from: classes.dex */
public final class p2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335050u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(gk2.e liveData, r45.t12 msg, int i17) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f335050u = "Finder.CgiFinderLiveTopComment";
        r45.jd2 jd2Var = new r45.jd2();
        jd2Var.set(1, db2.t4.f309704a.a(6295));
        jd2Var.set(3, java.lang.Long.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        jd2Var.set(2, java.lang.Long.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f410516m));
        jd2Var.set(7, msg.m75945x2fec8307(6) + '_' + c01.id.e() + '_' + ((mm2.c1) liveData.a(mm2.c1.class)).C7());
        jd2Var.set(6, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) liveData.a(mm2.e1.class)).f410518o));
        jd2Var.set(4, java.lang.Long.valueOf(msg.m75942xfb822ef2(5)));
        jd2Var.set(5, java.lang.Integer.valueOf(i17));
        jd2Var.set(8, java.lang.Long.valueOf(pm0.v.Z(((mm2.e1) liveData.a(mm2.e1.class)).f410525v)));
        jd2Var.set(9, xy2.c.f(this.f97668n));
        jd2Var.set(10, ((mm2.e1) liveData.a(mm2.e1.class)).f410525v);
        jd2Var.set(12, msg.m75945x2fec8307(6));
        ((mm2.c1) liveData.a(mm2.c1.class)).f410460z4.add(jd2Var.m75945x2fec8307(7));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = jd2Var;
        r45.kd2 kd2Var = new r45.kd2();
        kd2Var.set(0, new r45.ie());
        lVar.f152198b = kd2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivetopcomment";
        lVar.f152200d = 6295;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveTopComment", "CgiFinderLiveTopComment init " + jd2Var.m75942xfb822ef2(3) + ',' + xy2.c.f(this.f97668n) + ',' + msg.m75945x2fec8307(2) + " opType:" + jd2Var.m75939xb282bd08(5));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.kd2 resp = (r45.kd2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335050u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}

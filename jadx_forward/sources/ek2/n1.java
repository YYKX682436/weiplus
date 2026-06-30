package ek2;

/* loaded from: classes.dex */
public final class n1 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(int i17, long j17, long j18, java.lang.String objectNonceId, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        gVar = (i18 & 16) != 0 ? null : gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        r45.at1 at1Var = new r45.at1();
        at1Var.set(3, java.lang.Integer.valueOf(i17));
        at1Var.set(1, db2.t4.f309704a.a(6484));
        at1Var.set(2, xy2.c.f(this.f97668n));
        at1Var.set(4, java.lang.Long.valueOf(j17));
        at1Var.set(5, java.lang.Long.valueOf(j18));
        at1Var.set(7, gVar);
        at1Var.set(6, objectNonceId);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = at1Var;
        r45.bt1 bt1Var = new r45.bt1();
        bt1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bt1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = bt1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetlotteryhistory";
        lVar.f152200d = 6484;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveLotteryHistory", "CgiFinderLiveLotteryHistory init, finderUsername = " + at1Var.m75945x2fec8307(2) + ", liveId = " + j17 + ", objectId = " + j18 + ", objectNonceId = " + objectNonceId + ", scene = " + i17 + ",  lastBuffer = " + gVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.bt1 resp = (r45.bt1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveLotteryHistory", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}

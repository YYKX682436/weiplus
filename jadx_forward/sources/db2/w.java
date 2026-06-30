package db2;

/* loaded from: classes2.dex */
public final class w extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, java.lang.String str, int i17, r45.qt2 qt2Var, java.lang.String exportId, boolean z17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var, null, 2, null);
        exportId = (i19 & 16) != 0 ? "" : exportId;
        z17 = (i19 & 32) != 0 ? false : z17;
        i18 = (i19 & 64) != 0 ? 0 : i18;
        gVar = (i19 & 128) != 0 ? null : gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportId, "exportId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.uw0 uw0Var = new r45.uw0();
        uw0Var.set(2, java.lang.Long.valueOf(j17));
        uw0Var.set(3, java.lang.Integer.valueOf(i18));
        uw0Var.set(5, exportId);
        uw0Var.set(7, java.lang.Integer.valueOf(i17));
        uw0Var.set(8, gVar);
        uw0Var.set(6, java.lang.Integer.valueOf(z17 ? 2 : 0));
        int m75939xb282bd08 = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0;
        uw0Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, m75939xb282bd08));
        db2.t4.f309704a.h((r45.kv0) uw0Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(m75939xb282bd08), java.lang.Long.valueOf(j17), str)));
        lVar.f152197a = uw0Var;
        r45.vw0 vw0Var = new r45.vw0();
        vw0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) vw0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = vw0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderclickfeedback";
        lVar.f152200d = 11026;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderFeedBack", "[CgiFinderFeedBack] feedId=" + j17 + " feedbackType=" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.vw0 resp = (r45.vw0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderClickFeedBack", "[CgiFinderClickFeedBack] onCgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}

package db2;

/* loaded from: classes2.dex */
public final class j0 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j17, java.lang.String str, java.lang.String objectNonceId, int i17, int i18, r45.qt2 qt2Var, java.lang.Boolean bool, java.util.List list) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.c31 c31Var = new r45.c31();
        c31Var.set(1, java.lang.Long.valueOf(j17));
        c31Var.set(4, objectNonceId);
        c31Var.set(2, java.lang.Integer.valueOf(i17));
        c31Var.set(3, java.lang.Integer.valueOf(i18));
        c31Var.set(5, db2.t4.f309704a.b(3912, qt2Var));
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                c31Var.m75941xfb821914(9).add((r45.qw4) it.next());
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            c31Var.set(7, 2);
        }
        int m75939xb282bd08 = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0;
        c31Var.set(6, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, m75939xb282bd08));
        db2.t4.f309704a.h((r45.kv0) c31Var.m75936x14adae67(5), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(m75939xb282bd08), java.lang.Long.valueOf(j17), str)));
        lVar.f152197a = c31Var;
        r45.d31 d31Var = new r45.d31();
        d31Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d31Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = d31Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderfeedback";
        lVar.f152200d = 3912;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderFeedBack", "[CgiFinderFeedBack] feedId=" + j17 + " feedbackType=" + i17 + " subType=" + i18);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.d31 resp = (r45.d31) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
    }
}

package db2;

/* loaded from: classes5.dex */
public final class l4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309593t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(java.lang.String sessionId, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Long l17) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.f309593t = "Finder.CgiGetMsgSession";
        r45.ui2 ui2Var = new r45.ui2();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
        java.lang.String h17 = m4Var.h(sessionId);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String f17 = m4Var.f(sessionId);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(f17)) {
            ui2Var.set(0, 1);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.T3(f17)) {
            ui2Var.set(0, 3);
        } else {
            ui2Var.set(0, 2);
        }
        ui2Var.set(2, sessionId);
        ui2Var.set(1, h17);
        ui2Var.set(3, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        if (num2 != null) {
            ui2Var.set(4, java.lang.Integer.valueOf(num2.intValue()));
        }
        if (num3 != null) {
            ui2Var.set(5, java.lang.Integer.valueOf(num3.intValue()));
        }
        if (l17 != null) {
            ui2Var.set(6, java.lang.Long.valueOf(l17.longValue()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSession", "CgiGetMsgSession, sourceType: " + ui2Var.m75939xb282bd08(3) + ", userPageEnterType: " + ui2Var.m75939xb282bd08(4) + ", lastCommentScene: " + ui2Var.m75939xb282bd08(5));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.s81 s81Var = new r45.s81();
        s81Var.set(1, db2.t4.f309704a.a(6218));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(ui2Var);
        s81Var.set(2, linkedList);
        s81Var.set(4, g92.b.f351302e.U());
        lVar.f152197a = s81Var;
        r45.t81 t81Var = new r45.t81();
        t81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) t81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = t81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsession";
        lVar.f152200d = 6218;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSession", "[CgiGetMsgSession] sessionId=".concat(sessionId));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.t81 resp = (r45.t81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309593t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ');
    }
}

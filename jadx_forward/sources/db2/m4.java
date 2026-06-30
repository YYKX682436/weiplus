package db2;

/* loaded from: classes5.dex */
public final class m4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g f309605t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(int i17, java.lang.String username, java.lang.Integer num) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.q81 q81Var = new r45.q81();
        q81Var.set(3, db2.t4.f309704a.a(3828));
        q81Var.set(1, java.lang.Integer.valueOf(i17));
        q81Var.set(2, username);
        q81Var.set(9, java.lang.Boolean.TRUE);
        q81Var.set(11, f309605t);
        q81Var.set(12, B(q81Var.m75939xb282bd08(1)));
        q81Var.set(8, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        lVar.f152197a = q81Var;
        r45.r81 r81Var = new r45.r81();
        r81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) r81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = r81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        lVar.f152200d = 3828;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] scene=" + i17 + " username=" + username);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.r81 resp = (r45.r81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" session_id=");
        r45.vi2 vi2Var = (r45.vi2) resp.m75936x14adae67(4);
        sb6.append(vi2Var != null ? vi2Var.m75945x2fec8307(1) : null);
        sb6.append(" enable_action=");
        r45.vi2 vi2Var2 = (r45.vi2) resp.m75936x14adae67(4);
        sb6.append(vi2Var2 != null ? java.lang.Integer.valueOf(vi2Var2.m75939xb282bd08(3)) : null);
        sb6.append(" disable_sendmsg_need_follow ");
        r45.vi2 vi2Var3 = (r45.vi2) resp.m75936x14adae67(4);
        sb6.append(vi2Var3 != null ? java.lang.Boolean.valueOf(vi2Var3.m75933x41a8a7f2(6)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSessionId", sb6.toString());
        f309605t = null;
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(i17);
        sb7.append(',');
        sb7.append(i18);
        g0Var.d(20492, 5L, sb7.toString());
        g0Var.C(1473L, 5L, 1L);
    }

    public final java.lang.String B(int i17) {
        if (i17 == 1) {
            return g92.b.f351302e.U();
        }
        if (i17 == 2) {
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
            return r17;
        }
        if (i17 != 3) {
            java.lang.String r18 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r18);
            return r18;
        }
        java.lang.String k17 = c01.z1.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        return k17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(int i17, java.lang.String username, java.lang.String toLotteryId, long j17, java.lang.Integer num) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toLotteryId, "toLotteryId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.q81 q81Var = new r45.q81();
        q81Var.set(3, db2.t4.f309704a.a(3828));
        q81Var.set(1, java.lang.Integer.valueOf(i17));
        q81Var.set(2, username);
        q81Var.set(7, toLotteryId);
        q81Var.set(5, java.lang.Long.valueOf(j17));
        q81Var.set(8, java.lang.Integer.valueOf(num != null ? num.intValue() : 1));
        q81Var.set(9, java.lang.Boolean.TRUE);
        q81Var.set(11, f309605t);
        q81Var.set(12, B(q81Var.m75939xb282bd08(1)));
        lVar.f152197a = q81Var;
        r45.r81 r81Var = new r45.r81();
        r81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) r81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = r81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        lVar.f152200d = 3828;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] scene=" + i17 + " username=" + username);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(int i17, java.lang.String username, long j17, long j18, java.lang.Integer num) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.q81 q81Var = new r45.q81();
        q81Var.set(3, db2.t4.f309704a.a(3828));
        q81Var.set(1, java.lang.Integer.valueOf(i17));
        q81Var.set(5, java.lang.Long.valueOf(j17));
        q81Var.set(8, java.lang.Integer.valueOf(num != null ? num.intValue() : 4));
        q81Var.set(6, java.lang.Long.valueOf(j18));
        q81Var.set(2, username);
        q81Var.set(9, java.lang.Boolean.TRUE);
        q81Var.set(11, f309605t);
        q81Var.set(12, B(q81Var.m75939xb282bd08(1)));
        lVar.f152197a = q81Var;
        r45.r81 r81Var = new r45.r81();
        r81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) r81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = r81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        lVar.f152200d = 3828;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] scene=" + i17 + " username=" + username + " objectId=" + j17 + " commentId=" + j18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(int i17, java.lang.String username, long j17, int i18) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.q81 q81Var = new r45.q81();
        q81Var.set(3, db2.t4.f309704a.a(3828));
        q81Var.set(1, java.lang.Integer.valueOf(i17));
        q81Var.set(5, java.lang.Long.valueOf(j17));
        q81Var.set(8, java.lang.Integer.valueOf(i18));
        q81Var.set(2, username);
        q81Var.set(9, java.lang.Boolean.TRUE);
        q81Var.set(11, f309605t);
        q81Var.set(12, B(q81Var.m75939xb282bd08(1)));
        lVar.f152197a = q81Var;
        r45.r81 r81Var = new r45.r81();
        r81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) r81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = r81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        lVar.f152200d = 3828;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] scene=" + i17 + " username=" + username + " objectId=" + j17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(java.lang.String fansId) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fansId, "fansId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.q81 q81Var = new r45.q81();
        q81Var.set(3, db2.t4.f309704a.a(3828));
        q81Var.set(1, 1);
        q81Var.set(4, fansId);
        q81Var.set(8, 3);
        q81Var.set(9, java.lang.Boolean.TRUE);
        q81Var.set(11, f309605t);
        q81Var.set(12, B(q81Var.m75939xb282bd08(1)));
        lVar.f152197a = q81Var;
        r45.r81 r81Var = new r45.r81();
        r81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) r81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = r81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        lVar.f152200d = 3828;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] fansId=".concat(fansId));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(java.lang.String username, byte[] listenBypassBuffer) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenBypassBuffer, "listenBypassBuffer");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.q81 q81Var = new r45.q81();
        q81Var.set(3, db2.t4.f309704a.a(3828));
        q81Var.set(2, username);
        q81Var.set(8, 14);
        q81Var.set(1, 1);
        q81Var.set(12, B(q81Var.m75939xb282bd08(1)));
        q81Var.set(14, pm0.b0.h(listenBypassBuffer));
        q81Var.set(9, java.lang.Boolean.TRUE);
        lVar.f152197a = q81Var;
        r45.r81 r81Var = new r45.r81();
        r81Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) r81Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = r81Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmsgsessionid";
        lVar.f152200d = 3828;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetMsgSessionId", "[CgiGetMsgSessionId] with listenBuffer, username=".concat(username));
    }
}

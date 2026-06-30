package db2;

/* loaded from: classes.dex */
public final class q2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309658t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.sp2 f309659u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r45.ch1 appMsg, gk2.e roomData, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsg, "appMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomData, "roomData");
        this.f309658t = "Finder.CgiFinderPostBoxMsg";
        r45.sp2 sp2Var = new r45.sp2();
        this.f309659u = sp2Var;
        sp2Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) ((mm2.c1) roomData.a(mm2.c1.class)).m147920xbba4bfc0(mm2.e1.class)).f410518o));
        sp2Var.set(3, appMsg);
        sp2Var.set(4, java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        sp2Var.set(5, java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f410516m));
        sp2Var.set(6, ((mm2.e1) roomData.a(mm2.e1.class)).f410525v);
        sp2Var.set(7, 2);
        sp2Var.set(8, xy2.c.f(qt2Var));
        db2.t4 t4Var = db2.t4.f309704a;
        sp2Var.set(1, t4Var.a(6888));
        t4Var.h((r45.kv0) sp2Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(((mm2.e1) roomData.a(mm2.e1.class)).f410516m), ((mm2.e1) roomData.a(mm2.e1.class)).f410517n)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = sp2Var;
        r45.tp2 tp2Var = new r45.tp2();
        tp2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tp2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = tp2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpostliveappmsg";
        lVar.f152200d = 6888;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderPostBoxMsg init ");
        sb6.append(sp2Var.m75942xfb822ef2(4));
        sb6.append(",msgType ");
        r45.ch1 ch1Var = (r45.ch1) sp2Var.m75936x14adae67(3);
        sb6.append(ch1Var != null ? java.lang.Integer.valueOf(ch1Var.m75939xb282bd08(1)) : null);
        sb6.append(", client_msg_id:");
        r45.ch1 ch1Var2 = (r45.ch1) sp2Var.m75936x14adae67(3);
        sb6.append(ch1Var2 != null ? ch1Var2.m75945x2fec8307(2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderPostBoxMsg", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tp2 resp = (r45.tp2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", toastInfo:");
        r45.zm6 zm6Var = (r45.zm6) resp.m75936x14adae67(7);
        sb6.append(zm6Var != null ? java.lang.Boolean.valueOf(zm6Var.m75933x41a8a7f2(1)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309658t, sb6.toString());
    }
}

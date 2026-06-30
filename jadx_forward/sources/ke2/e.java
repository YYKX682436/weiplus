package ke2;

/* loaded from: classes.dex */
public final class e extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388476t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.sg1 f388477u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, r45.eq1 info, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f388476t = "Finder.CgiFinderLiveAnchorOpFanClub";
        r45.sg1 sg1Var = new r45.sg1();
        this.f388477u = sg1Var;
        sg1Var.set(1, db2.t4.f309704a.a(6632));
        sg1Var.set(2, xy2.c.f(qt2Var));
        sg1Var.set(3, java.lang.Integer.valueOf(i17));
        sg1Var.set(4, info);
        B();
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tg1 resp = (r45.tg1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388476t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    public final void B() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.sg1 sg1Var = this.f388477u;
        lVar.f152197a = sg1Var;
        r45.tg1 tg1Var = new r45.tg1();
        tg1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tg1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = tg1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveanchoropfanclub";
        lVar.f152200d = 6632;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ");
        sb6.append(sg1Var.m75945x2fec8307(2));
        sb6.append(',');
        sb6.append(sg1Var.m75939xb282bd08(3));
        sb6.append(',');
        r45.eq1 eq1Var = (r45.eq1) sg1Var.m75936x14adae67(4);
        sb6.append(eq1Var != null ? eq1Var.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388476t, sb6.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, r45.gg1 customGiftInfo, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customGiftInfo, "customGiftInfo");
        this.f388476t = "Finder.CgiFinderLiveAnchorOpFanClub";
        r45.sg1 sg1Var = new r45.sg1();
        this.f388477u = sg1Var;
        sg1Var.set(1, db2.t4.f309704a.a(6632));
        sg1Var.set(2, xy2.c.f(qt2Var));
        sg1Var.set(3, java.lang.Integer.valueOf(i17));
        sg1Var.set(5, customGiftInfo);
        B();
    }
}

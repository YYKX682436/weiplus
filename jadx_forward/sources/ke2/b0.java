package ke2;

/* loaded from: classes.dex */
public final class b0 extends az2.j {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f388465u = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388466t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ke2.z promoteInfoReq) {
        super(null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promoteInfoReq, "promoteInfoReq");
        this.f388466t = "Finder.CgiFinderLiveModPromoteInfo";
        r45.og1 og1Var = new r45.og1();
        og1Var.set(1, db2.t4.f309704a.a(6254));
        long j17 = promoteInfoReq.f388535a;
        og1Var.set(3, java.lang.Long.valueOf(j17));
        long j18 = promoteInfoReq.f388536b;
        og1Var.set(4, java.lang.Long.valueOf(j18));
        gk2.e eVar = dk2.ef.I;
        og1Var.set(2, eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f410385o : null);
        int i17 = promoteInfoReq.f388537c;
        og1Var.set(5, java.lang.Integer.valueOf(i17));
        og1Var.set(6, promoteInfoReq.f388538d);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = og1Var;
        r45.pg1 pg1Var = new r45.pg1();
        pg1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) pg1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = pg1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveanchormodpromoteinfolist";
        lVar.f152200d = 6254;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModPromoteInfo", "init liveId:" + j18 + ", objectId:" + j17 + ", op_type" + i17);
        xy2.b bVar = xy2.b.f539688b;
        java.lang.String m75945x2fec8307 = og1Var.m75945x2fec8307(2);
        gk2.e eVar2 = dk2.ef.I;
        pm0.z.b(bVar, "livePromoteUserErr", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).f410385o : null), null, "Finder.CgiFinderLiveModPromoteInfo", false, false, null, 116, null);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pg1 resp = (r45.pg1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388466t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        switch (i18) {
            case -200194:
            case -200193:
                pm0.v.X(ke2.a0.f388464d);
                return;
            default:
                return;
        }
    }
}

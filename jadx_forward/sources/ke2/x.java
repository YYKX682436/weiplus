package ke2;

/* loaded from: classes.dex */
public final class x extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388529t;

    public x(long j17, long j18) {
        super(null, null, 2, null);
        this.f388529t = "Finder.CgiFinderLiveGetPromoteInfoList";
        r45.ig1 ig1Var = new r45.ig1();
        ig1Var.set(1, db2.t4.f309704a.a(5250));
        ig1Var.set(3, java.lang.Long.valueOf(j17));
        ig1Var.set(4, java.lang.Long.valueOf(j18));
        gk2.e eVar = dk2.ef.I;
        ig1Var.set(2, eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f410385o : null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ig1Var;
        r45.jg1 jg1Var = new r45.jg1();
        jg1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) jg1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = jg1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveanchorgetpromoteinfolist";
        lVar.f152200d = 5250;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetPromoteInfoList", "init liveId:" + j18 + ", objectId:" + j17 + '}');
        xy2.b bVar = xy2.b.f539688b;
        java.lang.String m75945x2fec8307 = ig1Var.m75945x2fec8307(2);
        gk2.e eVar2 = dk2.ef.I;
        pm0.z.b(bVar, "livePromoteUserErr", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).f410385o : null), null, "Finder.CgiFinderLiveGetPromoteInfoList", false, false, null, 116, null);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.jg1 resp = (r45.jg1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388529t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        switch (i18) {
            case -200194:
            case -200193:
                pm0.v.X(ke2.w.f388525d);
                return;
            default:
                return;
        }
    }
}

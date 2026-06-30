package ke2;

/* loaded from: classes.dex */
public final class e0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388478t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(long j17, long j18, r45.z42 item, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, null, 2, null);
        java.lang.String str;
        int i19 = (i18 & 8) != 0 ? 1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f388478t = "Finder.CgiFinderLivePushOrCancelPromote";
        r45.yg1 yg1Var = new r45.yg1();
        yg1Var.set(1, db2.t4.f309704a.a(5970));
        yg1Var.set(3, java.lang.Long.valueOf(j17));
        yg1Var.set(4, java.lang.Long.valueOf(j18));
        gk2.e eVar = dk2.ef.I;
        yg1Var.set(2, (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o) == null) ? xy2.c.f(this.f97668n) : str);
        yg1Var.set(5, java.lang.Long.valueOf(item.m75942xfb822ef2(0)));
        yg1Var.set(6, java.lang.Integer.valueOf(item.m75933x41a8a7f2(3) ? 2 : 1));
        yg1Var.set(7, java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = yg1Var;
        r45.zg1 zg1Var = new r45.zg1();
        zg1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zg1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = zg1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveanchorsendpromoteinfo";
        lVar.f152200d = 5970;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLivePushOrCancelPromote", "init liveId:" + j18 + ", objectId:" + j17 + "}, promoteId:" + item.m75942xfb822ef2(0) + ", scene:" + yg1Var.m75939xb282bd08(6));
        xy2.b bVar = xy2.b.f539688b;
        java.lang.String m75945x2fec8307 = yg1Var.m75945x2fec8307(2);
        gk2.e eVar2 = dk2.ef.I;
        pm0.z.b(bVar, "livePromoteUserErr", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).f410385o : null), null, "Finder.CgiFinderLivePushOrCancelPromote", false, false, null, 116, null);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.zg1 resp = (r45.zg1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388478t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        switch (i18) {
            case -200194:
            case -200193:
                pm0.v.X(ke2.d0.f388475d);
                return;
            default:
                return;
        }
    }
}

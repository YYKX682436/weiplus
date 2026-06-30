package ek2;

/* loaded from: classes.dex */
public final class v0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f335084t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i17, int i18, gk2.e buContext, r45.z63 info) {
        super(null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f335084t = "Finder.CgiFinderLiveGamePopScene";
        r45.ar1 ar1Var = new r45.ar1();
        ar1Var.set(1, db2.t4.f309704a.b(6965, this.f97668n));
        ar1Var.set(2, java.lang.Integer.valueOf(i17));
        ar1Var.set(3, java.lang.Integer.valueOf(i18));
        ar1Var.set(4, java.lang.Long.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) buContext.a(mm2.c1.class)).f410379n;
        ar1Var.set(5, java.lang.Long.valueOf(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : -1L));
        ar1Var.set(6, info.m75945x2fec8307(0));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ar1Var;
        r45.br1 br1Var = new r45.br1();
        br1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) br1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = br1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegamepopscene";
        lVar.f152200d = 6965;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGamePopScene", "init scene:" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.br1 resp = (r45.br1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335084t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}

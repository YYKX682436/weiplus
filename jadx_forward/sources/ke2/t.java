package ke2;

/* loaded from: classes.dex */
public final class t extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388520t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, long j18, java.lang.String finderUserName, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.yn1 yn1Var, ke2.s sVar) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        this.f388520t = "Finder.CgiFinderLiveGetContact";
        r45.as1 as1Var = new r45.as1();
        as1Var.set(2, java.lang.Long.valueOf(j17));
        as1Var.set(3, java.lang.Long.valueOf(j18));
        as1Var.set(4, finderUserName);
        as1Var.set(1, db2.t4.f309704a.a(6678));
        as1Var.set(7, gVar);
        as1Var.set(5, java.lang.Integer.valueOf(i17));
        as1Var.set(8, yn1Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = as1Var;
        r45.bs1 bs1Var = new r45.bs1();
        bs1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bs1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = bs1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetcontact";
        lVar.f152200d = 6678;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetContact", "init " + as1Var.m75942xfb822ef2(2) + ',' + as1Var.m75945x2fec8307(4) + ',' + as1Var.m75939xb282bd08(5));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.bs1 resp = (r45.bs1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388520t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}

package db2;

/* loaded from: classes2.dex */
public final class h4 extends com.p314xaae8f345.mm.p944x882e457a.i {
    public h4(java.lang.String finderUserName, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.a61 a61Var = new r45.a61();
        a61Var.f451303e = finderUserName;
        a61Var.f451304f = i17;
        a61Var.f451306h = j17;
        a61Var.f451305g = gVar;
        a61Var.f451307i = i18;
        a61Var.f451302d = db2.t4.f309704a.a(3871);
        lVar.f152197a = a61Var;
        r45.b61 b61Var = new r45.b61();
        b61Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = b61Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = b61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfeedfavlist ";
        lVar.f152200d = 3871;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiGetFinderFeedLikedList init finderUsername=");
        sb6.append(finderUserName);
        sb6.append(" scene=");
        sb6.append(i17);
        sb6.append(" lastBuffer=");
        sb6.append(gVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderFeedLikedList", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderFeedLikedList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + ((r45.b61) fVar) + " thread=" + java.lang.Thread.currentThread());
    }
}

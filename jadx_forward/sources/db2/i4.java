package db2;

/* loaded from: classes2.dex */
public final class i4 extends com.p314xaae8f345.mm.p944x882e457a.i {
    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.i61 i61Var = new r45.i61();
        i61Var.set(2, feedObject.f66949xdec927b);
        i61Var.set(3, java.lang.Integer.valueOf(i17));
        i61Var.set(4, gVar);
        i61Var.set(5, java.lang.Long.valueOf(feedObject.f66939xc8a07680));
        i61Var.set(6, feedObject.m59276x6c285d75());
        i61Var.set(7, gVar2);
        i61Var.set(1, db2.t4.f309704a.a(3593));
        lVar.f152197a = i61Var;
        r45.j61 j61Var = new r45.j61();
        j61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) j61Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = j61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfeedlikedlist";
        lVar.f152200d = 3593;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiGetFinderFeedLikedList init finderUsername=");
        sb6.append(feedObject.f66949xdec927b);
        sb6.append(" scene=");
        sb6.append(i17);
        sb6.append(" lastBuffer=");
        sb6.append(gVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderFeedLikedList", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderFeedLikedList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + ((r45.j61) fVar) + " thread=" + java.lang.Thread.currentThread());
    }
}

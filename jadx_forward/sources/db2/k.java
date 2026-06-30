package db2;

/* loaded from: classes.dex */
public final class k extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String username) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r45.jt0 jt0Var = new r45.jt0();
        jt0Var.set(2, username);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = jt0Var;
        r45.kt0 kt0Var = new r45.kt0();
        kt0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) kt0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = kt0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderadcommentapply";
        lVar.f152200d = 7212;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.kt0 resp = (r45.kt0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderAdCommentApply", "onCgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        hz2.d.f367846a.h(i17, i18, str);
    }
}

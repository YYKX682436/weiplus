package ho2;

/* loaded from: classes4.dex */
public final class i extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String query, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        r45.pu2 pu2Var = new r45.pu2();
        pu2Var.f464939d = db2.t4.f309704a.b(7645, qt2Var);
        pu2Var.f464940e = finderUsername;
        byte[] bytes = query.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        pu2Var.f464941f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        pu2Var.f464942g = gVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = pu2Var;
        r45.qu2 qu2Var = new r45.qu2();
        qu2Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = qu2Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = qu2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersearchmemberzone";
        lVar.f152200d = 7645;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.qu2 resp = (r45.qu2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderSearchMemberZoneCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}

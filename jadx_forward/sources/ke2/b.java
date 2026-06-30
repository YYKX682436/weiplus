package ke2;

/* loaded from: classes.dex */
public final class b extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String anchorFinderUserName, int i17, int i18, r45.qt2 qt2Var, int i19, long j17, java.lang.Long l17) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorFinderUserName, "anchorFinderUserName");
        r45.pu0 pu0Var = new r45.pu0();
        pu0Var.set(1, db2.t4.f309704a.a(11126));
        pu0Var.set(2, anchorFinderUserName);
        pu0Var.set(3, java.lang.Integer.valueOf(i17));
        pu0Var.set(4, java.lang.Integer.valueOf(i18));
        pu0Var.set(5, java.lang.Integer.valueOf(i19));
        pu0Var.set(6, java.lang.Long.valueOf(j17));
        pu0Var.set(8, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pu0Var.set(9, xy2.c.e(context));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = pu0Var;
        r45.qu0 qu0Var = new r45.qu0();
        qu0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) qu0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = qu0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderaudiencereservelivenotification";
        lVar.f152200d = 11126;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.qu0 resp = (r45.qu0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderAudienceReserveLiveNotification", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ' + pm0.b0.g(resp));
    }
}

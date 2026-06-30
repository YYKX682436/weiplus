package db2;

/* loaded from: classes2.dex */
public final class r2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.mp2 mp2Var = new r45.mp2();
        mp2Var.set(2, finderItem.f66949xdec927b);
        mp2Var.set(3, finderItem.m59213xb1ff73bc());
        mv2.f0 f0Var = mv2.f0.f413094a;
        mp2Var.set(5, java.lang.Long.valueOf(f0Var.j(finderItem)));
        mp2Var.set(6, java.lang.Integer.valueOf(f0Var.k(finderItem)));
        r45.jq2 jq2Var = new r45.jq2();
        jq2Var.set(7, java.lang.Integer.valueOf(finderItem.m59277xa8f45ee4().m75939xb282bd08(16)));
        mp2Var.set(4, jq2Var);
        lVar.f152197a = mp2Var;
        r45.np2 np2Var = new r45.np2();
        np2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) np2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = np2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpostconfirm";
        lVar.f152200d = 11561;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init] username:");
        sb6.append(mp2Var.m75945x2fec8307(2));
        sb6.append(" clientId:");
        sb6.append(mp2Var.m75945x2fec8307(3));
        sb6.append(" postFlag:");
        sb6.append(mp2Var.m75942xfb822ef2(5));
        sb6.append(" postScene:");
        sb6.append(mp2Var.m75939xb282bd08(6));
        sb6.append(" findPostTime:");
        r45.jq2 jq2Var2 = (r45.jq2) mp2Var.m75936x14adae67(4);
        sb6.append(jq2Var2 != null ? java.lang.Integer.valueOf(jq2Var2.m75939xb282bd08(7)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.CgiFinderPostConfirm", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.np2 resp = (r45.np2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.CgiFinderPostConfirm", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}

package db2;

/* loaded from: classes.dex */
public final class y3 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(java.lang.String posterUsername, java.lang.String clientId, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posterUsername, "posterUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
        r45.m13 m13Var = new r45.m13();
        m13Var.set(1, db2.t4.f309704a.a(12253));
        m13Var.set(2, posterUsername);
        m13Var.set(3, clientId);
        m13Var.set(4, gVar);
        m13Var.set(5, gVar2);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderuploadpostproject";
        lVar.f152200d = 7143;
        lVar.f152197a = m13Var;
        lVar.f152198b = new r45.n13();
        p(lVar.a());
        ot5.g.c("cgiFinderUploadPostProject", "posterUsername:" + posterUsername + ", clientId:" + clientId + ", timeline:" + gVar + ", assetInfoChain:" + gVar2);
    }
}

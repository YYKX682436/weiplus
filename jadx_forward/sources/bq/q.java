package bq;

/* loaded from: classes.dex */
public final class q extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String username, long j17, java.lang.String objectNonceId, boolean z17, java.lang.String clientId, int i17) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.z01 z01Var = new r45.z01();
        z01Var.set(1, java.lang.Long.valueOf(j17));
        z01Var.set(3, objectNonceId);
        z01Var.set(2, username);
        z01Var.set(5, clientId);
        z01Var.set(6, java.lang.Integer.valueOf(i17));
        r45.kv0 a17 = db2.t4.f309704a.a(3627);
        a17.set(1, java.lang.Integer.valueOf(z17 ? 1 : 0));
        z01Var.set(4, a17);
        lVar.f152197a = z01Var;
        r45.a11 a11Var = new r45.a11();
        a11Var.set(0, new r45.ie());
        lVar.f152198b = a11Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderdelfeed";
        lVar.f152200d = 3627;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDeleteFeedCGI", "username:" + username + " objectId:" + j17 + " objectNonceId:" + objectNonceId + " isMegaVideo:" + z17);
    }
}

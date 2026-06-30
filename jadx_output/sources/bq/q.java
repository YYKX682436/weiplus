package bq;

/* loaded from: classes.dex */
public final class q extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String username, long j17, java.lang.String objectNonceId, boolean z17, java.lang.String clientId, int i17) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(clientId, "clientId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.z01 z01Var = new r45.z01();
        z01Var.set(1, java.lang.Long.valueOf(j17));
        z01Var.set(3, objectNonceId);
        z01Var.set(2, username);
        z01Var.set(5, clientId);
        z01Var.set(6, java.lang.Integer.valueOf(i17));
        r45.kv0 a17 = db2.t4.f228171a.a(3627);
        a17.set(1, java.lang.Integer.valueOf(z17 ? 1 : 0));
        z01Var.set(4, a17);
        lVar.f70664a = z01Var;
        r45.a11 a11Var = new r45.a11();
        a11Var.set(0, new r45.ie());
        lVar.f70665b = a11Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderdelfeed";
        lVar.f70667d = 3627;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderDeleteFeedCGI", "username:" + username + " objectId:" + j17 + " objectNonceId:" + objectNonceId + " isMegaVideo:" + z17);
    }
}

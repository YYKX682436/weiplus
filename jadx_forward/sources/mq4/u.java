package mq4;

/* loaded from: classes8.dex */
public class u extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f412341h = "MicroMsg.NetSceneVoipShutDown";

    public u(int i17, long j17, java.lang.String str, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.m37();
        lVar.f152198b = new r45.n37();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipshutdown";
        lVar.f152200d = ib1.t.f69911x366c91de;
        lVar.f152201e = 66;
        lVar.f152202f = 1000000066;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.m37 m37Var = (r45.m37) a17.f152243a.f152217a;
        m37Var.f461660e = i17;
        m37Var.f461661f = j17;
        m37Var.f461659d = c01.z1.r();
        m37Var.f461664i = i27;
        m37Var.f461665m = i18;
        m37Var.f461666n = i19;
        r45.s37 s37Var = new r45.s37();
        r45.du5 du5Var = new r45.du5();
        du5Var.c(str);
        s37Var.f467018d = du5Var;
        m37Var.f461662g = s37Var;
        m37Var.f461663h = java.lang.System.currentTimeMillis();
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.t(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return ib1.t.f69911x366c91de;
    }
}

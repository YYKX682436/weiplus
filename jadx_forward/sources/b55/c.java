package b55;

/* loaded from: classes11.dex */
public class c implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f99636d;

    /* renamed from: e, reason: collision with root package name */
    public final y45.a f99637e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.f35 f99638f;

    public c(r45.f35 f35Var, y45.a aVar) {
        if (f35Var == null) {
            java.lang.String str = lp0.a.f401789j;
            d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "baseTinkerId = " + str, new java.lang.Object[0]);
            r45.f35 f35Var2 = new r45.f35();
            f35Var2.f455520d = str;
            f35Var2.f455521e = lp0.a.a();
            f35Var2.f455522f = b55.b.b();
            f35Var2.f455527n = 1;
            f35Var = f35Var2;
        }
        this.f99638f = f35Var;
        this.f99637e = aVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.mk0();
        lVar.f152198b = new r45.g35();
        lVar.f152199c = "/cgi-bin/micromsg-bin/secencryptprconfig";
        lVar.f152200d = 3824;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f99636d = a17;
        a17.f152247e = 1;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.f35 f35Var = this.f99638f;
        y45.a aVar = this.f99637e;
        if (i18 != 0 || i19 != 0) {
            d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "errType %s, errCode %s.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            ((y45.p) aVar).a(f35Var, -1, null, null);
            return;
        }
        try {
            r45.g35 g35Var = (r45.g35) this.f99636d.f152244b.f152233a;
            if (g35Var != null) {
                r45.j35 j35Var = g35Var.f456386d;
                if (j35Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = new com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb(j35Var);
                    d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "errType %s, errCode %s.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    ((y45.p) aVar).a(f35Var, 0, c16114x800e8cdb, null);
                } else {
                    d55.u.d("MicroMsg.NetSceneNotLoginTinkerCheck", "empty node. code:%d", java.lang.Integer.valueOf(g35Var.f456391i));
                    ((y45.p) aVar).a(f35Var, -5, null, null);
                }
            } else {
                d55.u.d("MicroMsg.NetSceneNotLoginTinkerCheck", "empty response.", new java.lang.Object[0]);
                ((y45.p) aVar).a(f35Var, -4, null, null);
            }
        } catch (java.lang.Exception e17) {
            d55.u.c("MicroMsg.NetSceneNotLoginTinkerCheck", "debugMMTLSCheck", e17, new java.lang.Object[0]);
            ((y45.p) aVar).a(f35Var, -2, null, e17);
        }
    }
}

package b55;

/* loaded from: classes11.dex */
public class c implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f18103d;

    /* renamed from: e, reason: collision with root package name */
    public final y45.a f18104e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.f35 f18105f;

    public c(r45.f35 f35Var, y45.a aVar) {
        if (f35Var == null) {
            java.lang.String str = lp0.a.f320256j;
            d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "baseTinkerId = " + str, new java.lang.Object[0]);
            r45.f35 f35Var2 = new r45.f35();
            f35Var2.f373987d = str;
            f35Var2.f373988e = lp0.a.a();
            f35Var2.f373989f = b55.b.b();
            f35Var2.f373994n = 1;
            f35Var = f35Var2;
        }
        this.f18105f = f35Var;
        this.f18104e = aVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mk0();
        lVar.f70665b = new r45.g35();
        lVar.f70666c = "/cgi-bin/micromsg-bin/secencryptprconfig";
        lVar.f70667d = 3824;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f18103d = a17;
        a17.f70714e = 1;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.f35 f35Var = this.f18105f;
        y45.a aVar = this.f18104e;
        if (i18 != 0 || i19 != 0) {
            d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "errType %s, errCode %s.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            ((y45.p) aVar).a(f35Var, -1, null, null);
            return;
        }
        try {
            r45.g35 g35Var = (r45.g35) this.f18103d.f70711b.f70700a;
            if (g35Var != null) {
                r45.j35 j35Var = g35Var.f374853d;
                if (j35Var != null) {
                    com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse(j35Var);
                    d55.u.b("MicroMsg.NetSceneNotLoginTinkerCheck", "errType %s, errCode %s.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    ((y45.p) aVar).a(f35Var, 0, tinkerSyncResponse, null);
                } else {
                    d55.u.d("MicroMsg.NetSceneNotLoginTinkerCheck", "empty node. code:%d", java.lang.Integer.valueOf(g35Var.f374858i));
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

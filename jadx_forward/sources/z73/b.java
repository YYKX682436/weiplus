package z73;

/* loaded from: classes11.dex */
public class b extends z73.a {

    /* renamed from: p, reason: collision with root package name */
    public final oq1.p f552109p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f552110q;

    public b(oq1.r rVar, oq1.p pVar) {
        this.f552110q = rVar.f428901a;
        this.f552109p = pVar;
        this.f552105i = "liteappconfig_" + rVar.f428901a;
        this.f552102f = rVar.f428902b;
        this.f552103g = rVar.f428903c;
        this.f552108o = rVar.f428904d;
        this.f552104h.addAll(z73.h.c());
        java.util.LinkedList linkedList = this.f552104h;
        r45.e35 e35Var = new r45.e35();
        e35Var.f454501d = "package_id";
        e35Var.f454502e = "wechat-android";
        linkedList.add(e35Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(24470, this.f552105i, rVar.f428901a, java.lang.Integer.valueOf(this.f552108o), java.lang.Boolean.FALSE);
        g0Var.A(1821, 2);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        oq1.q qVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.g35 g35Var = (r45.g35) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            r45.j35 j35Var = g35Var.f456386d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "node is no empty. try to process");
            qVar = new oq1.q();
            if (j35Var != null) {
                r45.bs5 bs5Var = j35Var.f459071i;
                if (bs5Var != null) {
                    qVar.f428883e = bs5Var.f452558d;
                    qVar.f428882d = bs5Var.f452560f;
                    qVar.f428886h = bs5Var.f452565n;
                }
                qVar.f428880b = java.lang.Integer.valueOf(j35Var.f459067e);
                qVar.f428881c = java.lang.Integer.valueOf(j35Var.f459069g);
                qVar.f428884f = j35Var.f459066d;
                qVar.f428879a = this.f552110q;
                java.util.LinkedList linkedList = j35Var.f459073n;
                if (linkedList != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.h35 h35Var = (r45.h35) it.next();
                        if ("signature_key".equals(h35Var.f457339d)) {
                            qVar.f428885g = h35Var.f457340e;
                        }
                    }
                }
            }
            int i27 = g35Var.f456391i;
            qVar.f428887i = i27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "process end, TinkerNode: {appId: %s, errorCode: %d, fileMd5: %s, fileSize: %d, cdnUrl: %s, patchId: %s}", qVar.f428879a, java.lang.Integer.valueOf(i27), qVar.f428883e, java.lang.Integer.valueOf(qVar.f428886h), qVar.f428882d, qVar.f428884f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "check tinker update failed.");
            qVar = new oq1.q();
            qVar.f428887i = -1;
        }
        this.f552109p.b(qVar);
        this.f552101e.mo815x76e0bfae(i18, i19, str, this);
    }
}

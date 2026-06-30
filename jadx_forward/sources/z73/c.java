package z73;

/* loaded from: classes11.dex */
public class c extends z73.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f552111p;

    /* renamed from: q, reason: collision with root package name */
    public final oq1.p f552112q;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, oq1.p pVar) {
        if (z17) {
            this.f552108o = 0;
        } else {
            this.f552108o = 1;
        }
        this.f552111p = str;
        this.f552102f = str2;
        this.f552103g = str3;
        this.f552105i = "mbconfig_" + str;
        this.f552112q = pVar;
        this.f552104h.addAll(z73.h.c());
        java.util.LinkedList linkedList = this.f552104h;
        r45.e35 e35Var = new r45.e35();
        e35Var.f454501d = "package_id";
        e35Var.f454502e = "wechat-android";
        linkedList.add(e35Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "PackageId:%s BaseID:%s type:%s ", str, this.f552102f, this.f552105i);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(24470, this.f552105i, str, java.lang.Integer.valueOf(this.f552108o), java.lang.Boolean.FALSE);
        g0Var.A(1821, 3);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        oq1.q qVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.g35 g35Var = (r45.g35) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            r45.j35 j35Var = g35Var.f456386d;
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
                qVar.f428888j = this.f552111p;
                java.util.LinkedList linkedList = j35Var.f459073n;
                if (linkedList != null && !linkedList.isEmpty()) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.h35 h35Var = (r45.h35) it.next();
                        if (h35Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h35Var.f457339d)) {
                            if (h35Var.f457339d.equalsIgnoreCase("newApkMd5") || h35Var.f457339d.equalsIgnoreCase("mbMd5")) {
                                qVar.f428889k = h35Var.f457340e;
                            } else if (!h35Var.f457339d.equalsIgnoreCase("oldApkMd5")) {
                                if (h35Var.f457339d.equalsIgnoreCase("clientVersion") || h35Var.f457339d.equalsIgnoreCase(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5)) {
                                    qVar.f428890l = h35Var.f457340e;
                                } else if (h35Var.f457339d.equalsIgnoreCase("originalName")) {
                                    qVar.f428891m = h35Var.f457340e;
                                }
                            }
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckMagicUpdate", "node is nil prerrcode:%d ", java.lang.Integer.valueOf(g35Var.f456391i));
            }
            qVar.f428887i = g35Var.f456391i;
        } else {
            qVar = new oq1.q();
            qVar.f428887i = -1;
        }
        this.f552112q.b(qVar);
        this.f552101e.mo815x76e0bfae(i18, i19, str, this);
    }
}

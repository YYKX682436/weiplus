package mq4;

/* loaded from: classes14.dex */
public class q extends mq4.e0 {
    public q(java.util.List list, byte[] bArr, byte[] bArr2, int i17, int i18, int i19, int i27, java.util.LinkedList linkedList, long j17, long j18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.w27();
        lVar.f152198b = new r45.x27();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipinvite";
        lVar.f152200d = 170;
        lVar.f152201e = 63;
        lVar.f152202f = 1000000063;
        this.f412326d = lVar.a();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voipinvite_retry_count, 0);
        if (Ni == 0) {
            this.f412326d.m47986x306cfea3(true);
        }
        r45.w27 w27Var = (r45.w27) this.f412326d.f152243a.f152217a;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (int i28 = 0; i28 < list.size(); i28++) {
            r45.du5 du5Var = new r45.du5();
            du5Var.f454289d = (java.lang.String) list.get(i28);
            du5Var.f454290e = true;
            linkedList2.add(du5Var);
        }
        w27Var.f470341d = c01.z1.r();
        w27Var.f470343f = linkedList2;
        w27Var.f470342e = linkedList2.size();
        w27Var.f470346i = i17;
        w27Var.f470347m = i18;
        w27Var.f470350p = i19;
        w27Var.f470353s = i27;
        r45.k37 k37Var = new r45.k37();
        k37Var.f459876d = 2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        k37Var.f459877e = cu5Var;
        w27Var.f470344g = k37Var;
        r45.k37 k37Var2 = new r45.k37();
        k37Var2.f459876d = 3;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(bArr2);
        k37Var2.f459877e = cu5Var2;
        w27Var.f470345h = k37Var2;
        w27Var.f470351q = java.lang.System.currentTimeMillis();
        w27Var.f470357w = this.f412329g.f258065x.m72813xb422216b();
        int Ai = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(2);
        vq4.d0.c("MicroMsg.NetSceneVoipInvite", "simType:" + Ai + " ipstack:" + w27Var.f470357w + " retry count:" + Ni);
        if (Ai == 0) {
            w27Var.f470354t = 0;
        } else if (Ai == 3) {
            w27Var.f470354t = 3;
        } else {
            w27Var.f470354t = Ai != 1 ? 2 : 1;
        }
        w27Var.f470355u = linkedList.size();
        w27Var.f470356v = linkedList;
        r45.n27 b17 = vq4.p0.b();
        w27Var.f470358x = b17;
        b17.f462573n = j17;
        b17.f462574o = j18;
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.p(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 170;
    }
}

package op3;

/* loaded from: classes5.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f428777d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f428778e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c f428779f;

    /* renamed from: g, reason: collision with root package name */
    public final long f428780g;

    /* renamed from: h, reason: collision with root package name */
    public final long f428781h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f428782i;

    public a(java.lang.String str, long j17, long j18, long j19, java.lang.String str2) {
        java.lang.Object l17 = gm0.j1.u().c().l(290818, 0);
        int P = l17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(l17.toString(), 0) : 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ws5();
        lVar.f152198b = new r45.xs5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/revokemsg";
        lVar.f152200d = 594;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f428780g = j17;
        this.f428781h = j18;
        this.f428782i = str2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f428777d = a17;
        r45.ws5 ws5Var = (r45.ws5) a17.f152243a.f152217a;
        ws5Var.f470950d = str;
        ws5Var.f470951e = 0;
        ws5Var.f470953g = 0;
        ws5Var.f470957n = j18;
        ws5Var.f470952f = (int) (j19 / 1000);
        ws5Var.f470954h = c01.z1.r();
        ws5Var.f470955i = str2;
        ws5Var.f470956m = P;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRevokePatMsg", "clientMsgId:%s,newClientMsgId:%d,svrMsgId:%d,createTime:%d,fromUserName:%s,toUserName:%s,indexOfRequest:%d", ws5Var.f470950d, java.lang.Integer.valueOf(ws5Var.f470951e), java.lang.Integer.valueOf(ws5Var.f470953g), java.lang.Integer.valueOf(ws5Var.f470952f), ws5Var.f470954h, ws5Var.f470955i, java.lang.Integer.valueOf(ws5Var.f470956m));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f428778e = u0Var;
        return mo9409x10f9447a(sVar, this.f428777d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 594;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneRevokePatMsg", "onGYNetEnd errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ai(this.f428780g, this.f428781h, this.f428782i);
            java.lang.Object l17 = gm0.j1.u().c().l(290818, 0);
            gm0.j1.u().c().w(290818, java.lang.Integer.valueOf((l17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(l17.toString(), 0) : 0) + 1));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c c6833x9828a7c = this.f428779f;
            if (c6833x9828a7c != null) {
                c6833x9828a7c.f141553l = 2;
                c6833x9828a7c.k();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c struct = this.f428779f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
                struct.o();
            }
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c c6833x9828a7c2 = this.f428779f;
            if (c6833x9828a7c2 != null) {
                c6833x9828a7c2.f141553l = 1;
                c6833x9828a7c2.k();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6833x9828a7c struct2 = this.f428779f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct2, "struct");
                struct2.o();
            }
        }
        this.f428778e.mo815x76e0bfae(i18, i19, str, this);
    }
}

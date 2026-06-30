package fh3;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f344188d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f344189e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ow4 f344190f;

    /* renamed from: g, reason: collision with root package name */
    public final int f344191g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[1] = str == null ? "" : str;
        objArr[2] = str == null ? "" : str;
        objArr[3] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openim.NetSceneOpenImNotAutoSucceed", "NetSceneNotAutoSucceed action:%s originTpusername:%s op:%s heirTpusername%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/notautosucceed";
        lVar.f152200d = 3713;
        lVar.f152197a = new r45.nw4();
        lVar.f152198b = new r45.ow4();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f344189e = a17;
        this.f344191g = i17;
        r45.nw4 nw4Var = (r45.nw4) a17.f152243a.f152217a;
        nw4Var.f463243d = str == null ? "" : str;
        nw4Var.f463244e = str2 == null ? "" : str2;
        nw4Var.f463245f = str3 == null ? "" : str3;
        nw4Var.f463246g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f344188d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f344189e;
        this.f344190f = (r45.ow4) oVar.f152244b.f152233a;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3713;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openim.NetSceneOpenImNotAutoSucceed", "onGYNetEnd:[%d,%d,%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f344188d.mo815x76e0bfae(i18, i19, str, this);
    }
}

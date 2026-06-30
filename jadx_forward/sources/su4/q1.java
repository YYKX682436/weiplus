package su4;

/* loaded from: classes.dex */
public class q1 extends su4.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494579i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494580m;

    /* renamed from: n, reason: collision with root package name */
    public int f494581n = -1;

    /* renamed from: o, reason: collision with root package name */
    public r45.g66 f494582o;

    public q1(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, int i19, java.lang.String str5, java.lang.String str6) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.f66();
        lVar.f152198b = new r45.g66();
        lVar.f152199c = "/cgi-bin/mmsearch-bin/searchsimilaremoticon";
        lVar.f152200d = 2999;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494579i = a17;
        r45.f66 f66Var = (r45.f66) a17.f152243a.f152217a;
        f66Var.f455589d = str;
        f66Var.f455590e = i17;
        f66Var.f455592g = str2;
        f66Var.f455593h = str3;
        f66Var.f455596n = i18;
        f66Var.f455597o = str4;
        f66Var.f455594i = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
        f66Var.f455591f = i19;
        f66Var.f455595m = su4.r2.i();
        f66Var.f455600r = str6;
        f66Var.f455599q = str5;
        f66Var.f455601s = su4.r2.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneQuerySimilarEmotion", "Md5 %s Offset %d SearchId %s SessionId %s Tab %s RequestId %s Scene %d", str, java.lang.Integer.valueOf(i17), str2, str3, java.lang.Integer.valueOf(i18), str4, java.lang.Integer.valueOf(i19));
    }

    @Override // su4.a
    public java.lang.String H() {
        return null;
    }

    @Override // su4.a
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494580m = u0Var;
        return mo9409x10f9447a(sVar, this.f494579i, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2999;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneQuerySimilarEmotion", "netId %d errType %d errCode %d %s errMsg", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f494582o = (r45.g66) this.f494579i.f152244b.f152233a;
        this.f494580m.mo815x76e0bfae(i18, i19, str, this);
    }
}

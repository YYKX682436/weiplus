package lr1;

/* loaded from: classes2.dex */
public class h0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f402205d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f402206e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f402207f;

    /* renamed from: g, reason: collision with root package name */
    public final long f402208g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yw5 f402209h;

    /* renamed from: i, reason: collision with root package name */
    public final int f402210i;

    public h0(java.lang.String str, long j17, int i17) {
        this.f402207f = str;
        this.f402208g = j17;
        this.f402210i = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchHomePageNew", "Constructors: keyword (%s) , businessType (%d), scene (%d)", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchHomePageNew", "doScene");
        this.f402205d = u0Var;
        java.lang.String str = this.f402207f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSearchHomePageNew", "keyword is unavailable");
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1070;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/bizsearch/homepage";
        lVar.f152197a = new r45.xw5();
        lVar.f152198b = new r45.yw5();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f402206e = a17;
        r45.xw5 xw5Var = (r45.xw5) a17.f152243a.f152217a;
        xw5Var.f472092e = str;
        xw5Var.f472093f = lr1.o.a();
        long j17 = this.f402208g;
        xw5Var.f472091d = j17;
        xw5Var.f472094g = this.f402210i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchHomePageNew", "businessTypeList is %d", java.lang.Long.valueOf(j17));
        return mo9409x10f9447a(sVar, this.f402206e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1070;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchHomePageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0 && (oVar = this.f402206e) != null) {
            this.f402209h = (r45.yw5) oVar.f152244b.f152233a;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f402205d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

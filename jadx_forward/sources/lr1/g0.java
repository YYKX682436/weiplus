package lr1;

/* loaded from: classes2.dex */
public class g0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f402196d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f402197e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kw5 f402198f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f402199g;

    /* renamed from: h, reason: collision with root package name */
    public final long f402200h;

    /* renamed from: i, reason: collision with root package name */
    public final int f402201i;

    /* renamed from: m, reason: collision with root package name */
    public final int f402202m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f402203n;

    public g0(java.lang.String str, long j17, int i17, int i18, java.lang.String str2) {
        this.f402199g = str;
        this.f402200h = j17;
        this.f402201i = i17;
        this.f402202m = i18;
        this.f402203n = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchDetailPageNew", "Constructors: keyword = (%s) , LSB exist () , businessType is (%d) , offset is (%d) , scene is (%d), searchId(%s).", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f402196d = u0Var;
        java.lang.String str = this.f402199g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSearchDetailPageNew", "keyword is unavailable.");
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1071;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/bizsearch/detailpage";
        lVar.f152197a = new r45.jw5();
        lVar.f152198b = new r45.kw5();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f402197e = a17;
        r45.jw5 jw5Var = (r45.jw5) a17.f152243a.f152217a;
        jw5Var.f459705g = lr1.o.a();
        jw5Var.f459703e = str;
        jw5Var.f459702d = this.f402200h;
        jw5Var.f459704f = this.f402201i;
        jw5Var.f459706h = this.f402202m;
        jw5Var.f459709n = this.f402203n;
        return mo9409x10f9447a(sVar, this.f402197e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1071;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchDetailPageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0 && (oVar = this.f402197e) != null) {
            this.f402198f = (r45.kw5) oVar.f152244b.f152233a;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f402196d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

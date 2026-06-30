package g62;

/* loaded from: classes4.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f350620d;

    /* renamed from: e, reason: collision with root package name */
    public int f350621e;

    /* renamed from: f, reason: collision with root package name */
    public int f350622f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f350623g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f350624h;

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f350620d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jm0();
        lVar.f152198b = new r45.km0();
        lVar.f152199c = "/cgi-bin/mmexptappsvr-bin/reportexptdebug";
        lVar.f152200d = 2743;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.jm0 jm0Var = (r45.jm0) a17.f152243a.f152217a;
        jm0Var.f459459d = this.f350621e;
        int i17 = this.f350622f;
        if (i17 == 0) {
            i17 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        }
        jm0Var.f459460e = i17;
        jm0Var.f459461f = this.f350623g;
        jm0Var.f459462g = this.f350624h;
        return mo9409x10f9447a(sVar, a17, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2743;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDebugReport", "send expt debug info ongynetend type[%d] errType[%d] errCode[%d] errMsg[%s]", java.lang.Integer.valueOf(this.f350621e), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f350620d.mo815x76e0bfae(i18, i19, str, this);
    }
}

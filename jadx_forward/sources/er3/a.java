package er3;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f337551d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f337552e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kk3 f337553f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f337554g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetOpenUrl", "NetSceneGetOpenUrl username:%s ticket:%s climsgid:%s content:%s ", str, str2, str3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str4));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getopenurl";
        lVar.f152200d = 913;
        lVar.f152197a = new r45.jk3();
        lVar.f152198b = new r45.kk3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f337552e = a17;
        r45.jk3 jk3Var = (r45.jk3) a17.f152243a.f152217a;
        jk3Var.f459433d = 1;
        r45.w0 w0Var = new r45.w0();
        w0Var.f470272d = str;
        w0Var.f470273e = str2;
        w0Var.f470274f = str3;
        w0Var.f470275g = str4;
        jk3Var.f459434e = w0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f337551d = u0Var;
        return mo9409x10f9447a(sVar, this.f337552e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 913;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f337551d.mo815x76e0bfae(i18, i19, str, this);
        this.f337554g = str;
    }
}

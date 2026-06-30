package g11;

/* loaded from: classes5.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f349098d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f349099e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f349100f = new g11.a(this);

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        this.f349098d = f9Var;
        f9Var.r1(1);
        f9Var.u1(str2);
        f9Var.e1(c01.w9.o(str2));
        f9Var.j1(1);
        f9Var.d1(str3);
        f9Var.m124850x7650bebc(c01.e2.C(str2));
        long M9 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).M9(f9Var);
        iz5.a.g(null, M9 != -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsgFake", "new msg inserted to db , local id = " + M9);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f349099e = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsgFake", "send local msg, msgId = " + this.f349098d.m124847x74d37ac6());
        this.f349100f.mo50307xb9e94560(0, 500L);
        return 999;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 522;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recv local msg, msgId = ");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f349098d;
        sb6.append(f9Var.m124847x74d37ac6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsgFake", sb6.toString());
        f9Var.r1(2);
        f9Var.e1(c01.w9.m(f9Var.Q0(), java.lang.System.currentTimeMillis() / 1000));
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(f9Var.m124847x74d37ac6(), f9Var);
        this.f349099e.mo815x76e0bfae(0, 0, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}

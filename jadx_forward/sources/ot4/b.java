package ot4;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f430401d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f430402e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o65 f430403f;

    public b(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.n65();
        lVar.f152198b = new r45.o65();
        ss4.p0 p0Var = ss4.p0.f493657a;
        ss4.n0 n0Var = ss4.n0.f493641g;
        int a17 = p0Var.a(n0Var, 2540);
        java.lang.String b17 = p0Var.b(n0Var, "/cgi-bin/mmpay-bin/payibgquickgetoverseawallet");
        lVar.f152200d = a17;
        lVar.f152199c = b17;
        com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar.a();
        this.f430401d = a18;
        ((r45.n65) a18.f152243a.f152217a).f462635d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f430402e = u0Var;
        return mo9409x10f9447a(sVar, this.f430401d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2540;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayIBGQuickGetOverseaWallet", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f430403f = (r45.o65) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f430402e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

package i61;

/* loaded from: classes8.dex */
public class j extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370459d;

    /* renamed from: e, reason: collision with root package name */
    public r45.v f370460e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370461f;

    public j(java.lang.String str, long j17, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u();
        lVar.f152198b = new r45.v();
        lVar.f152200d = 1629;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaapay";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370459d = a17;
        r45.u uVar = (r45.u) a17.f152243a.f152217a;
        uVar.f468427d = str;
        uVar.f468428e = j17;
        uVar.f468429f = i17;
        uVar.f468430g = str2;
        uVar.f468431h = str3;
        uVar.f468432i = str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAPay", "NetSceneAAPay, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(uVar.f468429f), uVar.f468430g);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f370461f = u0Var;
        return mo9409x10f9447a(sVar, this.f370459d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1629;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAPay", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.v vVar = (r45.v) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f370460e = vVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(vVar.f469304d);
        r45.v vVar2 = this.f370460e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAPay", "retcode: %s, retmsg: %s, paymsgid:%s", valueOf, vVar2.f469305e, vVar2.f469307g);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f370461f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

package ww1;

/* loaded from: classes4.dex */
public class u1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f531836d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sw f531837e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f531838f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f531839g;

    public u1(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rw();
        lVar.f152198b = new r45.sw();
        lVar.f152200d = 1317;
        lVar.f152199c = "/cgi-bin/mmpay-bin/getmdrcvvoice";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f531836d = a17;
        r45.rw rwVar = (r45.rw) a17.f152243a.f152217a;
        rwVar.f466763d = i17;
        rwVar.f466767h = i18;
        rwVar.f466766g = str;
        rwVar.f466764e = gVar;
        rwVar.f466765f = gVar2;
        this.f531839g = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMDRcvVoice", "amount: %d, outtradeno: %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f531838f = u0Var;
        return mo9409x10f9447a(sVar, this.f531836d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1317;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMDRcvVoice", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.sw swVar = (r45.sw) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f531837e = swVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(swVar.f467525d);
        r45.sw swVar2 = this.f531837e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMDRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", valueOf, swVar2.f467526e, java.lang.Integer.valueOf(swVar2.f467528g));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f531838f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

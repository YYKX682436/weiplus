package ww1;

/* loaded from: classes4.dex */
public class o1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f531788d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f531789e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bw f531790f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f531791g;

    /* renamed from: h, reason: collision with root package name */
    public final int f531792h;

    /* renamed from: i, reason: collision with root package name */
    public final long f531793i;

    /* renamed from: m, reason: collision with root package name */
    public long f531794m;

    /* renamed from: n, reason: collision with root package name */
    public final long f531795n;

    public o1(int i17, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, java.lang.String str, int i19, long j17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.aw();
        lVar.f152198b = new r45.bw();
        lVar.f152200d = tb1.n0.f76788x366c91de;
        lVar.f152199c = "/cgi-bin/mmpay-bin/getf2frcvvoice";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f531788d = a17;
        r45.aw awVar = (r45.aw) a17.f152243a.f152217a;
        awVar.f451821d = i17;
        awVar.f451825h = i18;
        awVar.f451824g = str;
        awVar.f451822e = gVar;
        awVar.f451823f = gVar2;
        this.f531791g = str;
        this.f531792h = i19;
        this.f531793i = j17;
        this.f531795n = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneF2FRcvVoice", "amount: %d, outtradeno: %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f531789e = u0Var;
        return mo9409x10f9447a(sVar, this.f531788d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return tb1.n0.f76788x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneF2FRcvVoice", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.bw bwVar = (r45.bw) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f531790f = bwVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bwVar.f452621d);
        r45.bw bwVar2 = this.f531790f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneF2FRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", valueOf, bwVar2.f452622e, java.lang.Integer.valueOf(bwVar2.f452624g));
        this.f531794m = java.lang.System.currentTimeMillis() - this.f531795n;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f531789e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

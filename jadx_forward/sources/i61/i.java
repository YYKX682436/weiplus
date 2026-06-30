package i61;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f370456d;

    /* renamed from: e, reason: collision with root package name */
    public r45.s f370457e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f370458f;

    public i() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.r();
        lVar.f152198b = new r45.s();
        lVar.f152200d = 1698;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaaoperation";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f370456d = a17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f370458f = u0Var;
        return mo9409x10f9447a(sVar, this.f370456d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1698;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAOperation", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.s sVar = (r45.s) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f370457e = sVar;
        if (i18 == 0 && i19 == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(sVar.f466871d);
            r45.s sVar2 = this.f370457e;
            java.lang.String str2 = sVar2.f466872e;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(sVar2.f466873f);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f370457e.f466874g);
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(this.f370457e.f466875h);
            java.lang.Long valueOf5 = java.lang.Long.valueOf(this.f370457e.f466876i);
            java.lang.Long valueOf6 = java.lang.Long.valueOf(this.f370457e.f466877m);
            r45.s sVar3 = this.f370457e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAAOperation", "retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", valueOf, str2, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, sVar3.f466878n, sVar3.f466879o);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f370458f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

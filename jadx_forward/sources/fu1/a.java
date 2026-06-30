package fu1;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f348346d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348347e;

    /* renamed from: f, reason: collision with root package name */
    public int f348348f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f348349g;

    public a(java.lang.String str) {
        this.f348349g = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sc0();
        lVar.f152198b = new r45.tc0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/card/delsharecard";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.t.f34996x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f348346d = a17;
        ((r45.sc0) a17.f152243a.f152217a).f467155d = str;
        this.f348349g = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348347e = u0Var;
        return mo9409x10f9447a(sVar, this.f348346d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.t.f34996x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDelShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.t.f34996x366c91de), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.tc0 tc0Var = (r45.tc0) this.f348346d.f152244b.f152233a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDelShareCard", "ret_code:" + tc0Var.f467828d);
            int i27 = tc0Var.f467828d;
            this.f348348f = i27;
            if (i27 == 0) {
                fu1.i nj6 = xt1.t0.nj();
                nj6.getClass();
                nj6.f348378d.A("ShareCardInfo", "delete from ShareCardInfo where card_id = '" + this.f348349g + "'");
            }
        }
        this.f348347e.mo815x76e0bfae(i18, i19, str, this);
    }
}

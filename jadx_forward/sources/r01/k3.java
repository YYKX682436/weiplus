package r01;

/* loaded from: classes9.dex */
public class k3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, r01.y2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f449664d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f449665e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nm3 f449666f;

    /* renamed from: g, reason: collision with root package name */
    public final r01.z2 f449667g;

    public k3(r01.z2 z2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetReceiptAssisPluginMenu", "NetSceneGetReceiptAssisPluginMenu begin");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1769;
        lVar.f152199c = "/cgi-bin/mmpay-bin/getreceiptassismenu";
        r45.mm3 mm3Var = new r45.mm3();
        mm3Var.f462195d = c01.id.c();
        lVar.f152197a = mm3Var;
        lVar.f152198b = new r45.nm3();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        this.f449664d = lVar.a();
        this.f449667g = z2Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f449665e = u0Var;
        return mo9409x10f9447a(sVar, this.f449664d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1769;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetReceiptAssisPluginMenu", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f449666f = (r45.nm3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f449665e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        r01.z2 z2Var = this.f449667g;
        if (z2Var != null) {
            z2Var.a(i18, i19, str, this);
        }
    }
}

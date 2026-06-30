package xt1;

/* loaded from: classes8.dex */
public class p0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538080d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538081e;

    public p0(java.lang.String str, byte[] bArr, float f17, float f18, float f19, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bq5();
        lVar.f152198b = new r45.cq5();
        lVar.f152199c = "/cgi-bin/card/reportlotionorbluetoothinfo";
        lVar.f152200d = 2574;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538080d = a17;
        r45.bq5 bq5Var = (r45.bq5) a17.f152243a.f152217a;
        bq5Var.f452528h = str;
        bq5Var.f452527g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        bq5Var.f452524d = f17;
        bq5Var.f452525e = f18;
        bq5Var.f452526f = f19;
        bq5Var.f452529i = z17;
        bq5Var.f452530m = z18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538081e = u0Var;
        return mo9409x10f9447a(sVar, this.f538080d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2574;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneReportLotionOrBluetoothInfo", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        this.f538081e.mo815x76e0bfae(i18, i19, str, this);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes8.dex */
public class l2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180503d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180504e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f180505f;

    public l2(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f180504e = null;
        this.f180505f = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sv3();
        lVar.f152198b = new r45.tv3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/device/subscribestatus";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.h0.f33958x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180504e = a17;
        r45.sv3 sv3Var = (r45.sv3) a17.f152243a.f152217a;
        sv3Var.f467513d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str2);
        sv3Var.f467514e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str3);
        sv3Var.f467515f = i17;
        this.f180505f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180503d = u0Var;
        return mo9409x10f9447a(sVar, this.f180504e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.h0.f33958x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().P0(this.f180505f);
        if (i18 == 0 && i19 == 0) {
            r45.ie mo11484xe92ab0a8 = ((r45.tv3) this.f180504e.f152244b.f152233a).mo11484xe92ab0a8();
            int i27 = mo11484xe92ab0a8.f458492d;
            r45.du5 du5Var = mo11484xe92ab0a8.f458493e;
            if (du5Var.f454290e) {
                du5Var.getClass();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "HardDeviceStatusSubResponse: ret=" + i27 + ",msg=" + str);
        }
        this.f180503d.mo815x76e0bfae(i18, i19, str, this);
    }
}

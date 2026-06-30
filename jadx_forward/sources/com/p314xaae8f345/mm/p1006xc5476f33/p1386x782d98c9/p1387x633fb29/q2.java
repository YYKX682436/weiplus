package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public class q2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180578d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180579e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 f180580f;

    public q2(r45.rf4 rf4Var, com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2) {
        this.f180579e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yo6();
        lVar.f152198b = new r45.zo6();
        lVar.f152199c = "/cgi-bin/mmiot-bin/mmiot/mmiot_transfermsgtodevice";
        lVar.f152200d = 6844;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180579e = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneTransferToIotDevice", "deviceid %s", c10597xb1f0d2.f148119d);
        r45.yo6 yo6Var = (r45.yo6) a17.f152243a.f152217a;
        yo6Var.f472796d = c10597xb1f0d2.f148128p;
        yo6Var.f472797e = c10597xb1f0d2.f148119d;
        yo6Var.f472798f = rf4Var;
        this.f180580f = c10597xb1f0d2;
    }

    public r45.zo6 H() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f180579e;
        if (oVar == null || (fVar = oVar.f152244b.f152233a) == null) {
            return null;
        }
        return (r45.zo6) fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180578d = u0Var;
        return mo9409x10f9447a(sVar, this.f180579e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6844;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneTransferToIotDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f180578d.mo815x76e0bfae(i18, i19, str, this);
    }
}

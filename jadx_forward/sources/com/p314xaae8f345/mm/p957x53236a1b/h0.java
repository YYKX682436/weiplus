package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes4.dex */
public class h0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152867d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152868e;

    public h0(java.lang.String str, int i17, java.lang.String str2, byte[] bArr, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s, %d", str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bl0();
        lVar.f152198b = new r45.cl0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/entertempsession";
        lVar.f152200d = 1066;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152868e = a17;
        if (str2 == null) {
            str2 = "";
        } else if (str2.length() > 32 && i17 != 19) {
            str2 = str2.substring(0, 32);
        }
        r45.bl0 bl0Var = (r45.bl0) a17.f152243a.f152217a;
        bl0Var.f452374d = str;
        bl0Var.f452375e = i17;
        bl0Var.f452376f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str2);
        if (bArr == null) {
            bl0Var.f452377g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(new byte[0]);
        } else {
            bl0Var.f452377g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        }
        bl0Var.f452378h = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bl0Var.f452377g.f273689a.length));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152867d = u0Var;
        return mo9409x10f9447a(sVar, this.f152868e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1066;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneEnterTempSession", "onGYNetEnd: %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f152867d.mo815x76e0bfae(i18, i19, str, this);
    }
}

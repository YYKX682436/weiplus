package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes2.dex */
public class o2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180571d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180572e;

    public o2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f180572e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tx5();
        lVar.f152198b = new r45.ux5();
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/searchwifiharddevice";
        lVar.f152200d = 1270;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180572e = a17;
        r45.tx5 tx5Var = (r45.tx5) a17.f152243a.f152217a;
        r45.nv3 nv3Var = new r45.nv3();
        tx5Var.f468389d = nv3Var;
        nv3Var.f463224d = str;
        nv3Var.f463225e = str2;
        tx5Var.f468390e = str3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180571d = u0Var;
        return mo9409x10f9447a(sVar, this.f180572e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1270;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneSearchWiFiHardDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f180571d.mo815x76e0bfae(i18, i19, str, this);
    }
}

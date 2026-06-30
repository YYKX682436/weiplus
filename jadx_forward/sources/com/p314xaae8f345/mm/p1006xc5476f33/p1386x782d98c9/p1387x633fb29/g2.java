package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public class g2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180441d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180442e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f180443f;

    /* renamed from: g, reason: collision with root package name */
    public final int f180444g;

    public g2(r45.rf4 rf4Var, java.lang.String str, java.lang.String str2, int i17) {
        this.f180442e = null;
        this.f180443f = null;
        this.f180444g = 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.wo6();
        lVar.f152198b = new r45.xo6();
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/transfermsgtodevice";
        lVar.f152200d = 1717;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180442e = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "deviceid %s", str2);
        r45.wo6 wo6Var = (r45.wo6) a17.f152243a.f152217a;
        wo6Var.f470881e = str;
        wo6Var.f470880d = str2;
        wo6Var.f470882f = rf4Var;
        wo6Var.f470883g = i17;
        this.f180443f = str2;
        this.f180444g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180441d = u0Var;
        return mo9409x10f9447a(sVar, this.f180442e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1717;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f180441d.mo815x76e0bfae(i18, i19, str, this);
    }
}

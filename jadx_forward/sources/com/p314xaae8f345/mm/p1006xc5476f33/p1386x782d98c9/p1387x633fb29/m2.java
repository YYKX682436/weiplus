package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes4.dex */
public class m2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180526d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180527e;

    public m2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f180527e = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yv5();
        lVar.f152198b = new r45.zv5();
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/searchbleharddevice";
        lVar.f152200d = 1706;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180527e = a17;
        r45.yv5 yv5Var = (r45.yv5) a17.f152243a.f152217a;
        yv5Var.f472958d = str;
        yv5Var.f472959e = str2 == null ? "" : str2;
        yv5Var.f472960f = str3 == null ? "" : str3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180526d = u0Var;
        return mo9409x10f9447a(sVar, this.f180527e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1706;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneSearchBLEHardDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        this.f180526d.mo815x76e0bfae(i18, i19, str, this);
    }
}

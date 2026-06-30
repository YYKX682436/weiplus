package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes4.dex */
public class d3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221797d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221798e;

    public d3(java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new m53.v1();
        lVar.f152198b = new m53.w1();
        lVar.f152199c = "/cgi-bin/mmgame-bin/newgetgamedetail";
        lVar.f152200d = 1217;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f221798e = a17;
        m53.v1 v1Var = (m53.v1) a17.f152243a.f152217a;
        v1Var.f405651d = str;
        v1Var.f405652e = str2;
        v1Var.f405653f = z17;
        v1Var.f405656i = z18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221797d = u0Var;
        return mo9409x10f9447a(sVar, this.f221798e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1217;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameDetailNew", "errType = " + i18 + ", errCode = " + i19);
        this.f221797d.mo815x76e0bfae(i18, i19, str, this);
    }
}

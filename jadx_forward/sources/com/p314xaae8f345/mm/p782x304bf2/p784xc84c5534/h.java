package com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f149733d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f149734e;

    public h(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new mj0.e();
        lVar.f152198b = new mj0.f();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamereport";
        lVar.f152200d = 1223;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f149734e = a17;
        mj0.e eVar = (mj0.e) a17.f152243a.f152217a;
        eVar.f408525d = str;
        eVar.f408527f = i17;
        eVar.f408528g = i18;
        eVar.f408529h = str2;
        eVar.f408530i = str3;
        eVar.f408526e = (int) (java.lang.System.currentTimeMillis() / 1000);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f149733d = u0Var;
        return mo9409x10f9447a(sVar, this.f149734e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1223;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetGameIndex", "errType = " + i18 + ", errCode = " + i19);
        this.f149733d.mo815x76e0bfae(i18, i19, str, this);
    }
}

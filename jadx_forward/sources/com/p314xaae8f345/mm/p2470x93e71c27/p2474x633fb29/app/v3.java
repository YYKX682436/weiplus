package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class v3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f270639d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f270640e;

    /* renamed from: f, reason: collision with root package name */
    public final int f270641f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 f270642g;

    public v3(int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 u3Var) {
        this.f270641f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.p8();
        lVar.f152198b = new r45.q8();
        lVar.f152199c = "/cgi-bin/micromsg-bin/appcenter";
        lVar.f152200d = 452;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f270640e = a17;
        r45.p8 p8Var = (r45.p8) a17.f152243a.f152217a;
        byte[] c17 = u3Var.c();
        if (c17 != null) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(c17);
            p8Var.f464351e = cu5Var;
        }
        p8Var.f464350d = i17;
        this.f270642g = u3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f270639d = u0Var;
        return mo9409x10f9447a(sVar, this.f270640e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 452;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f270642g.a(x51.j1.d(((r45.q8) this.f270640e.f152244b.f152233a).f465286d));
            this.f270642g.mo804x5f9cdc6f(i17, i18, i19, str, this.f270640e, bArr);
            this.f270639d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneAppCenter", "errType = " + i18 + ", errCode = " + i19);
        this.f270639d.mo815x76e0bfae(i18, i19, str, this);
    }
}

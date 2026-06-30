package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes2.dex */
public class j3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221878d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221879e;

    public j3(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchGameList", "offset: %d, limit: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rw5();
        lVar.f152198b = new r45.sw5();
        lVar.f152199c = "/cgi-bin/mmgame-bin/searchgamelist";
        lVar.f152200d = 1215;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f221879e = a17;
        r45.rw5 rw5Var = (r45.rw5) a17.f152243a.f152217a;
        rw5Var.f466778d = i17;
        rw5Var.f466779e = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221878d = u0Var;
        return mo9409x10f9447a(sVar, this.f221879e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1215;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchGameList", "errType = " + i18 + ", errCode = " + i19);
        this.f221878d.mo815x76e0bfae(i18, i19, str, this);
    }
}

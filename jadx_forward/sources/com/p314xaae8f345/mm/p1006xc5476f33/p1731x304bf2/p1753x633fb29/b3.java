package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes4.dex */
public class b3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221766d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221767e;

    public b3(java.lang.String str, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.g63();
        lVar.f152198b = new r45.h63();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamecentersearch";
        lVar.f152200d = zd1.e.f77575x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f221767e = a17;
        r45.g63 g63Var = (r45.g63) a17.f152243a.f152217a;
        g63Var.f456447f = str;
        g63Var.f456445d = linkedList;
        g63Var.f456446e = linkedList2;
        g63Var.f456449h = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221766d = u0Var;
        return mo9409x10f9447a(sVar, this.f221767e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return zd1.e.f77575x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGameCenterSearch", "errType = " + i18 + ", errCode = " + i19);
        this.f221766d.mo815x76e0bfae(i18, i19, str, this);
    }
}

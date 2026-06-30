package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes4.dex */
public class c3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f221784d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f221785e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f221786f;

    public c3(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.d63();
        lVar.f152198b = new r45.e63();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamecentersearchrecommend";
        lVar.f152200d = 1329;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        if (str2 == null) {
            this.f221786f = "";
        } else {
            this.f221786f = str2.trim();
        }
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f221785e = a17;
        r45.d63 d63Var = (r45.d63) a17.f152243a.f152217a;
        d63Var.f453706f = str;
        d63Var.f453704d = str2;
        d63Var.f453705e = linkedList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f221784d = u0Var;
        return mo9409x10f9447a(sVar, this.f221785e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1329;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGameSearchRecmd", "errType = " + i18 + ", errCode = " + i19);
        this.f221784d.mo815x76e0bfae(i18, i19, str, this);
    }
}

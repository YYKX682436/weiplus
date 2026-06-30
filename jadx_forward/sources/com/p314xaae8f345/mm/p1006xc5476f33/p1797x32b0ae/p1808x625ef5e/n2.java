package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class n2 implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f225566c;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.o2 o2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441) {
        this.f225564a = k2Var;
        this.f225565b = str;
        this.f225566c = c3712x3ed8a441;
    }

    @Override // oq1.p
    public void b(oq1.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = this.f225564a;
        if (k2Var != null) {
            k2Var.f225533e = java.lang.System.currentTimeMillis();
            k2Var.f225534f = k2Var.f225533e;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f428882d);
        java.lang.String str = this.f225565b;
        if (!K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", str, java.lang.Integer.valueOf(qVar.f428886h), qVar.f428882d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "release", this.f225564a, null, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp, url is null, appId:%s errorCode:%d responseState:%d", str, java.lang.Integer.valueOf(qVar.f428887i), qVar.f428880b);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c != null) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f225566c;
            if (c3712x3ed8a441 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c).mo25334x90b54003(c3712x3ed8a441, 1);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225482c).mo25333x2fd71e(str, 2);
            }
        }
    }
}

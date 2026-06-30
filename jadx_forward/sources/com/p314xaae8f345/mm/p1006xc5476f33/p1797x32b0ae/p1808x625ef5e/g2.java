package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class g2 implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225499c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 f225500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225501e;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, java.lang.String str, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441) {
        this.f225501e = g1Var;
        this.f225497a = k2Var;
        this.f225498b = str;
        this.f225499c = abstractC3700xe41a2874;
        this.f225500d = c3712x3ed8a441;
    }

    @Override // oq1.p
    public void b(oq1.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = this.f225497a;
        if (k2Var != null) {
            k2Var.f225533e = java.lang.System.currentTimeMillis();
            k2Var.f225534f = k2Var.f225533e;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f428882d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225501e;
        java.lang.String str = this.f225498b;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225499c;
        if (!K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", str, java.lang.Integer.valueOf(qVar.f428886h), qVar.f428882d);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_SUCCESS, "Tinker");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "release", this.f225497a, this.f225499c, g1Var.f225482c);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp boots, url is null errorCode:%d responseState:%d", java.lang.Integer.valueOf(qVar.f428887i), qVar.f428880b);
        if (abstractC3700xe41a2874 != null) {
            int i17 = qVar.f428887i;
            if (5 == i17) {
                abstractC3700xe41a2874.mo28893x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_FAILED, "Tinker", i17);
            } else if (2 == i17) {
                abstractC3700xe41a2874.mo28892x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.CHECK_PACKAGE_UPDATE_NO_NEED, "Tinker");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = g1Var.f225482c;
        if (hVar != null) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f225500d;
            if (c3712x3ed8a441 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar).mo25334x90b54003(c3712x3ed8a441, 1);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d2) hVar).mo25333x2fd71e(str, 2);
            }
        }
    }
}

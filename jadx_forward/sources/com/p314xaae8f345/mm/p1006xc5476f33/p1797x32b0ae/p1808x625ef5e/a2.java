package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class a2 implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f f225427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef f225428d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f fVar, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef) {
        this.f225425a = k2Var;
        this.f225426b = abstractC3700xe41a2874;
        this.f225427c = fVar;
        this.f225428d = c3710x879b31ef;
    }

    @Override // oq1.p
    public void b(oq1.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = this.f225425a;
        if (k2Var != null) {
            k2Var.f225533e = java.lang.System.currentTimeMillis();
            k2Var.f225534f = k2Var.f225533e;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f428882d);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225426b;
        if (!K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp baselib filesize:%d url:%s", java.lang.Integer.valueOf(qVar.f428886h), qVar.f428882d);
            if (abstractC3700xe41a2874 != null) {
                abstractC3700xe41a2874.mo28872x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE_SUCCESS, "Tinker");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.d(qVar, "release", this.f225425a, this.f225426b, this.f225427c);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib, url is null errorCode:%d responseState:%d", java.lang.Integer.valueOf(qVar.f428887i), qVar.f428880b);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef = this.f225428d;
        if (abstractC3700xe41a2874 != null) {
            abstractC3700xe41a2874.mo28872x7725562c(c3710x879b31ef != null ? com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE_NO_NEED : com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.CHECK_BASE_LIBRARY_UPDATE_FAILED, "Tinker");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f fVar = this.f225427c;
        if (fVar != null) {
            if (c3710x879b31ef != null) {
                fVar.b(c3710x879b31ef, 1);
            } else {
                fVar.a(2);
            }
        }
    }
}
